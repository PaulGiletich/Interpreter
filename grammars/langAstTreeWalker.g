tree grammar langAstTreeWalker;

options{

tokenVocab=lang;
ASTLabelType=CommonTree;
}

@header{
package com.pgiletich.lang.parser; 

import com.pgiletich.lang.*;
import com.pgiletich.lang.nodes.*;
import com.pgiletich.lang.nodes.atoms.*;
import com.pgiletich.lang.nodes.statements.*;
import com.pgiletich.lang.nodes.conditional_statements.*;
import com.pgiletich.lang.nodes.operators.unary.*;
import com.pgiletich.lang.nodes.operators.binary.*;
import com.pgiletich.lang.nodes.operators.binary.arithmetic.*;
import com.pgiletich.lang.nodes.operators.binary.compare.*;
import com.pgiletich.lang.nodes.operators.binary.logic.*;
}

@members{
private Scope currentScope;
	
public void setScope(Scope s){
	currentScope = s;
}
}


root returns [LangNode rootNode]
@init{
currentScope = Scope.getGlobalScopeInstance();
}
	:^(Root codeBlock) {$rootNode = $codeBlock.treeNode;}
;

idList	returns [List<LangNode> treeNode]
@init {$treeNode = new java.util.ArrayList<LangNode>();}
	:^(IdList (variable {$treeNode.add($variable.treeNode);})+)
	;

codeBlock returns [LangNode treeNode]
@init{
$treeNode = new CodeBlockNode();
currentScope = new Scope(currentScope);
}
@after{
currentScope = currentScope.parent();
}
	:^(CodeBlock (
		(statement {((CodeBlockNode)$treeNode).addStatement($statement.treeNode);})
		//|FunctionDef here was
		)
		*)
	;

statement returns [LangNode treeNode]
@after{
$treeNode.setLine( ((CommonTree)retval.start).getLine() );
}
	:assignment {$treeNode = $assignment.treeNode;}
	|functionCall {$treeNode = $functionCall.treeNode;}
	|methodCall {$treeNode = $methodCall.treeNode;}
	|forStatement {$treeNode = $forStatement.treeNode;}
	|ifStatement {$treeNode = $ifStatement.treeNode;}
	|whileStatement {$treeNode = $whileStatement.treeNode;}
	|untilStatement {$treeNode = $untilStatement.treeNode;}
	|returnStatement {$treeNode = $returnStatement.treeNode;}
	;
	

assignment returns [LangNode treeNode]
@after{
$treeNode.setLine( ((CommonTree)retval.start).getLine() );
}
	:^('=' var expression) {$treeNode = new AssignmentNode($var.treeNode, $expression.treeNode, currentScope);}
	|^('+=' var expression){$treeNode = new AssignmentNode($var.treeNode, new SumNode($var.treeNode, $expression.treeNode), currentScope);}
	|'++'^ var
	|^('-=' var expression){$treeNode = new AssignmentNode($var.treeNode, new MinusNode($var.treeNode, $expression.treeNode), currentScope);}
	|^('*=' var expression){$treeNode = new AssignmentNode($var.treeNode, new MultiplyNode($var.treeNode, $expression.treeNode), currentScope);}
	|^('/=' var expression){$treeNode = new AssignmentNode($var.treeNode, new DivideNode($var.treeNode, $expression.treeNode), currentScope);}
	|^('<<' var expression) {$treeNode = new InsertOperatorNode($var.treeNode, $expression.treeNode, currentScope);}
	|^(MultiplyAssignment expression {$treeNode = new MultiplyAssignmentNode($expression.treeNode, currentScope);} 
		^(MultiplyAssignmentLeft (var {((MultiplyAssignmentNode)$treeNode).addLeftValue($var.treeNode);})+ )
	)
	;

whileStatement returns [LangNode treeNode]
@after{
$treeNode.setLine( ((CommonTree)retval.start).getLine() );
}
	:^(WhileStatement ^(Expression expression) codeBlock) {$treeNode = new WhileStatementNode($expression.treeNode, $codeBlock.treeNode);}
	;

untilStatement returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());//
}
	:^(UntilStatement ^(Expression expression) codeBlock)  {
		LangNode neg = new UnaryNegationNode($expression.treeNode);
		neg.setLine($expression.start.getLine());
		$treeNode = new WhileStatementNode(neg, $codeBlock.treeNode);
	}
	;

ifStatement returns [LangNode treeNode]
@after{
$treeNode.setLine( ((CommonTree)retval.start).getLine() );
}
	:^(IfStatement ^(Expression expression) codeBlock elseStatement?) {$treeNode = new IfStatementNode($expression.treeNode, $codeBlock.treeNode, $elseStatement.treeNode);}
	;
 
elseStatement returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:codeBlock {$treeNode = $codeBlock.treeNode;}
	;

forStatement returns [LangNode treeNode]
@init{
currentScope = new Scope(currentScope);
}
@after{
currentScope = currentScope.parent();
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^(ForStatement ^(InStatement variable expression) codeBlock) 
	{$treeNode = new ForStatementNode($variable.treeNode, $expression.treeNode, $codeBlock.treeNode, currentScope);}
	;

returnStatement returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^(ReturnStatement expression) {$treeNode = new ReturnStatementNode($expression.treeNode, currentScope);}
	;

expressionList returns [List<LangNode> treeNode]
@init {$treeNode = new java.util.ArrayList<LangNode>();}
	:^(ExpressionList (expression {$treeNode.add($expression.treeNode);})+) 
	;

expression returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^('or' a=expression b=expression) {$treeNode = new OrNode($a.treeNode, $b.treeNode);}
	|^('and' a=expression b=expression) {$treeNode = new AndNode($a.treeNode, $b.treeNode);}
	|^('==' a=expression b=expression) {$treeNode = new EqualNode($a.treeNode, $b.treeNode);} 
	|^('!=' a=expression b=expression) 
	{
		LangNode n = new EqualNode($a.treeNode, $b.treeNode);
		n.setLine(((CommonTree)retval.start).getLine());
		$treeNode = new UnaryNegationNode(n);
	} 
	|^('>=' a=expression b=expression)
	|^('<=' a=expression b=expression)
	|^('>' a=expression b=expression) {$treeNode = new GreaterNode($a.treeNode, $b.treeNode);} 
	|^('<' a=expression b=expression) {$treeNode = new GreaterNode($b.treeNode, $a.treeNode);}
	|^('+' a=expression b=expression) {$treeNode = new SumNode($a.treeNode, $b.treeNode);}  
	|^('-' a=expression b=expression)  {$treeNode = new MinusNode($a.treeNode, $b.treeNode);}  
	|^('*' a=expression b=expression)  {$treeNode = new MultiplyNode($a.treeNode, $b.treeNode);} 
	|^('/' a=expression b=expression)  {$treeNode = new DivideNode($a.treeNode, $b.treeNode);} 
	|^('^' a=expression b=expression)  {$treeNode = new PowerNode($a.treeNode, $b.treeNode);} 
	|^('is' a=expression b=expression)  {$treeNode = new IsOperatorNode($a.treeNode, $b.treeNode);} 
	|^(UnaryMinus atom) 
	|^(UnaryNegation atom) {$treeNode = new UnaryNegationNode($atom.treeNode);}
	|atom {$treeNode = $atom.treeNode;}
	;

atom returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:Int {$treeNode = new AtomNode(Integer.parseInt($Int.toString()));}
	|Float{$treeNode = new AtomNode(Double.parseDouble($Float.toString()));}
	|Bool {$treeNode = new AtomNode(Boolean.parseBoolean($Bool.toString()));}
	|list {$treeNode = $list.treeNode;}
	|var {$treeNode = $var.treeNode;}
	|functionCall {$treeNode = $functionCall.treeNode;}
	|methodCall {$treeNode = $methodCall.treeNode;}
	;
	
functionCall returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^(FunctionCall Id expressionList?) {$treeNode = new FunctionCallNode($Id.toString(), $expressionList.treeNode);}
	;
	
methodCall returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^(MethodCall var ^(FunctionCall i1=Id e1=expressionList?) {$treeNode = new MethodCallNode($i1.toString(), $var.treeNode, $e1.treeNode);} 
	(^(FunctionCall i2=Id e2=expressionList?) {$treeNode = new MethodCallNode($i2.toString(), $treeNode, $e2.treeNode);})* )  
	;
	
propertyCall returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^(PropertyCall var Id) {$treeNode = new PropertyCallNode($var.treeNode, $Id.toString());}
	;
	
variable returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:Id {$treeNode = new VarNode($Id.toString(), currentScope);}
	;

list returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^(ListDeclaration expressionList?) {$treeNode = new ListNode($expressionList.treeNode);}
	;
	
var returns[LangNode treeNode]
	:lookup {$treeNode = $lookup.treeNode;}
	|lookupable {$treeNode = $lookupable.treeNode;}
	|propertyCall {$treeNode = $propertyCall.treeNode;}
	;

lookup returns[LangNode treeNode]//long story
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:^(Lookup lookupable {$treeNode = $lookupable.treeNode;} ^(Indexes (index {$treeNode = new LookupNode($treeNode, $index.treeNode);})+))
	;

lookupable returns [LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	//:functionCall {$treeNode = $functionCall.treeNode;}
	:variable {$treeNode = $variable.treeNode;}
	|String {$treeNode = new AtomNode($String.toString().substring(1, $String.toString().length()-1));}
	;

index	returns[LangNode treeNode]
@after{
$treeNode.setLine(((CommonTree)retval.start).getLine());
}
	:expression {$treeNode = $expression.treeNode;}
	;
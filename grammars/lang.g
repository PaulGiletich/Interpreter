grammar lang;

options{
backtrack=true;
output=AST;
}

tokens {
Functions;
CodeBlock;
Indexes;

IdList;
ExpressionList;
ListDeclaration;

FunctionDef;
FunctionSignature;
FunctionCall;
Lookup;
Root;

UnaryMinus;
UnaryNegation;

WhileStatement;
UntilStatement;
ForStatement;
InStatement;
IfStatement;
ReturnStatement;
Expression;

MultiplyAssignment;
MultiplyAssignmentLeft;

MethodCall;
PropertyCall;
}

@parser::header { 
package com.pgiletich.lang.parser; 
import com.pgiletich.lang.*;
import com.pgiletich.lang.values.*;
import com.pgiletich.lang.nodes.*;
import com.pgiletich.lang.nodes.atoms.*;
import com.pgiletich.lang.nodes.statements.*;
import com.pgiletich.lang.nodes.conditional_statements.*;
import com.pgiletich.lang.nodes.operators.binary.*;
import com.pgiletich.lang.nodes.operators.unary.*;
import com.pgiletich.lang.nodes.operators.binary.arithmetic.*;
import com.pgiletich.lang.nodes.operators.binary.compare.*;
import com.pgiletich.lang.nodes.operators.binary.logic.*;
}  
  
@lexer::header { 
package com.pgiletich.lang.parser; 
}

@parser::members{
private Scope currentScope = Scope.getGlobalScopeInstance();
private LangValue currentClass;
}
root
	:codeBlock -> ^(Root codeBlock)
	;

functionDef
	:Def Id '(' idList? ')' NewLine bracedCodeBlock NewLine+
	{currentScope.addFunction(new Function($Id.text, $idList.tree, $bracedCodeBlock.tree));}
	;

classDeclaration
@init{
currentClass = new LangValue(LangValue.ClassValue);
currentScope = currentClass.getScope();
}
@after{
currentScope = Scope.getGlobalScopeInstance();
currentClass = null;
}
	:Class Id bracedClassDefinition NewLine+
	{
	currentClass.getScope().set("className", new LangValue($Id.text));
	Scope.getGlobalScopeInstance().set($Id.text, currentClass);
	}
	;

bracedClassDefinition
	:'{' classDefinition '}' -> classDefinition
	|classDefinition 'end' -> classDefinition
	;

classDefinition
	:NewLine* functionDef*
	;
	
idList
	:Id (',' Id)* -> ^(IdList Id+)
	;

bracedCodeBlock
	:'{' codeBlock '}' -> codeBlock
	|codeBlock 'end' -> codeBlock
	;

codeBlock
	:(endedStatement | functionDef | classDeclaration)* -> ^(CodeBlock endedStatement*)
	;

endedStatement
	:statement NewLine+ -> statement
	;

statement
	:assignment
	|functionCall
	|methodCall
	|forStatement
	|ifStatement
	|whileStatement
	|untilStatement
	|returnStatement
	;

whileStatement
	:'while' expression NewLine+ bracedCodeBlock -> ^(WhileStatement ^(Expression expression) bracedCodeBlock)
	;

untilStatement
	:'until' expression NewLine+ bracedCodeBlock -> ^(UntilStatement ^(Expression expression) bracedCodeBlock)
	;

ifStatement
	:'if' expression NewLine+ bracedCodeBlock elseStatement? -> ^(IfStatement ^(Expression expression) bracedCodeBlock elseStatement?)
	;

elseStatement
	:NewLine* 'else' NewLine+ bracedCodeBlock -> bracedCodeBlock
	;

forStatement
	:'for' '('? Id 'in' expression ')'? NewLine+ bracedCodeBlock -> ^(ForStatement ^(InStatement Id expression) bracedCodeBlock)
	;

returnStatement
	:Return expression -> ^(ReturnStatement expression)
	;

expressionList
	:expression (',' expression)* -> ^(ExpressionList expression+)
	;

assignment
	:lVar '='^ expression
	|lVar '+='^ expression
	|lVar '-='^ expression
	|lVar '*='^ expression
	|lVar '/='^ expression
	|lVar '<<'^ expression
	|lVar (',' lVar)+ '=' expression -> ^(MultiplyAssignment expression ^(MultiplyAssignmentLeft lVar+))
	;

expression
	:isExpression
	;
	
isExpression
	:orExpr ('is'^ Id)?
	;
	
orExpr
	:andExpr ('or'^ andExpr)*
	;

andExpr
	:compareExpr ('and'^ compareExpr)*
	;
	
compareExpr
	:sumExpr (('==' | '!=' | '>=' | '<=' | '>' | '<')^ sumExpr)*
	;

sumExpr
	:multiplyExpr (('+' | '-')^ multiplyExpr)*
	;

multiplyExpr
	:powerExpr (('*' | '/')^ powerExpr)*
	;

powerExpr
	:unaryExpr ('^'^ unaryExpr)*
	;

unaryExpr
	:'-' atom -> ^(UnaryMinus atom)
	|'!' atom -> ^(UnaryNegation atom)
	|atom
	;

atom
	:Int
	|Float
	|Bool
	|String
	|'(' expression ')' -> expression
	|list
	|functionCall
	|methodCall
	|lVar
	;

list	:'[' expressionList? ']' -> ^(ListDeclaration expressionList?)
	;
	
lVar
	:propertyCall
	|var
	;

var
	:lookup
	|Id
	;

lookup
	:Id index+	-> ^(Lookup Id ^(Indexes index*))
	;

functionCall
	:Id '(' expressionList? ')' -> ^(FunctionCall Id expressionList?)
	;
	
methodCall
	:var (Dot functionCall)+ -> ^(MethodCall var functionCall+ )
	;
	
propertyCall
	:var Dot Id -> ^(PropertyCall var Id)
	;

index	:'[' expression ']' -> expression
	;

Def
	:'def'
	;
	
Class
	:'class'
	;

Return
	:'return'
	;

Bool
	:'true' | 'false'
	;

Dot
	:'.'
	;

Id
	:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

String
	:'"' ( ~('\\'|'"') )* '"'
	;
	
Int
	:Number+
	;
	
Float
	:Number+'.'Number+
	;
	
fragment Number
	:'0'..'9'
	;

Comment
	:   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	|   '/*' .* '*/' {$channel=HIDDEN;}
	;
	
NewLine
	:'\n'
	;

WhiteSpace  
	:(' '|'\t'|'\r') {$channel=HIDDEN;}
	;
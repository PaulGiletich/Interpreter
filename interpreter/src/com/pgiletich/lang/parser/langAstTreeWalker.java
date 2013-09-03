// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g 2013-06-16 04:08:34

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


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class langAstTreeWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Functions", "CodeBlock", "Indexes", "IdList", "ExpressionList", "ListDeclaration", "FunctionDef", "FunctionSignature", "FunctionCall", "Lookup", "Root", "UnaryMinus", "UnaryNegation", "WhileStatement", "UntilStatement", "ForStatement", "InStatement", "IfStatement", "ReturnStatement", "Expression", "MultiplyAssignment", "MultiplyAssignmentLeft", "MethodCall", "PropertyCall", "Def", "Id", "NewLine", "Class", "Return", "Int", "Float", "Bool", "String", "Dot", "Number", "Comment", "WhiteSpace", "'('", "')'", "'{'", "'}'", "'end'", "','", "'while'", "'until'", "'if'", "'else'", "'for'", "'in'", "'='", "'+='", "'-='", "'*='", "'/='", "'<<'", "'is'", "'or'", "'and'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'['", "']'", "'++'"
    };
    public static final int EOF=-1;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int Functions=4;
    public static final int CodeBlock=5;
    public static final int Indexes=6;
    public static final int IdList=7;
    public static final int ExpressionList=8;
    public static final int ListDeclaration=9;
    public static final int FunctionDef=10;
    public static final int FunctionSignature=11;
    public static final int FunctionCall=12;
    public static final int Lookup=13;
    public static final int Root=14;
    public static final int UnaryMinus=15;
    public static final int UnaryNegation=16;
    public static final int WhileStatement=17;
    public static final int UntilStatement=18;
    public static final int ForStatement=19;
    public static final int InStatement=20;
    public static final int IfStatement=21;
    public static final int ReturnStatement=22;
    public static final int Expression=23;
    public static final int MultiplyAssignment=24;
    public static final int MultiplyAssignmentLeft=25;
    public static final int MethodCall=26;
    public static final int PropertyCall=27;
    public static final int Def=28;
    public static final int Id=29;
    public static final int NewLine=30;
    public static final int Class=31;
    public static final int Return=32;
    public static final int Int=33;
    public static final int Float=34;
    public static final int Bool=35;
    public static final int String=36;
    public static final int Dot=37;
    public static final int Number=38;
    public static final int Comment=39;
    public static final int WhiteSpace=40;
    public static final int T__76=76;

    // delegates
    // delegators


        public langAstTreeWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public langAstTreeWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return langAstTreeWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g"; }


    private Scope currentScope;
    	
    public void setScope(Scope s){
    	currentScope = s;
    }


    public static class root_return extends TreeRuleReturnScope {
        public LangNode rootNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:33:1: root returns [LangNode rootNode] : ^( Root codeBlock ) ;
    public final langAstTreeWalker.root_return root() throws RecognitionException {
        langAstTreeWalker.root_return retval = new langAstTreeWalker.root_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Root1=null;
        langAstTreeWalker.codeBlock_return codeBlock2 = null;


        CommonTree Root1_tree=null;


        currentScope = Scope.getGlobalScopeInstance();

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:37:2: ( ^( Root codeBlock ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:37:3: ^( Root codeBlock )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Root1=(CommonTree)match(input,Root,FOLLOW_Root_in_root48); 
            Root1_tree = (CommonTree)adaptor.dupNode(Root1);

            root_1 = (CommonTree)adaptor.becomeRoot(Root1_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_root50);
            codeBlock2=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock2.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.rootNode = (codeBlock2!=null?codeBlock2.treeNode:null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class idList_return extends TreeRuleReturnScope {
        public List<LangNode> treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idList"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:40:1: idList returns [List<LangNode> treeNode] : ^( IdList ( variable )+ ) ;
    public final langAstTreeWalker.idList_return idList() throws RecognitionException {
        langAstTreeWalker.idList_return retval = new langAstTreeWalker.idList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IdList3=null;
        langAstTreeWalker.variable_return variable4 = null;


        CommonTree IdList3_tree=null;

        retval.treeNode = new java.util.ArrayList<LangNode>();
        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:42:2: ( ^( IdList ( variable )+ ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:42:3: ^( IdList ( variable )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IdList3=(CommonTree)match(input,IdList,FOLLOW_IdList_in_idList72); 
            IdList3_tree = (CommonTree)adaptor.dupNode(IdList3);

            root_1 = (CommonTree)adaptor.becomeRoot(IdList3_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:42:12: ( variable )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Id) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:42:13: variable
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_variable_in_idList75);
            	    variable4=variable();

            	    state._fsp--;

            	    adaptor.addChild(root_1, variable4.getTree());
            	    retval.treeNode.add((variable4!=null?variable4.treeNode:null));

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class codeBlock_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "codeBlock"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:45:1: codeBlock returns [LangNode treeNode] : ^( CodeBlock ( ( statement ) )* ) ;
    public final langAstTreeWalker.codeBlock_return codeBlock() throws RecognitionException {
        langAstTreeWalker.codeBlock_return retval = new langAstTreeWalker.codeBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CodeBlock5=null;
        langAstTreeWalker.statement_return statement6 = null;


        CommonTree CodeBlock5_tree=null;


        retval.treeNode = new CodeBlockNode();
        currentScope = new Scope(currentScope);

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:53:2: ( ^( CodeBlock ( ( statement ) )* ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:53:3: ^( CodeBlock ( ( statement ) )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CodeBlock5=(CommonTree)match(input,CodeBlock,FOLLOW_CodeBlock_in_codeBlock103); 
            CodeBlock5_tree = (CommonTree)adaptor.dupNode(CodeBlock5);

            root_1 = (CommonTree)adaptor.becomeRoot(CodeBlock5_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:53:15: ( ( statement ) )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==FunctionCall||(LA2_0>=WhileStatement && LA2_0<=ForStatement)||(LA2_0>=IfStatement && LA2_0<=ReturnStatement)||LA2_0==MultiplyAssignment||LA2_0==MethodCall||(LA2_0>=53 && LA2_0<=58)||LA2_0==76) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:54:3: ( statement )
                	    {
                	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:54:3: ( statement )
                	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:54:4: statement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_statement_in_codeBlock110);
                	    statement6=statement();

                	    state._fsp--;

                	    adaptor.addChild(root_1, statement6.getTree());
                	    ((CodeBlockNode)retval.treeNode).addStatement((statement6!=null?statement6.treeNode:null));

                	    }


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            currentScope = currentScope.parent();

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "codeBlock"

    public static class statement_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:60:1: statement returns [LangNode treeNode] : ( assignment | functionCall | methodCall | forStatement | ifStatement | whileStatement | untilStatement | returnStatement );
    public final langAstTreeWalker.statement_return statement() throws RecognitionException {
        langAstTreeWalker.statement_return retval = new langAstTreeWalker.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        langAstTreeWalker.assignment_return assignment7 = null;

        langAstTreeWalker.functionCall_return functionCall8 = null;

        langAstTreeWalker.methodCall_return methodCall9 = null;

        langAstTreeWalker.forStatement_return forStatement10 = null;

        langAstTreeWalker.ifStatement_return ifStatement11 = null;

        langAstTreeWalker.whileStatement_return whileStatement12 = null;

        langAstTreeWalker.untilStatement_return untilStatement13 = null;

        langAstTreeWalker.returnStatement_return returnStatement14 = null;



        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:64:2: ( assignment | functionCall | methodCall | forStatement | ifStatement | whileStatement | untilStatement | returnStatement )
            int alt3=8;
            switch ( input.LA(1) ) {
            case MultiplyAssignment:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 76:
                {
                alt3=1;
                }
                break;
            case FunctionCall:
                {
                alt3=2;
                }
                break;
            case MethodCall:
                {
                alt3=3;
                }
                break;
            case ForStatement:
                {
                alt3=4;
                }
                break;
            case IfStatement:
                {
                alt3=5;
                }
                break;
            case WhileStatement:
                {
                alt3=6;
                }
                break;
            case UntilStatement:
                {
                alt3=7;
                }
                break;
            case ReturnStatement:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:64:3: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_assignment_in_statement143);
                    assignment7=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment7.getTree());
                    retval.treeNode = (assignment7!=null?assignment7.treeNode:null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:65:3: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionCall_in_statement149);
                    functionCall8=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall8.getTree());
                    retval.treeNode = (functionCall8!=null?functionCall8.treeNode:null);

                    }
                    break;
                case 3 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:66:3: methodCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_methodCall_in_statement155);
                    methodCall9=methodCall();

                    state._fsp--;

                    adaptor.addChild(root_0, methodCall9.getTree());
                    retval.treeNode = (methodCall9!=null?methodCall9.treeNode:null);

                    }
                    break;
                case 4 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:67:3: forStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forStatement_in_statement161);
                    forStatement10=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement10.getTree());
                    retval.treeNode = (forStatement10!=null?forStatement10.treeNode:null);

                    }
                    break;
                case 5 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:68:3: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ifStatement_in_statement167);
                    ifStatement11=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement11.getTree());
                    retval.treeNode = (ifStatement11!=null?ifStatement11.treeNode:null);

                    }
                    break;
                case 6 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:69:3: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whileStatement_in_statement173);
                    whileStatement12=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement12.getTree());
                    retval.treeNode = (whileStatement12!=null?whileStatement12.treeNode:null);

                    }
                    break;
                case 7 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:70:3: untilStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_untilStatement_in_statement179);
                    untilStatement13=untilStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, untilStatement13.getTree());
                    retval.treeNode = (untilStatement13!=null?untilStatement13.treeNode:null);

                    }
                    break;
                case 8 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:71:3: returnStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_returnStatement_in_statement185);
                    returnStatement14=returnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, returnStatement14.getTree());
                    retval.treeNode = (returnStatement14!=null?returnStatement14.treeNode:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine( ((CommonTree)retval.start).getLine() );

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class assignment_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:75:1: assignment returns [LangNode treeNode] : ( ^( '=' var expression ) | ^( '+=' var expression ) | '++' var | ^( '-=' var expression ) | ^( '*=' var expression ) | ^( '/=' var expression ) | ^( '<<' var expression ) | ^( MultiplyAssignment expression ^( MultiplyAssignmentLeft ( var )+ ) ) );
    public final langAstTreeWalker.assignment_return assignment() throws RecognitionException {
        langAstTreeWalker.assignment_return retval = new langAstTreeWalker.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal15=null;
        CommonTree string_literal18=null;
        CommonTree string_literal21=null;
        CommonTree string_literal23=null;
        CommonTree string_literal26=null;
        CommonTree string_literal29=null;
        CommonTree string_literal32=null;
        CommonTree MultiplyAssignment35=null;
        CommonTree MultiplyAssignmentLeft37=null;
        langAstTreeWalker.var_return var16 = null;

        langAstTreeWalker.expression_return expression17 = null;

        langAstTreeWalker.var_return var19 = null;

        langAstTreeWalker.expression_return expression20 = null;

        langAstTreeWalker.var_return var22 = null;

        langAstTreeWalker.var_return var24 = null;

        langAstTreeWalker.expression_return expression25 = null;

        langAstTreeWalker.var_return var27 = null;

        langAstTreeWalker.expression_return expression28 = null;

        langAstTreeWalker.var_return var30 = null;

        langAstTreeWalker.expression_return expression31 = null;

        langAstTreeWalker.var_return var33 = null;

        langAstTreeWalker.expression_return expression34 = null;

        langAstTreeWalker.expression_return expression36 = null;

        langAstTreeWalker.var_return var38 = null;


        CommonTree char_literal15_tree=null;
        CommonTree string_literal18_tree=null;
        CommonTree string_literal21_tree=null;
        CommonTree string_literal23_tree=null;
        CommonTree string_literal26_tree=null;
        CommonTree string_literal29_tree=null;
        CommonTree string_literal32_tree=null;
        CommonTree MultiplyAssignment35_tree=null;
        CommonTree MultiplyAssignmentLeft37_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:79:2: ( ^( '=' var expression ) | ^( '+=' var expression ) | '++' var | ^( '-=' var expression ) | ^( '*=' var expression ) | ^( '/=' var expression ) | ^( '<<' var expression ) | ^( MultiplyAssignment expression ^( MultiplyAssignmentLeft ( var )+ ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt5=1;
                }
                break;
            case 54:
                {
                alt5=2;
                }
                break;
            case 76:
                {
                alt5=3;
                }
                break;
            case 55:
                {
                alt5=4;
                }
                break;
            case 56:
                {
                alt5=5;
                }
                break;
            case 57:
                {
                alt5=6;
                }
                break;
            case 58:
                {
                alt5=7;
                }
                break;
            case MultiplyAssignment:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:79:3: ^( '=' var expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal15=(CommonTree)match(input,53,FOLLOW_53_in_assignment208); 
                    char_literal15_tree = (CommonTree)adaptor.dupNode(char_literal15);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal15_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_assignment210);
                    var16=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var16.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_assignment212);
                    expression17=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression17.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new AssignmentNode((var16!=null?var16.treeNode:null), (expression17!=null?expression17.treeNode:null), currentScope);

                    }
                    break;
                case 2 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:80:3: ^( '+=' var expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal18=(CommonTree)match(input,54,FOLLOW_54_in_assignment220); 
                    string_literal18_tree = (CommonTree)adaptor.dupNode(string_literal18);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal18_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_assignment222);
                    var19=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var19.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_assignment224);
                    expression20=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression20.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new AssignmentNode((var19!=null?var19.treeNode:null), new SumNode((var19!=null?var19.treeNode:null), (expression20!=null?expression20.treeNode:null)), currentScope);

                    }
                    break;
                case 3 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:81:3: '++' var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    string_literal21=(CommonTree)match(input,76,FOLLOW_76_in_assignment230); 
                    string_literal21_tree = (CommonTree)adaptor.dupNode(string_literal21);

                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal21_tree, root_0);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_assignment233);
                    var22=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var22.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:82:3: ^( '-=' var expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal23=(CommonTree)match(input,55,FOLLOW_55_in_assignment238); 
                    string_literal23_tree = (CommonTree)adaptor.dupNode(string_literal23);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal23_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_assignment240);
                    var24=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var24.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_assignment242);
                    expression25=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression25.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new AssignmentNode((var24!=null?var24.treeNode:null), new MinusNode((var24!=null?var24.treeNode:null), (expression25!=null?expression25.treeNode:null)), currentScope);

                    }
                    break;
                case 5 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:83:3: ^( '*=' var expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal26=(CommonTree)match(input,56,FOLLOW_56_in_assignment249); 
                    string_literal26_tree = (CommonTree)adaptor.dupNode(string_literal26);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal26_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_assignment251);
                    var27=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var27.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_assignment253);
                    expression28=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression28.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new AssignmentNode((var27!=null?var27.treeNode:null), new MultiplyNode((var27!=null?var27.treeNode:null), (expression28!=null?expression28.treeNode:null)), currentScope);

                    }
                    break;
                case 6 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:84:3: ^( '/=' var expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal29=(CommonTree)match(input,57,FOLLOW_57_in_assignment260); 
                    string_literal29_tree = (CommonTree)adaptor.dupNode(string_literal29);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_assignment262);
                    var30=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var30.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_assignment264);
                    expression31=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression31.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new AssignmentNode((var30!=null?var30.treeNode:null), new DivideNode((var30!=null?var30.treeNode:null), (expression31!=null?expression31.treeNode:null)), currentScope);

                    }
                    break;
                case 7 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:85:3: ^( '<<' var expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal32=(CommonTree)match(input,58,FOLLOW_58_in_assignment271); 
                    string_literal32_tree = (CommonTree)adaptor.dupNode(string_literal32);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal32_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_assignment273);
                    var33=var();

                    state._fsp--;

                    adaptor.addChild(root_1, var33.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_assignment275);
                    expression34=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression34.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new InsertOperatorNode((var33!=null?var33.treeNode:null), (expression34!=null?expression34.treeNode:null), currentScope);

                    }
                    break;
                case 8 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:86:3: ^( MultiplyAssignment expression ^( MultiplyAssignmentLeft ( var )+ ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MultiplyAssignment35=(CommonTree)match(input,MultiplyAssignment,FOLLOW_MultiplyAssignment_in_assignment283); 
                    MultiplyAssignment35_tree = (CommonTree)adaptor.dupNode(MultiplyAssignment35);

                    root_1 = (CommonTree)adaptor.becomeRoot(MultiplyAssignment35_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_assignment285);
                    expression36=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression36.getTree());
                    retval.treeNode = new MultiplyAssignmentNode((expression36!=null?expression36.treeNode:null), currentScope);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MultiplyAssignmentLeft37=(CommonTree)match(input,MultiplyAssignmentLeft,FOLLOW_MultiplyAssignmentLeft_in_assignment293); 
                    MultiplyAssignmentLeft37_tree = (CommonTree)adaptor.dupNode(MultiplyAssignmentLeft37);

                    root_2 = (CommonTree)adaptor.becomeRoot(MultiplyAssignmentLeft37_tree, root_2);



                    match(input, Token.DOWN, null); 
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:87:28: ( var )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Lookup||LA4_0==PropertyCall||LA4_0==Id||LA4_0==String) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:87:29: var
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_var_in_assignment296);
                    	    var38=var();

                    	    state._fsp--;

                    	    adaptor.addChild(root_2, var38.getTree());
                    	    ((MultiplyAssignmentNode)retval.treeNode).addLeftValue((var38!=null?var38.treeNode:null));

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine( ((CommonTree)retval.start).getLine() );

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class whileStatement_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:91:1: whileStatement returns [LangNode treeNode] : ^( WhileStatement ^( Expression expression ) codeBlock ) ;
    public final langAstTreeWalker.whileStatement_return whileStatement() throws RecognitionException {
        langAstTreeWalker.whileStatement_return retval = new langAstTreeWalker.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WhileStatement39=null;
        CommonTree Expression40=null;
        langAstTreeWalker.expression_return expression41 = null;

        langAstTreeWalker.codeBlock_return codeBlock42 = null;


        CommonTree WhileStatement39_tree=null;
        CommonTree Expression40_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:95:2: ( ^( WhileStatement ^( Expression expression ) codeBlock ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:95:3: ^( WhileStatement ^( Expression expression ) codeBlock )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            WhileStatement39=(CommonTree)match(input,WhileStatement,FOLLOW_WhileStatement_in_whileStatement324); 
            WhileStatement39_tree = (CommonTree)adaptor.dupNode(WhileStatement39);

            root_1 = (CommonTree)adaptor.becomeRoot(WhileStatement39_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Expression40=(CommonTree)match(input,Expression,FOLLOW_Expression_in_whileStatement327); 
            Expression40_tree = (CommonTree)adaptor.dupNode(Expression40);

            root_2 = (CommonTree)adaptor.becomeRoot(Expression40_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_whileStatement329);
            expression41=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression41.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_whileStatement332);
            codeBlock42=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock42.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.treeNode = new WhileStatementNode((expression41!=null?expression41.treeNode:null), (codeBlock42!=null?codeBlock42.treeNode:null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine( ((CommonTree)retval.start).getLine() );

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class untilStatement_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "untilStatement"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:98:1: untilStatement returns [LangNode treeNode] : ^( UntilStatement ^( Expression expression ) codeBlock ) ;
    public final langAstTreeWalker.untilStatement_return untilStatement() throws RecognitionException {
        langAstTreeWalker.untilStatement_return retval = new langAstTreeWalker.untilStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UntilStatement43=null;
        CommonTree Expression44=null;
        langAstTreeWalker.expression_return expression45 = null;

        langAstTreeWalker.codeBlock_return codeBlock46 = null;


        CommonTree UntilStatement43_tree=null;
        CommonTree Expression44_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:102:2: ( ^( UntilStatement ^( Expression expression ) codeBlock ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:102:3: ^( UntilStatement ^( Expression expression ) codeBlock )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            UntilStatement43=(CommonTree)match(input,UntilStatement,FOLLOW_UntilStatement_in_untilStatement354); 
            UntilStatement43_tree = (CommonTree)adaptor.dupNode(UntilStatement43);

            root_1 = (CommonTree)adaptor.becomeRoot(UntilStatement43_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Expression44=(CommonTree)match(input,Expression,FOLLOW_Expression_in_untilStatement357); 
            Expression44_tree = (CommonTree)adaptor.dupNode(Expression44);

            root_2 = (CommonTree)adaptor.becomeRoot(Expression44_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_untilStatement359);
            expression45=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression45.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_untilStatement362);
            codeBlock46=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock46.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		LangNode neg = new UnaryNegationNode((expression45!=null?expression45.treeNode:null));
            		neg.setLine((expression45!=null?((CommonTree)expression45.start):null).getLine());
            		retval.treeNode = new WhileStatementNode(neg, (codeBlock46!=null?codeBlock46.treeNode:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());//

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "untilStatement"

    public static class ifStatement_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:109:1: ifStatement returns [LangNode treeNode] : ^( IfStatement ^( Expression expression ) codeBlock ( elseStatement )? ) ;
    public final langAstTreeWalker.ifStatement_return ifStatement() throws RecognitionException {
        langAstTreeWalker.ifStatement_return retval = new langAstTreeWalker.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IfStatement47=null;
        CommonTree Expression48=null;
        langAstTreeWalker.expression_return expression49 = null;

        langAstTreeWalker.codeBlock_return codeBlock50 = null;

        langAstTreeWalker.elseStatement_return elseStatement51 = null;


        CommonTree IfStatement47_tree=null;
        CommonTree Expression48_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:113:2: ( ^( IfStatement ^( Expression expression ) codeBlock ( elseStatement )? ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:113:3: ^( IfStatement ^( Expression expression ) codeBlock ( elseStatement )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IfStatement47=(CommonTree)match(input,IfStatement,FOLLOW_IfStatement_in_ifStatement385); 
            IfStatement47_tree = (CommonTree)adaptor.dupNode(IfStatement47);

            root_1 = (CommonTree)adaptor.becomeRoot(IfStatement47_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Expression48=(CommonTree)match(input,Expression,FOLLOW_Expression_in_ifStatement388); 
            Expression48_tree = (CommonTree)adaptor.dupNode(Expression48);

            root_2 = (CommonTree)adaptor.becomeRoot(Expression48_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_ifStatement390);
            expression49=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression49.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_ifStatement393);
            codeBlock50=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock50.getTree());
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:113:52: ( elseStatement )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CodeBlock) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:113:52: elseStatement
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_elseStatement_in_ifStatement395);
                    elseStatement51=elseStatement();

                    state._fsp--;

                    adaptor.addChild(root_1, elseStatement51.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.treeNode = new IfStatementNode((expression49!=null?expression49.treeNode:null), (codeBlock50!=null?codeBlock50.treeNode:null), (elseStatement51!=null?elseStatement51.treeNode:null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine( ((CommonTree)retval.start).getLine() );

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class elseStatement_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStatement"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:116:1: elseStatement returns [LangNode treeNode] : codeBlock ;
    public final langAstTreeWalker.elseStatement_return elseStatement() throws RecognitionException {
        langAstTreeWalker.elseStatement_return retval = new langAstTreeWalker.elseStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        langAstTreeWalker.codeBlock_return codeBlock52 = null;



        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:120:2: ( codeBlock )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:120:3: codeBlock
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_elseStatement418);
            codeBlock52=codeBlock();

            state._fsp--;

            adaptor.addChild(root_0, codeBlock52.getTree());
            retval.treeNode = (codeBlock52!=null?codeBlock52.treeNode:null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseStatement"

    public static class forStatement_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:123:1: forStatement returns [LangNode treeNode] : ^( ForStatement ^( InStatement variable expression ) codeBlock ) ;
    public final langAstTreeWalker.forStatement_return forStatement() throws RecognitionException {
        langAstTreeWalker.forStatement_return retval = new langAstTreeWalker.forStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ForStatement53=null;
        CommonTree InStatement54=null;
        langAstTreeWalker.variable_return variable55 = null;

        langAstTreeWalker.expression_return expression56 = null;

        langAstTreeWalker.codeBlock_return codeBlock57 = null;


        CommonTree ForStatement53_tree=null;
        CommonTree InStatement54_tree=null;


        currentScope = new Scope(currentScope);

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:131:2: ( ^( ForStatement ^( InStatement variable expression ) codeBlock ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:131:3: ^( ForStatement ^( InStatement variable expression ) codeBlock )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ForStatement53=(CommonTree)match(input,ForStatement,FOLLOW_ForStatement_in_forStatement443); 
            ForStatement53_tree = (CommonTree)adaptor.dupNode(ForStatement53);

            root_1 = (CommonTree)adaptor.becomeRoot(ForStatement53_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            InStatement54=(CommonTree)match(input,InStatement,FOLLOW_InStatement_in_forStatement446); 
            InStatement54_tree = (CommonTree)adaptor.dupNode(InStatement54);

            root_2 = (CommonTree)adaptor.becomeRoot(InStatement54_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variable_in_forStatement448);
            variable55=variable();

            state._fsp--;

            adaptor.addChild(root_2, variable55.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_forStatement450);
            expression56=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression56.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_codeBlock_in_forStatement453);
            codeBlock57=codeBlock();

            state._fsp--;

            adaptor.addChild(root_1, codeBlock57.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.treeNode = new ForStatementNode((variable55!=null?variable55.treeNode:null), (expression56!=null?expression56.treeNode:null), (codeBlock57!=null?codeBlock57.treeNode:null), currentScope);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            currentScope = currentScope.parent();
            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class returnStatement_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:135:1: returnStatement returns [LangNode treeNode] : ^( ReturnStatement expression ) ;
    public final langAstTreeWalker.returnStatement_return returnStatement() throws RecognitionException {
        langAstTreeWalker.returnStatement_return retval = new langAstTreeWalker.returnStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ReturnStatement58=null;
        langAstTreeWalker.expression_return expression59 = null;


        CommonTree ReturnStatement58_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:139:2: ( ^( ReturnStatement expression ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:139:3: ^( ReturnStatement expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ReturnStatement58=(CommonTree)match(input,ReturnStatement,FOLLOW_ReturnStatement_in_returnStatement477); 
            ReturnStatement58_tree = (CommonTree)adaptor.dupNode(ReturnStatement58);

            root_1 = (CommonTree)adaptor.becomeRoot(ReturnStatement58_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_returnStatement479);
            expression59=expression();

            state._fsp--;

            adaptor.addChild(root_1, expression59.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.treeNode = new ReturnStatementNode((expression59!=null?expression59.treeNode:null), currentScope);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    public static class expressionList_return extends TreeRuleReturnScope {
        public List<LangNode> treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:142:1: expressionList returns [List<LangNode> treeNode] : ^( ExpressionList ( expression )+ ) ;
    public final langAstTreeWalker.expressionList_return expressionList() throws RecognitionException {
        langAstTreeWalker.expressionList_return retval = new langAstTreeWalker.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ExpressionList60=null;
        langAstTreeWalker.expression_return expression61 = null;


        CommonTree ExpressionList60_tree=null;

        retval.treeNode = new java.util.ArrayList<LangNode>();
        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:144:2: ( ^( ExpressionList ( expression )+ ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:144:3: ^( ExpressionList ( expression )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ExpressionList60=(CommonTree)match(input,ExpressionList,FOLLOW_ExpressionList_in_expressionList502); 
            ExpressionList60_tree = (CommonTree)adaptor.dupNode(ExpressionList60);

            root_1 = (CommonTree)adaptor.becomeRoot(ExpressionList60_tree, root_1);



            match(input, Token.DOWN, null); 
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:144:20: ( expression )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ListDeclaration||(LA7_0>=FunctionCall && LA7_0<=Lookup)||(LA7_0>=UnaryMinus && LA7_0<=UnaryNegation)||(LA7_0>=MethodCall && LA7_0<=PropertyCall)||LA7_0==Id||(LA7_0>=Int && LA7_0<=String)||(LA7_0>=59 && LA7_0<=72)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:144:21: expression
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_expressionList505);
            	    expression61=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_1, expression61.getTree());
            	    retval.treeNode.add((expression61!=null?expression61.treeNode:null));

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class expression_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:147:1: expression returns [LangNode treeNode] : ( ^( 'or' a= expression b= expression ) | ^( 'and' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( 'is' a= expression b= expression ) | ^( UnaryMinus atom ) | ^( UnaryNegation atom ) | atom );
    public final langAstTreeWalker.expression_return expression() throws RecognitionException {
        langAstTreeWalker.expression_return retval = new langAstTreeWalker.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal62=null;
        CommonTree string_literal63=null;
        CommonTree string_literal64=null;
        CommonTree string_literal65=null;
        CommonTree string_literal66=null;
        CommonTree string_literal67=null;
        CommonTree char_literal68=null;
        CommonTree char_literal69=null;
        CommonTree char_literal70=null;
        CommonTree char_literal71=null;
        CommonTree char_literal72=null;
        CommonTree char_literal73=null;
        CommonTree char_literal74=null;
        CommonTree string_literal75=null;
        CommonTree UnaryMinus76=null;
        CommonTree UnaryNegation78=null;
        langAstTreeWalker.expression_return a = null;

        langAstTreeWalker.expression_return b = null;

        langAstTreeWalker.atom_return atom77 = null;

        langAstTreeWalker.atom_return atom79 = null;

        langAstTreeWalker.atom_return atom80 = null;


        CommonTree string_literal62_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree string_literal64_tree=null;
        CommonTree string_literal65_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree char_literal70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree string_literal75_tree=null;
        CommonTree UnaryMinus76_tree=null;
        CommonTree UnaryNegation78_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:151:2: ( ^( 'or' a= expression b= expression ) | ^( 'and' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( 'is' a= expression b= expression ) | ^( UnaryMinus atom ) | ^( UnaryNegation atom ) | atom )
            int alt8=17;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt8=1;
                }
                break;
            case 61:
                {
                alt8=2;
                }
                break;
            case 62:
                {
                alt8=3;
                }
                break;
            case 63:
                {
                alt8=4;
                }
                break;
            case 64:
                {
                alt8=5;
                }
                break;
            case 65:
                {
                alt8=6;
                }
                break;
            case 66:
                {
                alt8=7;
                }
                break;
            case 67:
                {
                alt8=8;
                }
                break;
            case 68:
                {
                alt8=9;
                }
                break;
            case 69:
                {
                alt8=10;
                }
                break;
            case 70:
                {
                alt8=11;
                }
                break;
            case 71:
                {
                alt8=12;
                }
                break;
            case 72:
                {
                alt8=13;
                }
                break;
            case 59:
                {
                alt8=14;
                }
                break;
            case UnaryMinus:
                {
                alt8=15;
                }
                break;
            case UnaryNegation:
                {
                alt8=16;
                }
                break;
            case ListDeclaration:
            case FunctionCall:
            case Lookup:
            case MethodCall:
            case PropertyCall:
            case Id:
            case Int:
            case Float:
            case Bool:
            case String:
                {
                alt8=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:151:3: ^( 'or' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal62=(CommonTree)match(input,60,FOLLOW_60_in_expression530); 
                    string_literal62_tree = (CommonTree)adaptor.dupNode(string_literal62);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal62_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression534);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression538);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new OrNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 2 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:152:3: ^( 'and' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal63=(CommonTree)match(input,61,FOLLOW_61_in_expression546); 
                    string_literal63_tree = (CommonTree)adaptor.dupNode(string_literal63);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal63_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression550);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression554);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new AndNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 3 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:153:3: ^( '==' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal64=(CommonTree)match(input,62,FOLLOW_62_in_expression562); 
                    string_literal64_tree = (CommonTree)adaptor.dupNode(string_literal64);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal64_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression566);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression570);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new EqualNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 4 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:154:3: ^( '!=' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal65=(CommonTree)match(input,63,FOLLOW_63_in_expression579); 
                    string_literal65_tree = (CommonTree)adaptor.dupNode(string_literal65);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal65_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression583);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression587);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		LangNode n = new EqualNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));
                    		n.setLine(((CommonTree)retval.start).getLine());
                    		retval.treeNode = new UnaryNegationNode(n);
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:160:3: ^( '>=' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal66=(CommonTree)match(input,64,FOLLOW_64_in_expression598); 
                    string_literal66_tree = (CommonTree)adaptor.dupNode(string_literal66);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal66_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression602);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression606);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:161:3: ^( '<=' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal67=(CommonTree)match(input,65,FOLLOW_65_in_expression612); 
                    string_literal67_tree = (CommonTree)adaptor.dupNode(string_literal67);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal67_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression616);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression620);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:162:3: ^( '>' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal68=(CommonTree)match(input,66,FOLLOW_66_in_expression626); 
                    char_literal68_tree = (CommonTree)adaptor.dupNode(char_literal68);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal68_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression630);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression634);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new GreaterNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 8 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:163:3: ^( '<' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal69=(CommonTree)match(input,67,FOLLOW_67_in_expression643); 
                    char_literal69_tree = (CommonTree)adaptor.dupNode(char_literal69);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal69_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression647);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression651);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new GreaterNode((b!=null?b.treeNode:null), (a!=null?a.treeNode:null));

                    }
                    break;
                case 9 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:164:3: ^( '+' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal70=(CommonTree)match(input,68,FOLLOW_68_in_expression659); 
                    char_literal70_tree = (CommonTree)adaptor.dupNode(char_literal70);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal70_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression663);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression667);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new SumNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 10 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:165:3: ^( '-' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal71=(CommonTree)match(input,69,FOLLOW_69_in_expression677); 
                    char_literal71_tree = (CommonTree)adaptor.dupNode(char_literal71);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal71_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression681);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression685);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new MinusNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 11 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:166:3: ^( '*' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal72=(CommonTree)match(input,70,FOLLOW_70_in_expression696); 
                    char_literal72_tree = (CommonTree)adaptor.dupNode(char_literal72);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal72_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression700);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression704);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new MultiplyNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 12 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:167:3: ^( '/' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal73=(CommonTree)match(input,71,FOLLOW_71_in_expression714); 
                    char_literal73_tree = (CommonTree)adaptor.dupNode(char_literal73);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal73_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression718);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression722);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new DivideNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 13 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:168:3: ^( '^' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    char_literal74=(CommonTree)match(input,72,FOLLOW_72_in_expression732); 
                    char_literal74_tree = (CommonTree)adaptor.dupNode(char_literal74);

                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal74_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression736);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression740);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new PowerNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 14 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:169:3: ^( 'is' a= expression b= expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    string_literal75=(CommonTree)match(input,59,FOLLOW_59_in_expression750); 
                    string_literal75_tree = (CommonTree)adaptor.dupNode(string_literal75);

                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal75_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression754);
                    a=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, a.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression758);
                    b=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, b.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new IsOperatorNode((a!=null?a.treeNode:null), (b!=null?b.treeNode:null));

                    }
                    break;
                case 15 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:170:3: ^( UnaryMinus atom )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UnaryMinus76=(CommonTree)match(input,UnaryMinus,FOLLOW_UnaryMinus_in_expression768); 
                    UnaryMinus76_tree = (CommonTree)adaptor.dupNode(UnaryMinus76);

                    root_1 = (CommonTree)adaptor.becomeRoot(UnaryMinus76_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_expression770);
                    atom77=atom();

                    state._fsp--;

                    adaptor.addChild(root_1, atom77.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 16 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:171:3: ^( UnaryNegation atom )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UnaryNegation78=(CommonTree)match(input,UnaryNegation,FOLLOW_UnaryNegation_in_expression777); 
                    UnaryNegation78_tree = (CommonTree)adaptor.dupNode(UnaryNegation78);

                    root_1 = (CommonTree)adaptor.becomeRoot(UnaryNegation78_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_expression779);
                    atom79=atom();

                    state._fsp--;

                    adaptor.addChild(root_1, atom79.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    retval.treeNode = new UnaryNegationNode((atom79!=null?atom79.treeNode:null));

                    }
                    break;
                case 17 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:172:3: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atom_in_expression786);
                    atom80=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom80.getTree());
                    retval.treeNode = (atom80!=null?atom80.treeNode:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class atom_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:175:1: atom returns [LangNode treeNode] : ( Int | Float | Bool | list | var | functionCall | methodCall );
    public final langAstTreeWalker.atom_return atom() throws RecognitionException {
        langAstTreeWalker.atom_return retval = new langAstTreeWalker.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Int81=null;
        CommonTree Float82=null;
        CommonTree Bool83=null;
        langAstTreeWalker.list_return list84 = null;

        langAstTreeWalker.var_return var85 = null;

        langAstTreeWalker.functionCall_return functionCall86 = null;

        langAstTreeWalker.methodCall_return methodCall87 = null;


        CommonTree Int81_tree=null;
        CommonTree Float82_tree=null;
        CommonTree Bool83_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:179:2: ( Int | Float | Bool | list | var | functionCall | methodCall )
            int alt9=7;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt9=1;
                }
                break;
            case Float:
                {
                alt9=2;
                }
                break;
            case Bool:
                {
                alt9=3;
                }
                break;
            case ListDeclaration:
                {
                alt9=4;
                }
                break;
            case Lookup:
            case PropertyCall:
            case Id:
            case String:
                {
                alt9=5;
                }
                break;
            case FunctionCall:
                {
                alt9=6;
                }
                break;
            case MethodCall:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:179:3: Int
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    Int81=(CommonTree)match(input,Int,FOLLOW_Int_in_atom806); 
                    Int81_tree = (CommonTree)adaptor.dupNode(Int81);

                    adaptor.addChild(root_0, Int81_tree);

                    retval.treeNode = new AtomNode(Integer.parseInt(Int81.toString()));

                    }
                    break;
                case 2 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:180:3: Float
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    Float82=(CommonTree)match(input,Float,FOLLOW_Float_in_atom812); 
                    Float82_tree = (CommonTree)adaptor.dupNode(Float82);

                    adaptor.addChild(root_0, Float82_tree);

                    retval.treeNode = new AtomNode(Double.parseDouble(Float82.toString()));

                    }
                    break;
                case 3 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:181:3: Bool
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    Bool83=(CommonTree)match(input,Bool,FOLLOW_Bool_in_atom817); 
                    Bool83_tree = (CommonTree)adaptor.dupNode(Bool83);

                    adaptor.addChild(root_0, Bool83_tree);

                    retval.treeNode = new AtomNode(Boolean.parseBoolean(Bool83.toString()));

                    }
                    break;
                case 4 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:182:3: list
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_list_in_atom823);
                    list84=list();

                    state._fsp--;

                    adaptor.addChild(root_0, list84.getTree());
                    retval.treeNode = (list84!=null?list84.treeNode:null);

                    }
                    break;
                case 5 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:183:3: var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_var_in_atom829);
                    var85=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var85.getTree());
                    retval.treeNode = (var85!=null?var85.treeNode:null);

                    }
                    break;
                case 6 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:184:3: functionCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_functionCall_in_atom835);
                    functionCall86=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall86.getTree());
                    retval.treeNode = (functionCall86!=null?functionCall86.treeNode:null);

                    }
                    break;
                case 7 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:185:3: methodCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_methodCall_in_atom841);
                    methodCall87=methodCall();

                    state._fsp--;

                    adaptor.addChild(root_0, methodCall87.getTree());
                    retval.treeNode = (methodCall87!=null?methodCall87.treeNode:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class functionCall_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:188:1: functionCall returns [LangNode treeNode] : ^( FunctionCall Id ( expressionList )? ) ;
    public final langAstTreeWalker.functionCall_return functionCall() throws RecognitionException {
        langAstTreeWalker.functionCall_return retval = new langAstTreeWalker.functionCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FunctionCall88=null;
        CommonTree Id89=null;
        langAstTreeWalker.expressionList_return expressionList90 = null;


        CommonTree FunctionCall88_tree=null;
        CommonTree Id89_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:192:2: ( ^( FunctionCall Id ( expressionList )? ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:192:3: ^( FunctionCall Id ( expressionList )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FunctionCall88=(CommonTree)match(input,FunctionCall,FOLLOW_FunctionCall_in_functionCall863); 
            FunctionCall88_tree = (CommonTree)adaptor.dupNode(FunctionCall88);

            root_1 = (CommonTree)adaptor.becomeRoot(FunctionCall88_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            Id89=(CommonTree)match(input,Id,FOLLOW_Id_in_functionCall865); 
            Id89_tree = (CommonTree)adaptor.dupNode(Id89);

            adaptor.addChild(root_1, Id89_tree);

            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:192:21: ( expressionList )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ExpressionList) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:192:21: expressionList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressionList_in_functionCall867);
                    expressionList90=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_1, expressionList90.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.treeNode = new FunctionCallNode(Id89.toString(), (expressionList90!=null?expressionList90.treeNode:null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class methodCall_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodCall"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:195:1: methodCall returns [LangNode treeNode] : ^( MethodCall var ^( FunctionCall i1= Id (e1= expressionList )? ) ( ^( FunctionCall i2= Id (e2= expressionList )? ) )* ) ;
    public final langAstTreeWalker.methodCall_return methodCall() throws RecognitionException {
        langAstTreeWalker.methodCall_return retval = new langAstTreeWalker.methodCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree MethodCall91=null;
        CommonTree FunctionCall93=null;
        CommonTree FunctionCall94=null;
        langAstTreeWalker.expressionList_return e1 = null;

        langAstTreeWalker.expressionList_return e2 = null;

        langAstTreeWalker.var_return var92 = null;


        CommonTree i1_tree=null;
        CommonTree i2_tree=null;
        CommonTree MethodCall91_tree=null;
        CommonTree FunctionCall93_tree=null;
        CommonTree FunctionCall94_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:199:2: ( ^( MethodCall var ^( FunctionCall i1= Id (e1= expressionList )? ) ( ^( FunctionCall i2= Id (e2= expressionList )? ) )* ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:199:3: ^( MethodCall var ^( FunctionCall i1= Id (e1= expressionList )? ) ( ^( FunctionCall i2= Id (e2= expressionList )? ) )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            MethodCall91=(CommonTree)match(input,MethodCall,FOLLOW_MethodCall_in_methodCall891); 
            MethodCall91_tree = (CommonTree)adaptor.dupNode(MethodCall91);

            root_1 = (CommonTree)adaptor.becomeRoot(MethodCall91_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_var_in_methodCall893);
            var92=var();

            state._fsp--;

            adaptor.addChild(root_1, var92.getTree());
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FunctionCall93=(CommonTree)match(input,FunctionCall,FOLLOW_FunctionCall_in_methodCall896); 
            FunctionCall93_tree = (CommonTree)adaptor.dupNode(FunctionCall93);

            root_2 = (CommonTree)adaptor.becomeRoot(FunctionCall93_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            i1=(CommonTree)match(input,Id,FOLLOW_Id_in_methodCall900); 
            i1_tree = (CommonTree)adaptor.dupNode(i1);

            adaptor.addChild(root_2, i1_tree);

            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:199:43: (e1= expressionList )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ExpressionList) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:199:43: e1= expressionList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expressionList_in_methodCall904);
                    e1=expressionList();

                    state._fsp--;

                    adaptor.addChild(root_2, e1.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            retval.treeNode = new MethodCallNode(i1.toString(), (var92!=null?var92.treeNode:null), (e1!=null?e1.treeNode:null));
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:200:2: ( ^( FunctionCall i2= Id (e2= expressionList )? ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==FunctionCall) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:200:3: ^( FunctionCall i2= Id (e2= expressionList )? )
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    {
            	    CommonTree _save_last_2 = _last;
            	    CommonTree _first_2 = null;
            	    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            	    FunctionCall94=(CommonTree)match(input,FunctionCall,FOLLOW_FunctionCall_in_methodCall914); 
            	    FunctionCall94_tree = (CommonTree)adaptor.dupNode(FunctionCall94);

            	    root_2 = (CommonTree)adaptor.becomeRoot(FunctionCall94_tree, root_2);



            	    match(input, Token.DOWN, null); 
            	    _last = (CommonTree)input.LT(1);
            	    i2=(CommonTree)match(input,Id,FOLLOW_Id_in_methodCall918); 
            	    i2_tree = (CommonTree)adaptor.dupNode(i2);

            	    adaptor.addChild(root_2, i2_tree);

            	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:200:26: (e2= expressionList )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==ExpressionList) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:200:26: e2= expressionList
            	            {
            	            _last = (CommonTree)input.LT(1);
            	            pushFollow(FOLLOW_expressionList_in_methodCall922);
            	            e2=expressionList();

            	            state._fsp--;

            	            adaptor.addChild(root_2, e2.getTree());

            	            }
            	            break;

            	    }


            	    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            	    }

            	    retval.treeNode = new MethodCallNode(i2.toString(), retval.treeNode, (e2!=null?e2.treeNode:null));

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodCall"

    public static class propertyCall_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyCall"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:203:1: propertyCall returns [LangNode treeNode] : ^( PropertyCall var Id ) ;
    public final langAstTreeWalker.propertyCall_return propertyCall() throws RecognitionException {
        langAstTreeWalker.propertyCall_return retval = new langAstTreeWalker.propertyCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PropertyCall95=null;
        CommonTree Id97=null;
        langAstTreeWalker.var_return var96 = null;


        CommonTree PropertyCall95_tree=null;
        CommonTree Id97_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:207:2: ( ^( PropertyCall var Id ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:207:3: ^( PropertyCall var Id )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PropertyCall95=(CommonTree)match(input,PropertyCall,FOLLOW_PropertyCall_in_propertyCall952); 
            PropertyCall95_tree = (CommonTree)adaptor.dupNode(PropertyCall95);

            root_1 = (CommonTree)adaptor.becomeRoot(PropertyCall95_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_var_in_propertyCall954);
            var96=var();

            state._fsp--;

            adaptor.addChild(root_1, var96.getTree());
            _last = (CommonTree)input.LT(1);
            Id97=(CommonTree)match(input,Id,FOLLOW_Id_in_propertyCall956); 
            Id97_tree = (CommonTree)adaptor.dupNode(Id97);

            adaptor.addChild(root_1, Id97_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.treeNode = new PropertyCallNode((var96!=null?var96.treeNode:null), Id97.toString());

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "propertyCall"

    public static class variable_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:210:1: variable returns [LangNode treeNode] : Id ;
    public final langAstTreeWalker.variable_return variable() throws RecognitionException {
        langAstTreeWalker.variable_return retval = new langAstTreeWalker.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Id98=null;

        CommonTree Id98_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:214:2: ( Id )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:214:3: Id
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            Id98=(CommonTree)match(input,Id,FOLLOW_Id_in_variable978); 
            Id98_tree = (CommonTree)adaptor.dupNode(Id98);

            adaptor.addChild(root_0, Id98_tree);

            retval.treeNode = new VarNode(Id98.toString(), currentScope);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class list_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:217:1: list returns [LangNode treeNode] : ^( ListDeclaration ( expressionList )? ) ;
    public final langAstTreeWalker.list_return list() throws RecognitionException {
        langAstTreeWalker.list_return retval = new langAstTreeWalker.list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ListDeclaration99=null;
        langAstTreeWalker.expressionList_return expressionList100 = null;


        CommonTree ListDeclaration99_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:221:2: ( ^( ListDeclaration ( expressionList )? ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:221:3: ^( ListDeclaration ( expressionList )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ListDeclaration99=(CommonTree)match(input,ListDeclaration,FOLLOW_ListDeclaration_in_list999); 
            ListDeclaration99_tree = (CommonTree)adaptor.dupNode(ListDeclaration99);

            root_1 = (CommonTree)adaptor.becomeRoot(ListDeclaration99_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:221:21: ( expressionList )?
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ExpressionList) ) {
                    alt14=1;
                }
                switch (alt14) {
                    case 1 :
                        // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:221:21: expressionList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_expressionList_in_list1001);
                        expressionList100=expressionList();

                        state._fsp--;

                        adaptor.addChild(root_1, expressionList100.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            retval.treeNode = new ListNode((expressionList100!=null?expressionList100.treeNode:null));

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class var_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:224:1: var returns [LangNode treeNode] : ( lookup | lookupable | propertyCall );
    public final langAstTreeWalker.var_return var() throws RecognitionException {
        langAstTreeWalker.var_return retval = new langAstTreeWalker.var_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        langAstTreeWalker.lookup_return lookup101 = null;

        langAstTreeWalker.lookupable_return lookupable102 = null;

        langAstTreeWalker.propertyCall_return propertyCall103 = null;



        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:225:2: ( lookup | lookupable | propertyCall )
            int alt15=3;
            switch ( input.LA(1) ) {
            case Lookup:
                {
                alt15=1;
                }
                break;
            case Id:
            case String:
                {
                alt15=2;
                }
                break;
            case PropertyCall:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:225:3: lookup
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_lookup_in_var1019);
                    lookup101=lookup();

                    state._fsp--;

                    adaptor.addChild(root_0, lookup101.getTree());
                    retval.treeNode = (lookup101!=null?lookup101.treeNode:null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:226:3: lookupable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_lookupable_in_var1025);
                    lookupable102=lookupable();

                    state._fsp--;

                    adaptor.addChild(root_0, lookupable102.getTree());
                    retval.treeNode = (lookupable102!=null?lookupable102.treeNode:null);

                    }
                    break;
                case 3 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:227:3: propertyCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_propertyCall_in_var1031);
                    propertyCall103=propertyCall();

                    state._fsp--;

                    adaptor.addChild(root_0, propertyCall103.getTree());
                    retval.treeNode = (propertyCall103!=null?propertyCall103.treeNode:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var"

    public static class lookup_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookup"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:230:1: lookup returns [LangNode treeNode] : ^( Lookup lookupable ^( Indexes ( index )+ ) ) ;
    public final langAstTreeWalker.lookup_return lookup() throws RecognitionException {
        langAstTreeWalker.lookup_return retval = new langAstTreeWalker.lookup_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree Lookup104=null;
        CommonTree Indexes106=null;
        langAstTreeWalker.lookupable_return lookupable105 = null;

        langAstTreeWalker.index_return index107 = null;


        CommonTree Lookup104_tree=null;
        CommonTree Indexes106_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:234:2: ( ^( Lookup lookupable ^( Indexes ( index )+ ) ) )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:234:3: ^( Lookup lookupable ^( Indexes ( index )+ ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Lookup104=(CommonTree)match(input,Lookup,FOLLOW_Lookup_in_lookup1051); 
            Lookup104_tree = (CommonTree)adaptor.dupNode(Lookup104);

            root_1 = (CommonTree)adaptor.becomeRoot(Lookup104_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_lookupable_in_lookup1053);
            lookupable105=lookupable();

            state._fsp--;

            adaptor.addChild(root_1, lookupable105.getTree());
            retval.treeNode = (lookupable105!=null?lookupable105.treeNode:null);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            Indexes106=(CommonTree)match(input,Indexes,FOLLOW_Indexes_in_lookup1058); 
            Indexes106_tree = (CommonTree)adaptor.dupNode(Indexes106);

            root_2 = (CommonTree)adaptor.becomeRoot(Indexes106_tree, root_2);



            match(input, Token.DOWN, null); 
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:234:69: ( index )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ListDeclaration||(LA16_0>=FunctionCall && LA16_0<=Lookup)||(LA16_0>=UnaryMinus && LA16_0<=UnaryNegation)||(LA16_0>=MethodCall && LA16_0<=PropertyCall)||LA16_0==Id||(LA16_0>=Int && LA16_0<=String)||(LA16_0>=59 && LA16_0<=72)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:234:70: index
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_index_in_lookup1061);
            	    index107=index();

            	    state._fsp--;

            	    adaptor.addChild(root_2, index107.getTree());
            	    retval.treeNode = new LookupNode(retval.treeNode, (index107!=null?index107.treeNode:null));

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lookup"

    public static class lookupable_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookupable"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:237:1: lookupable returns [LangNode treeNode] : ( variable | String );
    public final langAstTreeWalker.lookupable_return lookupable() throws RecognitionException {
        langAstTreeWalker.lookupable_return retval = new langAstTreeWalker.lookupable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree String109=null;
        langAstTreeWalker.variable_return variable108 = null;


        CommonTree String109_tree=null;

        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:242:2: ( variable | String )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Id) ) {
                alt17=1;
            }
            else if ( (LA17_0==String) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:242:3: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variable_in_lookupable1087);
                    variable108=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable108.getTree());
                    retval.treeNode = (variable108!=null?variable108.treeNode:null);

                    }
                    break;
                case 2 :
                    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:243:3: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    String109=(CommonTree)match(input,String,FOLLOW_String_in_lookupable1093); 
                    String109_tree = (CommonTree)adaptor.dupNode(String109);

                    adaptor.addChild(root_0, String109_tree);

                    retval.treeNode = new AtomNode(String109.toString().substring(1, String109.toString().length()-1));

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lookupable"

    public static class index_return extends TreeRuleReturnScope {
        public LangNode treeNode;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "index"
    // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:246:1: index returns [LangNode treeNode] : expression ;
    public final langAstTreeWalker.index_return index() throws RecognitionException {
        langAstTreeWalker.index_return retval = new langAstTreeWalker.index_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        langAstTreeWalker.expression_return expression110 = null;



        try {
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:250:2: ( expression )
            // C:\\Users\\sfcpr_000\\Desktop\\langAstTreeWalker.g:250:3: expression
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_index1112);
            expression110=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression110.getTree());
            retval.treeNode = (expression110!=null?expression110.treeNode:null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


            retval.treeNode.setLine(((CommonTree)retval.start).getLine());

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "index"

    // Delegated rules


 

    public static final BitSet FOLLOW_Root_in_root48 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_codeBlock_in_root50 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IdList_in_idList72 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_idList75 = new BitSet(new long[]{0x0000000020000008L});
    public static final BitSet FOLLOW_CodeBlock_in_codeBlock103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_codeBlock110 = new BitSet(new long[]{0x07E00000056E1008L,0x0000000000001000L});
    public static final BitSet FOLLOW_assignment_in_statement143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCall_in_statement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_untilStatement_in_statement179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_assignment208 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_assignment210 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_assignment212 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_assignment220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_assignment222 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_assignment224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_76_in_assignment230 = new BitSet(new long[]{0x0000001028002008L});
    public static final BitSet FOLLOW_var_in_assignment233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_assignment238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_assignment240 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_assignment242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_assignment249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_assignment251 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_assignment253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_assignment260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_assignment262 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_assignment264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_58_in_assignment271 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_assignment273 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_assignment275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MultiplyAssignment_in_assignment283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_assignment285 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_MultiplyAssignmentLeft_in_assignment293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_assignment296 = new BitSet(new long[]{0x0000001028002008L});
    public static final BitSet FOLLOW_WhileStatement_in_whileStatement324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Expression_in_whileStatement327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileStatement329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeBlock_in_whileStatement332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UntilStatement_in_untilStatement354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Expression_in_untilStatement357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_untilStatement359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeBlock_in_untilStatement362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IfStatement_in_ifStatement385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Expression_in_ifStatement388 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeBlock_in_ifStatement393 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement395 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeBlock_in_elseStatement418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ForStatement_in_forStatement443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_InStatement_in_forStatement446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_forStatement448 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_forStatement450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_codeBlock_in_forStatement453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ReturnStatement_in_returnStatement477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_returnStatement479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ExpressionList_in_expressionList502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expressionList505 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_60_in_expression530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression534 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_61_in_expression546 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression550 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_expression562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression566 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_63_in_expression579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression583 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_64_in_expression598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression602 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression606 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_expression612 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression616 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expression626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression630 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_expression643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression647 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_68_in_expression659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression663 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression667 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_69_in_expression677 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression681 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_70_in_expression696 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression700 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_71_in_expression714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression718 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression722 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_72_in_expression732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression736 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_59_in_expression750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression754 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_expression_in_expression758 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UnaryMinus_in_expression768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expression770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UnaryNegation_in_expression777 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_atom_in_expression779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_atom_in_expression786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Int_in_atom806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Float_in_atom812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_atom817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_atom823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_atom829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_atom835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCall_in_atom841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FunctionCall_in_functionCall863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Id_in_functionCall865 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_expressionList_in_functionCall867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MethodCall_in_methodCall891 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_methodCall893 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_FunctionCall_in_methodCall896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Id_in_methodCall900 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_expressionList_in_methodCall904 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FunctionCall_in_methodCall914 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Id_in_methodCall918 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_expressionList_in_methodCall922 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PropertyCall_in_propertyCall952 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_var_in_propertyCall954 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_Id_in_propertyCall956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_Id_in_variable978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ListDeclaration_in_list999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expressionList_in_list1001 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_lookup_in_var1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookupable_in_var1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_var1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Lookup_in_lookup1051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_lookupable_in_lookup1053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Indexes_in_lookup1058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_index_in_lookup1061 = new BitSet(new long[]{0xF800001E2C01B208L,0x00000000000001FFL});
    public static final BitSet FOLLOW_variable_in_lookupable1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_lookupable1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_index1112 = new BitSet(new long[]{0x0000000000000002L});

}
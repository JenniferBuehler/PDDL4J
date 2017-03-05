// $ANTLR 3.5.2 Pddl.g 2017-03-04 18:11:45
package PDDL4J.antlr_gen;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/**
 * PDDL grammar for ANTLR v3
 * Zeyn Saigol
 * School of Computer Science
 * University of Birmingham
 *
 * $Id: Pddl.g 120 2008-10-02 14:59:50Z zas $
 */
@SuppressWarnings("all")
public class PddlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND_EFFECT", "AND_EXP", 
		"ANY_CHAR", "ASSIGN_EFFECT", "BINARY_OP", "COMPARISON_EXP", "CONDITION", 
		"CONSTANTS", "CONTINUOUS_EXP", "DIGIT", "DOMAIN", "DOMAIN_NAME", "DURATION", 
		"DURATIVE_ACTION", "DUR_CONSTRAINTS", "DUR_INDEFINITE", "DUR_VALUE", "EFFECT", 
		"EITHER_TYPE", "EXISTS_EXP", "EXP_NAME", "FEXP", "FORALL_EXP", "FUNCTIONS", 
		"FUNC_HEAD", "FUNC_LIST", "FUNC_SKEL", "FUNC_TYPE", "GOAL", "IMPLY_EXP", 
		"INIT", "INIT_AT", "INIT_EQ", "LETTER", "LINE_COMMENT", "LOGIC_EXP", "MULTIOP_METRIC", 
		"NAME", "NOT_EFFECT", "NOT_EXP", "NOT_PRED_INIT", "NUMBER", "NUMBER_METRIC", 
		"NUMBER_STR", "OBJECTS", "OR_EXP", "PARAMS", "PRECONDITION", "PREDICATES", 
		"PRED_HEAD", "PRED_INST", "PRED_NAME", "PROBLEM", "PROBLEM_CONSTRAINT", 
		"PROBLEM_DOMAIN", "PROBLEM_METRIC", "PROBLEM_NAME", "REQUIREMENTS", "REQUIRE_KEY", 
		"TIMED_EFFECT", "TIMED_EXP", "TIMESTEPVAR", "TIMEVAR", "TIME_METRIC", 
		"TYPES", "UNARY_MINUS", "UNDEFINED", "VARIABLE", "VARS", "VIOLATED_METRIC", 
		"WHEN_EXP", "WHITESPACE", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "':action'", 
		"':condition'", "':constants'", "':constraints'", "':derived'", "':domain'", 
		"':duration'", "':durative-action'", "':effect'", "':functions'", "':goal'", 
		"':init'", "':metric'", "':objects'", "':parameters'", "':precondition'", 
		"':predicates'", "':requirements'", "':types'", "':vars'", "'<'", "'<='", 
		"'='", "'>'", "'>='", "'?duration'", "'all'", "'always'", "'always-within'", 
		"'and'", "'assign'", "'at'", "'at-most-once'", "'decrease'", "'define'", 
		"'domain'", "'either'", "'end'", "'exists'", "'forall'", "'hold-after'", 
		"'hold-during'", "'imply'", "'increase'", "'is-violated'", "'maximize'", 
		"'minimize'", "'not'", "'or'", "'over'", "'preference'", "'problem'", 
		"'scale-down'", "'scale-up'", "'sometime'", "'sometime-after'", "'sometime-before'", 
		"'start'", "'total-time'", "'when'", "'within'"
	};
	public static final int EOF=-1;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int T__139=139;
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int ACTION=4;
	public static final int AND_EFFECT=5;
	public static final int AND_EXP=6;
	public static final int ANY_CHAR=7;
	public static final int ASSIGN_EFFECT=8;
	public static final int BINARY_OP=9;
	public static final int COMPARISON_EXP=10;
	public static final int CONDITION=11;
	public static final int CONSTANTS=12;
	public static final int CONTINUOUS_EXP=13;
	public static final int DIGIT=14;
	public static final int DOMAIN=15;
	public static final int DOMAIN_NAME=16;
	public static final int DURATION=17;
	public static final int DURATIVE_ACTION=18;
	public static final int DUR_CONSTRAINTS=19;
	public static final int DUR_INDEFINITE=20;
	public static final int DUR_VALUE=21;
	public static final int EFFECT=22;
	public static final int EITHER_TYPE=23;
	public static final int EXISTS_EXP=24;
	public static final int EXP_NAME=25;
	public static final int FEXP=26;
	public static final int FORALL_EXP=27;
	public static final int FUNCTIONS=28;
	public static final int FUNC_HEAD=29;
	public static final int FUNC_LIST=30;
	public static final int FUNC_SKEL=31;
	public static final int FUNC_TYPE=32;
	public static final int GOAL=33;
	public static final int IMPLY_EXP=34;
	public static final int INIT=35;
	public static final int INIT_AT=36;
	public static final int INIT_EQ=37;
	public static final int LETTER=38;
	public static final int LINE_COMMENT=39;
	public static final int LOGIC_EXP=40;
	public static final int MULTIOP_METRIC=41;
	public static final int NAME=42;
	public static final int NOT_EFFECT=43;
	public static final int NOT_EXP=44;
	public static final int NOT_PRED_INIT=45;
	public static final int NUMBER=46;
	public static final int NUMBER_METRIC=47;
	public static final int NUMBER_STR=48;
	public static final int OBJECTS=49;
	public static final int OR_EXP=50;
	public static final int PARAMS=51;
	public static final int PRECONDITION=52;
	public static final int PREDICATES=53;
	public static final int PRED_HEAD=54;
	public static final int PRED_INST=55;
	public static final int PRED_NAME=56;
	public static final int PROBLEM=57;
	public static final int PROBLEM_CONSTRAINT=58;
	public static final int PROBLEM_DOMAIN=59;
	public static final int PROBLEM_METRIC=60;
	public static final int PROBLEM_NAME=61;
	public static final int REQUIREMENTS=62;
	public static final int REQUIRE_KEY=63;
	public static final int TIMED_EFFECT=64;
	public static final int TIMED_EXP=65;
	public static final int TIMESTEPVAR=66;
	public static final int TIMEVAR=67;
	public static final int TIME_METRIC=68;
	public static final int TYPES=69;
	public static final int UNARY_MINUS=70;
	public static final int UNDEFINED=71;
	public static final int VARIABLE=72;
	public static final int VARS=73;
	public static final int VIOLATED_METRIC=74;
	public static final int WHEN_EXP=75;
	public static final int WHITESPACE=76;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PddlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PddlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PddlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Pddl.g"; }


	private boolean wasError = false;
	public void reportError(RecognitionException e) {
		wasError = true;
		super.reportError(e);
	}
	public boolean invalidGrammar() {
		return wasError;
	}


	public static class pddlDoc_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pddlDoc"
	// Pddl.g:107:1: pddlDoc : ( domain | problem );
	public final PddlParser.pddlDoc_return pddlDoc() throws RecognitionException {
		PddlParser.pddlDoc_return retval = new PddlParser.pddlDoc_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope domain1 =null;
		ParserRuleReturnScope problem2 =null;


		try {
			// Pddl.g:107:9: ( domain | problem )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==77) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==117) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==77) ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3==118) ) {
							alt1=1;
						}
						else if ( (LA1_3==134) ) {
							alt1=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Pddl.g:107:11: domain
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_domain_in_pddlDoc505);
					domain1=domain();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, domain1.getTree());

					}
					break;
				case 2 :
					// Pddl.g:107:20: problem
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_problem_in_pddlDoc509);
					problem2=problem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, problem2.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pddlDoc"


	public static class domain_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "domain"
	// Pddl.g:111:1: domain : '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) ;
	public final PddlParser.domain_return domain() throws RecognitionException {
		PddlParser.domain_return retval = new PddlParser.domain_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal3=null;
		Token string_literal4=null;
		Token char_literal13=null;
		ParserRuleReturnScope domainName5 =null;
		ParserRuleReturnScope requireDef6 =null;
		ParserRuleReturnScope typesDef7 =null;
		ParserRuleReturnScope constantsDef8 =null;
		ParserRuleReturnScope predicatesDef9 =null;
		ParserRuleReturnScope functionsDef10 =null;
		ParserRuleReturnScope constraints11 =null;
		ParserRuleReturnScope structureDef12 =null;

		Object char_literal3_tree=null;
		Object string_literal4_tree=null;
		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleSubtreeStream stream_typesDef=new RewriteRuleSubtreeStream(adaptor,"rule typesDef");
		RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
		RewriteRuleSubtreeStream stream_domainName=new RewriteRuleSubtreeStream(adaptor,"rule domainName");
		RewriteRuleSubtreeStream stream_predicatesDef=new RewriteRuleSubtreeStream(adaptor,"rule predicatesDef");
		RewriteRuleSubtreeStream stream_constantsDef=new RewriteRuleSubtreeStream(adaptor,"rule constantsDef");
		RewriteRuleSubtreeStream stream_functionsDef=new RewriteRuleSubtreeStream(adaptor,"rule functionsDef");
		RewriteRuleSubtreeStream stream_constraints=new RewriteRuleSubtreeStream(adaptor,"rule constraints");
		RewriteRuleSubtreeStream stream_structureDef=new RewriteRuleSubtreeStream(adaptor,"rule structureDef");

		try {
			// Pddl.g:112:5: ( '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')' -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ) )
			// Pddl.g:112:7: '(' 'define' domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* ')'
			{
			char_literal3=(Token)match(input,77,FOLLOW_77_in_domain524); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal3);

			string_literal4=(Token)match(input,117,FOLLOW_117_in_domain526); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_117.add(string_literal4);

			pushFollow(FOLLOW_domainName_in_domain528);
			domainName5=domainName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_domainName.add(domainName5.getTree());
			// Pddl.g:113:7: ( requireDef )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==77) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==100) ) {
					alt2=1;
				}
			}
			switch (alt2) {
				case 1 :
					// Pddl.g:113:7: requireDef
					{
					pushFollow(FOLLOW_requireDef_in_domain536);
					requireDef6=requireDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_requireDef.add(requireDef6.getTree());
					}
					break;

			}

			// Pddl.g:114:7: ( typesDef )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==77) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==101) ) {
					alt3=1;
				}
			}
			switch (alt3) {
				case 1 :
					// Pddl.g:114:7: typesDef
					{
					pushFollow(FOLLOW_typesDef_in_domain545);
					typesDef7=typesDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typesDef.add(typesDef7.getTree());
					}
					break;

			}

			// Pddl.g:115:7: ( constantsDef )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==77) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==85) ) {
					alt4=1;
				}
			}
			switch (alt4) {
				case 1 :
					// Pddl.g:115:7: constantsDef
					{
					pushFollow(FOLLOW_constantsDef_in_domain554);
					constantsDef8=constantsDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constantsDef.add(constantsDef8.getTree());
					}
					break;

			}

			// Pddl.g:116:7: ( predicatesDef )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==77) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==99) ) {
					alt5=1;
				}
			}
			switch (alt5) {
				case 1 :
					// Pddl.g:116:7: predicatesDef
					{
					pushFollow(FOLLOW_predicatesDef_in_domain563);
					predicatesDef9=predicatesDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicatesDef.add(predicatesDef9.getTree());
					}
					break;

			}

			// Pddl.g:117:7: ( functionsDef )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==77) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==92) ) {
					alt6=1;
				}
			}
			switch (alt6) {
				case 1 :
					// Pddl.g:117:7: functionsDef
					{
					pushFollow(FOLLOW_functionsDef_in_domain572);
					functionsDef10=functionsDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionsDef.add(functionsDef10.getTree());
					}
					break;

			}

			// Pddl.g:118:7: ( constraints )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==77) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==86) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// Pddl.g:118:7: constraints
					{
					pushFollow(FOLLOW_constraints_in_domain581);
					constraints11=constraints();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constraints.add(constraints11.getTree());
					}
					break;

			}

			// Pddl.g:119:7: ( structureDef )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==77) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Pddl.g:119:7: structureDef
					{
					pushFollow(FOLLOW_structureDef_in_domain590);
					structureDef12=structureDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_structureDef.add(structureDef12.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			char_literal13=(Token)match(input,78,FOLLOW_78_in_domain599); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal13);

			// AST REWRITE
			// elements: structureDef, constantsDef, domainName, typesDef, constraints, functionsDef, predicatesDef, requireDef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:7: -> ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
			{
				// Pddl.g:121:10: ^( DOMAIN domainName ( requireDef )? ( typesDef )? ( constantsDef )? ( predicatesDef )? ( functionsDef )? ( constraints )? ( structureDef )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN, "DOMAIN"), root_1);
				adaptor.addChild(root_1, stream_domainName.nextTree());
				// Pddl.g:121:30: ( requireDef )?
				if ( stream_requireDef.hasNext() ) {
					adaptor.addChild(root_1, stream_requireDef.nextTree());
				}
				stream_requireDef.reset();

				// Pddl.g:121:42: ( typesDef )?
				if ( stream_typesDef.hasNext() ) {
					adaptor.addChild(root_1, stream_typesDef.nextTree());
				}
				stream_typesDef.reset();

				// Pddl.g:122:17: ( constantsDef )?
				if ( stream_constantsDef.hasNext() ) {
					adaptor.addChild(root_1, stream_constantsDef.nextTree());
				}
				stream_constantsDef.reset();

				// Pddl.g:122:31: ( predicatesDef )?
				if ( stream_predicatesDef.hasNext() ) {
					adaptor.addChild(root_1, stream_predicatesDef.nextTree());
				}
				stream_predicatesDef.reset();

				// Pddl.g:122:46: ( functionsDef )?
				if ( stream_functionsDef.hasNext() ) {
					adaptor.addChild(root_1, stream_functionsDef.nextTree());
				}
				stream_functionsDef.reset();

				// Pddl.g:123:17: ( constraints )?
				if ( stream_constraints.hasNext() ) {
					adaptor.addChild(root_1, stream_constraints.nextTree());
				}
				stream_constraints.reset();

				// Pddl.g:123:30: ( structureDef )*
				while ( stream_structureDef.hasNext() ) {
					adaptor.addChild(root_1, stream_structureDef.nextTree());
				}
				stream_structureDef.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "domain"


	public static class domainName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "domainName"
	// Pddl.g:126:1: domainName : '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) ;
	public final PddlParser.domainName_return domainName() throws RecognitionException {
		PddlParser.domainName_return retval = new PddlParser.domainName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal14=null;
		Token string_literal15=null;
		Token NAME16=null;
		Token char_literal17=null;

		Object char_literal14_tree=null;
		Object string_literal15_tree=null;
		Object NAME16_tree=null;
		Object char_literal17_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			// Pddl.g:127:5: ( '(' 'domain' NAME ')' -> ^( DOMAIN_NAME NAME ) )
			// Pddl.g:127:7: '(' 'domain' NAME ')'
			{
			char_literal14=(Token)match(input,77,FOLLOW_77_in_domainName683); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal14);

			string_literal15=(Token)match(input,118,FOLLOW_118_in_domainName685); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_118.add(string_literal15);

			NAME16=(Token)match(input,NAME,FOLLOW_NAME_in_domainName687); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME16);

			char_literal17=(Token)match(input,78,FOLLOW_78_in_domainName689); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal17);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 128:6: -> ^( DOMAIN_NAME NAME )
			{
				// Pddl.g:128:9: ^( DOMAIN_NAME NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOMAIN_NAME, "DOMAIN_NAME"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "domainName"


	public static class requireDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "requireDef"
	// Pddl.g:131:1: requireDef : '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) ;
	public final PddlParser.requireDef_return requireDef() throws RecognitionException {
		PddlParser.requireDef_return retval = new PddlParser.requireDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal18=null;
		Token string_literal19=null;
		Token REQUIRE_KEY20=null;
		Token char_literal21=null;

		Object char_literal18_tree=null;
		Object string_literal19_tree=null;
		Object REQUIRE_KEY20_tree=null;
		Object char_literal21_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_REQUIRE_KEY=new RewriteRuleTokenStream(adaptor,"token REQUIRE_KEY");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");

		try {
			// Pddl.g:132:2: ( '(' ':requirements' ( REQUIRE_KEY )+ ')' -> ^( REQUIREMENTS ( REQUIRE_KEY )+ ) )
			// Pddl.g:132:4: '(' ':requirements' ( REQUIRE_KEY )+ ')'
			{
			char_literal18=(Token)match(input,77,FOLLOW_77_in_requireDef716); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal18);

			string_literal19=(Token)match(input,100,FOLLOW_100_in_requireDef718); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_100.add(string_literal19);

			// Pddl.g:132:24: ( REQUIRE_KEY )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==REQUIRE_KEY) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Pddl.g:132:24: REQUIRE_KEY
					{
					REQUIRE_KEY20=(Token)match(input,REQUIRE_KEY,FOLLOW_REQUIRE_KEY_in_requireDef720); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REQUIRE_KEY.add(REQUIRE_KEY20);

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			char_literal21=(Token)match(input,78,FOLLOW_78_in_requireDef723); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal21);

			// AST REWRITE
			// elements: REQUIRE_KEY
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 133:2: -> ^( REQUIREMENTS ( REQUIRE_KEY )+ )
			{
				// Pddl.g:133:5: ^( REQUIREMENTS ( REQUIRE_KEY )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIREMENTS, "REQUIREMENTS"), root_1);
				if ( !(stream_REQUIRE_KEY.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_REQUIRE_KEY.hasNext() ) {
					adaptor.addChild(root_1, stream_REQUIRE_KEY.nextNode());
				}
				stream_REQUIRE_KEY.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "requireDef"


	public static class typesDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typesDef"
	// Pddl.g:136:1: typesDef : '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) ;
	public final PddlParser.typesDef_return typesDef() throws RecognitionException {
		PddlParser.typesDef_return retval = new PddlParser.typesDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal22=null;
		Token string_literal23=null;
		Token char_literal25=null;
		ParserRuleReturnScope typedNameList24 =null;

		Object char_literal22_tree=null;
		Object string_literal23_tree=null;
		Object char_literal25_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// Pddl.g:137:2: ( '(' ':types' typedNameList ')' -> ^( TYPES typedNameList ) )
			// Pddl.g:137:4: '(' ':types' typedNameList ')'
			{
			char_literal22=(Token)match(input,77,FOLLOW_77_in_typesDef744); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal22);

			string_literal23=(Token)match(input,101,FOLLOW_101_in_typesDef746); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_101.add(string_literal23);

			pushFollow(FOLLOW_typedNameList_in_typesDef748);
			typedNameList24=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList24.getTree());
			char_literal25=(Token)match(input,78,FOLLOW_78_in_typesDef750); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal25);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 138:4: -> ^( TYPES typedNameList )
			{
				// Pddl.g:138:7: ^( TYPES typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typesDef"


	public static class typedNameList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedNameList"
	// Pddl.g:142:1: typedNameList : ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) ;
	public final PddlParser.typedNameList_return typedNameList() throws RecognitionException {
		PddlParser.typedNameList_return retval = new PddlParser.typedNameList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME26=null;
		Token NAME28=null;
		ParserRuleReturnScope singleTypeNameList27 =null;

		Object NAME26_tree=null;
		Object NAME28_tree=null;

		try {
			// Pddl.g:143:5: ( ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* ) )
			// Pddl.g:143:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
			{
			root_0 = (Object)adaptor.nil();


			// Pddl.g:143:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )
			int alt13=2;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// Pddl.g:143:8: ( NAME )*
					{
					// Pddl.g:143:8: ( NAME )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==NAME) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// Pddl.g:143:8: NAME
							{
							NAME26=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList777); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME26_tree = (Object)adaptor.create(NAME26);
							adaptor.addChild(root_0, NAME26_tree);
							}

							}
							break;

						default :
							break loop10;
						}
					}

					}
					break;
				case 2 :
					// Pddl.g:143:16: ( singleTypeNameList )+ ( NAME )*
					{
					// Pddl.g:143:16: ( singleTypeNameList )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						alt11 = dfa11.predict(input);
						switch (alt11) {
						case 1 :
							// Pddl.g:143:16: singleTypeNameList
							{
							pushFollow(FOLLOW_singleTypeNameList_in_typedNameList782);
							singleTypeNameList27=singleTypeNameList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeNameList27.getTree());

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// Pddl.g:143:36: ( NAME )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==NAME) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// Pddl.g:143:36: NAME
							{
							NAME28=(Token)match(input,NAME,FOLLOW_NAME_in_typedNameList785); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME28_tree = (Object)adaptor.create(NAME28);
							adaptor.addChild(root_0, NAME28_tree);
							}

							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedNameList"


	public static class singleTypeNameList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleTypeNameList"
	// Pddl.g:146:1: singleTypeNameList : ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ ;
	public final PddlParser.singleTypeNameList_return singleTypeNameList() throws RecognitionException {
		PddlParser.singleTypeNameList_return retval = new PddlParser.singleTypeNameList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME29=null;
		Token char_literal30=null;
		ParserRuleReturnScope t =null;

		Object NAME29_tree=null;
		Object char_literal30_tree=null;
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Pddl.g:147:5: ( ( ( NAME )+ '-' t= type ) -> ( ^( NAME $t) )+ )
			// Pddl.g:147:7: ( ( NAME )+ '-' t= type )
			{
			// Pddl.g:147:7: ( ( NAME )+ '-' t= type )
			// Pddl.g:147:8: ( NAME )+ '-' t= type
			{
			// Pddl.g:147:8: ( NAME )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==NAME) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// Pddl.g:147:8: NAME
					{
					NAME29=(Token)match(input,NAME,FOLLOW_NAME_in_singleTypeNameList805); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(NAME29);

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			char_literal30=(Token)match(input,81,FOLLOW_81_in_singleTypeNameList808); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_81.add(char_literal30);

			pushFollow(FOLLOW_type_in_singleTypeNameList812);
			t=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(t.getTree());
			}

			// AST REWRITE
			// elements: t, NAME
			// token labels: 
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 148:4: -> ( ^( NAME $t) )+
			{
				if ( !(stream_t.hasNext()||stream_NAME.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_t.hasNext()||stream_NAME.hasNext() ) {
					// Pddl.g:148:7: ^( NAME $t)
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_NAME.nextNode(), root_1);
					adaptor.addChild(root_1, stream_t.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_t.reset();
				stream_NAME.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleTypeNameList"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Pddl.g:151:1: type : ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType );
	public final PddlParser.type_return type() throws RecognitionException {
		PddlParser.type_return retval = new PddlParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31=null;
		Token string_literal32=null;
		Token char_literal34=null;
		ParserRuleReturnScope primType33 =null;
		ParserRuleReturnScope primType35 =null;

		Object char_literal31_tree=null;
		Object string_literal32_tree=null;
		Object char_literal34_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
		RewriteRuleSubtreeStream stream_primType=new RewriteRuleSubtreeStream(adaptor,"rule primType");

		try {
			// Pddl.g:152:2: ( ( '(' 'either' ( primType )+ ')' ) -> ^( EITHER_TYPE ( primType )+ ) | primType )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==77) ) {
				alt16=1;
			}
			else if ( (LA16_0==NAME||LA16_0==NUMBER_STR) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Pddl.g:152:4: ( '(' 'either' ( primType )+ ')' )
					{
					// Pddl.g:152:4: ( '(' 'either' ( primType )+ ')' )
					// Pddl.g:152:6: '(' 'either' ( primType )+ ')'
					{
					char_literal31=(Token)match(input,77,FOLLOW_77_in_type839); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal31);

					string_literal32=(Token)match(input,119,FOLLOW_119_in_type841); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_119.add(string_literal32);

					// Pddl.g:152:19: ( primType )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==NAME||LA15_0==NUMBER_STR) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// Pddl.g:152:19: primType
							{
							pushFollow(FOLLOW_primType_in_type843);
							primType33=primType();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_primType.add(primType33.getTree());
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					char_literal34=(Token)match(input,78,FOLLOW_78_in_type846); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal34);

					}

					// AST REWRITE
					// elements: primType
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 153:4: -> ^( EITHER_TYPE ( primType )+ )
					{
						// Pddl.g:153:7: ^( EITHER_TYPE ( primType )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EITHER_TYPE, "EITHER_TYPE"), root_1);
						if ( !(stream_primType.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_primType.hasNext() ) {
							adaptor.addChild(root_1, stream_primType.nextTree());
						}
						stream_primType.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:154:4: primType
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_primType_in_type865);
					primType35=primType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, primType35.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class primType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primType"
	// Pddl.g:157:1: primType : ( NUMBER_STR | NAME );
	public final PddlParser.primType_return primType() throws RecognitionException {
		PddlParser.primType_return retval = new PddlParser.primType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set36=null;

		Object set36_tree=null;

		try {
			// Pddl.g:157:10: ( NUMBER_STR | NAME )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set36=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==NUMBER_STR ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set36));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primType"


	public static class functionsDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionsDef"
	// Pddl.g:159:1: functionsDef : '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) ;
	public final PddlParser.functionsDef_return functionsDef() throws RecognitionException {
		PddlParser.functionsDef_return retval = new PddlParser.functionsDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal37=null;
		Token string_literal38=null;
		Token char_literal40=null;
		ParserRuleReturnScope functionList39 =null;

		Object char_literal37_tree=null;
		Object string_literal38_tree=null;
		Object char_literal40_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_functionList=new RewriteRuleSubtreeStream(adaptor,"rule functionList");

		try {
			// Pddl.g:160:2: ( '(' ':functions' functionList ')' -> ^( FUNCTIONS functionList ) )
			// Pddl.g:160:4: '(' ':functions' functionList ')'
			{
			char_literal37=(Token)match(input,77,FOLLOW_77_in_functionsDef888); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal37);

			string_literal38=(Token)match(input,92,FOLLOW_92_in_functionsDef890); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(string_literal38);

			pushFollow(FOLLOW_functionList_in_functionsDef892);
			functionList39=functionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionList.add(functionList39.getTree());
			char_literal40=(Token)match(input,78,FOLLOW_78_in_functionsDef894); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal40);

			// AST REWRITE
			// elements: functionList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 161:2: -> ^( FUNCTIONS functionList )
			{
				// Pddl.g:161:5: ^( FUNCTIONS functionList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONS, "FUNCTIONS"), root_1);
				adaptor.addChild(root_1, stream_functionList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionsDef"


	public static class functionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionList"
	// Pddl.g:171:1: functionList : ( ( typedFunctionList | untypedFunctionList )+ ) ;
	public final PddlParser.functionList_return functionList() throws RecognitionException {
		PddlParser.functionList_return retval = new PddlParser.functionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope typedFunctionList41 =null;
		ParserRuleReturnScope untypedFunctionList42 =null;


		try {
			// Pddl.g:172:5: ( ( ( typedFunctionList | untypedFunctionList )+ ) )
			// Pddl.g:172:8: ( ( typedFunctionList | untypedFunctionList )+ )
			{
			root_0 = (Object)adaptor.nil();


			// Pddl.g:172:8: ( ( typedFunctionList | untypedFunctionList )+ )
			// Pddl.g:172:10: ( typedFunctionList | untypedFunctionList )+
			{
			// Pddl.g:172:10: ( typedFunctionList | untypedFunctionList )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=3;
				alt17 = dfa17.predict(input);
				switch (alt17) {
				case 1 :
					// Pddl.g:172:11: typedFunctionList
					{
					pushFollow(FOLLOW_typedFunctionList_in_functionList928);
					typedFunctionList41=typedFunctionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedFunctionList41.getTree());

					}
					break;
				case 2 :
					// Pddl.g:172:31: untypedFunctionList
					{
					pushFollow(FOLLOW_untypedFunctionList_in_functionList932);
					untypedFunctionList42=untypedFunctionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, untypedFunctionList42.getTree());

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionList"


	public static class untypedFunctionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "untypedFunctionList"
	// Pddl.g:175:1: untypedFunctionList : ( ( atomicFunctionSkeleton )+ -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ) ) ;
	public final PddlParser.untypedFunctionList_return untypedFunctionList() throws RecognitionException {
		PddlParser.untypedFunctionList_return retval = new PddlParser.untypedFunctionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atomicFunctionSkeleton43 =null;

		RewriteRuleSubtreeStream stream_atomicFunctionSkeleton=new RewriteRuleSubtreeStream(adaptor,"rule atomicFunctionSkeleton");

		try {
			// Pddl.g:176:5: ( ( ( atomicFunctionSkeleton )+ -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ) ) )
			// Pddl.g:176:8: ( ( atomicFunctionSkeleton )+ -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ) )
			{
			// Pddl.g:176:8: ( ( atomicFunctionSkeleton )+ -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ) )
			// Pddl.g:176:9: ( atomicFunctionSkeleton )+
			{
			// Pddl.g:176:9: ( atomicFunctionSkeleton )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==77) ) {
					int LA18_2 = input.LA(2);
					if ( (synpred20_Pddl()) ) {
						alt18=1;
					}

				}

				switch (alt18) {
				case 1 :
					// Pddl.g:176:9: atomicFunctionSkeleton
					{
					pushFollow(FOLLOW_atomicFunctionSkeleton_in_untypedFunctionList955);
					atomicFunctionSkeleton43=atomicFunctionSkeleton();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicFunctionSkeleton.add(atomicFunctionSkeleton43.getTree());
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			// AST REWRITE
			// elements: atomicFunctionSkeleton
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 176:33: -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) )
			{
				// Pddl.g:176:36: ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_LIST, "FUNC_LIST"), root_1);
				// Pddl.g:176:48: ^( FUNC_SKEL ( atomicFunctionSkeleton )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_SKEL, "FUNC_SKEL"), root_2);
				if ( !(stream_atomicFunctionSkeleton.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_atomicFunctionSkeleton.hasNext() ) {
					adaptor.addChild(root_2, stream_atomicFunctionSkeleton.nextTree());
				}
				stream_atomicFunctionSkeleton.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "untypedFunctionList"


	public static class typedFunctionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedFunctionList"
	// Pddl.g:181:1: typedFunctionList : ( ( atomicFunctionSkeleton )+ '-' functionType ) -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ^( FUNC_TYPE functionType ) ) ;
	public final PddlParser.typedFunctionList_return typedFunctionList() throws RecognitionException {
		PddlParser.typedFunctionList_return retval = new PddlParser.typedFunctionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal45=null;
		ParserRuleReturnScope atomicFunctionSkeleton44 =null;
		ParserRuleReturnScope functionType46 =null;

		Object char_literal45_tree=null;
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_functionType=new RewriteRuleSubtreeStream(adaptor,"rule functionType");
		RewriteRuleSubtreeStream stream_atomicFunctionSkeleton=new RewriteRuleSubtreeStream(adaptor,"rule atomicFunctionSkeleton");

		try {
			// Pddl.g:182:5: ( ( ( atomicFunctionSkeleton )+ '-' functionType ) -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ^( FUNC_TYPE functionType ) ) )
			// Pddl.g:182:7: ( ( atomicFunctionSkeleton )+ '-' functionType )
			{
			// Pddl.g:182:7: ( ( atomicFunctionSkeleton )+ '-' functionType )
			// Pddl.g:182:8: ( atomicFunctionSkeleton )+ '-' functionType
			{
			// Pddl.g:182:8: ( atomicFunctionSkeleton )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==77) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// Pddl.g:182:8: atomicFunctionSkeleton
					{
					pushFollow(FOLLOW_atomicFunctionSkeleton_in_typedFunctionList997);
					atomicFunctionSkeleton44=atomicFunctionSkeleton();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicFunctionSkeleton.add(atomicFunctionSkeleton44.getTree());
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			char_literal45=(Token)match(input,81,FOLLOW_81_in_typedFunctionList1000); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_81.add(char_literal45);

			pushFollow(FOLLOW_functionType_in_typedFunctionList1002);
			functionType46=functionType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_functionType.add(functionType46.getTree());
			}

			// AST REWRITE
			// elements: atomicFunctionSkeleton, functionType
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 183:4: -> ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ^( FUNC_TYPE functionType ) )
			{
				// Pddl.g:183:7: ^( FUNC_LIST ^( FUNC_SKEL ( atomicFunctionSkeleton )+ ) ^( FUNC_TYPE functionType ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_LIST, "FUNC_LIST"), root_1);
				// Pddl.g:183:19: ^( FUNC_SKEL ( atomicFunctionSkeleton )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_SKEL, "FUNC_SKEL"), root_2);
				if ( !(stream_atomicFunctionSkeleton.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_atomicFunctionSkeleton.hasNext() ) {
					adaptor.addChild(root_2, stream_atomicFunctionSkeleton.nextTree());
				}
				stream_atomicFunctionSkeleton.reset();

				adaptor.addChild(root_1, root_2);
				}

				// Pddl.g:183:56: ^( FUNC_TYPE functionType )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_TYPE, "FUNC_TYPE"), root_2);
				adaptor.addChild(root_2, stream_functionType.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedFunctionList"


	public static class atomicFunctionSkeleton_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicFunctionSkeleton"
	// Pddl.g:197:1: atomicFunctionSkeleton : '(' ! functionSymbol ^ typedVariableList ')' !;
	public final PddlParser.atomicFunctionSkeleton_return atomicFunctionSkeleton() throws RecognitionException {
		PddlParser.atomicFunctionSkeleton_return retval = new PddlParser.atomicFunctionSkeleton_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		Token char_literal50=null;
		ParserRuleReturnScope functionSymbol48 =null;
		ParserRuleReturnScope typedVariableList49 =null;

		Object char_literal47_tree=null;
		Object char_literal50_tree=null;

		try {
			// Pddl.g:198:2: ( '(' ! functionSymbol ^ typedVariableList ')' !)
			// Pddl.g:198:4: '(' ! functionSymbol ^ typedVariableList ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal47=(Token)match(input,77,FOLLOW_77_in_atomicFunctionSkeleton1047); if (state.failed) return retval;
			pushFollow(FOLLOW_functionSymbol_in_atomicFunctionSkeleton1050);
			functionSymbol48=functionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(functionSymbol48.getTree(), root_0);
			pushFollow(FOLLOW_typedVariableList_in_atomicFunctionSkeleton1053);
			typedVariableList49=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList49.getTree());

			char_literal50=(Token)match(input,78,FOLLOW_78_in_atomicFunctionSkeleton1055); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicFunctionSkeleton"


	public static class functionSymbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionSymbol"
	// Pddl.g:201:1: functionSymbol : NAME ;
	public final PddlParser.functionSymbol_return functionSymbol() throws RecognitionException {
		PddlParser.functionSymbol_return retval = new PddlParser.functionSymbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME51=null;

		Object NAME51_tree=null;

		try {
			// Pddl.g:201:16: ( NAME )
			// Pddl.g:201:18: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME51=(Token)match(input,NAME,FOLLOW_NAME_in_functionSymbol1066); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME51_tree = (Object)adaptor.create(NAME51);
			adaptor.addChild(root_0, NAME51_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionSymbol"


	public static class functionType_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionType"
	// Pddl.g:203:1: functionType : ( NUMBER_STR | NAME | type );
	public final PddlParser.functionType_return functionType() throws RecognitionException {
		PddlParser.functionType_return retval = new PddlParser.functionType_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER_STR52=null;
		Token NAME53=null;
		ParserRuleReturnScope type54 =null;

		Object NUMBER_STR52_tree=null;
		Object NAME53_tree=null;

		try {
			// Pddl.g:203:14: ( NUMBER_STR | NAME | type )
			int alt20=3;
			switch ( input.LA(1) ) {
			case NUMBER_STR:
				{
				int LA20_1 = input.LA(2);
				if ( (synpred22_Pddl()) ) {
					alt20=1;
				}
				else if ( (true) ) {
					alt20=3;
				}

				}
				break;
			case NAME:
				{
				int LA20_2 = input.LA(2);
				if ( (synpred23_Pddl()) ) {
					alt20=2;
				}
				else if ( (true) ) {
					alt20=3;
				}

				}
				break;
			case 77:
				{
				alt20=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// Pddl.g:203:16: NUMBER_STR
					{
					root_0 = (Object)adaptor.nil();


					NUMBER_STR52=(Token)match(input,NUMBER_STR,FOLLOW_NUMBER_STR_in_functionType1075); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER_STR52_tree = (Object)adaptor.create(NUMBER_STR52);
					adaptor.addChild(root_0, NUMBER_STR52_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:203:29: NAME
					{
					root_0 = (Object)adaptor.nil();


					NAME53=(Token)match(input,NAME,FOLLOW_NAME_in_functionType1079); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NAME53_tree = (Object)adaptor.create(NAME53);
					adaptor.addChild(root_0, NAME53_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:203:36: type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_type_in_functionType1083);
					type54=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type54.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionType"


	public static class constantsDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constantsDef"
	// Pddl.g:205:1: constantsDef : '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) ;
	public final PddlParser.constantsDef_return constantsDef() throws RecognitionException {
		PddlParser.constantsDef_return retval = new PddlParser.constantsDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal55=null;
		Token string_literal56=null;
		Token char_literal58=null;
		ParserRuleReturnScope typedNameList57 =null;

		Object char_literal55_tree=null;
		Object string_literal56_tree=null;
		Object char_literal58_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// Pddl.g:206:2: ( '(' ':constants' typedNameList ')' -> ^( CONSTANTS typedNameList ) )
			// Pddl.g:206:4: '(' ':constants' typedNameList ')'
			{
			char_literal55=(Token)match(input,77,FOLLOW_77_in_constantsDef1093); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal55);

			string_literal56=(Token)match(input,85,FOLLOW_85_in_constantsDef1095); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_85.add(string_literal56);

			pushFollow(FOLLOW_typedNameList_in_constantsDef1097);
			typedNameList57=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList57.getTree());
			char_literal58=(Token)match(input,78,FOLLOW_78_in_constantsDef1099); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal58);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 207:2: -> ^( CONSTANTS typedNameList )
			{
				// Pddl.g:207:5: ^( CONSTANTS typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTANTS, "CONSTANTS"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantsDef"


	public static class predicatesDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicatesDef"
	// Pddl.g:210:1: predicatesDef : '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) ;
	public final PddlParser.predicatesDef_return predicatesDef() throws RecognitionException {
		PddlParser.predicatesDef_return retval = new PddlParser.predicatesDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal59=null;
		Token string_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope atomicFormulaSkeleton61 =null;

		Object char_literal59_tree=null;
		Object string_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_atomicFormulaSkeleton=new RewriteRuleSubtreeStream(adaptor,"rule atomicFormulaSkeleton");

		try {
			// Pddl.g:211:2: ( '(' ':predicates' ( atomicFormulaSkeleton )+ ')' -> ^( PREDICATES ( atomicFormulaSkeleton )+ ) )
			// Pddl.g:211:4: '(' ':predicates' ( atomicFormulaSkeleton )+ ')'
			{
			char_literal59=(Token)match(input,77,FOLLOW_77_in_predicatesDef1119); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal59);

			string_literal60=(Token)match(input,99,FOLLOW_99_in_predicatesDef1121); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_99.add(string_literal60);

			// Pddl.g:211:22: ( atomicFormulaSkeleton )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==77) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// Pddl.g:211:22: atomicFormulaSkeleton
					{
					pushFollow(FOLLOW_atomicFormulaSkeleton_in_predicatesDef1123);
					atomicFormulaSkeleton61=atomicFormulaSkeleton();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicFormulaSkeleton.add(atomicFormulaSkeleton61.getTree());
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			char_literal62=(Token)match(input,78,FOLLOW_78_in_predicatesDef1126); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal62);

			// AST REWRITE
			// elements: atomicFormulaSkeleton
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 212:2: -> ^( PREDICATES ( atomicFormulaSkeleton )+ )
			{
				// Pddl.g:212:5: ^( PREDICATES ( atomicFormulaSkeleton )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREDICATES, "PREDICATES"), root_1);
				if ( !(stream_atomicFormulaSkeleton.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_atomicFormulaSkeleton.hasNext() ) {
					adaptor.addChild(root_1, stream_atomicFormulaSkeleton.nextTree());
				}
				stream_atomicFormulaSkeleton.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicatesDef"


	public static class atomicFormulaSkeleton_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicFormulaSkeleton"
	// Pddl.g:215:1: atomicFormulaSkeleton : '(' ! predicate ^ typedVariableList ')' !;
	public final PddlParser.atomicFormulaSkeleton_return atomicFormulaSkeleton() throws RecognitionException {
		PddlParser.atomicFormulaSkeleton_return retval = new PddlParser.atomicFormulaSkeleton_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal63=null;
		Token char_literal66=null;
		ParserRuleReturnScope predicate64 =null;
		ParserRuleReturnScope typedVariableList65 =null;

		Object char_literal63_tree=null;
		Object char_literal66_tree=null;

		try {
			// Pddl.g:216:2: ( '(' ! predicate ^ typedVariableList ')' !)
			// Pddl.g:216:4: '(' ! predicate ^ typedVariableList ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal63=(Token)match(input,77,FOLLOW_77_in_atomicFormulaSkeleton1147); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_atomicFormulaSkeleton1150);
			predicate64=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(predicate64.getTree(), root_0);
			pushFollow(FOLLOW_typedVariableList_in_atomicFormulaSkeleton1153);
			typedVariableList65=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList65.getTree());

			char_literal66=(Token)match(input,78,FOLLOW_78_in_atomicFormulaSkeleton1155); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicFormulaSkeleton"


	public static class predicate_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// Pddl.g:220:1: predicate : ( NAME | 'at' );
	public final PddlParser.predicate_return predicate() throws RecognitionException {
		PddlParser.predicate_return retval = new PddlParser.predicate_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set67=null;

		Object set67_tree=null;

		try {
			// Pddl.g:220:11: ( NAME | 'at' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set67=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==114 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set67));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class typedVariableList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedVariableList"
	// Pddl.g:223:1: typedVariableList : ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) ;
	public final PddlParser.typedVariableList_return typedVariableList() throws RecognitionException {
		PddlParser.typedVariableList_return retval = new PddlParser.typedVariableList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE68=null;
		Token VARIABLE70=null;
		ParserRuleReturnScope singleTypeVarList69 =null;

		Object VARIABLE68_tree=null;
		Object VARIABLE70_tree=null;

		try {
			// Pddl.g:224:5: ( ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* ) )
			// Pddl.g:224:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
			{
			root_0 = (Object)adaptor.nil();


			// Pddl.g:224:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )
			int alt25=2;
			alt25 = dfa25.predict(input);
			switch (alt25) {
				case 1 :
					// Pddl.g:224:8: ( VARIABLE )*
					{
					// Pddl.g:224:8: ( VARIABLE )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==VARIABLE) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// Pddl.g:224:8: VARIABLE
							{
							VARIABLE68=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList1186); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE68_tree = (Object)adaptor.create(VARIABLE68);
							adaptor.addChild(root_0, VARIABLE68_tree);
							}

							}
							break;

						default :
							break loop22;
						}
					}

					}
					break;
				case 2 :
					// Pddl.g:224:20: ( singleTypeVarList )+ ( VARIABLE )*
					{
					// Pddl.g:224:20: ( singleTypeVarList )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						alt23 = dfa23.predict(input);
						switch (alt23) {
						case 1 :
							// Pddl.g:224:20: singleTypeVarList
							{
							pushFollow(FOLLOW_singleTypeVarList_in_typedVariableList1191);
							singleTypeVarList69=singleTypeVarList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeVarList69.getTree());

							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					// Pddl.g:224:39: ( VARIABLE )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==VARIABLE) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// Pddl.g:224:39: VARIABLE
							{
							VARIABLE70=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_typedVariableList1194); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							VARIABLE70_tree = (Object)adaptor.create(VARIABLE70);
							adaptor.addChild(root_0, VARIABLE70_tree);
							}

							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedVariableList"


	public static class singleTypeVarList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleTypeVarList"
	// Pddl.g:227:1: singleTypeVarList : ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ ;
	public final PddlParser.singleTypeVarList_return singleTypeVarList() throws RecognitionException {
		PddlParser.singleTypeVarList_return retval = new PddlParser.singleTypeVarList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE71=null;
		Token char_literal72=null;
		ParserRuleReturnScope t =null;

		Object VARIABLE71_tree=null;
		Object char_literal72_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Pddl.g:228:5: ( ( ( VARIABLE )+ '-' t= type ) -> ( ^( VARIABLE $t) )+ )
			// Pddl.g:228:7: ( ( VARIABLE )+ '-' t= type )
			{
			// Pddl.g:228:7: ( ( VARIABLE )+ '-' t= type )
			// Pddl.g:228:8: ( VARIABLE )+ '-' t= type
			{
			// Pddl.g:228:8: ( VARIABLE )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==VARIABLE) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// Pddl.g:228:8: VARIABLE
					{
					VARIABLE71=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_singleTypeVarList1214); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE71);

					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			char_literal72=(Token)match(input,81,FOLLOW_81_in_singleTypeVarList1217); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_81.add(char_literal72);

			pushFollow(FOLLOW_type_in_singleTypeVarList1221);
			t=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(t.getTree());
			}

			// AST REWRITE
			// elements: t, VARIABLE
			// token labels: 
			// rule labels: t, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 229:7: -> ( ^( VARIABLE $t) )+
			{
				if ( !(stream_t.hasNext()||stream_VARIABLE.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_t.hasNext()||stream_VARIABLE.hasNext() ) {
					// Pddl.g:229:10: ^( VARIABLE $t)
					{
					Object root_1 = (Object)adaptor.nil();
					root_1 = (Object)adaptor.becomeRoot(stream_VARIABLE.nextNode(), root_1);
					adaptor.addChild(root_1, stream_t.nextTree());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_t.reset();
				stream_VARIABLE.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleTypeVarList"


	public static class constraints_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constraints"
	// Pddl.g:232:1: constraints : '(' ! ':constraints' ^ conGD ')' !;
	public final PddlParser.constraints_return constraints() throws RecognitionException {
		PddlParser.constraints_return retval = new PddlParser.constraints_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal73=null;
		Token string_literal74=null;
		Token char_literal76=null;
		ParserRuleReturnScope conGD75 =null;

		Object char_literal73_tree=null;
		Object string_literal74_tree=null;
		Object char_literal76_tree=null;

		try {
			// Pddl.g:233:2: ( '(' ! ':constraints' ^ conGD ')' !)
			// Pddl.g:233:4: '(' ! ':constraints' ^ conGD ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal73=(Token)match(input,77,FOLLOW_77_in_constraints1252); if (state.failed) return retval;
			string_literal74=(Token)match(input,86,FOLLOW_86_in_constraints1255); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal74_tree = (Object)adaptor.create(string_literal74);
			root_0 = (Object)adaptor.becomeRoot(string_literal74_tree, root_0);
			}

			pushFollow(FOLLOW_conGD_in_constraints1258);
			conGD75=conGD();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD75.getTree());

			char_literal76=(Token)match(input,78,FOLLOW_78_in_constraints1260); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constraints"


	public static class structureDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "structureDef"
	// Pddl.g:236:1: structureDef : ( actionDef | durativeActionDef | derivedDef );
	public final PddlParser.structureDef_return structureDef() throws RecognitionException {
		PddlParser.structureDef_return retval = new PddlParser.structureDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope actionDef77 =null;
		ParserRuleReturnScope durativeActionDef78 =null;
		ParserRuleReturnScope derivedDef79 =null;


		try {
			// Pddl.g:237:2: ( actionDef | durativeActionDef | derivedDef )
			int alt27=3;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==77) ) {
				switch ( input.LA(2) ) {
				case 83:
					{
					alt27=1;
					}
					break;
				case 90:
					{
					alt27=2;
					}
					break;
				case 87:
					{
					alt27=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// Pddl.g:237:4: actionDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_actionDef_in_structureDef1272);
					actionDef77=actionDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, actionDef77.getTree());

					}
					break;
				case 2 :
					// Pddl.g:238:4: durativeActionDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_durativeActionDef_in_structureDef1277);
					durativeActionDef78=durativeActionDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durativeActionDef78.getTree());

					}
					break;
				case 3 :
					// Pddl.g:239:4: derivedDef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_derivedDef_in_structureDef1282);
					derivedDef79=derivedDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedDef79.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structureDef"


	public static class actionDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionDef"
	// Pddl.g:245:1: actionDef : '(' ':action' actionSymbol actionParams actionDefBody ')' -> ^( ACTION actionSymbol actionParams actionDefBody ) ;
	public final PddlParser.actionDef_return actionDef() throws RecognitionException {
		PddlParser.actionDef_return retval = new PddlParser.actionDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal80=null;
		Token string_literal81=null;
		Token char_literal85=null;
		ParserRuleReturnScope actionSymbol82 =null;
		ParserRuleReturnScope actionParams83 =null;
		ParserRuleReturnScope actionDefBody84 =null;

		Object char_literal80_tree=null;
		Object string_literal81_tree=null;
		Object char_literal85_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_actionParams=new RewriteRuleSubtreeStream(adaptor,"rule actionParams");
		RewriteRuleSubtreeStream stream_actionDefBody=new RewriteRuleSubtreeStream(adaptor,"rule actionDefBody");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");

		try {
			// Pddl.g:246:2: ( '(' ':action' actionSymbol actionParams actionDefBody ')' -> ^( ACTION actionSymbol actionParams actionDefBody ) )
			// Pddl.g:246:4: '(' ':action' actionSymbol actionParams actionDefBody ')'
			{
			char_literal80=(Token)match(input,77,FOLLOW_77_in_actionDef1297); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal80);

			string_literal81=(Token)match(input,83,FOLLOW_83_in_actionDef1299); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_83.add(string_literal81);

			pushFollow(FOLLOW_actionSymbol_in_actionDef1301);
			actionSymbol82=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol82.getTree());
			pushFollow(FOLLOW_actionParams_in_actionDef1303);
			actionParams83=actionParams();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionParams.add(actionParams83.getTree());
			pushFollow(FOLLOW_actionDefBody_in_actionDef1305);
			actionDefBody84=actionDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionDefBody.add(actionDefBody84.getTree());
			char_literal85=(Token)match(input,78,FOLLOW_78_in_actionDef1307); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal85);

			// AST REWRITE
			// elements: actionDefBody, actionParams, actionSymbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 247:9: -> ^( ACTION actionSymbol actionParams actionDefBody )
			{
				// Pddl.g:247:12: ^( ACTION actionSymbol actionParams actionDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACTION, "ACTION"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				adaptor.addChild(root_1, stream_actionParams.nextTree());
				adaptor.addChild(root_1, stream_actionDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionDef"


	public static class actionSymbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionSymbol"
	// Pddl.g:250:1: actionSymbol : NAME ;
	public final PddlParser.actionSymbol_return actionSymbol() throws RecognitionException {
		PddlParser.actionSymbol_return retval = new PddlParser.actionSymbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME86=null;

		Object NAME86_tree=null;

		try {
			// Pddl.g:250:14: ( NAME )
			// Pddl.g:250:16: NAME
			{
			root_0 = (Object)adaptor.nil();


			NAME86=(Token)match(input,NAME,FOLLOW_NAME_in_actionSymbol1341); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NAME86_tree = (Object)adaptor.create(NAME86);
			adaptor.addChild(root_0, NAME86_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionSymbol"


	public static class actionParams_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionParams"
	// Pddl.g:252:1: actionParams : ( ':parameters' '(' typedVariableList ')' )? -> ^( PARAMS typedVariableList ) ;
	public final PddlParser.actionParams_return actionParams() throws RecognitionException {
		PddlParser.actionParams_return retval = new PddlParser.actionParams_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope typedVariableList89 =null;

		Object string_literal87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");

		try {
			// Pddl.g:253:2: ( ( ':parameters' '(' typedVariableList ')' )? -> ^( PARAMS typedVariableList ) )
			// Pddl.g:253:4: ( ':parameters' '(' typedVariableList ')' )?
			{
			// Pddl.g:253:4: ( ':parameters' '(' typedVariableList ')' )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==97) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// Pddl.g:253:5: ':parameters' '(' typedVariableList ')'
					{
					string_literal87=(Token)match(input,97,FOLLOW_97_in_actionParams1352); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_97.add(string_literal87);

					char_literal88=(Token)match(input,77,FOLLOW_77_in_actionParams1354); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal88);

					pushFollow(FOLLOW_typedVariableList_in_actionParams1356);
					typedVariableList89=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList89.getTree());
					char_literal90=(Token)match(input,78,FOLLOW_78_in_actionParams1358); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal90);

					}
					break;

			}

			// AST REWRITE
			// elements: typedVariableList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 254:2: -> ^( PARAMS typedVariableList )
			{
				// Pddl.g:254:5: ^( PARAMS typedVariableList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_1);
				adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionParams"


	public static class actionDefBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "actionDefBody"
	// Pddl.g:262:1: actionDefBody : ( ':vars' '(' typedVariableList ')' )? ( ':precondition' ( ( '(' ')' ) | logicExpr ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( logicExpr )? ) ^( EFFECT ( effect )? ) ^( VARS ( typedVariableList )? ) ;
	public final PddlParser.actionDefBody_return actionDefBody() throws RecognitionException {
		PddlParser.actionDefBody_return retval = new PddlParser.actionDefBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal91=null;
		Token char_literal92=null;
		Token char_literal94=null;
		Token string_literal95=null;
		Token char_literal96=null;
		Token char_literal97=null;
		Token string_literal99=null;
		Token char_literal100=null;
		Token char_literal101=null;
		ParserRuleReturnScope typedVariableList93 =null;
		ParserRuleReturnScope logicExpr98 =null;
		ParserRuleReturnScope effect102 =null;

		Object string_literal91_tree=null;
		Object char_literal92_tree=null;
		Object char_literal94_tree=null;
		Object string_literal95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal97_tree=null;
		Object string_literal99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal101_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_logicExpr=new RewriteRuleSubtreeStream(adaptor,"rule logicExpr");
		RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");

		try {
			// Pddl.g:263:2: ( ( ':vars' '(' typedVariableList ')' )? ( ':precondition' ( ( '(' ')' ) | logicExpr ) )? ( ':effect' ( ( '(' ')' ) | effect ) )? -> ^( PRECONDITION ( logicExpr )? ) ^( EFFECT ( effect )? ) ^( VARS ( typedVariableList )? ) )
			// Pddl.g:263:4: ( ':vars' '(' typedVariableList ')' )? ( ':precondition' ( ( '(' ')' ) | logicExpr ) )? ( ':effect' ( ( '(' ')' ) | effect ) )?
			{
			// Pddl.g:263:4: ( ':vars' '(' typedVariableList ')' )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==102) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// Pddl.g:263:6: ':vars' '(' typedVariableList ')'
					{
					string_literal91=(Token)match(input,102,FOLLOW_102_in_actionDefBody1387); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_102.add(string_literal91);

					char_literal92=(Token)match(input,77,FOLLOW_77_in_actionDefBody1389); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal92);

					pushFollow(FOLLOW_typedVariableList_in_actionDefBody1391);
					typedVariableList93=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList93.getTree());
					char_literal94=(Token)match(input,78,FOLLOW_78_in_actionDefBody1393); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal94);

					}
					break;

			}

			// Pddl.g:264:4: ( ':precondition' ( ( '(' ')' ) | logicExpr ) )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==98) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// Pddl.g:264:6: ':precondition' ( ( '(' ')' ) | logicExpr )
					{
					string_literal95=(Token)match(input,98,FOLLOW_98_in_actionDefBody1402); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(string_literal95);

					// Pddl.g:264:22: ( ( '(' ')' ) | logicExpr )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==77) ) {
						int LA30_1 = input.LA(2);
						if ( (LA30_1==78) ) {
							alt30=1;
						}
						else if ( (LA30_1==NAME||(LA30_1 >= 103 && LA30_1 <= 107)||LA30_1==112||LA30_1==114||(LA30_1 >= 121 && LA30_1 <= 122)||LA30_1==125||(LA30_1 >= 130 && LA30_1 <= 131)||LA30_1==142) ) {
							alt30=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 30, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// Pddl.g:264:23: ( '(' ')' )
							{
							// Pddl.g:264:23: ( '(' ')' )
							// Pddl.g:264:24: '(' ')'
							{
							char_literal96=(Token)match(input,77,FOLLOW_77_in_actionDefBody1406); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_77.add(char_literal96);

							char_literal97=(Token)match(input,78,FOLLOW_78_in_actionDefBody1408); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_78.add(char_literal97);

							}

							}
							break;
						case 2 :
							// Pddl.g:264:35: logicExpr
							{
							pushFollow(FOLLOW_logicExpr_in_actionDefBody1413);
							logicExpr98=logicExpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr98.getTree());
							}
							break;

					}

					}
					break;

			}

			// Pddl.g:265:4: ( ':effect' ( ( '(' ')' ) | effect ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==91) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// Pddl.g:265:6: ':effect' ( ( '(' ')' ) | effect )
					{
					string_literal99=(Token)match(input,91,FOLLOW_91_in_actionDefBody1423); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_91.add(string_literal99);

					// Pddl.g:265:16: ( ( '(' ')' ) | effect )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==77) ) {
						int LA32_1 = input.LA(2);
						if ( (LA32_1==78) ) {
							alt32=1;
						}
						else if ( (LA32_1==NAME||(LA32_1 >= 112 && LA32_1 <= 114)||LA32_1==116||LA32_1==122||LA32_1==126||LA32_1==130||(LA32_1 >= 135 && LA32_1 <= 136)||LA32_1==142) ) {
							alt32=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 32, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// Pddl.g:265:17: ( '(' ')' )
							{
							// Pddl.g:265:17: ( '(' ')' )
							// Pddl.g:265:18: '(' ')'
							{
							char_literal100=(Token)match(input,77,FOLLOW_77_in_actionDefBody1427); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_77.add(char_literal100);

							char_literal101=(Token)match(input,78,FOLLOW_78_in_actionDefBody1429); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_78.add(char_literal101);

							}

							}
							break;
						case 2 :
							// Pddl.g:265:29: effect
							{
							pushFollow(FOLLOW_effect_in_actionDefBody1434);
							effect102=effect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_effect.add(effect102.getTree());
							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: logicExpr, effect, typedVariableList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 266:4: -> ^( PRECONDITION ( logicExpr )? ) ^( EFFECT ( effect )? ) ^( VARS ( typedVariableList )? )
			{
				// Pddl.g:266:7: ^( PRECONDITION ( logicExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRECONDITION, "PRECONDITION"), root_1);
				// Pddl.g:266:22: ( logicExpr )?
				if ( stream_logicExpr.hasNext() ) {
					adaptor.addChild(root_1, stream_logicExpr.nextTree());
				}
				stream_logicExpr.reset();

				adaptor.addChild(root_0, root_1);
				}

				// Pddl.g:266:34: ^( EFFECT ( effect )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECT, "EFFECT"), root_1);
				// Pddl.g:266:43: ( effect )?
				if ( stream_effect.hasNext() ) {
					adaptor.addChild(root_1, stream_effect.nextTree());
				}
				stream_effect.reset();

				adaptor.addChild(root_0, root_1);
				}

				// Pddl.g:266:52: ^( VARS ( typedVariableList )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_1);
				// Pddl.g:266:59: ( typedVariableList )?
				if ( stream_typedVariableList.hasNext() ) {
					adaptor.addChild(root_1, stream_typedVariableList.nextTree());
				}
				stream_typedVariableList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionDefBody"


	public static class logicExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logicExpr"
	// Pddl.g:280:1: logicExpr : ( atomicTermFormula | '(' 'and' ( logicExpr )* ')' -> ^( AND_EXP ( logicExpr )* ) | '(' 'or' ( logicExpr )* ')' -> ^( OR_EXP ( logicExpr )* ) | '(' 'not' logicExpr ')' -> ^( NOT_EXP logicExpr ) | '(' 'imply' logicExpr logicExpr ')' -> ^( IMPLY_EXP logicExpr logicExpr ) | '(' 'exists' '(' typedVariableList ')' logicExpr ')' -> ^( EXISTS_EXP ^( PARAMS typedVariableList ) logicExpr ) | '(' 'forall' '(' typedVariableList ')' logicExpr ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) logicExpr ) | condWhenExpr | fComp -> ^( COMPARISON_EXP fComp ) );
	public final PddlParser.logicExpr_return logicExpr() throws RecognitionException {
		PddlParser.logicExpr_return retval = new PddlParser.logicExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal104=null;
		Token string_literal105=null;
		Token char_literal107=null;
		Token char_literal108=null;
		Token string_literal109=null;
		Token char_literal111=null;
		Token char_literal112=null;
		Token string_literal113=null;
		Token char_literal115=null;
		Token char_literal116=null;
		Token string_literal117=null;
		Token char_literal120=null;
		Token char_literal121=null;
		Token string_literal122=null;
		Token char_literal123=null;
		Token char_literal125=null;
		Token char_literal127=null;
		Token char_literal128=null;
		Token string_literal129=null;
		Token char_literal130=null;
		Token char_literal132=null;
		Token char_literal134=null;
		ParserRuleReturnScope atomicTermFormula103 =null;
		ParserRuleReturnScope logicExpr106 =null;
		ParserRuleReturnScope logicExpr110 =null;
		ParserRuleReturnScope logicExpr114 =null;
		ParserRuleReturnScope logicExpr118 =null;
		ParserRuleReturnScope logicExpr119 =null;
		ParserRuleReturnScope typedVariableList124 =null;
		ParserRuleReturnScope logicExpr126 =null;
		ParserRuleReturnScope typedVariableList131 =null;
		ParserRuleReturnScope logicExpr133 =null;
		ParserRuleReturnScope condWhenExpr135 =null;
		ParserRuleReturnScope fComp136 =null;

		Object char_literal104_tree=null;
		Object string_literal105_tree=null;
		Object char_literal107_tree=null;
		Object char_literal108_tree=null;
		Object string_literal109_tree=null;
		Object char_literal111_tree=null;
		Object char_literal112_tree=null;
		Object string_literal113_tree=null;
		Object char_literal115_tree=null;
		Object char_literal116_tree=null;
		Object string_literal117_tree=null;
		Object char_literal120_tree=null;
		Object char_literal121_tree=null;
		Object string_literal122_tree=null;
		Object char_literal123_tree=null;
		Object char_literal125_tree=null;
		Object char_literal127_tree=null;
		Object char_literal128_tree=null;
		Object string_literal129_tree=null;
		Object char_literal130_tree=null;
		Object char_literal132_tree=null;
		Object char_literal134_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_logicExpr=new RewriteRuleSubtreeStream(adaptor,"rule logicExpr");
		RewriteRuleSubtreeStream stream_fComp=new RewriteRuleSubtreeStream(adaptor,"rule fComp");

		try {
			// Pddl.g:281:2: ( atomicTermFormula | '(' 'and' ( logicExpr )* ')' -> ^( AND_EXP ( logicExpr )* ) | '(' 'or' ( logicExpr )* ')' -> ^( OR_EXP ( logicExpr )* ) | '(' 'not' logicExpr ')' -> ^( NOT_EXP logicExpr ) | '(' 'imply' logicExpr logicExpr ')' -> ^( IMPLY_EXP logicExpr logicExpr ) | '(' 'exists' '(' typedVariableList ')' logicExpr ')' -> ^( EXISTS_EXP ^( PARAMS typedVariableList ) logicExpr ) | '(' 'forall' '(' typedVariableList ')' logicExpr ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) logicExpr ) | condWhenExpr | fComp -> ^( COMPARISON_EXP fComp ) )
			int alt36=9;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==77) ) {
				switch ( input.LA(2) ) {
				case 112:
					{
					alt36=2;
					}
					break;
				case 131:
					{
					alt36=3;
					}
					break;
				case 130:
					{
					alt36=4;
					}
					break;
				case 125:
					{
					alt36=5;
					}
					break;
				case 121:
					{
					alt36=6;
					}
					break;
				case 122:
					{
					alt36=7;
					}
					break;
				case 142:
					{
					alt36=8;
					}
					break;
				case 103:
				case 104:
				case 105:
				case 106:
				case 107:
					{
					alt36=9;
					}
					break;
				case NAME:
				case 114:
					{
					alt36=1;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// Pddl.g:281:4: atomicTermFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicTermFormula_in_logicExpr1485);
					atomicTermFormula103=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula103.getTree());

					}
					break;
				case 2 :
					// Pddl.g:282:4: '(' 'and' ( logicExpr )* ')'
					{
					char_literal104=(Token)match(input,77,FOLLOW_77_in_logicExpr1490); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal104);

					string_literal105=(Token)match(input,112,FOLLOW_112_in_logicExpr1492); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal105);

					// Pddl.g:282:14: ( logicExpr )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==77) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// Pddl.g:282:14: logicExpr
							{
							pushFollow(FOLLOW_logicExpr_in_logicExpr1494);
							logicExpr106=logicExpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr106.getTree());
							}
							break;

						default :
							break loop34;
						}
					}

					char_literal107=(Token)match(input,78,FOLLOW_78_in_logicExpr1497); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal107);

					// AST REWRITE
					// elements: logicExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 283:12: -> ^( AND_EXP ( logicExpr )* )
					{
						// Pddl.g:283:15: ^( AND_EXP ( logicExpr )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EXP, "AND_EXP"), root_1);
						// Pddl.g:283:25: ( logicExpr )*
						while ( stream_logicExpr.hasNext() ) {
							adaptor.addChild(root_1, stream_logicExpr.nextTree());
						}
						stream_logicExpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:284:4: '(' 'or' ( logicExpr )* ')'
					{
					char_literal108=(Token)match(input,77,FOLLOW_77_in_logicExpr1522); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal108);

					string_literal109=(Token)match(input,131,FOLLOW_131_in_logicExpr1524); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_131.add(string_literal109);

					// Pddl.g:284:13: ( logicExpr )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==77) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// Pddl.g:284:13: logicExpr
							{
							pushFollow(FOLLOW_logicExpr_in_logicExpr1526);
							logicExpr110=logicExpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr110.getTree());
							}
							break;

						default :
							break loop35;
						}
					}

					char_literal111=(Token)match(input,78,FOLLOW_78_in_logicExpr1529); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal111);

					// AST REWRITE
					// elements: logicExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 285:12: -> ^( OR_EXP ( logicExpr )* )
					{
						// Pddl.g:285:15: ^( OR_EXP ( logicExpr )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR_EXP, "OR_EXP"), root_1);
						// Pddl.g:285:24: ( logicExpr )*
						while ( stream_logicExpr.hasNext() ) {
							adaptor.addChild(root_1, stream_logicExpr.nextTree());
						}
						stream_logicExpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:286:4: '(' 'not' logicExpr ')'
					{
					char_literal112=(Token)match(input,77,FOLLOW_77_in_logicExpr1554); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal112);

					string_literal113=(Token)match(input,130,FOLLOW_130_in_logicExpr1556); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(string_literal113);

					pushFollow(FOLLOW_logicExpr_in_logicExpr1558);
					logicExpr114=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr114.getTree());
					char_literal115=(Token)match(input,78,FOLLOW_78_in_logicExpr1560); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal115);

					// AST REWRITE
					// elements: logicExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 287:12: -> ^( NOT_EXP logicExpr )
					{
						// Pddl.g:287:15: ^( NOT_EXP logicExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EXP, "NOT_EXP"), root_1);
						adaptor.addChild(root_1, stream_logicExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Pddl.g:288:4: '(' 'imply' logicExpr logicExpr ')'
					{
					char_literal116=(Token)match(input,77,FOLLOW_77_in_logicExpr1584); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal116);

					string_literal117=(Token)match(input,125,FOLLOW_125_in_logicExpr1586); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_125.add(string_literal117);

					pushFollow(FOLLOW_logicExpr_in_logicExpr1588);
					logicExpr118=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr118.getTree());
					pushFollow(FOLLOW_logicExpr_in_logicExpr1590);
					logicExpr119=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr119.getTree());
					char_literal120=(Token)match(input,78,FOLLOW_78_in_logicExpr1592); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal120);

					// AST REWRITE
					// elements: logicExpr, logicExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 289:12: -> ^( IMPLY_EXP logicExpr logicExpr )
					{
						// Pddl.g:289:15: ^( IMPLY_EXP logicExpr logicExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPLY_EXP, "IMPLY_EXP"), root_1);
						adaptor.addChild(root_1, stream_logicExpr.nextTree());
						adaptor.addChild(root_1, stream_logicExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Pddl.g:290:4: '(' 'exists' '(' typedVariableList ')' logicExpr ')'
					{
					char_literal121=(Token)match(input,77,FOLLOW_77_in_logicExpr1618); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal121);

					string_literal122=(Token)match(input,121,FOLLOW_121_in_logicExpr1620); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_121.add(string_literal122);

					char_literal123=(Token)match(input,77,FOLLOW_77_in_logicExpr1622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal123);

					pushFollow(FOLLOW_typedVariableList_in_logicExpr1624);
					typedVariableList124=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList124.getTree());
					char_literal125=(Token)match(input,78,FOLLOW_78_in_logicExpr1626); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal125);

					pushFollow(FOLLOW_logicExpr_in_logicExpr1628);
					logicExpr126=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr126.getTree());
					char_literal127=(Token)match(input,78,FOLLOW_78_in_logicExpr1630); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal127);

					// AST REWRITE
					// elements: logicExpr, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 291:12: -> ^( EXISTS_EXP ^( PARAMS typedVariableList ) logicExpr )
					{
						// Pddl.g:291:15: ^( EXISTS_EXP ^( PARAMS typedVariableList ) logicExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXISTS_EXP, "EXISTS_EXP"), root_1);
						// Pddl.g:291:28: ^( PARAMS typedVariableList )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						adaptor.addChild(root_2, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_logicExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// Pddl.g:292:4: '(' 'forall' '(' typedVariableList ')' logicExpr ')'
					{
					char_literal128=(Token)match(input,77,FOLLOW_77_in_logicExpr1660); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal128);

					string_literal129=(Token)match(input,122,FOLLOW_122_in_logicExpr1662); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_122.add(string_literal129);

					char_literal130=(Token)match(input,77,FOLLOW_77_in_logicExpr1664); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal130);

					pushFollow(FOLLOW_typedVariableList_in_logicExpr1666);
					typedVariableList131=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList131.getTree());
					char_literal132=(Token)match(input,78,FOLLOW_78_in_logicExpr1668); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal132);

					pushFollow(FOLLOW_logicExpr_in_logicExpr1670);
					logicExpr133=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr133.getTree());
					char_literal134=(Token)match(input,78,FOLLOW_78_in_logicExpr1672); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal134);

					// AST REWRITE
					// elements: logicExpr, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 293:12: -> ^( FORALL_EXP ^( PARAMS typedVariableList ) logicExpr )
					{
						// Pddl.g:293:15: ^( FORALL_EXP ^( PARAMS typedVariableList ) logicExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EXP, "FORALL_EXP"), root_1);
						// Pddl.g:293:28: ^( PARAMS typedVariableList )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						adaptor.addChild(root_2, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_logicExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Pddl.g:294:4: condWhenExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_condWhenExpr_in_logicExpr1702);
					condWhenExpr135=condWhenExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, condWhenExpr135.getTree());

					}
					break;
				case 9 :
					// Pddl.g:295:11: fComp
					{
					pushFollow(FOLLOW_fComp_in_logicExpr1714);
					fComp136=fComp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fComp.add(fComp136.getTree());
					// AST REWRITE
					// elements: fComp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 295:19: -> ^( COMPARISON_EXP fComp )
					{
						// Pddl.g:295:22: ^( COMPARISON_EXP fComp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPARISON_EXP, "COMPARISON_EXP"), root_1);
						adaptor.addChild(root_1, stream_fComp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicExpr"


	public static class condWhenExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condWhenExpr"
	// Pddl.g:299:1: condWhenExpr : '(' 'when' logicExpr whenCondEffect ')' -> ^( WHEN_EXP logicExpr whenCondEffect ) ;
	public final PddlParser.condWhenExpr_return condWhenExpr() throws RecognitionException {
		PddlParser.condWhenExpr_return retval = new PddlParser.condWhenExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal137=null;
		Token string_literal138=null;
		Token char_literal141=null;
		ParserRuleReturnScope logicExpr139 =null;
		ParserRuleReturnScope whenCondEffect140 =null;

		Object char_literal137_tree=null;
		Object string_literal138_tree=null;
		Object char_literal141_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
		RewriteRuleSubtreeStream stream_whenCondEffect=new RewriteRuleSubtreeStream(adaptor,"rule whenCondEffect");
		RewriteRuleSubtreeStream stream_logicExpr=new RewriteRuleSubtreeStream(adaptor,"rule logicExpr");

		try {
			// Pddl.g:300:2: ( '(' 'when' logicExpr whenCondEffect ')' -> ^( WHEN_EXP logicExpr whenCondEffect ) )
			// Pddl.g:300:4: '(' 'when' logicExpr whenCondEffect ')'
			{
			char_literal137=(Token)match(input,77,FOLLOW_77_in_condWhenExpr1735); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal137);

			string_literal138=(Token)match(input,142,FOLLOW_142_in_condWhenExpr1737); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_142.add(string_literal138);

			pushFollow(FOLLOW_logicExpr_in_condWhenExpr1739);
			logicExpr139=logicExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr139.getTree());
			pushFollow(FOLLOW_whenCondEffect_in_condWhenExpr1741);
			whenCondEffect140=whenCondEffect();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_whenCondEffect.add(whenCondEffect140.getTree());
			char_literal141=(Token)match(input,78,FOLLOW_78_in_condWhenExpr1743); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal141);

			// AST REWRITE
			// elements: logicExpr, whenCondEffect
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 301:2: -> ^( WHEN_EXP logicExpr whenCondEffect )
			{
				// Pddl.g:301:5: ^( WHEN_EXP logicExpr whenCondEffect )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN_EXP, "WHEN_EXP"), root_1);
				adaptor.addChild(root_1, stream_logicExpr.nextTree());
				adaptor.addChild(root_1, stream_whenCondEffect.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condWhenExpr"


	public static class wEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "wEffect"
	// Pddl.g:304:1: wEffect : ( '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula );
	public final PddlParser.wEffect_return wEffect() throws RecognitionException {
		PddlParser.wEffect_return retval = new PddlParser.wEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal142=null;
		Token string_literal143=null;
		Token char_literal145=null;
		ParserRuleReturnScope atomicTermFormula144 =null;
		ParserRuleReturnScope atomicTermFormula146 =null;

		Object char_literal142_tree=null;
		Object string_literal143_tree=null;
		Object char_literal145_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_atomicTermFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicTermFormula");

		try {
			// Pddl.g:305:2: ( '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==77) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==130) ) {
					alt37=1;
				}
				else if ( (LA37_1==NAME||LA37_1==114) ) {
					alt37=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// Pddl.g:305:4: '(' 'not' atomicTermFormula ')'
					{
					char_literal142=(Token)match(input,77,FOLLOW_77_in_wEffect1765); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal142);

					string_literal143=(Token)match(input,130,FOLLOW_130_in_wEffect1767); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(string_literal143);

					pushFollow(FOLLOW_atomicTermFormula_in_wEffect1769);
					atomicTermFormula144=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicTermFormula.add(atomicTermFormula144.getTree());
					char_literal145=(Token)match(input,78,FOLLOW_78_in_wEffect1771); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal145);

					// AST REWRITE
					// elements: atomicTermFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 306:4: -> ^( NOT_EFFECT atomicTermFormula )
					{
						// Pddl.g:306:7: ^( NOT_EFFECT atomicTermFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EFFECT, "NOT_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_atomicTermFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:307:4: atomicTermFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicTermFormula_in_wEffect1787);
					atomicTermFormula146=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula146.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "wEffect"


	public static class whenCondEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whenCondEffect"
	// Pddl.g:310:1: whenCondEffect : ( '(' 'and' ( wEffect )* ')' -> ^( AND_EFFECT ( wEffect )* ) | wEffect );
	public final PddlParser.whenCondEffect_return whenCondEffect() throws RecognitionException {
		PddlParser.whenCondEffect_return retval = new PddlParser.whenCondEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal147=null;
		Token string_literal148=null;
		Token char_literal150=null;
		ParserRuleReturnScope wEffect149 =null;
		ParserRuleReturnScope wEffect151 =null;

		Object char_literal147_tree=null;
		Object string_literal148_tree=null;
		Object char_literal150_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleSubtreeStream stream_wEffect=new RewriteRuleSubtreeStream(adaptor,"rule wEffect");

		try {
			// Pddl.g:311:2: ( '(' 'and' ( wEffect )* ')' -> ^( AND_EFFECT ( wEffect )* ) | wEffect )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==77) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==112) ) {
					alt39=1;
				}
				else if ( (LA39_1==NAME||LA39_1==114||LA39_1==130) ) {
					alt39=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// Pddl.g:311:4: '(' 'and' ( wEffect )* ')'
					{
					char_literal147=(Token)match(input,77,FOLLOW_77_in_whenCondEffect1798); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal147);

					string_literal148=(Token)match(input,112,FOLLOW_112_in_whenCondEffect1800); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal148);

					// Pddl.g:311:14: ( wEffect )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==77) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// Pddl.g:311:14: wEffect
							{
							pushFollow(FOLLOW_wEffect_in_whenCondEffect1802);
							wEffect149=wEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_wEffect.add(wEffect149.getTree());
							}
							break;

						default :
							break loop38;
						}
					}

					char_literal150=(Token)match(input,78,FOLLOW_78_in_whenCondEffect1805); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal150);

					// AST REWRITE
					// elements: wEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 311:27: -> ^( AND_EFFECT ( wEffect )* )
					{
						// Pddl.g:311:30: ^( AND_EFFECT ( wEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// Pddl.g:311:43: ( wEffect )*
						while ( stream_wEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_wEffect.nextTree());
						}
						stream_wEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:312:4: wEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_wEffect_in_whenCondEffect1819);
					wEffect151=wEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, wEffect151.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whenCondEffect"


	public static class fComp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fComp"
	// Pddl.g:321:1: fComp : ( '(' ! '=' fCompExp ( term | UNDEFINED ) ')' !| '(' ! binaryComp fCompExp fCompExp ')' !);
	public final PddlParser.fComp_return fComp() throws RecognitionException {
		PddlParser.fComp_return retval = new PddlParser.fComp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal152=null;
		Token char_literal153=null;
		Token UNDEFINED156=null;
		Token char_literal157=null;
		Token char_literal158=null;
		Token char_literal162=null;
		ParserRuleReturnScope fCompExp154 =null;
		ParserRuleReturnScope term155 =null;
		ParserRuleReturnScope binaryComp159 =null;
		ParserRuleReturnScope fCompExp160 =null;
		ParserRuleReturnScope fCompExp161 =null;

		Object char_literal152_tree=null;
		Object char_literal153_tree=null;
		Object UNDEFINED156_tree=null;
		Object char_literal157_tree=null;
		Object char_literal158_tree=null;
		Object char_literal162_tree=null;

		try {
			// Pddl.g:322:2: ( '(' ! '=' fCompExp ( term | UNDEFINED ) ')' !| '(' ! binaryComp fCompExp fCompExp ')' !)
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==77) ) {
				int LA41_1 = input.LA(2);
				if ( (synpred53_Pddl()) ) {
					alt41=1;
				}
				else if ( (true) ) {
					alt41=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// Pddl.g:322:4: '(' ! '=' fCompExp ( term | UNDEFINED ) ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal152=(Token)match(input,77,FOLLOW_77_in_fComp1836); if (state.failed) return retval;
					char_literal153=(Token)match(input,105,FOLLOW_105_in_fComp1839); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal153_tree = (Object)adaptor.create(char_literal153);
					adaptor.addChild(root_0, char_literal153_tree);
					}

					pushFollow(FOLLOW_fCompExp_in_fComp1841);
					fCompExp154=fCompExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fCompExp154.getTree());

					// Pddl.g:322:22: ( term | UNDEFINED )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==NAME||LA40_0==NUMBER||LA40_0==VARIABLE||LA40_0==77) ) {
						alt40=1;
					}
					else if ( (LA40_0==UNDEFINED) ) {
						alt40=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// Pddl.g:322:23: term
							{
							pushFollow(FOLLOW_term_in_fComp1844);
							term155=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, term155.getTree());

							}
							break;
						case 2 :
							// Pddl.g:322:30: UNDEFINED
							{
							UNDEFINED156=(Token)match(input,UNDEFINED,FOLLOW_UNDEFINED_in_fComp1848); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							UNDEFINED156_tree = (Object)adaptor.create(UNDEFINED156);
							adaptor.addChild(root_0, UNDEFINED156_tree);
							}

							}
							break;

					}

					char_literal157=(Token)match(input,78,FOLLOW_78_in_fComp1851); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Pddl.g:323:4: '(' ! binaryComp fCompExp fCompExp ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal158=(Token)match(input,77,FOLLOW_77_in_fComp1857); if (state.failed) return retval;
					pushFollow(FOLLOW_binaryComp_in_fComp1860);
					binaryComp159=binaryComp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, binaryComp159.getTree());

					pushFollow(FOLLOW_fCompExp_in_fComp1862);
					fCompExp160=fCompExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fCompExp160.getTree());

					pushFollow(FOLLOW_fCompExp_in_fComp1864);
					fCompExp161=fCompExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fCompExp161.getTree());

					char_literal162=(Token)match(input,78,FOLLOW_78_in_fComp1866); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fComp"


	public static class fCompExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fCompExp"
	// Pddl.g:326:1: fCompExp : ( fExp | VARIABLE | singleTypeVarList );
	public final PddlParser.fCompExp_return fCompExp() throws RecognitionException {
		PddlParser.fCompExp_return retval = new PddlParser.fCompExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE164=null;
		ParserRuleReturnScope fExp163 =null;
		ParserRuleReturnScope singleTypeVarList165 =null;

		Object VARIABLE164_tree=null;

		try {
			// Pddl.g:327:2: ( fExp | VARIABLE | singleTypeVarList )
			int alt42=3;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==NAME||LA42_0==NUMBER||LA42_0==77) ) {
				alt42=1;
			}
			else if ( (LA42_0==VARIABLE) ) {
				int LA42_2 = input.LA(2);
				if ( (synpred55_Pddl()) ) {
					alt42=2;
				}
				else if ( (true) ) {
					alt42=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// Pddl.g:327:4: fExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fExp_in_fCompExp1878);
					fExp163=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp163.getTree());

					}
					break;
				case 2 :
					// Pddl.g:327:11: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE164=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_fCompExp1882); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE164_tree = (Object)adaptor.create(VARIABLE164);
					adaptor.addChild(root_0, VARIABLE164_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:327:22: singleTypeVarList
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_singleTypeVarList_in_fCompExp1886);
					singleTypeVarList165=singleTypeVarList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, singleTypeVarList165.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fCompExp"


	public static class atomicTermFormula_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicTermFormula"
	// Pddl.g:330:1: atomicTermFormula : '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ^( PARAMS ( term )* ) ) ;
	public final PddlParser.atomicTermFormula_return atomicTermFormula() throws RecognitionException {
		PddlParser.atomicTermFormula_return retval = new PddlParser.atomicTermFormula_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal166=null;
		Token char_literal169=null;
		ParserRuleReturnScope predicate167 =null;
		ParserRuleReturnScope term168 =null;

		Object char_literal166_tree=null;
		Object char_literal169_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// Pddl.g:331:2: ( '(' predicate ( term )* ')' -> ^( PRED_HEAD predicate ^( PARAMS ( term )* ) ) )
			// Pddl.g:331:4: '(' predicate ( term )* ')'
			{
			char_literal166=(Token)match(input,77,FOLLOW_77_in_atomicTermFormula1897); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal166);

			pushFollow(FOLLOW_predicate_in_atomicTermFormula1899);
			predicate167=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(predicate167.getTree());
			// Pddl.g:331:18: ( term )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==NAME||LA43_0==NUMBER||LA43_0==VARIABLE||LA43_0==77) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// Pddl.g:331:18: term
					{
					pushFollow(FOLLOW_term_in_atomicTermFormula1901);
					term168=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term168.getTree());
					}
					break;

				default :
					break loop43;
				}
			}

			char_literal169=(Token)match(input,78,FOLLOW_78_in_atomicTermFormula1904); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal169);

			// AST REWRITE
			// elements: predicate, term
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 331:28: -> ^( PRED_HEAD predicate ^( PARAMS ( term )* ) )
			{
				// Pddl.g:331:31: ^( PRED_HEAD predicate ^( PARAMS ( term )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_HEAD, "PRED_HEAD"), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				// Pddl.g:331:53: ^( PARAMS ( term )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
				// Pddl.g:331:62: ( term )*
				while ( stream_term.hasNext() ) {
					adaptor.addChild(root_2, stream_term.nextTree());
				}
				stream_term.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicTermFormula"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// Pddl.g:334:1: term : ( NAME | VARIABLE | fHead | NUMBER );
	public final PddlParser.term_return term() throws RecognitionException {
		PddlParser.term_return retval = new PddlParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME170=null;
		Token VARIABLE171=null;
		Token NUMBER173=null;
		ParserRuleReturnScope fHead172 =null;

		Object NAME170_tree=null;
		Object VARIABLE171_tree=null;
		Object NUMBER173_tree=null;

		try {
			// Pddl.g:334:6: ( NAME | VARIABLE | fHead | NUMBER )
			int alt44=4;
			switch ( input.LA(1) ) {
			case NAME:
				{
				int LA44_1 = input.LA(2);
				if ( (synpred57_Pddl()) ) {
					alt44=1;
				}
				else if ( (synpred59_Pddl()) ) {
					alt44=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VARIABLE:
				{
				alt44=2;
				}
				break;
			case 77:
				{
				alt44=3;
				}
				break;
			case NUMBER:
				{
				alt44=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// Pddl.g:334:8: NAME
					{
					root_0 = (Object)adaptor.nil();


					NAME170=(Token)match(input,NAME,FOLLOW_NAME_in_term1930); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NAME170_tree = (Object)adaptor.create(NAME170);
					adaptor.addChild(root_0, NAME170_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:334:15: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE171=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_term1934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE171_tree = (Object)adaptor.create(VARIABLE171);
					adaptor.addChild(root_0, VARIABLE171_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:334:26: fHead
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fHead_in_term1938);
					fHead172=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead172.getTree());

					}
					break;
				case 4 :
					// Pddl.g:334:34: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER173=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_term1942); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER173_tree = (Object)adaptor.create(NUMBER173);
					adaptor.addChild(root_0, NUMBER173_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class durativeActionDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durativeActionDef"
	// Pddl.g:338:1: durativeActionDef : '(' ':durative-action' actionSymbol actionParams daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol actionParams daDefBody ) ;
	public final PddlParser.durativeActionDef_return durativeActionDef() throws RecognitionException {
		PddlParser.durativeActionDef_return retval = new PddlParser.durativeActionDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal174=null;
		Token string_literal175=null;
		Token char_literal179=null;
		ParserRuleReturnScope actionSymbol176 =null;
		ParserRuleReturnScope actionParams177 =null;
		ParserRuleReturnScope daDefBody178 =null;

		Object char_literal174_tree=null;
		Object string_literal175_tree=null;
		Object char_literal179_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleSubtreeStream stream_daDefBody=new RewriteRuleSubtreeStream(adaptor,"rule daDefBody");
		RewriteRuleSubtreeStream stream_actionParams=new RewriteRuleSubtreeStream(adaptor,"rule actionParams");
		RewriteRuleSubtreeStream stream_actionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule actionSymbol");

		try {
			// Pddl.g:339:2: ( '(' ':durative-action' actionSymbol actionParams daDefBody ')' -> ^( DURATIVE_ACTION actionSymbol actionParams daDefBody ) )
			// Pddl.g:339:4: '(' ':durative-action' actionSymbol actionParams daDefBody ')'
			{
			char_literal174=(Token)match(input,77,FOLLOW_77_in_durativeActionDef1954); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal174);

			string_literal175=(Token)match(input,90,FOLLOW_90_in_durativeActionDef1956); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_90.add(string_literal175);

			pushFollow(FOLLOW_actionSymbol_in_durativeActionDef1958);
			actionSymbol176=actionSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionSymbol.add(actionSymbol176.getTree());
			pushFollow(FOLLOW_actionParams_in_durativeActionDef1968);
			actionParams177=actionParams();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_actionParams.add(actionParams177.getTree());
			pushFollow(FOLLOW_daDefBody_in_durativeActionDef1986);
			daDefBody178=daDefBody();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_daDefBody.add(daDefBody178.getTree());
			char_literal179=(Token)match(input,78,FOLLOW_78_in_durativeActionDef1988); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal179);

			// AST REWRITE
			// elements: actionParams, actionSymbol, daDefBody
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 342:8: -> ^( DURATIVE_ACTION actionSymbol actionParams daDefBody )
			{
				// Pddl.g:342:11: ^( DURATIVE_ACTION actionSymbol actionParams daDefBody )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DURATIVE_ACTION, "DURATIVE_ACTION"), root_1);
				adaptor.addChild(root_1, stream_actionSymbol.nextTree());
				adaptor.addChild(root_1, stream_actionParams.nextTree());
				adaptor.addChild(root_1, stream_daDefBody.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durativeActionDef"


	public static class daDefBody_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daDefBody"
	// Pddl.g:347:1: daDefBody : ':duration' durationConstraint ( ':condition' ( ( '(' ')' ) | daLogicExpr ) )? ( ':effect' ( ( '(' ')' ) | daEffect ) ) -> ^( DURATION durationConstraint ) ^( CONDITION ( daLogicExpr )? ) ^( EFFECT daEffect ) ;
	public final PddlParser.daDefBody_return daDefBody() throws RecognitionException {
		PddlParser.daDefBody_return retval = new PddlParser.daDefBody_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal180=null;
		Token string_literal182=null;
		Token char_literal183=null;
		Token char_literal184=null;
		Token string_literal186=null;
		Token char_literal187=null;
		Token char_literal188=null;
		ParserRuleReturnScope durationConstraint181 =null;
		ParserRuleReturnScope daLogicExpr185 =null;
		ParserRuleReturnScope daEffect189 =null;

		Object string_literal180_tree=null;
		Object string_literal182_tree=null;
		Object char_literal183_tree=null;
		Object char_literal184_tree=null;
		Object string_literal186_tree=null;
		Object char_literal187_tree=null;
		Object char_literal188_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_daEffect=new RewriteRuleSubtreeStream(adaptor,"rule daEffect");
		RewriteRuleSubtreeStream stream_daLogicExpr=new RewriteRuleSubtreeStream(adaptor,"rule daLogicExpr");
		RewriteRuleSubtreeStream stream_durationConstraint=new RewriteRuleSubtreeStream(adaptor,"rule durationConstraint");

		try {
			// Pddl.g:348:2: ( ':duration' durationConstraint ( ':condition' ( ( '(' ')' ) | daLogicExpr ) )? ( ':effect' ( ( '(' ')' ) | daEffect ) ) -> ^( DURATION durationConstraint ) ^( CONDITION ( daLogicExpr )? ) ^( EFFECT daEffect ) )
			// Pddl.g:348:4: ':duration' durationConstraint ( ':condition' ( ( '(' ')' ) | daLogicExpr ) )? ( ':effect' ( ( '(' ')' ) | daEffect ) )
			{
			string_literal180=(Token)match(input,89,FOLLOW_89_in_daDefBody2023); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_89.add(string_literal180);

			pushFollow(FOLLOW_durationConstraint_in_daDefBody2025);
			durationConstraint181=durationConstraint();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_durationConstraint.add(durationConstraint181.getTree());
			// Pddl.g:349:4: ( ':condition' ( ( '(' ')' ) | daLogicExpr ) )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==84) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// Pddl.g:349:6: ':condition' ( ( '(' ')' ) | daLogicExpr )
					{
					string_literal182=(Token)match(input,84,FOLLOW_84_in_daDefBody2032); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_84.add(string_literal182);

					// Pddl.g:349:19: ( ( '(' ')' ) | daLogicExpr )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==77) ) {
						int LA45_1 = input.LA(2);
						if ( (LA45_1==78) ) {
							alt45=1;
						}
						else if ( (LA45_1==112||LA45_1==114||LA45_1==122||(LA45_1 >= 132 && LA45_1 <= 133)) ) {
							alt45=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 45, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// Pddl.g:349:21: ( '(' ')' )
							{
							// Pddl.g:349:21: ( '(' ')' )
							// Pddl.g:349:22: '(' ')'
							{
							char_literal183=(Token)match(input,77,FOLLOW_77_in_daDefBody2037); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_77.add(char_literal183);

							char_literal184=(Token)match(input,78,FOLLOW_78_in_daDefBody2039); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_78.add(char_literal184);

							}

							}
							break;
						case 2 :
							// Pddl.g:349:33: daLogicExpr
							{
							pushFollow(FOLLOW_daLogicExpr_in_daDefBody2044);
							daLogicExpr185=daLogicExpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_daLogicExpr.add(daLogicExpr185.getTree());
							}
							break;

					}

					}
					break;

			}

			// Pddl.g:350:11: ( ':effect' ( ( '(' ')' ) | daEffect ) )
			// Pddl.g:350:12: ':effect' ( ( '(' ')' ) | daEffect )
			{
			string_literal186=(Token)match(input,91,FOLLOW_91_in_daDefBody2062); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_91.add(string_literal186);

			// Pddl.g:350:22: ( ( '(' ')' ) | daEffect )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==77) ) {
				int LA47_1 = input.LA(2);
				if ( (LA47_1==78) ) {
					alt47=1;
				}
				else if ( (LA47_1==112||LA47_1==114||LA47_1==116||LA47_1==122||LA47_1==126||LA47_1==132||LA47_1==142) ) {
					alt47=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// Pddl.g:350:24: ( '(' ')' )
					{
					// Pddl.g:350:24: ( '(' ')' )
					// Pddl.g:350:25: '(' ')'
					{
					char_literal187=(Token)match(input,77,FOLLOW_77_in_daDefBody2067); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal187);

					char_literal188=(Token)match(input,78,FOLLOW_78_in_daDefBody2069); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal188);

					}

					}
					break;
				case 2 :
					// Pddl.g:350:36: daEffect
					{
					pushFollow(FOLLOW_daEffect_in_daDefBody2074);
					daEffect189=daEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_daEffect.add(daEffect189.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: daLogicExpr, daEffect, durationConstraint
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 351:2: -> ^( DURATION durationConstraint ) ^( CONDITION ( daLogicExpr )? ) ^( EFFECT daEffect )
			{
				// Pddl.g:351:5: ^( DURATION durationConstraint )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DURATION, "DURATION"), root_1);
				adaptor.addChild(root_1, stream_durationConstraint.nextTree());
				adaptor.addChild(root_0, root_1);
				}

				// Pddl.g:351:36: ^( CONDITION ( daLogicExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_1);
				// Pddl.g:351:48: ( daLogicExpr )?
				if ( stream_daLogicExpr.hasNext() ) {
					adaptor.addChild(root_1, stream_daLogicExpr.nextTree());
				}
				stream_daLogicExpr.reset();

				adaptor.addChild(root_0, root_1);
				}

				// Pddl.g:351:62: ^( EFFECT daEffect )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EFFECT, "EFFECT"), root_1);
				adaptor.addChild(root_1, stream_daEffect.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daDefBody"


	public static class daLogicExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daLogicExpr"
	// Pddl.g:357:1: daLogicExpr : ( prefTimedGD | '(' 'and' ( daLogicExpr )* ')' -> ^( AND_EXP ( daLogicExpr )* ) | '(' 'forall' '(' typedVariableList ')' daLogicExpr ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) daLogicExpr ) );
	public final PddlParser.daLogicExpr_return daLogicExpr() throws RecognitionException {
		PddlParser.daLogicExpr_return retval = new PddlParser.daLogicExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal191=null;
		Token string_literal192=null;
		Token char_literal194=null;
		Token char_literal195=null;
		Token string_literal196=null;
		Token char_literal197=null;
		Token char_literal199=null;
		Token char_literal201=null;
		ParserRuleReturnScope prefTimedGD190 =null;
		ParserRuleReturnScope daLogicExpr193 =null;
		ParserRuleReturnScope typedVariableList198 =null;
		ParserRuleReturnScope daLogicExpr200 =null;

		Object char_literal191_tree=null;
		Object string_literal192_tree=null;
		Object char_literal194_tree=null;
		Object char_literal195_tree=null;
		Object string_literal196_tree=null;
		Object char_literal197_tree=null;
		Object char_literal199_tree=null;
		Object char_literal201_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_daLogicExpr=new RewriteRuleSubtreeStream(adaptor,"rule daLogicExpr");

		try {
			// Pddl.g:358:2: ( prefTimedGD | '(' 'and' ( daLogicExpr )* ')' -> ^( AND_EXP ( daLogicExpr )* ) | '(' 'forall' '(' typedVariableList ')' daLogicExpr ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) daLogicExpr ) )
			int alt49=3;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==77) ) {
				switch ( input.LA(2) ) {
				case 114:
				case 132:
				case 133:
					{
					alt49=1;
					}
					break;
				case 112:
					{
					alt49=2;
					}
					break;
				case 122:
					{
					alt49=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// Pddl.g:359:2: prefTimedGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_prefTimedGD_in_daLogicExpr2119);
					prefTimedGD190=prefTimedGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prefTimedGD190.getTree());

					}
					break;
				case 2 :
					// Pddl.g:360:4: '(' 'and' ( daLogicExpr )* ')'
					{
					char_literal191=(Token)match(input,77,FOLLOW_77_in_daLogicExpr2124); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal191);

					string_literal192=(Token)match(input,112,FOLLOW_112_in_daLogicExpr2126); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal192);

					// Pddl.g:360:14: ( daLogicExpr )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==77) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// Pddl.g:360:14: daLogicExpr
							{
							pushFollow(FOLLOW_daLogicExpr_in_daLogicExpr2128);
							daLogicExpr193=daLogicExpr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_daLogicExpr.add(daLogicExpr193.getTree());
							}
							break;

						default :
							break loop48;
						}
					}

					char_literal194=(Token)match(input,78,FOLLOW_78_in_daLogicExpr2131); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal194);

					// AST REWRITE
					// elements: daLogicExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 361:4: -> ^( AND_EXP ( daLogicExpr )* )
					{
						// Pddl.g:361:7: ^( AND_EXP ( daLogicExpr )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EXP, "AND_EXP"), root_1);
						// Pddl.g:361:17: ( daLogicExpr )*
						while ( stream_daLogicExpr.hasNext() ) {
							adaptor.addChild(root_1, stream_daLogicExpr.nextTree());
						}
						stream_daLogicExpr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:362:4: '(' 'forall' '(' typedVariableList ')' daLogicExpr ')'
					{
					char_literal195=(Token)match(input,77,FOLLOW_77_in_daLogicExpr2149); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal195);

					string_literal196=(Token)match(input,122,FOLLOW_122_in_daLogicExpr2151); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_122.add(string_literal196);

					char_literal197=(Token)match(input,77,FOLLOW_77_in_daLogicExpr2153); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal197);

					pushFollow(FOLLOW_typedVariableList_in_daLogicExpr2155);
					typedVariableList198=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList198.getTree());
					char_literal199=(Token)match(input,78,FOLLOW_78_in_daLogicExpr2157); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal199);

					pushFollow(FOLLOW_daLogicExpr_in_daLogicExpr2159);
					daLogicExpr200=daLogicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_daLogicExpr.add(daLogicExpr200.getTree());
					char_literal201=(Token)match(input,78,FOLLOW_78_in_daLogicExpr2161); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal201);

					// AST REWRITE
					// elements: daLogicExpr, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 363:4: -> ^( FORALL_EXP ^( PARAMS typedVariableList ) daLogicExpr )
					{
						// Pddl.g:363:7: ^( FORALL_EXP ^( PARAMS typedVariableList ) daLogicExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EXP, "FORALL_EXP"), root_1);
						// Pddl.g:363:20: ^( PARAMS typedVariableList )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						adaptor.addChild(root_2, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_daLogicExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daLogicExpr"


	public static class prefTimedGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prefTimedGD"
	// Pddl.g:367:1: prefTimedGD : ( timedExp -> ^( TIMED_EXP ^( EXP_NAME UNDEFINED ) timedExp ) | '(' 'preference' ( NAME )? timedExp ')' -> ^( TIMED_EXP ^( EXP_NAME ( NAME )? ) timedExp ) );
	public final PddlParser.prefTimedGD_return prefTimedGD() throws RecognitionException {
		PddlParser.prefTimedGD_return retval = new PddlParser.prefTimedGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal203=null;
		Token string_literal204=null;
		Token NAME205=null;
		Token char_literal207=null;
		ParserRuleReturnScope timedExp202 =null;
		ParserRuleReturnScope timedExp206 =null;

		Object char_literal203_tree=null;
		Object string_literal204_tree=null;
		Object NAME205_tree=null;
		Object char_literal207_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_timedExp=new RewriteRuleSubtreeStream(adaptor,"rule timedExp");

		try {
			// Pddl.g:368:2: ( timedExp -> ^( TIMED_EXP ^( EXP_NAME UNDEFINED ) timedExp ) | '(' 'preference' ( NAME )? timedExp ')' -> ^( TIMED_EXP ^( EXP_NAME ( NAME )? ) timedExp ) )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==77) ) {
				int LA51_1 = input.LA(2);
				if ( (LA51_1==114||LA51_1==132) ) {
					alt51=1;
				}
				else if ( (LA51_1==133) ) {
					alt51=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 51, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// Pddl.g:368:4: timedExp
					{
					pushFollow(FOLLOW_timedExp_in_prefTimedGD2190);
					timedExp202=timedExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExp.add(timedExp202.getTree());
					// AST REWRITE
					// elements: timedExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 368:13: -> ^( TIMED_EXP ^( EXP_NAME UNDEFINED ) timedExp )
					{
						// Pddl.g:368:16: ^( TIMED_EXP ^( EXP_NAME UNDEFINED ) timedExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIMED_EXP, "TIMED_EXP"), root_1);
						// Pddl.g:368:28: ^( EXP_NAME UNDEFINED )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_NAME, "EXP_NAME"), root_2);
						adaptor.addChild(root_2, (Object)adaptor.create(UNDEFINED, "UNDEFINED"));
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_timedExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:369:4: '(' 'preference' ( NAME )? timedExp ')'
					{
					char_literal203=(Token)match(input,77,FOLLOW_77_in_prefTimedGD2210); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal203);

					string_literal204=(Token)match(input,133,FOLLOW_133_in_prefTimedGD2212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_133.add(string_literal204);

					// Pddl.g:369:21: ( NAME )?
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==NAME) ) {
						alt50=1;
					}
					switch (alt50) {
						case 1 :
							// Pddl.g:369:21: NAME
							{
							NAME205=(Token)match(input,NAME,FOLLOW_NAME_in_prefTimedGD2214); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NAME.add(NAME205);

							}
							break;

					}

					pushFollow(FOLLOW_timedExp_in_prefTimedGD2217);
					timedExp206=timedExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExp.add(timedExp206.getTree());
					char_literal207=(Token)match(input,78,FOLLOW_78_in_prefTimedGD2219); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal207);

					// AST REWRITE
					// elements: NAME, timedExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 369:40: -> ^( TIMED_EXP ^( EXP_NAME ( NAME )? ) timedExp )
					{
						// Pddl.g:369:43: ^( TIMED_EXP ^( EXP_NAME ( NAME )? ) timedExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIMED_EXP, "TIMED_EXP"), root_1);
						// Pddl.g:369:55: ^( EXP_NAME ( NAME )? )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_NAME, "EXP_NAME"), root_2);
						// Pddl.g:369:66: ( NAME )?
						if ( stream_NAME.hasNext() ) {
							adaptor.addChild(root_2, stream_NAME.nextNode());
						}
						stream_NAME.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_timedExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prefTimedGD"


	public static class timedExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timedExp"
	// Pddl.g:372:1: timedExp : ( '(' ! 'at' ! timeSpecifier logicExpr ')' !| '(' ! 'over' ! interval logicExpr ')' !);
	public final PddlParser.timedExp_return timedExp() throws RecognitionException {
		PddlParser.timedExp_return retval = new PddlParser.timedExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal208=null;
		Token string_literal209=null;
		Token char_literal212=null;
		Token char_literal213=null;
		Token string_literal214=null;
		Token char_literal217=null;
		ParserRuleReturnScope timeSpecifier210 =null;
		ParserRuleReturnScope logicExpr211 =null;
		ParserRuleReturnScope interval215 =null;
		ParserRuleReturnScope logicExpr216 =null;

		Object char_literal208_tree=null;
		Object string_literal209_tree=null;
		Object char_literal212_tree=null;
		Object char_literal213_tree=null;
		Object string_literal214_tree=null;
		Object char_literal217_tree=null;

		try {
			// Pddl.g:373:2: ( '(' ! 'at' ! timeSpecifier logicExpr ')' !| '(' ! 'over' ! interval logicExpr ')' !)
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==77) ) {
				int LA52_1 = input.LA(2);
				if ( (LA52_1==114) ) {
					alt52=1;
				}
				else if ( (LA52_1==132) ) {
					alt52=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// Pddl.g:373:4: '(' ! 'at' ! timeSpecifier logicExpr ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal208=(Token)match(input,77,FOLLOW_77_in_timedExp2245); if (state.failed) return retval;
					string_literal209=(Token)match(input,114,FOLLOW_114_in_timedExp2248); if (state.failed) return retval;
					pushFollow(FOLLOW_timeSpecifier_in_timedExp2251);
					timeSpecifier210=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timeSpecifier210.getTree());

					pushFollow(FOLLOW_logicExpr_in_timedExp2253);
					logicExpr211=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr211.getTree());

					char_literal212=(Token)match(input,78,FOLLOW_78_in_timedExp2255); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Pddl.g:374:4: '(' ! 'over' ! interval logicExpr ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal213=(Token)match(input,77,FOLLOW_77_in_timedExp2261); if (state.failed) return retval;
					string_literal214=(Token)match(input,132,FOLLOW_132_in_timedExp2264); if (state.failed) return retval;
					pushFollow(FOLLOW_interval_in_timedExp2267);
					interval215=interval();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interval215.getTree());

					pushFollow(FOLLOW_logicExpr_in_timedExp2269);
					logicExpr216=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr216.getTree());

					char_literal217=(Token)match(input,78,FOLLOW_78_in_timedExp2271); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedExp"


	public static class timeSpecifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timeSpecifier"
	// Pddl.g:377:1: timeSpecifier : ( 'start' | 'end' );
	public final PddlParser.timeSpecifier_return timeSpecifier() throws RecognitionException {
		PddlParser.timeSpecifier_return retval = new PddlParser.timeSpecifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set218=null;

		Object set218_tree=null;

		try {
			// Pddl.g:377:15: ( 'start' | 'end' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set218=input.LT(1);
			if ( input.LA(1)==120||input.LA(1)==140 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set218));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timeSpecifier"


	public static class interval_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "interval"
	// Pddl.g:378:1: interval : 'all' ;
	public final PddlParser.interval_return interval() throws RecognitionException {
		PddlParser.interval_return retval = new PddlParser.interval_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal219=null;

		Object string_literal219_tree=null;

		try {
			// Pddl.g:378:10: ( 'all' )
			// Pddl.g:378:12: 'all'
			{
			root_0 = (Object)adaptor.nil();


			string_literal219=(Token)match(input,109,FOLLOW_109_in_interval2294); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal219_tree = (Object)adaptor.create(string_literal219);
			adaptor.addChild(root_0, string_literal219_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interval"


	public static class derivedDef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "derivedDef"
	// Pddl.g:382:1: derivedDef : '(' ! ':derived' ^ typedVariableList logicExpr ')' !;
	public final PddlParser.derivedDef_return derivedDef() throws RecognitionException {
		PddlParser.derivedDef_return retval = new PddlParser.derivedDef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal220=null;
		Token string_literal221=null;
		Token char_literal224=null;
		ParserRuleReturnScope typedVariableList222 =null;
		ParserRuleReturnScope logicExpr223 =null;

		Object char_literal220_tree=null;
		Object string_literal221_tree=null;
		Object char_literal224_tree=null;

		try {
			// Pddl.g:383:2: ( '(' ! ':derived' ^ typedVariableList logicExpr ')' !)
			// Pddl.g:383:4: '(' ! ':derived' ^ typedVariableList logicExpr ')' !
			{
			root_0 = (Object)adaptor.nil();


			char_literal220=(Token)match(input,77,FOLLOW_77_in_derivedDef2307); if (state.failed) return retval;
			string_literal221=(Token)match(input,87,FOLLOW_87_in_derivedDef2310); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal221_tree = (Object)adaptor.create(string_literal221);
			root_0 = (Object)adaptor.becomeRoot(string_literal221_tree, root_0);
			}

			pushFollow(FOLLOW_typedVariableList_in_derivedDef2313);
			typedVariableList222=typedVariableList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList222.getTree());

			pushFollow(FOLLOW_logicExpr_in_derivedDef2315);
			logicExpr223=logicExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr223.getTree());

			char_literal224=(Token)match(input,78,FOLLOW_78_in_derivedDef2317); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "derivedDef"


	public static class fExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExp"
	// Pddl.g:388:1: fExp : ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead );
	public final PddlParser.fExp_return fExp() throws RecognitionException {
		PddlParser.fExp_return retval = new PddlParser.fExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUMBER225=null;
		Token char_literal226=null;
		Token char_literal230=null;
		Token char_literal231=null;
		Token char_literal232=null;
		Token char_literal234=null;
		ParserRuleReturnScope binaryOp227 =null;
		ParserRuleReturnScope fExp228 =null;
		ParserRuleReturnScope fExp2229 =null;
		ParserRuleReturnScope fExp233 =null;
		ParserRuleReturnScope fHead235 =null;

		Object NUMBER225_tree=null;
		Object char_literal226_tree=null;
		Object char_literal230_tree=null;
		Object char_literal231_tree=null;
		Object char_literal232_tree=null;
		Object char_literal234_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
		RewriteRuleSubtreeStream stream_fExp2=new RewriteRuleSubtreeStream(adaptor,"rule fExp2");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");

		try {
			// Pddl.g:389:2: ( NUMBER | '(' binaryOp fExp fExp2 ')' -> ^( BINARY_OP binaryOp fExp fExp2 ) | '(' '-' fExp ')' -> ^( UNARY_MINUS fExp ) | fHead )
			int alt53=4;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt53=1;
				}
				break;
			case 77:
				{
				int LA53_2 = input.LA(2);
				if ( (synpred71_Pddl()) ) {
					alt53=2;
				}
				else if ( (synpred72_Pddl()) ) {
					alt53=3;
				}
				else if ( (true) ) {
					alt53=4;
				}

				}
				break;
			case NAME:
				{
				alt53=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// Pddl.g:389:4: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER225=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_fExp2332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER225_tree = (Object)adaptor.create(NUMBER225);
					adaptor.addChild(root_0, NUMBER225_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:390:4: '(' binaryOp fExp fExp2 ')'
					{
					char_literal226=(Token)match(input,77,FOLLOW_77_in_fExp2337); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal226);

					pushFollow(FOLLOW_binaryOp_in_fExp2339);
					binaryOp227=binaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp227.getTree());
					pushFollow(FOLLOW_fExp_in_fExp2341);
					fExp228=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp228.getTree());
					pushFollow(FOLLOW_fExp2_in_fExp2343);
					fExp2229=fExp2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp2.add(fExp2229.getTree());
					char_literal230=(Token)match(input,78,FOLLOW_78_in_fExp2345); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal230);

					// AST REWRITE
					// elements: binaryOp, fExp2, fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 390:32: -> ^( BINARY_OP binaryOp fExp fExp2 )
					{
						// Pddl.g:390:35: ^( BINARY_OP binaryOp fExp fExp2 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);
						adaptor.addChild(root_1, stream_binaryOp.nextTree());
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_1, stream_fExp2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:391:4: '(' '-' fExp ')'
					{
					char_literal231=(Token)match(input,77,FOLLOW_77_in_fExp2362); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal231);

					char_literal232=(Token)match(input,81,FOLLOW_81_in_fExp2364); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(char_literal232);

					pushFollow(FOLLOW_fExp_in_fExp2366);
					fExp233=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp233.getTree());
					char_literal234=(Token)match(input,78,FOLLOW_78_in_fExp2368); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal234);

					// AST REWRITE
					// elements: fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 391:21: -> ^( UNARY_MINUS fExp )
					{
						// Pddl.g:391:24: ^( UNARY_MINUS fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:392:4: fHead
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fHead_in_fExp2381);
					fHead235=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fHead235.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExp"


	public static class fExp2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExp2"
	// Pddl.g:397:1: fExp2 : fExp ;
	public final PddlParser.fExp2_return fExp2() throws RecognitionException {
		PddlParser.fExp2_return retval = new PddlParser.fExp2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope fExp236 =null;


		try {
			// Pddl.g:397:7: ( fExp )
			// Pddl.g:397:9: fExp
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_fExp_in_fExp22393);
			fExp236=fExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp236.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExp2"


	public static class fHead_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fHead"
	// Pddl.g:399:1: fHead : ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ^( PARAMS ( term )* ) ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) );
	public final PddlParser.fHead_return fHead() throws RecognitionException {
		PddlParser.fHead_return retval = new PddlParser.fHead_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal237=null;
		Token char_literal240=null;
		ParserRuleReturnScope functionSymbol238 =null;
		ParserRuleReturnScope term239 =null;
		ParserRuleReturnScope functionSymbol241 =null;

		Object char_literal237_tree=null;
		Object char_literal240_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
		RewriteRuleSubtreeStream stream_functionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule functionSymbol");

		try {
			// Pddl.g:400:2: ( '(' functionSymbol ( term )* ')' -> ^( FUNC_HEAD functionSymbol ^( PARAMS ( term )* ) ) | functionSymbol -> ^( FUNC_HEAD functionSymbol ) )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==77) ) {
				alt55=1;
			}
			else if ( (LA55_0==NAME) ) {
				alt55=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// Pddl.g:400:4: '(' functionSymbol ( term )* ')'
					{
					char_literal237=(Token)match(input,77,FOLLOW_77_in_fHead2403); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal237);

					pushFollow(FOLLOW_functionSymbol_in_fHead2405);
					functionSymbol238=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol238.getTree());
					// Pddl.g:400:23: ( term )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==NAME||LA54_0==NUMBER||LA54_0==VARIABLE||LA54_0==77) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// Pddl.g:400:23: term
							{
							pushFollow(FOLLOW_term_in_fHead2407);
							term239=term();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_term.add(term239.getTree());
							}
							break;

						default :
							break loop54;
						}
					}

					char_literal240=(Token)match(input,78,FOLLOW_78_in_fHead2410); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal240);

					// AST REWRITE
					// elements: term, functionSymbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 400:33: -> ^( FUNC_HEAD functionSymbol ^( PARAMS ( term )* ) )
					{
						// Pddl.g:400:36: ^( FUNC_HEAD functionSymbol ^( PARAMS ( term )* ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);
						adaptor.addChild(root_1, stream_functionSymbol.nextTree());
						// Pddl.g:400:63: ^( PARAMS ( term )* )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						// Pddl.g:400:72: ( term )*
						while ( stream_term.hasNext() ) {
							adaptor.addChild(root_2, stream_term.nextTree());
						}
						stream_term.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:401:4: functionSymbol
					{
					pushFollow(FOLLOW_functionSymbol_in_fHead2431);
					functionSymbol241=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol241.getTree());
					// AST REWRITE
					// elements: functionSymbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 401:19: -> ^( FUNC_HEAD functionSymbol )
					{
						// Pddl.g:401:22: ^( FUNC_HEAD functionSymbol )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);
						adaptor.addChild(root_1, stream_functionSymbol.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fHead"


	public static class effect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "effect"
	// Pddl.g:405:1: effect : ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect );
	public final PddlParser.effect_return effect() throws RecognitionException {
		PddlParser.effect_return retval = new PddlParser.effect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal242=null;
		Token string_literal243=null;
		Token char_literal245=null;
		ParserRuleReturnScope cEffect244 =null;
		ParserRuleReturnScope cEffect246 =null;

		Object char_literal242_tree=null;
		Object string_literal243_tree=null;
		Object char_literal245_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleSubtreeStream stream_cEffect=new RewriteRuleSubtreeStream(adaptor,"rule cEffect");

		try {
			// Pddl.g:406:2: ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==77) ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1==112) ) {
					alt57=1;
				}
				else if ( (LA57_1==NAME||(LA57_1 >= 113 && LA57_1 <= 114)||LA57_1==116||LA57_1==122||LA57_1==126||LA57_1==130||(LA57_1 >= 135 && LA57_1 <= 136)||LA57_1==142) ) {
					alt57=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// Pddl.g:406:4: '(' 'and' ( cEffect )* ')'
					{
					char_literal242=(Token)match(input,77,FOLLOW_77_in_effect2451); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal242);

					string_literal243=(Token)match(input,112,FOLLOW_112_in_effect2453); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal243);

					// Pddl.g:406:14: ( cEffect )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==77) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// Pddl.g:406:14: cEffect
							{
							pushFollow(FOLLOW_cEffect_in_effect2455);
							cEffect244=cEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_cEffect.add(cEffect244.getTree());
							}
							break;

						default :
							break loop56;
						}
					}

					char_literal245=(Token)match(input,78,FOLLOW_78_in_effect2458); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal245);

					// AST REWRITE
					// elements: cEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 406:27: -> ^( AND_EFFECT ( cEffect )* )
					{
						// Pddl.g:406:30: ^( AND_EFFECT ( cEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// Pddl.g:406:43: ( cEffect )*
						while ( stream_cEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_cEffect.nextTree());
						}
						stream_cEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:407:4: cEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cEffect_in_effect2472);
					cEffect246=cEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cEffect246.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "effect"


	public static class cEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cEffect"
	// Pddl.g:410:1: cEffect : ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) effect ) | '(' 'when' logicExpr condEffect ')' -> ^( WHEN_EXP logicExpr condEffect ) | pEffect );
	public final PddlParser.cEffect_return cEffect() throws RecognitionException {
		PddlParser.cEffect_return retval = new PddlParser.cEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal247=null;
		Token string_literal248=null;
		Token char_literal249=null;
		Token char_literal251=null;
		Token char_literal253=null;
		Token char_literal254=null;
		Token string_literal255=null;
		Token char_literal258=null;
		ParserRuleReturnScope typedVariableList250 =null;
		ParserRuleReturnScope effect252 =null;
		ParserRuleReturnScope logicExpr256 =null;
		ParserRuleReturnScope condEffect257 =null;
		ParserRuleReturnScope pEffect259 =null;

		Object char_literal247_tree=null;
		Object string_literal248_tree=null;
		Object char_literal249_tree=null;
		Object char_literal251_tree=null;
		Object char_literal253_tree=null;
		Object char_literal254_tree=null;
		Object string_literal255_tree=null;
		Object char_literal258_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_effect=new RewriteRuleSubtreeStream(adaptor,"rule effect");
		RewriteRuleSubtreeStream stream_logicExpr=new RewriteRuleSubtreeStream(adaptor,"rule logicExpr");
		RewriteRuleSubtreeStream stream_condEffect=new RewriteRuleSubtreeStream(adaptor,"rule condEffect");

		try {
			// Pddl.g:411:2: ( '(' 'forall' '(' typedVariableList ')' effect ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) effect ) | '(' 'when' logicExpr condEffect ')' -> ^( WHEN_EXP logicExpr condEffect ) | pEffect )
			int alt58=3;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==77) ) {
				switch ( input.LA(2) ) {
				case 122:
					{
					alt58=1;
					}
					break;
				case 142:
					{
					alt58=2;
					}
					break;
				case NAME:
				case 113:
				case 114:
				case 116:
				case 126:
				case 130:
				case 135:
				case 136:
					{
					alt58=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// Pddl.g:411:4: '(' 'forall' '(' typedVariableList ')' effect ')'
					{
					char_literal247=(Token)match(input,77,FOLLOW_77_in_cEffect2483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal247);

					string_literal248=(Token)match(input,122,FOLLOW_122_in_cEffect2485); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_122.add(string_literal248);

					char_literal249=(Token)match(input,77,FOLLOW_77_in_cEffect2487); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal249);

					pushFollow(FOLLOW_typedVariableList_in_cEffect2489);
					typedVariableList250=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList250.getTree());
					char_literal251=(Token)match(input,78,FOLLOW_78_in_cEffect2491); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal251);

					pushFollow(FOLLOW_effect_in_cEffect2493);
					effect252=effect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_effect.add(effect252.getTree());
					char_literal253=(Token)match(input,78,FOLLOW_78_in_cEffect2495); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal253);

					// AST REWRITE
					// elements: effect, typedVariableList
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 412:4: -> ^( FORALL_EXP ^( PARAMS typedVariableList ) effect )
					{
						// Pddl.g:412:7: ^( FORALL_EXP ^( PARAMS typedVariableList ) effect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EXP, "FORALL_EXP"), root_1);
						// Pddl.g:412:20: ^( PARAMS typedVariableList )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						adaptor.addChild(root_2, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_effect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:413:4: '(' 'when' logicExpr condEffect ')'
					{
					char_literal254=(Token)match(input,77,FOLLOW_77_in_cEffect2517); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal254);

					string_literal255=(Token)match(input,142,FOLLOW_142_in_cEffect2519); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_142.add(string_literal255);

					pushFollow(FOLLOW_logicExpr_in_cEffect2521);
					logicExpr256=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr256.getTree());
					pushFollow(FOLLOW_condEffect_in_cEffect2523);
					condEffect257=condEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condEffect.add(condEffect257.getTree());
					char_literal258=(Token)match(input,78,FOLLOW_78_in_cEffect2525); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal258);

					// AST REWRITE
					// elements: logicExpr, condEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 414:4: -> ^( WHEN_EXP logicExpr condEffect )
					{
						// Pddl.g:414:7: ^( WHEN_EXP logicExpr condEffect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN_EXP, "WHEN_EXP"), root_1);
						adaptor.addChild(root_1, stream_logicExpr.nextTree());
						adaptor.addChild(root_1, stream_condEffect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:415:4: pEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pEffect_in_cEffect2543);
					pEffect259=pEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect259.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cEffect"


	public static class pEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pEffect"
	// Pddl.g:418:1: pEffect : ( '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula | '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' assignOp fHead term ')' -> ^( ASSIGN_EFFECT assignOp fHead term ) | '(' assignOp fHead UNDEFINED ')' -> ^( ASSIGN_EFFECT assignOp fHead UNDEFINED ) );
	public final PddlParser.pEffect_return pEffect() throws RecognitionException {
		PddlParser.pEffect_return retval = new PddlParser.pEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal260=null;
		Token string_literal261=null;
		Token char_literal263=null;
		Token char_literal265=null;
		Token char_literal269=null;
		Token char_literal270=null;
		Token char_literal274=null;
		Token char_literal275=null;
		Token UNDEFINED278=null;
		Token char_literal279=null;
		ParserRuleReturnScope atomicTermFormula262 =null;
		ParserRuleReturnScope atomicTermFormula264 =null;
		ParserRuleReturnScope assignOp266 =null;
		ParserRuleReturnScope fHead267 =null;
		ParserRuleReturnScope fExp268 =null;
		ParserRuleReturnScope assignOp271 =null;
		ParserRuleReturnScope fHead272 =null;
		ParserRuleReturnScope term273 =null;
		ParserRuleReturnScope assignOp276 =null;
		ParserRuleReturnScope fHead277 =null;

		Object char_literal260_tree=null;
		Object string_literal261_tree=null;
		Object char_literal263_tree=null;
		Object char_literal265_tree=null;
		Object char_literal269_tree=null;
		Object char_literal270_tree=null;
		Object char_literal274_tree=null;
		Object char_literal275_tree=null;
		Object UNDEFINED278_tree=null;
		Object char_literal279_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_UNDEFINED=new RewriteRuleTokenStream(adaptor,"token UNDEFINED");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_atomicTermFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicTermFormula");
		RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
		RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");

		try {
			// Pddl.g:419:2: ( '(' 'not' atomicTermFormula ')' -> ^( NOT_EFFECT atomicTermFormula ) | atomicTermFormula | '(' assignOp fHead fExp ')' -> ^( ASSIGN_EFFECT assignOp fHead fExp ) | '(' assignOp fHead term ')' -> ^( ASSIGN_EFFECT assignOp fHead term ) | '(' assignOp fHead UNDEFINED ')' -> ^( ASSIGN_EFFECT assignOp fHead UNDEFINED ) )
			int alt59=5;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==77) ) {
				int LA59_1 = input.LA(2);
				if ( (synpred79_Pddl()) ) {
					alt59=1;
				}
				else if ( (synpred80_Pddl()) ) {
					alt59=2;
				}
				else if ( (synpred81_Pddl()) ) {
					alt59=3;
				}
				else if ( (synpred82_Pddl()) ) {
					alt59=4;
				}
				else if ( (true) ) {
					alt59=5;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// Pddl.g:419:4: '(' 'not' atomicTermFormula ')'
					{
					char_literal260=(Token)match(input,77,FOLLOW_77_in_pEffect2554); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal260);

					string_literal261=(Token)match(input,130,FOLLOW_130_in_pEffect2556); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(string_literal261);

					pushFollow(FOLLOW_atomicTermFormula_in_pEffect2558);
					atomicTermFormula262=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicTermFormula.add(atomicTermFormula262.getTree());
					char_literal263=(Token)match(input,78,FOLLOW_78_in_pEffect2560); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal263);

					// AST REWRITE
					// elements: atomicTermFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 420:4: -> ^( NOT_EFFECT atomicTermFormula )
					{
						// Pddl.g:420:7: ^( NOT_EFFECT atomicTermFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_EFFECT, "NOT_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_atomicTermFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:421:4: atomicTermFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicTermFormula_in_pEffect2576);
					atomicTermFormula264=atomicTermFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicTermFormula264.getTree());

					}
					break;
				case 3 :
					// Pddl.g:422:4: '(' assignOp fHead fExp ')'
					{
					char_literal265=(Token)match(input,77,FOLLOW_77_in_pEffect2581); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal265);

					pushFollow(FOLLOW_assignOp_in_pEffect2583);
					assignOp266=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignOp.add(assignOp266.getTree());
					pushFollow(FOLLOW_fHead_in_pEffect2585);
					fHead267=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead267.getTree());
					pushFollow(FOLLOW_fExp_in_pEffect2587);
					fExp268=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp268.getTree());
					char_literal269=(Token)match(input,78,FOLLOW_78_in_pEffect2589); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal269);

					// AST REWRITE
					// elements: fHead, assignOp, fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 423:4: -> ^( ASSIGN_EFFECT assignOp fHead fExp )
					{
						// Pddl.g:423:7: ^( ASSIGN_EFFECT assignOp fHead fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_assignOp.nextTree());
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:424:4: '(' assignOp fHead term ')'
					{
					char_literal270=(Token)match(input,77,FOLLOW_77_in_pEffect2609); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal270);

					pushFollow(FOLLOW_assignOp_in_pEffect2611);
					assignOp271=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignOp.add(assignOp271.getTree());
					pushFollow(FOLLOW_fHead_in_pEffect2613);
					fHead272=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead272.getTree());
					pushFollow(FOLLOW_term_in_pEffect2615);
					term273=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_term.add(term273.getTree());
					char_literal274=(Token)match(input,78,FOLLOW_78_in_pEffect2617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal274);

					// AST REWRITE
					// elements: term, assignOp, fHead
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 425:4: -> ^( ASSIGN_EFFECT assignOp fHead term )
					{
						// Pddl.g:425:7: ^( ASSIGN_EFFECT assignOp fHead term )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_assignOp.nextTree());
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_term.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Pddl.g:426:4: '(' assignOp fHead UNDEFINED ')'
					{
					char_literal275=(Token)match(input,77,FOLLOW_77_in_pEffect2637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal275);

					pushFollow(FOLLOW_assignOp_in_pEffect2639);
					assignOp276=assignOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignOp.add(assignOp276.getTree());
					pushFollow(FOLLOW_fHead_in_pEffect2641);
					fHead277=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead277.getTree());
					UNDEFINED278=(Token)match(input,UNDEFINED,FOLLOW_UNDEFINED_in_pEffect2643); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UNDEFINED.add(UNDEFINED278);

					char_literal279=(Token)match(input,78,FOLLOW_78_in_pEffect2645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal279);

					// AST REWRITE
					// elements: assignOp, fHead, UNDEFINED
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 427:4: -> ^( ASSIGN_EFFECT assignOp fHead UNDEFINED )
					{
						// Pddl.g:427:7: ^( ASSIGN_EFFECT assignOp fHead UNDEFINED )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_assignOp.nextTree());
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_UNDEFINED.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pEffect"


	public static class condEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condEffect"
	// Pddl.g:430:1: condEffect : ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect );
	public final PddlParser.condEffect_return condEffect() throws RecognitionException {
		PddlParser.condEffect_return retval = new PddlParser.condEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal280=null;
		Token string_literal281=null;
		Token char_literal283=null;
		ParserRuleReturnScope pEffect282 =null;
		ParserRuleReturnScope pEffect284 =null;

		Object char_literal280_tree=null;
		Object string_literal281_tree=null;
		Object char_literal283_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleSubtreeStream stream_pEffect=new RewriteRuleSubtreeStream(adaptor,"rule pEffect");

		try {
			// Pddl.g:431:2: ( '(' 'and' ( pEffect )* ')' -> ^( AND_EFFECT ( pEffect )* ) | pEffect )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==77) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==112) ) {
					alt61=1;
				}
				else if ( (LA61_1==NAME||(LA61_1 >= 113 && LA61_1 <= 114)||LA61_1==116||LA61_1==126||LA61_1==130||(LA61_1 >= 135 && LA61_1 <= 136)) ) {
					alt61=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// Pddl.g:431:4: '(' 'and' ( pEffect )* ')'
					{
					char_literal280=(Token)match(input,77,FOLLOW_77_in_condEffect2671); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal280);

					string_literal281=(Token)match(input,112,FOLLOW_112_in_condEffect2673); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal281);

					// Pddl.g:431:14: ( pEffect )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==77) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// Pddl.g:431:14: pEffect
							{
							pushFollow(FOLLOW_pEffect_in_condEffect2675);
							pEffect282=pEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_pEffect.add(pEffect282.getTree());
							}
							break;

						default :
							break loop60;
						}
					}

					char_literal283=(Token)match(input,78,FOLLOW_78_in_condEffect2678); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal283);

					// AST REWRITE
					// elements: pEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 431:27: -> ^( AND_EFFECT ( pEffect )* )
					{
						// Pddl.g:431:30: ^( AND_EFFECT ( pEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// Pddl.g:431:43: ( pEffect )*
						while ( stream_pEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_pEffect.nextTree());
						}
						stream_pEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:432:4: pEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_pEffect_in_condEffect2692);
					pEffect284=pEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pEffect284.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condEffect"


	public static class binaryOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binaryOp"
	// Pddl.g:435:1: binaryOp : ( '*' | '+' | '-' | '/' );
	public final PddlParser.binaryOp_return binaryOp() throws RecognitionException {
		PddlParser.binaryOp_return retval = new PddlParser.binaryOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set285=null;

		Object set285_tree=null;

		try {
			// Pddl.g:435:10: ( '*' | '+' | '-' | '/' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set285=input.LT(1);
			if ( (input.LA(1) >= 79 && input.LA(1) <= 82) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set285));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binaryOp"


	public static class binaryComp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binaryComp"
	// Pddl.g:437:1: binaryComp : ( '>' | '<' | '=' | '>=' | '<=' );
	public final PddlParser.binaryComp_return binaryComp() throws RecognitionException {
		PddlParser.binaryComp_return retval = new PddlParser.binaryComp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set286=null;

		Object set286_tree=null;

		try {
			// Pddl.g:437:12: ( '>' | '<' | '=' | '>=' | '<=' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set286=input.LT(1);
			if ( (input.LA(1) >= 103 && input.LA(1) <= 107) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set286));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binaryComp"


	public static class assignOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignOp"
	// Pddl.g:439:1: assignOp : ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' );
	public final PddlParser.assignOp_return assignOp() throws RecognitionException {
		PddlParser.assignOp_return retval = new PddlParser.assignOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set287=null;

		Object set287_tree=null;

		try {
			// Pddl.g:439:10: ( 'assign' | 'scale-up' | 'scale-down' | 'increase' | 'decrease' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set287=input.LT(1);
			if ( input.LA(1)==113||input.LA(1)==116||input.LA(1)==126||(input.LA(1) >= 135 && input.LA(1) <= 136) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set287));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignOp"


	public static class durationConstraint_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durationConstraint"
	// Pddl.g:444:1: durationConstraint : ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' -> ^( DUR_INDEFINITE ) | simpleDurationConstraint );
	public final PddlParser.durationConstraint_return durationConstraint() throws RecognitionException {
		PddlParser.durationConstraint_return retval = new PddlParser.durationConstraint_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal288=null;
		Token string_literal289=null;
		Token char_literal291=null;
		Token char_literal292=null;
		Token char_literal293=null;
		ParserRuleReturnScope simpleDurationConstraint290 =null;
		ParserRuleReturnScope simpleDurationConstraint294 =null;

		Object char_literal288_tree=null;
		Object string_literal289_tree=null;
		Object char_literal291_tree=null;
		Object char_literal292_tree=null;
		Object char_literal293_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");

		try {
			// Pddl.g:445:2: ( '(' 'and' ( simpleDurationConstraint )+ ')' | '(' ')' -> ^( DUR_INDEFINITE ) | simpleDurationConstraint )
			int alt63=3;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==77) ) {
				switch ( input.LA(2) ) {
				case 112:
					{
					alt63=1;
					}
					break;
				case 78:
					{
					alt63=2;
					}
					break;
				case 104:
				case 105:
				case 107:
				case 114:
					{
					alt63=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// Pddl.g:446:2: '(' 'and' ( simpleDurationConstraint )+ ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal288=(Token)match(input,77,FOLLOW_77_in_durationConstraint2780); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal288_tree = (Object)adaptor.create(char_literal288);
					adaptor.addChild(root_0, char_literal288_tree);
					}

					string_literal289=(Token)match(input,112,FOLLOW_112_in_durationConstraint2782); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal289_tree = (Object)adaptor.create(string_literal289);
					adaptor.addChild(root_0, string_literal289_tree);
					}

					// Pddl.g:446:12: ( simpleDurationConstraint )+
					int cnt62=0;
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==77) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// Pddl.g:446:12: simpleDurationConstraint
							{
							pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2784);
							simpleDurationConstraint290=simpleDurationConstraint();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint290.getTree());

							}
							break;

						default :
							if ( cnt62 >= 1 ) break loop62;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(62, input);
							throw eee;
						}
						cnt62++;
					}

					char_literal291=(Token)match(input,78,FOLLOW_78_in_durationConstraint2787); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal291_tree = (Object)adaptor.create(char_literal291);
					adaptor.addChild(root_0, char_literal291_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:448:2: '(' ')'
					{
					char_literal292=(Token)match(input,77,FOLLOW_77_in_durationConstraint2795); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal292);

					char_literal293=(Token)match(input,78,FOLLOW_78_in_durationConstraint2797); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal293);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 449:4: -> ^( DUR_INDEFINITE )
					{
						// Pddl.g:449:7: ^( DUR_INDEFINITE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DUR_INDEFINITE, "DUR_INDEFINITE"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:450:4: simpleDurationConstraint
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_simpleDurationConstraint_in_durationConstraint2811);
					simpleDurationConstraint294=simpleDurationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDurationConstraint294.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durationConstraint"


	public static class simpleDurationConstraint_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "simpleDurationConstraint"
	// Pddl.g:453:1: simpleDurationConstraint : ( '(' durOp '?duration' fExp ')' -> ^( DUR_VALUE durOp fExp ) | '(' 'at' timeSpecifier simpleDurationConstraint ')' -> ^( DUR_CONSTRAINTS timeSpecifier simpleDurationConstraint ) );
	public final PddlParser.simpleDurationConstraint_return simpleDurationConstraint() throws RecognitionException {
		PddlParser.simpleDurationConstraint_return retval = new PddlParser.simpleDurationConstraint_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal295=null;
		Token string_literal297=null;
		Token char_literal299=null;
		Token char_literal300=null;
		Token string_literal301=null;
		Token char_literal304=null;
		ParserRuleReturnScope durOp296 =null;
		ParserRuleReturnScope fExp298 =null;
		ParserRuleReturnScope timeSpecifier302 =null;
		ParserRuleReturnScope simpleDurationConstraint303 =null;

		Object char_literal295_tree=null;
		Object string_literal297_tree=null;
		Object char_literal299_tree=null;
		Object char_literal300_tree=null;
		Object string_literal301_tree=null;
		Object char_literal304_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleSubtreeStream stream_simpleDurationConstraint=new RewriteRuleSubtreeStream(adaptor,"rule simpleDurationConstraint");
		RewriteRuleSubtreeStream stream_timeSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule timeSpecifier");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");
		RewriteRuleSubtreeStream stream_durOp=new RewriteRuleSubtreeStream(adaptor,"rule durOp");

		try {
			// Pddl.g:454:2: ( '(' durOp '?duration' fExp ')' -> ^( DUR_VALUE durOp fExp ) | '(' 'at' timeSpecifier simpleDurationConstraint ')' -> ^( DUR_CONSTRAINTS timeSpecifier simpleDurationConstraint ) )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==77) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==114) ) {
					alt64=2;
				}
				else if ( ((LA64_1 >= 104 && LA64_1 <= 105)||LA64_1==107) ) {
					alt64=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// Pddl.g:454:4: '(' durOp '?duration' fExp ')'
					{
					char_literal295=(Token)match(input,77,FOLLOW_77_in_simpleDurationConstraint2822); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal295);

					pushFollow(FOLLOW_durOp_in_simpleDurationConstraint2824);
					durOp296=durOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_durOp.add(durOp296.getTree());
					string_literal297=(Token)match(input,108,FOLLOW_108_in_simpleDurationConstraint2826); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_108.add(string_literal297);

					pushFollow(FOLLOW_fExp_in_simpleDurationConstraint2828);
					fExp298=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp298.getTree());
					char_literal299=(Token)match(input,78,FOLLOW_78_in_simpleDurationConstraint2830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal299);

					// AST REWRITE
					// elements: durOp, fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 454:35: -> ^( DUR_VALUE durOp fExp )
					{
						// Pddl.g:454:38: ^( DUR_VALUE durOp fExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DUR_VALUE, "DUR_VALUE"), root_1);
						adaptor.addChild(root_1, stream_durOp.nextTree());
						adaptor.addChild(root_1, stream_fExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:455:4: '(' 'at' timeSpecifier simpleDurationConstraint ')'
					{
					char_literal300=(Token)match(input,77,FOLLOW_77_in_simpleDurationConstraint2845); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal300);

					string_literal301=(Token)match(input,114,FOLLOW_114_in_simpleDurationConstraint2847); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(string_literal301);

					pushFollow(FOLLOW_timeSpecifier_in_simpleDurationConstraint2849);
					timeSpecifier302=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timeSpecifier.add(timeSpecifier302.getTree());
					pushFollow(FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2851);
					simpleDurationConstraint303=simpleDurationConstraint();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_simpleDurationConstraint.add(simpleDurationConstraint303.getTree());
					char_literal304=(Token)match(input,78,FOLLOW_78_in_simpleDurationConstraint2853); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal304);

					// AST REWRITE
					// elements: timeSpecifier, simpleDurationConstraint
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 455:56: -> ^( DUR_CONSTRAINTS timeSpecifier simpleDurationConstraint )
					{
						// Pddl.g:455:59: ^( DUR_CONSTRAINTS timeSpecifier simpleDurationConstraint )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DUR_CONSTRAINTS, "DUR_CONSTRAINTS"), root_1);
						adaptor.addChild(root_1, stream_timeSpecifier.nextTree());
						adaptor.addChild(root_1, stream_simpleDurationConstraint.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleDurationConstraint"


	public static class durOp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "durOp"
	// Pddl.g:458:1: durOp : ( '<=' | '>=' | '=' );
	public final PddlParser.durOp_return durOp() throws RecognitionException {
		PddlParser.durOp_return retval = new PddlParser.durOp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set305=null;

		Object set305_tree=null;

		try {
			// Pddl.g:458:7: ( '<=' | '>=' | '=' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set305=input.LT(1);
			if ( (input.LA(1) >= 104 && input.LA(1) <= 105)||input.LA(1)==107 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set305));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durOp"


	public static class daEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "daEffect"
	// Pddl.g:460:1: daEffect : ( timedEffect | '(' 'and' ( daEffect )* ')' -> ^( AND_EFFECT ( daEffect )* ) | '(' 'forall' '(' typedVariableList ')' daEffect ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) daEffect ) | '(' 'when' daLogicExpr timedEffect ')' -> ^( WHEN_EXP daLogicExpr timedEffect ) );
	public final PddlParser.daEffect_return daEffect() throws RecognitionException {
		PddlParser.daEffect_return retval = new PddlParser.daEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal307=null;
		Token string_literal308=null;
		Token char_literal310=null;
		Token char_literal311=null;
		Token string_literal312=null;
		Token char_literal313=null;
		Token char_literal315=null;
		Token char_literal317=null;
		Token char_literal318=null;
		Token string_literal319=null;
		Token char_literal322=null;
		ParserRuleReturnScope timedEffect306 =null;
		ParserRuleReturnScope daEffect309 =null;
		ParserRuleReturnScope typedVariableList314 =null;
		ParserRuleReturnScope daEffect316 =null;
		ParserRuleReturnScope daLogicExpr320 =null;
		ParserRuleReturnScope timedEffect321 =null;

		Object char_literal307_tree=null;
		Object string_literal308_tree=null;
		Object char_literal310_tree=null;
		Object char_literal311_tree=null;
		Object string_literal312_tree=null;
		Object char_literal313_tree=null;
		Object char_literal315_tree=null;
		Object char_literal317_tree=null;
		Object char_literal318_tree=null;
		Object string_literal319_tree=null;
		Object char_literal322_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_142=new RewriteRuleTokenStream(adaptor,"token 142");
		RewriteRuleSubtreeStream stream_typedVariableList=new RewriteRuleSubtreeStream(adaptor,"rule typedVariableList");
		RewriteRuleSubtreeStream stream_daEffect=new RewriteRuleSubtreeStream(adaptor,"rule daEffect");
		RewriteRuleSubtreeStream stream_daLogicExpr=new RewriteRuleSubtreeStream(adaptor,"rule daLogicExpr");
		RewriteRuleSubtreeStream stream_timedEffect=new RewriteRuleSubtreeStream(adaptor,"rule timedEffect");

		try {
			// Pddl.g:461:2: ( timedEffect | '(' 'and' ( daEffect )* ')' -> ^( AND_EFFECT ( daEffect )* ) | '(' 'forall' '(' typedVariableList ')' daEffect ')' -> ^( FORALL_EXP ^( PARAMS typedVariableList ) daEffect ) | '(' 'when' daLogicExpr timedEffect ')' -> ^( WHEN_EXP daLogicExpr timedEffect ) )
			int alt66=4;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==77) ) {
				switch ( input.LA(2) ) {
				case 114:
				case 116:
				case 126:
				case 132:
					{
					alt66=1;
					}
					break;
				case 112:
					{
					alt66=2;
					}
					break;
				case 122:
					{
					alt66=3;
					}
					break;
				case 142:
					{
					alt66=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// Pddl.g:462:2: timedEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_timedEffect_in_daEffect2893);
					timedEffect306=timedEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, timedEffect306.getTree());

					}
					break;
				case 2 :
					// Pddl.g:463:4: '(' 'and' ( daEffect )* ')'
					{
					char_literal307=(Token)match(input,77,FOLLOW_77_in_daEffect2898); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal307);

					string_literal308=(Token)match(input,112,FOLLOW_112_in_daEffect2900); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal308);

					// Pddl.g:463:14: ( daEffect )*
					loop65:
					while (true) {
						int alt65=2;
						int LA65_0 = input.LA(1);
						if ( (LA65_0==77) ) {
							alt65=1;
						}

						switch (alt65) {
						case 1 :
							// Pddl.g:463:14: daEffect
							{
							pushFollow(FOLLOW_daEffect_in_daEffect2902);
							daEffect309=daEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_daEffect.add(daEffect309.getTree());
							}
							break;

						default :
							break loop65;
						}
					}

					char_literal310=(Token)match(input,78,FOLLOW_78_in_daEffect2905); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal310);

					// AST REWRITE
					// elements: daEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 464:5: -> ^( AND_EFFECT ( daEffect )* )
					{
						// Pddl.g:464:9: ^( AND_EFFECT ( daEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// Pddl.g:464:22: ( daEffect )*
						while ( stream_daEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_daEffect.nextTree());
						}
						stream_daEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:465:4: '(' 'forall' '(' typedVariableList ')' daEffect ')'
					{
					char_literal311=(Token)match(input,77,FOLLOW_77_in_daEffect2926); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal311);

					string_literal312=(Token)match(input,122,FOLLOW_122_in_daEffect2928); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_122.add(string_literal312);

					char_literal313=(Token)match(input,77,FOLLOW_77_in_daEffect2930); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal313);

					pushFollow(FOLLOW_typedVariableList_in_daEffect2932);
					typedVariableList314=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_typedVariableList.add(typedVariableList314.getTree());
					char_literal315=(Token)match(input,78,FOLLOW_78_in_daEffect2934); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal315);

					pushFollow(FOLLOW_daEffect_in_daEffect2936);
					daEffect316=daEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_daEffect.add(daEffect316.getTree());
					char_literal317=(Token)match(input,78,FOLLOW_78_in_daEffect2938); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal317);

					// AST REWRITE
					// elements: typedVariableList, daEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 466:4: -> ^( FORALL_EXP ^( PARAMS typedVariableList ) daEffect )
					{
						// Pddl.g:466:7: ^( FORALL_EXP ^( PARAMS typedVariableList ) daEffect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL_EXP, "FORALL_EXP"), root_1);
						// Pddl.g:466:20: ^( PARAMS typedVariableList )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						adaptor.addChild(root_2, stream_typedVariableList.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_daEffect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:467:4: '(' 'when' daLogicExpr timedEffect ')'
					{
					char_literal318=(Token)match(input,77,FOLLOW_77_in_daEffect2960); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal318);

					string_literal319=(Token)match(input,142,FOLLOW_142_in_daEffect2962); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_142.add(string_literal319);

					pushFollow(FOLLOW_daLogicExpr_in_daEffect2964);
					daLogicExpr320=daLogicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_daLogicExpr.add(daLogicExpr320.getTree());
					pushFollow(FOLLOW_timedEffect_in_daEffect2966);
					timedEffect321=timedEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedEffect.add(timedEffect321.getTree());
					char_literal322=(Token)match(input,78,FOLLOW_78_in_daEffect2968); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal322);

					// AST REWRITE
					// elements: daLogicExpr, timedEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 468:4: -> ^( WHEN_EXP daLogicExpr timedEffect )
					{
						// Pddl.g:468:7: ^( WHEN_EXP daLogicExpr timedEffect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN_EXP, "WHEN_EXP"), root_1);
						adaptor.addChild(root_1, stream_daLogicExpr.nextTree());
						adaptor.addChild(root_1, stream_timedEffect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "daEffect"


	public static class timedEffect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timedEffect"
	// Pddl.g:472:1: timedEffect : ( '(' 'at' timeSpecifier condEffect2 ')' -> ^( TIMED_EFFECT timeSpecifier condEffect2 ) | '(' 'over' interval condEffect ')' -> ^( TIMED_EFFECT interval condEffect ) | '(' assignOpT fHead fExpT ')' -> ^( ASSIGN_EFFECT assignOpT fHead fExpT ) );
	public final PddlParser.timedEffect_return timedEffect() throws RecognitionException {
		PddlParser.timedEffect_return retval = new PddlParser.timedEffect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal323=null;
		Token string_literal324=null;
		Token char_literal327=null;
		Token char_literal328=null;
		Token string_literal329=null;
		Token char_literal332=null;
		Token char_literal333=null;
		Token char_literal337=null;
		ParserRuleReturnScope timeSpecifier325 =null;
		ParserRuleReturnScope condEffect2326 =null;
		ParserRuleReturnScope interval330 =null;
		ParserRuleReturnScope condEffect331 =null;
		ParserRuleReturnScope assignOpT334 =null;
		ParserRuleReturnScope fHead335 =null;
		ParserRuleReturnScope fExpT336 =null;

		Object char_literal323_tree=null;
		Object string_literal324_tree=null;
		Object char_literal327_tree=null;
		Object char_literal328_tree=null;
		Object string_literal329_tree=null;
		Object char_literal332_tree=null;
		Object char_literal333_tree=null;
		Object char_literal337_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleSubtreeStream stream_condEffect2=new RewriteRuleSubtreeStream(adaptor,"rule condEffect2");
		RewriteRuleSubtreeStream stream_fExpT=new RewriteRuleSubtreeStream(adaptor,"rule fExpT");
		RewriteRuleSubtreeStream stream_timeSpecifier=new RewriteRuleSubtreeStream(adaptor,"rule timeSpecifier");
		RewriteRuleSubtreeStream stream_assignOpT=new RewriteRuleSubtreeStream(adaptor,"rule assignOpT");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
		RewriteRuleSubtreeStream stream_interval=new RewriteRuleSubtreeStream(adaptor,"rule interval");
		RewriteRuleSubtreeStream stream_condEffect=new RewriteRuleSubtreeStream(adaptor,"rule condEffect");

		try {
			// Pddl.g:473:2: ( '(' 'at' timeSpecifier condEffect2 ')' -> ^( TIMED_EFFECT timeSpecifier condEffect2 ) | '(' 'over' interval condEffect ')' -> ^( TIMED_EFFECT interval condEffect ) | '(' assignOpT fHead fExpT ')' -> ^( ASSIGN_EFFECT assignOpT fHead fExpT ) )
			int alt67=3;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==77) ) {
				switch ( input.LA(2) ) {
				case 114:
					{
					alt67=1;
					}
					break;
				case 132:
					{
					alt67=2;
					}
					break;
				case 116:
				case 126:
					{
					alt67=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// Pddl.g:473:4: '(' 'at' timeSpecifier condEffect2 ')'
					{
					char_literal323=(Token)match(input,77,FOLLOW_77_in_timedEffect2993); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal323);

					string_literal324=(Token)match(input,114,FOLLOW_114_in_timedEffect2995); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(string_literal324);

					pushFollow(FOLLOW_timeSpecifier_in_timedEffect2997);
					timeSpecifier325=timeSpecifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timeSpecifier.add(timeSpecifier325.getTree());
					pushFollow(FOLLOW_condEffect2_in_timedEffect2999);
					condEffect2326=condEffect2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condEffect2.add(condEffect2326.getTree());
					char_literal327=(Token)match(input,78,FOLLOW_78_in_timedEffect3001); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal327);

					// AST REWRITE
					// elements: timeSpecifier, condEffect2
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 474:3: -> ^( TIMED_EFFECT timeSpecifier condEffect2 )
					{
						// Pddl.g:474:6: ^( TIMED_EFFECT timeSpecifier condEffect2 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIMED_EFFECT, "TIMED_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_timeSpecifier.nextTree());
						adaptor.addChild(root_1, stream_condEffect2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:475:4: '(' 'over' interval condEffect ')'
					{
					char_literal328=(Token)match(input,77,FOLLOW_77_in_timedEffect3020); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal328);

					string_literal329=(Token)match(input,132,FOLLOW_132_in_timedEffect3022); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_132.add(string_literal329);

					pushFollow(FOLLOW_interval_in_timedEffect3024);
					interval330=interval();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_interval.add(interval330.getTree());
					pushFollow(FOLLOW_condEffect_in_timedEffect3026);
					condEffect331=condEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_condEffect.add(condEffect331.getTree());
					char_literal332=(Token)match(input,78,FOLLOW_78_in_timedEffect3028); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal332);

					// AST REWRITE
					// elements: condEffect, interval
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 476:3: -> ^( TIMED_EFFECT interval condEffect )
					{
						// Pddl.g:476:6: ^( TIMED_EFFECT interval condEffect )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIMED_EFFECT, "TIMED_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_interval.nextTree());
						adaptor.addChild(root_1, stream_condEffect.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:477:4: '(' assignOpT fHead fExpT ')'
					{
					char_literal333=(Token)match(input,77,FOLLOW_77_in_timedEffect3047); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal333);

					pushFollow(FOLLOW_assignOpT_in_timedEffect3049);
					assignOpT334=assignOpT();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignOpT.add(assignOpT334.getTree());
					pushFollow(FOLLOW_fHead_in_timedEffect3051);
					fHead335=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead335.getTree());
					pushFollow(FOLLOW_fExpT_in_timedEffect3053);
					fExpT336=fExpT();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExpT.add(fExpT336.getTree());
					char_literal337=(Token)match(input,78,FOLLOW_78_in_timedEffect3055); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal337);

					// AST REWRITE
					// elements: fHead, assignOpT, fExpT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 478:3: -> ^( ASSIGN_EFFECT assignOpT fHead fExpT )
					{
						// Pddl.g:478:6: ^( ASSIGN_EFFECT assignOpT fHead fExpT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);
						adaptor.addChild(root_1, stream_assignOpT.nextTree());
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_fExpT.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedEffect"


	public static class condEffect2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condEffect2"
	// Pddl.g:482:1: condEffect2 : ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect );
	public final PddlParser.condEffect2_return condEffect2() throws RecognitionException {
		PddlParser.condEffect2_return retval = new PddlParser.condEffect2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal338=null;
		Token string_literal339=null;
		Token char_literal341=null;
		ParserRuleReturnScope cEffect340 =null;
		ParserRuleReturnScope cEffect342 =null;

		Object char_literal338_tree=null;
		Object string_literal339_tree=null;
		Object char_literal341_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleSubtreeStream stream_cEffect=new RewriteRuleSubtreeStream(adaptor,"rule cEffect");

		try {
			// Pddl.g:483:2: ( '(' 'and' ( cEffect )* ')' -> ^( AND_EFFECT ( cEffect )* ) | cEffect )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==77) ) {
				int LA69_1 = input.LA(2);
				if ( (LA69_1==112) ) {
					alt69=1;
				}
				else if ( (LA69_1==NAME||(LA69_1 >= 113 && LA69_1 <= 114)||LA69_1==116||LA69_1==122||LA69_1==126||LA69_1==130||(LA69_1 >= 135 && LA69_1 <= 136)||LA69_1==142) ) {
					alt69=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// Pddl.g:483:4: '(' 'and' ( cEffect )* ')'
					{
					char_literal338=(Token)match(input,77,FOLLOW_77_in_condEffect23082); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal338);

					string_literal339=(Token)match(input,112,FOLLOW_112_in_condEffect23084); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal339);

					// Pddl.g:483:14: ( cEffect )*
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==77) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// Pddl.g:483:14: cEffect
							{
							pushFollow(FOLLOW_cEffect_in_condEffect23086);
							cEffect340=cEffect();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_cEffect.add(cEffect340.getTree());
							}
							break;

						default :
							break loop68;
						}
					}

					char_literal341=(Token)match(input,78,FOLLOW_78_in_condEffect23089); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal341);

					// AST REWRITE
					// elements: cEffect
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 483:27: -> ^( AND_EFFECT ( cEffect )* )
					{
						// Pddl.g:483:30: ^( AND_EFFECT ( cEffect )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND_EFFECT, "AND_EFFECT"), root_1);
						// Pddl.g:483:43: ( cEffect )*
						while ( stream_cEffect.hasNext() ) {
							adaptor.addChild(root_1, stream_cEffect.nextTree());
						}
						stream_cEffect.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:484:4: cEffect
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cEffect_in_condEffect23103);
					cEffect342=cEffect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cEffect342.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condEffect2"


	public static class fAssignDA_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fAssignDA"
	// Pddl.g:489:1: fAssignDA : '(' assignOp fHead fExpDA ')' -> ^( ASSIGN_EFFECT assignOp fHead fExpDA ) ;
	public final PddlParser.fAssignDA_return fAssignDA() throws RecognitionException {
		PddlParser.fAssignDA_return retval = new PddlParser.fAssignDA_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal343=null;
		Token char_literal347=null;
		ParserRuleReturnScope assignOp344 =null;
		ParserRuleReturnScope fHead345 =null;
		ParserRuleReturnScope fExpDA346 =null;

		Object char_literal343_tree=null;
		Object char_literal347_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_assignOp=new RewriteRuleSubtreeStream(adaptor,"rule assignOp");
		RewriteRuleSubtreeStream stream_fExpDA=new RewriteRuleSubtreeStream(adaptor,"rule fExpDA");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");

		try {
			// Pddl.g:490:2: ( '(' assignOp fHead fExpDA ')' -> ^( ASSIGN_EFFECT assignOp fHead fExpDA ) )
			// Pddl.g:490:4: '(' assignOp fHead fExpDA ')'
			{
			char_literal343=(Token)match(input,77,FOLLOW_77_in_fAssignDA3116); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal343);

			pushFollow(FOLLOW_assignOp_in_fAssignDA3118);
			assignOp344=assignOp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignOp.add(assignOp344.getTree());
			pushFollow(FOLLOW_fHead_in_fAssignDA3120);
			fHead345=fHead();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_fHead.add(fHead345.getTree());
			pushFollow(FOLLOW_fExpDA_in_fAssignDA3122);
			fExpDA346=fExpDA();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_fExpDA.add(fExpDA346.getTree());
			char_literal347=(Token)match(input,78,FOLLOW_78_in_fAssignDA3124); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal347);

			// AST REWRITE
			// elements: fExpDA, assignOp, fHead
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 491:3: -> ^( ASSIGN_EFFECT assignOp fHead fExpDA )
			{
				// Pddl.g:491:6: ^( ASSIGN_EFFECT assignOp fHead fExpDA )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN_EFFECT, "ASSIGN_EFFECT"), root_1);
				adaptor.addChild(root_1, stream_assignOp.nextTree());
				adaptor.addChild(root_1, stream_fHead.nextTree());
				adaptor.addChild(root_1, stream_fExpDA.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fAssignDA"


	public static class fExpDA_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExpDA"
	// Pddl.g:496:1: fExpDA : ( '(' binaryOp fExpDA fExpDA ')' -> ^( BINARY_OP binaryOp fExpDA fExpDA ) | '(' '-' fExpDA ')' -> ^( UNARY_MINUS fExpDA ) | '?duration' -> ^( VARIABLE '?duration' ) | fExp );
	public final PddlParser.fExpDA_return fExpDA() throws RecognitionException {
		PddlParser.fExpDA_return retval = new PddlParser.fExpDA_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal348=null;
		Token char_literal352=null;
		Token char_literal353=null;
		Token char_literal354=null;
		Token char_literal356=null;
		Token string_literal357=null;
		ParserRuleReturnScope binaryOp349 =null;
		ParserRuleReturnScope fExpDA350 =null;
		ParserRuleReturnScope fExpDA351 =null;
		ParserRuleReturnScope fExpDA355 =null;
		ParserRuleReturnScope fExp358 =null;

		Object char_literal348_tree=null;
		Object char_literal352_tree=null;
		Object char_literal353_tree=null;
		Object char_literal354_tree=null;
		Object char_literal356_tree=null;
		Object string_literal357_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
		RewriteRuleSubtreeStream stream_fExpDA=new RewriteRuleSubtreeStream(adaptor,"rule fExpDA");

		try {
			// Pddl.g:497:2: ( '(' binaryOp fExpDA fExpDA ')' -> ^( BINARY_OP binaryOp fExpDA fExpDA ) | '(' '-' fExpDA ')' -> ^( UNARY_MINUS fExpDA ) | '?duration' -> ^( VARIABLE '?duration' ) | fExp )
			int alt70=4;
			switch ( input.LA(1) ) {
			case 77:
				{
				int LA70_1 = input.LA(2);
				if ( (synpred110_Pddl()) ) {
					alt70=1;
				}
				else if ( (synpred111_Pddl()) ) {
					alt70=2;
				}
				else if ( (true) ) {
					alt70=4;
				}

				}
				break;
			case 108:
				{
				alt70=3;
				}
				break;
			case NAME:
			case NUMBER:
				{
				alt70=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// Pddl.g:497:4: '(' binaryOp fExpDA fExpDA ')'
					{
					char_literal348=(Token)match(input,77,FOLLOW_77_in_fExpDA3151); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal348);

					pushFollow(FOLLOW_binaryOp_in_fExpDA3153);
					binaryOp349=binaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp349.getTree());
					pushFollow(FOLLOW_fExpDA_in_fExpDA3155);
					fExpDA350=fExpDA();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExpDA.add(fExpDA350.getTree());
					pushFollow(FOLLOW_fExpDA_in_fExpDA3157);
					fExpDA351=fExpDA();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExpDA.add(fExpDA351.getTree());
					char_literal352=(Token)match(input,78,FOLLOW_78_in_fExpDA3159); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal352);

					// AST REWRITE
					// elements: binaryOp, fExpDA, fExpDA
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 498:3: -> ^( BINARY_OP binaryOp fExpDA fExpDA )
					{
						// Pddl.g:498:6: ^( BINARY_OP binaryOp fExpDA fExpDA )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);
						adaptor.addChild(root_1, stream_binaryOp.nextTree());
						adaptor.addChild(root_1, stream_fExpDA.nextTree());
						adaptor.addChild(root_1, stream_fExpDA.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:499:4: '(' '-' fExpDA ')'
					{
					char_literal353=(Token)match(input,77,FOLLOW_77_in_fExpDA3178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal353);

					char_literal354=(Token)match(input,81,FOLLOW_81_in_fExpDA3180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(char_literal354);

					pushFollow(FOLLOW_fExpDA_in_fExpDA3182);
					fExpDA355=fExpDA();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExpDA.add(fExpDA355.getTree());
					char_literal356=(Token)match(input,78,FOLLOW_78_in_fExpDA3184); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal356);

					// AST REWRITE
					// elements: fExpDA
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 500:3: -> ^( UNARY_MINUS fExpDA )
					{
						// Pddl.g:500:6: ^( UNARY_MINUS fExpDA )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_fExpDA.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:501:4: '?duration'
					{
					string_literal357=(Token)match(input,108,FOLLOW_108_in_fExpDA3199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_108.add(string_literal357);

					// AST REWRITE
					// elements: 108
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 502:3: -> ^( VARIABLE '?duration' )
					{
						// Pddl.g:502:6: ^( VARIABLE '?duration' )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLE, "VARIABLE"), root_1);
						adaptor.addChild(root_1, stream_108.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:503:4: fExp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fExp_in_fExpDA3214);
					fExp358=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fExp358.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExpDA"


	public static class assignOpT_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignOpT"
	// Pddl.g:506:1: assignOpT : ( 'increase' | 'decrease' );
	public final PddlParser.assignOpT_return assignOpT() throws RecognitionException {
		PddlParser.assignOpT_return retval = new PddlParser.assignOpT_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set359=null;

		Object set359_tree=null;

		try {
			// Pddl.g:507:2: ( 'increase' | 'decrease' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set359=input.LT(1);
			if ( input.LA(1)==116||input.LA(1)==126 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set359));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignOpT"


	public static class fExpT_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fExpT"
	// Pddl.g:509:1: fExpT : ( '(' '*' fExp timeVar ')' -> ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) ) | '(' '*' timeVar fExp ')' -> ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) ) | timeVar -> ^( CONTINUOUS_EXP timeVar ) );
	public final PddlParser.fExpT_return fExpT() throws RecognitionException {
		PddlParser.fExpT_return retval = new PddlParser.fExpT_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal360=null;
		Token char_literal361=null;
		Token char_literal364=null;
		Token char_literal365=null;
		Token char_literal366=null;
		Token char_literal369=null;
		ParserRuleReturnScope fExp362 =null;
		ParserRuleReturnScope timeVar363 =null;
		ParserRuleReturnScope timeVar367 =null;
		ParserRuleReturnScope fExp368 =null;
		ParserRuleReturnScope timeVar370 =null;

		Object char_literal360_tree=null;
		Object char_literal361_tree=null;
		Object char_literal364_tree=null;
		Object char_literal365_tree=null;
		Object char_literal366_tree=null;
		Object char_literal369_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleSubtreeStream stream_timeVar=new RewriteRuleSubtreeStream(adaptor,"rule timeVar");
		RewriteRuleSubtreeStream stream_fExp=new RewriteRuleSubtreeStream(adaptor,"rule fExp");

		try {
			// Pddl.g:510:2: ( '(' '*' fExp timeVar ')' -> ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) ) | '(' '*' timeVar fExp ')' -> ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) ) | timeVar -> ^( CONTINUOUS_EXP timeVar ) )
			int alt71=3;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==77) ) {
				int LA71_1 = input.LA(2);
				if ( (LA71_1==79) ) {
					int LA71_3 = input.LA(3);
					if ( (LA71_3==NAME||LA71_3==NUMBER||LA71_3==77) ) {
						alt71=1;
					}
					else if ( ((LA71_3 >= TIMESTEPVAR && LA71_3 <= TIMEVAR)) ) {
						alt71=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 71, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( ((LA71_0 >= TIMESTEPVAR && LA71_0 <= TIMEVAR)) ) {
				alt71=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// Pddl.g:510:4: '(' '*' fExp timeVar ')'
					{
					char_literal360=(Token)match(input,77,FOLLOW_77_in_fExpT3238); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal360);

					char_literal361=(Token)match(input,79,FOLLOW_79_in_fExpT3240); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal361);

					pushFollow(FOLLOW_fExp_in_fExpT3242);
					fExp362=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp362.getTree());
					pushFollow(FOLLOW_timeVar_in_fExpT3244);
					timeVar363=timeVar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timeVar.add(timeVar363.getTree());
					char_literal364=(Token)match(input,78,FOLLOW_78_in_fExpT3246); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal364);

					// AST REWRITE
					// elements: timeVar, fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 511:3: -> ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) )
					{
						// Pddl.g:511:6: ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTINUOUS_EXP, "CONTINUOUS_EXP"), root_1);
						adaptor.addChild(root_1, stream_timeVar.nextTree());
						// Pddl.g:511:31: ^( FEXP fExp )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FEXP, "FEXP"), root_2);
						adaptor.addChild(root_2, stream_fExp.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:512:4: '(' '*' timeVar fExp ')'
					{
					char_literal365=(Token)match(input,77,FOLLOW_77_in_fExpT3268); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal365);

					char_literal366=(Token)match(input,79,FOLLOW_79_in_fExpT3270); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal366);

					pushFollow(FOLLOW_timeVar_in_fExpT3272);
					timeVar367=timeVar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timeVar.add(timeVar367.getTree());
					pushFollow(FOLLOW_fExp_in_fExpT3274);
					fExp368=fExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fExp.add(fExp368.getTree());
					char_literal369=(Token)match(input,78,FOLLOW_78_in_fExpT3276); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal369);

					// AST REWRITE
					// elements: timeVar, fExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 513:3: -> ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) )
					{
						// Pddl.g:513:6: ^( CONTINUOUS_EXP timeVar ^( FEXP fExp ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTINUOUS_EXP, "CONTINUOUS_EXP"), root_1);
						adaptor.addChild(root_1, stream_timeVar.nextTree());
						// Pddl.g:513:31: ^( FEXP fExp )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FEXP, "FEXP"), root_2);
						adaptor.addChild(root_2, stream_fExp.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:514:4: timeVar
					{
					pushFollow(FOLLOW_timeVar_in_fExpT3297);
					timeVar370=timeVar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timeVar.add(timeVar370.getTree());
					// AST REWRITE
					// elements: timeVar
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 515:3: -> ^( CONTINUOUS_EXP timeVar )
					{
						// Pddl.g:515:6: ^( CONTINUOUS_EXP timeVar )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTINUOUS_EXP, "CONTINUOUS_EXP"), root_1);
						adaptor.addChild(root_1, stream_timeVar.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fExpT"


	public static class timeVar_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "timeVar"
	// Pddl.g:518:1: timeVar : ( TIMEVAR | TIMESTEPVAR );
	public final PddlParser.timeVar_return timeVar() throws RecognitionException {
		PddlParser.timeVar_return retval = new PddlParser.timeVar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set371=null;

		Object set371_tree=null;

		try {
			// Pddl.g:518:8: ( TIMEVAR | TIMESTEPVAR )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set371=input.LT(1);
			if ( (input.LA(1) >= TIMESTEPVAR && input.LA(1) <= TIMEVAR) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set371));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timeVar"


	public static class problem_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problem"
	// Pddl.g:522:1: problem : '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) ;
	public final PddlParser.problem_return problem() throws RecognitionException {
		PddlParser.problem_return retval = new PddlParser.problem_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal372=null;
		Token string_literal373=null;
		Token char_literal382=null;
		ParserRuleReturnScope problemDecl374 =null;
		ParserRuleReturnScope problemDomain375 =null;
		ParserRuleReturnScope requireDef376 =null;
		ParserRuleReturnScope objectDecl377 =null;
		ParserRuleReturnScope init378 =null;
		ParserRuleReturnScope goal379 =null;
		ParserRuleReturnScope probConstraints380 =null;
		ParserRuleReturnScope metricSpec381 =null;

		Object char_literal372_tree=null;
		Object string_literal373_tree=null;
		Object char_literal382_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleSubtreeStream stream_metricSpec=new RewriteRuleSubtreeStream(adaptor,"rule metricSpec");
		RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
		RewriteRuleSubtreeStream stream_goal=new RewriteRuleSubtreeStream(adaptor,"rule goal");
		RewriteRuleSubtreeStream stream_requireDef=new RewriteRuleSubtreeStream(adaptor,"rule requireDef");
		RewriteRuleSubtreeStream stream_problemDecl=new RewriteRuleSubtreeStream(adaptor,"rule problemDecl");
		RewriteRuleSubtreeStream stream_objectDecl=new RewriteRuleSubtreeStream(adaptor,"rule objectDecl");
		RewriteRuleSubtreeStream stream_problemDomain=new RewriteRuleSubtreeStream(adaptor,"rule problemDomain");
		RewriteRuleSubtreeStream stream_probConstraints=new RewriteRuleSubtreeStream(adaptor,"rule probConstraints");

		try {
			// Pddl.g:523:2: ( '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')' -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ) )
			// Pddl.g:523:4: '(' 'define' problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? ')'
			{
			char_literal372=(Token)match(input,77,FOLLOW_77_in_problem3333); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal372);

			string_literal373=(Token)match(input,117,FOLLOW_117_in_problem3335); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_117.add(string_literal373);

			pushFollow(FOLLOW_problemDecl_in_problem3337);
			problemDecl374=problemDecl();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_problemDecl.add(problemDecl374.getTree());
			pushFollow(FOLLOW_problemDomain_in_problem3342);
			problemDomain375=problemDomain();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_problemDomain.add(problemDomain375.getTree());
			// Pddl.g:525:7: ( requireDef )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==77) ) {
				int LA72_1 = input.LA(2);
				if ( (LA72_1==100) ) {
					alt72=1;
				}
			}
			switch (alt72) {
				case 1 :
					// Pddl.g:525:7: requireDef
					{
					pushFollow(FOLLOW_requireDef_in_problem3350);
					requireDef376=requireDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_requireDef.add(requireDef376.getTree());
					}
					break;

			}

			// Pddl.g:526:7: ( objectDecl )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==77) ) {
				int LA73_1 = input.LA(2);
				if ( (LA73_1==96) ) {
					alt73=1;
				}
			}
			switch (alt73) {
				case 1 :
					// Pddl.g:526:7: objectDecl
					{
					pushFollow(FOLLOW_objectDecl_in_problem3359);
					objectDecl377=objectDecl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_objectDecl.add(objectDecl377.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_init_in_problem3368);
			init378=init();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_init.add(init378.getTree());
			pushFollow(FOLLOW_goal_in_problem3376);
			goal379=goal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_goal.add(goal379.getTree());
			// Pddl.g:529:7: ( probConstraints )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==77) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==86) ) {
					alt74=1;
				}
			}
			switch (alt74) {
				case 1 :
					// Pddl.g:529:7: probConstraints
					{
					pushFollow(FOLLOW_probConstraints_in_problem3384);
					probConstraints380=probConstraints();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_probConstraints.add(probConstraints380.getTree());
					}
					break;

			}

			// Pddl.g:530:7: ( metricSpec )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==77) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// Pddl.g:530:7: metricSpec
					{
					pushFollow(FOLLOW_metricSpec_in_problem3393);
					metricSpec381=metricSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricSpec.add(metricSpec381.getTree());
					}
					break;

			}

			char_literal382=(Token)match(input,78,FOLLOW_78_in_problem3409); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal382);

			// AST REWRITE
			// elements: problemDecl, requireDef, goal, init, problemDomain, objectDecl, metricSpec, probConstraints
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 533:7: -> ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
			{
				// Pddl.g:533:10: ^( PROBLEM problemDecl problemDomain ( requireDef )? ( objectDecl )? init goal ( probConstraints )? ( metricSpec )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM, "PROBLEM"), root_1);
				adaptor.addChild(root_1, stream_problemDecl.nextTree());
				adaptor.addChild(root_1, stream_problemDomain.nextTree());
				// Pddl.g:533:46: ( requireDef )?
				if ( stream_requireDef.hasNext() ) {
					adaptor.addChild(root_1, stream_requireDef.nextTree());
				}
				stream_requireDef.reset();

				// Pddl.g:533:58: ( objectDecl )?
				if ( stream_objectDecl.hasNext() ) {
					adaptor.addChild(root_1, stream_objectDecl.nextTree());
				}
				stream_objectDecl.reset();

				adaptor.addChild(root_1, stream_init.nextTree());
				adaptor.addChild(root_1, stream_goal.nextTree());
				// Pddl.g:534:19: ( probConstraints )?
				if ( stream_probConstraints.hasNext() ) {
					adaptor.addChild(root_1, stream_probConstraints.nextTree());
				}
				stream_probConstraints.reset();

				// Pddl.g:534:36: ( metricSpec )?
				if ( stream_metricSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_metricSpec.nextTree());
				}
				stream_metricSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problem"


	public static class problemDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problemDecl"
	// Pddl.g:537:1: problemDecl : '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) ;
	public final PddlParser.problemDecl_return problemDecl() throws RecognitionException {
		PddlParser.problemDecl_return retval = new PddlParser.problemDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal383=null;
		Token string_literal384=null;
		Token NAME385=null;
		Token char_literal386=null;

		Object char_literal383_tree=null;
		Object string_literal384_tree=null;
		Object NAME385_tree=null;
		Object char_literal386_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			// Pddl.g:538:5: ( '(' 'problem' NAME ')' -> ^( PROBLEM_NAME NAME ) )
			// Pddl.g:538:7: '(' 'problem' NAME ')'
			{
			char_literal383=(Token)match(input,77,FOLLOW_77_in_problemDecl3466); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal383);

			string_literal384=(Token)match(input,134,FOLLOW_134_in_problemDecl3468); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_134.add(string_literal384);

			NAME385=(Token)match(input,NAME,FOLLOW_NAME_in_problemDecl3470); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME385);

			char_literal386=(Token)match(input,78,FOLLOW_78_in_problemDecl3472); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal386);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 539:5: -> ^( PROBLEM_NAME NAME )
			{
				// Pddl.g:539:8: ^( PROBLEM_NAME NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_NAME, "PROBLEM_NAME"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problemDecl"


	public static class problemDomain_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "problemDomain"
	// Pddl.g:542:1: problemDomain : '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) ;
	public final PddlParser.problemDomain_return problemDomain() throws RecognitionException {
		PddlParser.problemDomain_return retval = new PddlParser.problemDomain_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal387=null;
		Token string_literal388=null;
		Token NAME389=null;
		Token char_literal390=null;

		Object char_literal387_tree=null;
		Object string_literal388_tree=null;
		Object NAME389_tree=null;
		Object char_literal390_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

		try {
			// Pddl.g:543:2: ( '(' ':domain' NAME ')' -> ^( PROBLEM_DOMAIN NAME ) )
			// Pddl.g:543:4: '(' ':domain' NAME ')'
			{
			char_literal387=(Token)match(input,77,FOLLOW_77_in_problemDomain3498); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal387);

			string_literal388=(Token)match(input,88,FOLLOW_88_in_problemDomain3500); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_88.add(string_literal388);

			NAME389=(Token)match(input,NAME,FOLLOW_NAME_in_problemDomain3502); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NAME.add(NAME389);

			char_literal390=(Token)match(input,78,FOLLOW_78_in_problemDomain3504); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal390);

			// AST REWRITE
			// elements: NAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 544:2: -> ^( PROBLEM_DOMAIN NAME )
			{
				// Pddl.g:544:5: ^( PROBLEM_DOMAIN NAME )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_DOMAIN, "PROBLEM_DOMAIN"), root_1);
				adaptor.addChild(root_1, stream_NAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "problemDomain"


	public static class objectDecl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "objectDecl"
	// Pddl.g:547:1: objectDecl : '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) ;
	public final PddlParser.objectDecl_return objectDecl() throws RecognitionException {
		PddlParser.objectDecl_return retval = new PddlParser.objectDecl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal391=null;
		Token string_literal392=null;
		Token char_literal394=null;
		ParserRuleReturnScope typedNameList393 =null;

		Object char_literal391_tree=null;
		Object string_literal392_tree=null;
		Object char_literal394_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleSubtreeStream stream_typedNameList=new RewriteRuleSubtreeStream(adaptor,"rule typedNameList");

		try {
			// Pddl.g:548:2: ( '(' ':objects' typedNameList ')' -> ^( OBJECTS typedNameList ) )
			// Pddl.g:548:4: '(' ':objects' typedNameList ')'
			{
			char_literal391=(Token)match(input,77,FOLLOW_77_in_objectDecl3524); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal391);

			string_literal392=(Token)match(input,96,FOLLOW_96_in_objectDecl3526); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_96.add(string_literal392);

			pushFollow(FOLLOW_typedNameList_in_objectDecl3528);
			typedNameList393=typedNameList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typedNameList.add(typedNameList393.getTree());
			char_literal394=(Token)match(input,78,FOLLOW_78_in_objectDecl3530); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal394);

			// AST REWRITE
			// elements: typedNameList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 549:2: -> ^( OBJECTS typedNameList )
			{
				// Pddl.g:549:5: ^( OBJECTS typedNameList )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECTS, "OBJECTS"), root_1);
				adaptor.addChild(root_1, stream_typedNameList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "objectDecl"


	public static class init_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "init"
	// Pddl.g:552:1: init : '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) ;
	public final PddlParser.init_return init() throws RecognitionException {
		PddlParser.init_return retval = new PddlParser.init_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal395=null;
		Token string_literal396=null;
		Token char_literal398=null;
		ParserRuleReturnScope initEl397 =null;

		Object char_literal395_tree=null;
		Object string_literal396_tree=null;
		Object char_literal398_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleSubtreeStream stream_initEl=new RewriteRuleSubtreeStream(adaptor,"rule initEl");

		try {
			// Pddl.g:553:2: ( '(' ':init' ( initEl )* ')' -> ^( INIT ( initEl )* ) )
			// Pddl.g:553:4: '(' ':init' ( initEl )* ')'
			{
			char_literal395=(Token)match(input,77,FOLLOW_77_in_init3550); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal395);

			string_literal396=(Token)match(input,94,FOLLOW_94_in_init3552); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_94.add(string_literal396);

			// Pddl.g:553:16: ( initEl )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==77) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// Pddl.g:553:16: initEl
					{
					pushFollow(FOLLOW_initEl_in_init3554);
					initEl397=initEl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initEl.add(initEl397.getTree());
					}
					break;

				default :
					break loop76;
				}
			}

			char_literal398=(Token)match(input,78,FOLLOW_78_in_init3557); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal398);

			// AST REWRITE
			// elements: initEl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 554:2: -> ^( INIT ( initEl )* )
			{
				// Pddl.g:554:5: ^( INIT ( initEl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT, "INIT"), root_1);
				// Pddl.g:554:12: ( initEl )*
				while ( stream_initEl.hasNext() ) {
					adaptor.addChild(root_1, stream_initEl.nextTree());
				}
				stream_initEl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init"


	public static class initEl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "initEl"
	// Pddl.g:557:1: initEl : ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' '=' fHead NAME ')' -> ^( INIT_EQ fHead NAME ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) );
	public final PddlParser.initEl_return initEl() throws RecognitionException {
		PddlParser.initEl_return retval = new PddlParser.initEl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal400=null;
		Token char_literal401=null;
		Token NUMBER403=null;
		Token char_literal404=null;
		Token char_literal405=null;
		Token char_literal406=null;
		Token NAME408=null;
		Token char_literal409=null;
		Token char_literal410=null;
		Token string_literal411=null;
		Token NUMBER412=null;
		Token char_literal414=null;
		ParserRuleReturnScope nameLiteral399 =null;
		ParserRuleReturnScope fHead402 =null;
		ParserRuleReturnScope fHead407 =null;
		ParserRuleReturnScope nameLiteral413 =null;

		Object char_literal400_tree=null;
		Object char_literal401_tree=null;
		Object NUMBER403_tree=null;
		Object char_literal404_tree=null;
		Object char_literal405_tree=null;
		Object char_literal406_tree=null;
		Object NAME408_tree=null;
		Object char_literal409_tree=null;
		Object char_literal410_tree=null;
		Object string_literal411_tree=null;
		Object NUMBER412_tree=null;
		Object char_literal414_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_fHead=new RewriteRuleSubtreeStream(adaptor,"rule fHead");
		RewriteRuleSubtreeStream stream_nameLiteral=new RewriteRuleSubtreeStream(adaptor,"rule nameLiteral");

		try {
			// Pddl.g:558:2: ( nameLiteral | '(' '=' fHead NUMBER ')' -> ^( INIT_EQ fHead NUMBER ) | '(' '=' fHead NAME ')' -> ^( INIT_EQ fHead NAME ) | '(' 'at' NUMBER nameLiteral ')' -> ^( INIT_AT NUMBER nameLiteral ) )
			int alt77=4;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==77) ) {
				int LA77_1 = input.LA(2);
				if ( (synpred122_Pddl()) ) {
					alt77=1;
				}
				else if ( (synpred123_Pddl()) ) {
					alt77=2;
				}
				else if ( (synpred124_Pddl()) ) {
					alt77=3;
				}
				else if ( (true) ) {
					alt77=4;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// Pddl.g:558:4: nameLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nameLiteral_in_initEl3578);
					nameLiteral399=nameLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nameLiteral399.getTree());

					}
					break;
				case 2 :
					// Pddl.g:559:4: '(' '=' fHead NUMBER ')'
					{
					char_literal400=(Token)match(input,77,FOLLOW_77_in_initEl3583); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal400);

					char_literal401=(Token)match(input,105,FOLLOW_105_in_initEl3585); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(char_literal401);

					pushFollow(FOLLOW_fHead_in_initEl3587);
					fHead402=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead402.getTree());
					NUMBER403=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl3589); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER403);

					char_literal404=(Token)match(input,78,FOLLOW_78_in_initEl3591); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal404);

					// AST REWRITE
					// elements: fHead, NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 559:37: -> ^( INIT_EQ fHead NUMBER )
					{
						// Pddl.g:559:40: ^( INIT_EQ fHead NUMBER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_EQ, "INIT_EQ"), root_1);
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_NUMBER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:560:4: '(' '=' fHead NAME ')'
					{
					char_literal405=(Token)match(input,77,FOLLOW_77_in_initEl3614); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal405);

					char_literal406=(Token)match(input,105,FOLLOW_105_in_initEl3616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(char_literal406);

					pushFollow(FOLLOW_fHead_in_initEl3618);
					fHead407=fHead();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fHead.add(fHead407.getTree());
					NAME408=(Token)match(input,NAME,FOLLOW_NAME_in_initEl3620); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(NAME408);

					char_literal409=(Token)match(input,78,FOLLOW_78_in_initEl3622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal409);

					// AST REWRITE
					// elements: NAME, fHead
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 560:35: -> ^( INIT_EQ fHead NAME )
					{
						// Pddl.g:560:38: ^( INIT_EQ fHead NAME )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_EQ, "INIT_EQ"), root_1);
						adaptor.addChild(root_1, stream_fHead.nextTree());
						adaptor.addChild(root_1, stream_NAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:561:4: '(' 'at' NUMBER nameLiteral ')'
					{
					char_literal410=(Token)match(input,77,FOLLOW_77_in_initEl3645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal410);

					string_literal411=(Token)match(input,114,FOLLOW_114_in_initEl3647); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(string_literal411);

					NUMBER412=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_initEl3649); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER412);

					pushFollow(FOLLOW_nameLiteral_in_initEl3651);
					nameLiteral413=nameLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameLiteral.add(nameLiteral413.getTree());
					char_literal414=(Token)match(input,78,FOLLOW_78_in_initEl3653); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal414);

					// AST REWRITE
					// elements: NUMBER, nameLiteral
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 561:37: -> ^( INIT_AT NUMBER nameLiteral )
					{
						// Pddl.g:561:40: ^( INIT_AT NUMBER nameLiteral )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INIT_AT, "INIT_AT"), root_1);
						adaptor.addChild(root_1, stream_NUMBER.nextNode());
						adaptor.addChild(root_1, stream_nameLiteral.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initEl"


	public static class nameLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nameLiteral"
	// Pddl.g:564:1: nameLiteral : ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) );
	public final PddlParser.nameLiteral_return nameLiteral() throws RecognitionException {
		PddlParser.nameLiteral_return retval = new PddlParser.nameLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal416=null;
		Token string_literal417=null;
		Token char_literal419=null;
		ParserRuleReturnScope atomicNameFormula415 =null;
		ParserRuleReturnScope atomicNameFormula418 =null;

		Object char_literal416_tree=null;
		Object string_literal417_tree=null;
		Object char_literal419_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_atomicNameFormula=new RewriteRuleSubtreeStream(adaptor,"rule atomicNameFormula");

		try {
			// Pddl.g:565:2: ( atomicNameFormula | '(' 'not' atomicNameFormula ')' -> ^( NOT_PRED_INIT atomicNameFormula ) )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==77) ) {
				int LA78_1 = input.LA(2);
				if ( (LA78_1==130) ) {
					alt78=2;
				}
				else if ( (LA78_1==NAME||LA78_1==114) ) {
					alt78=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// Pddl.g:565:4: atomicNameFormula
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral3675);
					atomicNameFormula415=atomicNameFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomicNameFormula415.getTree());

					}
					break;
				case 2 :
					// Pddl.g:566:4: '(' 'not' atomicNameFormula ')'
					{
					char_literal416=(Token)match(input,77,FOLLOW_77_in_nameLiteral3680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal416);

					string_literal417=(Token)match(input,130,FOLLOW_130_in_nameLiteral3682); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_130.add(string_literal417);

					pushFollow(FOLLOW_atomicNameFormula_in_nameLiteral3684);
					atomicNameFormula418=atomicNameFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atomicNameFormula.add(atomicNameFormula418.getTree());
					char_literal419=(Token)match(input,78,FOLLOW_78_in_nameLiteral3686); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal419);

					// AST REWRITE
					// elements: atomicNameFormula
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 566:36: -> ^( NOT_PRED_INIT atomicNameFormula )
					{
						// Pddl.g:566:39: ^( NOT_PRED_INIT atomicNameFormula )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT_PRED_INIT, "NOT_PRED_INIT"), root_1);
						adaptor.addChild(root_1, stream_atomicNameFormula.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameLiteral"


	public static class atomicNameFormula_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atomicNameFormula"
	// Pddl.g:569:1: atomicNameFormula : '(' predicate ( nameOrNumber )* ')' -> ^( PRED_INST predicate ^( PARAMS ( nameOrNumber )* ) ) ;
	public final PddlParser.atomicNameFormula_return atomicNameFormula() throws RecognitionException {
		PddlParser.atomicNameFormula_return retval = new PddlParser.atomicNameFormula_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal420=null;
		Token char_literal423=null;
		ParserRuleReturnScope predicate421 =null;
		ParserRuleReturnScope nameOrNumber422 =null;

		Object char_literal420_tree=null;
		Object char_literal423_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_nameOrNumber=new RewriteRuleSubtreeStream(adaptor,"rule nameOrNumber");

		try {
			// Pddl.g:570:2: ( '(' predicate ( nameOrNumber )* ')' -> ^( PRED_INST predicate ^( PARAMS ( nameOrNumber )* ) ) )
			// Pddl.g:570:4: '(' predicate ( nameOrNumber )* ')'
			{
			char_literal420=(Token)match(input,77,FOLLOW_77_in_atomicNameFormula3705); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal420);

			pushFollow(FOLLOW_predicate_in_atomicNameFormula3707);
			predicate421=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(predicate421.getTree());
			// Pddl.g:570:18: ( nameOrNumber )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==NAME||LA79_0==NUMBER) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// Pddl.g:570:18: nameOrNumber
					{
					pushFollow(FOLLOW_nameOrNumber_in_atomicNameFormula3709);
					nameOrNumber422=nameOrNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameOrNumber.add(nameOrNumber422.getTree());
					}
					break;

				default :
					break loop79;
				}
			}

			char_literal423=(Token)match(input,78,FOLLOW_78_in_atomicNameFormula3712); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal423);

			// AST REWRITE
			// elements: nameOrNumber, predicate
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 570:36: -> ^( PRED_INST predicate ^( PARAMS ( nameOrNumber )* ) )
			{
				// Pddl.g:570:39: ^( PRED_INST predicate ^( PARAMS ( nameOrNumber )* ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRED_INST, "PRED_INST"), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				// Pddl.g:570:61: ^( PARAMS ( nameOrNumber )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
				// Pddl.g:570:70: ( nameOrNumber )*
				while ( stream_nameOrNumber.hasNext() ) {
					adaptor.addChild(root_2, stream_nameOrNumber.nextTree());
				}
				stream_nameOrNumber.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomicNameFormula"


	public static class nameOrNumber_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nameOrNumber"
	// Pddl.g:573:1: nameOrNumber : ( NAME | NUMBER );
	public final PddlParser.nameOrNumber_return nameOrNumber() throws RecognitionException {
		PddlParser.nameOrNumber_return retval = new PddlParser.nameOrNumber_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set424=null;

		Object set424_tree=null;

		try {
			// Pddl.g:574:2: ( NAME | NUMBER )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set424=input.LT(1);
			if ( input.LA(1)==NAME||input.LA(1)==NUMBER ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set424));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameOrNumber"


	public static class goal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "goal"
	// Pddl.g:581:1: goal : '(' ':goal' logicExpr ')' -> ^( GOAL logicExpr ) ;
	public final PddlParser.goal_return goal() throws RecognitionException {
		PddlParser.goal_return retval = new PddlParser.goal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal425=null;
		Token string_literal426=null;
		Token char_literal428=null;
		ParserRuleReturnScope logicExpr427 =null;

		Object char_literal425_tree=null;
		Object string_literal426_tree=null;
		Object char_literal428_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleSubtreeStream stream_logicExpr=new RewriteRuleSubtreeStream(adaptor,"rule logicExpr");

		try {
			// Pddl.g:581:6: ( '(' ':goal' logicExpr ')' -> ^( GOAL logicExpr ) )
			// Pddl.g:581:8: '(' ':goal' logicExpr ')'
			{
			char_literal425=(Token)match(input,77,FOLLOW_77_in_goal3758); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal425);

			string_literal426=(Token)match(input,93,FOLLOW_93_in_goal3760); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_93.add(string_literal426);

			pushFollow(FOLLOW_logicExpr_in_goal3762);
			logicExpr427=logicExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicExpr.add(logicExpr427.getTree());
			char_literal428=(Token)match(input,78,FOLLOW_78_in_goal3764); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal428);

			// AST REWRITE
			// elements: logicExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 581:34: -> ^( GOAL logicExpr )
			{
				// Pddl.g:581:37: ^( GOAL logicExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GOAL, "GOAL"), root_1);
				adaptor.addChild(root_1, stream_logicExpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "goal"


	public static class probConstraints_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "probConstraints"
	// Pddl.g:583:1: probConstraints : '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) ;
	public final PddlParser.probConstraints_return probConstraints() throws RecognitionException {
		PddlParser.probConstraints_return retval = new PddlParser.probConstraints_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal429=null;
		Token string_literal430=null;
		Token char_literal432=null;
		ParserRuleReturnScope prefConGD431 =null;

		Object char_literal429_tree=null;
		Object string_literal430_tree=null;
		Object char_literal432_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_prefConGD=new RewriteRuleSubtreeStream(adaptor,"rule prefConGD");

		try {
			// Pddl.g:584:2: ( '(' ':constraints' prefConGD ')' -> ^( PROBLEM_CONSTRAINT prefConGD ) )
			// Pddl.g:584:4: '(' ':constraints' prefConGD ')'
			{
			char_literal429=(Token)match(input,77,FOLLOW_77_in_probConstraints3782); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal429);

			string_literal430=(Token)match(input,86,FOLLOW_86_in_probConstraints3784); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(string_literal430);

			pushFollow(FOLLOW_prefConGD_in_probConstraints3787);
			prefConGD431=prefConGD();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_prefConGD.add(prefConGD431.getTree());
			char_literal432=(Token)match(input,78,FOLLOW_78_in_probConstraints3789); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal432);

			// AST REWRITE
			// elements: prefConGD
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 585:4: -> ^( PROBLEM_CONSTRAINT prefConGD )
			{
				// Pddl.g:585:7: ^( PROBLEM_CONSTRAINT prefConGD )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_CONSTRAINT, "PROBLEM_CONSTRAINT"), root_1);
				adaptor.addChild(root_1, stream_prefConGD.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "probConstraints"


	public static class prefConGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "prefConGD"
	// Pddl.g:588:1: prefConGD : ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD );
	public final PddlParser.prefConGD_return prefConGD() throws RecognitionException {
		PddlParser.prefConGD_return retval = new PddlParser.prefConGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal433=null;
		Token string_literal434=null;
		Token char_literal436=null;
		Token char_literal437=null;
		Token string_literal438=null;
		Token char_literal439=null;
		Token char_literal441=null;
		Token char_literal443=null;
		Token char_literal444=null;
		Token string_literal445=null;
		Token NAME446=null;
		Token char_literal448=null;
		ParserRuleReturnScope prefConGD435 =null;
		ParserRuleReturnScope typedVariableList440 =null;
		ParserRuleReturnScope prefConGD442 =null;
		ParserRuleReturnScope conGD447 =null;
		ParserRuleReturnScope conGD449 =null;

		Object char_literal433_tree=null;
		Object string_literal434_tree=null;
		Object char_literal436_tree=null;
		Object char_literal437_tree=null;
		Object string_literal438_tree=null;
		Object char_literal439_tree=null;
		Object char_literal441_tree=null;
		Object char_literal443_tree=null;
		Object char_literal444_tree=null;
		Object string_literal445_tree=null;
		Object NAME446_tree=null;
		Object char_literal448_tree=null;

		try {
			// Pddl.g:589:2: ( '(' 'and' ( prefConGD )* ')' | '(' 'forall' '(' typedVariableList ')' prefConGD ')' | '(' 'preference' ( NAME )? conGD ')' | conGD )
			int alt82=4;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==77) ) {
				int LA82_1 = input.LA(2);
				if ( (synpred129_Pddl()) ) {
					alt82=1;
				}
				else if ( (synpred130_Pddl()) ) {
					alt82=2;
				}
				else if ( (synpred132_Pddl()) ) {
					alt82=3;
				}
				else if ( (true) ) {
					alt82=4;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// Pddl.g:589:4: '(' 'and' ( prefConGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal433=(Token)match(input,77,FOLLOW_77_in_prefConGD3811); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal433_tree = (Object)adaptor.create(char_literal433);
					adaptor.addChild(root_0, char_literal433_tree);
					}

					string_literal434=(Token)match(input,112,FOLLOW_112_in_prefConGD3813); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal434_tree = (Object)adaptor.create(string_literal434);
					adaptor.addChild(root_0, string_literal434_tree);
					}

					// Pddl.g:589:14: ( prefConGD )*
					loop80:
					while (true) {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( (LA80_0==77) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// Pddl.g:589:14: prefConGD
							{
							pushFollow(FOLLOW_prefConGD_in_prefConGD3815);
							prefConGD435=prefConGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD435.getTree());

							}
							break;

						default :
							break loop80;
						}
					}

					char_literal436=(Token)match(input,78,FOLLOW_78_in_prefConGD3818); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal436_tree = (Object)adaptor.create(char_literal436);
					adaptor.addChild(root_0, char_literal436_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:590:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal437=(Token)match(input,77,FOLLOW_77_in_prefConGD3823); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal437_tree = (Object)adaptor.create(char_literal437);
					adaptor.addChild(root_0, char_literal437_tree);
					}

					string_literal438=(Token)match(input,122,FOLLOW_122_in_prefConGD3825); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal438_tree = (Object)adaptor.create(string_literal438);
					adaptor.addChild(root_0, string_literal438_tree);
					}

					char_literal439=(Token)match(input,77,FOLLOW_77_in_prefConGD3827); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal439_tree = (Object)adaptor.create(char_literal439);
					adaptor.addChild(root_0, char_literal439_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_prefConGD3829);
					typedVariableList440=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList440.getTree());

					char_literal441=(Token)match(input,78,FOLLOW_78_in_prefConGD3831); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal441_tree = (Object)adaptor.create(char_literal441);
					adaptor.addChild(root_0, char_literal441_tree);
					}

					pushFollow(FOLLOW_prefConGD_in_prefConGD3833);
					prefConGD442=prefConGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prefConGD442.getTree());

					char_literal443=(Token)match(input,78,FOLLOW_78_in_prefConGD3835); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal443_tree = (Object)adaptor.create(char_literal443);
					adaptor.addChild(root_0, char_literal443_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:591:4: '(' 'preference' ( NAME )? conGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal444=(Token)match(input,77,FOLLOW_77_in_prefConGD3840); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal444_tree = (Object)adaptor.create(char_literal444);
					adaptor.addChild(root_0, char_literal444_tree);
					}

					string_literal445=(Token)match(input,133,FOLLOW_133_in_prefConGD3842); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal445_tree = (Object)adaptor.create(string_literal445);
					adaptor.addChild(root_0, string_literal445_tree);
					}

					// Pddl.g:591:21: ( NAME )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==NAME) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// Pddl.g:591:21: NAME
							{
							NAME446=(Token)match(input,NAME,FOLLOW_NAME_in_prefConGD3844); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAME446_tree = (Object)adaptor.create(NAME446);
							adaptor.addChild(root_0, NAME446_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_conGD_in_prefConGD3847);
					conGD447=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD447.getTree());

					char_literal448=(Token)match(input,78,FOLLOW_78_in_prefConGD3849); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal448_tree = (Object)adaptor.create(char_literal448);
					adaptor.addChild(root_0, char_literal448_tree);
					}

					}
					break;
				case 4 :
					// Pddl.g:592:4: conGD
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_conGD_in_prefConGD3854);
					conGD449=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD449.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prefConGD"


	public static class metricSpec_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "metricSpec"
	// Pddl.g:595:1: metricSpec : '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) ;
	public final PddlParser.metricSpec_return metricSpec() throws RecognitionException {
		PddlParser.metricSpec_return retval = new PddlParser.metricSpec_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal450=null;
		Token string_literal451=null;
		Token char_literal454=null;
		ParserRuleReturnScope optimization452 =null;
		ParserRuleReturnScope metricFExp453 =null;

		Object char_literal450_tree=null;
		Object string_literal451_tree=null;
		Object char_literal454_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_metricFExp=new RewriteRuleSubtreeStream(adaptor,"rule metricFExp");
		RewriteRuleSubtreeStream stream_optimization=new RewriteRuleSubtreeStream(adaptor,"rule optimization");

		try {
			// Pddl.g:596:2: ( '(' ':metric' optimization metricFExp ')' -> ^( PROBLEM_METRIC optimization metricFExp ) )
			// Pddl.g:596:4: '(' ':metric' optimization metricFExp ')'
			{
			char_literal450=(Token)match(input,77,FOLLOW_77_in_metricSpec3865); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_77.add(char_literal450);

			string_literal451=(Token)match(input,95,FOLLOW_95_in_metricSpec3867); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_95.add(string_literal451);

			pushFollow(FOLLOW_optimization_in_metricSpec3869);
			optimization452=optimization();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_optimization.add(optimization452.getTree());
			pushFollow(FOLLOW_metricFExp_in_metricSpec3871);
			metricFExp453=metricFExp();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp453.getTree());
			char_literal454=(Token)match(input,78,FOLLOW_78_in_metricSpec3873); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_78.add(char_literal454);

			// AST REWRITE
			// elements: metricFExp, optimization
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 597:4: -> ^( PROBLEM_METRIC optimization metricFExp )
			{
				// Pddl.g:597:7: ^( PROBLEM_METRIC optimization metricFExp )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROBLEM_METRIC, "PROBLEM_METRIC"), root_1);
				adaptor.addChild(root_1, stream_optimization.nextTree());
				adaptor.addChild(root_1, stream_metricFExp.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "metricSpec"


	public static class optimization_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "optimization"
	// Pddl.g:600:1: optimization : ( 'minimize' | 'maximize' );
	public final PddlParser.optimization_return optimization() throws RecognitionException {
		PddlParser.optimization_return retval = new PddlParser.optimization_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set455=null;

		Object set455_tree=null;

		try {
			// Pddl.g:600:14: ( 'minimize' | 'maximize' )
			// Pddl.g:
			{
			root_0 = (Object)adaptor.nil();


			set455=input.LT(1);
			if ( (input.LA(1) >= 128 && input.LA(1) <= 129) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set455));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optimization"


	public static class metricFExp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "metricFExp"
	// Pddl.g:603:1: metricFExp : ( '(' binaryOp metricFExp metricFExp ')' -> ^( BINARY_OP metricFExp metricFExp ) | '(' '*' metricFExp ( metricFExp )+ ')' -> ^( MULTIOP_METRIC '*' metricFExp ( metricFExp )+ ) | '(' '/' metricFExp ( metricFExp )+ ')' -> ^( MULTIOP_METRIC '/' metricFExp ( metricFExp )+ ) | '(' '-' metricFExp ')' -> ^( UNARY_MINUS metricFExp ) | NUMBER -> ^( NUMBER_METRIC NUMBER ) | '(' 'is-violated' NAME ')' -> ^( VIOLATED_METRIC NAME ) | '(' 'total-time' ')' -> ^( TIME_METRIC ) | '(' functionSymbol ( NAME )* ')' -> ^( FUNC_HEAD functionSymbol ^( PARAMS ( NAME )* ) ) );
	public final PddlParser.metricFExp_return metricFExp() throws RecognitionException {
		PddlParser.metricFExp_return retval = new PddlParser.metricFExp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal456=null;
		Token char_literal460=null;
		Token char_literal461=null;
		Token char_literal462=null;
		Token char_literal465=null;
		Token char_literal466=null;
		Token char_literal467=null;
		Token char_literal470=null;
		Token char_literal471=null;
		Token char_literal472=null;
		Token char_literal474=null;
		Token NUMBER475=null;
		Token char_literal476=null;
		Token string_literal477=null;
		Token NAME478=null;
		Token char_literal479=null;
		Token char_literal480=null;
		Token string_literal481=null;
		Token char_literal482=null;
		Token char_literal483=null;
		Token NAME485=null;
		Token char_literal486=null;
		ParserRuleReturnScope binaryOp457 =null;
		ParserRuleReturnScope metricFExp458 =null;
		ParserRuleReturnScope metricFExp459 =null;
		ParserRuleReturnScope metricFExp463 =null;
		ParserRuleReturnScope metricFExp464 =null;
		ParserRuleReturnScope metricFExp468 =null;
		ParserRuleReturnScope metricFExp469 =null;
		ParserRuleReturnScope metricFExp473 =null;
		ParserRuleReturnScope functionSymbol484 =null;

		Object char_literal456_tree=null;
		Object char_literal460_tree=null;
		Object char_literal461_tree=null;
		Object char_literal462_tree=null;
		Object char_literal465_tree=null;
		Object char_literal466_tree=null;
		Object char_literal467_tree=null;
		Object char_literal470_tree=null;
		Object char_literal471_tree=null;
		Object char_literal472_tree=null;
		Object char_literal474_tree=null;
		Object NUMBER475_tree=null;
		Object char_literal476_tree=null;
		Object string_literal477_tree=null;
		Object NAME478_tree=null;
		Object char_literal479_tree=null;
		Object char_literal480_tree=null;
		Object string_literal481_tree=null;
		Object char_literal482_tree=null;
		Object char_literal483_tree=null;
		Object NAME485_tree=null;
		Object char_literal486_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_141=new RewriteRuleTokenStream(adaptor,"token 141");
		RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
		RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
		RewriteRuleSubtreeStream stream_metricFExp=new RewriteRuleSubtreeStream(adaptor,"rule metricFExp");
		RewriteRuleSubtreeStream stream_functionSymbol=new RewriteRuleSubtreeStream(adaptor,"rule functionSymbol");

		try {
			// Pddl.g:604:2: ( '(' binaryOp metricFExp metricFExp ')' -> ^( BINARY_OP metricFExp metricFExp ) | '(' '*' metricFExp ( metricFExp )+ ')' -> ^( MULTIOP_METRIC '*' metricFExp ( metricFExp )+ ) | '(' '/' metricFExp ( metricFExp )+ ')' -> ^( MULTIOP_METRIC '/' metricFExp ( metricFExp )+ ) | '(' '-' metricFExp ')' -> ^( UNARY_MINUS metricFExp ) | NUMBER -> ^( NUMBER_METRIC NUMBER ) | '(' 'is-violated' NAME ')' -> ^( VIOLATED_METRIC NAME ) | '(' 'total-time' ')' -> ^( TIME_METRIC ) | '(' functionSymbol ( NAME )* ')' -> ^( FUNC_HEAD functionSymbol ^( PARAMS ( NAME )* ) ) )
			int alt86=8;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==77) ) {
				int LA86_1 = input.LA(2);
				if ( (synpred134_Pddl()) ) {
					alt86=1;
				}
				else if ( (synpred136_Pddl()) ) {
					alt86=2;
				}
				else if ( (synpred138_Pddl()) ) {
					alt86=3;
				}
				else if ( (synpred139_Pddl()) ) {
					alt86=4;
				}
				else if ( (synpred141_Pddl()) ) {
					alt86=6;
				}
				else if ( (synpred142_Pddl()) ) {
					alt86=7;
				}
				else if ( (true) ) {
					alt86=8;
				}

			}
			else if ( (LA86_0==NUMBER) ) {
				alt86=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}

			switch (alt86) {
				case 1 :
					// Pddl.g:604:4: '(' binaryOp metricFExp metricFExp ')'
					{
					char_literal456=(Token)match(input,77,FOLLOW_77_in_metricFExp3912); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal456);

					pushFollow(FOLLOW_binaryOp_in_metricFExp3914);
					binaryOp457=binaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_binaryOp.add(binaryOp457.getTree());
					pushFollow(FOLLOW_metricFExp_in_metricFExp3916);
					metricFExp458=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp458.getTree());
					pushFollow(FOLLOW_metricFExp_in_metricFExp3918);
					metricFExp459=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp459.getTree());
					char_literal460=(Token)match(input,78,FOLLOW_78_in_metricFExp3920); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal460);

					// AST REWRITE
					// elements: metricFExp, metricFExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 605:4: -> ^( BINARY_OP metricFExp metricFExp )
					{
						// Pddl.g:605:7: ^( BINARY_OP metricFExp metricFExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BINARY_OP, "BINARY_OP"), root_1);
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Pddl.g:606:4: '(' '*' metricFExp ( metricFExp )+ ')'
					{
					char_literal461=(Token)match(input,77,FOLLOW_77_in_metricFExp3938); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal461);

					char_literal462=(Token)match(input,79,FOLLOW_79_in_metricFExp3940); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal462);

					pushFollow(FOLLOW_metricFExp_in_metricFExp3942);
					metricFExp463=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp463.getTree());
					// Pddl.g:606:23: ( metricFExp )+
					int cnt83=0;
					loop83:
					while (true) {
						int alt83=2;
						int LA83_0 = input.LA(1);
						if ( (LA83_0==NUMBER||LA83_0==77) ) {
							alt83=1;
						}

						switch (alt83) {
						case 1 :
							// Pddl.g:606:23: metricFExp
							{
							pushFollow(FOLLOW_metricFExp_in_metricFExp3944);
							metricFExp464=metricFExp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp464.getTree());
							}
							break;

						default :
							if ( cnt83 >= 1 ) break loop83;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(83, input);
							throw eee;
						}
						cnt83++;
					}

					char_literal465=(Token)match(input,78,FOLLOW_78_in_metricFExp3947); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal465);

					// AST REWRITE
					// elements: 79, metricFExp, metricFExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 607:4: -> ^( MULTIOP_METRIC '*' metricFExp ( metricFExp )+ )
					{
						// Pddl.g:607:7: ^( MULTIOP_METRIC '*' metricFExp ( metricFExp )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULTIOP_METRIC, "MULTIOP_METRIC"), root_1);
						adaptor.addChild(root_1, stream_79.nextNode());
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						if ( !(stream_metricFExp.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_metricFExp.hasNext() ) {
							adaptor.addChild(root_1, stream_metricFExp.nextTree());
						}
						stream_metricFExp.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// Pddl.g:608:4: '(' '/' metricFExp ( metricFExp )+ ')'
					{
					char_literal466=(Token)match(input,77,FOLLOW_77_in_metricFExp3968); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal466);

					char_literal467=(Token)match(input,82,FOLLOW_82_in_metricFExp3970); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_82.add(char_literal467);

					pushFollow(FOLLOW_metricFExp_in_metricFExp3972);
					metricFExp468=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp468.getTree());
					// Pddl.g:608:23: ( metricFExp )+
					int cnt84=0;
					loop84:
					while (true) {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==NUMBER||LA84_0==77) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// Pddl.g:608:23: metricFExp
							{
							pushFollow(FOLLOW_metricFExp_in_metricFExp3974);
							metricFExp469=metricFExp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp469.getTree());
							}
							break;

						default :
							if ( cnt84 >= 1 ) break loop84;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(84, input);
							throw eee;
						}
						cnt84++;
					}

					char_literal470=(Token)match(input,78,FOLLOW_78_in_metricFExp3977); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal470);

					// AST REWRITE
					// elements: 82, metricFExp, metricFExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 609:4: -> ^( MULTIOP_METRIC '/' metricFExp ( metricFExp )+ )
					{
						// Pddl.g:609:7: ^( MULTIOP_METRIC '/' metricFExp ( metricFExp )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULTIOP_METRIC, "MULTIOP_METRIC"), root_1);
						adaptor.addChild(root_1, stream_82.nextNode());
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						if ( !(stream_metricFExp.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_metricFExp.hasNext() ) {
							adaptor.addChild(root_1, stream_metricFExp.nextTree());
						}
						stream_metricFExp.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// Pddl.g:610:4: '(' '-' metricFExp ')'
					{
					char_literal471=(Token)match(input,77,FOLLOW_77_in_metricFExp3998); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal471);

					char_literal472=(Token)match(input,81,FOLLOW_81_in_metricFExp4000); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_81.add(char_literal472);

					pushFollow(FOLLOW_metricFExp_in_metricFExp4002);
					metricFExp473=metricFExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_metricFExp.add(metricFExp473.getTree());
					char_literal474=(Token)match(input,78,FOLLOW_78_in_metricFExp4004); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal474);

					// AST REWRITE
					// elements: metricFExp
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 611:4: -> ^( UNARY_MINUS metricFExp )
					{
						// Pddl.g:611:7: ^( UNARY_MINUS metricFExp )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_metricFExp.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Pddl.g:612:4: NUMBER
					{
					NUMBER475=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_metricFExp4020); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER475);

					// AST REWRITE
					// elements: NUMBER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 613:4: -> ^( NUMBER_METRIC NUMBER )
					{
						// Pddl.g:613:7: ^( NUMBER_METRIC NUMBER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUMBER_METRIC, "NUMBER_METRIC"), root_1);
						adaptor.addChild(root_1, stream_NUMBER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// Pddl.g:614:4: '(' 'is-violated' NAME ')'
					{
					char_literal476=(Token)match(input,77,FOLLOW_77_in_metricFExp4036); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal476);

					string_literal477=(Token)match(input,127,FOLLOW_127_in_metricFExp4038); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_127.add(string_literal477);

					NAME478=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp4040); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAME.add(NAME478);

					char_literal479=(Token)match(input,78,FOLLOW_78_in_metricFExp4042); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal479);

					// AST REWRITE
					// elements: NAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 615:4: -> ^( VIOLATED_METRIC NAME )
					{
						// Pddl.g:615:7: ^( VIOLATED_METRIC NAME )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VIOLATED_METRIC, "VIOLATED_METRIC"), root_1);
						adaptor.addChild(root_1, stream_NAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// Pddl.g:616:8: '(' 'total-time' ')'
					{
					char_literal480=(Token)match(input,77,FOLLOW_77_in_metricFExp4062); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal480);

					string_literal481=(Token)match(input,141,FOLLOW_141_in_metricFExp4064); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_141.add(string_literal481);

					char_literal482=(Token)match(input,78,FOLLOW_78_in_metricFExp4066); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal482);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 617:4: -> ^( TIME_METRIC )
					{
						// Pddl.g:617:7: ^( TIME_METRIC )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIME_METRIC, "TIME_METRIC"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// Pddl.g:618:4: '(' functionSymbol ( NAME )* ')'
					{
					char_literal483=(Token)match(input,77,FOLLOW_77_in_metricFExp4080); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(char_literal483);

					pushFollow(FOLLOW_functionSymbol_in_metricFExp4082);
					functionSymbol484=functionSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_functionSymbol.add(functionSymbol484.getTree());
					// Pddl.g:618:23: ( NAME )*
					loop85:
					while (true) {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==NAME) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// Pddl.g:618:23: NAME
							{
							NAME485=(Token)match(input,NAME,FOLLOW_NAME_in_metricFExp4084); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_NAME.add(NAME485);

							}
							break;

						default :
							break loop85;
						}
					}

					char_literal486=(Token)match(input,78,FOLLOW_78_in_metricFExp4087); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal486);

					// AST REWRITE
					// elements: NAME, functionSymbol
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 619:4: -> ^( FUNC_HEAD functionSymbol ^( PARAMS ( NAME )* ) )
					{
						// Pddl.g:619:7: ^( FUNC_HEAD functionSymbol ^( PARAMS ( NAME )* ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_HEAD, "FUNC_HEAD"), root_1);
						adaptor.addChild(root_1, stream_functionSymbol.nextTree());
						// Pddl.g:619:34: ^( PARAMS ( NAME )* )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMS, "PARAMS"), root_2);
						// Pddl.g:619:43: ( NAME )*
						while ( stream_NAME.hasNext() ) {
							adaptor.addChild(root_2, stream_NAME.nextNode());
						}
						stream_NAME.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "metricFExp"


	public static class conGD_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conGD"
	// Pddl.g:624:1: conGD : ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' logicExpr ')' | '(' 'always' logicExpr ')' | '(' 'sometime' logicExpr ')' | '(' 'within' NUMBER logicExpr ')' | '(' 'at-most-once' logicExpr ')' | '(' 'sometime-after' logicExpr logicExpr ')' | '(' 'sometime-before' logicExpr logicExpr ')' | '(' 'always-within' NUMBER logicExpr logicExpr ')' | '(' 'hold-during' NUMBER NUMBER logicExpr ')' | '(' 'hold-after' NUMBER logicExpr ')' );
	public final PddlParser.conGD_return conGD() throws RecognitionException {
		PddlParser.conGD_return retval = new PddlParser.conGD_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal487=null;
		Token string_literal488=null;
		Token char_literal490=null;
		Token char_literal491=null;
		Token string_literal492=null;
		Token char_literal493=null;
		Token char_literal495=null;
		Token char_literal497=null;
		Token char_literal498=null;
		Token string_literal499=null;
		Token string_literal500=null;
		Token char_literal502=null;
		Token char_literal503=null;
		Token string_literal504=null;
		Token char_literal506=null;
		Token char_literal507=null;
		Token string_literal508=null;
		Token char_literal510=null;
		Token char_literal511=null;
		Token string_literal512=null;
		Token NUMBER513=null;
		Token char_literal515=null;
		Token char_literal516=null;
		Token string_literal517=null;
		Token char_literal519=null;
		Token char_literal520=null;
		Token string_literal521=null;
		Token char_literal524=null;
		Token char_literal525=null;
		Token string_literal526=null;
		Token char_literal529=null;
		Token char_literal530=null;
		Token string_literal531=null;
		Token NUMBER532=null;
		Token char_literal535=null;
		Token char_literal536=null;
		Token string_literal537=null;
		Token NUMBER538=null;
		Token NUMBER539=null;
		Token char_literal541=null;
		Token char_literal542=null;
		Token string_literal543=null;
		Token NUMBER544=null;
		Token char_literal546=null;
		ParserRuleReturnScope conGD489 =null;
		ParserRuleReturnScope typedVariableList494 =null;
		ParserRuleReturnScope conGD496 =null;
		ParserRuleReturnScope logicExpr501 =null;
		ParserRuleReturnScope logicExpr505 =null;
		ParserRuleReturnScope logicExpr509 =null;
		ParserRuleReturnScope logicExpr514 =null;
		ParserRuleReturnScope logicExpr518 =null;
		ParserRuleReturnScope logicExpr522 =null;
		ParserRuleReturnScope logicExpr523 =null;
		ParserRuleReturnScope logicExpr527 =null;
		ParserRuleReturnScope logicExpr528 =null;
		ParserRuleReturnScope logicExpr533 =null;
		ParserRuleReturnScope logicExpr534 =null;
		ParserRuleReturnScope logicExpr540 =null;
		ParserRuleReturnScope logicExpr545 =null;

		Object char_literal487_tree=null;
		Object string_literal488_tree=null;
		Object char_literal490_tree=null;
		Object char_literal491_tree=null;
		Object string_literal492_tree=null;
		Object char_literal493_tree=null;
		Object char_literal495_tree=null;
		Object char_literal497_tree=null;
		Object char_literal498_tree=null;
		Object string_literal499_tree=null;
		Object string_literal500_tree=null;
		Object char_literal502_tree=null;
		Object char_literal503_tree=null;
		Object string_literal504_tree=null;
		Object char_literal506_tree=null;
		Object char_literal507_tree=null;
		Object string_literal508_tree=null;
		Object char_literal510_tree=null;
		Object char_literal511_tree=null;
		Object string_literal512_tree=null;
		Object NUMBER513_tree=null;
		Object char_literal515_tree=null;
		Object char_literal516_tree=null;
		Object string_literal517_tree=null;
		Object char_literal519_tree=null;
		Object char_literal520_tree=null;
		Object string_literal521_tree=null;
		Object char_literal524_tree=null;
		Object char_literal525_tree=null;
		Object string_literal526_tree=null;
		Object char_literal529_tree=null;
		Object char_literal530_tree=null;
		Object string_literal531_tree=null;
		Object NUMBER532_tree=null;
		Object char_literal535_tree=null;
		Object char_literal536_tree=null;
		Object string_literal537_tree=null;
		Object NUMBER538_tree=null;
		Object NUMBER539_tree=null;
		Object char_literal541_tree=null;
		Object char_literal542_tree=null;
		Object string_literal543_tree=null;
		Object NUMBER544_tree=null;
		Object char_literal546_tree=null;

		try {
			// Pddl.g:625:2: ( '(' 'and' ( conGD )* ')' | '(' 'forall' '(' typedVariableList ')' conGD ')' | '(' 'at' 'end' logicExpr ')' | '(' 'always' logicExpr ')' | '(' 'sometime' logicExpr ')' | '(' 'within' NUMBER logicExpr ')' | '(' 'at-most-once' logicExpr ')' | '(' 'sometime-after' logicExpr logicExpr ')' | '(' 'sometime-before' logicExpr logicExpr ')' | '(' 'always-within' NUMBER logicExpr logicExpr ')' | '(' 'hold-during' NUMBER NUMBER logicExpr ')' | '(' 'hold-after' NUMBER logicExpr ')' )
			int alt88=12;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==77) ) {
				switch ( input.LA(2) ) {
				case 112:
					{
					alt88=1;
					}
					break;
				case 122:
					{
					alt88=2;
					}
					break;
				case 114:
					{
					alt88=3;
					}
					break;
				case 110:
					{
					alt88=4;
					}
					break;
				case 137:
					{
					alt88=5;
					}
					break;
				case 143:
					{
					alt88=6;
					}
					break;
				case 115:
					{
					alt88=7;
					}
					break;
				case 138:
					{
					alt88=8;
					}
					break;
				case 139:
					{
					alt88=9;
					}
					break;
				case 111:
					{
					alt88=10;
					}
					break;
				case 124:
					{
					alt88=11;
					}
					break;
				case 123:
					{
					alt88=12;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 88, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// Pddl.g:625:4: '(' 'and' ( conGD )* ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal487=(Token)match(input,77,FOLLOW_77_in_conGD4119); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal487_tree = (Object)adaptor.create(char_literal487);
					adaptor.addChild(root_0, char_literal487_tree);
					}

					string_literal488=(Token)match(input,112,FOLLOW_112_in_conGD4121); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal488_tree = (Object)adaptor.create(string_literal488);
					adaptor.addChild(root_0, string_literal488_tree);
					}

					// Pddl.g:625:14: ( conGD )*
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==77) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// Pddl.g:625:14: conGD
							{
							pushFollow(FOLLOW_conGD_in_conGD4123);
							conGD489=conGD();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD489.getTree());

							}
							break;

						default :
							break loop87;
						}
					}

					char_literal490=(Token)match(input,78,FOLLOW_78_in_conGD4126); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal490_tree = (Object)adaptor.create(char_literal490);
					adaptor.addChild(root_0, char_literal490_tree);
					}

					}
					break;
				case 2 :
					// Pddl.g:626:4: '(' 'forall' '(' typedVariableList ')' conGD ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal491=(Token)match(input,77,FOLLOW_77_in_conGD4131); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal491_tree = (Object)adaptor.create(char_literal491);
					adaptor.addChild(root_0, char_literal491_tree);
					}

					string_literal492=(Token)match(input,122,FOLLOW_122_in_conGD4133); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal492_tree = (Object)adaptor.create(string_literal492);
					adaptor.addChild(root_0, string_literal492_tree);
					}

					char_literal493=(Token)match(input,77,FOLLOW_77_in_conGD4135); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal493_tree = (Object)adaptor.create(char_literal493);
					adaptor.addChild(root_0, char_literal493_tree);
					}

					pushFollow(FOLLOW_typedVariableList_in_conGD4137);
					typedVariableList494=typedVariableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, typedVariableList494.getTree());

					char_literal495=(Token)match(input,78,FOLLOW_78_in_conGD4139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal495_tree = (Object)adaptor.create(char_literal495);
					adaptor.addChild(root_0, char_literal495_tree);
					}

					pushFollow(FOLLOW_conGD_in_conGD4141);
					conGD496=conGD();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conGD496.getTree());

					char_literal497=(Token)match(input,78,FOLLOW_78_in_conGD4143); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal497_tree = (Object)adaptor.create(char_literal497);
					adaptor.addChild(root_0, char_literal497_tree);
					}

					}
					break;
				case 3 :
					// Pddl.g:627:4: '(' 'at' 'end' logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal498=(Token)match(input,77,FOLLOW_77_in_conGD4148); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal498_tree = (Object)adaptor.create(char_literal498);
					adaptor.addChild(root_0, char_literal498_tree);
					}

					string_literal499=(Token)match(input,114,FOLLOW_114_in_conGD4150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal499_tree = (Object)adaptor.create(string_literal499);
					adaptor.addChild(root_0, string_literal499_tree);
					}

					string_literal500=(Token)match(input,120,FOLLOW_120_in_conGD4152); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal500_tree = (Object)adaptor.create(string_literal500);
					adaptor.addChild(root_0, string_literal500_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4154);
					logicExpr501=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr501.getTree());

					char_literal502=(Token)match(input,78,FOLLOW_78_in_conGD4156); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal502_tree = (Object)adaptor.create(char_literal502);
					adaptor.addChild(root_0, char_literal502_tree);
					}

					}
					break;
				case 4 :
					// Pddl.g:628:7: '(' 'always' logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal503=(Token)match(input,77,FOLLOW_77_in_conGD4164); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal503_tree = (Object)adaptor.create(char_literal503);
					adaptor.addChild(root_0, char_literal503_tree);
					}

					string_literal504=(Token)match(input,110,FOLLOW_110_in_conGD4166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal504_tree = (Object)adaptor.create(string_literal504);
					adaptor.addChild(root_0, string_literal504_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4168);
					logicExpr505=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr505.getTree());

					char_literal506=(Token)match(input,78,FOLLOW_78_in_conGD4170); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal506_tree = (Object)adaptor.create(char_literal506);
					adaptor.addChild(root_0, char_literal506_tree);
					}

					}
					break;
				case 5 :
					// Pddl.g:629:4: '(' 'sometime' logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal507=(Token)match(input,77,FOLLOW_77_in_conGD4175); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal507_tree = (Object)adaptor.create(char_literal507);
					adaptor.addChild(root_0, char_literal507_tree);
					}

					string_literal508=(Token)match(input,137,FOLLOW_137_in_conGD4177); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal508_tree = (Object)adaptor.create(string_literal508);
					adaptor.addChild(root_0, string_literal508_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4179);
					logicExpr509=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr509.getTree());

					char_literal510=(Token)match(input,78,FOLLOW_78_in_conGD4181); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal510_tree = (Object)adaptor.create(char_literal510);
					adaptor.addChild(root_0, char_literal510_tree);
					}

					}
					break;
				case 6 :
					// Pddl.g:630:5: '(' 'within' NUMBER logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal511=(Token)match(input,77,FOLLOW_77_in_conGD4187); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal511_tree = (Object)adaptor.create(char_literal511);
					adaptor.addChild(root_0, char_literal511_tree);
					}

					string_literal512=(Token)match(input,143,FOLLOW_143_in_conGD4189); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal512_tree = (Object)adaptor.create(string_literal512);
					adaptor.addChild(root_0, string_literal512_tree);
					}

					NUMBER513=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD4191); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER513_tree = (Object)adaptor.create(NUMBER513);
					adaptor.addChild(root_0, NUMBER513_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4193);
					logicExpr514=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr514.getTree());

					char_literal515=(Token)match(input,78,FOLLOW_78_in_conGD4195); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal515_tree = (Object)adaptor.create(char_literal515);
					adaptor.addChild(root_0, char_literal515_tree);
					}

					}
					break;
				case 7 :
					// Pddl.g:631:4: '(' 'at-most-once' logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal516=(Token)match(input,77,FOLLOW_77_in_conGD4200); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal516_tree = (Object)adaptor.create(char_literal516);
					adaptor.addChild(root_0, char_literal516_tree);
					}

					string_literal517=(Token)match(input,115,FOLLOW_115_in_conGD4202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal517_tree = (Object)adaptor.create(string_literal517);
					adaptor.addChild(root_0, string_literal517_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4204);
					logicExpr518=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr518.getTree());

					char_literal519=(Token)match(input,78,FOLLOW_78_in_conGD4206); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal519_tree = (Object)adaptor.create(char_literal519);
					adaptor.addChild(root_0, char_literal519_tree);
					}

					}
					break;
				case 8 :
					// Pddl.g:632:4: '(' 'sometime-after' logicExpr logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal520=(Token)match(input,77,FOLLOW_77_in_conGD4211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal520_tree = (Object)adaptor.create(char_literal520);
					adaptor.addChild(root_0, char_literal520_tree);
					}

					string_literal521=(Token)match(input,138,FOLLOW_138_in_conGD4213); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal521_tree = (Object)adaptor.create(string_literal521);
					adaptor.addChild(root_0, string_literal521_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4215);
					logicExpr522=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr522.getTree());

					pushFollow(FOLLOW_logicExpr_in_conGD4217);
					logicExpr523=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr523.getTree());

					char_literal524=(Token)match(input,78,FOLLOW_78_in_conGD4219); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal524_tree = (Object)adaptor.create(char_literal524);
					adaptor.addChild(root_0, char_literal524_tree);
					}

					}
					break;
				case 9 :
					// Pddl.g:633:4: '(' 'sometime-before' logicExpr logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal525=(Token)match(input,77,FOLLOW_77_in_conGD4224); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal525_tree = (Object)adaptor.create(char_literal525);
					adaptor.addChild(root_0, char_literal525_tree);
					}

					string_literal526=(Token)match(input,139,FOLLOW_139_in_conGD4226); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal526_tree = (Object)adaptor.create(string_literal526);
					adaptor.addChild(root_0, string_literal526_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4228);
					logicExpr527=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr527.getTree());

					pushFollow(FOLLOW_logicExpr_in_conGD4230);
					logicExpr528=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr528.getTree());

					char_literal529=(Token)match(input,78,FOLLOW_78_in_conGD4232); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal529_tree = (Object)adaptor.create(char_literal529);
					adaptor.addChild(root_0, char_literal529_tree);
					}

					}
					break;
				case 10 :
					// Pddl.g:634:4: '(' 'always-within' NUMBER logicExpr logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal530=(Token)match(input,77,FOLLOW_77_in_conGD4237); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal530_tree = (Object)adaptor.create(char_literal530);
					adaptor.addChild(root_0, char_literal530_tree);
					}

					string_literal531=(Token)match(input,111,FOLLOW_111_in_conGD4239); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal531_tree = (Object)adaptor.create(string_literal531);
					adaptor.addChild(root_0, string_literal531_tree);
					}

					NUMBER532=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD4241); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER532_tree = (Object)adaptor.create(NUMBER532);
					adaptor.addChild(root_0, NUMBER532_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4243);
					logicExpr533=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr533.getTree());

					pushFollow(FOLLOW_logicExpr_in_conGD4245);
					logicExpr534=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr534.getTree());

					char_literal535=(Token)match(input,78,FOLLOW_78_in_conGD4247); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal535_tree = (Object)adaptor.create(char_literal535);
					adaptor.addChild(root_0, char_literal535_tree);
					}

					}
					break;
				case 11 :
					// Pddl.g:635:4: '(' 'hold-during' NUMBER NUMBER logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal536=(Token)match(input,77,FOLLOW_77_in_conGD4252); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal536_tree = (Object)adaptor.create(char_literal536);
					adaptor.addChild(root_0, char_literal536_tree);
					}

					string_literal537=(Token)match(input,124,FOLLOW_124_in_conGD4254); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal537_tree = (Object)adaptor.create(string_literal537);
					adaptor.addChild(root_0, string_literal537_tree);
					}

					NUMBER538=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD4256); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER538_tree = (Object)adaptor.create(NUMBER538);
					adaptor.addChild(root_0, NUMBER538_tree);
					}

					NUMBER539=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD4258); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER539_tree = (Object)adaptor.create(NUMBER539);
					adaptor.addChild(root_0, NUMBER539_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4260);
					logicExpr540=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr540.getTree());

					char_literal541=(Token)match(input,78,FOLLOW_78_in_conGD4262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal541_tree = (Object)adaptor.create(char_literal541);
					adaptor.addChild(root_0, char_literal541_tree);
					}

					}
					break;
				case 12 :
					// Pddl.g:636:4: '(' 'hold-after' NUMBER logicExpr ')'
					{
					root_0 = (Object)adaptor.nil();


					char_literal542=(Token)match(input,77,FOLLOW_77_in_conGD4267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal542_tree = (Object)adaptor.create(char_literal542);
					adaptor.addChild(root_0, char_literal542_tree);
					}

					string_literal543=(Token)match(input,123,FOLLOW_123_in_conGD4269); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal543_tree = (Object)adaptor.create(string_literal543);
					adaptor.addChild(root_0, string_literal543_tree);
					}

					NUMBER544=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_conGD4271); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER544_tree = (Object)adaptor.create(NUMBER544);
					adaptor.addChild(root_0, NUMBER544_tree);
					}

					pushFollow(FOLLOW_logicExpr_in_conGD4273);
					logicExpr545=logicExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicExpr545.getTree());

					char_literal546=(Token)match(input,78,FOLLOW_78_in_conGD4275); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal546_tree = (Object)adaptor.create(char_literal546);
					adaptor.addChild(root_0, char_literal546_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conGD"

	// $ANTLR start synpred18_Pddl
	public final void synpred18_Pddl_fragment() throws RecognitionException {
		// Pddl.g:172:11: ( typedFunctionList )
		// Pddl.g:172:11: typedFunctionList
		{
		pushFollow(FOLLOW_typedFunctionList_in_synpred18_Pddl928);
		typedFunctionList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_Pddl

	// $ANTLR start synpred19_Pddl
	public final void synpred19_Pddl_fragment() throws RecognitionException {
		// Pddl.g:172:31: ( untypedFunctionList )
		// Pddl.g:172:31: untypedFunctionList
		{
		pushFollow(FOLLOW_untypedFunctionList_in_synpred19_Pddl932);
		untypedFunctionList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_Pddl

	// $ANTLR start synpred20_Pddl
	public final void synpred20_Pddl_fragment() throws RecognitionException {
		// Pddl.g:176:9: ( atomicFunctionSkeleton )
		// Pddl.g:176:9: atomicFunctionSkeleton
		{
		pushFollow(FOLLOW_atomicFunctionSkeleton_in_synpred20_Pddl955);
		atomicFunctionSkeleton();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_Pddl

	// $ANTLR start synpred22_Pddl
	public final void synpred22_Pddl_fragment() throws RecognitionException {
		// Pddl.g:203:16: ( NUMBER_STR )
		// Pddl.g:203:16: NUMBER_STR
		{
		match(input,NUMBER_STR,FOLLOW_NUMBER_STR_in_synpred22_Pddl1075); if (state.failed) return;

		}

	}
	// $ANTLR end synpred22_Pddl

	// $ANTLR start synpred23_Pddl
	public final void synpred23_Pddl_fragment() throws RecognitionException {
		// Pddl.g:203:29: ( NAME )
		// Pddl.g:203:29: NAME
		{
		match(input,NAME,FOLLOW_NAME_in_synpred23_Pddl1079); if (state.failed) return;

		}

	}
	// $ANTLR end synpred23_Pddl

	// $ANTLR start synpred53_Pddl
	public final void synpred53_Pddl_fragment() throws RecognitionException {
		// Pddl.g:322:4: ( '(' '=' fCompExp ( term | UNDEFINED ) ')' )
		// Pddl.g:322:4: '(' '=' fCompExp ( term | UNDEFINED ) ')'
		{
		match(input,77,FOLLOW_77_in_synpred53_Pddl1836); if (state.failed) return;

		match(input,105,FOLLOW_105_in_synpred53_Pddl1839); if (state.failed) return;

		pushFollow(FOLLOW_fCompExp_in_synpred53_Pddl1841);
		fCompExp();
		state._fsp--;
		if (state.failed) return;

		// Pddl.g:322:22: ( term | UNDEFINED )
		int alt97=2;
		int LA97_0 = input.LA(1);
		if ( (LA97_0==NAME||LA97_0==NUMBER||LA97_0==VARIABLE||LA97_0==77) ) {
			alt97=1;
		}
		else if ( (LA97_0==UNDEFINED) ) {
			alt97=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 97, 0, input);
			throw nvae;
		}

		switch (alt97) {
			case 1 :
				// Pddl.g:322:23: term
				{
				pushFollow(FOLLOW_term_in_synpred53_Pddl1844);
				term();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// Pddl.g:322:30: UNDEFINED
				{
				match(input,UNDEFINED,FOLLOW_UNDEFINED_in_synpred53_Pddl1848); if (state.failed) return;

				}
				break;

		}

		match(input,78,FOLLOW_78_in_synpred53_Pddl1851); if (state.failed) return;

		}

	}
	// $ANTLR end synpred53_Pddl

	// $ANTLR start synpred55_Pddl
	public final void synpred55_Pddl_fragment() throws RecognitionException {
		// Pddl.g:327:11: ( VARIABLE )
		// Pddl.g:327:11: VARIABLE
		{
		match(input,VARIABLE,FOLLOW_VARIABLE_in_synpred55_Pddl1882); if (state.failed) return;

		}

	}
	// $ANTLR end synpred55_Pddl

	// $ANTLR start synpred57_Pddl
	public final void synpred57_Pddl_fragment() throws RecognitionException {
		// Pddl.g:334:8: ( NAME )
		// Pddl.g:334:8: NAME
		{
		match(input,NAME,FOLLOW_NAME_in_synpred57_Pddl1930); if (state.failed) return;

		}

	}
	// $ANTLR end synpred57_Pddl

	// $ANTLR start synpred59_Pddl
	public final void synpred59_Pddl_fragment() throws RecognitionException {
		// Pddl.g:334:26: ( fHead )
		// Pddl.g:334:26: fHead
		{
		pushFollow(FOLLOW_fHead_in_synpred59_Pddl1938);
		fHead();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred59_Pddl

	// $ANTLR start synpred71_Pddl
	public final void synpred71_Pddl_fragment() throws RecognitionException {
		// Pddl.g:390:4: ( '(' binaryOp fExp fExp2 ')' )
		// Pddl.g:390:4: '(' binaryOp fExp fExp2 ')'
		{
		match(input,77,FOLLOW_77_in_synpred71_Pddl2337); if (state.failed) return;

		pushFollow(FOLLOW_binaryOp_in_synpred71_Pddl2339);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred71_Pddl2341);
		fExp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExp2_in_synpred71_Pddl2343);
		fExp2();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred71_Pddl2345); if (state.failed) return;

		}

	}
	// $ANTLR end synpred71_Pddl

	// $ANTLR start synpred72_Pddl
	public final void synpred72_Pddl_fragment() throws RecognitionException {
		// Pddl.g:391:4: ( '(' '-' fExp ')' )
		// Pddl.g:391:4: '(' '-' fExp ')'
		{
		match(input,77,FOLLOW_77_in_synpred72_Pddl2362); if (state.failed) return;

		match(input,81,FOLLOW_81_in_synpred72_Pddl2364); if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred72_Pddl2366);
		fExp();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred72_Pddl2368); if (state.failed) return;

		}

	}
	// $ANTLR end synpred72_Pddl

	// $ANTLR start synpred79_Pddl
	public final void synpred79_Pddl_fragment() throws RecognitionException {
		// Pddl.g:419:4: ( '(' 'not' atomicTermFormula ')' )
		// Pddl.g:419:4: '(' 'not' atomicTermFormula ')'
		{
		match(input,77,FOLLOW_77_in_synpred79_Pddl2554); if (state.failed) return;

		match(input,130,FOLLOW_130_in_synpred79_Pddl2556); if (state.failed) return;

		pushFollow(FOLLOW_atomicTermFormula_in_synpred79_Pddl2558);
		atomicTermFormula();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred79_Pddl2560); if (state.failed) return;

		}

	}
	// $ANTLR end synpred79_Pddl

	// $ANTLR start synpred80_Pddl
	public final void synpred80_Pddl_fragment() throws RecognitionException {
		// Pddl.g:421:4: ( atomicTermFormula )
		// Pddl.g:421:4: atomicTermFormula
		{
		pushFollow(FOLLOW_atomicTermFormula_in_synpred80_Pddl2576);
		atomicTermFormula();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred80_Pddl

	// $ANTLR start synpred81_Pddl
	public final void synpred81_Pddl_fragment() throws RecognitionException {
		// Pddl.g:422:4: ( '(' assignOp fHead fExp ')' )
		// Pddl.g:422:4: '(' assignOp fHead fExp ')'
		{
		match(input,77,FOLLOW_77_in_synpred81_Pddl2581); if (state.failed) return;

		pushFollow(FOLLOW_assignOp_in_synpred81_Pddl2583);
		assignOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fHead_in_synpred81_Pddl2585);
		fHead();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExp_in_synpred81_Pddl2587);
		fExp();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred81_Pddl2589); if (state.failed) return;

		}

	}
	// $ANTLR end synpred81_Pddl

	// $ANTLR start synpred82_Pddl
	public final void synpred82_Pddl_fragment() throws RecognitionException {
		// Pddl.g:424:4: ( '(' assignOp fHead term ')' )
		// Pddl.g:424:4: '(' assignOp fHead term ')'
		{
		match(input,77,FOLLOW_77_in_synpred82_Pddl2609); if (state.failed) return;

		pushFollow(FOLLOW_assignOp_in_synpred82_Pddl2611);
		assignOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fHead_in_synpred82_Pddl2613);
		fHead();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_term_in_synpred82_Pddl2615);
		term();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred82_Pddl2617); if (state.failed) return;

		}

	}
	// $ANTLR end synpred82_Pddl

	// $ANTLR start synpred110_Pddl
	public final void synpred110_Pddl_fragment() throws RecognitionException {
		// Pddl.g:497:4: ( '(' binaryOp fExpDA fExpDA ')' )
		// Pddl.g:497:4: '(' binaryOp fExpDA fExpDA ')'
		{
		match(input,77,FOLLOW_77_in_synpred110_Pddl3151); if (state.failed) return;

		pushFollow(FOLLOW_binaryOp_in_synpred110_Pddl3153);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExpDA_in_synpred110_Pddl3155);
		fExpDA();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_fExpDA_in_synpred110_Pddl3157);
		fExpDA();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred110_Pddl3159); if (state.failed) return;

		}

	}
	// $ANTLR end synpred110_Pddl

	// $ANTLR start synpred111_Pddl
	public final void synpred111_Pddl_fragment() throws RecognitionException {
		// Pddl.g:499:4: ( '(' '-' fExpDA ')' )
		// Pddl.g:499:4: '(' '-' fExpDA ')'
		{
		match(input,77,FOLLOW_77_in_synpred111_Pddl3178); if (state.failed) return;

		match(input,81,FOLLOW_81_in_synpred111_Pddl3180); if (state.failed) return;

		pushFollow(FOLLOW_fExpDA_in_synpred111_Pddl3182);
		fExpDA();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred111_Pddl3184); if (state.failed) return;

		}

	}
	// $ANTLR end synpred111_Pddl

	// $ANTLR start synpred122_Pddl
	public final void synpred122_Pddl_fragment() throws RecognitionException {
		// Pddl.g:558:4: ( nameLiteral )
		// Pddl.g:558:4: nameLiteral
		{
		pushFollow(FOLLOW_nameLiteral_in_synpred122_Pddl3578);
		nameLiteral();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred122_Pddl

	// $ANTLR start synpred123_Pddl
	public final void synpred123_Pddl_fragment() throws RecognitionException {
		// Pddl.g:559:4: ( '(' '=' fHead NUMBER ')' )
		// Pddl.g:559:4: '(' '=' fHead NUMBER ')'
		{
		match(input,77,FOLLOW_77_in_synpred123_Pddl3583); if (state.failed) return;

		match(input,105,FOLLOW_105_in_synpred123_Pddl3585); if (state.failed) return;

		pushFollow(FOLLOW_fHead_in_synpred123_Pddl3587);
		fHead();
		state._fsp--;
		if (state.failed) return;

		match(input,NUMBER,FOLLOW_NUMBER_in_synpred123_Pddl3589); if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred123_Pddl3591); if (state.failed) return;

		}

	}
	// $ANTLR end synpred123_Pddl

	// $ANTLR start synpred124_Pddl
	public final void synpred124_Pddl_fragment() throws RecognitionException {
		// Pddl.g:560:4: ( '(' '=' fHead NAME ')' )
		// Pddl.g:560:4: '(' '=' fHead NAME ')'
		{
		match(input,77,FOLLOW_77_in_synpred124_Pddl3614); if (state.failed) return;

		match(input,105,FOLLOW_105_in_synpred124_Pddl3616); if (state.failed) return;

		pushFollow(FOLLOW_fHead_in_synpred124_Pddl3618);
		fHead();
		state._fsp--;
		if (state.failed) return;

		match(input,NAME,FOLLOW_NAME_in_synpred124_Pddl3620); if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred124_Pddl3622); if (state.failed) return;

		}

	}
	// $ANTLR end synpred124_Pddl

	// $ANTLR start synpred129_Pddl
	public final void synpred129_Pddl_fragment() throws RecognitionException {
		// Pddl.g:589:4: ( '(' 'and' ( prefConGD )* ')' )
		// Pddl.g:589:4: '(' 'and' ( prefConGD )* ')'
		{
		match(input,77,FOLLOW_77_in_synpred129_Pddl3811); if (state.failed) return;

		match(input,112,FOLLOW_112_in_synpred129_Pddl3813); if (state.failed) return;

		// Pddl.g:589:14: ( prefConGD )*
		loop106:
		while (true) {
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==77) ) {
				alt106=1;
			}

			switch (alt106) {
			case 1 :
				// Pddl.g:589:14: prefConGD
				{
				pushFollow(FOLLOW_prefConGD_in_synpred129_Pddl3815);
				prefConGD();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop106;
			}
		}

		match(input,78,FOLLOW_78_in_synpred129_Pddl3818); if (state.failed) return;

		}

	}
	// $ANTLR end synpred129_Pddl

	// $ANTLR start synpred130_Pddl
	public final void synpred130_Pddl_fragment() throws RecognitionException {
		// Pddl.g:590:4: ( '(' 'forall' '(' typedVariableList ')' prefConGD ')' )
		// Pddl.g:590:4: '(' 'forall' '(' typedVariableList ')' prefConGD ')'
		{
		match(input,77,FOLLOW_77_in_synpred130_Pddl3823); if (state.failed) return;

		match(input,122,FOLLOW_122_in_synpred130_Pddl3825); if (state.failed) return;

		match(input,77,FOLLOW_77_in_synpred130_Pddl3827); if (state.failed) return;

		pushFollow(FOLLOW_typedVariableList_in_synpred130_Pddl3829);
		typedVariableList();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred130_Pddl3831); if (state.failed) return;

		pushFollow(FOLLOW_prefConGD_in_synpred130_Pddl3833);
		prefConGD();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred130_Pddl3835); if (state.failed) return;

		}

	}
	// $ANTLR end synpred130_Pddl

	// $ANTLR start synpred132_Pddl
	public final void synpred132_Pddl_fragment() throws RecognitionException {
		// Pddl.g:591:4: ( '(' 'preference' ( NAME )? conGD ')' )
		// Pddl.g:591:4: '(' 'preference' ( NAME )? conGD ')'
		{
		match(input,77,FOLLOW_77_in_synpred132_Pddl3840); if (state.failed) return;

		match(input,133,FOLLOW_133_in_synpred132_Pddl3842); if (state.failed) return;

		// Pddl.g:591:21: ( NAME )?
		int alt107=2;
		int LA107_0 = input.LA(1);
		if ( (LA107_0==NAME) ) {
			alt107=1;
		}
		switch (alt107) {
			case 1 :
				// Pddl.g:591:21: NAME
				{
				match(input,NAME,FOLLOW_NAME_in_synpred132_Pddl3844); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_conGD_in_synpred132_Pddl3847);
		conGD();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred132_Pddl3849); if (state.failed) return;

		}

	}
	// $ANTLR end synpred132_Pddl

	// $ANTLR start synpred134_Pddl
	public final void synpred134_Pddl_fragment() throws RecognitionException {
		// Pddl.g:604:4: ( '(' binaryOp metricFExp metricFExp ')' )
		// Pddl.g:604:4: '(' binaryOp metricFExp metricFExp ')'
		{
		match(input,77,FOLLOW_77_in_synpred134_Pddl3912); if (state.failed) return;

		pushFollow(FOLLOW_binaryOp_in_synpred134_Pddl3914);
		binaryOp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred134_Pddl3916);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred134_Pddl3918);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred134_Pddl3920); if (state.failed) return;

		}

	}
	// $ANTLR end synpred134_Pddl

	// $ANTLR start synpred136_Pddl
	public final void synpred136_Pddl_fragment() throws RecognitionException {
		// Pddl.g:606:4: ( '(' '*' metricFExp ( metricFExp )+ ')' )
		// Pddl.g:606:4: '(' '*' metricFExp ( metricFExp )+ ')'
		{
		match(input,77,FOLLOW_77_in_synpred136_Pddl3938); if (state.failed) return;

		match(input,79,FOLLOW_79_in_synpred136_Pddl3940); if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred136_Pddl3942);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		// Pddl.g:606:23: ( metricFExp )+
		int cnt108=0;
		loop108:
		while (true) {
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==NUMBER||LA108_0==77) ) {
				alt108=1;
			}

			switch (alt108) {
			case 1 :
				// Pddl.g:606:23: metricFExp
				{
				pushFollow(FOLLOW_metricFExp_in_synpred136_Pddl3944);
				metricFExp();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				if ( cnt108 >= 1 ) break loop108;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(108, input);
				throw eee;
			}
			cnt108++;
		}

		match(input,78,FOLLOW_78_in_synpred136_Pddl3947); if (state.failed) return;

		}

	}
	// $ANTLR end synpred136_Pddl

	// $ANTLR start synpred138_Pddl
	public final void synpred138_Pddl_fragment() throws RecognitionException {
		// Pddl.g:608:4: ( '(' '/' metricFExp ( metricFExp )+ ')' )
		// Pddl.g:608:4: '(' '/' metricFExp ( metricFExp )+ ')'
		{
		match(input,77,FOLLOW_77_in_synpred138_Pddl3968); if (state.failed) return;

		match(input,82,FOLLOW_82_in_synpred138_Pddl3970); if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred138_Pddl3972);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		// Pddl.g:608:23: ( metricFExp )+
		int cnt109=0;
		loop109:
		while (true) {
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==NUMBER||LA109_0==77) ) {
				alt109=1;
			}

			switch (alt109) {
			case 1 :
				// Pddl.g:608:23: metricFExp
				{
				pushFollow(FOLLOW_metricFExp_in_synpred138_Pddl3974);
				metricFExp();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				if ( cnt109 >= 1 ) break loop109;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(109, input);
				throw eee;
			}
			cnt109++;
		}

		match(input,78,FOLLOW_78_in_synpred138_Pddl3977); if (state.failed) return;

		}

	}
	// $ANTLR end synpred138_Pddl

	// $ANTLR start synpred139_Pddl
	public final void synpred139_Pddl_fragment() throws RecognitionException {
		// Pddl.g:610:4: ( '(' '-' metricFExp ')' )
		// Pddl.g:610:4: '(' '-' metricFExp ')'
		{
		match(input,77,FOLLOW_77_in_synpred139_Pddl3998); if (state.failed) return;

		match(input,81,FOLLOW_81_in_synpred139_Pddl4000); if (state.failed) return;

		pushFollow(FOLLOW_metricFExp_in_synpred139_Pddl4002);
		metricFExp();
		state._fsp--;
		if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred139_Pddl4004); if (state.failed) return;

		}

	}
	// $ANTLR end synpred139_Pddl

	// $ANTLR start synpred141_Pddl
	public final void synpred141_Pddl_fragment() throws RecognitionException {
		// Pddl.g:614:4: ( '(' 'is-violated' NAME ')' )
		// Pddl.g:614:4: '(' 'is-violated' NAME ')'
		{
		match(input,77,FOLLOW_77_in_synpred141_Pddl4036); if (state.failed) return;

		match(input,127,FOLLOW_127_in_synpred141_Pddl4038); if (state.failed) return;

		match(input,NAME,FOLLOW_NAME_in_synpred141_Pddl4040); if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred141_Pddl4042); if (state.failed) return;

		}

	}
	// $ANTLR end synpred141_Pddl

	// $ANTLR start synpred142_Pddl
	public final void synpred142_Pddl_fragment() throws RecognitionException {
		// Pddl.g:616:8: ( '(' 'total-time' ')' )
		// Pddl.g:616:8: '(' 'total-time' ')'
		{
		match(input,77,FOLLOW_77_in_synpred142_Pddl4062); if (state.failed) return;

		match(input,141,FOLLOW_141_in_synpred142_Pddl4064); if (state.failed) return;

		match(input,78,FOLLOW_78_in_synpred142_Pddl4066); if (state.failed) return;

		}

	}
	// $ANTLR end synpred142_Pddl

	// Delegated rules

	public final boolean synpred129_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred129_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred138_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred138_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred57_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred142_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred142_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred82_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred134_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred134_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred123_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred123_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred130_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred130_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred136_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred136_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred141_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred141_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred79_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred79_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred122_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred122_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred111_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred111_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred72_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred124_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred124_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred132_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred132_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred80_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred80_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred110_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred110_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred139_Pddl() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred139_Pddl_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA13 dfa13 = new DFA13(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA25 dfa25 = new DFA25(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA13_eotS =
		"\4\uffff";
	static final String DFA13_eofS =
		"\4\uffff";
	static final String DFA13_minS =
		"\2\52\2\uffff";
	static final String DFA13_maxS =
		"\1\116\1\121\2\uffff";
	static final String DFA13_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA13_specialS =
		"\4\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\43\uffff\1\2",
			"\1\1\43\uffff\1\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "143:7: ( ( NAME )* | ( singleTypeNameList )+ ( NAME )* )";
		}
	}

	static final String DFA11_eotS =
		"\4\uffff";
	static final String DFA11_eofS =
		"\4\uffff";
	static final String DFA11_minS =
		"\2\52\2\uffff";
	static final String DFA11_maxS =
		"\1\116\1\121\2\uffff";
	static final String DFA11_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA11_specialS =
		"\4\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\1\43\uffff\1\2",
			"\1\1\43\uffff\1\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 143:16: ( singleTypeNameList )+";
		}
	}

	static final String DFA17_eotS =
		"\17\uffff";
	static final String DFA17_eofS =
		"\17\uffff";
	static final String DFA17_minS =
		"\1\115\1\uffff\1\52\2\110\1\0\1\52\2\uffff\1\167\1\110\1\52\1\110\1\52"+
		"\1\110";
	static final String DFA17_maxS =
		"\1\116\1\uffff\1\52\1\116\1\121\1\0\1\115\2\uffff\1\167\1\116\1\60\1\121"+
		"\2\116";
	static final String DFA17_acceptS =
		"\1\uffff\1\3\5\uffff\1\1\1\2\6\uffff";
	static final String DFA17_specialS =
		"\5\uffff\1\0\11\uffff}>";
	static final String[] DFA17_transitionS = {
			"\1\2\1\1",
			"",
			"\1\3",
			"\1\4\5\uffff\1\5",
			"\1\4\5\uffff\1\5\2\uffff\1\6",
			"\1\uffff",
			"\1\12\5\uffff\1\12\34\uffff\1\11",
			"",
			"",
			"\1\13",
			"\1\14\5\uffff\1\5",
			"\1\15\5\uffff\1\15",
			"\1\14\5\uffff\1\5\2\uffff\1\6",
			"\1\15\5\uffff\1\15\35\uffff\1\16",
			"\1\14\5\uffff\1\5"
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 172:10: ( typedFunctionList | untypedFunctionList )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_5 = input.LA(1);
						 
						int index17_5 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred18_Pddl()) ) {s = 7;}
						else if ( (synpred19_Pddl()) ) {s = 8;}
						 
						input.seek(index17_5);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA25_eotS =
		"\4\uffff";
	static final String DFA25_eofS =
		"\4\uffff";
	static final String DFA25_minS =
		"\2\110\2\uffff";
	static final String DFA25_maxS =
		"\1\116\1\121\2\uffff";
	static final String DFA25_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA25_specialS =
		"\4\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1\4\uffff\2\2",
			"\1\1\4\uffff\2\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "224:7: ( ( VARIABLE )* | ( singleTypeVarList )+ ( VARIABLE )* )";
		}
	}

	static final String DFA23_eotS =
		"\4\uffff";
	static final String DFA23_eofS =
		"\4\uffff";
	static final String DFA23_minS =
		"\2\110\2\uffff";
	static final String DFA23_maxS =
		"\1\116\1\121\2\uffff";
	static final String DFA23_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA23_specialS =
		"\4\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1\4\uffff\2\2",
			"\1\1\4\uffff\2\2\2\uffff\1\3",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 224:20: ( singleTypeVarList )+";
		}
	}

	public static final BitSet FOLLOW_domain_in_pddlDoc505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_problem_in_pddlDoc509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_domain524 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_domain526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_domainName_in_domain528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_requireDef_in_domain536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_typesDef_in_domain545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_constantsDef_in_domain554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_predicatesDef_in_domain563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_functionsDef_in_domain572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_constraints_in_domain581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_structureDef_in_domain590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_domain599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_domainName683 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_118_in_domainName685 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_domainName687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_domainName689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_requireDef716 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_requireDef718 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_REQUIRE_KEY_in_requireDef720 = new BitSet(new long[]{0x8000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_requireDef723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_typesDef744 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_101_in_typesDef746 = new BitSet(new long[]{0x0000040000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_typedNameList_in_typesDef748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_typesDef750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_typedNameList777 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_singleTypeNameList_in_typedNameList782 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_NAME_in_typedNameList785 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_NAME_in_singleTypeNameList805 = new BitSet(new long[]{0x0000040000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_singleTypeNameList808 = new BitSet(new long[]{0x0001040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_type_in_singleTypeNameList812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_type839 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_119_in_type841 = new BitSet(new long[]{0x0001040000000000L});
	public static final BitSet FOLLOW_primType_in_type843 = new BitSet(new long[]{0x0001040000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_type846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primType_in_type865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_functionsDef888 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_functionsDef890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_functionList_in_functionsDef892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_functionsDef894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedFunctionList_in_functionList928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_untypedFunctionList_in_functionList932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_atomicFunctionSkeleton_in_untypedFunctionList955 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_atomicFunctionSkeleton_in_typedFunctionList997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000022000L});
	public static final BitSet FOLLOW_81_in_typedFunctionList1000 = new BitSet(new long[]{0x0001040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_functionType_in_typedFunctionList1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_atomicFunctionSkeleton1047 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_functionSymbol_in_atomicFunctionSkeleton1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_atomicFunctionSkeleton1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_atomicFunctionSkeleton1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_functionSymbol1066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_STR_in_functionType1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_functionType1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_functionType1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_constantsDef1093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_constantsDef1095 = new BitSet(new long[]{0x0000040000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_typedNameList_in_constantsDef1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_constantsDef1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_predicatesDef1119 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_predicatesDef1121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_atomicFormulaSkeleton_in_predicatesDef1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_predicatesDef1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_atomicFormulaSkeleton1147 = new BitSet(new long[]{0x0000040000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_predicate_in_atomicFormulaSkeleton1150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_atomicFormulaSkeleton1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_atomicFormulaSkeleton1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_typedVariableList1186 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_singleTypeVarList_in_typedVariableList1191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_VARIABLE_in_typedVariableList1194 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_VARIABLE_in_singleTypeVarList1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020100L});
	public static final BitSet FOLLOW_81_in_singleTypeVarList1217 = new BitSet(new long[]{0x0001040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_type_in_singleTypeVarList1221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_constraints1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_constraints1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_conGD_in_constraints1258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_constraints1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_actionDef_in_structureDef1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_durativeActionDef_in_structureDef1277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_derivedDef_in_structureDef1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_actionDef1297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_83_in_actionDef1299 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_actionSymbol_in_actionDef1301 = new BitSet(new long[]{0x0000000000000000L,0x0000004608004000L});
	public static final BitSet FOLLOW_actionParams_in_actionDef1303 = new BitSet(new long[]{0x0000000000000000L,0x0000004408004000L});
	public static final BitSet FOLLOW_actionDefBody_in_actionDef1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_actionDef1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_actionSymbol1341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_actionParams1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_actionParams1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_actionParams1356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_actionParams1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_actionDefBody1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_actionDefBody1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_actionDefBody1391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_actionDefBody1393 = new BitSet(new long[]{0x0000000000000002L,0x0000000408000000L});
	public static final BitSet FOLLOW_98_in_actionDefBody1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_actionDefBody1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_actionDefBody1408 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_logicExpr_in_actionDefBody1413 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_actionDefBody1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_actionDefBody1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_actionDefBody1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effect_in_actionDefBody1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_logicExpr1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_logicExpr1490 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_logicExpr1492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_logicExpr_in_logicExpr1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_logicExpr1497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_logicExpr1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_131_in_logicExpr1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_logicExpr_in_logicExpr1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_logicExpr1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_logicExpr1554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_logicExpr1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_logicExpr1558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_logicExpr1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_logicExpr1584 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_125_in_logicExpr1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_logicExpr1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_logicExpr1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_logicExpr1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_logicExpr1618 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_121_in_logicExpr1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_logicExpr1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_logicExpr1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_logicExpr1626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_logicExpr1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_logicExpr1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_logicExpr1660 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_logicExpr1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_logicExpr1664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_logicExpr1666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_logicExpr1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_logicExpr1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_logicExpr1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condWhenExpr_in_logicExpr1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fComp_in_logicExpr1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_condWhenExpr1735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_142_in_condWhenExpr1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_condWhenExpr1739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_whenCondEffect_in_condWhenExpr1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_condWhenExpr1743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_wEffect1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_wEffect1767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_atomicTermFormula_in_wEffect1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_wEffect1771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_wEffect1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_whenCondEffect1798 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_whenCondEffect1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_wEffect_in_whenCondEffect1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_whenCondEffect1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_wEffect_in_whenCondEffect1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fComp1836 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_fComp1839 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_fCompExp_in_fComp1841 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002180L});
	public static final BitSet FOLLOW_term_in_fComp1844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_UNDEFINED_in_fComp1848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fComp1851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fComp1857 = new BitSet(new long[]{0x0000000000000000L,0x00000F8000000000L});
	public static final BitSet FOLLOW_binaryComp_in_fComp1860 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_fCompExp_in_fComp1862 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_fCompExp_in_fComp1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fComp1866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_fCompExp1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_fCompExp1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleTypeVarList_in_fCompExp1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_atomicTermFormula1897 = new BitSet(new long[]{0x0000040000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_predicate_in_atomicTermFormula1899 = new BitSet(new long[]{0x0000440000000000L,0x0000000000006100L});
	public static final BitSet FOLLOW_term_in_atomicTermFormula1901 = new BitSet(new long[]{0x0000440000000000L,0x0000000000006100L});
	public static final BitSet FOLLOW_78_in_atomicTermFormula1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_term1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_term1934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fHead_in_term1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_term1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_durativeActionDef1954 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_durativeActionDef1956 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_actionSymbol_in_durativeActionDef1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000202000000L});
	public static final BitSet FOLLOW_actionParams_in_durativeActionDef1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_daDefBody_in_durativeActionDef1986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_durativeActionDef1988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_daDefBody2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_durationConstraint_in_daDefBody2025 = new BitSet(new long[]{0x0000000000000000L,0x0000000008100000L});
	public static final BitSet FOLLOW_84_in_daDefBody2032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_daDefBody2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_daDefBody2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_daLogicExpr_in_daDefBody2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_daDefBody2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_daDefBody2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_daDefBody2069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_daEffect_in_daDefBody2074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prefTimedGD_in_daLogicExpr2119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_daLogicExpr2124 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_daLogicExpr2126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_daLogicExpr_in_daLogicExpr2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_daLogicExpr2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_daLogicExpr2149 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_daLogicExpr2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_daLogicExpr2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_daLogicExpr2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_daLogicExpr2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_daLogicExpr_in_daLogicExpr2159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_daLogicExpr2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedExp_in_prefTimedGD2190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_prefTimedGD2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_133_in_prefTimedGD2212 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_NAME_in_prefTimedGD2214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_timedExp_in_prefTimedGD2217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_prefTimedGD2219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_timedExp2245 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_timedExp2248 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedExp2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_timedExp2253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_timedExp2255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_timedExp2261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_132_in_timedExp2264 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_interval_in_timedExp2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_timedExp2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_timedExp2271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_interval2294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_derivedDef2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_derivedDef2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_typedVariableList_in_derivedDef2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_derivedDef2315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_derivedDef2317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_fExp2332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fExp2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
	public static final BitSet FOLLOW_binaryOp_in_fExp2339 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_fExp2341 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp2_in_fExp2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fExp2345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fExp2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_fExp2364 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_fExp2366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fExp2368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fHead_in_fExp2381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_fExp22393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fHead2403 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_functionSymbol_in_fHead2405 = new BitSet(new long[]{0x0000440000000000L,0x0000000000006100L});
	public static final BitSet FOLLOW_term_in_fHead2407 = new BitSet(new long[]{0x0000440000000000L,0x0000000000006100L});
	public static final BitSet FOLLOW_78_in_fHead2410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionSymbol_in_fHead2431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_effect2451 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_effect2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_cEffect_in_effect2455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_effect2458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cEffect_in_effect2472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_cEffect2483 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_cEffect2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_cEffect2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_cEffect2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_cEffect2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_effect_in_cEffect2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_cEffect2495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_cEffect2517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_142_in_cEffect2519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_cEffect2521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_condEffect_in_cEffect2523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_cEffect2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pEffect_in_cEffect2543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_pEffect2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_pEffect2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_atomicTermFormula_in_pEffect2558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_pEffect2560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_pEffect2576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_pEffect2581 = new BitSet(new long[]{0x0000000000000000L,0x4012000000000000L,0x0000000000000180L});
	public static final BitSet FOLLOW_assignOp_in_pEffect2583 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_pEffect2585 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_pEffect2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_pEffect2589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_pEffect2609 = new BitSet(new long[]{0x0000000000000000L,0x4012000000000000L,0x0000000000000180L});
	public static final BitSet FOLLOW_assignOp_in_pEffect2611 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_pEffect2613 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_term_in_pEffect2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_pEffect2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_pEffect2637 = new BitSet(new long[]{0x0000000000000000L,0x4012000000000000L,0x0000000000000180L});
	public static final BitSet FOLLOW_assignOp_in_pEffect2639 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_pEffect2641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_UNDEFINED_in_pEffect2643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_pEffect2645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_condEffect2671 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_condEffect2673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_pEffect_in_condEffect2675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_condEffect2678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pEffect_in_condEffect2692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_durationConstraint2780 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_durationConstraint2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_durationConstraint2787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_durationConstraint2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_durationConstraint2797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_durationConstraint2811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_simpleDurationConstraint2822 = new BitSet(new long[]{0x0000000000000000L,0x00000B0000000000L});
	public static final BitSet FOLLOW_durOp_in_simpleDurationConstraint2824 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_108_in_simpleDurationConstraint2826 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_simpleDurationConstraint2828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_simpleDurationConstraint2830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_simpleDurationConstraint2845 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_simpleDurationConstraint2847 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_timeSpecifier_in_simpleDurationConstraint2849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_simpleDurationConstraint_in_simpleDurationConstraint2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_simpleDurationConstraint2853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedEffect_in_daEffect2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_daEffect2898 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_daEffect2900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_daEffect_in_daEffect2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_daEffect2905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_daEffect2926 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_daEffect2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_daEffect2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_daEffect2932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_daEffect2934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_daEffect_in_daEffect2936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_daEffect2938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_daEffect2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_142_in_daEffect2962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_daLogicExpr_in_daEffect2964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_timedEffect_in_daEffect2966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_daEffect2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_timedEffect2993 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_timedEffect2995 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_timeSpecifier_in_timedEffect2997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_condEffect2_in_timedEffect2999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_timedEffect3001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_timedEffect3020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_132_in_timedEffect3022 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_interval_in_timedEffect3024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_condEffect_in_timedEffect3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_timedEffect3028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_timedEffect3047 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
	public static final BitSet FOLLOW_assignOpT_in_timedEffect3049 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_timedEffect3051 = new BitSet(new long[]{0x0000000000000000L,0x000000000000200CL});
	public static final BitSet FOLLOW_fExpT_in_timedEffect3053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_timedEffect3055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_condEffect23082 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_condEffect23084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_cEffect_in_condEffect23086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_condEffect23089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cEffect_in_condEffect23103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fAssignDA3116 = new BitSet(new long[]{0x0000000000000000L,0x4012000000000000L,0x0000000000000180L});
	public static final BitSet FOLLOW_assignOp_in_fAssignDA3118 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_fAssignDA3120 = new BitSet(new long[]{0x0000440000000000L,0x0000100000002000L});
	public static final BitSet FOLLOW_fExpDA_in_fAssignDA3122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fAssignDA3124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fExpDA3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
	public static final BitSet FOLLOW_binaryOp_in_fExpDA3153 = new BitSet(new long[]{0x0000440000000000L,0x0000100000002000L});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA3155 = new BitSet(new long[]{0x0000440000000000L,0x0000100000002000L});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fExpDA3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fExpDA3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_fExpDA3180 = new BitSet(new long[]{0x0000440000000000L,0x0000100000002000L});
	public static final BitSet FOLLOW_fExpDA_in_fExpDA3182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fExpDA3184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_fExpDA3199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fExp_in_fExpDA3214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fExpT3238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_fExpT3240 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_fExpT3242 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_timeVar_in_fExpT3244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fExpT3246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_fExpT3268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_fExpT3270 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_timeVar_in_fExpT3272 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_fExpT3274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_fExpT3276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timeVar_in_fExpT3297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_problem3333 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_problem3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_problemDecl_in_problem3337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_problemDomain_in_problem3342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_requireDef_in_problem3350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_objectDecl_in_problem3359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_init_in_problem3368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_goal_in_problem3376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_probConstraints_in_problem3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_metricSpec_in_problem3393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_problem3409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_problemDecl3466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_134_in_problemDecl3468 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_problemDecl3470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_problemDecl3472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_problemDomain3498 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_problemDomain3500 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_problemDomain3502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_problemDomain3504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_objectDecl3524 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_96_in_objectDecl3526 = new BitSet(new long[]{0x0000040000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_typedNameList_in_objectDecl3528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_objectDecl3530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_init3550 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_init3552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_initEl_in_init3554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_init3557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameLiteral_in_initEl3578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_initEl3583 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_initEl3585 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_initEl3587 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_initEl3589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_initEl3591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_initEl3614 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_initEl3616 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_initEl3618 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_initEl3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_initEl3622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_initEl3645 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_initEl3647 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_initEl3649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_nameLiteral_in_initEl3651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_initEl3653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral3675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_nameLiteral3680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_nameLiteral3682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_atomicNameFormula_in_nameLiteral3684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_nameLiteral3686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_atomicNameFormula3705 = new BitSet(new long[]{0x0000040000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_predicate_in_atomicNameFormula3707 = new BitSet(new long[]{0x0000440000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_nameOrNumber_in_atomicNameFormula3709 = new BitSet(new long[]{0x0000440000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_atomicNameFormula3712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_goal3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_goal3760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_goal3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_goal3764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_probConstraints3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_probConstraints3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_prefConGD_in_probConstraints3787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_probConstraints3789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_prefConGD3811 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_prefConGD3813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_prefConGD_in_prefConGD3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_prefConGD3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_prefConGD3823 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_prefConGD3825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_prefConGD3827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_prefConGD3829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_prefConGD3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_prefConGD_in_prefConGD3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_prefConGD3835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_prefConGD3840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_133_in_prefConGD3842 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_NAME_in_prefConGD3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_conGD_in_prefConGD3847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_prefConGD3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conGD_in_prefConGD3854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricSpec3865 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_metricSpec3867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
	public static final BitSet FOLLOW_optimization_in_metricSpec3869 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricSpec3871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_metricSpec3873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricFExp3912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
	public static final BitSet FOLLOW_binaryOp_in_metricFExp3914 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3916 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_metricFExp3920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricFExp3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_metricFExp3940 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3942 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3944 = new BitSet(new long[]{0x0000400000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_metricFExp3947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricFExp3968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_metricFExp3970 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3972 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp3974 = new BitSet(new long[]{0x0000400000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_metricFExp3977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricFExp3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_metricFExp4000 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_metricFExp4002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_metricFExp4004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_metricFExp4020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricFExp4036 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_127_in_metricFExp4038 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_metricFExp4040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_metricFExp4042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricFExp4062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_141_in_metricFExp4064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_metricFExp4066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_metricFExp4080 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_functionSymbol_in_metricFExp4082 = new BitSet(new long[]{0x0000040000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_NAME_in_metricFExp4084 = new BitSet(new long[]{0x0000040000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_metricFExp4087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4119 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_conGD4121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_conGD_in_conGD4123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_conGD4126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4131 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_conGD4133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_conGD4135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_conGD4137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_conGD_in_conGD4141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4148 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_conGD4150 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_120_in_conGD4152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4164 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_110_in_conGD4166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_137_in_conGD4177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_143_in_conGD4189 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD4191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4200 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_conGD4202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_138_in_conGD4213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_139_in_conGD4226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4230 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4237 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_111_in_conGD4239 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD4241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4252 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_124_in_conGD4254 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD4256 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD4258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_conGD4267 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_123_in_conGD4269 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_conGD4271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_logicExpr_in_conGD4273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_conGD4275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedFunctionList_in_synpred18_Pddl928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_untypedFunctionList_in_synpred19_Pddl932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicFunctionSkeleton_in_synpred20_Pddl955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_STR_in_synpred22_Pddl1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_synpred23_Pddl1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred53_Pddl1836 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_synpred53_Pddl1839 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_fCompExp_in_synpred53_Pddl1841 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002180L});
	public static final BitSet FOLLOW_term_in_synpred53_Pddl1844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_UNDEFINED_in_synpred53_Pddl1848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred53_Pddl1851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_synpred55_Pddl1882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_synpred57_Pddl1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fHead_in_synpred59_Pddl1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred71_Pddl2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
	public static final BitSet FOLLOW_binaryOp_in_synpred71_Pddl2339 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_synpred71_Pddl2341 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp2_in_synpred71_Pddl2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred71_Pddl2345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred72_Pddl2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_synpred72_Pddl2364 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_synpred72_Pddl2366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred72_Pddl2368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred79_Pddl2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_130_in_synpred79_Pddl2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_atomicTermFormula_in_synpred79_Pddl2558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred79_Pddl2560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomicTermFormula_in_synpred80_Pddl2576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred81_Pddl2581 = new BitSet(new long[]{0x0000000000000000L,0x4012000000000000L,0x0000000000000180L});
	public static final BitSet FOLLOW_assignOp_in_synpred81_Pddl2583 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_synpred81_Pddl2585 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fExp_in_synpred81_Pddl2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred81_Pddl2589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred82_Pddl2609 = new BitSet(new long[]{0x0000000000000000L,0x4012000000000000L,0x0000000000000180L});
	public static final BitSet FOLLOW_assignOp_in_synpred82_Pddl2611 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_synpred82_Pddl2613 = new BitSet(new long[]{0x0000440000000000L,0x0000000000002100L});
	public static final BitSet FOLLOW_term_in_synpred82_Pddl2615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred82_Pddl2617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred110_Pddl3151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
	public static final BitSet FOLLOW_binaryOp_in_synpred110_Pddl3153 = new BitSet(new long[]{0x0000440000000000L,0x0000100000002000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred110_Pddl3155 = new BitSet(new long[]{0x0000440000000000L,0x0000100000002000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred110_Pddl3157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred110_Pddl3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred111_Pddl3178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_synpred111_Pddl3180 = new BitSet(new long[]{0x0000440000000000L,0x0000100000002000L});
	public static final BitSet FOLLOW_fExpDA_in_synpred111_Pddl3182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred111_Pddl3184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameLiteral_in_synpred122_Pddl3578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred123_Pddl3583 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_synpred123_Pddl3585 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_synpred123_Pddl3587 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_NUMBER_in_synpred123_Pddl3589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred123_Pddl3591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred124_Pddl3614 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_synpred124_Pddl3616 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_fHead_in_synpred124_Pddl3618 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_synpred124_Pddl3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred124_Pddl3622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred129_Pddl3811 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_synpred129_Pddl3813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_prefConGD_in_synpred129_Pddl3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_synpred129_Pddl3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred130_Pddl3823 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_synpred130_Pddl3825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_synpred130_Pddl3827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004100L});
	public static final BitSet FOLLOW_typedVariableList_in_synpred130_Pddl3829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred130_Pddl3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_prefConGD_in_synpred130_Pddl3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred130_Pddl3835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred132_Pddl3840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_133_in_synpred132_Pddl3842 = new BitSet(new long[]{0x0000040000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_NAME_in_synpred132_Pddl3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_conGD_in_synpred132_Pddl3847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred132_Pddl3849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred134_Pddl3912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000078000L});
	public static final BitSet FOLLOW_binaryOp_in_synpred134_Pddl3914 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred134_Pddl3916 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred134_Pddl3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred134_Pddl3920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred136_Pddl3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_synpred136_Pddl3940 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred136_Pddl3942 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred136_Pddl3944 = new BitSet(new long[]{0x0000400000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_synpred136_Pddl3947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred138_Pddl3968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_synpred138_Pddl3970 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred138_Pddl3972 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred138_Pddl3974 = new BitSet(new long[]{0x0000400000000000L,0x0000000000006000L});
	public static final BitSet FOLLOW_78_in_synpred138_Pddl3977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred139_Pddl3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_synpred139_Pddl4000 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_metricFExp_in_synpred139_Pddl4002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred139_Pddl4004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred141_Pddl4036 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_127_in_synpred141_Pddl4038 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_NAME_in_synpred141_Pddl4040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred141_Pddl4042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_synpred142_Pddl4062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_141_in_synpred142_Pddl4064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_synpred142_Pddl4066 = new BitSet(new long[]{0x0000000000000002L});
}

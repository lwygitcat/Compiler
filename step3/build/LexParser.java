// Generated from Lex.g by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, KEYWORD=34, IDENTIFIER=35, OPERATOR=36, INTLITERAL=37, 
		FLOATLITERAL=38, STRINGLITERAL=39, DIGITS=40, WORDS=41, COMMENT=42, WS=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'WHILE'", "'ELSE'", "'READ'", "'!='", "'END'", "';'", 
		"'='", "'IF'", "'FUNCTION'", "':='", "'<='", "'('", "'CONTINUE'", "'*'", 
		"'RETURN'", "','", "'VOID'", "'STRING'", "'ENDWHILE'", "'BREAK'", "'INT'", 
		"'>='", "'<'", "'>'", "'PROGRAM'", "'ENDIF'", "'FLOAT'", "')'", "'BEGIN'", 
		"'+'", "'-'", "'WRITE'", "KEYWORD", "IDENTIFIER", "OPERATOR", "INTLITERAL", 
		"FLOATLITERAL", "STRINGLITERAL", "DIGITS", "WORDS", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_id = 1, RULE_pgm_body = 2, RULE_decl = 3, RULE_string_decl_list = 4, 
		RULE_string_decl = 5, RULE_str = 6, RULE_var_decl_list = 7, RULE_var_decl = 8, 
		RULE_var_type = 9, RULE_any_type = 10, RULE_id_list = 11, RULE_id_tail = 12, 
		RULE_param_decl_list = 13, RULE_param_decl = 14, RULE_param_decl_tail = 15, 
		RULE_func_declarations = 16, RULE_func_decl = 17, RULE_func_decl_tail = 18, 
		RULE_func_body = 19, RULE_stmt_list = 20, RULE_stmt = 21, RULE_base_stmt = 22, 
		RULE_assign_stmt = 23, RULE_assign_expr = 24, RULE_read_stmt = 25, RULE_write_stmt = 26, 
		RULE_return_stmt = 27, RULE_expr = 28, RULE_factor = 29, RULE_postfix_expr = 30, 
		RULE_call_expr = 31, RULE_expr_list = 32, RULE_expr_list_tail = 33, RULE_primary = 34, 
		RULE_addop = 35, RULE_mulop = 36, RULE_if_stmt = 37, RULE_else_part = 38, 
		RULE_cond = 39, RULE_compop = 40, RULE_while_stmt = 41, RULE_aug_stmt_list = 42, 
		RULE_aug_stmt = 43, RULE_aug_if_stmt = 44, RULE_aug_else_part = 45;
	public static final String[] ruleNames = {
		"program", "id", "pgm_body", "decl", "string_decl_list", "string_decl", 
		"str", "var_decl_list", "var_decl", "var_type", "any_type", "id_list", 
		"id_tail", "param_decl_list", "param_decl", "param_decl_tail", "func_declarations", 
		"func_decl", "func_decl_tail", "func_body", "stmt_list", "stmt", "base_stmt", 
		"assign_stmt", "assign_expr", "read_stmt", "write_stmt", "return_stmt", 
		"expr", "factor", "postfix_expr", "call_expr", "expr_list", "expr_list_tail", 
		"primary", "addop", "mulop", "if_stmt", "else_part", "cond", "compop", 
		"while_stmt", "aug_stmt_list", "aug_stmt", "aug_if_stmt", "aug_else_part"
	};

	@Override
	public String getGrammarFileName() { return "Lex.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    SymbolTable symtab = new SymbolTable();
	    int count = 0;
	    Scope currscope;
	     

	public LexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(T__7);
			setState(93); id();
			setState(94); match(T__3);
			setState(95); pgm_body();
			setState(96); match(T__27);
			 for(String str: symtab.checkDuplicate())
			              System.out.println("SHADOW WARNING "+str);
			          System.out.println(symtab.toString());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LexParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pgm_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterPgm_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitPgm_body(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pgm_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); decl();
			setState(102); func_declarations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public List<Var_decl_listContext> var_decl_list() {
			return getRuleContexts(Var_decl_listContext.class);
		}
		public String_decl_listContext string_decl_list(int i) {
			return getRuleContext(String_decl_listContext.class,i);
		}
		public List<String_decl_listContext> string_decl_list() {
			return getRuleContexts(String_decl_listContext.class);
		}
		public Var_decl_listContext var_decl_list(int i) {
			return getRuleContext(Var_decl_listContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__11) | (1L << T__5))) != 0)) {
				{
				setState(106);
				switch (_input.LA(1)) {
				case T__14:
					{
					setState(104); string_decl_list();
					}
					break;
				case T__11:
				case T__5:
					{
					setState(105); var_decl_list();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_decl_listContext extends ParserRuleContext {
		public String_declContext string_decl(int i) {
			return getRuleContext(String_declContext.class,i);
		}
		public List<String_declContext> string_decl() {
			return getRuleContexts(String_declContext.class);
		}
		public String_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterString_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitString_decl_list(this);
		}
	}

	public final String_decl_listContext string_decl_list() throws RecognitionException {
		String_decl_listContext _localctx = new String_decl_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_decl_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111); string_decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_declContext extends ParserRuleContext {
		public IdContext id;
		public StrContext str;
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterString_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitString_decl(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(T__14);
			setState(117); ((String_declContext)_localctx).id = id();
			setState(118); match(T__22);
			setState(119); ((String_declContext)_localctx).str = str();
			setState(120); match(T__26);
			 currscope = symtab.popScope();
			                                    currscope.addsymbol((((String_declContext)_localctx).id!=null?_input.getText(((String_declContext)_localctx).id.start,((String_declContext)_localctx).id.stop):null), "STRING", (((String_declContext)_localctx).str!=null?_input.getText(((String_declContext)_localctx).str.start,((String_declContext)_localctx).str.stop):null));
			                                    symtab.pushScopeBack(currscope); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(LexParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_listContext extends ParserRuleContext {
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterVar_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitVar_decl_list(this);
		}
	}

	public final Var_decl_listContext var_decl_list() throws RecognitionException {
		Var_decl_listContext _localctx = new Var_decl_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(125); var_decl();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public Id_listContext id_list;
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); ((Var_declContext)_localctx).var_type = var_type();
			setState(131); ((Var_declContext)_localctx).id_list = id_list();
			setState(132); match(T__26);
			  currscope = symtab.popScope();
			                              currscope.addsymbols((((Var_declContext)_localctx).id_list!=null?_input.getText(((Var_declContext)_localctx).id_list.start,((Var_declContext)_localctx).id_list.stop):null), (((Var_declContext)_localctx).var_type!=null?_input.getText(((Var_declContext)_localctx).var_type.start,((Var_declContext)_localctx).var_type.stop):null), null);
			                              symtab.pushScopeBack(currscope); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAny_type(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_any_type);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case T__11:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); var_type();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_listContext extends ParserRuleContext {
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); id();
			setState(142); id_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_tailContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterId_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitId_tail(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_id_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(144); match(T__16);
				setState(145); id();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterParam_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitParam_decl_list(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); param_decl();
			setState(152); param_decl_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type;
		public IdContext id;
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); ((Param_declContext)_localctx).var_type = var_type();
			setState(155); ((Param_declContext)_localctx).id = id();
			  currscope = symtab.popScope();
			                     currscope.addsymbol((((Param_declContext)_localctx).id!=null?_input.getText(((Param_declContext)_localctx).id.start,((Param_declContext)_localctx).id.stop):null), (((Param_declContext)_localctx).var_type!=null?_input.getText(((Param_declContext)_localctx).var_type.start,((Param_declContext)_localctx).var_type.stop):null), null);
			                     symtab.pushScopeBack(currscope); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_declContext param_decl(int i) {
			return getRuleContext(Param_declContext.class,i);
		}
		public List<Param_declContext> param_decl() {
			return getRuleContexts(Param_declContext.class);
		}
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterParam_decl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitParam_decl_tail(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param_decl_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(158); match(T__16);
				setState(159); param_decl();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declContext func_decl(int i) {
			return getRuleContext(Func_declContext.class,i);
		}
		public List<Func_declContext> func_decl() {
			return getRuleContexts(Func_declContext.class);
		}
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFunc_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFunc_declarations(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(165); func_decl();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declContext extends ParserRuleContext {
		public IdContext id;
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(T__23);
			setState(172); any_type();
			setState(173); ((Func_declContext)_localctx).id = id();
			symtab.pushScope((((Func_declContext)_localctx).id!=null?_input.getText(((Func_declContext)_localctx).id.start,((Func_declContext)_localctx).id.stop):null));
			setState(175); match(T__20);
			setState(177);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__5) {
				{
				setState(176); param_decl_list();
				}
			}

			setState(179); match(T__4);
			setState(180); match(T__3);
			setState(181); func_body();
			setState(182); match(T__27);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_decl_tailContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Func_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFunc_decl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFunc_decl_tail(this);
		}
	}

	public final Func_decl_tailContext func_decl_tail() throws RecognitionException {
		Func_decl_tailContext _localctx = new Func_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_decl_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); func_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); decl();
			setState(187); stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__29) | (1L << T__24) | (1L << T__17) | (1L << T__0) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(189); stmt();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmt);
		try {
			setState(198);
			switch (_input.LA(1)) {
			case T__29:
			case T__17:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); base_stmt();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(196); if_stmt();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); while_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Base_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterBase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitBase_stmt(this);
		}
	}

	public final Base_stmtContext base_stmt() throws RecognitionException {
		Base_stmtContext _localctx = new Base_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_base_stmt);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); assign_stmt();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(201); read_stmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(202); write_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(203); return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); assign_expr();
			setState(207); match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); id();
			setState(210); match(T__22);
			setState(211); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitRead_stmt(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(T__29);
			setState(214); match(T__20);
			setState(215); id_list();
			setState(216); match(T__4);
			setState(217); match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitWrite_stmt(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(T__0);
			setState(220); match(T__20);
			setState(221); id_list();
			setState(222); match(T__4);
			setState(223); match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(T__17);
			setState(226); expr();
			setState(227); match(T__26);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); factor();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__1) {
				{
				{
				setState(230); addop();
				setState(231); factor();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public List<Postfix_exprContext> postfix_expr() {
			return getRuleContexts(Postfix_exprContext.class);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public Postfix_exprContext postfix_expr(int i) {
			return getRuleContext(Postfix_exprContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); postfix_expr();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__18) {
				{
				{
				setState(239); mulop();
				setState(240); postfix_expr();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_exprContext extends ParserRuleContext {
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterPostfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitPostfix_expr(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_postfix_expr);
		try {
			setState(249);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); call_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_exprContext extends ParserRuleContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); id();
			setState(252); match(T__20);
			setState(254);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << IDENTIFIER) | (1L << INTLITERAL) | (1L << FLOATLITERAL))) != 0)) {
				{
				setState(253); expr_list();
				}
			}

			setState(256); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); expr();
			setState(259); expr_list_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_list_tailContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_list_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(261); match(T__16);
				setState(262); expr();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(LexParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(LexParser.FLOATLITERAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_primary);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(T__20);
				setState(269); expr();
				setState(270); match(T__4);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(272); id();
				}
				break;
			case INTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(273); match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(274); match(FLOATLITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==T__32 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 count = count + 1;
			          symtab.pushScope("BLOCK "+ String.valueOf(count));
			setState(282); match(T__24);
			setState(283); match(T__20);
			setState(284); cond();
			setState(285); match(T__4);
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(286); decl();
				}
				break;
			}
			setState(289); stmt_list();
			setState(290); else_part();
			setState(291); match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_partContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_else_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				 count = count + 1;
				            symtab.pushScope("BLOCK "+ String.valueOf(count));
				setState(294); match(T__30);
				setState(295); decl();
				setState(296); stmt_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); expr();
			setState(301); compop();
			setState(302); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompopContext extends ParserRuleContext {
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__21) | (1L << T__10) | (1L << T__9) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 count = count + 1;
			          symtab.pushScope("BLOCK "+ String.valueOf(count));
			setState(307); match(T__31);
			setState(308); match(T__20);
			setState(309); cond();
			setState(310); match(T__4);
			setState(311); decl();
			setState(312); aug_stmt_list();
			setState(313); match(T__13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aug_stmt_listContext extends ParserRuleContext {
		public Aug_stmtContext aug_stmt() {
			return getRuleContext(Aug_stmtContext.class,0);
		}
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public Aug_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_stmt_list(this);
		}
	}

	public final Aug_stmt_listContext aug_stmt_list() throws RecognitionException {
		Aug_stmt_listContext _localctx = new Aug_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_aug_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__29) | (1L << T__24) | (1L << T__19) | (1L << T__17) | (1L << T__12) | (1L << T__0) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(315); aug_stmt();
				setState(316); aug_stmt_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aug_stmtContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Aug_if_stmtContext aug_if_stmt() {
			return getRuleContext(Aug_if_stmtContext.class,0);
		}
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public Aug_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_stmt(this);
		}
	}

	public final Aug_stmtContext aug_stmt() throws RecognitionException {
		Aug_stmtContext _localctx = new Aug_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_aug_stmt);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case T__29:
			case T__17:
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(320); base_stmt();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); aug_if_stmt();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(322); while_stmt();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(323); match(T__19);
				setState(324); match(T__26);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(325); match(T__12);
				setState(326); match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aug_if_stmtContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Aug_stmt_listContext aug_stmt_list() {
			return getRuleContext(Aug_stmt_listContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Aug_else_partContext aug_else_part() {
			return getRuleContext(Aug_else_partContext.class,0);
		}
		public Aug_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_if_stmt(this);
		}
	}

	public final Aug_if_stmtContext aug_if_stmt() throws RecognitionException {
		Aug_if_stmtContext _localctx = new Aug_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_aug_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 count = count + 1;
			          symtab.pushScope("BLOCK "+ String.valueOf(count));
			setState(330); match(T__24);
			setState(331); match(T__20);
			setState(332); cond();
			setState(333); match(T__4);
			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(334); decl();
				}
				break;
			}
			setState(337); aug_stmt_list();
			setState(338); aug_else_part();
			setState(339); match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aug_else_partContext extends ParserRuleContext {
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public Aug_stmt_listContext aug_stmt_list(int i) {
			return getRuleContext(Aug_stmt_listContext.class,i);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public List<Aug_stmt_listContext> aug_stmt_list() {
			return getRuleContexts(Aug_stmt_listContext.class);
		}
		public Aug_else_partContext aug_else_part(int i) {
			return getRuleContext(Aug_else_partContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public List<Aug_else_partContext> aug_else_part() {
			return getRuleContexts(Aug_else_partContext.class);
		}
		public Aug_else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aug_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).enterAug_else_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexListener ) ((LexListener)listener).exitAug_else_part(this);
		}
	}

	public final Aug_else_partContext aug_else_part() throws RecognitionException {
		Aug_else_partContext _localctx = new Aug_else_partContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_aug_else_part);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					 count = count + 1;
					           symtab.pushScope("BLOCK "+ String.valueOf(count));
					setState(342); match(T__30);
					setState(343); match(T__20);
					setState(344); cond();
					setState(345); match(T__4);
					setState(347);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(346); decl();
						}
						break;
					}
					setState(349); aug_stmt_list();
					setState(350); aug_else_part();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\6\6\6s\n\6\r\6\16\6t\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\6\t\u0081\n\t\r\t\16\t\u0082\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\5\f\u008e\n\f\3\r\3\r\3\r\3\16\3\16\7\16\u0095"+
		"\n\16\f\16\16\16\u0098\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\7\21\u00a3\n\21\f\21\16\21\u00a6\13\21\3\22\7\22\u00a9\n\22\f\22\16"+
		"\22\u00ac\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b4\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\7\26\u00c1\n\26\f\26\16"+
		"\26\u00c4\13\26\3\27\3\27\3\27\5\27\u00c9\n\27\3\30\3\30\3\30\3\30\5\30"+
		"\u00cf\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\7\36\u00ec\n\36\f\36\16\36\u00ef\13\36\3\37\3\37\3\37\3\37\7\37"+
		"\u00f5\n\37\f\37\16\37\u00f8\13\37\3 \3 \5 \u00fc\n \3!\3!\3!\5!\u0101"+
		"\n!\3!\3!\3\"\3\"\3\"\3#\3#\7#\u010a\n#\f#\16#\u010d\13#\3$\3$\3$\3$\3"+
		"$\3$\3$\5$\u0116\n$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0122\n\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u012d\n(\3)\3)\3)\3)\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\5,\u0141\n,\3-\3-\3-\3-\3-\3-\3-\5-\u014a"+
		"\n-\3.\3.\3.\3.\3.\3.\5.\u0152\n.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u015e"+
		"\n/\3/\3/\3/\7/\u0163\n/\f/\16/\u0166\13/\3/\2\2\60\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\6\4\2"+
		"\30\30\36\36\3\2!\"\4\2\3\3\21\21\6\2\7\7\n\n\16\16\31\33\u015a\2^\3\2"+
		"\2\2\4e\3\2\2\2\6g\3\2\2\2\bn\3\2\2\2\nr\3\2\2\2\fv\3\2\2\2\16}\3\2\2"+
		"\2\20\u0080\3\2\2\2\22\u0084\3\2\2\2\24\u0089\3\2\2\2\26\u008d\3\2\2\2"+
		"\30\u008f\3\2\2\2\32\u0096\3\2\2\2\34\u0099\3\2\2\2\36\u009c\3\2\2\2 "+
		"\u00a4\3\2\2\2\"\u00aa\3\2\2\2$\u00ad\3\2\2\2&\u00ba\3\2\2\2(\u00bc\3"+
		"\2\2\2*\u00c2\3\2\2\2,\u00c8\3\2\2\2.\u00ce\3\2\2\2\60\u00d0\3\2\2\2\62"+
		"\u00d3\3\2\2\2\64\u00d7\3\2\2\2\66\u00dd\3\2\2\28\u00e3\3\2\2\2:\u00e7"+
		"\3\2\2\2<\u00f0\3\2\2\2>\u00fb\3\2\2\2@\u00fd\3\2\2\2B\u0104\3\2\2\2D"+
		"\u010b\3\2\2\2F\u0115\3\2\2\2H\u0117\3\2\2\2J\u0119\3\2\2\2L\u011b\3\2"+
		"\2\2N\u012c\3\2\2\2P\u012e\3\2\2\2R\u0132\3\2\2\2T\u0134\3\2\2\2V\u0140"+
		"\3\2\2\2X\u0149\3\2\2\2Z\u014b\3\2\2\2\\\u0164\3\2\2\2^_\7\34\2\2_`\5"+
		"\4\3\2`a\7 \2\2ab\5\6\4\2bc\7\b\2\2cd\b\2\1\2d\3\3\2\2\2ef\7%\2\2f\5\3"+
		"\2\2\2gh\5\b\5\2hi\5\"\22\2i\7\3\2\2\2jm\5\n\6\2km\5\20\t\2lj\3\2\2\2"+
		"lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\t\3\2\2\2pn\3\2\2\2qs\5\f\7"+
		"\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\13\3\2\2\2vw\7\25\2\2wx\5"+
		"\4\3\2xy\7\r\2\2yz\5\16\b\2z{\7\t\2\2{|\b\7\1\2|\r\3\2\2\2}~\7)\2\2~\17"+
		"\3\2\2\2\177\u0081\5\22\n\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\5\24\13"+
		"\2\u0085\u0086\5\30\r\2\u0086\u0087\7\t\2\2\u0087\u0088\b\n\1\2\u0088"+
		"\23\3\2\2\2\u0089\u008a\t\2\2\2\u008a\25\3\2\2\2\u008b\u008e\5\24\13\2"+
		"\u008c\u008e\7\24\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\27"+
		"\3\2\2\2\u008f\u0090\5\4\3\2\u0090\u0091\5\32\16\2\u0091\31\3\2\2\2\u0092"+
		"\u0093\7\23\2\2\u0093\u0095\5\4\3\2\u0094\u0092\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\33\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\5\36\20\2\u009a\u009b\5 \21\2\u009b\35\3\2"+
		"\2\2\u009c\u009d\5\24\13\2\u009d\u009e\5\4\3\2\u009e\u009f\b\20\1\2\u009f"+
		"\37\3\2\2\2\u00a0\u00a1\7\23\2\2\u00a1\u00a3\5\36\20\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"!\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\5$\23\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab#\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\5\26\f\2\u00af"+
		"\u00b0\5\4\3\2\u00b0\u00b1\b\23\1\2\u00b1\u00b3\7\17\2\2\u00b2\u00b4\5"+
		"\34\17\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\7\37\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\5(\25\2\u00b8\u00b9\7\b"+
		"\2\2\u00b9%\3\2\2\2\u00ba\u00bb\5$\23\2\u00bb\'\3\2\2\2\u00bc\u00bd\5"+
		"\b\5\2\u00bd\u00be\5*\26\2\u00be)\3\2\2\2\u00bf\u00c1\5,\27\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"+\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\5.\30\2\u00c6\u00c9\5L\'\2\u00c7"+
		"\u00c9\5T+\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2"+
		"\2\u00c9-\3\2\2\2\u00ca\u00cf\5\60\31\2\u00cb\u00cf\5\64\33\2\u00cc\u00cf"+
		"\5\66\34\2\u00cd\u00cf\58\35\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf/\3\2\2\2\u00d0\u00d1\5"+
		"\62\32\2\u00d1\u00d2\7\t\2\2\u00d2\61\3\2\2\2\u00d3\u00d4\5\4\3\2\u00d4"+
		"\u00d5\7\r\2\2\u00d5\u00d6\5:\36\2\u00d6\63\3\2\2\2\u00d7\u00d8\7\6\2"+
		"\2\u00d8\u00d9\7\17\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\7\37\2\2\u00db"+
		"\u00dc\7\t\2\2\u00dc\65\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df\7\17\2"+
		"\2\u00df\u00e0\5\30\r\2\u00e0\u00e1\7\37\2\2\u00e1\u00e2\7\t\2\2\u00e2"+
		"\67\3\2\2\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\5:\36\2\u00e5\u00e6\7\t\2"+
		"\2\u00e69\3\2\2\2\u00e7\u00ed\5<\37\2\u00e8\u00e9\5H%\2\u00e9\u00ea\5"+
		"<\37\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee;\3\2\2\2\u00ef\u00ed\3\2\2\2"+
		"\u00f0\u00f6\5> \2\u00f1\u00f2\5J&\2\u00f2\u00f3\5> \2\u00f3\u00f5\3\2"+
		"\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7=\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\5F$\2\u00fa"+
		"\u00fc\5@!\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc?\3\2\2\2\u00fd"+
		"\u00fe\5\4\3\2\u00fe\u0100\7\17\2\2\u00ff\u0101\5B\"\2\u0100\u00ff\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\37\2\2\u0103"+
		"A\3\2\2\2\u0104\u0105\5:\36\2\u0105\u0106\5D#\2\u0106C\3\2\2\2\u0107\u0108"+
		"\7\23\2\2\u0108\u010a\5:\36\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cE\3\2\2\2\u010d\u010b\3"+
		"\2\2\2\u010e\u010f\7\17\2\2\u010f\u0110\5:\36\2\u0110\u0111\7\37\2\2\u0111"+
		"\u0116\3\2\2\2\u0112\u0116\5\4\3\2\u0113\u0116\7\'\2\2\u0114\u0116\7("+
		"\2\2\u0115\u010e\3\2\2\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116G\3\2\2\2\u0117\u0118\t\3\2\2\u0118I\3\2\2\2\u0119"+
		"\u011a\t\4\2\2\u011aK\3\2\2\2\u011b\u011c\b\'\1\2\u011c\u011d\7\13\2\2"+
		"\u011d\u011e\7\17\2\2\u011e\u011f\5P)\2\u011f\u0121\7\37\2\2\u0120\u0122"+
		"\5\b\5\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\5*\26\2\u0124\u0125\5N(\2\u0125\u0126\7\35\2\2\u0126M\3\2\2\2\u0127"+
		"\u0128\b(\1\2\u0128\u0129\7\5\2\2\u0129\u012a\5\b\5\2\u012a\u012b\5*\26"+
		"\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u012d\3\2\2\2\u012dO"+
		"\3\2\2\2\u012e\u012f\5:\36\2\u012f\u0130\5R*\2\u0130\u0131\5:\36\2\u0131"+
		"Q\3\2\2\2\u0132\u0133\t\5\2\2\u0133S\3\2\2\2\u0134\u0135\b+\1\2\u0135"+
		"\u0136\7\4\2\2\u0136\u0137\7\17\2\2\u0137\u0138\5P)\2\u0138\u0139\7\37"+
		"\2\2\u0139\u013a\5\b\5\2\u013a\u013b\5V,\2\u013b\u013c\7\26\2\2\u013c"+
		"U\3\2\2\2\u013d\u013e\5X-\2\u013e\u013f\5V,\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0140\u0141\3\2\2\2\u0141W\3\2\2\2\u0142\u014a\5.\30\2"+
		"\u0143\u014a\5Z.\2\u0144\u014a\5T+\2\u0145\u0146\7\20\2\2\u0146\u014a"+
		"\7\t\2\2\u0147\u0148\7\27\2\2\u0148\u014a\7\t\2\2\u0149\u0142\3\2\2\2"+
		"\u0149\u0143\3\2\2\2\u0149\u0144\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014aY\3\2\2\2\u014b\u014c\b.\1\2\u014c\u014d\7\13\2\2\u014d"+
		"\u014e\7\17\2\2\u014e\u014f\5P)\2\u014f\u0151\7\37\2\2\u0150\u0152\5\b"+
		"\5\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0154\5V,\2\u0154\u0155\5\\/\2\u0155\u0156\7\35\2\2\u0156[\3\2\2\2\u0157"+
		"\u0158\b/\1\2\u0158\u0159\7\5\2\2\u0159\u015a\7\17\2\2\u015a\u015b\5P"+
		")\2\u015b\u015d\7\37\2\2\u015c\u015e\5\b\5\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\5V,\2\u0160\u0161\5\\/"+
		"\2\u0161\u0163\3\2\2\2\u0162\u0157\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165]\3\2\2\2\u0166\u0164\3\2\2\2\33lnt"+
		"\u0082\u008d\u0096\u00a4\u00aa\u00b3\u00c2\u00c8\u00ce\u00ed\u00f6\u00fb"+
		"\u0100\u010b\u0115\u0121\u012c\u0140\u0149\u0151\u015d\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
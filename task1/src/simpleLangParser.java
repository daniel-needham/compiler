// Generated from /home/dan/Uni Work/Compilers/assignment/246619/task1/src/simpleLang.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, LParen=13, Comma=14, RParen=15, LBrace=16, 
		Semicolon=17, RBrace=18, BINOP=19, TYPE=20, IDFR=21, INTLIT=22, BOOLIT=23, 
		WS=24;
	public static final int
		RULE_prog = 0, RULE_dec = 1, RULE_vardec = 2, RULE_body = 3, RULE_block = 4, 
		RULE_ene = 5, RULE_exp = 6, RULE_args = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "dec", "vardec", "body", "block", "ene", "exp", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "'if'", "'then'", "'else'", "'while'", "'do'", "'repeat'", 
			"'until'", "'print'", "'space'", "'newline'", "'skip'", "'('", "','", 
			"')'", "'{'", "';'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "LParen", "Comma", "RParen", "LBrace", "Semicolon", "RBrace", "BINOP", 
			"TYPE", "IDFR", "INTLIT", "BOOLIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "simpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(simpleLangParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				dec();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			setState(21);
			match(EOF);
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

	public static class DecContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(simpleLangParser.TYPE, 0); }
		public TerminalNode IDFR() { return getToken(simpleLangParser.IDFR, 0); }
		public TerminalNode LParen() { return getToken(simpleLangParser.LParen, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode RParen() { return getToken(simpleLangParser.RParen, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(TYPE);
			setState(24);
			match(IDFR);
			setState(25);
			match(LParen);
			setState(26);
			vardec();
			setState(27);
			match(RParen);
			setState(28);
			body();
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

	public static class VardecContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(simpleLangParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(simpleLangParser.TYPE, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(simpleLangParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(simpleLangParser.IDFR, i);
		}
		public List<TerminalNode> Comma() { return getTokens(simpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(simpleLangParser.Comma, i);
		}
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterVardec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitVardec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitVardec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		VardecContext _localctx = new VardecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(30);
				match(TYPE);
				setState(31);
				match(IDFR);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(32);
					match(Comma);
					setState(33);
					match(TYPE);
					setState(34);
					match(IDFR);
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(simpleLangParser.LBrace, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(simpleLangParser.RBrace, 0); }
		public List<TerminalNode> TYPE() { return getTokens(simpleLangParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(simpleLangParser.TYPE, i);
		}
		public List<TerminalNode> IDFR() { return getTokens(simpleLangParser.IDFR); }
		public TerminalNode IDFR(int i) {
			return getToken(simpleLangParser.IDFR, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(simpleLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(simpleLangParser.Semicolon, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LBrace);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(43);
				match(TYPE);
				setState(44);
				match(IDFR);
				setState(45);
				match(T__0);
				setState(46);
				exp();
				setState(47);
				match(Semicolon);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			ene();
			setState(55);
			match(RBrace);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(simpleLangParser.LBrace, 0); }
		public EneContext ene() {
			return getRuleContext(EneContext.class,0);
		}
		public TerminalNode RBrace() { return getToken(simpleLangParser.RBrace, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LBrace);
			setState(58);
			ene();
			setState(59);
			match(RBrace);
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

	public static class EneContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Semicolon() { return getTokens(simpleLangParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(simpleLangParser.Semicolon, i);
		}
		public EneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ene; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterEne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitEne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitEne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EneContext ene() throws RecognitionException {
		EneContext _localctx = new EneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ene);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			exp();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semicolon) {
				{
				{
				setState(62);
				match(Semicolon);
				setState(63);
				exp();
				}
				}
				setState(68);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode IDFR() { return getToken(simpleLangParser.IDFR, 0); }
		public TerminalNode INTLIT() { return getToken(simpleLangParser.INTLIT, 0); }
		public TerminalNode BOOLIT() { return getToken(simpleLangParser.BOOLIT, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LParen() { return getToken(simpleLangParser.LParen, 0); }
		public TerminalNode BINOP() { return getToken(simpleLangParser.BINOP, 0); }
		public TerminalNode RParen() { return getToken(simpleLangParser.RParen, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(IDFR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(INTLIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(BOOLIT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(IDFR);
				setState(73);
				match(T__0);
				setState(74);
				exp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(LParen);
				setState(76);
				exp();
				setState(77);
				match(BINOP);
				setState(78);
				exp();
				setState(79);
				match(RParen);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				match(IDFR);
				setState(82);
				match(LParen);
				setState(83);
				args();
				setState(84);
				match(RParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(87);
				match(T__1);
				setState(88);
				exp();
				setState(89);
				match(T__2);
				setState(90);
				block();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(91);
					match(T__3);
					setState(92);
					block();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(T__4);
				setState(96);
				exp();
				setState(97);
				match(T__5);
				setState(98);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(100);
				match(T__6);
				setState(101);
				block();
				setState(102);
				match(T__7);
				setState(103);
				exp();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				match(T__8);
				setState(106);
				exp();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(107);
				match(T__9);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(108);
				match(T__10);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(109);
				match(T__11);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(simpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(simpleLangParser.Comma, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof simpleLangListener ) ((simpleLangListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof simpleLangVisitor ) return ((simpleLangVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << LParen) | (1L << LBrace) | (1L << IDFR) | (1L << INTLIT) | (1L << BOOLIT))) != 0)) {
				{
				setState(112);
				exp();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(113);
					match(Comma);
					setState(114);
					exp();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0003\u0002"+
		")\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u00032\b\u0003\n\u0003\f\u00035\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005A\b\u0005"+
		"\n\u0005\f\u0005D\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006^\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006o\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007t\b\u0007\n\u0007\f\u0007w\t\u0007\u0003\u0007y\b\u0007\u0001"+
		"\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000\u0087"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000"+
		"\u0004(\u0001\u0000\u0000\u0000\u0006*\u0001\u0000\u0000\u0000\b9\u0001"+
		"\u0000\u0000\u0000\n=\u0001\u0000\u0000\u0000\fn\u0001\u0000\u0000\u0000"+
		"\u000ex\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0000\u0000\u0001\u0016"+
		"\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0014\u0000\u0000\u0018"+
		"\u0019\u0005\u0015\u0000\u0000\u0019\u001a\u0005\r\u0000\u0000\u001a\u001b"+
		"\u0003\u0004\u0002\u0000\u001b\u001c\u0005\u000f\u0000\u0000\u001c\u001d"+
		"\u0003\u0006\u0003\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005\u0014\u0000\u0000\u001f%\u0005\u0015\u0000\u0000 !\u0005\u000e"+
		"\u0000\u0000!\"\u0005\u0014\u0000\u0000\"$\u0005\u0015\u0000\u0000# \u0001"+
		"\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000(\u001e\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0005"+
		"\u0001\u0000\u0000\u0000*3\u0005\u0010\u0000\u0000+,\u0005\u0014\u0000"+
		"\u0000,-\u0005\u0015\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0003\f\u0006"+
		"\u0000/0\u0005\u0011\u0000\u000002\u0001\u0000\u0000\u00001+\u0001\u0000"+
		"\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"67\u0003\n\u0005\u000078\u0005\u0012\u0000\u00008\u0007\u0001\u0000\u0000"+
		"\u00009:\u0005\u0010\u0000\u0000:;\u0003\n\u0005\u0000;<\u0005\u0012\u0000"+
		"\u0000<\t\u0001\u0000\u0000\u0000=B\u0003\f\u0006\u0000>?\u0005\u0011"+
		"\u0000\u0000?A\u0003\f\u0006\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000"+
		"\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u000b"+
		"\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000Eo\u0005\u0015\u0000"+
		"\u0000Fo\u0005\u0016\u0000\u0000Go\u0005\u0017\u0000\u0000HI\u0005\u0015"+
		"\u0000\u0000IJ\u0005\u0001\u0000\u0000Jo\u0003\f\u0006\u0000KL\u0005\r"+
		"\u0000\u0000LM\u0003\f\u0006\u0000MN\u0005\u0013\u0000\u0000NO\u0003\f"+
		"\u0006\u0000OP\u0005\u000f\u0000\u0000Po\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0015\u0000\u0000RS\u0005\r\u0000\u0000ST\u0003\u000e\u0007\u0000TU\u0005"+
		"\u000f\u0000\u0000Uo\u0001\u0000\u0000\u0000Vo\u0003\b\u0004\u0000WX\u0005"+
		"\u0002\u0000\u0000XY\u0003\f\u0006\u0000YZ\u0005\u0003\u0000\u0000Z]\u0003"+
		"\b\u0004\u0000[\\\u0005\u0004\u0000\u0000\\^\u0003\b\u0004\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^o\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0005\u0000\u0000`a\u0003\f\u0006\u0000ab\u0005\u0006\u0000\u0000"+
		"bc\u0003\b\u0004\u0000co\u0001\u0000\u0000\u0000de\u0005\u0007\u0000\u0000"+
		"ef\u0003\b\u0004\u0000fg\u0005\b\u0000\u0000gh\u0003\f\u0006\u0000ho\u0001"+
		"\u0000\u0000\u0000ij\u0005\t\u0000\u0000jo\u0003\f\u0006\u0000ko\u0005"+
		"\n\u0000\u0000lo\u0005\u000b\u0000\u0000mo\u0005\f\u0000\u0000nE\u0001"+
		"\u0000\u0000\u0000nF\u0001\u0000\u0000\u0000nG\u0001\u0000\u0000\u0000"+
		"nH\u0001\u0000\u0000\u0000nK\u0001\u0000\u0000\u0000nQ\u0001\u0000\u0000"+
		"\u0000nV\u0001\u0000\u0000\u0000nW\u0001\u0000\u0000\u0000n_\u0001\u0000"+
		"\u0000\u0000nd\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000nk\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"o\r\u0001\u0000\u0000\u0000pu\u0003\f\u0006\u0000qr\u0005\u000e\u0000"+
		"\u0000rt\u0003\f\u0006\u0000sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y\u000f\u0001\u0000\u0000\u0000\t\u0013%(3B]nux";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
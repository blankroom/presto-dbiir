// Generated from /home/k2data/IdeaProjects/presto-dbiir/presto-parser/src/main/antlr4/com/facebook/presto/sql/parser/SqlBase.g4 by ANTLR 4.5.3
package com.facebook.presto.sql.parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, SELECT=13, FROM=14, ADD=15, AS=16, ALL=17, 
		SOME=18, ANY=19, DISTINCT=20, WHERE=21, GROUP=22, BY=23, GROUPING=24, 
		SETS=25, CUBE=26, ROLLUP=27, ORDER=28, HAVING=29, LIMIT=30, AT=31, OR=32, 
		AND=33, IN=34, NOT=35, NO=36, EXISTS=37, BETWEEN=38, LIKE=39, IS=40, NULL=41, 
		TRUE=42, FALSE=43, NULLS=44, FIRST=45, LAST=46, ESCAPE=47, ASC=48, DESC=49, 
		SUBSTRING=50, POSITION=51, FOR=52, TINYINT=53, SMALLINT=54, INTEGER=55, 
		DATE=56, TIME=57, TIMESTAMP=58, INTERVAL=59, YEAR=60, MONTH=61, DAY=62, 
		HOUR=63, MINUTE=64, SECOND=65, ZONE=66, CURRENT_DATE=67, CURRENT_TIME=68, 
		CURRENT_TIMESTAMP=69, LOCALTIME=70, LOCALTIMESTAMP=71, EXTRACT=72, CASE=73, 
		WHEN=74, THEN=75, ELSE=76, END=77, JOIN=78, CROSS=79, OUTER=80, INNER=81, 
		LEFT=82, RIGHT=83, FULL=84, NATURAL=85, USING=86, ON=87, FILTER=88, OVER=89, 
		PARTITION=90, RANGE=91, ROWS=92, UNBOUNDED=93, PRECEDING=94, FOLLOWING=95, 
		CURRENT=96, ROW=97, WITH=98, RECURSIVE=99, VALUES=100, CREATE=101, SCHEMA=102, 
		TABLE=103, VIEW=104, REPLACE=105, INSERT=106, DELETE=107, INTO=108, CONSTRAINT=109, 
		DESCRIBE=110, GRANT=111, REVOKE=112, PRIVILEGES=113, PUBLIC=114, OPTION=115, 
		EXPLAIN=116, ANALYZE=117, FORMAT=118, TYPE=119, TEXT=120, GRAPHVIZ=121, 
		LOGICAL=122, DISTRIBUTED=123, CAST=124, TRY_CAST=125, SHOW=126, TABLES=127, 
		SCHEMAS=128, CATALOGS=129, COLUMNS=130, COLUMN=131, USE=132, PARTITIONS=133, 
		FUNCTIONS=134, DROP=135, UNION=136, EXCEPT=137, INTERSECT=138, TO=139, 
		SYSTEM=140, BERNOULLI=141, POISSONIZED=142, TABLESAMPLE=143, ALTER=144, 
		RENAME=145, UNNEST=146, ORDINALITY=147, ARRAY=148, MAP=149, SET=150, RESET=151, 
		SESSION=152, DATA=153, START=154, TRANSACTION=155, COMMIT=156, ROLLBACK=157, 
		WORK=158, ISOLATION=159, LEVEL=160, SERIALIZABLE=161, REPEATABLE=162, 
		COMMITTED=163, UNCOMMITTED=164, READ=165, WRITE=166, ONLY=167, CALL=168, 
		PREPARE=169, DEALLOCATE=170, EXECUTE=171, INPUT=172, OUTPUT=173, CASCADE=174, 
		RESTRICT=175, INCLUDING=176, EXCLUDING=177, PROPERTIES=178, FIBER=179, 
		FUNCTION=180, LOAD=181, DELIMITED=182, NORMALIZE=183, NFD=184, NFC=185, 
		NFKD=186, NFKC=187, IF=188, NULLIF=189, COALESCE=190, EQ=191, NEQ=192, 
		LT=193, LTE=194, GT=195, GTE=196, PLUS=197, MINUS=198, ASTERISK=199, SLASH=200, 
		PERCENT=201, CONCAT=202, STRING=203, BINARY_LITERAL=204, INTEGER_VALUE=205, 
		DECIMAL_VALUE=206, IDENTIFIER=207, DIGIT_IDENTIFIER=208, QUOTED_IDENTIFIER=209, 
		BACKQUOTED_IDENTIFIER=210, TIME_WITH_TIME_ZONE=211, TIMESTAMP_WITH_TIME_ZONE=212, 
		DOUBLE_PRECISION=213, SIMPLE_COMMENT=214, BRACKETED_COMMENT=215, WS=216, 
		UNRECOGNIZED=217, DELIMITER=218;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_statement = 2, 
		RULE_query = 3, RULE_with = 4, RULE_tableElement = 5, RULE_columnDefinition = 6, 
		RULE_likeClause = 7, RULE_tableProperties = 8, RULE_tableProperty = 9, 
		RULE_queryNoWith = 10, RULE_queryTerm = 11, RULE_queryPrimary = 12, RULE_sortItem = 13, 
		RULE_querySpecification = 14, RULE_groupBy = 15, RULE_groupingElement = 16, 
		RULE_groupingExpressions = 17, RULE_groupingSet = 18, RULE_namedQuery = 19, 
		RULE_setQuantifier = 20, RULE_selectItem = 21, RULE_relation = 22, RULE_joinType = 23, 
		RULE_joinCriteria = 24, RULE_sampledRelation = 25, RULE_sampleType = 26, 
		RULE_aliasedRelation = 27, RULE_columnAliases = 28, RULE_relationPrimary = 29, 
		RULE_expression = 30, RULE_booleanExpression = 31, RULE_predicated = 32, 
		RULE_predicate = 33, RULE_valueExpression = 34, RULE_primaryExpression = 35, 
		RULE_timeZoneSpecifier = 36, RULE_comparisonOperator = 37, RULE_comparisonQuantifier = 38, 
		RULE_booleanValue = 39, RULE_interval = 40, RULE_intervalField = 41, RULE_type = 42, 
		RULE_typeParameter = 43, RULE_baseType = 44, RULE_whenClause = 45, RULE_filter = 46, 
		RULE_over = 47, RULE_windowFrame = 48, RULE_frameBound = 49, RULE_explainOption = 50, 
		RULE_transactionMode = 51, RULE_levelOfIsolation = 52, RULE_callArgument = 53, 
		RULE_privilege = 54, RULE_qualifiedName = 55, RULE_identifier = 56, RULE_quotedIdentifier = 57, 
		RULE_number = 58, RULE_nonReserved = 59, RULE_normalForm = 60, RULE_hdfsPath = 61;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "statement", "query", "with", "tableElement", 
		"columnDefinition", "likeClause", "tableProperties", "tableProperty", 
		"queryNoWith", "queryTerm", "queryPrimary", "sortItem", "querySpecification", 
		"groupBy", "groupingElement", "groupingExpressions", "groupingSet", "namedQuery", 
		"setQuantifier", "selectItem", "relation", "joinType", "joinCriteria", 
		"sampledRelation", "sampleType", "aliasedRelation", "columnAliases", "relationPrimary", 
		"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
		"primaryExpression", "timeZoneSpecifier", "comparisonOperator", "comparisonQuantifier", 
		"booleanValue", "interval", "intervalField", "type", "typeParameter", 
		"baseType", "whenClause", "filter", "over", "windowFrame", "frameBound", 
		"explainOption", "transactionMode", "levelOfIsolation", "callArgument", 
		"privilege", "qualifiedName", "identifier", "quotedIdentifier", "number", 
		"nonReserved", "normalForm", "hdfsPath"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "','", "')'", "'|'", "'?'", "'->'", "'['", "']'", 
		"'=>'", "''hdfs:/'", "'''", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", 
		"'SOME'", "'ANY'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", 
		"'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", 
		"'OR'", "'AND'", "'IN'", "'NOT'", "'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", 
		"'IS'", "'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", "'FIRST'", "'LAST'", 
		"'ESCAPE'", "'ASC'", "'DESC'", "'SUBSTRING'", "'POSITION'", "'FOR'", "'TINYINT'", 
		"'SMALLINT'", "'INTEGER'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'INTERVAL'", 
		"'YEAR'", "'MONTH'", "'DAY'", "'HOUR'", "'MINUTE'", "'SECOND'", "'ZONE'", 
		"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'LOCALTIME'", 
		"'LOCALTIMESTAMP'", "'EXTRACT'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", 
		"'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", "'RIGHT'", 
		"'FULL'", "'NATURAL'", "'USING'", "'ON'", "'FILTER'", "'OVER'", "'PARTITION'", 
		"'RANGE'", "'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", 
		"'ROW'", "'WITH'", "'RECURSIVE'", "'VALUES'", "'CREATE'", "'SCHEMA'", 
		"'TABLE'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'CONSTRAINT'", 
		"'DESCRIBE'", "'GRANT'", "'REVOKE'", "'PRIVILEGES'", "'PUBLIC'", "'OPTION'", 
		"'EXPLAIN'", "'ANALYZE'", "'FORMAT'", "'TYPE'", "'TEXT'", "'GRAPHVIZ'", 
		"'LOGICAL'", "'DISTRIBUTED'", "'CAST'", "'TRY_CAST'", "'SHOW'", "'TABLES'", 
		"'SCHEMAS'", "'CATALOGS'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
		"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'INTERSECT'", "'TO'", 
		"'SYSTEM'", "'BERNOULLI'", "'POISSONIZED'", "'TABLESAMPLE'", "'ALTER'", 
		"'RENAME'", "'UNNEST'", "'ORDINALITY'", "'ARRAY'", "'MAP'", "'SET'", "'RESET'", 
		"'SESSION'", "'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", 
		"'WORK'", "'ISOLATION'", "'LEVEL'", "'SERIALIZABLE'", "'REPEATABLE'", 
		"'COMMITTED'", "'UNCOMMITTED'", "'READ'", "'WRITE'", "'ONLY'", "'CALL'", 
		"'PREPARE'", "'DEALLOCATE'", "'EXECUTE'", "'INPUT'", "'OUTPUT'", "'CASCADE'", 
		"'RESTRICT'", "'INCLUDING'", "'EXCLUDING'", "'PROPERTIES'", "'FIBER'", 
		"'FUNCTION'", "'LOAD'", "'DELIMITED'", "'NORMALIZE'", "'NFD'", "'NFC'", 
		"'NFKD'", "'NFKC'", "'IF'", "'NULLIF'", "'COALESCE'", "'='", null, "'<'", 
		"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "SELECT", "FROM", "ADD", "AS", "ALL", "SOME", "ANY", "DISTINCT", 
		"WHERE", "GROUP", "BY", "GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", 
		"HAVING", "LIMIT", "AT", "OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", 
		"LIKE", "IS", "NULL", "TRUE", "FALSE", "NULLS", "FIRST", "LAST", "ESCAPE", 
		"ASC", "DESC", "SUBSTRING", "POSITION", "FOR", "TINYINT", "SMALLINT", 
		"INTEGER", "DATE", "TIME", "TIMESTAMP", "INTERVAL", "YEAR", "MONTH", "DAY", 
		"HOUR", "MINUTE", "SECOND", "ZONE", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
		"LOCALTIME", "LOCALTIMESTAMP", "EXTRACT", "CASE", "WHEN", "THEN", "ELSE", 
		"END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "RIGHT", "FULL", "NATURAL", 
		"USING", "ON", "FILTER", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", 
		"PRECEDING", "FOLLOWING", "CURRENT", "ROW", "WITH", "RECURSIVE", "VALUES", 
		"CREATE", "SCHEMA", "TABLE", "VIEW", "REPLACE", "INSERT", "DELETE", "INTO", 
		"CONSTRAINT", "DESCRIBE", "GRANT", "REVOKE", "PRIVILEGES", "PUBLIC", "OPTION", 
		"EXPLAIN", "ANALYZE", "FORMAT", "TYPE", "TEXT", "GRAPHVIZ", "LOGICAL", 
		"DISTRIBUTED", "CAST", "TRY_CAST", "SHOW", "TABLES", "SCHEMAS", "CATALOGS", 
		"COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", 
		"EXCEPT", "INTERSECT", "TO", "SYSTEM", "BERNOULLI", "POISSONIZED", "TABLESAMPLE", 
		"ALTER", "RENAME", "UNNEST", "ORDINALITY", "ARRAY", "MAP", "SET", "RESET", 
		"SESSION", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "WORK", 
		"ISOLATION", "LEVEL", "SERIALIZABLE", "REPEATABLE", "COMMITTED", "UNCOMMITTED", 
		"READ", "WRITE", "ONLY", "CALL", "PREPARE", "DEALLOCATE", "EXECUTE", "INPUT", 
		"OUTPUT", "CASCADE", "RESTRICT", "INCLUDING", "EXCLUDING", "PROPERTIES", 
		"FIBER", "FUNCTION", "LOAD", "DELIMITED", "NORMALIZE", "NFD", "NFC", "NFKD", 
		"NFKC", "IF", "NULLIF", "COALESCE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
		"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "CONCAT", "STRING", "BINARY_LITERAL", 
		"INTEGER_VALUE", "DECIMAL_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE", "TIMESTAMP_WITH_TIME_ZONE", 
		"DOUBLE_PRECISION", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
		"DELIMITER"
	};
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
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			statement();
			setState(125);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			expression();
			setState(128);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoadWithDelimitedContext extends StatementContext {
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public HdfsPathContext hdfsPath() {
			return getRuleContext(HdfsPathContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public LoadWithDelimitedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLoadWithDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLoadWithDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLoadWithDelimited(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public IdentifierContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public Token limit;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableWithFiberContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode FIBER() { return getToken(SqlBaseParser.FIBER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public CreateTableWithFiberContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableWithFiber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableWithFiber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableWithFiber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public IdentifierContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(USE);
				setState(132);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(USE);
				setState(134);
				((UseContext)_localctx).catalog = identifier();
				setState(135);
				match(T__0);
				setState(136);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(CREATE);
				setState(139);
				match(SCHEMA);
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(140);
					match(IF);
					setState(141);
					match(NOT);
					setState(142);
					match(EXISTS);
					}
					break;
				}
				setState(145);
				qualifiedName();
				setState(148);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(146);
					match(WITH);
					setState(147);
					tableProperties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(DROP);
				setState(151);
				match(SCHEMA);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(152);
					match(IF);
					setState(153);
					match(EXISTS);
					}
					break;
				}
				setState(156);
				qualifiedName();
				setState(158);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(157);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				match(ALTER);
				setState(161);
				match(SCHEMA);
				setState(162);
				qualifiedName();
				setState(163);
				match(RENAME);
				setState(164);
				match(TO);
				setState(165);
				identifier();
				}
				break;
			case 7:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				match(CREATE);
				setState(168);
				match(TABLE);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(169);
					match(IF);
					setState(170);
					match(NOT);
					setState(171);
					match(EXISTS);
					}
					break;
				}
				setState(174);
				qualifiedName();
				setState(177);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(175);
					match(WITH);
					setState(176);
					tableProperties();
					}
				}

				setState(179);
				match(AS);
				setState(180);
				query();
				setState(186);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(181);
					match(WITH);
					setState(183);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(182);
						match(NO);
						}
					}

					setState(185);
					match(DATA);
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				match(CREATE);
				setState(189);
				match(TABLE);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(190);
					match(IF);
					setState(191);
					match(NOT);
					setState(192);
					match(EXISTS);
					}
					break;
				}
				setState(195);
				qualifiedName();
				setState(196);
				match(T__1);
				setState(197);
				tableElement();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(198);
					match(T__2);
					setState(199);
					tableElement();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__3);
				setState(208);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(206);
					match(WITH);
					setState(207);
					tableProperties();
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableWithFiberContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				match(CREATE);
				setState(211);
				match(TABLE);
				setState(212);
				qualifiedName();
				setState(213);
				match(T__1);
				setState(214);
				tableElement();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(215);
					match(T__2);
					setState(216);
					tableElement();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(T__3);
				setState(223);
				match(FIBER);
				setState(224);
				match(PARTITION);
				setState(225);
				match(BY);
				setState(226);
				match(T__1);
				setState(227);
				identifier();
				setState(228);
				match(T__3);
				setState(229);
				match(USING);
				setState(230);
				match(FUNCTION);
				setState(231);
				qualifiedName();
				setState(232);
				match(TIMESTAMP);
				setState(233);
				match(BY);
				setState(234);
				match(T__1);
				setState(235);
				identifier();
				setState(236);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(238);
				match(CREATE);
				setState(239);
				match(FUNCTION);
				setState(240);
				qualifiedName();
				}
				break;
			case 11:
				_localctx = new LoadWithDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(241);
				match(LOAD);
				setState(242);
				match(FROM);
				setState(243);
				hdfsPath();
				setState(244);
				match(AS);
				setState(245);
				qualifiedName();
				setState(246);
				match(DELIMITED);
				setState(247);
				match(BY);
				setState(248);
				match(T__4);
				}
				break;
			case 12:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(250);
				match(DROP);
				setState(251);
				match(TABLE);
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(252);
					match(IF);
					setState(253);
					match(EXISTS);
					}
					break;
				}
				setState(256);
				qualifiedName();
				}
				break;
			case 13:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(257);
				match(INSERT);
				setState(258);
				match(INTO);
				setState(259);
				qualifiedName();
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(260);
					columnAliases();
					}
					break;
				}
				setState(263);
				query();
				}
				break;
			case 14:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(265);
				match(DELETE);
				setState(266);
				match(FROM);
				setState(267);
				qualifiedName();
				setState(270);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(268);
					match(WHERE);
					setState(269);
					booleanExpression(0);
					}
				}

				}
				break;
			case 15:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(272);
				match(ALTER);
				setState(273);
				match(TABLE);
				setState(274);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(275);
				match(RENAME);
				setState(276);
				match(TO);
				setState(277);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 16:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(279);
				match(ALTER);
				setState(280);
				match(TABLE);
				setState(281);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(282);
				match(RENAME);
				setState(283);
				match(COLUMN);
				setState(284);
				((RenameColumnContext)_localctx).from = identifier();
				setState(285);
				match(TO);
				setState(286);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 17:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(288);
				match(ALTER);
				setState(289);
				match(TABLE);
				setState(290);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(291);
				match(ADD);
				setState(292);
				match(COLUMN);
				setState(293);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 18:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(295);
				match(CREATE);
				setState(298);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(296);
					match(OR);
					setState(297);
					match(REPLACE);
					}
				}

				setState(300);
				match(VIEW);
				setState(301);
				qualifiedName();
				setState(302);
				match(AS);
				setState(303);
				query();
				}
				break;
			case 19:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(305);
				match(DROP);
				setState(306);
				match(VIEW);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(307);
					match(IF);
					setState(308);
					match(EXISTS);
					}
					break;
				}
				setState(311);
				qualifiedName();
				}
				break;
			case 20:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(312);
				match(CALL);
				setState(313);
				qualifiedName();
				setState(314);
				match(T__1);
				setState(323);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << ADD) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MINUTE - 64)) | (1L << (SECOND - 64)) | (1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (FILTER - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (SCHEMA - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SCHEMAS - 128)) | (1L << (CATALOGS - 128)) | (1L << (COLUMNS - 128)) | (1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (INPUT - 128)) | (1L << (OUTPUT - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (INCLUDING - 128)) | (1L << (EXCLUDING - 128)) | (1L << (PROPERTIES - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PLUS - 197)) | (1L << (MINUS - 197)) | (1L << (STRING - 197)) | (1L << (BINARY_LITERAL - 197)) | (1L << (INTEGER_VALUE - 197)) | (1L << (DECIMAL_VALUE - 197)) | (1L << (IDENTIFIER - 197)) | (1L << (DIGIT_IDENTIFIER - 197)) | (1L << (QUOTED_IDENTIFIER - 197)) | (1L << (BACKQUOTED_IDENTIFIER - 197)) | (1L << (DOUBLE_PRECISION - 197)))) != 0)) {
					{
					setState(315);
					callArgument();
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(316);
						match(T__2);
						setState(317);
						callArgument();
						}
						}
						setState(322);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(325);
				match(T__3);
				}
				break;
			case 21:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(327);
				match(GRANT);
				setState(338);
				switch (_input.LA(1)) {
				case SELECT:
				case ADD:
				case NO:
				case SUBSTRING:
				case POSITION:
				case TINYINT:
				case SMALLINT:
				case INTEGER:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case INTERVAL:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case ZONE:
				case FILTER:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case ROW:
				case SCHEMA:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case GRANT:
				case REVOKE:
				case PRIVILEGES:
				case PUBLIC:
				case OPTION:
				case EXPLAIN:
				case ANALYZE:
				case FORMAT:
				case TYPE:
				case TEXT:
				case GRAPHVIZ:
				case LOGICAL:
				case DISTRIBUTED:
				case SHOW:
				case TABLES:
				case SCHEMAS:
				case CATALOGS:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case TO:
				case SYSTEM:
				case BERNOULLI:
				case POISSONIZED:
				case TABLESAMPLE:
				case ARRAY:
				case MAP:
				case SET:
				case RESET:
				case SESSION:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case WORK:
				case ISOLATION:
				case LEVEL:
				case SERIALIZABLE:
				case REPEATABLE:
				case COMMITTED:
				case UNCOMMITTED:
				case READ:
				case WRITE:
				case ONLY:
				case CALL:
				case INPUT:
				case OUTPUT:
				case CASCADE:
				case RESTRICT:
				case INCLUDING:
				case EXCLUDING:
				case PROPERTIES:
				case NFD:
				case NFC:
				case NFKD:
				case NFKC:
				case IF:
				case NULLIF:
				case COALESCE:
				case IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(328);
					privilege();
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(329);
						match(T__2);
						setState(330);
						privilege();
						}
						}
						setState(335);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(336);
					match(ALL);
					setState(337);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(340);
				match(ON);
				setState(342);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(341);
					match(TABLE);
					}
				}

				setState(344);
				qualifiedName();
				setState(345);
				match(TO);
				setState(346);
				((GrantContext)_localctx).grantee = identifier();
				setState(350);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(347);
					match(WITH);
					setState(348);
					match(GRANT);
					setState(349);
					match(OPTION);
					}
				}

				}
				break;
			case 22:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(352);
				match(REVOKE);
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(353);
					match(GRANT);
					setState(354);
					match(OPTION);
					setState(355);
					match(FOR);
					}
					break;
				}
				setState(368);
				switch (_input.LA(1)) {
				case SELECT:
				case ADD:
				case NO:
				case SUBSTRING:
				case POSITION:
				case TINYINT:
				case SMALLINT:
				case INTEGER:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case INTERVAL:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case ZONE:
				case FILTER:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case ROW:
				case SCHEMA:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case GRANT:
				case REVOKE:
				case PRIVILEGES:
				case PUBLIC:
				case OPTION:
				case EXPLAIN:
				case ANALYZE:
				case FORMAT:
				case TYPE:
				case TEXT:
				case GRAPHVIZ:
				case LOGICAL:
				case DISTRIBUTED:
				case SHOW:
				case TABLES:
				case SCHEMAS:
				case CATALOGS:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case TO:
				case SYSTEM:
				case BERNOULLI:
				case POISSONIZED:
				case TABLESAMPLE:
				case ARRAY:
				case MAP:
				case SET:
				case RESET:
				case SESSION:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case WORK:
				case ISOLATION:
				case LEVEL:
				case SERIALIZABLE:
				case REPEATABLE:
				case COMMITTED:
				case UNCOMMITTED:
				case READ:
				case WRITE:
				case ONLY:
				case CALL:
				case INPUT:
				case OUTPUT:
				case CASCADE:
				case RESTRICT:
				case INCLUDING:
				case EXCLUDING:
				case PROPERTIES:
				case NFD:
				case NFC:
				case NFKD:
				case NFKC:
				case IF:
				case NULLIF:
				case COALESCE:
				case IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(358);
					privilege();
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(359);
						match(T__2);
						setState(360);
						privilege();
						}
						}
						setState(365);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(366);
					match(ALL);
					setState(367);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(370);
				match(ON);
				setState(372);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(371);
					match(TABLE);
					}
				}

				setState(374);
				qualifiedName();
				setState(375);
				match(FROM);
				setState(376);
				((RevokeContext)_localctx).grantee = identifier();
				}
				break;
			case 23:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(378);
				match(EXPLAIN);
				setState(380);
				_la = _input.LA(1);
				if (_la==ANALYZE) {
					{
					setState(379);
					match(ANALYZE);
					}
				}

				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(382);
					match(T__1);
					setState(383);
					explainOption();
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(384);
						match(T__2);
						setState(385);
						explainOption();
						}
						}
						setState(390);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(391);
					match(T__3);
					}
					break;
				}
				setState(395);
				statement();
				}
				break;
			case 24:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(396);
				match(SHOW);
				setState(397);
				match(CREATE);
				setState(398);
				match(TABLE);
				setState(399);
				qualifiedName();
				}
				break;
			case 25:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(400);
				match(SHOW);
				setState(401);
				match(CREATE);
				setState(402);
				match(VIEW);
				setState(403);
				qualifiedName();
				}
				break;
			case 26:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(404);
				match(SHOW);
				setState(405);
				match(TABLES);
				setState(408);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(406);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(407);
					qualifiedName();
					}
				}

				setState(412);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(410);
					match(LIKE);
					setState(411);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 27:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(414);
				match(SHOW);
				setState(415);
				match(SCHEMAS);
				setState(418);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(416);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(417);
					identifier();
					}
				}

				setState(422);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(420);
					match(LIKE);
					setState(421);
					((ShowSchemasContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 28:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(424);
				match(SHOW);
				setState(425);
				match(CATALOGS);
				setState(428);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(426);
					match(LIKE);
					setState(427);
					((ShowCatalogsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 29:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(430);
				match(SHOW);
				setState(431);
				match(COLUMNS);
				setState(432);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(433);
				qualifiedName();
				}
				break;
			case 30:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(434);
				match(DESCRIBE);
				setState(435);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(436);
				match(DESC);
				setState(437);
				qualifiedName();
				}
				break;
			case 32:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(438);
				match(SHOW);
				setState(439);
				match(FUNCTIONS);
				}
				break;
			case 33:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(440);
				match(SHOW);
				setState(441);
				match(SESSION);
				}
				break;
			case 34:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(442);
				match(SET);
				setState(443);
				match(SESSION);
				setState(444);
				qualifiedName();
				setState(445);
				match(EQ);
				setState(446);
				expression();
				}
				break;
			case 35:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(448);
				match(RESET);
				setState(449);
				match(SESSION);
				setState(450);
				qualifiedName();
				}
				break;
			case 36:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(451);
				match(START);
				setState(452);
				match(TRANSACTION);
				setState(461);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(453);
					transactionMode();
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(454);
						match(T__2);
						setState(455);
						transactionMode();
						}
						}
						setState(460);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 37:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(463);
				match(COMMIT);
				setState(465);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(464);
					match(WORK);
					}
				}

				}
				break;
			case 38:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(467);
				match(ROLLBACK);
				setState(469);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(468);
					match(WORK);
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(471);
				match(SHOW);
				setState(472);
				match(PARTITIONS);
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(474);
				qualifiedName();
				setState(477);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(475);
					match(WHERE);
					setState(476);
					booleanExpression(0);
					}
				}

				setState(489);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(479);
					match(ORDER);
					setState(480);
					match(BY);
					setState(481);
					sortItem();
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(482);
						match(T__2);
						setState(483);
						sortItem();
						}
						}
						setState(488);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(493);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(491);
					match(LIMIT);
					setState(492);
					((ShowPartitionsContext)_localctx).limit = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
						((ShowPartitionsContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case 40:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(495);
				match(PREPARE);
				setState(496);
				identifier();
				setState(497);
				match(FROM);
				setState(498);
				statement();
				}
				break;
			case 41:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(500);
				match(DEALLOCATE);
				setState(501);
				match(PREPARE);
				setState(502);
				identifier();
				}
				break;
			case 42:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(503);
				match(EXECUTE);
				setState(504);
				identifier();
				setState(514);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(505);
					match(USING);
					setState(506);
					expression();
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(507);
						match(T__2);
						setState(508);
						expression();
						}
						}
						setState(513);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 43:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(516);
				match(DESCRIBE);
				setState(517);
				match(INPUT);
				setState(518);
				identifier();
				}
				break;
			case 44:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(519);
				match(DESCRIBE);
				setState(520);
				match(OUTPUT);
				setState(521);
				identifier();
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(524);
				with();
				}
			}

			setState(527);
			queryNoWith();
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(WITH);
			setState(531);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(530);
				match(RECURSIVE);
				}
			}

			setState(533);
			namedQuery();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(534);
				match(T__2);
				setState(535);
				namedQuery();
				}
				}
				setState(540);
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

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableElement);
		try {
			setState(543);
			switch (_input.LA(1)) {
			case ADD:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				likeClause();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			identifier();
			setState(546);
			type(0);
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

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(LIKE);
			setState(549);
			qualifiedName();
			setState(552);
			_la = _input.LA(1);
			if (_la==INCLUDING || _la==EXCLUDING) {
				{
				setState(550);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCLUDING || _la==EXCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(551);
				match(PROPERTIES);
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

	public static class TablePropertiesContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__1);
			setState(555);
			tableProperty();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(556);
				match(T__2);
				setState(557);
				tableProperty();
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
			match(T__3);
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

	public static class TablePropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			identifier();
			setState(566);
			match(EQ);
			setState(567);
			expression();
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token limit;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			queryTerm(0);
			setState(580);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(570);
				match(ORDER);
				setState(571);
				match(BY);
				setState(572);
				sortItem();
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(573);
					match(T__2);
					setState(574);
					sortItem();
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(584);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(582);
				match(LIMIT);
				setState(583);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(587);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(601);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(589);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(590);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(592);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(591);
							setQuantifier();
							}
						}

						setState(594);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(595);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(596);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==UNION || _la==EXCEPT) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(598);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(597);
							setQuantifier();
							}
						}

						setState(600);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_queryPrimary);
		try {
			int _alt;
			setState(622);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				match(TABLE);
				setState(608);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(VALUES);
				setState(610);
				expression();
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(611);
						match(T__2);
						setState(612);
						expression();
						}
						} 
					}
					setState(617);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				match(T__1);
				setState(619);
				queryNoWith();
				setState(620);
				match(T__3);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			expression();
			setState(626);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(625);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(630);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(628);
				match(NULLS);
				setState(629);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(SELECT);
			setState(634);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(633);
				setQuantifier();
				}
			}

			setState(636);
			selectItem();
			setState(641);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					match(T__2);
					setState(638);
					selectItem();
					}
					} 
				}
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(644);
				match(FROM);
				setState(645);
				relation(0);
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(646);
						match(T__2);
						setState(647);
						relation(0);
						}
						} 
					}
					setState(652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			}
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(655);
				match(WHERE);
				setState(656);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(659);
				match(GROUP);
				setState(660);
				match(BY);
				setState(661);
				groupBy();
				}
				break;
			}
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(664);
				match(HAVING);
				setState(665);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
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

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_groupBy);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(668);
				setQuantifier();
				}
			}

			setState(671);
			groupingElement();
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(672);
					match(T__2);
					setState(673);
					groupingElement();
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingExpressionsContext groupingExpressions() {
			return getRuleContext(GroupingExpressionsContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_groupingElement);
		int _la;
		try {
			setState(719);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case ADD:
			case NOT:
			case NO:
			case EXISTS:
			case NULL:
			case TRUE:
			case FALSE:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case EXTRACT:
			case CASE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case CAST:
			case TRY_CAST:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NORMALIZE:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case PLUS:
			case MINUS:
			case STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				groupingExpressions();
				}
				break;
			case ROLLUP:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(ROLLUP);
				setState(681);
				match(T__1);
				setState(690);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (ADD - 15)) | (1L << (NO - 15)) | (1L << (SUBSTRING - 15)) | (1L << (POSITION - 15)) | (1L << (TINYINT - 15)) | (1L << (SMALLINT - 15)) | (1L << (INTEGER - 15)) | (1L << (DATE - 15)) | (1L << (TIME - 15)) | (1L << (TIMESTAMP - 15)) | (1L << (INTERVAL - 15)) | (1L << (YEAR - 15)) | (1L << (MONTH - 15)) | (1L << (DAY - 15)) | (1L << (HOUR - 15)) | (1L << (MINUTE - 15)) | (1L << (SECOND - 15)) | (1L << (ZONE - 15)))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (FILTER - 88)) | (1L << (OVER - 88)) | (1L << (PARTITION - 88)) | (1L << (RANGE - 88)) | (1L << (ROWS - 88)) | (1L << (PRECEDING - 88)) | (1L << (FOLLOWING - 88)) | (1L << (CURRENT - 88)) | (1L << (ROW - 88)) | (1L << (SCHEMA - 88)) | (1L << (VIEW - 88)) | (1L << (REPLACE - 88)) | (1L << (GRANT - 88)) | (1L << (REVOKE - 88)) | (1L << (PRIVILEGES - 88)) | (1L << (PUBLIC - 88)) | (1L << (OPTION - 88)) | (1L << (EXPLAIN - 88)) | (1L << (ANALYZE - 88)) | (1L << (FORMAT - 88)) | (1L << (TYPE - 88)) | (1L << (TEXT - 88)) | (1L << (GRAPHVIZ - 88)) | (1L << (LOGICAL - 88)) | (1L << (DISTRIBUTED - 88)) | (1L << (SHOW - 88)) | (1L << (TABLES - 88)) | (1L << (SCHEMAS - 88)) | (1L << (CATALOGS - 88)) | (1L << (COLUMNS - 88)) | (1L << (COLUMN - 88)) | (1L << (USE - 88)) | (1L << (PARTITIONS - 88)) | (1L << (FUNCTIONS - 88)) | (1L << (TO - 88)) | (1L << (SYSTEM - 88)) | (1L << (BERNOULLI - 88)) | (1L << (POISSONIZED - 88)) | (1L << (TABLESAMPLE - 88)) | (1L << (ARRAY - 88)) | (1L << (MAP - 88)) | (1L << (SET - 88)) | (1L << (RESET - 88)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (SESSION - 152)) | (1L << (DATA - 152)) | (1L << (START - 152)) | (1L << (TRANSACTION - 152)) | (1L << (COMMIT - 152)) | (1L << (ROLLBACK - 152)) | (1L << (WORK - 152)) | (1L << (ISOLATION - 152)) | (1L << (LEVEL - 152)) | (1L << (SERIALIZABLE - 152)) | (1L << (REPEATABLE - 152)) | (1L << (COMMITTED - 152)) | (1L << (UNCOMMITTED - 152)) | (1L << (READ - 152)) | (1L << (WRITE - 152)) | (1L << (ONLY - 152)) | (1L << (CALL - 152)) | (1L << (INPUT - 152)) | (1L << (OUTPUT - 152)) | (1L << (CASCADE - 152)) | (1L << (RESTRICT - 152)) | (1L << (INCLUDING - 152)) | (1L << (EXCLUDING - 152)) | (1L << (PROPERTIES - 152)) | (1L << (NFD - 152)) | (1L << (NFC - 152)) | (1L << (NFKD - 152)) | (1L << (NFKC - 152)) | (1L << (IF - 152)) | (1L << (NULLIF - 152)) | (1L << (COALESCE - 152)) | (1L << (IDENTIFIER - 152)) | (1L << (DIGIT_IDENTIFIER - 152)) | (1L << (QUOTED_IDENTIFIER - 152)) | (1L << (BACKQUOTED_IDENTIFIER - 152)))) != 0)) {
					{
					setState(682);
					qualifiedName();
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(683);
						match(T__2);
						setState(684);
						qualifiedName();
						}
						}
						setState(689);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(692);
				match(T__3);
				}
				break;
			case CUBE:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				match(CUBE);
				setState(694);
				match(T__1);
				setState(703);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (ADD - 15)) | (1L << (NO - 15)) | (1L << (SUBSTRING - 15)) | (1L << (POSITION - 15)) | (1L << (TINYINT - 15)) | (1L << (SMALLINT - 15)) | (1L << (INTEGER - 15)) | (1L << (DATE - 15)) | (1L << (TIME - 15)) | (1L << (TIMESTAMP - 15)) | (1L << (INTERVAL - 15)) | (1L << (YEAR - 15)) | (1L << (MONTH - 15)) | (1L << (DAY - 15)) | (1L << (HOUR - 15)) | (1L << (MINUTE - 15)) | (1L << (SECOND - 15)) | (1L << (ZONE - 15)))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (FILTER - 88)) | (1L << (OVER - 88)) | (1L << (PARTITION - 88)) | (1L << (RANGE - 88)) | (1L << (ROWS - 88)) | (1L << (PRECEDING - 88)) | (1L << (FOLLOWING - 88)) | (1L << (CURRENT - 88)) | (1L << (ROW - 88)) | (1L << (SCHEMA - 88)) | (1L << (VIEW - 88)) | (1L << (REPLACE - 88)) | (1L << (GRANT - 88)) | (1L << (REVOKE - 88)) | (1L << (PRIVILEGES - 88)) | (1L << (PUBLIC - 88)) | (1L << (OPTION - 88)) | (1L << (EXPLAIN - 88)) | (1L << (ANALYZE - 88)) | (1L << (FORMAT - 88)) | (1L << (TYPE - 88)) | (1L << (TEXT - 88)) | (1L << (GRAPHVIZ - 88)) | (1L << (LOGICAL - 88)) | (1L << (DISTRIBUTED - 88)) | (1L << (SHOW - 88)) | (1L << (TABLES - 88)) | (1L << (SCHEMAS - 88)) | (1L << (CATALOGS - 88)) | (1L << (COLUMNS - 88)) | (1L << (COLUMN - 88)) | (1L << (USE - 88)) | (1L << (PARTITIONS - 88)) | (1L << (FUNCTIONS - 88)) | (1L << (TO - 88)) | (1L << (SYSTEM - 88)) | (1L << (BERNOULLI - 88)) | (1L << (POISSONIZED - 88)) | (1L << (TABLESAMPLE - 88)) | (1L << (ARRAY - 88)) | (1L << (MAP - 88)) | (1L << (SET - 88)) | (1L << (RESET - 88)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (SESSION - 152)) | (1L << (DATA - 152)) | (1L << (START - 152)) | (1L << (TRANSACTION - 152)) | (1L << (COMMIT - 152)) | (1L << (ROLLBACK - 152)) | (1L << (WORK - 152)) | (1L << (ISOLATION - 152)) | (1L << (LEVEL - 152)) | (1L << (SERIALIZABLE - 152)) | (1L << (REPEATABLE - 152)) | (1L << (COMMITTED - 152)) | (1L << (UNCOMMITTED - 152)) | (1L << (READ - 152)) | (1L << (WRITE - 152)) | (1L << (ONLY - 152)) | (1L << (CALL - 152)) | (1L << (INPUT - 152)) | (1L << (OUTPUT - 152)) | (1L << (CASCADE - 152)) | (1L << (RESTRICT - 152)) | (1L << (INCLUDING - 152)) | (1L << (EXCLUDING - 152)) | (1L << (PROPERTIES - 152)) | (1L << (NFD - 152)) | (1L << (NFC - 152)) | (1L << (NFKD - 152)) | (1L << (NFKC - 152)) | (1L << (IF - 152)) | (1L << (NULLIF - 152)) | (1L << (COALESCE - 152)) | (1L << (IDENTIFIER - 152)) | (1L << (DIGIT_IDENTIFIER - 152)) | (1L << (QUOTED_IDENTIFIER - 152)) | (1L << (BACKQUOTED_IDENTIFIER - 152)))) != 0)) {
					{
					setState(695);
					qualifiedName();
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(696);
						match(T__2);
						setState(697);
						qualifiedName();
						}
						}
						setState(702);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(705);
				match(T__3);
				}
				break;
			case GROUPING:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				match(GROUPING);
				setState(707);
				match(SETS);
				setState(708);
				match(T__1);
				setState(709);
				groupingSet();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(710);
					match(T__2);
					setState(711);
					groupingSet();
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				match(T__3);
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

	public static class GroupingExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingExpressionsContext groupingExpressions() throws RecognitionException {
		GroupingExpressionsContext _localctx = new GroupingExpressionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_groupingExpressions);
		int _la;
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(T__1);
				setState(730);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << ADD) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MINUTE - 64)) | (1L << (SECOND - 64)) | (1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (FILTER - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (SCHEMA - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SCHEMAS - 128)) | (1L << (CATALOGS - 128)) | (1L << (COLUMNS - 128)) | (1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (INPUT - 128)) | (1L << (OUTPUT - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (INCLUDING - 128)) | (1L << (EXCLUDING - 128)) | (1L << (PROPERTIES - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PLUS - 197)) | (1L << (MINUS - 197)) | (1L << (STRING - 197)) | (1L << (BINARY_LITERAL - 197)) | (1L << (INTEGER_VALUE - 197)) | (1L << (DECIMAL_VALUE - 197)) | (1L << (IDENTIFIER - 197)) | (1L << (DIGIT_IDENTIFIER - 197)) | (1L << (QUOTED_IDENTIFIER - 197)) | (1L << (BACKQUOTED_IDENTIFIER - 197)) | (1L << (DOUBLE_PRECISION - 197)))) != 0)) {
					{
					setState(722);
					expression();
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(723);
						match(T__2);
						setState(724);
						expression();
						}
						}
						setState(729);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(732);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				expression();
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupingSet);
		int _la;
		try {
			setState(749);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				match(T__1);
				setState(745);
				_la = _input.LA(1);
				if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (ADD - 15)) | (1L << (NO - 15)) | (1L << (SUBSTRING - 15)) | (1L << (POSITION - 15)) | (1L << (TINYINT - 15)) | (1L << (SMALLINT - 15)) | (1L << (INTEGER - 15)) | (1L << (DATE - 15)) | (1L << (TIME - 15)) | (1L << (TIMESTAMP - 15)) | (1L << (INTERVAL - 15)) | (1L << (YEAR - 15)) | (1L << (MONTH - 15)) | (1L << (DAY - 15)) | (1L << (HOUR - 15)) | (1L << (MINUTE - 15)) | (1L << (SECOND - 15)) | (1L << (ZONE - 15)))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (FILTER - 88)) | (1L << (OVER - 88)) | (1L << (PARTITION - 88)) | (1L << (RANGE - 88)) | (1L << (ROWS - 88)) | (1L << (PRECEDING - 88)) | (1L << (FOLLOWING - 88)) | (1L << (CURRENT - 88)) | (1L << (ROW - 88)) | (1L << (SCHEMA - 88)) | (1L << (VIEW - 88)) | (1L << (REPLACE - 88)) | (1L << (GRANT - 88)) | (1L << (REVOKE - 88)) | (1L << (PRIVILEGES - 88)) | (1L << (PUBLIC - 88)) | (1L << (OPTION - 88)) | (1L << (EXPLAIN - 88)) | (1L << (ANALYZE - 88)) | (1L << (FORMAT - 88)) | (1L << (TYPE - 88)) | (1L << (TEXT - 88)) | (1L << (GRAPHVIZ - 88)) | (1L << (LOGICAL - 88)) | (1L << (DISTRIBUTED - 88)) | (1L << (SHOW - 88)) | (1L << (TABLES - 88)) | (1L << (SCHEMAS - 88)) | (1L << (CATALOGS - 88)) | (1L << (COLUMNS - 88)) | (1L << (COLUMN - 88)) | (1L << (USE - 88)) | (1L << (PARTITIONS - 88)) | (1L << (FUNCTIONS - 88)) | (1L << (TO - 88)) | (1L << (SYSTEM - 88)) | (1L << (BERNOULLI - 88)) | (1L << (POISSONIZED - 88)) | (1L << (TABLESAMPLE - 88)) | (1L << (ARRAY - 88)) | (1L << (MAP - 88)) | (1L << (SET - 88)) | (1L << (RESET - 88)))) != 0) || ((((_la - 152)) & ~0x3f) == 0 && ((1L << (_la - 152)) & ((1L << (SESSION - 152)) | (1L << (DATA - 152)) | (1L << (START - 152)) | (1L << (TRANSACTION - 152)) | (1L << (COMMIT - 152)) | (1L << (ROLLBACK - 152)) | (1L << (WORK - 152)) | (1L << (ISOLATION - 152)) | (1L << (LEVEL - 152)) | (1L << (SERIALIZABLE - 152)) | (1L << (REPEATABLE - 152)) | (1L << (COMMITTED - 152)) | (1L << (UNCOMMITTED - 152)) | (1L << (READ - 152)) | (1L << (WRITE - 152)) | (1L << (ONLY - 152)) | (1L << (CALL - 152)) | (1L << (INPUT - 152)) | (1L << (OUTPUT - 152)) | (1L << (CASCADE - 152)) | (1L << (RESTRICT - 152)) | (1L << (INCLUDING - 152)) | (1L << (EXCLUDING - 152)) | (1L << (PROPERTIES - 152)) | (1L << (NFD - 152)) | (1L << (NFC - 152)) | (1L << (NFKD - 152)) | (1L << (NFKC - 152)) | (1L << (IF - 152)) | (1L << (NULLIF - 152)) | (1L << (COALESCE - 152)) | (1L << (IDENTIFIER - 152)) | (1L << (DIGIT_IDENTIFIER - 152)) | (1L << (QUOTED_IDENTIFIER - 152)) | (1L << (BACKQUOTED_IDENTIFIER - 152)))) != 0)) {
					{
					setState(737);
					qualifiedName();
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(738);
						match(T__2);
						setState(739);
						qualifiedName();
						}
						}
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(747);
				match(T__3);
				}
				break;
			case ADD:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				qualifiedName();
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			((NamedQueryContext)_localctx).name = identifier();
			setState(753);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(752);
				columnAliases();
				}
			}

			setState(755);
			match(AS);
			setState(756);
			match(T__1);
			setState(757);
			query();
			setState(758);
			match(T__3);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectItem);
		int _la;
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				expression();
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(764);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(763);
						match(AS);
						}
					}

					setState(766);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				qualifiedName();
				setState(770);
				match(T__0);
				setState(771);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				match(ASTERISK);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(777);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(779);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(793);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(780);
						match(CROSS);
						setState(781);
						match(JOIN);
						setState(782);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case JOIN:
					case INNER:
					case LEFT:
					case RIGHT:
					case FULL:
						{
						setState(783);
						joinType();
						setState(784);
						match(JOIN);
						setState(785);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(786);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(788);
						match(NATURAL);
						setState(789);
						joinType();
						setState(790);
						match(JOIN);
						setState(791);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_joinType);
		int _la;
		try {
			setState(815);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(801);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(800);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(LEFT);
				setState(805);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(804);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				match(RIGHT);
				setState(809);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(808);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				match(FULL);
				setState(813);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(812);
					match(OUTER);
					}
				}

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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_joinCriteria);
		int _la;
		try {
			setState(831);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				match(ON);
				setState(818);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(USING);
				setState(820);
				match(T__1);
				setState(821);
				identifier();
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(822);
					match(T__2);
					setState(823);
					identifier();
					}
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(829);
				match(T__3);
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

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			aliasedRelation();
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(834);
				match(TABLESAMPLE);
				setState(835);
				sampleType();
				setState(836);
				match(T__1);
				setState(837);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(838);
				match(T__3);
				}
				break;
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

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode POISSONIZED() { return getToken(SqlBaseParser.POISSONIZED, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_la = _input.LA(1);
			if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (SYSTEM - 140)) | (1L << (BERNOULLI - 140)) | (1L << (POISSONIZED - 140)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			relationPrimary();
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(846);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(845);
					match(AS);
					}
				}

				setState(848);
				identifier();
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(849);
					columnAliases();
					}
					break;
				}
				}
				break;
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

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(T__1);
			setState(855);
			identifier();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(856);
				match(T__2);
				setState(857);
				identifier();
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(863);
			match(T__3);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relationPrimary);
		int _la;
		try {
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				match(T__1);
				setState(867);
				query();
				setState(868);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				match(UNNEST);
				setState(871);
				match(T__1);
				setState(872);
				expression();
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(873);
					match(T__2);
					setState(874);
					expression();
					}
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(880);
				match(T__3);
				setState(883);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(881);
					match(WITH);
					setState(882);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				match(T__1);
				setState(886);
				relation(0);
				setState(887);
				match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case ADD:
			case NO:
			case EXISTS:
			case NULL:
			case TRUE:
			case FALSE:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case EXTRACT:
			case CASE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case CAST:
			case TRY_CAST:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NORMALIZE:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case PLUS:
			case MINUS:
			case STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(894);
				predicated();
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(895);
				match(NOT);
				setState(896);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(907);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(905);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(899);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(900);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(901);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(902);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(903);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(904);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(909);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			((PredicatedContext)_localctx).valueExpression = valueExpression(0);
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(911);
				predicate(((PredicatedContext)_localctx).valueExpression);
				}
				break;
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

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 66, RULE_predicate);
		int _la;
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				comparisonOperator();
				setState(915);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				comparisonOperator();
				setState(918);
				comparisonQuantifier();
				setState(919);
				match(T__1);
				setState(920);
				query();
				setState(921);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(923);
					match(NOT);
					}
				}

				setState(926);
				match(BETWEEN);
				setState(927);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(928);
				match(AND);
				setState(929);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(932);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(931);
					match(NOT);
					}
				}

				setState(934);
				match(IN);
				setState(935);
				match(T__1);
				setState(936);
				expression();
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(937);
					match(T__2);
					setState(938);
					expression();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(944);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(947);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(946);
					match(NOT);
					}
				}

				setState(949);
				match(IN);
				setState(950);
				match(T__1);
				setState(951);
				query();
				setState(952);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(955);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(954);
					match(NOT);
					}
				}

				setState(957);
				match(LIKE);
				setState(958);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(959);
					match(ESCAPE);
					setState(960);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(963);
				match(IS);
				setState(965);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(964);
					match(NOT);
					}
				}

				setState(967);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(968);
				match(IS);
				setState(970);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(969);
					match(NOT);
					}
				}

				setState(972);
				match(DISTINCT);
				setState(973);
				match(FROM);
				setState(974);
				((DistinctFromContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case ADD:
			case NO:
			case EXISTS:
			case NULL:
			case TRUE:
			case FALSE:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case EXTRACT:
			case CASE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case CAST:
			case TRY_CAST:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NORMALIZE:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(978);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(979);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(980);
				valueExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(997);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(995);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(983);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(984);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (ASTERISK - 199)) | (1L << (SLASH - 199)) | (1L << (PERCENT - 199)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(985);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(986);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(987);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(988);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(989);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(990);
						match(CONCAT);
						setState(991);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(992);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(993);
						match(AT);
						setState(994);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(999);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicitRowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ImplicitRowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterImplicitRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitImplicitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitImplicitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1001);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1002);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1003);
				identifier();
				setState(1004);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1006);
				match(DOUBLE_PRECISION);
				setState(1007);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1008);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1009);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1010);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1011);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1012);
				match(T__5);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1013);
				match(POSITION);
				setState(1014);
				match(T__1);
				setState(1015);
				valueExpression(0);
				setState(1016);
				match(IN);
				setState(1017);
				valueExpression(0);
				setState(1018);
				match(T__3);
				}
				break;
			case 11:
				{
				_localctx = new ImplicitRowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1020);
				match(T__1);
				setState(1021);
				expression();
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1022);
					match(T__2);
					setState(1023);
					expression();
					}
					}
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1029);
				match(T__3);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1031);
				match(ROW);
				setState(1032);
				match(T__1);
				setState(1033);
				expression();
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1034);
					match(T__2);
					setState(1035);
					expression();
					}
					}
					setState(1040);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1041);
				match(T__3);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1043);
				qualifiedName();
				setState(1044);
				match(T__1);
				setState(1045);
				match(ASTERISK);
				setState(1046);
				match(T__3);
				setState(1048);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1047);
					filter();
					}
					break;
				}
				setState(1051);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1050);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1053);
				qualifiedName();
				setState(1054);
				match(T__1);
				setState(1066);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << ADD) | (1L << ALL) | (1L << DISTINCT) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MINUTE - 64)) | (1L << (SECOND - 64)) | (1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (FILTER - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (SCHEMA - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SCHEMAS - 128)) | (1L << (CATALOGS - 128)) | (1L << (COLUMNS - 128)) | (1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (INPUT - 128)) | (1L << (OUTPUT - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (INCLUDING - 128)) | (1L << (EXCLUDING - 128)) | (1L << (PROPERTIES - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PLUS - 197)) | (1L << (MINUS - 197)) | (1L << (STRING - 197)) | (1L << (BINARY_LITERAL - 197)) | (1L << (INTEGER_VALUE - 197)) | (1L << (DECIMAL_VALUE - 197)) | (1L << (IDENTIFIER - 197)) | (1L << (DIGIT_IDENTIFIER - 197)) | (1L << (QUOTED_IDENTIFIER - 197)) | (1L << (BACKQUOTED_IDENTIFIER - 197)) | (1L << (DOUBLE_PRECISION - 197)))) != 0)) {
					{
					setState(1056);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1055);
						setQuantifier();
						}
					}

					setState(1058);
					expression();
					setState(1063);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1059);
						match(T__2);
						setState(1060);
						expression();
						}
						}
						setState(1065);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1068);
				match(T__3);
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1069);
					filter();
					}
					break;
				}
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1072);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1075);
				identifier();
				setState(1076);
				match(T__6);
				setState(1077);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1079);
				match(T__1);
				setState(1080);
				identifier();
				setState(1085);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1081);
					match(T__2);
					setState(1082);
					identifier();
					}
					}
					setState(1087);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1088);
				match(T__3);
				setState(1089);
				match(T__6);
				setState(1090);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1092);
				match(T__1);
				setState(1093);
				query();
				setState(1094);
				match(T__3);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1096);
				match(EXISTS);
				setState(1097);
				match(T__1);
				setState(1098);
				query();
				setState(1099);
				match(T__3);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1101);
				match(CASE);
				setState(1102);
				valueExpression(0);
				setState(1104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1103);
					whenClause();
					}
					}
					setState(1106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1110);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1108);
					match(ELSE);
					setState(1109);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1112);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1114);
				match(CASE);
				setState(1116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1115);
					whenClause();
					}
					}
					setState(1118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1122);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1120);
					match(ELSE);
					setState(1121);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1124);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1126);
				match(CAST);
				setState(1127);
				match(T__1);
				setState(1128);
				expression();
				setState(1129);
				match(AS);
				setState(1130);
				type(0);
				setState(1131);
				match(T__3);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1133);
				match(TRY_CAST);
				setState(1134);
				match(T__1);
				setState(1135);
				expression();
				setState(1136);
				match(AS);
				setState(1137);
				type(0);
				setState(1138);
				match(T__3);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1140);
				match(ARRAY);
				setState(1141);
				match(T__7);
				setState(1150);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << ADD) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (MINUTE - 64)) | (1L << (SECOND - 64)) | (1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (FILTER - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (SCHEMA - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (SCHEMAS - 128)) | (1L << (CATALOGS - 128)) | (1L << (COLUMNS - 128)) | (1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (INPUT - 128)) | (1L << (OUTPUT - 128)) | (1L << (CASCADE - 128)) | (1L << (RESTRICT - 128)) | (1L << (INCLUDING - 128)) | (1L << (EXCLUDING - 128)) | (1L << (PROPERTIES - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (PLUS - 197)) | (1L << (MINUS - 197)) | (1L << (STRING - 197)) | (1L << (BINARY_LITERAL - 197)) | (1L << (INTEGER_VALUE - 197)) | (1L << (DECIMAL_VALUE - 197)) | (1L << (IDENTIFIER - 197)) | (1L << (DIGIT_IDENTIFIER - 197)) | (1L << (QUOTED_IDENTIFIER - 197)) | (1L << (BACKQUOTED_IDENTIFIER - 197)) | (1L << (DOUBLE_PRECISION - 197)))) != 0)) {
					{
					setState(1142);
					expression();
					setState(1147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1143);
						match(T__2);
						setState(1144);
						expression();
						}
						}
						setState(1149);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1152);
				match(T__8);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1153);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1154);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1155);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1156);
					match(T__1);
					setState(1157);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1158);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1161);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1162);
					match(T__1);
					setState(1163);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1164);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1167);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1168);
					match(T__1);
					setState(1169);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1170);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1173);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1174);
					match(T__1);
					setState(1175);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1176);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1179);
				match(SUBSTRING);
				setState(1180);
				match(T__1);
				setState(1181);
				valueExpression(0);
				setState(1182);
				match(FROM);
				setState(1183);
				valueExpression(0);
				setState(1186);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1184);
					match(FOR);
					setState(1185);
					valueExpression(0);
					}
				}

				setState(1188);
				match(T__3);
				}
				break;
			case 31:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1190);
				match(NORMALIZE);
				setState(1191);
				match(T__1);
				setState(1192);
				valueExpression(0);
				setState(1195);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1193);
					match(T__2);
					setState(1194);
					normalForm();
					}
				}

				setState(1197);
				match(T__3);
				}
				break;
			case 32:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1199);
				match(EXTRACT);
				setState(1200);
				match(T__1);
				setState(1201);
				identifier();
				setState(1202);
				match(FROM);
				setState(1203);
				valueExpression(0);
				setState(1204);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1208);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1209);
						match(T__7);
						setState(1210);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1211);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1213);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1214);
						match(T__0);
						setState(1215);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_timeZoneSpecifier);
		try {
			setState(1227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1221);
				match(TIME);
				setState(1222);
				match(ZONE);
				setState(1223);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(TIME);
				setState(1225);
				match(ZONE);
				setState(1226);
				match(STRING);
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_la = _input.LA(1);
			if ( !(((((_la - 191)) & ~0x3f) == 0 && ((1L << (_la - 191)) & ((1L << (EQ - 191)) | (1L << (NEQ - 191)) | (1L << (LT - 191)) | (1L << (LTE - 191)) | (1L << (GT - 191)) | (1L << (GTE - 191)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << SOME) | (1L << ANY))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(INTERVAL);
			setState(1237);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1236);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1239);
			match(STRING);
			setState(1240);
			((IntervalContext)_localctx).from = intervalField();
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1241);
				match(TO);
				setState(1242);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (YEAR - 60)) | (1L << (MONTH - 60)) | (1L << (DAY - 60)) | (1L << (HOUR - 60)) | (1L << (MINUTE - 60)) | (1L << (SECOND - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1248);
				match(ARRAY);
				setState(1249);
				match(LT);
				setState(1250);
				type(0);
				setState(1251);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1253);
				match(MAP);
				setState(1254);
				match(LT);
				setState(1255);
				type(0);
				setState(1256);
				match(T__2);
				setState(1257);
				type(0);
				setState(1258);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1260);
				match(ROW);
				setState(1261);
				match(T__1);
				setState(1262);
				identifier();
				setState(1263);
				type(0);
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1264);
					match(T__2);
					setState(1265);
					identifier();
					setState(1266);
					type(0);
					}
					}
					setState(1272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1273);
				match(T__3);
				}
				break;
			case 4:
				{
				setState(1275);
				baseType();
				setState(1287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1276);
					match(T__1);
					setState(1277);
					typeParameter();
					setState(1282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1278);
						match(T__2);
						setState(1279);
						typeParameter();
						}
						}
						setState(1284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1285);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1291);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(1292);
					match(ARRAY);
					}
					} 
				}
				setState(1297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeParameter);
		try {
			setState(1300);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case TIME_WITH_TIME_ZONE:
			case TIMESTAMP_WITH_TIME_ZONE:
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				type(0);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0); }
		public TerminalNode TIMESTAMP_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_baseType);
		try {
			setState(1306);
			switch (_input.LA(1)) {
			case TIME_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				match(TIME_WITH_TIME_ZONE);
				}
				break;
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				match(TIMESTAMP_WITH_TIME_ZONE);
				}
				break;
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1304);
				match(DOUBLE_PRECISION);
				}
				break;
			case ADD:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1305);
				identifier();
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			match(WHEN);
			setState(1309);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1310);
			match(THEN);
			setState(1311);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			match(FILTER);
			setState(1314);
			match(T__1);
			setState(1315);
			match(WHERE);
			setState(1316);
			booleanExpression(0);
			setState(1317);
			match(T__3);
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

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			match(OVER);
			setState(1320);
			match(T__1);
			setState(1331);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1321);
				match(PARTITION);
				setState(1322);
				match(BY);
				setState(1323);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1324);
					match(T__2);
					setState(1325);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1343);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1333);
				match(ORDER);
				setState(1334);
				match(BY);
				setState(1335);
				sortItem();
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1336);
					match(T__2);
					setState(1337);
					sortItem();
					}
					}
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1346);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1345);
				windowFrame();
				}
			}

			setState(1348);
			match(T__3);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_windowFrame);
		try {
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1351);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1353);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1354);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1355);
				match(BETWEEN);
				setState(1356);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1357);
				match(AND);
				setState(1358);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1360);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1361);
				match(BETWEEN);
				setState(1362);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1363);
				match(AND);
				setState(1364);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_frameBound);
		int _la;
		try {
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1368);
				match(UNBOUNDED);
				setState(1369);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1370);
				match(UNBOUNDED);
				setState(1371);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1372);
				match(CURRENT);
				setState(1373);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1374);
				expression();
				setState(1375);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_explainOption);
		int _la;
		try {
			setState(1383);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				match(FORMAT);
				setState(1380);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==GRAPHVIZ) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1381);
				match(TYPE);
				setState(1382);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOGICAL || _la==DISTRIBUTED) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_transactionMode);
		int _la;
		try {
			setState(1390);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1385);
				match(ISOLATION);
				setState(1386);
				match(LEVEL);
				setState(1387);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1388);
				match(READ);
				setState(1389);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==ONLY) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_levelOfIsolation);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1392);
				match(READ);
				setState(1393);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				match(READ);
				setState(1395);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				match(REPEATABLE);
				setState(1397);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1398);
				match(SERIALIZABLE);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_callArgument);
		try {
			setState(1406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1401);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				identifier();
				setState(1403);
				match(T__9);
				setState(1404);
				expression();
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

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_privilege);
		try {
			setState(1412);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1408);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1409);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1410);
				match(INSERT);
				}
				break;
			case ADD:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1411);
				identifier();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			identifier();
			setState(1419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1415);
					match(T__0);
					setState(1416);
					identifier();
					}
					} 
				}
				setState(1421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_identifier);
		try {
			setState(1427);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				quotedIdentifier();
				}
				break;
			case ADD:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case FILTER:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case SCHEMA:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case INPUT:
			case OUTPUT:
			case CASCADE:
			case RESTRICT:
			case INCLUDING:
			case EXCLUDING:
			case PROPERTIES:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1424);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1425);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1426);
				match(DIGIT_IDENTIFIER);
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(QUOTED_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_number);
		try {
			setState(1433);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				match(DECIMAL_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				match(INTEGER_VALUE);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode TINYINT() { return getToken(SqlBaseParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlBaseParser.SMALLINT, 0); }
		public TerminalNode INTEGER() { return getToken(SqlBaseParser.INTEGER, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode POISSONIZED() { return getToken(SqlBaseParser.POISSONIZED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode COALESCE() { return getToken(SqlBaseParser.COALESCE, 0); }
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PUBLIC() { return getToken(SqlBaseParser.PUBLIC, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nonReserved);
		try {
			setState(1524);
			switch (_input.LA(1)) {
			case SHOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1435);
				match(SHOW);
				}
				break;
			case TABLES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				match(TABLES);
				}
				break;
			case COLUMNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
				match(COLUMNS);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1438);
				match(COLUMN);
				}
				break;
			case PARTITIONS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1439);
				match(PARTITIONS);
				}
				break;
			case FUNCTIONS:
				enterOuterAlt(_localctx, 6);
				{
				setState(1440);
				match(FUNCTIONS);
				}
				break;
			case SCHEMAS:
				enterOuterAlt(_localctx, 7);
				{
				setState(1441);
				match(SCHEMAS);
				}
				break;
			case CATALOGS:
				enterOuterAlt(_localctx, 8);
				{
				setState(1442);
				match(CATALOGS);
				}
				break;
			case SESSION:
				enterOuterAlt(_localctx, 9);
				{
				setState(1443);
				match(SESSION);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 10);
				{
				setState(1444);
				match(ADD);
				}
				break;
			case FILTER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1445);
				match(FILTER);
				}
				break;
			case OVER:
				enterOuterAlt(_localctx, 12);
				{
				setState(1446);
				match(OVER);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 13);
				{
				setState(1447);
				match(PARTITION);
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1448);
				match(RANGE);
				}
				break;
			case ROWS:
				enterOuterAlt(_localctx, 15);
				{
				setState(1449);
				match(ROWS);
				}
				break;
			case PRECEDING:
				enterOuterAlt(_localctx, 16);
				{
				setState(1450);
				match(PRECEDING);
				}
				break;
			case FOLLOWING:
				enterOuterAlt(_localctx, 17);
				{
				setState(1451);
				match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 18);
				{
				setState(1452);
				match(CURRENT);
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 19);
				{
				setState(1453);
				match(ROW);
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 20);
				{
				setState(1454);
				match(MAP);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 21);
				{
				setState(1455);
				match(ARRAY);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 22);
				{
				setState(1456);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 23);
				{
				setState(1457);
				match(SMALLINT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 24);
				{
				setState(1458);
				match(INTEGER);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 25);
				{
				setState(1459);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 26);
				{
				setState(1460);
				match(TIME);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 27);
				{
				setState(1461);
				match(TIMESTAMP);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 28);
				{
				setState(1462);
				match(INTERVAL);
				}
				break;
			case ZONE:
				enterOuterAlt(_localctx, 29);
				{
				setState(1463);
				match(ZONE);
				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 30);
				{
				setState(1464);
				match(YEAR);
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 31);
				{
				setState(1465);
				match(MONTH);
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 32);
				{
				setState(1466);
				match(DAY);
				}
				break;
			case HOUR:
				enterOuterAlt(_localctx, 33);
				{
				setState(1467);
				match(HOUR);
				}
				break;
			case MINUTE:
				enterOuterAlt(_localctx, 34);
				{
				setState(1468);
				match(MINUTE);
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 35);
				{
				setState(1469);
				match(SECOND);
				}
				break;
			case EXPLAIN:
				enterOuterAlt(_localctx, 36);
				{
				setState(1470);
				match(EXPLAIN);
				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 37);
				{
				setState(1471);
				match(ANALYZE);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 38);
				{
				setState(1472);
				match(FORMAT);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 39);
				{
				setState(1473);
				match(TYPE);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 40);
				{
				setState(1474);
				match(TEXT);
				}
				break;
			case GRAPHVIZ:
				enterOuterAlt(_localctx, 41);
				{
				setState(1475);
				match(GRAPHVIZ);
				}
				break;
			case LOGICAL:
				enterOuterAlt(_localctx, 42);
				{
				setState(1476);
				match(LOGICAL);
				}
				break;
			case DISTRIBUTED:
				enterOuterAlt(_localctx, 43);
				{
				setState(1477);
				match(DISTRIBUTED);
				}
				break;
			case TABLESAMPLE:
				enterOuterAlt(_localctx, 44);
				{
				setState(1478);
				match(TABLESAMPLE);
				}
				break;
			case SYSTEM:
				enterOuterAlt(_localctx, 45);
				{
				setState(1479);
				match(SYSTEM);
				}
				break;
			case BERNOULLI:
				enterOuterAlt(_localctx, 46);
				{
				setState(1480);
				match(BERNOULLI);
				}
				break;
			case POISSONIZED:
				enterOuterAlt(_localctx, 47);
				{
				setState(1481);
				match(POISSONIZED);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 48);
				{
				setState(1482);
				match(USE);
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 49);
				{
				setState(1483);
				match(TO);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 50);
				{
				setState(1484);
				match(SET);
				}
				break;
			case RESET:
				enterOuterAlt(_localctx, 51);
				{
				setState(1485);
				match(RESET);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 52);
				{
				setState(1486);
				match(VIEW);
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 53);
				{
				setState(1487);
				match(REPLACE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 54);
				{
				setState(1488);
				match(IF);
				}
				break;
			case NULLIF:
				enterOuterAlt(_localctx, 55);
				{
				setState(1489);
				match(NULLIF);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 56);
				{
				setState(1490);
				match(COALESCE);
				}
				break;
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
				enterOuterAlt(_localctx, 57);
				{
				setState(1491);
				normalForm();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 58);
				{
				setState(1492);
				match(POSITION);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 59);
				{
				setState(1493);
				match(NO);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 60);
				{
				setState(1494);
				match(DATA);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 61);
				{
				setState(1495);
				match(START);
				}
				break;
			case TRANSACTION:
				enterOuterAlt(_localctx, 62);
				{
				setState(1496);
				match(TRANSACTION);
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 63);
				{
				setState(1497);
				match(COMMIT);
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 64);
				{
				setState(1498);
				match(ROLLBACK);
				}
				break;
			case WORK:
				enterOuterAlt(_localctx, 65);
				{
				setState(1499);
				match(WORK);
				}
				break;
			case ISOLATION:
				enterOuterAlt(_localctx, 66);
				{
				setState(1500);
				match(ISOLATION);
				}
				break;
			case LEVEL:
				enterOuterAlt(_localctx, 67);
				{
				setState(1501);
				match(LEVEL);
				}
				break;
			case SERIALIZABLE:
				enterOuterAlt(_localctx, 68);
				{
				setState(1502);
				match(SERIALIZABLE);
				}
				break;
			case REPEATABLE:
				enterOuterAlt(_localctx, 69);
				{
				setState(1503);
				match(REPEATABLE);
				}
				break;
			case COMMITTED:
				enterOuterAlt(_localctx, 70);
				{
				setState(1504);
				match(COMMITTED);
				}
				break;
			case UNCOMMITTED:
				enterOuterAlt(_localctx, 71);
				{
				setState(1505);
				match(UNCOMMITTED);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 72);
				{
				setState(1506);
				match(READ);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 73);
				{
				setState(1507);
				match(WRITE);
				}
				break;
			case ONLY:
				enterOuterAlt(_localctx, 74);
				{
				setState(1508);
				match(ONLY);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 75);
				{
				setState(1509);
				match(CALL);
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 76);
				{
				setState(1510);
				match(GRANT);
				}
				break;
			case REVOKE:
				enterOuterAlt(_localctx, 77);
				{
				setState(1511);
				match(REVOKE);
				}
				break;
			case PRIVILEGES:
				enterOuterAlt(_localctx, 78);
				{
				setState(1512);
				match(PRIVILEGES);
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 79);
				{
				setState(1513);
				match(PUBLIC);
				}
				break;
			case OPTION:
				enterOuterAlt(_localctx, 80);
				{
				setState(1514);
				match(OPTION);
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 81);
				{
				setState(1515);
				match(SUBSTRING);
				}
				break;
			case SCHEMA:
				enterOuterAlt(_localctx, 82);
				{
				setState(1516);
				match(SCHEMA);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 83);
				{
				setState(1517);
				match(CASCADE);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 84);
				{
				setState(1518);
				match(RESTRICT);
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 85);
				{
				setState(1519);
				match(INPUT);
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 86);
				{
				setState(1520);
				match(OUTPUT);
				}
				break;
			case INCLUDING:
				enterOuterAlt(_localctx, 87);
				{
				setState(1521);
				match(INCLUDING);
				}
				break;
			case EXCLUDING:
				enterOuterAlt(_localctx, 88);
				{
				setState(1522);
				match(EXCLUDING);
				}
				break;
			case PROPERTIES:
				enterOuterAlt(_localctx, 89);
				{
				setState(1523);
				match(PROPERTIES);
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

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			_la = _input.LA(1);
			if ( !(((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (NFD - 184)) | (1L << (NFC - 184)) | (1L << (NFKD - 184)) | (1L << (NFKC - 184)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class HdfsPathContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public HdfsPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdfsPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHdfsPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHdfsPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHdfsPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HdfsPathContext hdfsPath() throws RecognitionException {
		HdfsPathContext _localctx = new HdfsPathContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_hdfsPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(T__10);
			setState(1531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1529);
				match(SLASH);
				setState(1530);
				identifier();
				}
				}
				setState(1533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(1535);
			match(T__11);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 22:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 31:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 34:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 35:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 42:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00dc\u0604\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u0092\n\4\3\4\3\4\3\4\5\4\u0097\n\4\3\4\3\4\3\4"+
		"\3\4\5\4\u009d\n\4\3\4\3\4\5\4\u00a1\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4\u00af\n\4\3\4\3\4\3\4\5\4\u00b4\n\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00ba\n\4\3\4\5\4\u00bd\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c4\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4\u00cb\n\4\f\4\16\4\u00ce\13\4\3\4\3\4\3\4\5\4"+
		"\u00d3\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00dc\n\4\f\4\16\4\u00df\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0101"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u0108\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u0111\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u012d\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0138\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"\u0141\n\4\f\4\16\4\u0144\13\4\5\4\u0146\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u014e\n\4\f\4\16\4\u0151\13\4\3\4\3\4\5\4\u0155\n\4\3\4\3\4\5\4\u0159"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0161\n\4\3\4\3\4\3\4\3\4\5\4\u0167\n"+
		"\4\3\4\3\4\3\4\7\4\u016c\n\4\f\4\16\4\u016f\13\4\3\4\3\4\5\4\u0173\n\4"+
		"\3\4\3\4\5\4\u0177\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u017f\n\4\3\4\3\4\3"+
		"\4\3\4\7\4\u0185\n\4\f\4\16\4\u0188\13\4\3\4\3\4\5\4\u018c\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u019b\n\4\3\4\3\4\5\4"+
		"\u019f\n\4\3\4\3\4\3\4\3\4\5\4\u01a5\n\4\3\4\3\4\5\4\u01a9\n\4\3\4\3\4"+
		"\3\4\3\4\5\4\u01af\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u01cb\n\4"+
		"\f\4\16\4\u01ce\13\4\5\4\u01d0\n\4\3\4\3\4\5\4\u01d4\n\4\3\4\3\4\5\4\u01d8"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01e0\n\4\3\4\3\4\3\4\3\4\3\4\7\4\u01e7"+
		"\n\4\f\4\16\4\u01ea\13\4\5\4\u01ec\n\4\3\4\3\4\5\4\u01f0\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0200\n\4\f\4\16\4"+
		"\u0203\13\4\5\4\u0205\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u020d\n\4\3\5\5"+
		"\5\u0210\n\5\3\5\3\5\3\6\3\6\5\6\u0216\n\6\3\6\3\6\3\6\7\6\u021b\n\6\f"+
		"\6\16\6\u021e\13\6\3\7\3\7\5\7\u0222\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5"+
		"\t\u022b\n\t\3\n\3\n\3\n\3\n\7\n\u0231\n\n\f\n\16\n\u0234\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0242\n\f\f\f\16\f\u0245"+
		"\13\f\5\f\u0247\n\f\3\f\3\f\5\f\u024b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0253\n\r\3\r\3\r\3\r\3\r\5\r\u0259\n\r\3\r\7\r\u025c\n\r\f\r\16\r\u025f"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0268\n\16\f\16\16\16\u026b"+
		"\13\16\3\16\3\16\3\16\3\16\5\16\u0271\n\16\3\17\3\17\5\17\u0275\n\17\3"+
		"\17\3\17\5\17\u0279\n\17\3\20\3\20\5\20\u027d\n\20\3\20\3\20\3\20\7\20"+
		"\u0282\n\20\f\20\16\20\u0285\13\20\3\20\3\20\3\20\3\20\7\20\u028b\n\20"+
		"\f\20\16\20\u028e\13\20\5\20\u0290\n\20\3\20\3\20\5\20\u0294\n\20\3\20"+
		"\3\20\3\20\5\20\u0299\n\20\3\20\3\20\5\20\u029d\n\20\3\21\5\21\u02a0\n"+
		"\21\3\21\3\21\3\21\7\21\u02a5\n\21\f\21\16\21\u02a8\13\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u02b0\n\22\f\22\16\22\u02b3\13\22\5\22\u02b5\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02bd\n\22\f\22\16\22\u02c0\13"+
		"\22\5\22\u02c2\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u02cb\n\22"+
		"\f\22\16\22\u02ce\13\22\3\22\3\22\5\22\u02d2\n\22\3\23\3\23\3\23\3\23"+
		"\7\23\u02d8\n\23\f\23\16\23\u02db\13\23\5\23\u02dd\n\23\3\23\3\23\5\23"+
		"\u02e1\n\23\3\24\3\24\3\24\3\24\7\24\u02e7\n\24\f\24\16\24\u02ea\13\24"+
		"\5\24\u02ec\n\24\3\24\3\24\5\24\u02f0\n\24\3\25\3\25\5\25\u02f4\n\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\5\27\u02ff\n\27\3\27\5\27"+
		"\u0302\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0309\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u031c\n\30\7\30\u031e\n\30\f\30\16\30\u0321\13\30\3\31\5\31\u0324"+
		"\n\31\3\31\3\31\5\31\u0328\n\31\3\31\3\31\5\31\u032c\n\31\3\31\3\31\5"+
		"\31\u0330\n\31\5\31\u0332\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u033b\n\32\f\32\16\32\u033e\13\32\3\32\3\32\5\32\u0342\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u034b\n\33\3\34\3\34\3\35\3\35\5\35\u0351"+
		"\n\35\3\35\3\35\5\35\u0355\n\35\5\35\u0357\n\35\3\36\3\36\3\36\3\36\7"+
		"\36\u035d\n\36\f\36\16\36\u0360\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\7\37\u036e\n\37\f\37\16\37\u0371\13\37\3"+
		"\37\3\37\3\37\5\37\u0376\n\37\3\37\3\37\3\37\3\37\5\37\u037c\n\37\3 \3"+
		" \3!\3!\3!\3!\5!\u0384\n!\3!\3!\3!\3!\3!\3!\7!\u038c\n!\f!\16!\u038f\13"+
		"!\3\"\3\"\5\"\u0393\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u039f\n#\3#\3"+
		"#\3#\3#\3#\3#\5#\u03a7\n#\3#\3#\3#\3#\3#\7#\u03ae\n#\f#\16#\u03b1\13#"+
		"\3#\3#\3#\5#\u03b6\n#\3#\3#\3#\3#\3#\3#\5#\u03be\n#\3#\3#\3#\3#\5#\u03c4"+
		"\n#\3#\3#\5#\u03c8\n#\3#\3#\3#\5#\u03cd\n#\3#\3#\3#\5#\u03d2\n#\3$\3$"+
		"\3$\3$\5$\u03d8\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u03e6\n$\f$"+
		"\16$\u03e9\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\7%\u0403\n%\f%\16%\u0406\13%\3%\3%\3%\3%\3%\3%\3%\7%"+
		"\u040f\n%\f%\16%\u0412\13%\3%\3%\3%\3%\3%\3%\3%\5%\u041b\n%\3%\5%\u041e"+
		"\n%\3%\3%\3%\5%\u0423\n%\3%\3%\3%\7%\u0428\n%\f%\16%\u042b\13%\5%\u042d"+
		"\n%\3%\3%\5%\u0431\n%\3%\5%\u0434\n%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u043e"+
		"\n%\f%\16%\u0441\13%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6"+
		"%\u0453\n%\r%\16%\u0454\3%\3%\5%\u0459\n%\3%\3%\3%\3%\6%\u045f\n%\r%\16"+
		"%\u0460\3%\3%\5%\u0465\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\7%\u047c\n%\f%\16%\u047f\13%\5%\u0481\n%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u048a\n%\3%\3%\3%\3%\5%\u0490\n%\3%\3%\3%\3%\5%\u0496"+
		"\n%\3%\3%\3%\3%\5%\u049c\n%\3%\3%\3%\3%\3%\3%\3%\5%\u04a5\n%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u04ae\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u04b9\n%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u04c3\n%\f%\16%\u04c6\13%\3&\3&\3&\3&\3&\3&\5&\u04ce"+
		"\n&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u04d8\n*\3*\3*\3*\3*\5*\u04de\n*\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u04f7"+
		"\n,\f,\16,\u04fa\13,\3,\3,\3,\3,\3,\3,\3,\7,\u0503\n,\f,\16,\u0506\13"+
		",\3,\3,\5,\u050a\n,\5,\u050c\n,\3,\3,\7,\u0510\n,\f,\16,\u0513\13,\3-"+
		"\3-\5-\u0517\n-\3.\3.\3.\3.\5.\u051d\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0531\n\61\f\61"+
		"\16\61\u0534\13\61\5\61\u0536\n\61\3\61\3\61\3\61\3\61\3\61\7\61\u053d"+
		"\n\61\f\61\16\61\u0540\13\61\5\61\u0542\n\61\3\61\5\61\u0545\n\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0559\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u0564\n\63\3\64\3\64\3\64\3\64\5\64\u056a\n\64\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u0571\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u057a\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u0581\n\67\38\38\38\38\58\u0587"+
		"\n8\39\39\39\79\u058c\n9\f9\169\u058f\139\3:\3:\3:\3:\3:\5:\u0596\n:\3"+
		";\3;\3<\3<\5<\u059c\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\5=\u05f7\n=\3>\3>\3?\3?\3?\6?\u05fe\n?\r?\16?\u05ff\3?\3"+
		"?\3?\2\b\30.@FHV@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\26\3\2\u00b0\u00b1\4\2\20"+
		"\20$$\4\2\23\23\u00cf\u00cf\3\2\u00b2\u00b3\3\2\u008a\u008b\3\2\62\63"+
		"\3\2/\60\4\2\23\23\26\26\3\2\u008e\u0090\3\2\u00c7\u00c8\3\2\u00c9\u00cb"+
		"\3\2\u00c1\u00c6\3\2\23\25\3\2,-\3\2>C\3\2`a\3\2z{\3\2|}\3\2\u00a8\u00a9"+
		"\3\2\u00ba\u00bd\u0732\2~\3\2\2\2\4\u0081\3\2\2\2\6\u020c\3\2\2\2\b\u020f"+
		"\3\2\2\2\n\u0213\3\2\2\2\f\u0221\3\2\2\2\16\u0223\3\2\2\2\20\u0226\3\2"+
		"\2\2\22\u022c\3\2\2\2\24\u0237\3\2\2\2\26\u023b\3\2\2\2\30\u024c\3\2\2"+
		"\2\32\u0270\3\2\2\2\34\u0272\3\2\2\2\36\u027a\3\2\2\2 \u029f\3\2\2\2\""+
		"\u02d1\3\2\2\2$\u02e0\3\2\2\2&\u02ef\3\2\2\2(\u02f1\3\2\2\2*\u02fa\3\2"+
		"\2\2,\u0308\3\2\2\2.\u030a\3\2\2\2\60\u0331\3\2\2\2\62\u0341\3\2\2\2\64"+
		"\u0343\3\2\2\2\66\u034c\3\2\2\28\u034e\3\2\2\2:\u0358\3\2\2\2<\u037b\3"+
		"\2\2\2>\u037d\3\2\2\2@\u0383\3\2\2\2B\u0390\3\2\2\2D\u03d1\3\2\2\2F\u03d7"+
		"\3\2\2\2H\u04b8\3\2\2\2J\u04cd\3\2\2\2L\u04cf\3\2\2\2N\u04d1\3\2\2\2P"+
		"\u04d3\3\2\2\2R\u04d5\3\2\2\2T\u04df\3\2\2\2V\u050b\3\2\2\2X\u0516\3\2"+
		"\2\2Z\u051c\3\2\2\2\\\u051e\3\2\2\2^\u0523\3\2\2\2`\u0529\3\2\2\2b\u0558"+
		"\3\2\2\2d\u0563\3\2\2\2f\u0569\3\2\2\2h\u0570\3\2\2\2j\u0579\3\2\2\2l"+
		"\u0580\3\2\2\2n\u0586\3\2\2\2p\u0588\3\2\2\2r\u0595\3\2\2\2t\u0597\3\2"+
		"\2\2v\u059b\3\2\2\2x\u05f6\3\2\2\2z\u05f8\3\2\2\2|\u05fa\3\2\2\2~\177"+
		"\5\6\4\2\177\u0080\7\2\2\3\u0080\3\3\2\2\2\u0081\u0082\5> \2\u0082\u0083"+
		"\7\2\2\3\u0083\5\3\2\2\2\u0084\u020d\5\b\5\2\u0085\u0086\7\u0086\2\2\u0086"+
		"\u020d\5r:\2\u0087\u0088\7\u0086\2\2\u0088\u0089\5r:\2\u0089\u008a\7\3"+
		"\2\2\u008a\u008b\5r:\2\u008b\u020d\3\2\2\2\u008c\u008d\7g\2\2\u008d\u0091"+
		"\7h\2\2\u008e\u008f\7\u00be\2\2\u008f\u0090\7%\2\2\u0090\u0092\7\'\2\2"+
		"\u0091\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096"+
		"\5p9\2\u0094\u0095\7d\2\2\u0095\u0097\5\22\n\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u020d\3\2\2\2\u0098\u0099\7\u0089\2\2\u0099\u009c"+
		"\7h\2\2\u009a\u009b\7\u00be\2\2\u009b\u009d\7\'\2\2\u009c\u009a\3\2\2"+
		"\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\5p9\2\u009f\u00a1"+
		"\t\2\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u020d\3\2\2\2\u00a2"+
		"\u00a3\7\u0092\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\5p9\2\u00a5\u00a6\7"+
		"\u0093\2\2\u00a6\u00a7\7\u008d\2\2\u00a7\u00a8\5r:\2\u00a8\u020d\3\2\2"+
		"\2\u00a9\u00aa\7g\2\2\u00aa\u00ae\7i\2\2\u00ab\u00ac\7\u00be\2\2\u00ac"+
		"\u00ad\7%\2\2\u00ad\u00af\7\'\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b3\5p9\2\u00b1\u00b2\7d\2\2\u00b2\u00b4"+
		"\5\22\n\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b6\7\22\2\2\u00b6\u00bc\5\b\5\2\u00b7\u00b9\7d\2\2\u00b8\u00ba"+
		"\7&\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\7\u009b\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u020d"+
		"\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c3\7i\2\2\u00c0\u00c1\7\u00be\2\2"+
		"\u00c1\u00c2\7%\2\2\u00c2\u00c4\7\'\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\5p9\2\u00c6\u00c7\7\4\2\2\u00c7"+
		"\u00cc\5\f\7\2\u00c8\u00c9\7\5\2\2\u00c9\u00cb\5\f\7\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\7\6\2\2\u00d0\u00d1\7d"+
		"\2\2\u00d1\u00d3\5\22\n\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u020d\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7i\2\2\u00d6\u00d7\5p9\2"+
		"\u00d7\u00d8\7\4\2\2\u00d8\u00dd\5\f\7\2\u00d9\u00da\7\5\2\2\u00da\u00dc"+
		"\5\f\7\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\6"+
		"\2\2\u00e1\u00e2\7\u00b5\2\2\u00e2\u00e3\7\\\2\2\u00e3\u00e4\7\31\2\2"+
		"\u00e4\u00e5\7\4\2\2\u00e5\u00e6\5r:\2\u00e6\u00e7\7\6\2\2\u00e7\u00e8"+
		"\7X\2\2\u00e8\u00e9\7\u00b6\2\2\u00e9\u00ea\5p9\2\u00ea\u00eb\7<\2\2\u00eb"+
		"\u00ec\7\31\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\5r:\2\u00ee\u00ef\7\6"+
		"\2\2\u00ef\u020d\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7\u00b6\2\2\u00f2"+
		"\u020d\5p9\2\u00f3\u00f4\7\u00b7\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00f6"+
		"\5|?\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\5p9\2\u00f8\u00f9\7\u00b8\2\2"+
		"\u00f9\u00fa\7\31\2\2\u00fa\u00fb\7\7\2\2\u00fb\u020d\3\2\2\2\u00fc\u00fd"+
		"\7\u0089\2\2\u00fd\u0100\7i\2\2\u00fe\u00ff\7\u00be\2\2\u00ff\u0101\7"+
		"\'\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u020d\5p9\2\u0103\u0104\7l\2\2\u0104\u0105\7n\2\2\u0105\u0107\5p9\2\u0106"+
		"\u0108\5:\36\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\5\b\5\2\u010a\u020d\3\2\2\2\u010b\u010c\7m\2\2\u010c"+
		"\u010d\7\20\2\2\u010d\u0110\5p9\2\u010e\u010f\7\27\2\2\u010f\u0111\5@"+
		"!\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u020d\3\2\2\2\u0112"+
		"\u0113\7\u0092\2\2\u0113\u0114\7i\2\2\u0114\u0115\5p9\2\u0115\u0116\7"+
		"\u0093\2\2\u0116\u0117\7\u008d\2\2\u0117\u0118\5p9\2\u0118\u020d\3\2\2"+
		"\2\u0119\u011a\7\u0092\2\2\u011a\u011b\7i\2\2\u011b\u011c\5p9\2\u011c"+
		"\u011d\7\u0093\2\2\u011d\u011e\7\u0085\2\2\u011e\u011f\5r:\2\u011f\u0120"+
		"\7\u008d\2\2\u0120\u0121\5r:\2\u0121\u020d\3\2\2\2\u0122\u0123\7\u0092"+
		"\2\2\u0123\u0124\7i\2\2\u0124\u0125\5p9\2\u0125\u0126\7\21\2\2\u0126\u0127"+
		"\7\u0085\2\2\u0127\u0128\5\16\b\2\u0128\u020d\3\2\2\2\u0129\u012c\7g\2"+
		"\2\u012a\u012b\7\"\2\2\u012b\u012d\7k\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7j\2\2\u012f\u0130\5p9\2\u0130"+
		"\u0131\7\22\2\2\u0131\u0132\5\b\5\2\u0132\u020d\3\2\2\2\u0133\u0134\7"+
		"\u0089\2\2\u0134\u0137\7j\2\2\u0135\u0136\7\u00be\2\2\u0136\u0138\7\'"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u020d\5p9\2\u013a\u013b\7\u00aa\2\2\u013b\u013c\5p9\2\u013c\u0145\7\4"+
		"\2\2\u013d\u0142\5l\67\2\u013e\u013f\7\5\2\2\u013f\u0141\5l\67\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u013d\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\6\2\2\u0148\u020d\3\2"+
		"\2\2\u0149\u0154\7q\2\2\u014a\u014f\5n8\2\u014b\u014c\7\5\2\2\u014c\u014e"+
		"\5n8\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0155\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7\23"+
		"\2\2\u0153\u0155\7s\2\2\u0154\u014a\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0158\7Y\2\2\u0157\u0159\7i\2\2\u0158\u0157\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\5p9\2\u015b\u015c"+
		"\7\u008d\2\2\u015c\u0160\5r:\2\u015d\u015e\7d\2\2\u015e\u015f\7q\2\2\u015f"+
		"\u0161\7u\2\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u020d\3\2"+
		"\2\2\u0162\u0166\7r\2\2\u0163\u0164\7q\2\2\u0164\u0165\7u\2\2\u0165\u0167"+
		"\7\66\2\2\u0166\u0163\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0172\3\2\2\2"+
		"\u0168\u016d\5n8\2\u0169\u016a\7\5\2\2\u016a\u016c\5n8\2\u016b\u0169\3"+
		"\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0173\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\23\2\2\u0171\u0173\7"+
		"s\2\2\u0172\u0168\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\7Y\2\2\u0175\u0177\7i\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2"+
		"\2\u0177\u0178\3\2\2\2\u0178\u0179\5p9\2\u0179\u017a\7\20\2\2\u017a\u017b"+
		"\5r:\2\u017b\u020d\3\2\2\2\u017c\u017e\7v\2\2\u017d\u017f\7w\2\2\u017e"+
		"\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u018b\3\2\2\2\u0180\u0181\7\4"+
		"\2\2\u0181\u0186\5f\64\2\u0182\u0183\7\5\2\2\u0183\u0185\5f\64\2\u0184"+
		"\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\6\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0180\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u020d\5\6\4\2\u018e\u018f\7\u0080\2\2\u018f\u0190\7g\2\2\u0190"+
		"\u0191\7i\2\2\u0191\u020d\5p9\2\u0192\u0193\7\u0080\2\2\u0193\u0194\7"+
		"g\2\2\u0194\u0195\7j\2\2\u0195\u020d\5p9\2\u0196\u0197\7\u0080\2\2\u0197"+
		"\u019a\7\u0081\2\2\u0198\u0199\t\3\2\2\u0199\u019b\5p9\2\u019a\u0198\3"+
		"\2\2\2\u019a\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019d\7)\2\2\u019d"+
		"\u019f\7\u00cd\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u020d"+
		"\3\2\2\2\u01a0\u01a1\7\u0080\2\2\u01a1\u01a4\7\u0082\2\2\u01a2\u01a3\t"+
		"\3\2\2\u01a3\u01a5\5r:\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a7\7)\2\2\u01a7\u01a9\7\u00cd\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u020d\3\2\2\2\u01aa\u01ab\7\u0080\2"+
		"\2\u01ab\u01ae\7\u0083\2\2\u01ac\u01ad\7)\2\2\u01ad\u01af\7\u00cd\2\2"+
		"\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u020d\3\2\2\2\u01b0\u01b1"+
		"\7\u0080\2\2\u01b1\u01b2\7\u0084\2\2\u01b2\u01b3\t\3\2\2\u01b3\u020d\5"+
		"p9\2\u01b4\u01b5\7p\2\2\u01b5\u020d\5p9\2\u01b6\u01b7\7\63\2\2\u01b7\u020d"+
		"\5p9\2\u01b8\u01b9\7\u0080\2\2\u01b9\u020d\7\u0088\2\2\u01ba\u01bb\7\u0080"+
		"\2\2\u01bb\u020d\7\u009a\2\2\u01bc\u01bd\7\u0098\2\2\u01bd\u01be\7\u009a"+
		"\2\2\u01be\u01bf\5p9\2\u01bf\u01c0\7\u00c1\2\2\u01c0\u01c1\5> \2\u01c1"+
		"\u020d\3\2\2\2\u01c2\u01c3\7\u0099\2\2\u01c3\u01c4\7\u009a\2\2\u01c4\u020d"+
		"\5p9\2\u01c5\u01c6\7\u009c\2\2\u01c6\u01cf\7\u009d\2\2\u01c7\u01cc\5h"+
		"\65\2\u01c8\u01c9\7\5\2\2\u01c9\u01cb\5h\65\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2"+
		"\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u020d\3\2\2\2\u01d1\u01d3\7\u009e\2\2\u01d2\u01d4\7\u00a0\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u020d\3\2\2\2\u01d5\u01d7\7\u009f\2"+
		"\2\u01d6\u01d8\7\u00a0\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u020d\3\2\2\2\u01d9\u01da\7\u0080\2\2\u01da\u01db\7\u0087\2\2\u01db\u01dc"+
		"\t\3\2\2\u01dc\u01df\5p9\2\u01dd\u01de\7\27\2\2\u01de\u01e0\5@!\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01eb\3\2\2\2\u01e1\u01e2\7\36"+
		"\2\2\u01e2\u01e3\7\31\2\2\u01e3\u01e8\5\34\17\2\u01e4\u01e5\7\5\2\2\u01e5"+
		"\u01e7\5\34\17\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3"+
		"\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01e1\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ee\7 "+
		"\2\2\u01ee\u01f0\t\4\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u020d\3\2\2\2\u01f1\u01f2\7\u00ab\2\2\u01f2\u01f3\5r:\2\u01f3\u01f4\7"+
		"\20\2\2\u01f4\u01f5\5\6\4\2\u01f5\u020d\3\2\2\2\u01f6\u01f7\7\u00ac\2"+
		"\2\u01f7\u01f8\7\u00ab\2\2\u01f8\u020d\5r:\2\u01f9\u01fa\7\u00ad\2\2\u01fa"+
		"\u0204\5r:\2\u01fb\u01fc\7X\2\2\u01fc\u0201\5> \2\u01fd\u01fe\7\5\2\2"+
		"\u01fe\u0200\5> \2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u01fb\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u020d\3\2\2\2\u0206\u0207\7p"+
		"\2\2\u0207\u0208\7\u00ae\2\2\u0208\u020d\5r:\2\u0209\u020a\7p\2\2\u020a"+
		"\u020b\7\u00af\2\2\u020b\u020d\5r:\2\u020c\u0084\3\2\2\2\u020c\u0085\3"+
		"\2\2\2\u020c\u0087\3\2\2\2\u020c\u008c\3\2\2\2\u020c\u0098\3\2\2\2\u020c"+
		"\u00a2\3\2\2\2\u020c\u00a9\3\2\2\2\u020c\u00be\3\2\2\2\u020c\u00d4\3\2"+
		"\2\2\u020c\u00f0\3\2\2\2\u020c\u00f3\3\2\2\2\u020c\u00fc\3\2\2\2\u020c"+
		"\u0103\3\2\2\2\u020c\u010b\3\2\2\2\u020c\u0112\3\2\2\2\u020c\u0119\3\2"+
		"\2\2\u020c\u0122\3\2\2\2\u020c\u0129\3\2\2\2\u020c\u0133\3\2\2\2\u020c"+
		"\u013a\3\2\2\2\u020c\u0149\3\2\2\2\u020c\u0162\3\2\2\2\u020c\u017c\3\2"+
		"\2\2\u020c\u018e\3\2\2\2\u020c\u0192\3\2\2\2\u020c\u0196\3\2\2\2\u020c"+
		"\u01a0\3\2\2\2\u020c\u01aa\3\2\2\2\u020c\u01b0\3\2\2\2\u020c\u01b4\3\2"+
		"\2\2\u020c\u01b6\3\2\2\2\u020c\u01b8\3\2\2\2\u020c\u01ba\3\2\2\2\u020c"+
		"\u01bc\3\2\2\2\u020c\u01c2\3\2\2\2\u020c\u01c5\3\2\2\2\u020c\u01d1\3\2"+
		"\2\2\u020c\u01d5\3\2\2\2\u020c\u01d9\3\2\2\2\u020c\u01f1\3\2\2\2\u020c"+
		"\u01f6\3\2\2\2\u020c\u01f9\3\2\2\2\u020c\u0206\3\2\2\2\u020c\u0209\3\2"+
		"\2\2\u020d\7\3\2\2\2\u020e\u0210\5\n\6\2\u020f\u020e\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\5\26\f\2\u0212\t\3\2\2\2\u0213"+
		"\u0215\7d\2\2\u0214\u0216\7e\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u021c\5(\25\2\u0218\u0219\7\5\2\2\u0219\u021b"+
		"\5(\25\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\13\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0222\5\16\b"+
		"\2\u0220\u0222\5\20\t\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222"+
		"\r\3\2\2\2\u0223\u0224\5r:\2\u0224\u0225\5V,\2\u0225\17\3\2\2\2\u0226"+
		"\u0227\7)\2\2\u0227\u022a\5p9\2\u0228\u0229\t\5\2\2\u0229\u022b\7\u00b4"+
		"\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\21\3\2\2\2\u022c\u022d"+
		"\7\4\2\2\u022d\u0232\5\24\13\2\u022e\u022f\7\5\2\2\u022f\u0231\5\24\13"+
		"\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7\6\2\2\u0236"+
		"\23\3\2\2\2\u0237\u0238\5r:\2\u0238\u0239\7\u00c1\2\2\u0239\u023a\5> "+
		"\2\u023a\25\3\2\2\2\u023b\u0246\5\30\r\2\u023c\u023d\7\36\2\2\u023d\u023e"+
		"\7\31\2\2\u023e\u0243\5\34\17\2\u023f\u0240\7\5\2\2\u0240\u0242\5\34\17"+
		"\2\u0241\u023f\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u023c\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0249\7 \2\2\u0249\u024b\t\4"+
		"\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\27\3\2\2\2\u024c\u024d"+
		"\b\r\1\2\u024d\u024e\5\32\16\2\u024e\u025d\3\2\2\2\u024f\u0250\f\4\2\2"+
		"\u0250\u0252\7\u008c\2\2\u0251\u0253\5*\26\2\u0252\u0251\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u025c\5\30\r\5\u0255\u0256\f"+
		"\3\2\2\u0256\u0258\t\6\2\2\u0257\u0259\5*\26\2\u0258\u0257\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\5\30\r\4\u025b\u024f\3"+
		"\2\2\2\u025b\u0255\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\31\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0271\5\36\20"+
		"\2\u0261\u0262\7i\2\2\u0262\u0271\5p9\2\u0263\u0264\7f\2\2\u0264\u0269"+
		"\5> \2\u0265\u0266\7\5\2\2\u0266\u0268\5> \2\u0267\u0265\3\2\2\2\u0268"+
		"\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0271\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7\4\2\2\u026d\u026e\5\26\f\2\u026e"+
		"\u026f\7\6\2\2\u026f\u0271\3\2\2\2\u0270\u0260\3\2\2\2\u0270\u0261\3\2"+
		"\2\2\u0270\u0263\3\2\2\2\u0270\u026c\3\2\2\2\u0271\33\3\2\2\2\u0272\u0274"+
		"\5> \2\u0273\u0275\t\7\2\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0278\3\2\2\2\u0276\u0277\7.\2\2\u0277\u0279\t\b\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\35\3\2\2\2\u027a\u027c\7\17\2\2\u027b\u027d"+
		"\5*\26\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0283\5,\27\2\u027f\u0280\7\5\2\2\u0280\u0282\5,\27\2\u0281\u027f\3\2"+
		"\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u028f\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0287\7\20\2\2\u0287\u028c\5"+
		".\30\2\u0288\u0289\7\5\2\2\u0289\u028b\5.\30\2\u028a\u0288\3\2\2\2\u028b"+
		"\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290\3\2"+
		"\2\2\u028e\u028c\3\2\2\2\u028f\u0286\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u0292\7\27\2\2\u0292\u0294\5@!\2\u0293\u0291\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0298\3\2\2\2\u0295\u0296\7\30\2\2\u0296"+
		"\u0297\7\31\2\2\u0297\u0299\5 \21\2\u0298\u0295\3\2\2\2\u0298\u0299\3"+
		"\2\2\2\u0299\u029c\3\2\2\2\u029a\u029b\7\37\2\2\u029b\u029d\5@!\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\37\3\2\2\2\u029e\u02a0\5*\26"+
		"\2\u029f\u029e\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a6"+
		"\5\"\22\2\u02a2\u02a3\7\5\2\2\u02a3\u02a5\5\"\22\2\u02a4\u02a2\3\2\2\2"+
		"\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7!\3"+
		"\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02d2\5$\23\2\u02aa\u02ab\7\35\2\2\u02ab"+
		"\u02b4\7\4\2\2\u02ac\u02b1\5p9\2\u02ad\u02ae\7\5\2\2\u02ae\u02b0\5p9\2"+
		"\u02af\u02ad\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02ac\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02d2\7\6\2\2\u02b7\u02b8\7\34"+
		"\2\2\u02b8\u02c1\7\4\2\2\u02b9\u02be\5p9\2\u02ba\u02bb\7\5\2\2\u02bb\u02bd"+
		"\5p9\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02b9\3\2"+
		"\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02d2\7\6\2\2\u02c4"+
		"\u02c5\7\32\2\2\u02c5\u02c6\7\33\2\2\u02c6\u02c7\7\4\2\2\u02c7\u02cc\5"+
		"&\24\2\u02c8\u02c9\7\5\2\2\u02c9\u02cb\5&\24\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2"+
		"\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7\6\2\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02a9\3\2\2\2\u02d1\u02aa\3\2\2\2\u02d1\u02b7\3\2\2\2\u02d1\u02c4\3\2"+
		"\2\2\u02d2#\3\2\2\2\u02d3\u02dc\7\4\2\2\u02d4\u02d9\5> \2\u02d5\u02d6"+
		"\7\5\2\2\u02d6\u02d8\5> \2\u02d7\u02d5\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\3\2\2\2\u02db\u02d9\3\2"+
		"\2\2\u02dc\u02d4\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de"+
		"\u02e1\7\6\2\2\u02df\u02e1\5> \2\u02e0\u02d3\3\2\2\2\u02e0\u02df\3\2\2"+
		"\2\u02e1%\3\2\2\2\u02e2\u02eb\7\4\2\2\u02e3\u02e8\5p9\2\u02e4\u02e5\7"+
		"\5\2\2\u02e5\u02e7\5p9\2\u02e6\u02e4\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02eb\u02e3\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed"+
		"\u02f0\7\6\2\2\u02ee\u02f0\5p9\2\u02ef\u02e2\3\2\2\2\u02ef\u02ee\3\2\2"+
		"\2\u02f0\'\3\2\2\2\u02f1\u02f3\5r:\2\u02f2\u02f4\5:\36\2\u02f3\u02f2\3"+
		"\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\7\22\2\2\u02f6"+
		"\u02f7\7\4\2\2\u02f7\u02f8\5\b\5\2\u02f8\u02f9\7\6\2\2\u02f9)\3\2\2\2"+
		"\u02fa\u02fb\t\t\2\2\u02fb+\3\2\2\2\u02fc\u0301\5> \2\u02fd\u02ff\7\22"+
		"\2\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300"+
		"\u0302\5r:\2\u0301\u02fe\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0309\3\2\2"+
		"\2\u0303\u0304\5p9\2\u0304\u0305\7\3\2\2\u0305\u0306\7\u00c9\2\2\u0306"+
		"\u0309\3\2\2\2\u0307\u0309\7\u00c9\2\2\u0308\u02fc\3\2\2\2\u0308\u0303"+
		"\3\2\2\2\u0308\u0307\3\2\2\2\u0309-\3\2\2\2\u030a\u030b\b\30\1\2\u030b"+
		"\u030c\5\64\33\2\u030c\u031f\3\2\2\2\u030d\u031b\f\4\2\2\u030e\u030f\7"+
		"Q\2\2\u030f\u0310\7P\2\2\u0310\u031c\5\64\33\2\u0311\u0312\5\60\31\2\u0312"+
		"\u0313\7P\2\2\u0313\u0314\5.\30\2\u0314\u0315\5\62\32\2\u0315\u031c\3"+
		"\2\2\2\u0316\u0317\7W\2\2\u0317\u0318\5\60\31\2\u0318\u0319\7P\2\2\u0319"+
		"\u031a\5\64\33\2\u031a\u031c\3\2\2\2\u031b\u030e\3\2\2\2\u031b\u0311\3"+
		"\2\2\2\u031b\u0316\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u030d\3\2\2\2\u031e"+
		"\u0321\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320/\3\2\2\2"+
		"\u0321\u031f\3\2\2\2\u0322\u0324\7S\2\2\u0323\u0322\3\2\2\2\u0323\u0324"+
		"\3\2\2\2\u0324\u0332\3\2\2\2\u0325\u0327\7T\2\2\u0326\u0328\7R\2\2\u0327"+
		"\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0332\3\2\2\2\u0329\u032b\7U"+
		"\2\2\u032a\u032c\7R\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u0332\3\2\2\2\u032d\u032f\7V\2\2\u032e\u0330\7R\2\2\u032f\u032e\3\2\2"+
		"\2\u032f\u0330\3\2\2\2\u0330\u0332\3\2\2\2\u0331\u0323\3\2\2\2\u0331\u0325"+
		"\3\2\2\2\u0331\u0329\3\2\2\2\u0331\u032d\3\2\2\2\u0332\61\3\2\2\2\u0333"+
		"\u0334\7Y\2\2\u0334\u0342\5@!\2\u0335\u0336\7X\2\2\u0336\u0337\7\4\2\2"+
		"\u0337\u033c\5r:\2\u0338\u0339\7\5\2\2\u0339\u033b\5r:\2\u033a\u0338\3"+
		"\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f\u0340\7\6\2\2\u0340\u0342\3\2"+
		"\2\2\u0341\u0333\3\2\2\2\u0341\u0335\3\2\2\2\u0342\63\3\2\2\2\u0343\u034a"+
		"\58\35\2\u0344\u0345\7\u0091\2\2\u0345\u0346\5\66\34\2\u0346\u0347\7\4"+
		"\2\2\u0347\u0348\5> \2\u0348\u0349\7\6\2\2\u0349\u034b\3\2\2\2\u034a\u0344"+
		"\3\2\2\2\u034a\u034b\3\2\2\2\u034b\65\3\2\2\2\u034c\u034d\t\n\2\2\u034d"+
		"\67\3\2\2\2\u034e\u0356\5<\37\2\u034f\u0351\7\22\2\2\u0350\u034f\3\2\2"+
		"\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\5r:\2\u0353\u0355"+
		"\5:\36\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356"+
		"\u0350\3\2\2\2\u0356\u0357\3\2\2\2\u03579\3\2\2\2\u0358\u0359\7\4\2\2"+
		"\u0359\u035e\5r:\2\u035a\u035b\7\5\2\2\u035b\u035d\5r:\2\u035c\u035a\3"+
		"\2\2\2\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\7\6\2\2\u0362;\3\2\2\2"+
		"\u0363\u037c\5p9\2\u0364\u0365\7\4\2\2\u0365\u0366\5\b\5\2\u0366\u0367"+
		"\7\6\2\2\u0367\u037c\3\2\2\2\u0368\u0369\7\u0094\2\2\u0369\u036a\7\4\2"+
		"\2\u036a\u036f\5> \2\u036b\u036c\7\5\2\2\u036c\u036e\5> \2\u036d\u036b"+
		"\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0372\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0375\7\6\2\2\u0373\u0374\7d"+
		"\2\2\u0374\u0376\7\u0095\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u037c\3\2\2\2\u0377\u0378\7\4\2\2\u0378\u0379\5.\30\2\u0379\u037a\7\6"+
		"\2\2\u037a\u037c\3\2\2\2\u037b\u0363\3\2\2\2\u037b\u0364\3\2\2\2\u037b"+
		"\u0368\3\2\2\2\u037b\u0377\3\2\2\2\u037c=\3\2\2\2\u037d\u037e\5@!\2\u037e"+
		"?\3\2\2\2\u037f\u0380\b!\1\2\u0380\u0384\5B\"\2\u0381\u0382\7%\2\2\u0382"+
		"\u0384\5@!\5\u0383\u037f\3\2\2\2\u0383\u0381\3\2\2\2\u0384\u038d\3\2\2"+
		"\2\u0385\u0386\f\4\2\2\u0386\u0387\7#\2\2\u0387\u038c\5@!\5\u0388\u0389"+
		"\f\3\2\2\u0389\u038a\7\"\2\2\u038a\u038c\5@!\4\u038b\u0385\3\2\2\2\u038b"+
		"\u0388\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2"+
		"\2\2\u038eA\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0392\5F$\2\u0391\u0393"+
		"\5D#\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393C\3\2\2\2\u0394\u0395"+
		"\5L\'\2\u0395\u0396\5F$\2\u0396\u03d2\3\2\2\2\u0397\u0398\5L\'\2\u0398"+
		"\u0399\5N(\2\u0399\u039a\7\4\2\2\u039a\u039b\5\b\5\2\u039b\u039c\7\6\2"+
		"\2\u039c\u03d2\3\2\2\2\u039d\u039f\7%\2\2\u039e\u039d\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\7(\2\2\u03a1\u03a2\5F$\2\u03a2"+
		"\u03a3\7#\2\2\u03a3\u03a4\5F$\2\u03a4\u03d2\3\2\2\2\u03a5\u03a7\7%\2\2"+
		"\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9"+
		"\7$\2\2\u03a9\u03aa\7\4\2\2\u03aa\u03af\5> \2\u03ab\u03ac\7\5\2\2\u03ac"+
		"\u03ae\5> \2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2"+
		"\2\u03af\u03b0\3\2\2\2\u03b0\u03b2\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b3"+
		"\7\6\2\2\u03b3\u03d2\3\2\2\2\u03b4\u03b6\7%\2\2\u03b5\u03b4\3\2\2\2\u03b5"+
		"\u03b6\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\7$\2\2\u03b8\u03b9\7\4"+
		"\2\2\u03b9\u03ba\5\b\5\2\u03ba\u03bb\7\6\2\2\u03bb\u03d2\3\2\2\2\u03bc"+
		"\u03be\7%\2\2\u03bd\u03bc\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2"+
		"\2\2\u03bf\u03c0\7)\2\2\u03c0\u03c3\5F$\2\u03c1\u03c2\7\61\2\2\u03c2\u03c4"+
		"\5F$\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03d2\3\2\2\2\u03c5"+
		"\u03c7\7*\2\2\u03c6\u03c8\7%\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2"+
		"\2\u03c8\u03c9\3\2\2\2\u03c9\u03d2\7+\2\2\u03ca\u03cc\7*\2\2\u03cb\u03cd"+
		"\7%\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce"+
		"\u03cf\7\26\2\2\u03cf\u03d0\7\20\2\2\u03d0\u03d2\5F$\2\u03d1\u0394\3\2"+
		"\2\2\u03d1\u0397\3\2\2\2\u03d1\u039e\3\2\2\2\u03d1\u03a6\3\2\2\2\u03d1"+
		"\u03b5\3\2\2\2\u03d1\u03bd\3\2\2\2\u03d1\u03c5\3\2\2\2\u03d1\u03ca\3\2"+
		"\2\2\u03d2E\3\2\2\2\u03d3\u03d4\b$\1\2\u03d4\u03d8\5H%\2\u03d5\u03d6\t"+
		"\13\2\2\u03d6\u03d8\5F$\6\u03d7\u03d3\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8"+
		"\u03e7\3\2\2\2\u03d9\u03da\f\5\2\2\u03da\u03db\t\f\2\2\u03db\u03e6\5F"+
		"$\6\u03dc\u03dd\f\4\2\2\u03dd\u03de\t\13\2\2\u03de\u03e6\5F$\5\u03df\u03e0"+
		"\f\3\2\2\u03e0\u03e1\7\u00cc\2\2\u03e1\u03e6\5F$\4\u03e2\u03e3\f\7\2\2"+
		"\u03e3\u03e4\7!\2\2\u03e4\u03e6\5J&\2\u03e5\u03d9\3\2\2\2\u03e5\u03dc"+
		"\3\2\2\2\u03e5\u03df\3\2\2\2\u03e5\u03e2\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8G\3\2\2\2\u03e9\u03e7\3\2\2\2"+
		"\u03ea\u03eb\b%\1\2\u03eb\u04b9\7+\2\2\u03ec\u04b9\5R*\2\u03ed\u03ee\5"+
		"r:\2\u03ee\u03ef\7\u00cd\2\2\u03ef\u04b9\3\2\2\2\u03f0\u03f1\7\u00d7\2"+
		"\2\u03f1\u04b9\7\u00cd\2\2\u03f2\u04b9\5v<\2\u03f3\u04b9\5P)\2\u03f4\u04b9"+
		"\7\u00cd\2\2\u03f5\u04b9\7\u00ce\2\2\u03f6\u04b9\7\b\2\2\u03f7\u03f8\7"+
		"\65\2\2\u03f8\u03f9\7\4\2\2\u03f9\u03fa\5F$\2\u03fa\u03fb\7$\2\2\u03fb"+
		"\u03fc\5F$\2\u03fc\u03fd\7\6\2\2\u03fd\u04b9\3\2\2\2\u03fe\u03ff\7\4\2"+
		"\2\u03ff\u0404\5> \2\u0400\u0401\7\5\2\2\u0401\u0403\5> \2\u0402\u0400"+
		"\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2\2\u0405"+
		"\u0407\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u0408\7\6\2\2\u0408\u04b9\3\2"+
		"\2\2\u0409\u040a\7c\2\2\u040a\u040b\7\4\2\2\u040b\u0410\5> \2\u040c\u040d"+
		"\7\5\2\2\u040d\u040f\5> \2\u040e\u040c\3\2\2\2\u040f\u0412\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2\2\2\u0412\u0410\3\2"+
		"\2\2\u0413\u0414\7\6\2\2\u0414\u04b9\3\2\2\2\u0415\u0416\5p9\2\u0416\u0417"+
		"\7\4\2\2\u0417\u0418\7\u00c9\2\2\u0418\u041a\7\6\2\2\u0419\u041b\5^\60"+
		"\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u041e"+
		"\5`\61\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u04b9\3\2\2\2\u041f"+
		"\u0420\5p9\2\u0420\u042c\7\4\2\2\u0421\u0423\5*\26\2\u0422\u0421\3\2\2"+
		"\2\u0422\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0429\5> \2\u0425\u0426"+
		"\7\5\2\2\u0426\u0428\5> \2\u0427\u0425\3\2\2\2\u0428\u042b\3\2\2\2\u0429"+
		"\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042d\3\2\2\2\u042b\u0429\3\2"+
		"\2\2\u042c\u0422\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e\3\2\2\2\u042e"+
		"\u0430\7\6\2\2\u042f\u0431\5^\60\2\u0430\u042f\3\2\2\2\u0430\u0431\3\2"+
		"\2\2\u0431\u0433\3\2\2\2\u0432\u0434\5`\61\2\u0433\u0432\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u04b9\3\2\2\2\u0435\u0436\5r:\2\u0436\u0437\7\t\2"+
		"\2\u0437\u0438\5> \2\u0438\u04b9\3\2\2\2\u0439\u043a\7\4\2\2\u043a\u043f"+
		"\5r:\2\u043b\u043c\7\5\2\2\u043c\u043e\5r:\2\u043d\u043b\3\2\2\2\u043e"+
		"\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0442\3\2"+
		"\2\2\u0441\u043f\3\2\2\2\u0442\u0443\7\6\2\2\u0443\u0444\7\t\2\2\u0444"+
		"\u0445\5> \2\u0445\u04b9\3\2\2\2\u0446\u0447\7\4\2\2\u0447\u0448\5\b\5"+
		"\2\u0448\u0449\7\6\2\2\u0449\u04b9\3\2\2\2\u044a\u044b\7\'\2\2\u044b\u044c"+
		"\7\4\2\2\u044c\u044d\5\b\5\2\u044d\u044e\7\6\2\2\u044e\u04b9\3\2\2\2\u044f"+
		"\u0450\7K\2\2\u0450\u0452\5F$\2\u0451\u0453\5\\/\2\u0452\u0451\3\2\2\2"+
		"\u0453\u0454\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0458"+
		"\3\2\2\2\u0456\u0457\7N\2\2\u0457\u0459\5> \2\u0458\u0456\3\2\2\2\u0458"+
		"\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\7O\2\2\u045b\u04b9\3\2"+
		"\2\2\u045c\u045e\7K\2\2\u045d\u045f\5\\/\2\u045e\u045d\3\2\2\2\u045f\u0460"+
		"\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0464\3\2\2\2\u0462"+
		"\u0463\7N\2\2\u0463\u0465\5> \2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u0467\7O\2\2\u0467\u04b9\3\2\2\2\u0468\u0469"+
		"\7~\2\2\u0469\u046a\7\4\2\2\u046a\u046b\5> \2\u046b\u046c\7\22\2\2\u046c"+
		"\u046d\5V,\2\u046d\u046e\7\6\2\2\u046e\u04b9\3\2\2\2\u046f\u0470\7\177"+
		"\2\2\u0470\u0471\7\4\2\2\u0471\u0472\5> \2\u0472\u0473\7\22\2\2\u0473"+
		"\u0474\5V,\2\u0474\u0475\7\6\2\2\u0475\u04b9\3\2\2\2\u0476\u0477\7\u0096"+
		"\2\2\u0477\u0480\7\n\2\2\u0478\u047d\5> \2\u0479\u047a\7\5\2\2\u047a\u047c"+
		"\5> \2\u047b\u0479\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0478\3\2"+
		"\2\2\u0480\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u04b9\7\13\2\2\u0483"+
		"\u04b9\5r:\2\u0484\u04b9\7E\2\2\u0485\u0489\7F\2\2\u0486\u0487\7\4\2\2"+
		"\u0487\u0488\7\u00cf\2\2\u0488\u048a\7\6\2\2\u0489\u0486\3\2\2\2\u0489"+
		"\u048a\3\2\2\2\u048a\u04b9\3\2\2\2\u048b\u048f\7G\2\2\u048c\u048d\7\4"+
		"\2\2\u048d\u048e\7\u00cf\2\2\u048e\u0490\7\6\2\2\u048f\u048c\3\2\2\2\u048f"+
		"\u0490\3\2\2\2\u0490\u04b9\3\2\2\2\u0491\u0495\7H\2\2\u0492\u0493\7\4"+
		"\2\2\u0493\u0494\7\u00cf\2\2\u0494\u0496\7\6\2\2\u0495\u0492\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496\u04b9\3\2\2\2\u0497\u049b\7I\2\2\u0498\u0499\7\4"+
		"\2\2\u0499\u049a\7\u00cf\2\2\u049a\u049c\7\6\2\2\u049b\u0498\3\2\2\2\u049b"+
		"\u049c\3\2\2\2\u049c\u04b9\3\2\2\2\u049d\u049e\7\64\2\2\u049e\u049f\7"+
		"\4\2\2\u049f\u04a0\5F$\2\u04a0\u04a1\7\20\2\2\u04a1\u04a4\5F$\2\u04a2"+
		"\u04a3\7\66\2\2\u04a3\u04a5\5F$\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2"+
		"\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\7\6\2\2\u04a7\u04b9\3\2\2\2\u04a8"+
		"\u04a9\7\u00b9\2\2\u04a9\u04aa\7\4\2\2\u04aa\u04ad\5F$\2\u04ab\u04ac\7"+
		"\5\2\2\u04ac\u04ae\5z>\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b0\7\6\2\2\u04b0\u04b9\3\2\2\2\u04b1\u04b2\7J"+
		"\2\2\u04b2\u04b3\7\4\2\2\u04b3\u04b4\5r:\2\u04b4\u04b5\7\20\2\2\u04b5"+
		"\u04b6\5F$\2\u04b6\u04b7\7\6\2\2\u04b7\u04b9\3\2\2\2\u04b8\u03ea\3\2\2"+
		"\2\u04b8\u03ec\3\2\2\2\u04b8\u03ed\3\2\2\2\u04b8\u03f0\3\2\2\2\u04b8\u03f2"+
		"\3\2\2\2\u04b8\u03f3\3\2\2\2\u04b8\u03f4\3\2\2\2\u04b8\u03f5\3\2\2\2\u04b8"+
		"\u03f6\3\2\2\2\u04b8\u03f7\3\2\2\2\u04b8\u03fe\3\2\2\2\u04b8\u0409\3\2"+
		"\2\2\u04b8\u0415\3\2\2\2\u04b8\u041f\3\2\2\2\u04b8\u0435\3\2\2\2\u04b8"+
		"\u0439\3\2\2\2\u04b8\u0446\3\2\2\2\u04b8\u044a\3\2\2\2\u04b8\u044f\3\2"+
		"\2\2\u04b8\u045c\3\2\2\2\u04b8\u0468\3\2\2\2\u04b8\u046f\3\2\2\2\u04b8"+
		"\u0476\3\2\2\2\u04b8\u0483\3\2\2\2\u04b8\u0484\3\2\2\2\u04b8\u0485\3\2"+
		"\2\2\u04b8\u048b\3\2\2\2\u04b8\u0491\3\2\2\2\u04b8\u0497\3\2\2\2\u04b8"+
		"\u049d\3\2\2\2\u04b8\u04a8\3\2\2\2\u04b8\u04b1\3\2\2\2\u04b9\u04c4\3\2"+
		"\2\2\u04ba\u04bb\f\r\2\2\u04bb\u04bc\7\n\2\2\u04bc\u04bd\5F$\2\u04bd\u04be"+
		"\7\13\2\2\u04be\u04c3\3\2\2\2\u04bf\u04c0\f\13\2\2\u04c0\u04c1\7\3\2\2"+
		"\u04c1\u04c3\5r:\2\u04c2\u04ba\3\2\2\2\u04c2\u04bf\3\2\2\2\u04c3\u04c6"+
		"\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5I\3\2\2\2\u04c6"+
		"\u04c4\3\2\2\2\u04c7\u04c8\7;\2\2\u04c8\u04c9\7D\2\2\u04c9\u04ce\5R*\2"+
		"\u04ca\u04cb\7;\2\2\u04cb\u04cc\7D\2\2\u04cc\u04ce\7\u00cd\2\2\u04cd\u04c7"+
		"\3\2\2\2\u04cd\u04ca\3\2\2\2\u04ceK\3\2\2\2\u04cf\u04d0\t\r\2\2\u04d0"+
		"M\3\2\2\2\u04d1\u04d2\t\16\2\2\u04d2O\3\2\2\2\u04d3\u04d4\t\17\2\2\u04d4"+
		"Q\3\2\2\2\u04d5\u04d7\7=\2\2\u04d6\u04d8\t\13\2\2\u04d7\u04d6\3\2\2\2"+
		"\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04da\7\u00cd\2\2\u04da"+
		"\u04dd\5T+\2\u04db\u04dc\7\u008d\2\2\u04dc\u04de\5T+\2\u04dd\u04db\3\2"+
		"\2\2\u04dd\u04de\3\2\2\2\u04deS\3\2\2\2\u04df\u04e0\t\20\2\2\u04e0U\3"+
		"\2\2\2\u04e1\u04e2\b,\1\2\u04e2\u04e3\7\u0096\2\2\u04e3\u04e4\7\u00c3"+
		"\2\2\u04e4\u04e5\5V,\2\u04e5\u04e6\7\u00c5\2\2\u04e6\u050c\3\2\2\2\u04e7"+
		"\u04e8\7\u0097\2\2\u04e8\u04e9\7\u00c3\2\2\u04e9\u04ea\5V,\2\u04ea\u04eb"+
		"\7\5\2\2\u04eb\u04ec\5V,\2\u04ec\u04ed\7\u00c5\2\2\u04ed\u050c\3\2\2\2"+
		"\u04ee\u04ef\7c\2\2\u04ef\u04f0\7\4\2\2\u04f0\u04f1\5r:\2\u04f1\u04f8"+
		"\5V,\2\u04f2\u04f3\7\5\2\2\u04f3\u04f4\5r:\2\u04f4\u04f5\5V,\2\u04f5\u04f7"+
		"\3\2\2\2\u04f6\u04f2\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u04fb\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb\u04fc\7\6"+
		"\2\2\u04fc\u050c\3\2\2\2\u04fd\u0509\5Z.\2\u04fe\u04ff\7\4\2\2\u04ff\u0504"+
		"\5X-\2\u0500\u0501\7\5\2\2\u0501\u0503\5X-\2\u0502\u0500\3\2\2\2\u0503"+
		"\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0507\3\2"+
		"\2\2\u0506\u0504\3\2\2\2\u0507\u0508\7\6\2\2\u0508\u050a\3\2\2\2\u0509"+
		"\u04fe\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u04e1\3\2"+
		"\2\2\u050b\u04e7\3\2\2\2\u050b\u04ee\3\2\2\2\u050b\u04fd\3\2\2\2\u050c"+
		"\u0511\3\2\2\2\u050d\u050e\f\7\2\2\u050e\u0510\7\u0096\2\2\u050f\u050d"+
		"\3\2\2\2\u0510\u0513\3\2\2\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"W\3\2\2\2\u0513\u0511\3\2\2\2\u0514\u0517\7\u00cf\2\2\u0515\u0517\5V,"+
		"\2\u0516\u0514\3\2\2\2\u0516\u0515\3\2\2\2\u0517Y\3\2\2\2\u0518\u051d"+
		"\7\u00d5\2\2\u0519\u051d\7\u00d6\2\2\u051a\u051d\7\u00d7\2\2\u051b\u051d"+
		"\5r:\2\u051c\u0518\3\2\2\2\u051c\u0519\3\2\2\2\u051c\u051a\3\2\2\2\u051c"+
		"\u051b\3\2\2\2\u051d[\3\2\2\2\u051e\u051f\7L\2\2\u051f\u0520\5> \2\u0520"+
		"\u0521\7M\2\2\u0521\u0522\5> \2\u0522]\3\2\2\2\u0523\u0524\7Z\2\2\u0524"+
		"\u0525\7\4\2\2\u0525\u0526\7\27\2\2\u0526\u0527\5@!\2\u0527\u0528\7\6"+
		"\2\2\u0528_\3\2\2\2\u0529\u052a\7[\2\2\u052a\u0535\7\4\2\2\u052b\u052c"+
		"\7\\\2\2\u052c\u052d\7\31\2\2\u052d\u0532\5> \2\u052e\u052f\7\5\2\2\u052f"+
		"\u0531\5> \2\u0530\u052e\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2\2"+
		"\2\u0532\u0533\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0535\u052b"+
		"\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0541\3\2\2\2\u0537\u0538\7\36\2\2"+
		"\u0538\u0539\7\31\2\2\u0539\u053e\5\34\17\2\u053a\u053b\7\5\2\2\u053b"+
		"\u053d\5\34\17\2\u053c\u053a\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u053c\3"+
		"\2\2\2\u053e\u053f\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0541"+
		"\u0537\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544\3\2\2\2\u0543\u0545\5b"+
		"\62\2\u0544\u0543\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\3\2\2\2\u0546"+
		"\u0547\7\6\2\2\u0547a\3\2\2\2\u0548\u0549\7]\2\2\u0549\u0559\5d\63\2\u054a"+
		"\u054b\7^\2\2\u054b\u0559\5d\63\2\u054c\u054d\7]\2\2\u054d\u054e\7(\2"+
		"\2\u054e\u054f\5d\63\2\u054f\u0550\7#\2\2\u0550\u0551\5d\63\2\u0551\u0559"+
		"\3\2\2\2\u0552\u0553\7^\2\2\u0553\u0554\7(\2\2\u0554\u0555\5d\63\2\u0555"+
		"\u0556\7#\2\2\u0556\u0557\5d\63\2\u0557\u0559\3\2\2\2\u0558\u0548\3\2"+
		"\2\2\u0558\u054a\3\2\2\2\u0558\u054c\3\2\2\2\u0558\u0552\3\2\2\2\u0559"+
		"c\3\2\2\2\u055a\u055b\7_\2\2\u055b\u0564\7`\2\2\u055c\u055d\7_\2\2\u055d"+
		"\u0564\7a\2\2\u055e\u055f\7b\2\2\u055f\u0564\7c\2\2\u0560\u0561\5> \2"+
		"\u0561\u0562\t\21\2\2\u0562\u0564\3\2\2\2\u0563\u055a\3\2\2\2\u0563\u055c"+
		"\3\2\2\2\u0563\u055e\3\2\2\2\u0563\u0560\3\2\2\2\u0564e\3\2\2\2\u0565"+
		"\u0566\7x\2\2\u0566\u056a\t\22\2\2\u0567\u0568\7y\2\2\u0568\u056a\t\23"+
		"\2\2\u0569\u0565\3\2\2\2\u0569\u0567\3\2\2\2\u056ag\3\2\2\2\u056b\u056c"+
		"\7\u00a1\2\2\u056c\u056d\7\u00a2\2\2\u056d\u0571\5j\66\2\u056e\u056f\7"+
		"\u00a7\2\2\u056f\u0571\t\24\2\2\u0570\u056b\3\2\2\2\u0570\u056e\3\2\2"+
		"\2\u0571i\3\2\2\2\u0572\u0573\7\u00a7\2\2\u0573\u057a\7\u00a6\2\2\u0574"+
		"\u0575\7\u00a7\2\2\u0575\u057a\7\u00a5\2\2\u0576\u0577\7\u00a4\2\2\u0577"+
		"\u057a\7\u00a7\2\2\u0578\u057a\7\u00a3\2\2\u0579\u0572\3\2\2\2\u0579\u0574"+
		"\3\2\2\2\u0579\u0576\3\2\2\2\u0579\u0578\3\2\2\2\u057ak\3\2\2\2\u057b"+
		"\u0581\5> \2\u057c\u057d\5r:\2\u057d\u057e\7\f\2\2\u057e\u057f\5> \2\u057f"+
		"\u0581\3\2\2\2\u0580\u057b\3\2\2\2\u0580\u057c\3\2\2\2\u0581m\3\2\2\2"+
		"\u0582\u0587\7\17\2\2\u0583\u0587\7m\2\2\u0584\u0587\7l\2\2\u0585\u0587"+
		"\5r:\2\u0586\u0582\3\2\2\2\u0586\u0583\3\2\2\2\u0586\u0584\3\2\2\2\u0586"+
		"\u0585\3\2\2\2\u0587o\3\2\2\2\u0588\u058d\5r:\2\u0589\u058a\7\3\2\2\u058a"+
		"\u058c\5r:\2\u058b\u0589\3\2\2\2\u058c\u058f\3\2\2\2\u058d\u058b\3\2\2"+
		"\2\u058d\u058e\3\2\2\2\u058eq\3\2\2\2\u058f\u058d\3\2\2\2\u0590\u0596"+
		"\7\u00d1\2\2\u0591\u0596\5t;\2\u0592\u0596\5x=\2\u0593\u0596\7\u00d4\2"+
		"\2\u0594\u0596\7\u00d2\2\2\u0595\u0590\3\2\2\2\u0595\u0591\3\2\2\2\u0595"+
		"\u0592\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0594\3\2\2\2\u0596s\3\2\2\2"+
		"\u0597\u0598\7\u00d3\2\2\u0598u\3\2\2\2\u0599\u059c\7\u00d0\2\2\u059a"+
		"\u059c\7\u00cf\2\2\u059b\u0599\3\2\2\2\u059b\u059a\3\2\2\2\u059cw\3\2"+
		"\2\2\u059d\u05f7\7\u0080\2\2\u059e\u05f7\7\u0081\2\2\u059f\u05f7\7\u0084"+
		"\2\2\u05a0\u05f7\7\u0085\2\2\u05a1\u05f7\7\u0087\2\2\u05a2\u05f7\7\u0088"+
		"\2\2\u05a3\u05f7\7\u0082\2\2\u05a4\u05f7\7\u0083\2\2\u05a5\u05f7\7\u009a"+
		"\2\2\u05a6\u05f7\7\21\2\2\u05a7\u05f7\7Z\2\2\u05a8\u05f7\7[\2\2\u05a9"+
		"\u05f7\7\\\2\2\u05aa\u05f7\7]\2\2\u05ab\u05f7\7^\2\2\u05ac\u05f7\7`\2"+
		"\2\u05ad\u05f7\7a\2\2\u05ae\u05f7\7b\2\2\u05af\u05f7\7c\2\2\u05b0\u05f7"+
		"\7\u0097\2\2\u05b1\u05f7\7\u0096\2\2\u05b2\u05f7\7\67\2\2\u05b3\u05f7"+
		"\78\2\2\u05b4\u05f7\79\2\2\u05b5\u05f7\7:\2\2\u05b6\u05f7\7;\2\2\u05b7"+
		"\u05f7\7<\2\2\u05b8\u05f7\7=\2\2\u05b9\u05f7\7D\2\2\u05ba\u05f7\7>\2\2"+
		"\u05bb\u05f7\7?\2\2\u05bc\u05f7\7@\2\2\u05bd\u05f7\7A\2\2\u05be\u05f7"+
		"\7B\2\2\u05bf\u05f7\7C\2\2\u05c0\u05f7\7v\2\2\u05c1\u05f7\7w\2\2\u05c2"+
		"\u05f7\7x\2\2\u05c3\u05f7\7y\2\2\u05c4\u05f7\7z\2\2\u05c5\u05f7\7{\2\2"+
		"\u05c6\u05f7\7|\2\2\u05c7\u05f7\7}\2\2\u05c8\u05f7\7\u0091\2\2\u05c9\u05f7"+
		"\7\u008e\2\2\u05ca\u05f7\7\u008f\2\2\u05cb\u05f7\7\u0090\2\2\u05cc\u05f7"+
		"\7\u0086\2\2\u05cd\u05f7\7\u008d\2\2\u05ce\u05f7\7\u0098\2\2\u05cf\u05f7"+
		"\7\u0099\2\2\u05d0\u05f7\7j\2\2\u05d1\u05f7\7k\2\2\u05d2\u05f7\7\u00be"+
		"\2\2\u05d3\u05f7\7\u00bf\2\2\u05d4\u05f7\7\u00c0\2\2\u05d5\u05f7\5z>\2"+
		"\u05d6\u05f7\7\65\2\2\u05d7\u05f7\7&\2\2\u05d8\u05f7\7\u009b\2\2\u05d9"+
		"\u05f7\7\u009c\2\2\u05da\u05f7\7\u009d\2\2\u05db\u05f7\7\u009e\2\2\u05dc"+
		"\u05f7\7\u009f\2\2\u05dd\u05f7\7\u00a0\2\2\u05de\u05f7\7\u00a1\2\2\u05df"+
		"\u05f7\7\u00a2\2\2\u05e0\u05f7\7\u00a3\2\2\u05e1\u05f7\7\u00a4\2\2\u05e2"+
		"\u05f7\7\u00a5\2\2\u05e3\u05f7\7\u00a6\2\2\u05e4\u05f7\7\u00a7\2\2\u05e5"+
		"\u05f7\7\u00a8\2\2\u05e6\u05f7\7\u00a9\2\2\u05e7\u05f7\7\u00aa\2\2\u05e8"+
		"\u05f7\7q\2\2\u05e9\u05f7\7r\2\2\u05ea\u05f7\7s\2\2\u05eb\u05f7\7t\2\2"+
		"\u05ec\u05f7\7u\2\2\u05ed\u05f7\7\64\2\2\u05ee\u05f7\7h\2\2\u05ef\u05f7"+
		"\7\u00b0\2\2\u05f0\u05f7\7\u00b1\2\2\u05f1\u05f7\7\u00ae\2\2\u05f2\u05f7"+
		"\7\u00af\2\2\u05f3\u05f7\7\u00b2\2\2\u05f4\u05f7\7\u00b3\2\2\u05f5\u05f7"+
		"\7\u00b4\2\2\u05f6\u059d\3\2\2\2\u05f6\u059e\3\2\2\2\u05f6\u059f\3\2\2"+
		"\2\u05f6\u05a0\3\2\2\2\u05f6\u05a1\3\2\2\2\u05f6\u05a2\3\2\2\2\u05f6\u05a3"+
		"\3\2\2\2\u05f6\u05a4\3\2\2\2\u05f6\u05a5\3\2\2\2\u05f6\u05a6\3\2\2\2\u05f6"+
		"\u05a7\3\2\2\2\u05f6\u05a8\3\2\2\2\u05f6\u05a9\3\2\2\2\u05f6\u05aa\3\2"+
		"\2\2\u05f6\u05ab\3\2\2\2\u05f6\u05ac\3\2\2\2\u05f6\u05ad\3\2\2\2\u05f6"+
		"\u05ae\3\2\2\2\u05f6\u05af\3\2\2\2\u05f6\u05b0\3\2\2\2\u05f6\u05b1\3\2"+
		"\2\2\u05f6\u05b2\3\2\2\2\u05f6\u05b3\3\2\2\2\u05f6\u05b4\3\2\2\2\u05f6"+
		"\u05b5\3\2\2\2\u05f6\u05b6\3\2\2\2\u05f6\u05b7\3\2\2\2\u05f6\u05b8\3\2"+
		"\2\2\u05f6\u05b9\3\2\2\2\u05f6\u05ba\3\2\2\2\u05f6\u05bb\3\2\2\2\u05f6"+
		"\u05bc\3\2\2\2\u05f6\u05bd\3\2\2\2\u05f6\u05be\3\2\2\2\u05f6\u05bf\3\2"+
		"\2\2\u05f6\u05c0\3\2\2\2\u05f6\u05c1\3\2\2\2\u05f6\u05c2\3\2\2\2\u05f6"+
		"\u05c3\3\2\2\2\u05f6\u05c4\3\2\2\2\u05f6\u05c5\3\2\2\2\u05f6\u05c6\3\2"+
		"\2\2\u05f6\u05c7\3\2\2\2\u05f6\u05c8\3\2\2\2\u05f6\u05c9\3\2\2\2\u05f6"+
		"\u05ca\3\2\2\2\u05f6\u05cb\3\2\2\2\u05f6\u05cc\3\2\2\2\u05f6\u05cd\3\2"+
		"\2\2\u05f6\u05ce\3\2\2\2\u05f6\u05cf\3\2\2\2\u05f6\u05d0\3\2\2\2\u05f6"+
		"\u05d1\3\2\2\2\u05f6\u05d2\3\2\2\2\u05f6\u05d3\3\2\2\2\u05f6\u05d4\3\2"+
		"\2\2\u05f6\u05d5\3\2\2\2\u05f6\u05d6\3\2\2\2\u05f6\u05d7\3\2\2\2\u05f6"+
		"\u05d8\3\2\2\2\u05f6\u05d9\3\2\2\2\u05f6\u05da\3\2\2\2\u05f6\u05db\3\2"+
		"\2\2\u05f6\u05dc\3\2\2\2\u05f6\u05dd\3\2\2\2\u05f6\u05de\3\2\2\2\u05f6"+
		"\u05df\3\2\2\2\u05f6\u05e0\3\2\2\2\u05f6\u05e1\3\2\2\2\u05f6\u05e2\3\2"+
		"\2\2\u05f6\u05e3\3\2\2\2\u05f6\u05e4\3\2\2\2\u05f6\u05e5\3\2\2\2\u05f6"+
		"\u05e6\3\2\2\2\u05f6\u05e7\3\2\2\2\u05f6\u05e8\3\2\2\2\u05f6\u05e9\3\2"+
		"\2\2\u05f6\u05ea\3\2\2\2\u05f6\u05eb\3\2\2\2\u05f6\u05ec\3\2\2\2\u05f6"+
		"\u05ed\3\2\2\2\u05f6\u05ee\3\2\2\2\u05f6\u05ef\3\2\2\2\u05f6\u05f0\3\2"+
		"\2\2\u05f6\u05f1\3\2\2\2\u05f6\u05f2\3\2\2\2\u05f6\u05f3\3\2\2\2\u05f6"+
		"\u05f4\3\2\2\2\u05f6\u05f5\3\2\2\2\u05f7y\3\2\2\2\u05f8\u05f9\t\25\2\2"+
		"\u05f9{\3\2\2\2\u05fa\u05fd\7\r\2\2\u05fb\u05fc\7\u00ca\2\2\u05fc\u05fe"+
		"\5r:\2\u05fd\u05fb\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\7\16\2\2\u0602}\3\2\2\2"+
		"\u00af\u0091\u0096\u009c\u00a0\u00ae\u00b3\u00b9\u00bc\u00c3\u00cc\u00d2"+
		"\u00dd\u0100\u0107\u0110\u012c\u0137\u0142\u0145\u014f\u0154\u0158\u0160"+
		"\u0166\u016d\u0172\u0176\u017e\u0186\u018b\u019a\u019e\u01a4\u01a8\u01ae"+
		"\u01cc\u01cf\u01d3\u01d7\u01df\u01e8\u01eb\u01ef\u0201\u0204\u020c\u020f"+
		"\u0215\u021c\u0221\u022a\u0232\u0243\u0246\u024a\u0252\u0258\u025b\u025d"+
		"\u0269\u0270\u0274\u0278\u027c\u0283\u028c\u028f\u0293\u0298\u029c\u029f"+
		"\u02a6\u02b1\u02b4\u02be\u02c1\u02cc\u02d1\u02d9\u02dc\u02e0\u02e8\u02eb"+
		"\u02ef\u02f3\u02fe\u0301\u0308\u031b\u031f\u0323\u0327\u032b\u032f\u0331"+
		"\u033c\u0341\u034a\u0350\u0354\u0356\u035e\u036f\u0375\u037b\u0383\u038b"+
		"\u038d\u0392\u039e\u03a6\u03af\u03b5\u03bd\u03c3\u03c7\u03cc\u03d1\u03d7"+
		"\u03e5\u03e7\u0404\u0410\u041a\u041d\u0422\u0429\u042c\u0430\u0433\u043f"+
		"\u0454\u0458\u0460\u0464\u047d\u0480\u0489\u048f\u0495\u049b\u04a4\u04ad"+
		"\u04b8\u04c2\u04c4\u04cd\u04d7\u04dd\u04f8\u0504\u0509\u050b\u0511\u0516"+
		"\u051c\u0532\u0535\u053e\u0541\u0544\u0558\u0563\u0569\u0570\u0579\u0580"+
		"\u0586\u058d\u0595\u059b\u05f6\u05ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
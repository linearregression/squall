/* Generated By:JavaCC: Do not edit this line. SchemaParserConstants.java */
/** Schema + cardinality information extractor. */
package sql.schema.parser;

/**
 * Token literal values and constants. Generated by
 * org.javacc.parser.OtherFilesGen#start()
 */
public interface SchemaParserConstants {

	/** End of File. */
	int EOF = 0;
	/** RegularExpression Id. */
	int LPAREN = 5;
	/** RegularExpression Id. */
	int RPAREN = 6;
	/** RegularExpression Id. */
	int LSQUARE = 7;
	/** RegularExpression Id. */
	int RSQUARE = 8;
	/** RegularExpression Id. */
	int TABLE_DELIM = 9;
	/** RegularExpression Id. */
	int COL_DELIM = 10;
	/** RegularExpression Id. */
	int EQ = 11;
	/** RegularExpression Id. */
	int SCALLED = 12;
	/** RegularExpression Id. */
	int MAXVAL = 13;
	/** RegularExpression Id. */
	int MINVAL = 14;
	/** RegularExpression Id. */
	int TABLE = 15;
	/** RegularExpression Id. */
	int DISTINCTVAL = 16;
	/** RegularExpression Id. */
	int TYPE = 17;
	/** RegularExpression Id. */
	int LONG_NUM = 18;
	/** RegularExpression Id. */
	int ID = 19;
	/** RegularExpression Id. */
	int STR = 20;

	/** Lexical state. */
	int DEFAULT = 0;

	/** Literal token values. */
	String[] tokenImage = { "<EOF>", "\" \"", "\"\\t\"", "\"\\n\"", "\"\\r\"", "\"(\"", "\")\"",
			"\"[\"", "\"]\"", "\";\"", "\",\"", "\"=\"", "\":S\"", "\"MAX\"", "\"MIN\"",
			"\"TABLE\"", "\"DISTINCT\"", "<TYPE>", "<LONG_NUM>", "<ID>", "<STR>", };

}

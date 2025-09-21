package plugin.common.parser.scanner;

import java.util.List;

import org.eclipse.cdt.core.parser.IToken;
import org.eclipse.cdt.internal.core.parser.scanner.TokenUtil;
import org.eclipse.cdt.internal.core.parser.scanner.TokenWithImage;

/**
 * Utility class for tokens.
 */
@SuppressWarnings("restriction")
public class PluginTokenUtil {

	private PluginTokenUtil() {
	}

	public static IToken createIdentifierToken(PluginScanner scanner, IToken createFrom, String name) {
		return new TokenWithImage(IToken.tIDENTIFIER, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				name.toCharArray());
	}

	public static IToken createStructToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.t_struct, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.t_struct));
	}

	public static IToken createAssignToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.tASSIGN, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.tASSIGN));
	}

	public static IToken createSemiToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.tSEMI, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.tSEMI));
	}

	public static IToken createLiteralToken(PluginScanner scanner, IToken createFrom, String value) {
		return new TokenWithImage(IToken.tSTRING, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				value.toCharArray());
	}

	public static IToken createIntegerToken(PluginScanner scanner, IToken createFrom, String value) {
		return new TokenWithImage(IToken.tINTEGER, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				value.toCharArray());
	}

	public static IToken createLBraceToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.tLBRACE, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.tLBRACE));
	}

	public static IToken createRBraceToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.tRBRACE, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.tRBRACE));
	}

	public static IToken createTypedefToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.t_typedef, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.t_typedef));
	}

	public static IToken createDotToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.tDOT, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.tDOT));
	}

	public static IToken createUnsignedToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.t_unsigned, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.t_unsigned));
	}

	public static IToken createCharToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.t_char, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.t_char));
	}

	public static IToken createShortToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.t_short, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.t_short));
	}

	public static IToken createIntToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.t_int, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.t_int));
	}

	public static IToken createLongToken(PluginScanner scanner, IToken createFrom) {
		return new TokenWithImage(IToken.t_long, scanner, createFrom.getOffset(), createFrom.getEndOffset(),
				TokenUtil.getImage(IToken.t_long));
	}

	public static void addSqlcaTokens(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createStructToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlca"));
		scanner.tokens().add(createLBraceToken(scanner, createFrom));
		addSqlcaSqlcaid(scanner, createFrom);
		addSqlcaSqlabc(scanner, createFrom);
		addSqlcaSqlcode(scanner, createFrom);
		addSqlcaSqlerrml(scanner, createFrom);
		addSqlcaSqlerrmc(scanner, createFrom);
		addSqlcaSqlerrp(scanner, createFrom);
		addSqlcaSqlerrd(scanner, createFrom);
		addSqlcaSqlwarn(scanner, createFrom);
		addSqlcaSqlstate(scanner, createFrom);
		scanner.tokens().add(createRBraceToken(scanner, createFrom));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addSqlcaTokensEcpg(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createStructToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlca"));
		scanner.tokens().add(createLBraceToken(scanner, createFrom));
		addSqlcaSqlcaid(scanner, createFrom);
		addSqlcaSqlabc(scanner, createFrom);
		addSqlcaSqlcode(scanner, createFrom);
		addSqlcaSqlerrmEcpg(scanner, createFrom);
		addSqlcaSqlerrd(scanner, createFrom);
		addSqlcaSqlwarn(scanner, createFrom);
		addSqlcaSqlstate(scanner, createFrom);
		scanner.tokens().add(createRBraceToken(scanner, createFrom));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addSqlcaTokensProc(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createStructToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlca"));
		scanner.tokens().add(createLBraceToken(scanner, createFrom));
		addSqlcaSqlcaid(scanner, createFrom);
		addSqlcaSqlabc(scanner, createFrom);
		addSqlcaSqlcode(scanner, createFrom);
		addSqlcaSqlerrmProc(scanner, createFrom);
		addSqlcaSqlerrp(scanner, createFrom);
		addSqlcaSqlerrd(scanner, createFrom);
		addSqlcaSqlwarn(scanner, createFrom);
		addSqlcaSqlExt(scanner, createFrom);
		scanner.tokens().add(createRBraceToken(scanner, createFrom));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlcaid(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlcaid"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlabc(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createLongToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlabc"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlcode(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createLongToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlcode"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlerrml(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createLongToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrml"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlerrmlUnSignedShort(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createUnsignedToken(scanner, createFrom));
		scanner.tokens().add(createShortToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrml"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlerrmc(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrmc"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addSqlcaSqlerrmEcpg(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createStructToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrm"));
		scanner.tokens().add(createLBraceToken(scanner, createFrom));
		addSqlcaSqlerrml(scanner, createFrom);
		addSqlcaSqlerrmc(scanner, createFrom);
		scanner.tokens().add(createRBraceToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrm"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addSqlcaSqlerrmProc(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createStructToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrm"));
		scanner.tokens().add(createLBraceToken(scanner, createFrom));
		addSqlcaSqlerrmlUnSignedShort(scanner, createFrom);
		addSqlcaSqlerrmc(scanner, createFrom);
		scanner.tokens().add(createRBraceToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrm"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlerrp(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrp"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlerrd(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createLongToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlerrd"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlwarn(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlwarn"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlExt(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlext"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlcaSqlstate(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlstate"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addTypeDefs(PluginScanner scanner, IToken createFrom) {
		addSqlint8(scanner, createFrom);
		addSqluint8(scanner, createFrom);
		addSqlint16(scanner, createFrom);
		addSqluint16(scanner, createFrom);
		addSqlint32(scanner, createFrom);
		addSqluint32(scanner, createFrom);
		addSqlint64(scanner, createFrom);
		addSqluint64(scanner, createFrom);
	}

	private static void addSqlint8(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlint8"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqluint8(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createUnsignedToken(scanner, createFrom));
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqluint8"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlint16(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createShortToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlint16"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqluint16(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createUnsignedToken(scanner, createFrom));
		scanner.tokens().add(createShortToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqluint16"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlint32(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createIntToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlint32"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqluint32(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createUnsignedToken(scanner, createFrom));
		scanner.tokens().add(createIntToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqluint32"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqlint64(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createLongToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqlint64"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	private static void addSqluint64(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createTypedefToken(scanner, createFrom));
		scanner.tokens().add(createUnsignedToken(scanner, createFrom));
		scanner.tokens().add(createLongToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "sqluint64"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addSqlcaStructTokens(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(PluginTokenUtil.createStructToken(scanner, createFrom));
		scanner.tokens().add(PluginTokenUtil.createIdentifierToken(scanner, createFrom, "sqlca"));
		scanner.tokens().add(PluginTokenUtil.createIdentifierToken(scanner, createFrom, "sqlca"));
		scanner.tokens().add(PluginTokenUtil.createSemiToken(scanner, createFrom));
	}

	public static void addSqlStateTokens(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createCharToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "SQLSTATE"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addSqlCodeTokens(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(createLongToken(scanner, createFrom));
		scanner.tokens().add(createIdentifierToken(scanner, createFrom, "SQLCODE"));
		scanner.tokens().add(createSemiToken(scanner, createFrom));
	}

	public static void addAssignLiteralTokens(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(PluginTokenUtil.createAssignToken(scanner, createFrom));
		scanner.tokens().add(PluginTokenUtil.createLiteralToken(scanner, createFrom, ""));
		scanner.tokens().add(PluginTokenUtil.createSemiToken(scanner, createFrom));
	}

	public static void addAssignIntegerTokens(PluginScanner scanner, IToken createFrom) {
		scanner.tokens().add(PluginTokenUtil.createAssignToken(scanner, createFrom));
		scanner.tokens().add(PluginTokenUtil.createIntegerToken(scanner, createFrom, "0"));
		scanner.tokens().add(PluginTokenUtil.createSemiToken(scanner, createFrom));
	}

	public static boolean inPosition(List<ExecSqlPosition> execSqlPositions, int pos) {
		for (ExecSqlPosition execSqlPosition : execSqlPositions) {
			if (execSqlPosition.getFrom() <= pos && (execSqlPosition.getTo() - 2) >= pos) {
				return true;
			}
		}
		return false;
	}
}

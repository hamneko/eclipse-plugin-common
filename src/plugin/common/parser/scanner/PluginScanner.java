package plugin.common.parser.scanner;

import java.util.ArrayDeque;
import java.util.Queue;

import org.eclipse.cdt.core.dom.parser.IScannerExtensionConfiguration;
import org.eclipse.cdt.core.parser.FileContent;
import org.eclipse.cdt.core.parser.IParserLogService;
import org.eclipse.cdt.core.parser.IScannerInfo;
import org.eclipse.cdt.core.parser.IToken;
import org.eclipse.cdt.core.parser.IncludeFileContentProvider;
import org.eclipse.cdt.core.parser.ParserLanguage;
import org.eclipse.cdt.internal.core.parser.scanner.CPreprocessor;

@SuppressWarnings("restriction")
public class PluginScanner extends CPreprocessor {

	/*
	 * Inner Queue for token manipulation.
	 */
	private Queue<IToken> tokens = new ArrayDeque<>();

	public PluginScanner(FileContent fileContent, IScannerInfo info, ParserLanguage language, IParserLogService log,
			IScannerExtensionConfiguration configuration, IncludeFileContentProvider readerFactory) {
		super(fileContent, info, language, log, configuration, readerFactory);
	}

	public Queue<IToken> tokens() {
		return tokens;
	}

	public IToken clearPrefetchedToken(IToken token) {
		if (token.getNext() != null) {
			token.setNext(null);
		}
		return token;
	}
}

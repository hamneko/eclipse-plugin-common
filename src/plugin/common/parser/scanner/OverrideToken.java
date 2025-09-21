package plugin.common.parser.scanner;

import org.eclipse.cdt.core.parser.IToken;

/**
 * Alternative token class to use in place of the actual token class.
 */
public class OverrideToken implements IToken {

	private int type;

	private String image;

	private char[] charImage;

	private int offset;

	private int length;

	private int endOffset;

	private IToken next;

	private boolean operator;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public char[] getCharImage() {
		return charImage;
	}

	public void setCharImage(char[] charImage) {
		this.charImage = charImage;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getEndOffset() {
		return endOffset;
	}

	public void setEndOffset(int endOffset) {
		this.endOffset = endOffset;
	}

	public IToken getNext() {
		return next;
	}

	public void setNext(IToken next) {
		this.next = next;
	}

	public boolean isOperator() {
		return operator;
	}

	public void setOperator(boolean operator) {
		this.operator = operator;
	}

}

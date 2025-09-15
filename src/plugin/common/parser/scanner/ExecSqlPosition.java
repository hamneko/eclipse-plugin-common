package plugin.common.parser.scanner;

public class ExecSqlPosition {
	int from;
	int to;

	public ExecSqlPosition(int from, int to) {
		this.from = from;
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	@Override
	public String toString() {
		return from + ":" + to;
	}

}

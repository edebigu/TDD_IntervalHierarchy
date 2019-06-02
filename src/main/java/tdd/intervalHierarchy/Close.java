package tdd.intervalHierarchy;

public class Close extends Kind implements KindVisitor{

	@Override
	public boolean includes(Kind kind) {
		return kind.accept(this);
	}

	@Override
	public boolean accept(KindVisitor kindVisitor) {
		return kindVisitor.visit(this);
	}

	public boolean visit(Open open) {
		return false;
	}

	public boolean visit(Close close) {
		return true;
	}

}

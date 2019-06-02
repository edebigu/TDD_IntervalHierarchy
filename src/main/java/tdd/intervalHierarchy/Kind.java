package tdd.intervalHierarchy;

public abstract class Kind {

	public abstract boolean includes(Kind kind);
	
	public abstract boolean accept(KindVisitor kindVisitor);

}

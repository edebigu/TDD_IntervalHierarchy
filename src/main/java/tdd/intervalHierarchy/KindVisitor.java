package tdd.intervalHierarchy;

public interface KindVisitor {
	
	boolean visit(Open open);
	
	boolean visit(Close close);

}

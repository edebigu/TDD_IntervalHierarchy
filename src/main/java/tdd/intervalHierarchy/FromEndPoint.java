package tdd.intervalHierarchy;

public class FromEndPoint extends EndPoint{

	public FromEndPoint(double value, Kind kind) {
		super(value, kind);
	}
	
	@Override
	public boolean isIncluded (EndPoint another)
	{		
	
		if (this.getValue() < another.getValue()) {
			return true;
		}
		if (this.getValue() == another.getValue())
		{
			return this.getKind().includes(another.getKind());
		}
		return false;
		
	}



}

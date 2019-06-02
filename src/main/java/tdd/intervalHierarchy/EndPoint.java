package tdd.intervalHierarchy;

public abstract class EndPoint {
	
	protected double value;
	
	protected Kind kind;

	public EndPoint(double value, Kind kind) {
		this.value = value;
		this.kind = kind;
	}
	
	public abstract boolean isIncluded(EndPoint endPoint);

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
	
	
	

}

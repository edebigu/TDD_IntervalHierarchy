package tdd.intervalHierarchy.Builders;
import tdd.intervalHierarchy.UntilEndPoint;

public class UntilEndPointBuilder {
	
	private double value; 
	boolean closedPoint;
	
	public UntilEndPointBuilder() {
		this.value = 4;
		this.closedPoint = false;
	}
	
	public UntilEndPointBuilder untilEndPointClosed(double value)
	{
		this.value = value;
		this.closedPoint = true;
		return this;
	}
	
	public UntilEndPointBuilder untilEndPointOpened(double value)
	{
		this.value = value;
		this.closedPoint = false;
		return this;
	}
	
	public UntilEndPoint build() {
		return new UntilEndPoint(this.value, this.closedPoint);
	}

}

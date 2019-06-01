package tdd.intervalHierarchy.Builders;

import tdd.intervalHierarchy.FromEndPoint;

public class FromEndPointBuilder {
	
	private double value; 
	boolean closedPoint;
	
	public FromEndPointBuilder() {
		this.value = 4;
		this.closedPoint = false;
	}

	public FromEndPointBuilder fromEndPointClosed(double value)
	{
		this.value = value;
		this.closedPoint = true;
		return this;
	}
	
	public FromEndPointBuilder fromEndPointOpened(double value)
	{
		this.value = value;
		this.closedPoint = false;
		return this;
	}
	
	public FromEndPoint build() {
		return new FromEndPoint(this.value, this.closedPoint);
	}

}

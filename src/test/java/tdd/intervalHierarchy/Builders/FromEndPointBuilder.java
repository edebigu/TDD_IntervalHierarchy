package tdd.intervalHierarchy.Builders;

import java.nio.file.WatchEvent.Kind;

import tdd.intervalHierarchy.Close;
import tdd.intervalHierarchy.FromEndPoint;
import tdd.intervalHierarchy.Open;

public class FromEndPointBuilder {
	
	private double value;
	private boolean closed;
	
	public FromEndPointBuilder() {
		this.value = 4;
		this.closed = true;
	}
	
	public FromEndPointBuilder fromEndPoint(double value)
	{
		this.value = value;
		this.closed = false;
		return this;
	}
	
	public FromEndPointBuilder fromEndPointIncluded(double value)
	{
		this.value = value;
		this.closed = true;
		return this;
	}
	
	public FromEndPoint build() {
		if (this.closed)
		{
			return new FromEndPoint(this.value, new Close());
		}
		else {
			return new FromEndPoint(this.value, new Open());
		}
		
	}

}

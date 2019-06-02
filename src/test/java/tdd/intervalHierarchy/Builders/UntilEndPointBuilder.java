package tdd.intervalHierarchy.Builders;
import tdd.intervalHierarchy.Close;
import tdd.intervalHierarchy.FromEndPoint;
import tdd.intervalHierarchy.Open;
import tdd.intervalHierarchy.UntilEndPoint;

public class UntilEndPointBuilder {
	
	private double value;
	private boolean closed;
	
	public UntilEndPointBuilder() {
		this.value = 4;
		this.closed = true;
	}
	
	public UntilEndPointBuilder untilEndPoint(double value)
	{
		this.value = value;
		this.closed = false;
		return this;
	}
	
	public UntilEndPointBuilder untilEndPointIncluded(double value)
	{
		this.value = value;
		this.closed = true;
		return this;
	}
	
	public UntilEndPoint build() {
		if (this.closed)
		{
			return new UntilEndPoint(this.value, new Close());
		}
		else {
			return new UntilEndPoint(this.value, new Open());
		}
	}

}

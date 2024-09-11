
public class Rectangle {
	private double width; 
	private double length;
	public Rectangle() {}
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public void setLength(double len)
	{
		length = len;
	}
	public double getWidth()
	{ return width;
	}
	public double getLength()
	{ return length;
	}
	public double getArea()
	{ return width*length;
	}
	}



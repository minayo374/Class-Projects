
public abstract class GeometrigFigure implements SideObject{
	private int hight;
	private int width;
	private String type;
	GeometrigFigure(){}
	GeometrigFigure(int h, int w, String t){
		hight = h;
		width = w;
		type = t;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public abstract double getArea();
	public abstract void ShowType();
	public void DisplaySides() {}
}

package Package.renchao;

public class CircleV3 {
	private double radius;
	
	private double perimeter;
	
	private double area;
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		if(radius<=0)
			radius=0;
		this.radius=radius;
	}

	public double getPerimeter() {
		perimeter=2*Math.PI*radius;
		return perimeter;
	}

//	public void setPerimeter(double perimeter) {
//		this.perimeter = perimeter;
//	}

	public double getArea() {
		area=Math.PI;				
		return area;
	}

//	public void setArea(double area) {
//		this.area = area;
//	}
	
	
	
}

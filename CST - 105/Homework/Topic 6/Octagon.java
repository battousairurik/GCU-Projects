
public class Octagon extends GeometricObject 
implements Comparable<Octagon>, Cloneable
{
	protected Octagon (double side){
		this.side = side;
	}
	private double area;
	private double side;
	@Override
	public double getArea(){
		area = (2 + (4 / Math.sqrt(2)) * side * side);
		return area;
	}
	@Override
	public double getPerimeter(){
		return 0;
	}
	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object clone() throws CloneNotSupportedException{  
		return super.clone();  
	}  
}

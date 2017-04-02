
public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Octagon shape1 = new Octagon(5);
		System.out.println("Area is: " + shape1.getArea());
		Octagon shape2 = (Octagon)shape1.clone();
		System.out.println("The original compared to it's clone: " + shape1.compareTo(shape2));
	}

}


public class TestCourse {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		Course course1 = new Course("Biology");
		course1.addStudent("Billy");
		course1.addStudent("Joe");
		course1.printStudents();
		Course course2 = (Course) course1.clone();
		course2.addStudent("Jimmy");
		course1.printStudents();
		course2.printStudents();
		//Deep Clone Success
	}

}

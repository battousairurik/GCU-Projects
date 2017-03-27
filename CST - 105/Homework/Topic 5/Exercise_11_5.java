import java.util.ArrayList;

public class Exercise_11_5 {

	private String courseName;
	
	ArrayList<String> students = new ArrayList<String>();
	
	public void addStudent(String name){
		students.add(name);
	}
	public void removeStudent(String name){
		students.remove(name);
	}
	public void setCourse(String course){
		courseName = course;
	}
	public String getCourse(){
		return courseName;
	}
	public String getStudents(int num){
		return students.get(num);
	}
	public int getNumberOfStudents(){
		return students.size();
	}
	
}

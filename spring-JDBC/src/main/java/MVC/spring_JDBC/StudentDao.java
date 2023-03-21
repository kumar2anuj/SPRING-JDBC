package MVC.spring_JDBC;

import java.util.List;

public interface StudentDao 
{
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int studentID);
	
	public Student getStudent(int studentID);
	
	public List<Student> getAllStudents();
}

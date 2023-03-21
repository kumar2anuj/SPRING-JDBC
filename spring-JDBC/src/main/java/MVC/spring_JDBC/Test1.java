package MVC.spring_JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 
{
	public static void main(String[] args)
	{
//		 ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		   
		 ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);

		 
		 StudentDao studentDao= context.getBean("studentDao",StudentDao.class);
	
//	Student student=new Student();
//	student.setId(10);
//	student.setName("shyam");
//	student.setCity("lucknow");
//	
//	int result=studentDao.insert(student);
//	System.out.println("data added "+ result);
		 
		 
//	Student student=new Student();
//	student.setId(10);
//	student.setName("sabjeev");
//	student.setCity("jaipur");
//	
//	int result=studentDao.change(student);
//	System.out.println("data added "+ result);
		 
//	int result=studentDao.delete(10);	 
//	System.out.println("delete is "+ result);
		 
//	Student student=studentDao.getStudent(456);
//	System.out.println(student);
		 
	List<Student> students=studentDao.getAllStudents();
	for(Student s:students)
	{
		System.out.println(s);
	}
		 
		 
	}
}

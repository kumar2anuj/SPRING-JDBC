package MVC.spring_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
    
    
    String query="insert into student(id,name,city) values(?,?,?)";
    int result=template.update(query,456 ,"anuj kumar","kanpur");
    System.out.println("no of record added is :"+result);
    
    }
}

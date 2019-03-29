package Spak;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Springcore 
{

	public static void main(String[] args) {
		/*Resource rs=new ClassPathResource("Appli_context.xml");
		BeanFactory bf=new XmlBeanFactory(rs);*/
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Appli_context.xml");
		
		Employee emp=(Employee)ap.getBean("employee");
      	System.out.println(emp.getName());
     	System.out.println(emp.getAddress().getCity());
     	System.out.println(emp.getName1());
     	System.out.println(emp.getAddress().getState());

	
	    /*Employee emp1=(Employee)ap.getBean("employee1");
	    System.out.println(emp1.getName());
	    System.out.println(emp1.getAddress().getCity());*/
	
	

	
		
	}	
	
}

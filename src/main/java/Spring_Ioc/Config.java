package Spring_Ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Config {
	    public static void main(String[] args) {
	        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	        MyBean my = (MyBean) context.getBean(MyBean.class);
	        my.disp();
	        
	    }
	}

//@Configuration
//@ComponentScan(basePackages = "Spring_Ioc")
//class Appconfig {
//	
//}


			


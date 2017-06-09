package freedom.trade.user;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDAOApplication {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext application = 
				new ClassPathXmlApplicationContext("application.xml");
		
		application.start();
		
		
		System.in.read();
		
	}
}

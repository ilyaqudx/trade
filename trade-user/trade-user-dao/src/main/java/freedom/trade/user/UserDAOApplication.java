package freedom.trade.user;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import freedom.trade.user.dao.UserDAO;
import freedom.trade.user.pojo.User;

public class UserDAOApplication {

	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext application = 
				new ClassPathXmlApplicationContext("spring/application.xml");
		
		application.start();
		
		UserDAO userDAO = application.getBean(UserDAO.class);
		
		User user = userDAO.get(1431L);
		
		System.out.println(user);
		
		System.in.read();
		
	}
}

package freedom.trade.user.biz;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import freedom.trade.user.pojo.User;

public class UserBizApplication {

	public static void main(String[] args) throws IOException {
		
		
		ClassPathXmlApplicationContext application = 
				new ClassPathXmlApplicationContext("spring/application.xml");
		
		UserService userService = application.getBean(UserService.class);
		
		User user = userService.get(1493L);
		
		System.out.println(user);
		
		System.in.read();
	}
}

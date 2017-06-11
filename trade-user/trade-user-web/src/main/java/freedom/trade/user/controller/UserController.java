package freedom.trade.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import freedom.trade.user.biz.UserService;
import freedom.trade.user.pojo.User;

@Controller
@RequestMapping("/product")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "get/{id}",produces = "application/json;charset=utf-8")
	public User get(@PathVariable Long id)
	{
		return userService.get(id);
	}
	
	
	@RequestMapping(value = "{id}")
	public String detail(@PathVariable Long id)
	{
		System.out.println("id" + id);
		return "detail";
	}
}

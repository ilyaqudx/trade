package freedom.trade.user.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import freedom.trade.user.dao.UserDAO;
import freedom.trade.user.pojo.User;

//rest:1 @Path("users")
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	/*rest:2
	 * 以rest方式调用接口: http://ip:port/users/path  返回此处定义的类型是application/json
	 * 
	 * rest:3
	 * 	在provider.xml中将发布的服务协议改为rest
	@GET
	@Path("{id}")
	@Produces({ContentType.APPLICATION_JSON_UTF_8})
	@Override
	public User getByRest(@PathParam("id")Long id) 
	{
		return userDAO.get(id);
	}*/
	
	public User get(Long id)
	{
		return userDAO.get(id);
	}
}

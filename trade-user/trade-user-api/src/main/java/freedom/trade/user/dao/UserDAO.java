package freedom.trade.user.dao;

import freedom.trade.user.pojo.User;

public interface UserDAO {

	public User get(Long id);
	
	public User getByName(String name);
}

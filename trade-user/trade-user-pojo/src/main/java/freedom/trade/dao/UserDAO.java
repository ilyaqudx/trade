package freedom.trade.dao;

import freedom.trade.pojo.User;

public interface UserDAO {

	public User get(Long id);
	
	public User getByName(String name);
}

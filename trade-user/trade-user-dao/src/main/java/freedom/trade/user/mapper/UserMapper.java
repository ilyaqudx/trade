package freedom.trade.user.mapper;

import freedom.trade.pojo.User;

public interface UserMapper {

	User get(Long id);

	User getByName(String name);
}

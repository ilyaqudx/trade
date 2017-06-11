package freedom.trade.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import freedom.trade.user.pojo.User;

@Mapper
public interface UserMapper {

	@Select("select * from User where id = #{9999}")
	User get(Long id);

	User getByName(String name);
}

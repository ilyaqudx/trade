package freedom.trade.user.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import freedom.trade.dao.UserDAO;
import freedom.trade.pojo.User;
import freedom.trade.user.mapper.UserMapper;

public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {

	@Resource
	private SqlSessionFactoryBean sqlSessionFactory;
	
	@Override
	public User get(Long id) {
		return getSqlSession().getMapper(UserMapper.class).get(id);
	}

	@Override
	public User getByName(String name) {
		return getSqlSession().getMapper(UserMapper.class).getByName(name);
	}

}

package freedom.trade.user.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import freedom.trade.user.mapper.UserMapper;
import freedom.trade.user.pojo.User;
@Repository("userDAO")
public class UserDAOImpl extends SqlSessionDaoSupport implements UserDAO {

	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	@Override
	public User get(Long id) {
		return getSqlSession().getMapper(UserMapper.class).get(id);
	}

	@Override
	public User getByName(String name) {
		return getSqlSession().getMapper(UserMapper.class).getByName(name);
	}

}

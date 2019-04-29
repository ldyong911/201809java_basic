package j_project.dao;

import java.util.ArrayList;

import j_project.vo.Database;
import j_project.vo.UserVO;

public class UserDaoImpl implements UserDao {

	@Override
	public UserVO selectUser(String key, String value) {
		for(int i=0; i < Database.tb_user.size(); i++){
			UserVO user = Database.tb_user.get(i);
			
			if(key.equals("ID")){
				if(user.getId().equals(value)){
					return user;
				}
			}
		}
		return null;
	}

	@Override
	public void insertUser(UserVO user) {
		Database.tb_user.add(user);
	}
	
	@Override
	public ArrayList<UserVO> selectUserList() {
		return Database.tb_user;
	}

}

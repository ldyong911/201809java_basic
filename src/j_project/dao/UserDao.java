package j_project.dao;

import j_project.vo.UserVO;

import java.util.ArrayList;

public interface UserDao {
	UserVO selectUser(String key, String value);

	void insertUser(UserVO user);

	ArrayList<UserVO> selectUserList();
	
}
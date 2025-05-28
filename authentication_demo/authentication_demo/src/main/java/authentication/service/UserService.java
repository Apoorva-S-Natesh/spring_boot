package authentication.service;

import authentication.entities.Users;

public interface UserService {
	void signUp(Users user);
	
	boolean usernameExist(String username);
	
	Users getUser(String username);
}

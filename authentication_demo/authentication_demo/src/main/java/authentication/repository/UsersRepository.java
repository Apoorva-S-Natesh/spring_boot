package authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import authentication.entities.Users;

public interface UsersRepository
	extends JpaRepository<Users, Integer>{
	Users findByUsername(String username);
}

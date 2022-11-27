package net.javaguides.springbootapiregister.repository;

import net.javaguides.springbootapiregister.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT p FROM User p WHERE " +
            "p.userName LIKE CONCAT('%',:query, '%')" +
            "Or p.fullName LIKE CONCAT('%', :query, '%')")
    List<User> searchUsers(String query);

//    @Query(value = "SELECT p FROM users p WHERE " +
//            "p.userName LIKE CONCAT('%',:query, '%')" +
//            "Or p.fullName LIKE CONCAT('%', :query, '%')", nativeQuery = true)
//    List<User> searchUsersMySQL(String query);
}

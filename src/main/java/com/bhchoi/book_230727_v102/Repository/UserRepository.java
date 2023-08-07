package com.bhchoi.book_230727_v102.Repository;

import com.bhchoi.book_230727_v102.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

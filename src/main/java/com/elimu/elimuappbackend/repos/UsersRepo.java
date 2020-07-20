package com.elimu.elimuappbackend.repos;

import com.elimu.elimuappbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<User, String> {
}

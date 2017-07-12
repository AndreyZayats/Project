package ru.itpark.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.models.User;

import java.util.List;

public interface UsersDao extends JpaRepository<User, Integer> {
    List<User> findAll();
}

package com.example.cideback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cideback.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.example.cideback.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cideback.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}

package com.example.cideback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cideback.model.Board;
import com.example.cideback.service.BoardService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class BoardController {
    @Autowired
    private BoardService boardService;

    // get all board
    @GetMapping("/board")
    public List<Board> getAllBoards() {
        System.out.print("ffffffffffff");
        //System.out.println("user : ",user);
        return boardService.getAllBoard();
    }

    // create board
//    @PostMapping("/board")
//    public Board createBoard(@RequestBody Board board) {
//        return boardService.createBoard(board);
//    }
}

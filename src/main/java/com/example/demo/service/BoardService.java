package com.example.demo.service;

import com.example.demo.entity.BoardEntity;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public Long boardWrite(BoardEntity board){
        return boardRepository.save(board).getIdx();
    }

    public List<BoardEntity> boardList(){
        return boardRepository.findAll();
    }

    public Optional<BoardEntity> boardDetail(Long idx){
        return boardRepository.findById(idx);
    }
}

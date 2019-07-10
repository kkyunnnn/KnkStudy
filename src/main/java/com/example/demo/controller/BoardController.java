package com.example.demo.controller;

import com.example.demo.entity.BoardEntity;
import com.example.demo.entity.ResultEntity;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "/Board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/Write", method = RequestMethod.POST)
    @ResponseBody
    public ResultEntity BoardWrite(@RequestParam Map param){
        ResultEntity _result = new ResultEntity();
        BoardEntity _board = new BoardEntity();

        _board.setTitle(param.get("title").toString());
        _board.setContents(param.get("contents").toString());

        if(boardService.boardWrite(_board) < 0){
            _result.setResultCode(-1);
        }

        return _result;
    }

    @RequestMapping(value = "/List", method = RequestMethod.POST)
    @ResponseBody
    public List<BoardEntity> BoardList(){
       return boardService.boardList();
    }

    @RequestMapping(value = "/Detail", method = RequestMethod.POST)
    @ResponseBody
    public Optional<BoardEntity> BoardDetail(@RequestParam Map param){
        return boardService.boardDetail(Long.parseLong(param.get("idx").toString()));
    }
}

package BoadStudy.board.service;

import BoadStudy.board.entity.Board;
import BoadStudy.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    //글작성
    public void write(Board board){
        boardRepository.save(board);
    }

    //게시글 리스트 처리
    public List<Board> boardList(){
        return boardRepository.findAll();
    }

    //특정 게시글 불러오기
     public Board boardView(Integer id){
        return  boardRepository.findById(id).get();
     }

     public void boardDelete(Integer id){
        boardRepository.deleteById(id);
     }




}

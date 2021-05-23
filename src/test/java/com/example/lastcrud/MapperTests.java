package com.example.lastcrud;

import com.example.lastcrud.domain.BoardDTO;
import com.example.lastcrud.mapper.BoardMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTests {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void insert() {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setTitle( "1 test" );
        boardDTO.setContent( "1 test content" );
        boardDTO.setWriter( "tester" );

        int result = boardMapper.insertBoard( boardDTO );
        System.out.println( result + ": result" );
    }
}

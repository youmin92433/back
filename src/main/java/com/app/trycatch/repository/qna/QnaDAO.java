package com.app.trycatch.repository.qna;

import com.app.trycatch.mapper.qna.QnaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class QnaDAO {
    private final QnaMapper qnaMapper;




}

package com.app.trycatch.mapper.qna;

import com.app.trycatch.domain.qna.QnaVO;
import com.app.trycatch.dto.qna.QnaDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QnaMapper {
    public void insert(QnaDTO qnaDTO);
    QnaDTO selectById(Long id);
    List<QnaDTO> selectAll();
}

package com.app.trycatch.mapper.skilllog;

import com.app.trycatch.domain.skilllog.SkillLogFileVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SkillLogFileMapper {
    public void insert(SkillLogFileVO skillLogFileVO);
}

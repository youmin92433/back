package com.app.trycatch.service.qna;

import com.app.trycatch.domain.qna.QnaVO;
import com.app.trycatch.dto.qna.QnaDTO;
import com.app.trycatch.mapper.qna.QnaMapper;
import com.app.trycatch.repository.qna.QnaDAO;
import com.app.trycatch.repository.skilllog.TagDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class QnaService {
    private final QnaMapper qnaMapper;
    private final QnaDAO  qnaDAO;

//    private final FileDAO fileDAO;
//    private final PostFileDAO postFileDAO;

    //    추가
    public void write(QnaDTO  qnaDTO, ArrayList<MultipartFile> multipartFiles) {
//        String rootPath = "C:/file/";
//        String todayPath = getTodayPath();
//        String path = rootPath + todayPath;

//        FileDTO fileDTO = new FileDTO();
//        PostFileDTO postFileDTO = new PostFileDTO();

//        qnaDAO.save(qnaDTO);
//        qnaDTO.getTags().forEach(tagDTO -> {
//            tagDTO.setPostId(qnaDTO.getId());
//            tagDAO.save(tagDTO.toVO());
//        });
//        postFileDTO.setPostId(qnaDTO.getId());
//        multipartFiles.forEach(multipartFile -> {
//            if(multipartFile.getOriginalFilename().isEmpty()){
//                return;
//            }
//            UUID uuid = UUID.randomUUID();
//            fileDTO.setFilePath(todayPath);
//            fileDTO.setFileSize(String.valueOf(multipartFile.getSize()));
//            fileDTO.setFileOriginalName(multipartFile.getOriginalFilename());
//            fileDTO.setFileName(uuid.toString() + "_" + multipartFile.getOriginalFilename());
//            fileDTO.setFileContentType(multipartFile.getContentType().contains("image") ? FileContentType.IMAGE : FileContentType.OTHER);
//            fileDAO.save(fileDTO);
//
//            postFileDTO.setId(fileDTO.getId());
//            postFileDAO.save(postFileDTO.toPostFileVO());
//
//            File directory = new File(fileDTO.getFilePath());
//            if(!directory.exists()){
//                directory.mkdirs();
//            }
//
//            try {
//                multipartFile.transferTo(new File(path, fileDTO.getFileName()));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
    }

    public void writeQna(QnaDTO qnaDTO, ArrayList<MultipartFile> multipartFiles) {
        qnaMapper.insert(qnaDTO);
    }
}
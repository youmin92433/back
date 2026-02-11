package com.app.trycatch.controller.qna;

import com.app.trycatch.dto.qna.QnaDTO;
import com.app.trycatch.service.qna.QnaService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
@RequestMapping("/qna/**")
@RequiredArgsConstructor
@Slf4j
public class QnaController {
    private final HttpSession session;
    private final QnaService qnaService;

    @GetMapping("write")
    public String goToWriteForm(){
        return "post/write";
    }

    @PostMapping("write")
    public RedirectView write(QnaDTO qnaDTO, @RequestParam("file") ArrayList<MultipartFile> multipartFiles){
//        MemberDTO member = (MemberDTO) session.getAttribute("member");
//        postDTO.setMemberId(member.getId())
        qnaService.writeQna(qnaDTO, multipartFiles);
        return null;
    }

//    @GetMapping("list")
//    public String list(Model model){
//        model.addAttribute("posts", qnaService.list());
//        return "post/list";
//    }
}
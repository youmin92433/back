package com.app.trycatch.dto.qna;

import com.app.trycatch.common.enumeration.qna.QnaStatus;
import com.app.trycatch.domain.member.CorpVO;
import com.app.trycatch.domain.member.IndividualMemberVO;
import com.app.trycatch.domain.qna.QnaCommentVO;
import com.app.trycatch.domain.qna.QnaVO;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class QnaCommentDTO {
    private Long id;
    private Long qnaId;
    private String qnaTitle;
    private String qnaContent;
    private Long individualMemberId;
    private int qnaViewCount;
    private QnaStatus qnaStatus;
    private Long corpId;
    private String corpCompanyName;
    private String corpBusinessNumber;
    private String corpCeoName;
    private Long corpKindId;
    private Long corpKindSmallId;
    private String corpCompanyType;
    private String corpCompanySize;
    private String corpEstablishmentDate;
    private String corpWebsiteUrl;
    private String corpFax;
    private Long corpCapital;
    private Long corpTotalSales;
    private String corpPerformance;
    private String corpVision;
    private Long qnaCommentParent;
    private String qnaCommentContent;
    private int qnaCommentLikeCount;
    private String createdDateTime;
    private String updatedDateTime;

    public QnaCommentVO toQnaCommentVO() {
        return QnaCommentVO.builder()
                .id(id)
                .qnaId(qnaId)
                .corpId(corpId)
                .qnaCommentParent(qnaCommentParent)
                .qnaCommentContent(qnaCommentContent)
                .qnaCommentLikeCount(qnaCommentLikeCount)
                .createdDatetime(createdDateTime)
                .updatedDatetime(updatedDateTime)
                .build();
    }

    public QnaVO toQnaVO() {
        return QnaVO.builder()
                .id(id)
                .individualMemberId(individualMemberId)
                .qnaTitle(qnaTitle)
                .qnaContent(qnaContent)
                .qnaViewCount(qnaViewCount)
                .qnaStatus(qnaStatus)
                .build();
    }

    public CorpVO toCorpVO() {
        return CorpVO.builder()
                .corpCompanyName(corpCompanyName)
                .corpBusinessNumber(corpBusinessNumber)
                .corpCeoName(corpCeoName)
                .corpKindId(corpKindId)
                .corpKindSmallId(corpKindSmallId)
                .corpCompanyType(corpCompanyType)
                .corpCompanySize(corpCompanySize)
                .corpEstablishmentDate(corpEstablishmentDate)
                .corpWebsiteUrl(corpWebsiteUrl)
                .corpFax(corpFax)
                .corpCapital(corpCapital)
                .corpTotalSales(corpTotalSales)
                .corpPerformance(corpPerformance)
                .corpVision(corpVision)
                .build();
    }
}


package com.app.trycatch.dto.qna;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class QnaJobCategoryDTO {
    private Long id;
    private String jobCategoryName;
    private String jobCategoryCode;
}

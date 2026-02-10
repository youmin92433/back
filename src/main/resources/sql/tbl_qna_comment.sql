-- ============================================================
create table tbl_qna_comment
(
    id                     bigint unsigned primary key comment 'ID',
    corp_id   bigint unsigned not null comment '작성자 ID',
    qna_comment_parent     bigint unsigned comment '부모 댓글 ID',
    qna_comment_content    text            not null comment '댓글 내용',
    qna_comment_like_count int      default 0 comment '좋아요 수',
    created_datetime       datetime default current_timestamp,
    updated_datetime       datetime default current_timestamp,
    constraint fk_qna_comment_qna foreign key (id) references tbl_qna (id) on delete cascade,
    constraint fk_qna_comment_corp foreign key (corp_id) references tbl_corp (id) ,
    constraint fk_qna_comment_parent foreign key (qna_comment_parent) references tbl_qna_comment (id) on delete cascade
);

select * from tbl_qna_comment;

set FOREIGN_KEY_CHECKS =1;

drop table tbl_qna_comment;

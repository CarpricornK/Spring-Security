package kopo.poly.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoticeEntity {


    @Id
    private String noticeSeq;

    @Column(nullable = false, name="title")
    private String title;

    @Column(nullable = false, name="noticeYn")
    private String noticeYn;

    @Column(nullable = false, name="contents")
    private String contents;

    @Column(nullable = false, name="userId")
    private String userId;

    @Column(nullable = false, name="readCnt")
    private Long readCnt;

    @Column(nullable = false, name="regId")
    private String regId;

    @Column(nullable = false, name="regDt")
    private String regDt;

    @Column(nullable = false, name="chgId")
    private String chgId;

    @Column(nullable = false, name="chgDt")
    private String chgDt;



}

package kopo.poly.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "NOTICE")
public class NoticeEntity {

    @Id
    private String noticeSeq;

    @NonNull
    @Field(name = "title")
    private String title;

    @NonNull
    @Field(name = "notice_yn")
    private String noticeYn;

    @NonNull
    @Field(name = "contents")
    private String contents;

    @NonNull
    @Field(name = "user_Id")
    private String userId;

    @NonNull
    @Field(name = "read_cnt")
    private Long readCnt;

    @NonNull
    @Field(name = "reg_id")
    private String regId;

    @NonNull
    @Field(name = "reg_dt")
    private String regDt;

    @NonNull
    @Field(name = "chg_id")
    private String chgId;

    @NonNull
    @Field(name = "chg_dt")
    private String chgDt;


}

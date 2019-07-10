package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BoardEntity {

    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idx;
    @Column
    private String title;
    @Column
    private String contents;
    @Column
    private long userNo;

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public long getUserNo() {
        return userNo;
    }

    public void setUserNo(long userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "BoardEntity{" +
                "idx=" + idx +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", userNo=" + userNo +
                '}';
    }
}

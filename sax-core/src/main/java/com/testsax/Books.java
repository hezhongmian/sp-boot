package com.testsax;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Books {
    private String recId;
    private String bookId;
    private String chapterParentAll;
    private String homePage;
    private String contents;
    private String favorites;
    private Date updatedDate;
    private Date createDate;
    private String chapterNo;
    private String chapterName;
    private String chapterLevel;
    private String pageNo;
    private String bookCD;
    private String bookName;

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getChapterParentAll() {
        return chapterParentAll;
    }

    public void setChapterParentAll(String chapterParentAll) {
        this.chapterParentAll = chapterParentAll;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getChapterNo() {
        return chapterNo;
    }

    public void setChapterNo(String chapterNo) {
        this.chapterNo = chapterNo;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterLevel() {
        return chapterLevel;
    }

    public void setChapterLevel(String chapterLevel) {
        this.chapterLevel = chapterLevel;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public String getBookCD() {
        return bookCD;
    }

    public void setBookCD(String bookCD) {
        this.bookCD = bookCD;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Books{" +
                "recId='" + recId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", chapterParentAll='" + chapterParentAll + '\'' +
                ", homePage='" + homePage + '\'' +
                ", contents='" + contents + '\'' +
                ", favorites='" + favorites + '\'' +
                ", updatedDate=" + updatedDate +
                ", createDate=" + createDate +
                ", chapterNo='" + chapterNo + '\'' +
                ", chapterName='" + chapterName + '\'' +
                ", chapterLevel='" + chapterLevel + '\'' +
                ", pageNo='" + pageNo + '\'' +
                ", bookCD='" + bookCD + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}

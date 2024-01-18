package com.example.onlinecoursesplatform.dataTrasferObject;

import java.util.Date;

public class CourseDTO {
    private Long courseId;
    private String courseTitle;
    private String courseContent;
    private String categoryName;
    private Date courseDate;
    private String courseAuthor;
    private String authorIpAddress;

    public CourseDTO() {

    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(Date courseDate) {
        this.courseDate = courseDate;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }

    public String getAuthorIpAddress() {
        return authorIpAddress;
    }

    public void setAuthorIpAddress(String authorIpAddress) {
        this.authorIpAddress = authorIpAddress;
    }
}

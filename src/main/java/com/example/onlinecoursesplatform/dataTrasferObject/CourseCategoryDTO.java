package com.example.onlinecoursesplatform.dataTrasferObject;

public class CourseCategoryDTO {
    private Long categoryId;
    private String categoryName;

    public CourseCategoryDTO() {

    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

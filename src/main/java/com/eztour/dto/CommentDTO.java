package com.eztour.dto;

public class CommentDTO {
    private String commentText;
    private String userLogin;
    private int tourCompId;

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }



    public int getTourCompId() {
        return tourCompId;
    }

    public void setTourCompId(int tourCompId) {
        this.tourCompId = tourCompId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}

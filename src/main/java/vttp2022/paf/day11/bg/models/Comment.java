package vttp2022.paf.day11.bg.models;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public class Comment {
    private String cId;
    private String user;
    private Integer rating;
    private String cText;

    public String getcId() {
        return cId;
    }
    public void setcId(String cId) {
        this.cId = cId;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public Integer getRating() {
        return rating;
    }
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    public String getcText() {
        return cText;
    }
    public void setcText(String cText) {
        this.cText = cText;
    }
    
    public static Comment create(SqlRowSet rs) {
        Comment comment = new Comment();
        comment.setcId(rs.getString("c_id"));
        comment.setUser(rs.getString("user"));
        comment.setRating(rs.getInt("rating"));
        comment.setcText(rs.getString("c_text"));
        return comment;
    }
    
}

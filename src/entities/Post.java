package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {   
    private final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private LocalDateTime date;
    private String title;
    private String content;
    private Integer likes;
    //aqui onde vamos armazenar os textos respondendo os contents
    private List<Comment> commentsList = new ArrayList<>();

    public Post() {}

    public Post(LocalDateTime date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Post (String title, String content, LocalDateTime date){
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommentsList() {
        return commentsList;
    }
    //removemos o set para listas

    public void addText(Comment comment){
        commentsList.add(comment);
    }

    public void removeText(Comment comment){
        commentsList.remove(comment);
    }

    public void addLikes(){
        this.likes++;
    }

    public void removeLikes(){
        this.likes--;
    }
    

    @Override
    public String toString() {
        
        StringBuilder sb = new  StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" likes  - ");
        sb.append(date.format(format) + "\n");
        sb.append(content + "\n");
        sb.append(" Comments: \n");
        for (Comment c: commentsList){
            sb.append(c.getText() + "\n");
        }
             
        return sb.toString();
    }

    
}

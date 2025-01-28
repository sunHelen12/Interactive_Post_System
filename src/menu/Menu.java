package menu;

import entities.Comment;
import entities.Post;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner sc =  new Scanner(System.in);
    private List <Post> postsList = new ArrayList<>();
    

    public void exibeMenu(){
        int option;
        do{
            System.out.println("""
                ============================
                            MENU
                ============================
                1 - Add a Post
                2 - Add a Comment
                3 - Add a Like
                4 - List Posts
                5 - Remove Post
                6 - Remove Comment
                7 - Remove Like               
                ============================
                0 - Sair
                 """);

            
            System.out.print("Enter an option: ");    
            option = sc.nextInt();
    
            switch (option) {

            case 1:
                addPost();               
                break;
            case 2:
                addComment();
                break;
            case 3: 
                addLike();
                break;
            case 4:
                listPosts();
                break; 
            case 7: 
                removeLike(); 
                break;         
            default:
                System.out.println("Invalid Option!");
            }
    
        } while (option != 0);
    }

    public void addPost (){
        System.out.println("Enter a Title: ");
        String title = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the post content: ");
        String content = sc.nextLine();
        LocalDateTime postDate = LocalDateTime.now();
        
        Post newPost = new Post(title, content, postDate);
        postsList.add(newPost);    

        System.out.println("Post added sucessfully!");
        
    }

    public void listPosts(){
        if(postsList.isEmpty()){
            System.out.println("There are no posts yet!");       
        }

        for (Post p : postsList){
            System.out.println(p);
        }
    }

    public void addComment(){
        listPosts();

        System.out.println("Select a post to comment on (choose by index): ");
        for(int i = 0; i < postsList.size(); i++){
            System.out.println(i + " - " + postsList.get(i).getTitle());            
        }

        int choice = sc.nextInt();
        sc.next();

        if (choice < 0 || choice > postsList.size()){
            System.out.println("Invalid Index!");
            return;
        }

        System.out.println("Type a Comment: ");
        String comment = sc.nextLine();

        Post selectedPost = postsList.get(choice);
        selectedPost.addText(new Comment(comment));

        System.out.println("Comment added sucessfully");
    }

    public void addLike(){
        listPosts();

        System.out.println("Select a post to like on (choose by index): ");
        for(int i = 0; i < postsList.size(); i++){
            System.out.println(i + " - " + postsList.get(i).getTitle());            
        }

        int choice = sc.nextInt();
        sc.next();

        if (choice < 0 || choice > postsList.size()){
            System.out.println("Invalid Index!");
            return;
        }
       
        Post postLiked = postsList.get(choice);
        postLiked.setLikes(postLiked.getLikes() + 1);

        System.out.println("Like added sucessfully!");

    }

    public void removeLike(){
        listPosts();

        System.out.println("Select a post to deslike on (choose by index): ");
        for(int i = 0; i < postsList.size(); i++){
            System.out.println(i + " - " + postsList.get(i).getTitle());            
        }

        int choice = sc.nextInt();
        sc.next();

        if (choice < 0 || choice > postsList.size()){
            System.out.println("Invalid Index!");
            return;
        }
       
        Post postLiked = postsList.get(choice);
        postLiked.setLikes(postLiked.getLikes() - 1);

        System.out.println("Like removed sucessfully!");

    }
    
}

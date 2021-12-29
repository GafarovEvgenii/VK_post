package ru.netology.manager;

import ru.netology.domain.Post;

public class MainPostManager {

    private PostManager postManager;
    //generate main post page
    public String generatePostPage (){
        Post[] posts = postManager.getPostsForFeed();
        return null;
    }
}

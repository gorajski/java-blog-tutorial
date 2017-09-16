package com.gorajski.www.javablogtutorial.controllers;

import com.gorajski.www.javablogtutorial.entities.Post;
import com.gorajski.www.javablogtutorial.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value="/posts")
    public List<Post> posts() {
        return postService.getAllPosts();
    }

    @PostMapping(value="/posts")
    public void publishPost(@RequestBody Post post) {
        if(post.getDateCreated() == null)
            post.setDateCreated(new Date());
        postService.insert(post);
    }

}

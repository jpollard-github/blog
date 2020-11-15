package com.jpollard91.business.boundary;

import com.jpollard91.business.entity.Post;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("post")
public class PostResource {

    @Inject
    PostRepository postRepository;

    @GET
    @Path("{id}")
    public Post getPost(@PathParam("id") Long id) {
        return postRepository.findById(id);
    }

    @GET
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @POST
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @DELETE
    @Path("{id}")
    public void deletePost(@PathParam("id") Long id) {
        postRepository.remove(id);
    }
}

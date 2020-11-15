package com.jpollard91.business.boundary;

import com.jpollard91.business.entity.Post;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PostRepository {

    @PersistenceContext(name = "DefaultMySQL")
    EntityManager em;

    public Post findById(Long id) {
        return em.find(Post.class, id);
    }

    public List<Post> findAll() {
        return em.createNamedQuery(Post.findAll, Post.class).getResultList();
    }

    public Post save(Post post) {
        return em.merge(post);
    }

    public void remove(Long id) {
        Post post = findById(id);
        if (post != null) {
            em.remove(id);
        }
    }
}

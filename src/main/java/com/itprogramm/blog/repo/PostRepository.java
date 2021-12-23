package com.itprogramm.blog.repo;

import com.itprogramm.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}

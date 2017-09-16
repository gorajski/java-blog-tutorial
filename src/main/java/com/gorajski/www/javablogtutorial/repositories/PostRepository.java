package com.gorajski.www.javablogtutorial.repositories;

import com.gorajski.www.javablogtutorial.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

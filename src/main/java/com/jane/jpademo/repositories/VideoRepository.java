package com.jane.jpademo.repositories;

import com.jane.jpademo.models.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}

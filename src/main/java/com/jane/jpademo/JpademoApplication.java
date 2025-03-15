package com.jane.jpademo;

import com.jane.jpademo.models.Author;
import com.jane.jpademo.models.Video;
import com.jane.jpademo.repositories.AuthorRepository;
import com.jane.jpademo.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpademoApplication.class, args);
    }

     // @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository
    ){
        return args -> {
//            var author = Author.builder()
//                    .firstName("John")
//                    .lastName("Doe")
//                    .age(34)
//                    .email("john@doe.com")
//                    .build();
//            authorRepository.save(author);
            var video = Video.builder()
                    .name("abc")
                    .length(5)
                    .build();
            videoRepository.save(video);
        };
    }
}

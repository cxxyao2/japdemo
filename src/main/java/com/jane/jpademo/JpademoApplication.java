package com.jane.jpademo;

import com.github.javafaker.Faker;
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

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository
    ){
        return args -> {
//            for(int i=0;i<50;i++) {
//            Faker faker = new Faker();
//            var author = Author.builder()
//                    .firstName(faker.name().firstName())
//                    .lastName(faker.name().lastName())
//                    .age(faker.number().numberBetween(19,50))
//                    .email("john" + i + "@doe.com")
//                    .build();
//             authorRepository.save(author);
//            }
            // update author with id = 1
//            var author = Author.builder()
//                    .id(1)
//                    .firstName("JohnShrimp")
//                    .lastName("Doe")
//                    .age(34)
//                    .email("johnshrimp@gmail.com")
//                    .build();
//            authorRepository.save(author);

    authorRepository.updateAuthor(22,1);

    authorRepository.updatedByNamedQuery(30);
    authorRepository.findByNamedQuery(22)
            .forEach(System.out::println);

//            var video = Video.builder()
//                    .name("abc")
//                    .length(5)
//                    .build();
//            videoRepository.save(video);
        };
    }
}

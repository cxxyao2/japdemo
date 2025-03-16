package com.jane.jpademo.repositories;

import com.jane.jpademo.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    List<Author> findByLastName(String lastName);
    List<Author> findAllByAgeNull();


    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    List<Author> findAllByFirstNameStartingWithIgnoreCase(String fn);

    List<Author> findByFirstNameAndLastName(String fn, String ln);
    Optional<Author> findByEmail(String email);


    int countAllByAge(int age);
    void deleteAllByAge(int age);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id = :id")
    int updateAuthor(int age, int id);


    List<Author> findByNamedQuery(@Param("age") int age);
    // findBy, findAllBy,+ Property


    @Modifying
    @Transactional
    void updatedByNamedQuery(@Param("age") int age);
}

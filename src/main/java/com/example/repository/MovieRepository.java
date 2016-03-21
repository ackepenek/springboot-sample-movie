package com.example.repository;

import com.example.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Developed by Ahmet Can Kepenek (ahmetcan.kepenek@gmail.com)
 */
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
    List<Movie> findByName(String name);
}

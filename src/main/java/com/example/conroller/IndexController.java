package com.example.conroller;

import com.example.domain.Movie;
import com.example.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Developed by Ahmet Can Kepenek (ahmetcan.kepenek@gmail.com)
 */

@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value="/save", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String save(@RequestBody Movie movie){
        movieRepository.save(movie);
        return "added";
    }
}

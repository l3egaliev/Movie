package kg.rakhim.classes.dao;

import kg.rakhim.classes.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

@Component
public class MovieDAO {
    private final JdbcTemplate jdbcTemplate;
    FileInputStream fileInputStream = null;


    @Autowired
    public MovieDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Movie> films(){
        return jdbcTemplate.query("select * from movie", new BeanPropertyRowMapper<>(Movie.class));
    }

    public Movie show(String id) {
        return jdbcTemplate.query("select * from movie where movie_id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Movie.class))
                .stream().findAny().orElse(null);
    }





}



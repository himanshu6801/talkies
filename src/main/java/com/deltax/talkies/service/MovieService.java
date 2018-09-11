/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deltax.talkies.service;

import com.deltax.talkies.model.Actor;
import com.deltax.talkies.model.Movie;
import com.deltax.talkies.model.MovieDetails;
import com.deltax.talkies.model.Producer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Himanshu
 */
@Service

public class MovieService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    
    public List<MovieDetails> getAllMovieDetails() {

        List<MovieDetails> allMovies = jdbcTemplate.query("SELECT M.MOVIEID, M.NAME,M.YEAR,M.PLOT,M.POSTER,P.NAME AS PRODUCERNAME,P.PRODUCERID,P.SEX,P.BIO,P.DOB FROM MOVIE M INNER JOIN PRODUCER P ON M.PRODUCERID=P.PRODUCERID ;", new RowMapper() {
            @Override
            public MovieDetails mapRow(ResultSet rs, int i) throws SQLException {

                Movie m = new Movie(rs.getInt("movieid"), rs.getString("name"), rs.getDate("year"), rs.getString("plot"), rs.getInt("producerid"), rs.getString("poster"));
                Producer p = new Producer(rs.getInt("producerid"), rs.getString("PRODUCERNAME"), rs.getString("sex").charAt(0), rs.getDate("dob"), rs.getString("bio"));

                List<Actor> actors = jdbcTemplate.query("select * from ACTOR where ACTORID IN (SELECT ACTORID FROM MOVIE_ACTOR_REL WHERE MOVIEID=?)",
                        new Object[]{m.getMovieid()}, new RowMapper() {
                    @Override
                    public Actor mapRow(ResultSet rs, int i) throws SQLException {
                        return new Actor(rs.getInt("actorid"), rs.getString("name"), rs.getString("sex").charAt(0), rs.getDate("dob"), rs.getString("bio"));
                    }
                });

                return new MovieDetails(m, p, actors);
            }
        });
        return allMovies;
    }

}

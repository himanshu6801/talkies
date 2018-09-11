/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deltax.talkies.repository;

/**
 *
 * @author Himanshu
 */
public interface TakiesDBQueries {
    
    String GET_ALL_MOVIES_DETAILS="SELECT M.NAME,M.YEAR,M.PLOT,P.NAME AS PRODUCER,M.POSTER FROM MOVIE M INNER JOIN PRODUCER P ON M.PRODUCERID=P.PRODUCERID ";
    
}

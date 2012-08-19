/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Feedlike;

/**
 *
 * @author tapan
 */
public interface FeedlikeDao extends GenericDao<Feedlike, Long> {
    
  public Long createFeedlike(Feedlike feedlike);
    
}

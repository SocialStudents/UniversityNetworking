/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Feeds;

/**
 *
 * @author tapan
 */
public interface FeedsDao extends GenericDao<Feeds, Long> {
    
     public Long createFeeds(Feeds feeds);
    
    
}

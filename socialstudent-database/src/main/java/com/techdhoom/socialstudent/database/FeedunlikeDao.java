/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Feedunlike;
import java.io.Serializable;

/**
 *
 * @author tapan
 */
public interface FeedunlikeDao extends GenericDao<Feedunlike, Long> {
    
    public Long createFeedunlike(Feedunlike feedunlike);
}

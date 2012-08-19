/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Feedcomment;

/**
 *
 * @author tapan
 */
public interface FeedcommentDao extends GenericDao<Feedcomment, Long> {
    
    public Long createFeedcomment(Feedcomment feedcomment);
    
}

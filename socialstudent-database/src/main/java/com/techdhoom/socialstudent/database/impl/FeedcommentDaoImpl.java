/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FeedcommentDao;
import com.techdhoom.socialstudent.model.Feedcomment;
import com.techdhoom.socialstudent.model.Feedlike;

/**
 *
 * @author tapan
 */
public class FeedcommentDaoImpl extends BaseAbstractGenericDao<Feedcomment, Long> implements FeedcommentDao {
    
    
    @Override
    public Long createFeedcomment(Feedcomment feedcomment){
     return super.create(feedcomment);
    }
}

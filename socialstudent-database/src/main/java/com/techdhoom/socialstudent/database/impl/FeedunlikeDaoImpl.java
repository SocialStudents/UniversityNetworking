/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FeedunlikeDao;
import com.techdhoom.socialstudent.model.Feedunlike;

/**
 *
 * @author tapan
 */
public class FeedunlikeDaoImpl extends BaseAbstractGenericDao<Feedunlike, Long> implements FeedunlikeDao{
 
    @Override
     public Long createFeedunlike(Feedunlike feedunlike){
     return super.create(feedunlike);
    
    }
}

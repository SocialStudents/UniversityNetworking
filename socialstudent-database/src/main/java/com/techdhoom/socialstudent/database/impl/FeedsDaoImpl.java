/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.FeedsDao;
import com.techdhoom.socialstudent.model.Feeds;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class FeedsDaoImpl extends BaseAbstractGenericDao<Feeds, Long> implements FeedsDao{
    
    @Override
     public Long createFeeds(Feeds feeds){
        
    return super.create(feeds);
}
    
    
}

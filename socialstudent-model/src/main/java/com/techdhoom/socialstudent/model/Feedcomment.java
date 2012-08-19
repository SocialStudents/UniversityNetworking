/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "feedcomment")
public class Feedcomment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feed_id")
    private Long feedId;
    @Column(name = "comment")
    private String comment;
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @Column(name = "feed_update_id")
    private int feedUpdateId;
    @JoinColumn(name = "created_by", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Usermain createdBy;

    public Feedcomment() {
    }

    public Feedcomment(Long feedId) {
        this.feedId = feedId;
    }

    public Feedcomment(Long feedId, int feedUpdateId) {
        this.feedId = feedId;
        this.feedUpdateId = feedUpdateId;
    }

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getFeedUpdateId() {
        return feedUpdateId;
    }

    public void setFeedUpdateId(int feedUpdateId) {
        this.feedUpdateId = feedUpdateId;
    }

    public Usermain getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Usermain createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (feedId != null ? feedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedcomment)) {
            return false;
        }
        Feedcomment other = (Feedcomment) object;
        if ((this.feedId == null && other.feedId != null) || (this.feedId != null && !this.feedId.equals(other.feedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Feedcomment[ feedId=" + feedId + " ]";
    }
    
}

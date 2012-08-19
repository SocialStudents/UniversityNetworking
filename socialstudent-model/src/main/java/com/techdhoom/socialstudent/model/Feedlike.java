/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "feedlike")
public class Feedlike implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private Long likeId;
    @Basic(optional = false)
    @Column(name = "feed_comment_id")
    private int feedCommentId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain userId;
    @JoinColumn(name = "feed_id", referencedColumnName = "feed_id")
    @ManyToOne
    private Feeds feedId;

    public Feedlike() {
    }

    public Feedlike(Long likeId) {
        this.likeId = likeId;
    }

    public Feedlike(Long likeId, int feedCommentId) {
        this.likeId = likeId;
        this.feedCommentId = feedCommentId;
    }

    public Long getLikeId() {
        return likeId;
    }

    public void setLikeId(Long likeId) {
        this.likeId = likeId;
    }

    public int getFeedCommentId() {
        return feedCommentId;
    }

    public void setFeedCommentId(int feedCommentId) {
        this.feedCommentId = feedCommentId;
    }

    public Usermain getUserId() {
        return userId;
    }

    public void setUserId(Usermain userId) {
        this.userId = userId;
    }

    public Feeds getFeedId() {
        return feedId;
    }

    public void setFeedId(Feeds feedId) {
        this.feedId = feedId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (likeId != null ? likeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedlike)) {
            return false;
        }
        Feedlike other = (Feedlike) object;
        if ((this.likeId == null && other.likeId != null) || (this.likeId != null && !this.likeId.equals(other.likeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Feedlike[ likeId=" + likeId + " ]";
    }
    
}

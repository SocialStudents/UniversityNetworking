/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author tapan
 */
@Entity
@Table(name = "usermain")
public class Usermain implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Collection<Feedcomment> feedcommentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "useId")
    private Collection<Feedunlike> feedunlikeCollection;
    @OneToMany(mappedBy = "userId")
    private Collection<Feedlike> feedlikeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Collection<Feeds> feedsCollection;
    @OneToMany(mappedBy = "loggedPerson")
    private Collection<Feeds> feedsCollection1;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "user_type")
    private String userType;
    @Column(name = "emai_id")
    private String emaiId;

    public Usermain() {
    }

    public Usermain(Long userId) {
        this.userId = userId;
    }

    public Usermain(Long userId, String userType) {
        this.userId = userId;
        this.userType = userType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmaiId() {
        return emaiId;
    }

    public void setEmaiId(String emaiId) {
        this.emaiId = emaiId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usermain)) {
            return false;
        }
        Usermain other = (Usermain) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Usermain[ userId=" + userId + " ]";
    }

    @XmlTransient
    public Collection<Feeds> getFeedsCollection() {
        return feedsCollection;
    }

    public void setFeedsCollection(Collection<Feeds> feedsCollection) {
        this.feedsCollection = feedsCollection;
    }

    @XmlTransient
    public Collection<Feeds> getFeedsCollection1() {
        return feedsCollection1;
    }

    public void setFeedsCollection1(Collection<Feeds> feedsCollection1) {
        this.feedsCollection1 = feedsCollection1;
    }

    @XmlTransient
    public Collection<Feedlike> getFeedlikeCollection() {
        return feedlikeCollection;
    }

    public void setFeedlikeCollection(Collection<Feedlike> feedlikeCollection) {
        this.feedlikeCollection = feedlikeCollection;
    }

    @XmlTransient
    public Collection<Feedunlike> getFeedunlikeCollection() {
        return feedunlikeCollection;
    }

    public void setFeedunlikeCollection(Collection<Feedunlike> feedunlikeCollection) {
        this.feedunlikeCollection = feedunlikeCollection;
    }

    @XmlTransient
    public Collection<Feedcomment> getFeedcommentCollection() {
        return feedcommentCollection;
    }

    public void setFeedcommentCollection(Collection<Feedcomment> feedcommentCollection) {
        this.feedcommentCollection = feedcommentCollection;
    }
    
}

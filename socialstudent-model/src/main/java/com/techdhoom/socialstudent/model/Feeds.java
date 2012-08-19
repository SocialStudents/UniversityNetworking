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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "feeds")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feeds.findAll", query = "SELECT f FROM Feeds f"),
    @NamedQuery(name = "Feeds.findByFeedId", query = "SELECT f FROM Feeds f WHERE f.feedId = :feedId"),
    @NamedQuery(name = "Feeds.findByFeedType", query = "SELECT f FROM Feeds f WHERE f.feedType = :feedType")})
public class Feeds implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "feedId")
    private Collection<Feedunlike> feedunlikeCollection;
    @OneToMany(mappedBy = "feedId")
    private Collection<Feedlike> feedlikeCollection;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "feed_id")
    private Long feedId;
    @Basic(optional = false)
    @Column(name = "feed_type")
    private String feedType;
    @JoinColumn(name = "owner", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Usermain owner;
    @JoinColumn(name = "logged_person", referencedColumnName = "user_id")
    @ManyToOne
    private Usermain loggedPerson;

    public Feeds() {
    }

    public Feeds(Long feedId) {
        this.feedId = feedId;
    }

    public Feeds(Long feedId, String feedType) {
        this.feedId = feedId;
        this.feedType = feedType;
    }

    public Long getFeedId() {
        return feedId;
    }

    public void setFeedId(Long feedId) {
        this.feedId = feedId;
    }

    public String getFeedType() {
        return feedType;
    }

    public void setFeedType(String feedType) {
        this.feedType = feedType;
    }

    public Usermain getOwner() {
        return owner;
    }

    public void setOwner(Usermain owner) {
        this.owner = owner;
    }

    public Usermain getLoggedPerson() {
        return loggedPerson;
    }

    public void setLoggedPerson(Usermain loggedPerson) {
        this.loggedPerson = loggedPerson;
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
        if (!(object instanceof Feeds)) {
            return false;
        }
        Feeds other = (Feeds) object;
        if ((this.feedId == null && other.feedId != null) || (this.feedId != null && !this.feedId.equals(other.feedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techdhoom.socialstudent.model.Feeds[ feedId=" + feedId + " ]";
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
    
}

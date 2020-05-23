package com.disqo.persistence.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.joda.time.DateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Created by rashmiprasad on 5/21/20.
 *
 * Note Entity class
 */
@Entity
@Table(name = "note")
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    private String note;
//    private DateTime createdDateTime;
//    private DateTime updatedDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @JsonIgnore
    public User getUser() {
        return user;
    }

    @JsonIgnore
    public void setUser(User user) {
        this.user = user;
    }

    //    public DateTime getCreatedDateTime() {
//        return createdDateTime;
//    }
//
//    public void setCreatedDateTime(DateTime createdDateTime) {
//        this.createdDateTime = createdDateTime;
//    }
//
//    public DateTime getUpdatedDateTime() {
//        return updatedDateTime;
//    }
//
//    public void setUpdatedDateTime(DateTime updatedDateTime) {
//        this.updatedDateTime = updatedDateTime;
//    }

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", note='" + note + '\'' +
//                ", createdDateTime=" + createdDateTime +
//                ", updatedDateTime=" + updatedDateTime +
                '}';
    }
}

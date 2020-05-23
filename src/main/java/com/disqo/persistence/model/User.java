package com.disqo.persistence.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.joda.time.DateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 * Created by rashmiprasad on 5/21/20.
 * User Entity
 */

@Entity
@Table(name = "user", schema = "disqo")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String email;

    @NotNull
    private String password;

//    private DateTime createdDateTime;
//    private DateTime updatedDateTime;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Note> notes = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
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
}

package com.explore_greece.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 30)
    private String firstName;

    @Size(max = 30)
    private String lastName;

    @Size(max = 50)
    @Column(unique = true)
    private String email;

    /**
     * In our user table there will be a foreign key/field
     * that maps to the User_Profile table
     * !! cascading means we can apply the same operations to
     * related entities eg. delete. if we delete a user, we'll
     * also delete their profile.
     * Cascade Types
     * PERSIST, REMOVE/delete, REFRESH, DETACH, MERGE, ALL
     */
    @OneToOne
    (fetch = FetchType.LAZY,
    cascade = CascadeType.ALL,
    mappedBy = "user")
    private UserProfile userProfile;

    public User() {
    }

    public User( String firstName, String lastName, String email, UserProfile userProfile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userProfile = userProfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userProfile=" + userProfile +
                '}';
    }
}

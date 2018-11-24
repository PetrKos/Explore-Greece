package com.explore_greece.Model;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
@Table(name = "USER_PROFILES")
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number")
    @Size(max = 20)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Embedded
    private Address address;

    public UserProfile() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

    /**
     * A one-to-one relationship is defined using JPA’s @OneToOne annotation. It accepts several attributes.
     * Let’s understand what those attributes are meant for -
     *
     *fetch = FetchType.LAZY - Fetch the related entity lazily from the database.
     * cascade = CascadeType.ALL - Apply all cascading effects to the related entity.
     * That is, whenever we update/delete a User entity, update/delete the corresponding UserProfile as well.
     *
     *     mappedBy = “user” - We use mappedBy attribute in the User entity to tell hibernate that the User
     *     entity is not responsible for this relationship and It should look for a field named user in the
     *     UserProfile entity to find the configuration for the JoinColumn/ForeignKey column.
     * In a bi-directional relationship, we specify @OneToOne annotation on both the entities
     * but only one entity is the owner of the relationship. Most often, the child entity is the owner
     * of the relationship and the parent entity is the inverse side of the relationship.
     *
     * The owner of the relationship contains a @JoinColumn annotation to specify the foreign key column,
     * and the inverse-side of the relationship contains a mappedBy attribute to indicate that the relationship
     * is mapped by the other entity.
     */

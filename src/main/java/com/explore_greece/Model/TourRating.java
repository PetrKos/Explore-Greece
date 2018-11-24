package com.explore_greece.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class TourRating {

    @Id
    @GeneratedValue
    private Long id;

    @Size(min = 1, max = 5)
    private int score;

    @Size(max = 300)
    private String comments;

    /**
     * ratings is for a tour and from a user,
     * so I just have 2 ManyToOne.
     *
     * important:
     * in reality, @OneToMany is practical only when many means few.
     * Maybe @OneToFew would have been a more suggestive name for this annotation
     *
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

    public TourRating() {
    }

    public TourRating(@Size(min = 1, max = 5) int score, @Size(max = 300) String comments, User user, Tour tour) {
        this.score = score;
        this.comments = comments;
        this.user = user;
        this.tour = tour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }
}

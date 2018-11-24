package com.explore_greece.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "TOURS")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotBlank
    @Size(max = 80)
    private String title;

    @NotBlank
    @Size(max = 300)
    private String description;


    private double price;

    @NotBlank
    @Size(min = 1, max = 30)
    private int duration;

    @NotBlank
    @Size(max = 200)
    private String keywords;

    /**
     * We DO NOT want to delete the WHOLE PACKAGE if
     * we ever need to remove/delete a tour -> thus,
     * we DO NOT apply cascadeType.DELETE/REMOVE
     */
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tour_package_id", nullable = false)
    public TourPackage tourPackage;

    /*@OneToMany
    private List<TourRating> tourRatings;*/

    public Tour() {
    }

    public Tour(@NotBlank @Size(max = 80) String title, @NotBlank @Size(max = 300) String description, double price, @NotBlank @Size(min = 1, max = 30) int duration, @NotBlank @Size(max = 200) String keywords, TourPackage tourPackage) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.keywords = keywords;
        this.tourPackage = tourPackage;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", keywords='" + keywords + '\'' +
                ", tourPackage=" + tourPackage +
                '}';
    }
}

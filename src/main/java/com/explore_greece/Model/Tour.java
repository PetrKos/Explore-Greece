package com.explore_greece.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "TOURS")
public class Tour implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Size(max = 80)
    private String title;

    @Size(max = 300)
    private String description;

    private int price;

    @Size(min = 1, max = 30)
    private int durationInDays;

    //@NotBlank
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
    @JoinColumn(name = "tour_package_id")
    public TourPackage tourPackage;


    public Tour() {
    }

    public Tour(@Size(max = 80) String title,
                @Size(max = 300) String description,
                int price,
                @Size(min = 1, max = 30) int duration,
                @Size(max = 200) String keywords,
                TourPackage tourPackage) {

        this.title = title;
        this.description = description;
        this.price = price;
        this.durationInDays = duration;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return durationInDays;
    }

    public void setDuration(int duration) {
        this.durationInDays = duration;
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
                ", duration=" + durationInDays +
                ", keywords='" + keywords + '\'' +
                ", tourPackage=" + tourPackage +
                '}';
    }
}

package com.explore_greece.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "TOUR_PACKAGES")
public class TourPackage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 30)
    private String tourPackageName;

    @Size(max = 30)
    private String region;


    public TourPackage() {
    }

    public TourPackage(String name,
                       String region
                       /*List<Tour> tours*/) {
        this.tourPackageName = name;
        this.region = region;
        /*this.tours = tours;*/
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return tourPackageName;
    }

    public void setName(String name) {
        this.tourPackageName = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /*public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }*/

    @Override
    public String toString() {
        return "TourPackage{" +
                "id=" + id +
                ", name='" + tourPackageName + '}';
    }
}

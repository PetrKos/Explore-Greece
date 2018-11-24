package com.explore_greece.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "TOUR_PACKAGES")
public class TourPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull
    @Size(max = 40)
    @Column(name = "package_name")
    private String name;

    @Column(name = "region", columnDefinition = "enum('HERAKLION','CHANIA','RETHYMNO','LASITHI')")
    @Enumerated(EnumType.STRING)
    @NotNull
    protected Region region;

    /**
     * If we delete a tour package, we also
     * delete all of its content
     * eg. if we delete "explore Crete",
     * we also delete all tours in Crete.
     */
    @OneToMany(mappedBy = "tourPackage",
                cascade = CascadeType.ALL)
    private List<Tour> tours;


    protected TourPackage() {
    }

    public TourPackage(@NotNull @Size(max = 40) String name, /*@NotNull Region region,*/ List<Tour> tours) {
        this.name = name;
        //this.region = region;
        this.tours = tours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }*/

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tours=" + tours +
                '}';
    }
}

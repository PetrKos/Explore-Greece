package com.explore_greece.Repository;

import com.explore_greece.Model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {

    List<Tour> findByTourPackageId(Long tourPackageId);

}

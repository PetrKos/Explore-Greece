package com.explore_greece.Repository;

import com.explore_greece.Model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage,Long> {

}


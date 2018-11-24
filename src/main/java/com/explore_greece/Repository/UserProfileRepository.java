package com.explore_greece.Repository;

import com.explore_greece.Model.User;
import com.explore_greece.Model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{
    @Override
    default Optional<UserProfile> findById(Long aLong) {
        return Optional.empty();
    }
}

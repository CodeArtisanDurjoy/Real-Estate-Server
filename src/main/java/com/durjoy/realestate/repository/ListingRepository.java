package com.durjoy.realestate.repository;

import com.durjoy.realestate.model.Listing;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long> {
    List<Listing> findByUserId(String userId);

    Page<Listing> findByNameContainingIgnoreCaseAndFurnishedInAndParkingIn(
            String searchTerm, boolean[] furnishedValues, boolean[] parkingValues, Pageable pageable
    );
}
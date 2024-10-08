package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.RestaurantEntity;

@Repository
public interface RestroRepository extends JpaRepository<RestaurantEntity, Integer> {

}

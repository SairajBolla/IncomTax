package com.example.incometax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.incometax.Entity.DeductionEntity;
@Repository
public interface DeductionRepository extends JpaRepository<DeductionEntity,Integer> {


		
}
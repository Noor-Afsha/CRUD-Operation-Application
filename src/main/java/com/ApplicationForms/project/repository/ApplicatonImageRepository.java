package com.ApplicationForms.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApplicationForms.project.model.ApplicatonImage;

@Repository
public interface ApplicatonImageRepository extends JpaRepository<ApplicatonImage, String> {

//	Optional<ApplicatonImage> findByName(String fileName);

}

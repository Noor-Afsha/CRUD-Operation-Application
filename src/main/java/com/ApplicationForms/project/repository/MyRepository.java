package com.ApplicationForms.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApplicationForms.project.model.ApplicationModel;

@Repository
public interface MyRepository extends JpaRepository<ApplicationModel, String> {

	public void getById(int id);
}

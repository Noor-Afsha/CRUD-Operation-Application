package com.ApplicationForms.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApplicationForms.project.model.MaintenanceTable;

@Repository
public interface MaintenaceRepository extends JpaRepository<MaintenanceTable, String> {

	//blic MaintenanceTable getById(String id);
}

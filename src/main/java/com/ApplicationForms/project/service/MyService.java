package com.ApplicationForms.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApplicationForms.project.dto.ApiResponse;
import com.ApplicationForms.project.model.ApplicationDocument;
import com.ApplicationForms.project.model.ApplicationModel;
import com.ApplicationForms.project.model.ApplicatonImage;
import com.ApplicationForms.project.model.MaintenanceTable;
import com.ApplicationForms.project.repository.ApplicatonImageRepository;
import com.ApplicationForms.project.repository.MaintenaceRepository;
import com.ApplicationForms.project.repository.MyRepository;

@Service
public class MyService {

	@Autowired
	private MyRepository myRepository;

	@Autowired
	private MaintenaceRepository maintenaceRepository;

	public ApiResponse saveService(ApplicationModel applicationModel) {
		System.out.println("save service method is executed");
		myRepository.save(applicationModel);
		return null;
	}

	public Optional<ApplicationModel> getService(String id) {
		System.out.println("get service is executed");
		Optional<ApplicationModel> applicationModel = myRepository.findById(id);
		return applicationModel;
	}

	public ApiResponse deleteAllService() {
		myRepository.deleteAll();
		return null;
	}

	public String deleteByIdService(String id) {
		myRepository.deleteById(id);
		return "record deleted by id";
	}

	public void updateService(ApplicationModel applicationModel) {
		myRepository.save(applicationModel);

	}

	public void updateById(String id) {

		Optional<ApplicationModel> applicationModel1 = myRepository.findById(id);
		ApplicationModel am = applicationModel1.get();
		am.setFirstNme("dhcsg");
		am.setLastName("hu");
		am.setEmail("jhgfue");

		List<ApplicatonImage> am1 = am.getApplicatonImages();
		am1.stream().forEach(res -> {
			res.setImageData("jh");

		});

		List<ApplicationDocument> am2 = am.getApplicationDocument();
		am2.stream().forEach(res -> {
			res.setDocumentData("gtfh");

		});
		am.setApplicatonImages(am1);
		am.setApplicationDocument(am2);
		myRepository.save(am);
	}

	public Optional<MaintenanceTable> listOfCityService(String id) {
		System.out.println("list of maintenance table is executed");
		Optional<MaintenanceTable> optional = maintenaceRepository.findById(id);
		return optional;
	}

	public List<MaintenanceTable> findAllService() {
		return maintenaceRepository.findAll();
	}

}
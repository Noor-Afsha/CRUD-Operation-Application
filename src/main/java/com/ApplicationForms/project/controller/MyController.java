package com.ApplicationForms.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApplicationForms.project.dto.ApiResponse;
import com.ApplicationForms.project.model.ApplicationModel;
import com.ApplicationForms.project.model.MaintenanceTable;
import com.ApplicationForms.project.service.MyService;

@RestController
@RequestMapping("/Application")
public class MyController {
	@Autowired
	private MyService myService;

	@PostMapping("/save")
	public ApiResponse saveCntroller(@RequestBody ApplicationModel apiApplicationModel) {
		return myService.saveService(apiApplicationModel);

	}

	@GetMapping("/get/{id}")
	public Optional<ApplicationModel> getbyIdController(@PathVariable String id) {
		return myService.getService(id);
	}

	@DeleteMapping("/delete")
	public String deleteAllController() {
		myService.deleteAllService();
		return (" all records deleted successsfully");
	}

	@DeleteMapping("/delete/{id}")
	public String deleteByIdController(@PathVariable String id) {
		myService.deleteByIdService(id);
		return ("Record deleted by id");
	}

	@PutMapping("/update")
	public String updateController(@RequestBody ApplicationModel applicationModel) {
		myService.updateService(applicationModel);
		return "record updated successfully";

	}

	@GetMapping("/update/{id}")
	public void updateByIdController(@PathVariable String id) {
		myService.updateById(id);
	}

	@GetMapping("/list/{id}")
	public Optional<MaintenanceTable> listOfCityController(@PathVariable String id) {
		return myService.listOfCityService(id);
	}

	@GetMapping("findAll")
	public List<MaintenanceTable> findallController() {
		return myService.findAllService();
	}

}

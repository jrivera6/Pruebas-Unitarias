package com.tecsup.gestion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.gestion.model.Departments;
import com.tecsup.gestion.services.DepartmentsService;

public class DepartmentsController {

private static final Logger logger = LoggerFactory.getLogger(DepartmentsController.class);
	
	@Autowired
	private DepartmentsService departmentsService;
	
	@GetMapping("/{department_id}")
	public ModelAndView home(@PathVariable int department_id, ModelMap model) {

		ModelAndView modelAndView = null;
		System.out.println("demo2");
		Departments dep = new Departments();
		try {
			dep = departmentsService.find(department_id);
			System.out.println("demo");
			logger.info(dep.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		modelAndView = new ModelAndView("home", "command", dep);

		return modelAndView;
	}
	
}

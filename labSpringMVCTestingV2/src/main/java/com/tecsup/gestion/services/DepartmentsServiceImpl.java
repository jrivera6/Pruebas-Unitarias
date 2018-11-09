package com.tecsup.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Departments;
import com.tecsup.gestion.repository.DepartmentsDAO;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {

	@Autowired
	private DepartmentsDAO departmentsDAO;

	@Override
	public Departments find(int department_id) throws DAOException, EmptyResultException {
		
		Departments dep = departmentsDAO.findDepartmens(department_id);

		return dep;
	}
	
}

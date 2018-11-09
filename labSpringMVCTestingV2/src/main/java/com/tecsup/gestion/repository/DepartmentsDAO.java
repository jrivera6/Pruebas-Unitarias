package com.tecsup.gestion.repository;



import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Departments;


public interface DepartmentsDAO {

	Departments findDepartmens(int id) throws DAOException, EmptyResultException;
	
	Departments create(String name,String description, String city) throws DAOException, EmptyResultException;

	
}

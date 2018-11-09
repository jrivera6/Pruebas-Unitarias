package com.tecsup.gestion.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Departments;
import com.tecsup.gestion.util.mapper.DepartmentsMapper;


@Repository
public class DepartmentsDAOImpl implements DepartmentsDAO{

	private static final Logger logger = LoggerFactory.getLogger(DepartmentsDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Departments findDepartmens(int department_id) throws DAOException, EmptyResultException {
		String query = "SELECT department_id, name, description, city"
				+ " FROM departments WHERE department_id = ?";
		
		Object[] params = new Object[] {department_id};
		
		try {
			Departments dep = (Departments)jdbcTemplate.queryForObject(query, params, new DepartmentsMapper());
			return dep;
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Departments create(String name, String description, String city) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}
	
}

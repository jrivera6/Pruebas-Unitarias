package com.tecsup.gestion.util.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Departments;

public class DepartmentsMapper implements RowMapper<Departments>{

	public Departments mapRow(ResultSet rs, int rowNum) throws SQLException {
		Departments dep = new Departments();
		dep.setDepartment_id(rs.getInt("department_id"));
		dep.setName(rs.getString("name"));
		dep.setDescription(rs.getString("description"));
		dep.setCity(rs.getString("city"));
		return dep;
	}
	
}

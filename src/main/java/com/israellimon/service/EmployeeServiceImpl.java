package com.israellimon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.israellimon.dao.EmployeeDao;
import com.israellimon.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> listEmployee(){
		return this.employeeDao.listEmployee();
	}
}

package Zh1Cheung.mapper.services;

import java.util.List;

import Zh1Cheung.mapper.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Zh1Cheung.mapper.mappers.EmployeeMapper;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;

	public List<Employee> getAll() {
		return employeeMapper.selectAll();
	}

	public void batchUpdateEmp(List<Employee> empList) {
		employeeMapper.batchUpdate(empList);
	}

}

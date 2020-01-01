package Zh1Cheung.mapper.services;

import java.util.List;

import Zh1Cheung.mapper.entities.Employee;
import Zh1Cheung.mapper.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;

	public List<Employee> getAll() {
		return employeeMapper.selectAll();
	}

}

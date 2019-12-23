package Zh1Cheung.mybatis.dao;


import java.util.List;

import Zh1Cheung.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	

}

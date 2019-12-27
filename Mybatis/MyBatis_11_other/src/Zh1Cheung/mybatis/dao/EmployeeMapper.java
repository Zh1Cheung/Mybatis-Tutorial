package Zh1Cheung.mybatis.dao;

import java.util.List;

import Zh1Cheung.mybatis.bean.Employee;
import Zh1Cheung.mybatis.bean.OraclePage;

public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
	
	public List<Employee> getEmps();
	
	public Long addEmp(Employee employee);
	
	public void getPageByProcedure(OraclePage page);
}

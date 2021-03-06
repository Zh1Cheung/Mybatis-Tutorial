package Zh1Cheung.mapper.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Zh1Cheung.mapper.entities.Employee;
import Zh1Cheung.mapper.services.EmployeeService;

public class MyBatchUpdateTest {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("spring-context.xml");
		
		EmployeeService employeeService = iocContainer.getBean(EmployeeService.class);
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(25, "newName01", 111.11, 10));
		empList.add(new Employee(26, "newName02", 222.22, 20));
		empList.add(new Employee(27, "newName03", 333.33, 30));
		
		employeeService.batchUpdateEmp(empList);
		
		iocContainer.close();
	}

}

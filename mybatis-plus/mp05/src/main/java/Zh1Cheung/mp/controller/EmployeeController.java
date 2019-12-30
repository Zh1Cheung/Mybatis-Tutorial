package Zh1Cheung.mp.controller;


import Zh1Cheung.mp.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
//	public String  login() {
//		
//		//employeeService.select
//	}
}


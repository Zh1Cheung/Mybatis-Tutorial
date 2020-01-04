package Zh1Cheung.mybatis.services;

import java.util.List;

import Zh1Cheung.mybatis.entities.Department;
import Zh1Cheung.mybatis.mappers.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	public List<Department> getAll() {
		return departmentMapper.selectAll();
	}

}

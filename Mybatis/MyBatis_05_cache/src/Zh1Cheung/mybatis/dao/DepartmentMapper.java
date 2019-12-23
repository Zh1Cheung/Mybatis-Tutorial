package Zh1Cheung.mybatis.dao;

import Zh1Cheung.mybatis.bean.Department;

public interface DepartmentMapper {
	
	public Department getDeptById(Integer id);
	
	public Department getDeptByIdPlus(Integer id);

	public Department getDeptByIdStep(Integer id);
}

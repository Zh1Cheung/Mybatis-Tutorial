package Zh1Cheung.mp.mapper;

import Zh1Cheung.mp.beans.Employee;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
public interface EmployeeMapper extends BaseMapper<Employee> {
	
	int  deleteAll();
}

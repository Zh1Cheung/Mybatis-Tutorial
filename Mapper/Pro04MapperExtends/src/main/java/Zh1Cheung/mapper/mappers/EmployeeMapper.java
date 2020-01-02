package Zh1Cheung.mapper.mappers;

import Zh1Cheung.mapper.entities.Employee;
import Zh1Cheung.mapper.mine_mappers.MyMapper;
import org.apache.ibatis.annotations.CacheNamespace;

@CacheNamespace
public interface EmployeeMapper extends MyMapper<Employee> {

}
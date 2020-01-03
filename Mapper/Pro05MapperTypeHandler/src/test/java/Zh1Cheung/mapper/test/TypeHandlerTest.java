package Zh1Cheung.mapper.test;

import Zh1Cheung.mapper.entities.SeasonEnum;
import Zh1Cheung.mapper.services.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Zh1Cheung.mapper.entities.Address;
import Zh1Cheung.mapper.entities.User;

public class TypeHandlerTest {
	
	private UserService userService;
	
	{
		userService = new ClassPathXmlApplicationContext("spring-context.xml").getBean(UserService.class);
	}
	
	@Test
	public void testQueryUser() {
		
		Integer userId = 8;
		
		User user = userService.getUserById(userId);
		
		System.out.println(user);
	}
	
	@Test
	public void testSaveUser() {
		
		User user = new User(null, "tom08", new Address("AAA", "BBB", "CCC"), SeasonEnum.AUTUMN);
		
		userService.saveUser(user);
		
	}

}

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pojo.po.Student;
import com.pojo.po.User;
import com.service.IStudentService;
import com.service.IUserService;

/**
 * 加入Junit 测试代码  动态加载spring配置文件。
 * @author wallace.lee
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/resources/springConfig-core.xml")
public class UserDaoTest extends AbstractJUnit4SpringContextTests {
	
	 @Resource
	 private IUserService  userService;
	 @Resource
	 private  IStudentService  studentService;
	 
	 @Test
	 public void saveTest(){
		 User  user = new User();
		 
		 user.setId(6);
		 user.setName("lihamin");
		 user.setSex("1");
		 userService.add(user);
	 }
	 
	 @Test
	 public void findAll(){
		List<User> users =  userService.findAll();
		
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			
			System.out.println("User_ID:"+user.getId()+"userName"+user.getName()+"userSex:"+user.getSex());
		}
	 }
	 
	 
	 

	 
	 @Test
	 public void  studentService(){
		 Student  student = new Student();
		 
		 student.setId(5);
		 student.setName("众人找");
		 student.setCard("asdfa");
		 studentService.add(student);
	 }
	 

}

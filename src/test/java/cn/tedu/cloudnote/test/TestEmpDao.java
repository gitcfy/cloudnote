package cn.tedu.cloudnote.test;

import org.junit.Before;
import org.junit.Test;

import cn.tedu.cloudnote.dao.EmpDao;
import cn.tedu.cloudnote.entity.Emp;

public class TestEmpDao extends TestBase{

	private EmpDao empDao;
	@Before
	public void init(){
		empDao = super.getContext().getBean("empDao",EmpDao.class);
		
	}
	@Test
	public void testSave(){
		Emp emp = new Emp();
		emp.setName("Mike");
		emp.setAge(21);
		
		int n = empDao.save(emp);
		System.out.println(n);
		System.out.println(emp.getId());
	}
}

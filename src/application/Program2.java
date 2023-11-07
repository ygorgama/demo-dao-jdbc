package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); 
		Department department = new Department(null, "Engenharia");
		
//		System.out.println("--------- TESTE 1 --------");
//		departmentDao.insert(department);
//		System.out.println("Department " + department.getId() + " inserted");
		
//		System.out.println("--------- TESTE 2 --------");
//		department.setName("Festas"); 
//		departmentDao.update(department);
//		System.out.println("Updated completed!");
		
//		System.out.println("--------- TESTE 3 --------"); 
//		departmentDao.deleteById(5);
//		System.out.println("Deleted ocurred with sucess!");
		
		
		
		System.out.println("--------- TESTE 4 --------");
		department = departmentDao.findById(3);
		
		System.out.println(department);
	}
}

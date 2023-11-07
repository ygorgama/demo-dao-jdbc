package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao(); 
		Department department = new Department(5, "Engenharia");
		
//		System.out.println("--------- TESTE 1 --------");
//		departmentDao.insert(department);
//		System.out.println("Department " + department.getId() + " inserted");
		
		System.out.println("--------- TESTE 2 --------");
		department.setName("Festas"); 
		departmentDao.update(department);
		System.out.println("Updated completed!");
	}
}

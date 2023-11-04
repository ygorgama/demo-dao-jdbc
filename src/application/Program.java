package application;

import java.time.LocalDateTime;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		Department obj = new Department(1 , "Department");
		Seller obj2 = new Seller(21, "Bob", "bob@gmail.com", LocalDateTime.now(), 3000.00, obj);
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
	}
}

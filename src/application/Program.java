package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findAll();
//		seller = sellerDao.findById(1);
//		seller.setName("Martha Wayne");
//		sellerDao.update(seller);
		
		seller = sellerDao.findById(8);
		sellerDao.deleteById(seller);
		System.out.println("Deleted element");
	}
}

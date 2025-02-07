package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("==== Test 1: seller finfById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("==== Test 2: seller findByDepaetment =====");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
       for (Seller s : sellers) {
           System.out.println(s);
       }

        System.out.println("==== Test 3: seller findAll =====");
        sellers = sellerDao.findAll();
        for (Seller s : sellers) {
            System.out.println(s);
        }


    }
}
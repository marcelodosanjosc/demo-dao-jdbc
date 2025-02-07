package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
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
        /*System.out.println("==== Test 4: seller insert =====");
        Seller newSeller = new Seller( null,"Marcos", "marcos@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted: " + newSeller.getId());*/

        System.out.println("==== Test 5: seller update ====");
        seller = sellerDao.findById(1);
        seller.setName("Maria");
        sellerDao.update(seller);
        System.out.println(seller);
    }
}
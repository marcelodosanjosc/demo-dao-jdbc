package application;

import model.dao.DaoFactory;
import model.dao.DepatmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepatmentDao dao = DaoFactory.creatDepatmentDao();

        System.out.println("==== Test 1: department finfById ====");
        Department dep = dao.findById(2);
        System.out.println(dep);
        System.out.println();

        System.out.println("==== Test 2: department finfAll ====");
        List<Department> deps = dao.findAll();
        for (Department d : deps) {
            System.out.println(d);
        }
        System.out.println();

        System.out.println("==== Test 3: department inser ====");
        Department newDep = new Department(null,"Music");
        dao.insert(newDep);
        System.out.println("Inserted: " + newDep.getId() );
        System.out.println();
        System.out.println("==== Test 4: department update ====");
        dep = dao.findById(6);
        dep.setName("Som");
        dao.update(dep);
        System.out.println("Updated: " + dep);
        System.out.println();

        System.out.println("==== Test 5: department delete ====");
        dao.deleteById(5);
        System.out.println("deleted component");
        System.out.println();
    }

}

package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    private static SellerDao creatSellerDao() {
        return new SellerDaoJDBC();
    }
}

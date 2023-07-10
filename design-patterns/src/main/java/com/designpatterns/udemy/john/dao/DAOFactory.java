package com.designpatterns.udemy.john.dao;

public interface DAOFactory {

    int MYSQL = 0;
    int ORACLE = 1;

    PersonDAO getPersonDAO();

    static DAOFactory getDAOFactory(int type){
        return switch (type) {
            case 0 -> new MySqlDAOFactory();
            case 1 -> new OracleDAOFactory();
            default -> null;
        };
    }

}

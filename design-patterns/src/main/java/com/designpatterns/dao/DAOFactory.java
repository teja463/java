package com.designpatterns.dao;

public interface DAOFactory {

    public static int MYSQL = 0;
    public static int ORACLE = 1;

    PersonDAO getPersonDAO();

    static DAOFactory getDAOFactory(int type){
        switch (type){
            case 0:
                return new MySqlDAOFactory();
            case 1:
                return new OracleDAOFactory();
            default:
                return null;
        }
    }

}

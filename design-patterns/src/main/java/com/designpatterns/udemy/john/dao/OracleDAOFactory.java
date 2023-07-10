package com.designpatterns.udemy.john.dao;

public class OracleDAOFactory implements DAOFactory {

    public OraclePersonDAO getPersonDAO(){
        return new OraclePersonDAO();
    }


}

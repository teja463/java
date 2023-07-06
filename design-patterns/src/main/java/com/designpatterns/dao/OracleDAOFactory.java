package com.designpatterns.dao;

public class OracleDAOFactory implements DAOFactory {

    public OraclePersonDAO getPersonDAO(){
        return new OraclePersonDAO();
    }


}

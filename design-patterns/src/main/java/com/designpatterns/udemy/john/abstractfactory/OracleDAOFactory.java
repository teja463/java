package com.designpatterns.udemy.john.abstractfactory;

public class OracleDAOFactory implements DAOFactory {

    public OraclePersonDAO getPersonDAO(){
        return new OraclePersonDAO();
    }


}

package com.designpatterns.dao;

public class MySqlDAOFactory implements DAOFactory {

    public MySqlPersonDAO getPersonDAO(){
        return new MySqlPersonDAO();
    }


}

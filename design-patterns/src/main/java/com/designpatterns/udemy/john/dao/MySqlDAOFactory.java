package com.designpatterns.udemy.john.dao;

public class MySqlDAOFactory implements DAOFactory {

    public MySqlPersonDAO getPersonDAO(){
        return new MySqlPersonDAO();
    }


}

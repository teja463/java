package com.designpatterns.udemy.john.abstractfactory;

public class MySqlDAOFactory implements DAOFactory {

    public MySqlPersonDAO getPersonDAO(){
        return new MySqlPersonDAO();
    }


}

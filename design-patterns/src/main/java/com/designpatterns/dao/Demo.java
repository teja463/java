package com.designpatterns.dao;

public class Demo {

    public static void main(String[] args) {

        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        PersonDAO personDAO = daoFactory.getPersonDAO();
        personDAO.addPerson(new Person(null, "Teja", "teja463@gmail.com"));

        DAOFactory daoFactory1 = DAOFactory.getDAOFactory(DAOFactory.ORACLE);
        PersonDAO personDAO1 = daoFactory1.getPersonDAO();
        personDAO1.addPerson(new Person(null, "Teja", "teja463@gmail.com"));

    }
}

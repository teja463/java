package com.designpatterns.journaldev.structural.facade;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getConnection(){
        return null;
    }

    public void generateHTMLReport(String table, Connection con){
        System.out.println("Oracle Generating HTML report for " + table);
    }

    public void generatePDFReport(String table, Connection con){
        System.out.println("Oracle Generating PDF report for " + table);
    }
}

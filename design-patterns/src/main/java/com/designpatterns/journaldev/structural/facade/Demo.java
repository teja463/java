package com.designpatterns.journaldev.structural.facade;

import java.sql.Connection;

public class Demo {

    public static void main(String[] args) {
        // Without facade
        Connection connection = MySqlHelper.getConnection();
        MySqlHelper mysql = new MySqlHelper();
        mysql.generateHTMLReport("User", connection);

        Connection oracle = OracleHelper.getConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generatePDFReport("Employee", oracle);

        //With Facade
        DatabaseFacade.generateReport(DatabaseFacade.DatabaseType.MYSQL, DatabaseFacade.ReportType.PDF, "User" );
        DatabaseFacade.generateReport(DatabaseFacade.DatabaseType.ORACLE, DatabaseFacade.ReportType.HTML, "User" );
    }
}

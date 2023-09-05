package com.designpatterns.journaldev.structural.facade;

import java.sql.Connection;

public class DatabaseFacade {

    public static void generateReport(DatabaseType dbType, ReportType reportType, String tableName){
        switch (dbType){
            case MYSQL -> {
                Connection connection = MySqlHelper.getConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                if (reportType.equals(ReportType.PDF)) {
                    mySqlHelper.generatePDFReport(tableName, connection);
                }else{
                    mySqlHelper.generateHTMLReport(tableName, connection);
                }
            }
            case ORACLE -> {
                Connection connection = OracleHelper.getConnection();
                OracleHelper oracleHelper = new OracleHelper();
                if (reportType.equals(ReportType.PDF)) {
                    oracleHelper.generatePDFReport(tableName, connection);
                }else{
                    oracleHelper.generateHTMLReport(tableName, connection);
                }
            }
        }
    }

    public static enum ReportType{
        HTML, PDF
    }

    public static enum DatabaseType{
        MYSQL, ORACLE
    }
}

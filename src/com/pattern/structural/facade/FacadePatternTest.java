package com.pattern.structural.facade;

/**
 * Facade design pattern is more like a helper for client applications. 
 * It doesn't hide subsystem interfaces from the client. 
 * Whether to use Facade or not is completely dependent on client code.
 * @author Samuel
 */
public class FacadePatternTest {
	public static void main(String[] args) {
		String tableName="Employee";
		
//		//generating MySql HTML report and Oracle PDF report without using Facade
//		Connection con = MySqlHelper.getMySqlDBConnection();
//		MySqlHelper mySqlHelper = new MySqlHelper();
//		mySqlHelper.generateMySqlHTMLReport(tableName, con);
//		
//		Connection con1 = OracleHelper.getOracleDBConnection();
//		OracleHelper oracleHelper = new OracleHelper();
//		oracleHelper.generateOraclePDFReport(tableName, con1);
		
		//generating MySql HTML report and Oracle PDF report using Facade
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}
}

package com.flipkart.Data;



public class LoginData {

	private static String number;
	private static String password;
	
	public LoginData(){
		ReadExcelFile file;
		try{
			file=new ReadExcelFile();
			Object[][] data=file.getExcelData("E:\\Programs", "Data.xlsx", "Sheet1");
			number=data[1][0].toString();
			password=data[1][1].toString();
//          to get String representation of an object
		System.out.println(number);
		System.out.println(password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getNum(){
		return number;
	}
	public String getpass(){
		return password;
	}
	
}

package testcase;

import java.io.IOException;

import dataeng.exceldata;
import keyword.objden;

public class driverscrp {


public class DriverScrp {
	
	public void main(String[] args) throws InterruptedException {
	
		exceldata da=new exceldata();
		exceldata dak=new exceldata();
		objden idm=new objden();
		try {
			da.Excel("C:\\Users\\BLTuser.BLT1208\\Desktop\\Keyword\\Tot.xlsx ");
			dak.Excel("C:\\Users\\BLTuser.BLT1208\\Desktop\\Keyword\\Keyword.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i=0;i<=da.rowco();i++)
		{
		 String SearchString=da.getCellVa(i,0);
		
		for (int j=1;j<=dak.rowco();j++)
		{
		 String keyword1=dak.getCellVa(j,2);
		 if (keyword1.equalsIgnoreCase("OpenBrow"))
		 {
			 Thread.sleep(3500);
			idm.OpenBrow(); 
		 }
		 else if (keyword1.equalsIgnoreCase("SetUrl"))
			 
		 {
			 Thread.sleep(3500);
			 idm.SetUrl();
		 }
		 else if(keyword1.equalsIgnoreCase("Search"))
		 {
			 Thread.sleep(3500);
			 idm.Search(SearchString);
		 }
		 
		 else if (keyword1.equalsIgnoreCase("closeBrow"))
		 {
			 Thread.sleep(3500);
			 idm.closeBrow();
		 }
		}
		}
	}

}}

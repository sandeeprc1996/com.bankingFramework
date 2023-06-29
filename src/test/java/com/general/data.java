package com.general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data 
{
	public static String  fretch (String sh,int r,int c) throws FileNotFoundException
	{
		String value=null;
		FileInputStream fr= new FileInputStream("./Excel/com.data.xlsx");
		try {
			 value = WorkbookFactory.create(fr).getSheet(sh).getRow(r).getCell(r).toString();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return value;
}}

package erznskutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import erznskutil.logic.CountFfomsXmlRab;
import erznskutil.logic.ErrorGoznak;

public class Excel {
	
	String countFfomsXmlRab = "D:\\Erz2\\ErzNsk\\files\\КоличествоРаботающихПоДате.xls";
	
	public void writeCountFfomsXmlRab(List<CountFfomsXmlRab> countFfomsXmlRabList) throws FileNotFoundException, IOException
	{
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(countFfomsXmlRab));
		HSSFWorkbook wb = new HSSFWorkbook(fs);	
		
		HSSFSheet sheet = wb.getSheetAt(0);		
		HSSFRow excelRow = null;
		HSSFCell excelCell = null;
		
		int rows = sheet.getPhysicalNumberOfRows();
		for(int i = 1; i < rows ; i++) {
			excelRow = sheet.createRow(i);
			sheet.removeRow(excelRow);
		}
			
		rows = countFfomsXmlRabList.size();
		for(int i = 1; i < rows ; i++) {
			excelRow = sheet.createRow(i);
			excelRow = sheet.getRow(i);			
			excelCell = excelRow.createCell(0);
			excelCell = excelRow.getCell(0);
			excelCell.setCellValue(countFfomsXmlRabList.get(i).getData().substring(0, 10));
			excelCell = excelRow.createCell(1);
			excelCell = excelRow.getCell(1);
			excelCell.setCellValue(countFfomsXmlRabList.get(i).getCount());
		} 

		FileOutputStream fileOut = new FileOutputStream(countFfomsXmlRab);
		wb.write(fileOut);
		fileOut.close();
	}
	
	public void writeErrorGoznak(List<ErrorGoznak> errorGoznakList, String fileName) throws FileNotFoundException, IOException
	{
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(fileName));
		HSSFWorkbook wb = new HSSFWorkbook(fs);	
		
		HSSFSheet sheet = wb.getSheetAt(0);		
		HSSFRow excelRow = null;
		HSSFCell excelCell = null;
		
		int rows = sheet.getPhysicalNumberOfRows();
		for(int i = 0; i < rows ; i++) {
			excelRow = sheet.createRow(i + 1);
			sheet.removeRow(excelRow);
		}
			
		rows = errorGoznakList.size();
		for(int i = 0; i < rows ; i++) {
			excelRow = sheet.createRow(i + 1);
			excelRow = sheet.getRow(i + 1);			
			excelCell = excelRow.createCell(0);
			excelCell = excelRow.getCell(0);
			excelCell.setCellValue(errorGoznakList.get(i).getENP_CALC());
			
			excelCell = excelRow.createCell(1);
			excelCell = excelRow.getCell(1);
			excelCell.setCellValue(errorGoznakList.get(i).getENP_OUTPUT());
			excelCell = excelRow.createCell(2);
			excelCell = excelRow.getCell(2);
			excelCell.setCellValue(errorGoznakList.get(i).getDF());
			excelCell = excelRow.createCell(3);
			excelCell = excelRow.getCell(3);
			excelCell.setCellValue(errorGoznakList.get(i).getPACK_ID());
			excelCell = excelRow.createCell(4);
			excelCell = excelRow.getCell(4);
			excelCell.setCellValue(errorGoznakList.get(i).getSTATUS());
			excelCell = excelRow.createCell(5);
			excelCell = excelRow.getCell(5);
			excelCell.setCellValue(errorGoznakList.get(i).getENP_FFOMS());

			excelCell = excelRow.createCell(6);
			excelCell = excelRow.getCell(6);
			excelCell.setCellValue(errorGoznakList.get(i).getOKATO_FFOMS());
			excelCell = excelRow.createCell(7);
			excelCell = excelRow.getCell(7);
			excelCell.setCellValue(errorGoznakList.get(i).getPRIM());
			excelCell = excelRow.createCell(8);
			excelCell = excelRow.getCell(8);
			excelCell.setCellValue(errorGoznakList.get(i).getTAG());
			excelCell = excelRow.createCell(9);
			excelCell = excelRow.getCell(9);
			excelCell.setCellValue(errorGoznakList.get(i).getERR());
			excelCell = excelRow.createCell(10);
			excelCell = excelRow.getCell(10);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_SURNAME());
			
			excelCell = excelRow.createCell(11);
			excelCell = excelRow.getCell(11);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_KINDFIRSTNAME());
			excelCell = excelRow.createCell(12);
			excelCell = excelRow.getCell(12);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_KINDLASTNAME());
			excelCell = excelRow.createCell(13);
			excelCell = excelRow.getCell(13);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_BIRTHDAY());
			excelCell = excelRow.createCell(14);
			excelCell = excelRow.getCell(14);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_ADDRESSID());
			excelCell = excelRow.createCell(15);
			excelCell = excelRow.getCell(15);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_SERPOLICY());
			
			excelCell = excelRow.createCell(16);
			excelCell = excelRow.getCell(16);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_NUMPOLICY());
			excelCell = excelRow.createCell(17);
			excelCell = excelRow.getCell(17);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_SEX());
			excelCell = excelRow.createCell(18);
			excelCell = excelRow.getCell(18);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_SERDOC());
			excelCell = excelRow.createCell(19);
			excelCell = excelRow.getCell(19);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_NUMDOC());
			excelCell = excelRow.createCell(20);
			excelCell = excelRow.getCell(20);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_REGNUMBER());
			
			excelCell = excelRow.createCell(21);
			excelCell = excelRow.getCell(21);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_LINKSMOESTABLISHMENTID());
			excelCell = excelRow.createCell(22);
			excelCell = excelRow.getCell(22);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_ESTABLISHMENTAMBUL());
			excelCell = excelRow.createCell(23);
			excelCell = excelRow.getCell(23);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_DATECHANGE());
			excelCell = excelRow.createCell(24);
			excelCell = excelRow.getCell(24);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_ESTABLISHMENTDENT());
			excelCell = excelRow.createCell(25);
			excelCell = excelRow.getCell(25);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_SOCIALID());
			
			excelCell = excelRow.createCell(26);
			excelCell = excelRow.getCell(26);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_STATUSID());
			excelCell = excelRow.createCell(27);
			excelCell = excelRow.getCell(27);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_DOCPERSONID());
			excelCell = excelRow.createCell(28);
			excelCell = excelRow.getCell(28);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_INSPECTION());
			excelCell = excelRow.createCell(29);
			excelCell = excelRow.getCell(29);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_OPERATION());
			excelCell = excelRow.createCell(30);
			excelCell = excelRow.getCell(30);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_STATUSREC());
			
			excelCell = excelRow.createCell(31);
			excelCell = excelRow.getCell(31);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_OUTID());
			excelCell = excelRow.createCell(32);
			excelCell = excelRow.getCell(32);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_INSPECTORID());
			excelCell = excelRow.createCell(33);
			excelCell = excelRow.getCell(33);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_ESTABLISHMENTID());
			excelCell = excelRow.createCell(34);
			excelCell = excelRow.getCell(34);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_DATEPOLICY());
			excelCell = excelRow.createCell(35);
			excelCell = excelRow.getCell(35);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSON_DATEINPUT());
			
			excelCell = excelRow.createCell(36);
			excelCell = excelRow.getCell(36);
			excelCell.setCellValue(errorGoznakList.get(i).getENP_IN());
			excelCell = excelRow.createCell(37);
			excelCell = excelRow.getCell(37);
			excelCell.setCellValue(errorGoznakList.get(i).getSMO_OLD());
			excelCell = excelRow.createCell(38);
			excelCell = excelRow.getCell(38);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSONADD_ADDRESSID());
			excelCell = excelRow.createCell(39);
			excelCell = excelRow.getCell(39);
			excelCell.setCellValue(errorGoznakList.get(i).getPERSONADD_PRIM());
			excelCell = excelRow.createCell(40);
			excelCell = excelRow.getCell(40);
			excelCell.setCellValue(errorGoznakList.get(i).getSNILS());
			
			excelCell = excelRow.createCell(41);
			excelCell = excelRow.getCell(41);
			excelCell.setCellValue(errorGoznakList.get(i).getBORN());
			excelCell = excelRow.createCell(42);
			excelCell = excelRow.getCell(42);
			excelCell.setCellValue(errorGoznakList.get(i).getDATEPASSPORT());
			excelCell = excelRow.createCell(43);
			excelCell = excelRow.getCell(43);
			excelCell.setCellValue(errorGoznakList.get(i).getRUSSIAN());
			excelCell = excelRow.createCell(44);
			excelCell = excelRow.getCell(44);
			excelCell.setCellValue(errorGoznakList.get(i).getTELEDOM());
			excelCell = excelRow.createCell(45);
			excelCell = excelRow.getCell(45);
			excelCell.setCellValue(errorGoznakList.get(i).getTELEWORK());
			
			excelCell = excelRow.createCell(46);
			excelCell = excelRow.getCell(46);
			excelCell.setCellValue(errorGoznakList.get(i).getEMAIL());
			excelCell = excelRow.createCell(47);
			excelCell = excelRow.getCell(47);
			excelCell.setCellValue(errorGoznakList.get(i).getTELE2());
			excelCell = excelRow.createCell(48);
			excelCell = excelRow.getCell(48);
			excelCell.setCellValue(errorGoznakList.get(i).getDOK_VI());
			excelCell = excelRow.createCell(49);
			excelCell = excelRow.getCell(49);
			excelCell.setCellValue(errorGoznakList.get(i).getENP());
			excelCell = excelRow.createCell(50);
			excelCell = excelRow.getCell(50);
			excelCell.setCellValue(errorGoznakList.get(i).getZA());
			
			excelCell = excelRow.createCell(51);
			excelCell = excelRow.getCell(51);
			excelCell.setCellValue(errorGoznakList.get(i).getZAD());
			excelCell = excelRow.createCell(52);
			excelCell = excelRow.getCell(52);
			excelCell.setCellValue(errorGoznakList.get(i).getZAP());
			excelCell = excelRow.createCell(53);
			excelCell = excelRow.getCell(53);
			excelCell.setCellValue(errorGoznakList.get(i).getPRED());
			excelCell = excelRow.createCell(54);
			excelCell = excelRow.getCell(54);
			excelCell.setCellValue(errorGoznakList.get(i).getD_V());
			excelCell = excelRow.createCell(55);
			excelCell = excelRow.getCell(55);
			excelCell.setCellValue(errorGoznakList.get(i).getD_SER());
			
			excelCell = excelRow.createCell(56);
			excelCell = excelRow.getCell(56);
			excelCell.setCellValue(errorGoznakList.get(i).getD_NUM());
			excelCell = excelRow.createCell(57);
			excelCell = excelRow.getCell(57);
			excelCell.setCellValue(errorGoznakList.get(i).getD_DATE());
			excelCell = excelRow.createCell(58);
			excelCell = excelRow.getCell(58);
			excelCell.setCellValue(errorGoznakList.get(i).getMETHOD());
			excelCell = excelRow.createCell(59);
			excelCell = excelRow.getCell(59);
			excelCell.setCellValue(errorGoznakList.get(i).getPETITION());
			excelCell = excelRow.createCell(60);
			excelCell = excelRow.getCell(60);
			excelCell.setCellValue(errorGoznakList.get(i).getFPOLIC());
			
			excelCell = excelRow.createCell(61);
			excelCell = excelRow.getCell(61);
			excelCell.setCellValue(errorGoznakList.get(i).getPR_FAM());
			excelCell = excelRow.createCell(62);
			excelCell = excelRow.getCell(62);
			excelCell.setCellValue(errorGoznakList.get(i).getPR_IM());
			excelCell = excelRow.createCell(63);
			excelCell = excelRow.getCell(63);
			excelCell.setCellValue(errorGoznakList.get(i).getPR_OT());
			excelCell = excelRow.createCell(64);
			excelCell = excelRow.getCell(64);
			excelCell.setCellValue(errorGoznakList.get(i).getPR_TEL());
			excelCell = excelRow.createCell(65);
			excelCell = excelRow.getCell(65);
			excelCell.setCellValue(errorGoznakList.get(i).getPR_ADRES());			
			
			excelCell = excelRow.createCell(66);
			excelCell = excelRow.getCell(66);
			excelCell.setCellValue(errorGoznakList.get(i).getVS_NUM());
			excelCell = excelRow.createCell(67);
			excelCell = excelRow.getCell(67);
			excelCell.setCellValue(errorGoznakList.get(i).getVS_DATE());
			excelCell = excelRow.createCell(68);
			excelCell = excelRow.getCell(68);
			excelCell.setCellValue(errorGoznakList.get(i).getD1());
			excelCell = excelRow.createCell(69);
			excelCell = excelRow.getCell(69);
			excelCell.setCellValue(errorGoznakList.get(i).getD2());
			excelCell = excelRow.createCell(70);
			excelCell = excelRow.getCell(70);
			excelCell.setCellValue(errorGoznakList.get(i).getENP_DATE());	
			
			excelCell = excelRow.createCell(71);
			excelCell = excelRow.getCell(71);
			excelCell.setCellValue(errorGoznakList.get(i).getLAST_FAM());
			excelCell = excelRow.createCell(72);
			excelCell = excelRow.getCell(72);
			excelCell.setCellValue(errorGoznakList.get(i).getLAST_IM());
			excelCell = excelRow.createCell(73);
			excelCell = excelRow.getCell(73);
			excelCell.setCellValue(errorGoznakList.get(i).getLAST_OT());
			excelCell = excelRow.createCell(74);
			excelCell = excelRow.getCell(74);
			excelCell.setCellValue(errorGoznakList.get(i).getLAST_DR());

		} 

		FileOutputStream fileOut = new FileOutputStream(fileName);
		wb.write(fileOut);
		fileOut.close();
	}

}

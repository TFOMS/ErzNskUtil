package erznskutil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import erznskutil.dao.Factory;
import erznskutil.logic.CountFfomsXmlRab;
import erznskutil.logic.ErrorGoznak;

public class Report  {

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 * 1. что-то про работающих
	 * 2. Выгружаем из базы error_goznak и заполняем в таблицу excel
	 */
	
	
	
	public void runAll() {
    	try {
			//getCountFfomsXmlRab();
			getErrorGoznak();
		} catch (IOException e) {e.printStackTrace();}
    	
	}

	private void getCountFfomsXmlRab() throws FileNotFoundException, IOException {
		List<CountFfomsXmlRab> countFfomsXmlRabList = null;
		try {
			countFfomsXmlRabList = Factory.getInstance().getCountFfomsXmlRabDao().getAllCountFfomsXmlRab();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        new Excel().writeCountFfomsXmlRab(countFfomsXmlRabList);		
		for(int i = 0; i < countFfomsXmlRabList.size(); ++i) {
		        System.out.println("data : " + countFfomsXmlRabList.get(i).getData().substring(0, 10) + ", count : " + countFfomsXmlRabList.get(i).getCount());
		        System.out.println("=============================");
		}
	}
	
	private void getErrorGoznak() throws FileNotFoundException, IOException {
		List<ErrorGoznak> errorGoznakList = null;
		try {
			errorGoznakList = Factory.getInstance().getErrorGoznakDao().getAllErrorGoznak();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*
		FileInputStream fis;
        Properties property = new Properties();
 
        
        String patch=null;
        try {
            fis = new FileInputStream("erznskutil/patchXls.properties");
            property.load(fis);
 
            
            patch = property.getProperty("patchForXls");
 
            
 
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
 		*/
        new Excel().writeErrorGoznak(errorGoznakList, /*patch*/"C:\\java\\Erz2\\ErzNsk\\files\\ОшибкиГознака.xls");		
	}

	
	/*public static void main(String ar[]) {
		new Report().runAll();
	}*/
}

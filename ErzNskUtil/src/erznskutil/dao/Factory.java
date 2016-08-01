package erznskutil.dao;

import erznskutil.dao.impl.CountFfomsXmlRabDaoImpl;
import erznskutil.dao.impl.ErrorGoznakDaoImpl;

public class Factory {
       
       private static CountFfomsXmlRabDao countFfomsXmlRabDao = null;
       private static ErrorGoznakDao errorGoznakDao = null;
       private static Factory instance = null;

       public static synchronized Factory getInstance() {
             if(instance == null) {
               instance = new Factory();
             }
             return instance;
       }

       public CountFfomsXmlRabDao getCountFfomsXmlRabDao(){
             if(countFfomsXmlRabDao == null) {
            	 countFfomsXmlRabDao = new CountFfomsXmlRabDaoImpl();
             }
             return countFfomsXmlRabDao;
       }   
       
       public ErrorGoznakDao getErrorGoznakDao(){
           if(errorGoznakDao == null) {
        	   errorGoznakDao = new ErrorGoznakDaoImpl();
           }
           return errorGoznakDao;
     } 

}
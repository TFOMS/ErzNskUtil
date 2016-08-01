package erznskutil.dao;

import java.sql.SQLException;
import java.util.List;

import erznskutil.logic.CountFfomsXmlRab;

public interface CountFfomsXmlRabDao {
	
     public void addCountFfomsXmlRab(CountFfomsXmlRab countFfomsXmlRab) throws SQLException;
     
     public void updateCountFfomsXmlRab(CountFfomsXmlRab countFfomsXmlRab) throws SQLException;
     
     public CountFfomsXmlRab getCountFfomsXmlRabById(int id) throws SQLException;
     
     public List<CountFfomsXmlRab> getAllCountFfomsXmlRab() throws SQLException; 
     
     public void deleteCountFfomsXmlRab(CountFfomsXmlRab countFfomsXmlRab) throws SQLException;
}
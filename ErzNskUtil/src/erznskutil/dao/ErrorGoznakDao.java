package erznskutil.dao;

import java.sql.SQLException;
import java.util.List;

import erznskutil.logic.ErrorGoznak;

public interface ErrorGoznakDao {
	
     public List<ErrorGoznak> getAllErrorGoznak() throws SQLException; 
}
package erznskutil.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import erznskutil.dao.ErrorGoznakDao;
import erznskutil.logic.ErrorGoznak;
import erznskutil.util.HibernateUtil;

public class ErrorGoznakDaoImpl implements  ErrorGoznakDao {

    @SuppressWarnings("unchecked")
	public List<ErrorGoznak> getAllErrorGoznak() throws SQLException {
             Session session = null;
             List<ErrorGoznak> errorGoznak = new ArrayList<ErrorGoznak>();
             try {
                 session = HibernateUtil.getSessionFactory().openSession();
                 errorGoznak = session.createCriteria(ErrorGoznak.class)
                		 .list();
             } catch (Exception e) {
              //   JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
                 System.out.println("Логи !!!"+e.getMessage());
             } finally {
                 if (session != null && session.isOpen()) {
                     session.close();
                 }
             }
             return errorGoznak;
       }

}
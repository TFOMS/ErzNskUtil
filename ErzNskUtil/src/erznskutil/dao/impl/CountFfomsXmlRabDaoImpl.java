package erznskutil.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

import erznskutil.dao.CountFfomsXmlRabDao;
import erznskutil.logic.CountFfomsXmlRab;
import erznskutil.util.HibernateUtil;

public class CountFfomsXmlRabDaoImpl implements CountFfomsXmlRabDao {
     
     public void addCountFfomsXmlRab(CountFfomsXmlRab countFfomsXmlRab) throws SQLException {
             Session session = null;
             try {
                 session = HibernateUtil.getSessionFactory().openSession();
                 session.beginTransaction();
                 session.save(countFfomsXmlRab);
                 session.getTransaction().commit();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка1 I/O", JOptionPane.OK_OPTION);
             } finally {
                 if (session != null && session.isOpen()) {
                     session.close();
                 }
             }
       }

       public void updateCountFfomsXmlRab(CountFfomsXmlRab countFfomsXmlRab) throws SQLException {
             Session session = null;
             try {
                 session = HibernateUtil.getSessionFactory().openSession();
                 session.beginTransaction();
                 session.update(countFfomsXmlRab);
                 session.getTransaction().commit();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка2 I/O", JOptionPane.OK_OPTION);
             } finally {
                 if (session != null && session.isOpen()) {
                     session.close();
                 }
             }
       }

       public CountFfomsXmlRab getCountFfomsXmlRabById(int id) throws SQLException {
             Session session = null;
             CountFfomsXmlRab CountFfomsXmlRab = null;
             try {
                 session = HibernateUtil.getSessionFactory().openSession();
                 CountFfomsXmlRab = (CountFfomsXmlRab) session.load(CountFfomsXmlRab.class, id);
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка3 I/O", JOptionPane.OK_OPTION);
             } finally {
                 if (session != null && session.isOpen()) {
                     session.close();
                 }
             }
             return CountFfomsXmlRab;
       }

    @SuppressWarnings("unchecked")
	public List<CountFfomsXmlRab> getAllCountFfomsXmlRab() throws SQLException {
             Session session = null;
             List<CountFfomsXmlRab> CountFfomsXmlRab = new ArrayList<CountFfomsXmlRab>();
             try {
                 session = HibernateUtil.getSessionFactory().openSession();
                 CountFfomsXmlRab = session.createCriteria(CountFfomsXmlRab.class)
                		 .addOrder(Order.asc("data"))
                		 .list();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 4 I/O",    JOptionPane.OK_OPTION);
             } finally {
                 if (session != null && session.isOpen()) {
                     session.close();
                 }
             }
             return CountFfomsXmlRab;
       }

       public void deleteCountFfomsXmlRab(CountFfomsXmlRab countFfomsXmlRab) throws SQLException {
             Session session = null;
             try {
                 session = HibernateUtil.getSessionFactory().openSession();
                 session.beginTransaction();
                 session.delete(countFfomsXmlRab);
                 session.getTransaction().commit();
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка5 I/O", JOptionPane.OK_OPTION);
             } finally {
                 if (session != null && session.isOpen()) {
                     session.close();
                 }
             }
       }

}
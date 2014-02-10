package com.ebix.autocomplete.employee.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	  private static  SessionFactory sessionFactory;

	  static {
	    try {
	      // Create the SessionFactory from hibernate.cfg.xml
	      sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	    } catch (Throwable ex) {
	      // Make sure you log the exception, as it might be swallowed
	      System.err.println("Initial SessionFactory creation failed." + ex);
	      //throw new ExceptionInInitializerError(ex);
	    }
	  }

	  public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }	}

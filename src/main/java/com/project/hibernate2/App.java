package com.project.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	StandardServiceRegistry rrs = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	
    	Metadata mt = new MetadataSources(rrs).getMetadataBuilder().build();
//        Configuration con = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf   = mt.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        first h = new first();
        h.setName("Dafia");
        h.setEmail("dafiaanjum@gmail.com");
        h.setPassword("root");
        h.setPhoneno("9867584768");

        s.save(h); // Save the entity before committing the transaction
        t.commit();

        System.out.println("Successfully inserted");
        s.close();
        sf.close();
    }
}

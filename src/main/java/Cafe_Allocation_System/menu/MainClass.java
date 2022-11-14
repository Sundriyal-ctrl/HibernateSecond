package Cafe_Allocation_System.menu;

import Cafe_Allocation_System.entity.Tables;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.jaxb.hbm.spi.EntityInfo;
import org.hibernate.cfg.Configuration;
import relatioship.A;
import relatioship.B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
    static Configuration configuration=new Configuration().configure("hibernate.xml");
    static SessionFactory sessionFactory=configuration.buildSessionFactory();

    public static void main(String[] args) {
        Session session = sessionFactory.openSession();
//     A a=new A();
//     a.setName("Anuj");
//     A a1=new A();
//     a1.setName("AAAA");
//     B b=new B();
//     b.setName("Shailesh");
//
//     b.getA().add(a);
//     b.getA().add(a1);
//     a.setB(b);
//     session.save(a);
//     session.save(b);
//     session.beginTransaction().commit();
//     B a2=session.get(B.class,2);
//        System.out.println(a2);
//    }
    }
}

package relatioship;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.stream.Collectors;


public class Product extends Vector{
    static Configuration configuration=new Configuration().configure("hibernate.xml");
    static SessionFactory sessionFactory=configuration.buildSessionFactory();


//    public SessionFactory getConnection()
//     {
//         return sessionFactory;
//     }
//     public void insert(Customer customer)
//     {
//       try(Session session1=sessionFactory.openSession())
//       {
//           session1.beginTransaction();
//         session1.save(customer);
//         session1.getTransaction().commit();
//       }
//     }
//     public void subject(Order order, int id)
//     {
//
//         try(Session session1=sessionFactory.openSession())
//         {
//             Customer customer=session1.get(Customer.class,id);
//             Query query=session1.createQuery("From Order where from=:f and to:t");
//             query.setParameter("f",order.getSource());
//             query.setParameter("t",order.getDestination());
//             List<Order> subjects=query.getResultList();
//             session1.beginTransaction();
//             if(subjects.size()<1)
//             {
//
//                 customer.getOrderList().add(order);
//                 List<Customer> customers=new ArrayList<>();
//                 customers.add(customer);
//                 //order.setCustomers(customers);
//                 //session1.saveOrUpdate(order);
//                 session1.saveOrUpdate(customer);
//                 session1.getTransaction().commit();
//             }
//             else {
//                 List<Order> list=new ArrayList<>();
//                 List<Customer> customers=new ArrayList<>();
//                 customer.getOrderList().add(subjects.get(0));
//                 //subjects.get(0).setList(customers);
//                 session1.update(customers);
//                 session1.getTransaction().commit();
//             }
//         }
//     }
//
//   public void show(int id)
//   {
//       try(Session session1=sessionFactory.openSession())
//       {
//           Customer customer=session1.get(Customer.class,id);
//           System.out.println(customer.getId()+"  :  "+customer.getName());
//           Collection<Order> order=customer.getOrderList();
//           for(Order order1:order)
//           System.out.println(order1.getOrderId()+"   "+order1.getSource()+"   "+order1.getDestination());
//       }
//   }

    public static void main(String[] args) throws InterruptedException, ParseException {

        Session session = sessionFactory.openSession();
//        Zoo  zoo=new Zoo();
//        zoo.setName("Anuj");
//        zoo.setId(12);
//        student_s_m student_s_m=new student_s_m();
//       student_s_m.setId(13);
//        student_s_m.setAddress("Dehradun");
//        zoo.setStudent_s_m(student_s_m);
//        session.save(student_s_m);
//        session.save(zoo);


//        session.beginTransaction();
//        Query<Zoo> query=session.createQuery("From Zoo zoo LEFT JOIN FETCH zoo.student_s_m s WHERE zoo.id=:id1");
//        query.setParameter("id1",12);
////                int a=query.executeUpdate();
////        session.save(zoo);
////        query.setParameter("1",12);
//        System.out.println(query.getResultList().get(0));
//        System.out.println(query.list().get(0).getStudent_s_m());
//        session.getTransaction().commit();                                                                                                                                                                                                                                                                            aqqaaaaaaaaaaaaaaaaaaaaaaaa


//
//        student.setAname("Akash Rawat");
//
////        Student student1=new Student();
////
////        student1.setAname("Anuj Sundriyal");
//
//        Subject subject=new Subject();
//        subject.setName("Hindi");
//
//        subject.setStudent(student);
//
//        Subject subject1 = new Subject();
//        subject1.setName("English");
//
//        subject1.setStudent(student);
//
//        student.getSubject().add(subject);
//        student.getSubject().add(subject1);
//
//
//        student.setSubject(student.getSubject());
////        session.save(student);
//
//
//
//
////        session.beginTransaction();
////        session.persist(student);
////        session.getTransaction().commit();
//        Student subject2=session.get(Student.class,21);
//        System.out.println(subject2);
//        System.out.println(subject2.getSubject());
//
//        Subject subject3=session.get(Subject.class,22);
//        System.out.println(subject3);
//        System.out.println(subject3.getStudent());
////        session.close();
////        Subject subject1=session.get(Subject.class,23);
////        System.out.println(subject1);
////        System.out.println(subject1.getStudent());
////        session.close();
////
////         Session session1=sessionFactory.openSession();
////         Student student1=session1.get(Student.class,1);
////        System.out.println(student1);
////        System.out.println(student1.getSubject());
////
////          session1.close();
//
//
//
//
//
////          Movies movies=session.get(Movies.class,2);
////          session.beginTransaction();
////          movies.setAddress("Pune");
//        //session.update(movies);
////          session.getTransaction().commit();
////        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("firstJSP");
////        EntityManager entityManager=entityManagerFactory.createEntityManager();
////        CriteriaBuilder CriteriaBuilder=entityManager.getCriteriaBuilder();
////        CriteriaQuery<Student> studentCreateQuery=CriteriaBuilder.createQuery(Student.class);
////        Root<Student> root=studentCreateQuery.from(Student.class);
////        studentCreateQuery.select(root).where(CriteriaBuilder.gt(root.get("Age"),10));
////        studentCreateQuery.select(root)CriteriaBuilder.between(root.get("salary"),1000,20000);
//
////        entityManager.getTransaction().begin();
////        entityManager.getTransaction().commit();


//       Mark mark=new Mark();
//       mark.setId(16);
//       mark.setP(17);
//       mark.setMarks(99);
        // mark.setMarks(123);

//        Mark mark1=new Mark();
//        mark1.setId(45);
        //mark1.setMarks(135);

//        session.beginTransaction();

//        mark1.setMarks(47);
//       session.save(mark1);

//       session.update(mark1);
//        session.save(mark);
//       session.getTransaction().commit();
//       Session session1=sessionFactory.openSession();
//     Query query=session1.createQuery("From Mark");
//     //query.setParameter("id",45);
//     List<Mark> marks=query.getResultList();
//        System.out.println(marks);

//     Criteria criteria=session.createCriteria(Mark.class);
//     criteria.add(Restrictions.or(Restrictions.ge("id",15),Restrictions.ge("marks",99)));
//
//     List<Mark> list=criteria.list();
//        System.out.println(list);


//        A a1=new A();

//        a1.setName("Ayushi sundriyal");
//
//        A a3=new A();
//
//        a3.setName("Joker sundriyal");
        List<A> list = session.createQuery("from A").list();
//        A a=new A();
//
//        a.setName("Akash sundriyal");
//        String da="2022-09-18";
//        Date date=Date.valueOf(da);
//
//        String da1="2022-09-17";
//        Date date1=Date.valueOf(da1);
//
//        a.setEnddate(date);
//        a.setStartdate(date1);
//
//        if(list.size()>0) {
//            for (A a2 : list) {
//                if (a2.getStartdate().compareTo(date1) <=0 && a2.getEnddate().compareTo(date) <= 0) {
//                    System.out.println("First before and end before match");
//                }else if (a2.getStartdate().compareTo(date1) >=0 && a2.getEnddate().compareTo(date) >= 0) {
//                    System.out.println("First after and end after match");
//                } else if (a2.getStartdate().compareTo(date1) >=0 && a2.getEnddate().compareTo(date) <= 0) {
//                    System.out.println("mid");
//                } else if (a2.getStartdate().compareTo(date1) <=0 && a2.getEnddate().compareTo(date) >=0) {
//                    System.out.println("before after");
//                } else if (a2.getStartdate().compareTo(date1) == 0 && a2.getEnddate().compareTo(date) == 0) {
//                    System.out.println("Equal");
//                } else {
//                    session.beginTransaction();
//                    session.save(a);
////        session.save(a1);
////        session.save(a3);
//                    session.getTransaction().commit();
//                }
//            }
//        }else {
//            session.beginTransaction();
//            session.save(a);
//        session.save(a1);
//        session.save(a3);
//        session.beginTransaction();
//           A a=new A();
//           a.setName("Ayushi");
//        A a1=new A();
//        a1.setName("Shailesh");
//           session.save(a);
//        session.save(a1);
//            session.getTransaction().commit();


//    List<A> list3=session.createQuery("From A").list();
//        System.out.println(list3);
//    List<A> list1=session.createNativeQuery("select *from A").addEntity(A.class).list();
//        System.out.println(list1);
//
//     Query namedQuery=session.createNamedQuery("findById");
//     namedQuery.setParameter("id",2);
//        System.out.println(namedQuery.getResultList());
//
//
//        Query namedQuery1=session.createNamedQuery("findByName");
//        namedQuery1.setParameter("name","Ayushi");
//        System.out.println(namedQuery1.getResultList());
//
//        Query namedQuery2=session.createNamedQuery("findByName1");
//        namedQuery2.setParameter("l","%u%");
//
//        System.out.println(namedQuery2.getResultList());


//        a.setName("Akash");
//        List<A> list=session.createQuery("FROM A a JOIN FETCH a.list",A.class).getResultList();
//        for(A b2 :list) {
//            System.out.println(b2.getId() + "  " + b2.getName());
//            List<B> list1 = b2.getList();
//            for (B a1 : list1) {
//                System.out.println(a1.getId()+"  "+a1.getName());
//            }
//        }

//  A a1=session.get(A.class,12);
//  List<B> b2=a.getList();
//  B b3=b2.get(0);
//  a1.getList().remove(b3);
//  session.saveOrUpdate(a1);
//   session.beginTransaction().commit();


//        A a1=session1.get(A.class,1);
//        a1.setList(null);
//        session1.delete(a1);
//        session1.beginTransaction().commit();
//        Criteria criteria=session1.createCriteria(A.class);
//
//        criteria.add(Restrictions.or(Restrictions.like("name","%o%"),Restrictions.like("name","A%")));
//        System.out.println(criteria.list());
//        criteria.addOrder(Order.asc("name"));
//        System.out.println(criteria.list());


//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
//        simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//     A a=new A();
//     a.setName("Anuj");
//     String s="16-03-2015 5:00:26";
//     String s1="17-04-2015 6:00:26";
//        try {
//     NativeQuery<A> nativeQuery=session.createNativeQuery("select *from A");
//     nativeQuery.addEntity(A.class);
//     List<A> list1=nativeQuery.getResultList();
//     long startdate=simpleDateFormat.parse(s).getTime();
//     long enddate=simpleDateFormat.parse(s1).getTime();
//            System.out.println(startdate);
//     List<A> list2=list1.stream().filter(s2->(s2.getStartdate().getTime()<=startdate && s2.getStartdate().getTime()>=enddate)
//     ||(s2.getStartdate().getTime()>=startdate && s2.getEnddate().getTime()<=startdate)||(s2.getStartdate().getTime()<=enddate && s2.getStartdate().getTime()>=enddate)
//     ||(s2.getEnddate().getTime()>=enddate && s2.getEnddate().getTime()<=enddate)
//     ).collect(Collectors.toList());
//
//
//           if(list2.size()>0)
//           {
//               System.out.println("Already Exits");
//           }
//           else {
//               a.setStartdate(simpleDateFormat.parse(s));
//               a.setEnddate(simpleDateFormat.parse(s1));
//               session.save(a);
//               session.beginTransaction().commit();
//           }
//        }catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//
//   }
//        System.out.println(configuration.getProperty("connection.url"));
//        Properties properties=configuration.getProperties();
//        System.out.println(properties);
//        Session session1=sessionFactory.openSession();
//         A a=new A();
//         a.setName("Ayushi Negi");
//         a.setAddress("Mumbai");
//
//        System.out.println(a.getId());
//        session.persist(a);
//        session.beginTransaction().commit();


//        A a=session.get(A.class,1);
//        System.out.println(a.getId()+"  "+a.getName());
//        a.setName("Sun");
//        session.beginTransaction().commit();
//        System.out.println(session.contains(a));

        Session session1 = sessionFactory.openSession();
//    A a=new A();
//    a.setName("Anuj sundriyal");
//        A a1=new A();
//        a.setName("Shailesh sundriyal");
//        A a2=new A();
//        a.setName("Rejul Negi");
////    B b =new B();
////    b.setName("Ayushi Negi");
////    a.setB(b);
////    b.setA(a);
//    session1.save(a);
//        session1.save(a1);
//        session1.save(a2);
//
//    session1.beginTransaction().commit();
//     Query query=session1.createQuery("runkro",A.class);
//
//        System.out.println(query.getResultList());

//        Session session11=sessionFactory.openSession();
//        CriteriaBuilder criteriaBuilder=session11.getCriteriaBuilder();
//        Criteria criteria=session11.createCriteria(A.class);
//        criteria.addOrder(Order.asc("name"));
//        //criteria.add(Restrictions.gt("id",2));
//        criteria.add(Restrictions.idEq(1));
//        System.out.println(criteria.list());
//    }

    }
}

































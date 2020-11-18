package spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import spring.hibernate.entity.Department;
import spring.hibernate.entity.Detail;
import spring.hibernate.entity.Employee;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
              session = factory.getCurrentSession();
              session.beginTransaction();

              Department d = session.get(Department.class, 1);

//              Department d = new Department("IT");
//              d.addEmployee(new Employee("Anatolii", "Vasilev", 700));
//              d.addEmployee(new Employee("Marina", "Vasileva", 500));
//
//              session.save(d);
//            Employee n = new Employee("Ivan", "Ivanov", "Sales", 700);
//            Detail d = new Detail("Tomsk", "45646", "sales@gmail.com");
//            n.setDetail(d);
//            d.setEmployee(n);
//            session.beginTransaction();
//            session.save(d);
//            session.getTransaction().commit();
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Detail d = session.get(Detail.class, 5);
//            session.delete(d);

//            session.createQuery("delete from Employee where surname='Plutskiy'").executeUpdate();

//            List<Employee> list = session.createQuery("from Employee")
//                    .getResultList();
//            for(Employee emp: list)
//                System.out.println(emp);

//            session.createQuery("update Employee set name='Ivan', surname='Starostin' where id = 7")
//                    .executeUpdate();
//            Employee emp = session.get(Employee.class, 2);
//            session.delete(emp);



            session.getTransaction().commit();
////
//            System.out.println(d);

        } finally {
            if (session != null) session.close();
            factory.close();
        }
    }
}

package demo.spring.mvc_hibernate_aop.dao;

import demo.spring.mvc_hibernate_aop.entity.MyClients;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MyClientsDAOImpl implements MyClientsDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<MyClients> getAllMyClients() {

        Session session = sessionFactory.getCurrentSession();

        Query<MyClients> query = session.createQuery("from MyClients"
                , MyClients.class);
        List<MyClients> allClients = query.getResultList();

        return allClients;
    }

    @Override
    public void saveClient(MyClients myClient) {

        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(myClient);
    }

    @Override
    public MyClients getMyClient(int id) {
        Session session = sessionFactory.getCurrentSession();

        MyClients myClients = session.get(MyClients.class, id);
        return myClients;
    }

    @Override
    public void deleteClients(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<MyClients> query = session.createQuery("delete from MyClients " +
                "where id =:myClientsId");
        query.setParameter("myClientsId", id);
        query.executeUpdate();

    }
}

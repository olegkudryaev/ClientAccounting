package demo.spring.mvc_hibernate_aop.dao;

import demo.spring.mvc_hibernate_aop.entity.MyClients;

import java.util.List;

public interface MyClientsDAO {

    public List<MyClients> getAllMyClients();

    public void saveClient(MyClients myClient);

    public MyClients getMyClient(int id);

    public void deleteClients(int id);
}

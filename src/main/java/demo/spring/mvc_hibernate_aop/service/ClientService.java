package demo.spring.mvc_hibernate_aop.service;

import demo.spring.mvc_hibernate_aop.entity.MyClients;

import java.util.List;

public interface ClientService {
    public List<MyClients> getAllMyClients();

    public void saveClient (MyClients myClient);

    public MyClients getMyClients (int id);

    public void deleteClients (int id);
}

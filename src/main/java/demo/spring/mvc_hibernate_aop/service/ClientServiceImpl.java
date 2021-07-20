package demo.spring.mvc_hibernate_aop.service;

import demo.spring.mvc_hibernate_aop.dao.MyClientsDAO;
import demo.spring.mvc_hibernate_aop.entity.MyClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private MyClientsDAO myClientsDAO;

    @Override
    @Transactional
    public List<MyClients> getAllMyClients() {
        return myClientsDAO.getAllMyClients();
    }

    @Override
    @Transactional
    public void saveClient(MyClients myClient) {
        myClientsDAO.saveClient(myClient);
    }

    @Override
    @Transactional
    public MyClients getMyClients(int id) {
        return myClientsDAO.getMyClient(id);
    }

    @Override
    @Transactional
    public void deleteClients(int id) {
        myClientsDAO.deleteClients(id);

    }
}

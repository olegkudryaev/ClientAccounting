package demo.spring.mvc_hibernate_aop.controller;

import demo.spring.mvc_hibernate_aop.dao.MyClientsDAO;
import demo.spring.mvc_hibernate_aop.entity.MyClients;
import demo.spring.mvc_hibernate_aop.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/")
    public String showAllClients(Model model) {

        List<MyClients> allClients = clientService.getAllMyClients();
        model.addAttribute("allClients", allClients);

        return "all-clients";
    }

    @RequestMapping("/addNewClient")
    public String addNewClient(Model model) {

        MyClients myClients = new MyClients();
        model.addAttribute("myClients", myClients);

        return "myClients-info";

    }

    @RequestMapping("saveClient")
    public String saveClients(@ModelAttribute("MyClients") MyClients myClients) {

        clientService.saveClient(myClients);

        return "redirect:/";
    }

    @RequestMapping("updateInfo")
    public String updateClient(@RequestParam("clId") int id, Model model) {

        MyClients myClients = clientService.getMyClients(id);
        model.addAttribute("myClients", myClients);

        return "myClients-info";

    }

    @RequestMapping("/deleteMyClients")
    public String deleteMyClients(@RequestParam("clId") int id) {

        clientService.deleteClients(id);

        return "redirect:/";
    }


}

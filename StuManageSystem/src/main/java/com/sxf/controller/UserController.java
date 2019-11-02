package com.sxf.controller;
import com.sxf.entity.Manager;
import com.sxf.service.Impl.ManagerServiceImpl;
import com.sxf.service.ManagerService;
import com.sxf.service.UserService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/test")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    ManagerServiceImpl managerServiceImpl;

    //使用get方法查询单个数据

    @GetMapping("/user")
    public String getById() {

        return userService.findById(1);
    }



    @RequestMapping("/login")
    public String get(Model model) {

        return  "login";
    }

    @RequestMapping("/yzlogin")
    public String yzLogin(Manager manager, Model model){


        System.out.println(manager.getUsername());
        System.out.println(manager.getPassword());
        try{

            Manager   manager1=  managerServiceImpl.find(manager.getUsername());

            if( manager1.getPassword().equals(manager.getPassword())){
              return   "index";
          }else {
                return  "login";
            }
        }catch (Exception e){
           e.printStackTrace();
            return "login";
         }


    }




}

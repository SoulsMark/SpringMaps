//package com.example.demo.dao;
//
//import com.example.demo.entity.Usersss;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DataLoader implements ApplicationRunner {
//
//    private Usersss usersss;
//
//    @Autowired
//    public DataLoader(Usersss usersss) {
//        this.usersss = usersss;
//    }
//
//    public void run(ApplicationArguments args) {
//        usersss.save(new Usersss("lala", "lala", "lala"));
//    }
//}
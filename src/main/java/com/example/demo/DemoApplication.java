package com.example.demo;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class DemoApplication {

    @RestController
    public class Controller {
        @RequestMapping(value = "/", method = RequestMethod.GET)
        public ModelAndView demo() {
            return new ModelAndView("home");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(UserRepository userRepository) throws Exception {
        return (String[] args) -> {
            User user1 = new User("John", "12345");
            User user2 = new User("Julie", "11223344");
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.findAll().forEach(user -> System.out.println(user.getId()));
        };
    }
}

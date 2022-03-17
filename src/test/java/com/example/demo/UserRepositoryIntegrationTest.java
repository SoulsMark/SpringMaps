package com.example.demo;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void save_correctNumberOfUsers() {
        userRepository.save(new User("test", "test"));

        List<User> users = (List<User>) userRepository.findAll();

        assertThat(users.size()).isEqualTo(1);
    }
}

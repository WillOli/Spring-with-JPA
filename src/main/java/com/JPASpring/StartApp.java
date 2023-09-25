package com.JPASpring;

import com.JPASpring.model.User;
import com.JPASpring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setNome("William");
        user.setUsername("WillDev");
        user.setPassword("12345");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }

    }
}

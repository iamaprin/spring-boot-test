package me.vilya.demo.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * author: iamaprin
 * time: 2016/7/10 9:52
 */

@Component
public class DatabaseLoader implements CommandLineRunner{

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }

}

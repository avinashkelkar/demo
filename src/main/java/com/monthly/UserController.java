package com.monthly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by avinashk on 3/2/17.
 */
@RestController
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/greeting")
    public Test greeting(@RequestParam(value="name", defaultValue="World") String name) {
        if( !name.equalsIgnoreCase("world")) {
            User user = userRepository.findByName(name);
            return new Test(user.getId(),
                    String.format(template, user.getName()));
        } else {
            return new Test("1111",
                    String.format(template, name));
        }

    }

    private class Test {
        private String id;
        private String name;
        public Test(String l, String format) {
            this.id = l;
            this.name = format;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}

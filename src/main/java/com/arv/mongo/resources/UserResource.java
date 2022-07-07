package com.arv.mongo.resources;

import com.arv.mongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User user1 = new User("1", "maria", "maria@email.com");
        User user2 = new User("2", "mario", "mario@email.com");

        return ResponseEntity.ok().body(new ArrayList<User>(Arrays.asList(user1, user2)));
    }
}

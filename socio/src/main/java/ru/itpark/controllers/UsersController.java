package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itpark.models.User;
import ru.itpark.service.UsersService;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return usersService.getUsers();
    }

   /* @GetMapping(value = "/users")
    public ModelAndView users() {
        List<User> users = usersService.getUsers();
        Map<String, Object> params = new HashMap<>();
        params.put("users", users);
        return new ModelAndView("users", params);
    }
*/
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") int userId) {
        return usersService.getUser(userId);
    }
}

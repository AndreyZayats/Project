package ru.itpark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.dao.UsersDao;
import ru.itpark.models.User;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{


    @Autowired
    private UsersDao usersDao;

    public List<User> getUsers() {
        List<User> users = usersDao.findAll();
        return users;
    }

    @Override
    public User getUser(int userId) {
        User user = usersDao.findOne(userId);
        return user;
    }
}

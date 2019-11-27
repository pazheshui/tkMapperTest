package com.service.imp;

import com.mapper.studentMapper;
import com.model.t_user;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private studentMapper sm;
    @Override
    public void insert(t_user t) {
        sm.insert(t);
    }
}

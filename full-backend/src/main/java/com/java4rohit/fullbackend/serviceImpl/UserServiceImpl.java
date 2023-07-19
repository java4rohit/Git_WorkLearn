package com.java4rohit.fullbackend.serviceImpl;

import java.util.List;

import com.java4rohit.fullbackend.Exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.java4rohit.fullbackend.model.User;
import com.java4rohit.fullbackend.repository.UserRepository;
import com.java4rohit.fullbackend.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {

        System.out.println("E");

        User existingUser = userRepository.findByAadhaarNumber(user.getAadhaarNumber());
        System.out.println(existingUser);
        System.out.println("existingUser :: " + ObjectUtils.isEmpty(existingUser));
        if (!ObjectUtils.isEmpty(existingUser)) {
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            existingUser.setName(user.getName());
            existingUser.setAadhaarNumber(user.getAadhaarNumber());
            existingUser = userRepository.save(existingUser);
            return existingUser;
        }

        user = userRepository.save(user);
        return user;
    }
    @Override
    public User getUser(Long aadhaarNumber) {
        User user = userRepository.findByAadhaarNumber(aadhaarNumber);
        if (ObjectUtils.isEmpty(user)) {
            throw new UserNotFoundException(aadhaarNumber);
        }
        return user;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public String saveListUsers(List<User> userList) {
        for (User user : userList) {
            System.out.println("AadhaarNumber :: " + user.getAadhaarNumber());
            User existingUser = userRepository.findByAadhaarNumber(user.getAadhaarNumber());
            System.out.println(existingUser);
            if (!ObjectUtils.isEmpty(existingUser)) {
                System.out.println("If condition");
                existingUser.setUsername(user.getUsername());
                existingUser.setEmail(user.getEmail());
                existingUser.setName(user.getName());
                userRepository.save(existingUser);

            } else {
                System.out.println("Else Save:::: ");
                userRepository.save(user);
            }

        }

        return "OK";
    }


    @Override
    public User updateUserByAadhaarNumber(User newUser, Long aadhaarNumber) {
        User oldUser = userRepository.findByAadhaarNumber(aadhaarNumber);
        if (ObjectUtils.isEmpty(oldUser)) {
            throw new UserNotFoundException(aadhaarNumber);

        }
        oldUser.setName(newUser.getName());
        oldUser.setAadhaarNumber(newUser.getAadhaarNumber());
        oldUser.setUsername(newUser.getUsername());
        oldUser.setEmail(newUser.getEmail());
        return userRepository.save(oldUser);
    }

    @Override
    public String deleteByAadhaarNumber(Long aadhaarNumber) {
        System.out.println("delete ");
        String mgs;
         mgs = userRepository.deleteByAadhaarNumber(aadhaarNumber);
         if(mgs.isEmpty() && mgs.equalsIgnoreCase(null)){
             throw  new UserNotFoundException(aadhaarNumber);
         }

        return mgs;
    }

    @Override
    public String deleteById(long id) {
        userRepository.deleteById(id);
        return "Delete Successfully";
    }

    /**
     * @param user
     * @param id
     * @return
     */
    @Override
    public User updateUserById(User newUser, Long id) {
        User oldUser = userRepository.findById(newUser.getId()).get();
        if (ObjectUtils.isEmpty(oldUser)) {
            throw new UserNotFoundException(newUser.getId());

        }
        oldUser.setName(newUser.getName());
        oldUser.setAadhaarNumber(newUser.getAadhaarNumber());
        oldUser.setUsername(newUser.getUsername());
        oldUser.setEmail(newUser.getEmail());
        return userRepository.save(oldUser);
    }

    /**
     * @param user
     * @return
     */
    @Override
    public List<User>  saveListUsersTEST(List<User> user) {
        return userRepository.saveAll(user);

    }
}

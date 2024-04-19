package ru.gb.my_first_crud.service;

import org.springframework.stereotype.Service;
import ru.gb.my_first_crud.model.User;
import ru.gb.my_first_crud.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User getOne(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void updateUser(User user){
        userRepository.update(user);
    }

    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
}

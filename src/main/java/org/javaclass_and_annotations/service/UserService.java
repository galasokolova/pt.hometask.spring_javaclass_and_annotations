package org.javaclass_and_annotations.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.javaclass_and_annotations.entities.User;
import org.javaclass_and_annotations.repository.Repo;
import org.javaclass_and_annotations.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class UserService {

    private Repo<User> userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(Long id){
        return Optional.of(userRepository.getById(id));
    }
}

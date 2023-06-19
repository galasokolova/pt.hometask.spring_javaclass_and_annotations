package org.javaclass_and_annotations.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.javaclass_and_annotations.entities.User;
import org.javaclass_and_annotations.repository.Repo;
import org.javaclass_and_annotations.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {

    private final Repo<User> userRepository;

    public UserService(Repo<User> userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(Long id){
        return Optional.of(userRepository.getById(id));
    }
}

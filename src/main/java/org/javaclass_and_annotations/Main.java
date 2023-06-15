package org.javaclass_and_annotations;

import org.javaclass_and_annotations.config.ApplicationConfig;
import org.javaclass_and_annotations.entities.User;
import org.javaclass_and_annotations.repository.UserRepository;
import org.javaclass_and_annotations.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.asList(beanDefinitionNames).forEach(System.out::println);


        //the following code works:
        UserRepository userRepository = context.getBean(UserRepository.class);
        UserService bean = new UserService(userRepository);
        User user = bean.getUserById(1L).orElseThrow();
        System.out.println(user);


        //but this code does not:
//        UserService bean = context.getBean(UserService.class);
//        User user = bean.getUserById(1L).orElseThrow();
    }
}
package org.javaclass_and_annotations.repository;

import lombok.Data;
import org.javaclass_and_annotations.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Data
@Repository
public class UserRepository implements Repo<User> {

    @Autowired
    public void setUserMap(Map<Long, User> userMap){
        this.userMap = userMap;
    }

    private Map<Long, User> userMap;

    @Override
    public User getById(Long id) {
        return userMap.get(id);
    }
}

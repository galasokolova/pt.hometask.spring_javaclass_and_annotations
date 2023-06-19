package org.javaclass_and_annotations.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.javaclass_and_annotations.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Data
@Repository
public class UserRepository implements Repo<User> {

    private Map<Long, User> userMap;

//    public UserRepository(Map<Long, User> userMap) {
//        this.userMap = userMap;
//    }

        @Autowired
    public void setUserMap(Map<Long, User> userMap){
        this.userMap = userMap;
    }


    @Override
    public User getById(Long id) {
        return userMap.get(id);
    }
}

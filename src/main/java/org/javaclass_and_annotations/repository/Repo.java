package org.javaclass_and_annotations.repository;

import org.javaclass_and_annotations.entities.User;

public interface Repo<User> {

    User getById(Long id);
}

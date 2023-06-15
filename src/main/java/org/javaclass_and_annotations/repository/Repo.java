package org.javaclass_and_annotations.repository;

public interface Repo<T> {

    T getById(Long id);
}

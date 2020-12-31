package com.example.TravelAgencyServer.api;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> get(Integer id);

    List<T> getAll();

    int save(T t);

    T update(T t);

    void delete(T t);
}
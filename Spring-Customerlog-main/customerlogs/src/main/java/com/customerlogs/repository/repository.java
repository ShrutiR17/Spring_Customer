package com.customerlogs.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.jpa.repository.JpaRepository;


import com.customerlogs.entity.Customerlogs;


public interface repository extends JpaRepository<Customerlogs, String>{

    @Query(value = "SELECT * FROM customerlogs", nativeQuery = true)
    List<Customerlogs> display(String name);

    @Query(value = "SELECT * FROM customerlogs WHERE date=?1", nativeQuery = true)
    List<Customerlogs> getByDate(String name);

    @Query(value = "SELECT * FROM customerlogs", nativeQuery = true)
    List<Customerlogs> getAllLog();
}
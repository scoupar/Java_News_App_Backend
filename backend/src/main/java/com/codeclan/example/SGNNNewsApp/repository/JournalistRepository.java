package com.codeclan.example.SGNNNewsApp.repository;

import com.codeclan.example.SGNNNewsApp.model.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalistRepository extends JpaRepository<Journalist, Long> {
}

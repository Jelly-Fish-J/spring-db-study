package com.jjb.myapp.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
}

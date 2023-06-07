package com.example.book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.book.Model.role;


@Repository
public interface IRoleRepository extends JpaRepository<role, Long> {
    @Query("SELECT r.id FROM role r WHERE r.name = ?1")
    Long getRoleIdByName(String roleName);

    
}
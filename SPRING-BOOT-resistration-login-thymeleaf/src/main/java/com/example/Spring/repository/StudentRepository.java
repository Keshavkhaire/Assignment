package com.example.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
	

}

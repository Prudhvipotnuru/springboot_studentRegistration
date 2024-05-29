package com.prudhvi.registration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prudhvi.registration.models.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}

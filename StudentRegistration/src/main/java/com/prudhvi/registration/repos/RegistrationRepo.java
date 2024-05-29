package com.prudhvi.registration.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prudhvi.registration.models.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}

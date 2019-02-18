package com.userfront.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.userfront.domain.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
    
    
    @Query("SELECT p FROM Appointment p WHERE p.id = :id")
    public Optional<Appointment> findAppointementById(@Param("id") String id);
    
    @Query("SELECT t FROM Appointment t where t.location = ?1 AND t.description = ?2")
    public Optional<Appointment> findByLocationAndDescription(String location, String description);
    
    
}

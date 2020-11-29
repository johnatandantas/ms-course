package com.johnworks.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnworks.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}

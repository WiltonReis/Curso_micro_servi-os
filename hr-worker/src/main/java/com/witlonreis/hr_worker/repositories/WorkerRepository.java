package com.witlonreis.hr_worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.witlonreis.hr_worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {


} 

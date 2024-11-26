package com.microserviceapp.billingservice.repository;

import com.microserviceapp.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository  extends JpaRepository<Bill, Long> {
}


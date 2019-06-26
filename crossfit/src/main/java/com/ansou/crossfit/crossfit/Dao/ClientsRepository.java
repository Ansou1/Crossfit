package com.ansou.crossfit.crossfit.Dao;

import com.ansou.crossfit.crossfit.Entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients, Integer> {
}

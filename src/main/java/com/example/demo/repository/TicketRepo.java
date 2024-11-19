package com.example.demo.repository;

import com.example.demo.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @TimeStamp 2024-11-19 21:54
 * @ProjectDetails demo
 * @Author udarasan
 */
@Repository
public interface TicketRepo extends JpaRepository<Ticket,Integer> {
}

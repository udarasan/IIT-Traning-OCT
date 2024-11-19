package com.example.demo.repository;

import com.example.demo.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @TimeStamp 2024-11-19 21:29
 * @ProjectDetails demo
 * @Author udarasan
 */
@Repository
public interface EventRepo extends JpaRepository<Event,Integer> {

    @Modifying
    @Query(value = "UPDATE Event e SET e.ticket_count = e.ticket_count - 1 WHERE e.e_id = ?1",nativeQuery = true)
    void updateEventTicketDetails(int eventID);
}

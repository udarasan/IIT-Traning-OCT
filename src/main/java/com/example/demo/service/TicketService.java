package com.example.demo.service;

import com.example.demo.dto.TicketDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Ticket;
import com.example.demo.entity.User;
import com.example.demo.repository.TicketRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @TimeStamp 2024-11-19 21:02
 * @ProjectDetails demo
 * @Author udarasan
 */
@Service
public class TicketService {
    @Autowired
    private TicketRepo ticketRepo;
    private final TicketPool ticketPool;
    private final ExecutorService executorService = Executors.newFixedThreadPool(5); // Adjust threads as needed

    @Autowired
    public TicketService(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    public void releaseTicketsConcurrently(int ticketCount) {
        for (int i = 0; i < ticketCount; i++) {
            executorService.execute(() -> {
                ticketPool.addTicket();
                System.out.println("Ticket released by thread: " + Thread.currentThread().getName());
            });
        }
    }

    public void saveTicketDetail(TicketDTO ticketDTO) {

        Ticket test=new Ticket();
        test.settId(ticketDTO.gettId());
        test.setDetails(ticketDTO.getDetails());


        ticketRepo.save(test);
    }


    public int getAvailableTickets() {
        return ticketPool.getTicketCount();
    }
}

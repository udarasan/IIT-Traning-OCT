package com.example.demo.service;

import com.example.demo.dto.Ticket;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @TimeStamp 2024-11-19 21:02
 * @ProjectDetails demo
 * @Author udarasan
 */

@Component
public class TicketPool {
    private final ConcurrentLinkedQueue<Ticket> tickets = new ConcurrentLinkedQueue<>();
    private int ticketCounter = 1;

    public void addTicket() {
        Ticket ticket = new Ticket(ticketCounter++);
        tickets.offer(ticket);
    }

    public int getTicketCount() {
        return tickets.size();
    }

    public ConcurrentLinkedQueue<Ticket> getTickets() {
        return tickets;
    }
}

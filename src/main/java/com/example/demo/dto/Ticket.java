package com.example.demo.dto;

/**
 * @TimeStamp 2024-11-19 21:01
 * @ProjectDetails demo
 * @Author udarasan
 */
public class Ticket {
    private int ticketId;
    private String status; // e.g., AVAILABLE or SOLD

    public Ticket(int ticketId) {
        this.ticketId = ticketId;
        this.status = "AVAILABLE";
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


package com.example.demo.dto;


/**
 * @TimeStamp 2024-11-19 21:42
 * @ProjectDetails demo
 * @Author udarasan
 */
public class TicketDTO {
    private int tId;
    private String details;

    public TicketDTO(int tId, String details) {
        this.tId = tId;
        this.details = details;
    }

    public TicketDTO() {
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

package com.example.demo.dto;


/**
 * @TimeStamp 2024-11-19 21:26
 * @ProjectDetails demo
 * @Author udarasan
 */

public class EventDTO {

    public int eId;
    public String eventName;
    public int ticketCount;

    public EventDTO(int eId, String eventName, int ticketCount) {
        this.eId = eId;
        this.eventName = eventName;
        this.ticketCount = ticketCount;
    }

    public EventDTO() {
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }
}

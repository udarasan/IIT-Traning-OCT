package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @TimeStamp 2024-11-19 21:26
 * @ProjectDetails demo
 * @Author udarasan
 */
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int eId;
    public String eventName;
    public int ticketCount;

    public Event(int eId, String eventName, int ticketCount) {
        this.eId = eId;
        this.eventName = eventName;
        this.ticketCount = ticketCount;
    }

    public Event() {
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

package com.example.demo.controller;

import com.example.demo.dto.TicketDTO;
import com.example.demo.service.EventService;
import com.example.demo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @TimeStamp 2024-11-19 21:03
 * @ProjectDetails demo
 * @Author udarasan
 */
@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {
    private final TicketService ticketService;
    @Autowired
    private EventService eventService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/release")
    public String releaseTickets(@RequestParam int count) {
        ticketService.releaseTicketsConcurrently(count);
        return count + " tickets are being released!";
    }

    @GetMapping("/count")
    public String getAvailableTickets() {
        int count = ticketService.getAvailableTickets();
        return "Available tickets: " + count;
    }

    @PostMapping("/getATicket/{eventId}")
    public boolean getATicket(@PathVariable int eventId){


        //when user booking tickets
        // event ID
        // update available ticket count
        boolean response=eventService.updateEventDetails(eventId);
        // add a record on ticket table
        if (response){
            TicketDTO ticketDTO=new TicketDTO();
            ticketDTO.setDetails("Book a ticket for this eventId "+eventId);
            ticketService.saveTicketDetail(ticketDTO);

            return true;
        }else {
            return false;
        }
    }

}
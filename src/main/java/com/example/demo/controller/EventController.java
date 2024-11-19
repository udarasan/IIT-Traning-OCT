package com.example.demo.controller;

import com.example.demo.dto.EventDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @TimeStamp 2024-11-19 21:25
 * @ProjectDetails demo
 * @Author udarasan
 */
@RestController
@RequestMapping("/api/v1/event")
@CrossOrigin
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/addEvent")
    public boolean signup(@RequestBody EventDTO eventDTO){
        eventService.addEvent(eventDTO);
        return true;
    }

    @GetMapping("/getAllEvent")
    public List<EventDTO> getAllEvent(){

        List<EventDTO> eventDTOList=eventService.getAllEventsOnService();
        return eventDTOList;
    }




}

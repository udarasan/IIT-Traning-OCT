package com.example.demo.service;

import com.example.demo.dto.EventDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entity.Event;
import com.example.demo.entity.User;
import com.example.demo.repository.EventRepo;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @TimeStamp 2024-11-19 21:30
 * @ProjectDetails demo
 * @Author udarasan
 */
@Service
public class EventService {
    @Autowired
    private EventRepo eventRepo;

    public void addEvent(EventDTO eventDTO) {

        Event test=new Event();

        test.seteId(eventDTO.eId);
        test.setEventName(eventDTO.eventName);
        test.setTicketCount(eventDTO.ticketCount);

        eventRepo.save(test);
    }

    public List<EventDTO> getAllEventsOnService() {
        //get all data from db and put all data in to entity type user object
        List<Event> eventList=eventRepo.findAll();
        //print data
        System.out.println(eventList);
        //create a new object called UserDTO
        List<EventDTO>eventDTOList=new ArrayList<>();

        //add all data into userDtoList(dto type) from user(entity type) list
        for (Event event:eventList) {
            EventDTO eventDTO=new EventDTO(event.eId,event.eventName,event.ticketCount);
            eventDTOList.add(eventDTO);
            //print data
            System.out.println(eventDTOList);

        }
        return eventDTOList;
    }

    @Transactional
    public boolean updateEventDetails(int eventID){
        eventRepo.updateEventTicketDetails(eventID);
        return true;
    }
}

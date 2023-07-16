package com.dal.cs.backend.Event.DataLayer;

import com.dal.cs.backend.Club.ClassObject.Club;
import com.dal.cs.backend.Event.EventObject.Event;

import java.sql.SQLException;
import java.util.List;

public interface IEventDataLayer
{

    List<Event> getAllEvents() throws SQLException;
    List<Event> getEventsByUser(String userEmailId) throws SQLException;

    boolean registerEvents(String eventID, String emailID) throws SQLException;
    List<Event> getEventDetails(String nameOfEvent) throws  SQLException;

}

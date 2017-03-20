package com.trial.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class hotels{
    int hotelId;
    List<com.trial.model.rooms> rooms;

   /* public List<com.trial.model.rooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<com.trial.model.rooms> rooms) {
        this.rooms = rooms;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }*/





}

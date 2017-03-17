package com.trial.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by payal on 15-03-2017.
 */
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class rooms  {
    int roomId;
    public List<com.trial.model.availability> availability;

   /* public List<com.trial.model.availability> getAvailability() {
        return availability;
    }

    public void setAvailability(List<com.trial.model.availability> availability) {
        this.availability = availability;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }*/


}

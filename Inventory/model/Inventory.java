package com.trial.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.List.*;


@Document
@Getter
@Setter
public class Inventory {

    @Id
    String accessKey;

    int channelId;
    public List<com.trial.model.hotels> hotels ;

  /*  public List<com.trial.model.hotels> getHotels() {
        return hotels;
    }

    public void setHotels(List<com.trial.model.hotels> hotels) {
        this.hotels = hotels;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }*/


}

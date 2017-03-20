package com.trial.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Hotels{
    int hotelId;
    List<com.trial.model.rooms> rooms;
}

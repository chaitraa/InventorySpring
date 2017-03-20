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
public class Rooms  {
    int roomId;
    public List<com.trial.model.availability> availability;
}

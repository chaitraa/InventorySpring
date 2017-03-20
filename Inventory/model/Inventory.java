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
}

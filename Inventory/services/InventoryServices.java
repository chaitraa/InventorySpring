package com.trial.services;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mongodb.util.JSON;
import java.time.format.DateTimeFormatter;
import com.trial.model.Inventory;
import com.trial.repository.InventoryRepositoryImpl;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by technology on 8/3/17.
 */


@Service
public class InventoryServices {

    @Autowired
    InventoryRepositoryImpl inventoryRepositoryImpl;

    public String deleteDemo() {
        inventoryRepositoryImpl.deleteAll();
        return "Deleted succesfully";
    }

    public List<Inventory> getInfo() {
        return inventoryRepositoryImpl.findAll();
    }

    public String saveInventory(Inventory inventory) {
        inventoryRepositoryImpl.save(inventory);
        return "Saved succesfully";
    }



}





















        // Date bookingDate=new Date("<2017-01-13T18:30:00Z>");
        //InventoryInfo inventoryInfoId = InventoryRepositoryImpl.findById(inventory.getId());
/*
        LocalDate bookingDate = LocalDate.parse(inventory.getBookDate(), DateTimeFormatter.ISO_LOCAL_DATE);
        inventory1.setHotelId(inventory.getHotelId());

        inventory1.setBookDate(inventory.getBookDate());
        inventory1.setBookingDate(bookingDate);
        inventory1.setAccessKey(inventory.getAccessKey());
        inventory1.setChannelId(inventory.getChannelId());
        inventory1.availabilityList(inventory.getFree());
        inventory1.setRoomId(inventory.getRoomId());
        InventoryRepositoryImpl.save(inventory1);

        //InventoryRepositoryImpl.insert(inventory.getHotelId(),inventory.getInventory(),bookingDate);


        return "Saved succesfully";
    }}
*/
     /*   public List<InventoryInfo> findByField(String text)
        {
            List<InventoryInfo> studentList= InventoryRepositoryImpl.findAll();
            List<InventoryInfo> inventoryListResult=
                    studentList.stream().filter(t->t.getBookDate()
                            //t-> t.getCourse().equals(text) || t.getName().equals(text) || t.getId().equals(text) || (t.getGpa() == Double.parseDouble(text)))
                            .collect(Collectors.toList());
            return inventoryListResult;*/


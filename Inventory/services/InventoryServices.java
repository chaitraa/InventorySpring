package com.trial.services;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mongodb.util.JSON;
import java.time.format.DateTimeFormatter;
import com.trial.model.Inventory;
import com.trial.repository.InventoryRepository;
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

@Service
public class InventoryServices {
    @Autowired
    InventoryRepository inventoryRepository;
    public String deleteDemo() {
        inventoryRepository.deleteAll();
        return "Deleted succesfully";
    }
    public List<Inventory> getInfo() {
        return inventoryRepository.findAll();
    }

    public String saveInventory(Inventory inventory) {
        inventoryRepository.save(inventory);
        return "Saved succesfully";
    }
}























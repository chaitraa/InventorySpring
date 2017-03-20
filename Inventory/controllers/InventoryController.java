package com.trial.controllers;
import com.trial.model.Inventory;
import com.trial.services.InventoryServices;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class InventoryController {
    @Autowired
    InventoryServices inventoryServices;
    @RequestMapping(value = "/deleteDemo", method = RequestMethod.POST)
    public String saveDemo() { return inventoryServices.deleteDemo();}

    @RequestMapping(value="/save",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
        public String saveInventory(@RequestBody Inventory inventory)
    {
        inventoryServices.saveInventory(inventory);
        return "success";
    }
    @RequestMapping(value = "/inventory", method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Inventory> getInfo() {
        return inventoryServices.getInfo();
    }
}

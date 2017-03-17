package com.trial.repository;

/**
 * Created by technology on 7/3/17.
 */

import com.trial.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepositoryImpl extends MongoRepository<Inventory,String>
{
   // public Inventory findById(String id);
}

package com.trial.repository;
import com.trial.model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepositoryImpl extends MongoRepository<Inventory,String>
{
}

package com.marvellous.MarvellousFullStack.Repository;

import com.marvellous.MarvellousFullStack.Entity.BatchEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BatchEntryRepository extends MongoRepository<BatchEntry, String>
{

}

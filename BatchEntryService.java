package com.marvellous.MarvellousFullStack.Service;

import com.marvellous.MarvellousFullStack.Entity.BatchEntry;
import com.marvellous.MarvellousFullStack.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatchEntryService {

    @Autowired
    private BatchEntryRepository batchEntryRepository;

    // CREATE
    public BatchEntry save(BatchEntry batchEntry) {
        return batchEntryRepository.save(batchEntry);
    }

    // READ ALL
    public List<BatchEntry> getAll() {
        return batchEntryRepository.findAll();
    }

    // READ BY ID
    public Optional<BatchEntry> getById(String id) {
        return batchEntryRepository.findById(id);
    }

    // UPDATE
    public BatchEntry update(String id, BatchEntry updatedEntry) {
        updatedEntry.setId(id); // ID set करणे आवश्यक आहे
        return batchEntryRepository.save(updatedEntry);
    }

    // DELETE
    public void deleteById(String id) {
        batchEntryRepository.deleteById(id);
    }
}

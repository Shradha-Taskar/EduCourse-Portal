package com.marvellous.MarvellousFullStack.Controller;

import com.marvellous.MarvellousFullStack.Entity.BatchEntry;
import com.marvellous.MarvellousFullStack.Service.BatchEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/batches")
public class BatchEntryController
{
    @Autowired
    private BatchEntryService service;

    @PostMapping
    public BatchEntry add(@RequestBody BatchEntry batchEntry)
    {
        return service.save(batchEntry);
    }

    @GetMapping
    public List<BatchEntry> getAll()
    {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<BatchEntry> getById(@PathVariable String id)
    {
        return service.getById(id);
    }

    @PutMapping("/{id}")
        BatchEntry update(@PathVariable String id, @RequestBody BatchEntry batchEntry)
        {
            return service.update(id, batchEntry);
        }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id)
    {
        service.deleteById(id);
        return "Deleted batch with ID: " + id;
    }

}
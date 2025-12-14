package com.marvellous.MarvellousFullStack.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "BatchDetails")
@Getter
@Setter
public class BatchEntry
{
    @Getter
    private String id;
    private String name;
    private int fees;

}

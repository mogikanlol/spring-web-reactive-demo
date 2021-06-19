package com.example.app.domain;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Accessors(chain = true)
public class Game {

    @Id
    private Long id;

    private String title;

}

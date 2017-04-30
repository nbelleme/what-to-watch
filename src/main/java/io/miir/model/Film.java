package io.miir.model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class Film {

    private Long id;

    private String name;

    private LocalDate releaseDate;

    private List<Actor> casting;


}

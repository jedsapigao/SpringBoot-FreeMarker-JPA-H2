package com.example.demo2.config;

import com.example.demo2.domain.Note;
import com.example.demo2.repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;

@Component
public class StartUpRunner {

    @Bean
    public CommandLineRunner dataLoader(NoteRepository noteRepository) {
        return args -> {
            noteRepository.save(
                    new Note(1L,
                            "Hello World!",
                            "First note in notes application",
                            LocalDateTime.of(2017, Month.FEBRUARY,3,6,30,40,50000),
                            LocalDateTime.of(2018, Month.FEBRUARY,3,6,30,40,50000)));
        };
    }

}

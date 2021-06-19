package com.example.app;

import com.example.app.domain.Game;
import com.example.app.repository.GameRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ApplicationRunner runner(GameRepository gameRepository) {
        return args -> {
            Game game = new Game()
                    .setId(1L)
                    .setTitle("Nier Replicant");
            gameRepository.save(game).block();
        };
    }
}

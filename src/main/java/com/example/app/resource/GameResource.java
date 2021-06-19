package com.example.app.resource;

import com.example.app.domain.Game;
import com.example.app.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/games")
@RequiredArgsConstructor
public class GameResource {

    private final GameRepository gameRepository;

    @GetMapping("/{id}")
    public Mono<Game> getGameById(@PathVariable("id") Long id) {
        System.out.println(Thread.currentThread());
        return Mono.just(new Game().setTitle("Automata"))
                .delayElement(Duration.ofSeconds(10));
//        return gameRepository.findGameById(id);
    }
}

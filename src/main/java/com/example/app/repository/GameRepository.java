package com.example.app.repository;

import com.example.app.domain.Game;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface GameRepository extends ReactiveCrudRepository<Game, Long> {
    Mono<Game> findGameById(Long id);
}

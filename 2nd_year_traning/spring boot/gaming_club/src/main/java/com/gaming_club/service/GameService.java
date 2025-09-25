package com.gaming_club.service;


import com.gaming_club.dto.request.GameRequest;
import com.gaming_club.dto.response.GameResponse;
import com.gaming_club.exception.ResourceNotFoundException;
import com.gaming_club.model.Game;
import com.gaming_club.repository.GameRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {


    private final GameRepository gameRepository;


    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }


    public GameResponse createGame(GameRequest request) {
        Game game = new Game();
        game.setName(request.getName());
        game.setDescription(request.getDescription());
        game.setCategory(request.getCategory());
        game.setCostPerMinute(request.getCostPerMinute());


        Game saved = gameRepository.save(game);


        GameResponse response = new GameResponse();
        response.setId(saved.getId());
        response.setName(saved.getName());
        response.setDescription(saved.getDescription());
        response.setCategory(saved.getCategory());
        response.setCostPerMinute(saved.getCostPerMinute());


        return response;
    }


    public List<GameResponse> getAllGames() {
        return gameRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }


    public GameResponse getGameById(Integer id) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game not found with id: " + id));
        return mapToResponse(game);
    }


    public GameResponse updateGame(Integer id, GameRequest request) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game not found with id: " + id));


        game.setName(request.getName());
        game.setDescription(request.getDescription());
        game.setCategory(request.getCategory());
        game.setCostPerMinute(request.getCostPerMinute());
       
        Game updated = gameRepository.save(game);
        return mapToResponse(updated);
    }


    public String deleteGame(Integer id) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game not found with id: " + id));
        gameRepository.delete(game);
        return "Game deleted successfully";
    }


    private GameResponse mapToResponse(Game game) {
        GameResponse response = new GameResponse();
        response.setId(game.getId());
        response.setName(game.getName());
        response.setDescription(game.getDescription());
        response.setCategory(game.getCategory());
        response.setCostPerMinute(game.getCostPerMinute());
        return response;
    }
}

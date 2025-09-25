package com.gaming_club.controller;


import com.gaming_club.dto.request.GameRequest;
import com.gaming_club.dto.response.ApiResponse;
import com.gaming_club.dto.response.GameResponse;
import com.gaming_club.service.GameService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/games")
public class GameController {


    private final GameService gameService;
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }


    @PostMapping
    public ResponseEntity<ApiResponse<GameResponse>> create(@Valid @RequestBody GameRequest request) {
        GameResponse response = gameService.createGame(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(201, "Game created successfully", response));
    }


    @GetMapping
    public ResponseEntity<ApiResponse<List<GameResponse>>> getAll() {
        List<GameResponse> response = gameService.getAllGames();
        return ResponseEntity.ok(new ApiResponse<>(200, "Fetched all games", response));
    }


    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<GameResponse>> getById(@PathVariable Integer id) {
        GameResponse response = gameService.getGameById(id);
        return ResponseEntity.ok(new ApiResponse<>(200, "Fetched game successfully", response));
    }


    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<GameResponse>> update(@PathVariable Integer id,
                                                            @Valid @RequestBody GameRequest request) {
        GameResponse response = gameService.updateGame(id, request);
        return ResponseEntity.ok(new ApiResponse<>(200, "Game updated successfully", response));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Integer id) {
        String msg = gameService.deleteGame(id);
        return ResponseEntity.ok(new ApiResponse<>(200, msg, null));
    }
}

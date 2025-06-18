package com.example.Game_Platform.Game;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    private static final String UPLOAD_DIR = "src/main/resources/static/images/";

    /**
     * Get all games
     * @return
     */
    public Object getAllGames() {
        return gameRepository.findAll();
    }
    
    /**
     * Get game by Id
     * 
     * @param gameId
     * @return
     */
    public Game getGameById(Long gameId) {
        return gameRepository.findById(gameId).orElse(null);
    }

    /**
     * Get Game by name
     * 
     * @param name
     * @return
     */
    public Object getGameByName(String name) {
        return gameRepository.getGameByGameName(name);
    }

    /**
     * Add new Game
     * 
     * @param game
     * @return
     */
    
    /**
     * Update a game
     * @param game
     * @return
     */
    public Game addGame(Game game, MultipartFile profilePicture) {
    Game newGame = gameRepository.save(game);
    String originalFileName = profilePicture.getOriginalFilename();

    try {
      if (originalFileName != null && originalFileName.contains(".")) {
        String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String fileName = String.valueOf(newGame.getGameId()) + "." + fileExtension;
        Path filePath = Paths.get(UPLOAD_DIR + fileName);

        InputStream inputStream = profilePicture.getInputStream();

        Files.createDirectories(Paths.get(UPLOAD_DIR));// Ensure directory exists
        Files.copy(inputStream, filePath,
            StandardCopyOption.REPLACE_EXISTING);// Save file
        newGame.setProfilePicturePath(fileName);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return gameRepository.save(newGame);
  }

  /**
   * Method to update a student
   *
   * @param studentId The ID of the student to update
   * @param student   The updated student information
   */
  public Game updateGame(Long gameId, Game game, MultipartFile profilePicture) {
    String originalFileName = profilePicture.getOriginalFilename();

    try {
      if (originalFileName != null && originalFileName.contains(".")) {
        String fileExtension = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
        String fileName = String.valueOf(gameId) + "." + fileExtension;
        Path filePath = Paths.get(UPLOAD_DIR + fileName);

        InputStream inputStream = profilePicture.getInputStream();
        Files.deleteIfExists(filePath);
        Files.copy(inputStream, filePath,
            StandardCopyOption.REPLACE_EXISTING);// Save file
        game.setProfilePicturePath(fileName);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return gameRepository.save(game);
  }

  /**
   * Method to delete a student
   *
   * @param studentId The ID of the student to delete
   */
  public void deleteGame(Long gameId) {
    Game game = gameRepository.findById(gameId).orElse(null);
    if (game == null) {
      return; // Student not found, nothing to delete
    }
    Path filePath = Paths.get(UPLOAD_DIR + game.getProfilePicturePath());
    try {
      Files.deleteIfExists(filePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    gameRepository.deleteById(gameId);
  }

    /**
     * 
     * @param gameLibraryId
     * @return
     */

    public List<Game> getGamesByGameLibraryId(Long gameLibraryId) {
        return gameRepository.getGamesByGameLibraryId(gameLibraryId);
    }

    public List<Game> getGamesByStoreId(Long storeId){
        return gameRepository.getGamesByStoreId(storeId);
    }


}

package com.example.Game_Platform;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.Game_Platform.Customer.Customer;
import com.example.Game_Platform.Game.Game;
import com.example.Game_Platform.GameLibrary.GameLibrary;


public class CustomerTest {
    
    @Test
    public void testCustomerInput() {
        Customer customer = new Customer();
        customer.setUserName("sam");
        customer.setPassword("password789");
        customer.setRole("customer");

        assertEquals("sam", customer.getUserName());
        assertEquals("password789", customer.getPassword());
        assertEquals("customer", customer.getRole());
    }

    @Test
    public void testGameLibraryInput() {
        Customer customer = new Customer();
        GameLibrary gameLibrary = new GameLibrary();
        
        
        customer.setGameLibrary(gameLibrary);
        gameLibrary.setCustomer(customer);
        List<Game> customerGames = new ArrayList<>();
        gameLibrary.setGames(customerGames);
        
        assertEquals(customer, gameLibrary.getCustomer());
        assertEquals(customerGames, gameLibrary.getGames());
        assertEquals(gameLibrary, customer.getGameLibrary());
        
    }

    @Test 
    public void testGamesInput() {
        Game game = new Game();
        GameLibrary gameLibrary = new GameLibrary();
        List <GameLibrary> gameLibraries = new ArrayList<>();

        game.setGameName("NBA");   
        game.setProfilePicturePath("https://www.webwise.ie/wp-content/uploads/2020/12/IMG1207.jpg");
        game.setGameLibrary(gameLibraries);

        assertEquals("NBA", game.getGameName());
        assertEquals("https://www.webwise.ie/wp-content/uploads/2020/12/IMG1207.jpg", game.getProfilePicturePath());
        assertEquals(gameLibraries, game.getGameLibrary());
    }
}

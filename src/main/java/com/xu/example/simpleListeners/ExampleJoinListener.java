
package com.xu.example.simpleListeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ExampleJoinListener implements Listener {

    // Diese Funktion wird ausgeführt wenn ein User den Server betritt
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){ 

        // Speichert den Spieler der beigetreten ist als Player-Objekt
        Player joinedPlayer = event.getPlayer();

        // Ruft den Namen vom Spieler ab
        String playerName = joinedPlayer.getName();

        // Schickt ihm eine persönlich Willkommensnachricht
        joinedPlayer.sendMessage("Hallo, herzlich willkommen" + playerName + "!");

    }

}

package com.xu.example.simpleListeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

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

        // ----------- //

        // Mal angenommen wir möchten allen Spielern ein Willkommensgeschenk geben...

        // Greift auf das Inventar des Spielers zu
        PlayerInventory inventory = joinedPlayer.getInventory();

        // Erstellt einen neuen Stack von 64 Diamanten (kein Datentyp!)
        ItemStack itemstack = new ItemStack(Material.DIAMOND, 64);

        // Überprüft ob der Spieler bereits einen Stack Diamanten im Inventar hat
        if(!inventory.contains(itemstack)) {
            // Wenn nicht wird er hinzugefügt
            inventory.addItem(itemstack);
            // Und eine Nachricht geschrieben
            joinedPlayer.sendMessage("Hier ein kleines Willkommensgeschenk :)");
        }


    }

}
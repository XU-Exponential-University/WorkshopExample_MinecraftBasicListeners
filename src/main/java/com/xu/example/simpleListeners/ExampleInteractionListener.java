package com.xu.example.simpleListeners;

import org.bukkit.Material; 
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.block.Block;
import org.bukkit.Location;

import java.util.Set;

public class ExampleInteractionListener implements Listener {

    @EventHandler
    public void onPlayerInteractBlock(PlayerInteractEvent event){

        // Greift auf den Spieler der das Event ausgelöst hat zu
        Player player = event.getPlayer();

        // Schaut ob es sich bei dem Item das der Spieler in der Hand hat um eine Angel handelt
        if(player.getItemInHand().getType() == Material.FISHING_ROD){

            // Speichert den Block den der Spieler im Blick hatte als das Event ausgelöst wurde
            Block target = player.getTargetBlock((Set<Material>) null, 100);

            // Speichert die Position des Blocks
            Location targetLocation = target.getLocation();

            // Erschafft an der Position einen Blitz
            player.getWorld().strikeLightning(targetLocation);
            
        }
    }

}
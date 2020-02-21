package com.xu.example.simpleListeners;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import com.xu.example.simpleListeners.ExampleJoinListener;
import com.xu.example.simpleListeners.ExampleInteractionListener;

public class SpigotPlugin extends JavaPlugin {

    final ExampleJoinListener playerJoinListener = new ExampleJoinListener();
    final ExampleInteractionListener playerInteractionListener = new ExampleInteractionListener();

    @Override
    public void onDisable() {

        // Wird ausgeführt wenn das Plugin deaktiviert wird (zum Beispiel bei einem Reload oder einem Neustart)

    }

    @Override
    public void onEnable() {

        // Wird ausgeführt wenn das Plugin aktiviert wird (zum Beispiel beim Start des Servers)

        // Hier teilen wir dem Server unsere erstellten Listener mit
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(playerJoinListener, this);        
        pm.registerEvents(playerInteractionListener, this);

    }

}


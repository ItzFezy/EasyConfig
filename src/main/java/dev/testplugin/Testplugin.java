package dev.testplugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Testplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
    getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void whenEntitydeath(EntityDeathEvent event){
        System.out.println("test");
        if(event.getDamageSource().getCausingEntity() instanceof Player player){
            player.sendMessage("you killed a mob");
        }
    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

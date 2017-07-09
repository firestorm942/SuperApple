 package Net.LostPlay.GoldApple;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;



 public class GoldApple
   extends JavaPlugin implements Listener
 {
   public void onEnable()
   {

     Gold_Apple();

     PluginManager pm = getServer().getPluginManager();
     pm.registerEvents(this, this);

     Bukkit.getServer().getPluginManager().registerEvents(this, this);
   }

     public void onDisable() {
   }

   private void Gold_Apple() {
     ItemStack Leggings = new ItemStack(Material.GOLDEN_APPLE, 1, (short)1);
     ItemMeta meta = Leggings.getItemMeta();
     meta.setDisplayName(ChatColor.GOLD + "Golden Apple");
     Leggings.setItemMeta(meta);

     @SuppressWarnings("deprecation") ShapedRecipe craft2 = new ShapedRecipe(Leggings);
     craft2.shape(new String[] {
       "+++",
       "+*+",
       "+++" });
    craft2.setIngredient('*', Material.APPLE);
    craft2.setIngredient('+', Material.GOLD_BLOCK);
     Bukkit.getServer().addRecipe(craft2);
   }
 }

package antimattaermod.GTAddon;

import antimattaermod.core.AntiMatterModRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import gregtech.api.enums.GT_Values;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * @author C6H2Cl2
 */
@Mod(modid = AMMGTAddonCore.MOD_ID,dependencies = "required-after:AntiMatterModCore@[1.0.0,);required-after:Forge@[10.13.4.1558,)")
public class AMMGTAddonCore {
    public static final String MOD_ID = "AMMGTAddon";
    public static final String MOD_NAME = "AntiMatterMod GregTech Addon";
    public static final String MOD_VERSION = "1.0.0";
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        GT_Values.RA.addForgeHammerRecipe(new ItemStack(AntiMatterModRegistry.wrench_01,1,0),
                new ItemStack(AntiMatterModRegistry.hammer_01,1,0),40,32);
    }
    
}

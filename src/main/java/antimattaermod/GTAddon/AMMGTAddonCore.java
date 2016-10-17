package antimattaermod.GTAddon;

import antimattaermod.core.AntiMatterModRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.GT_Values;
import net.minecraft.item.ItemStack;


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

        GT_Values.RA.addBenderRecipe(new ItemStack(AntiMatterModRegistry.ingot_01, 1, 1), new ItemStack(AntiMatterModRegistry.plate_01, 1, 1), 60, 32);
        GT_Values.RA.addBenderRecipe(new ItemStack(AntiMatterModRegistry.ingot_01,1,2),new ItemStack(AntiMatterModRegistry.plate_01,1,2),60,32);
        GT_Values.RA.addBenderRecipe(new ItemStack(AntiMatterModRegistry.ingot_01,1,3),new ItemStack(AntiMatterModRegistry.plate_01,1,3),60,32);

    }

}
    


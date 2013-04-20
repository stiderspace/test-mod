package test.stider.testmod;



import test.stider.testmod.block.Modblock;
import test.stider.testmod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class testmod {
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
        
        Modblock.init();
        
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
        
    }

}

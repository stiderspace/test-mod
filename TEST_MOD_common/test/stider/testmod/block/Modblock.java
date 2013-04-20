package test.stider.testmod.block;

import net.minecraft.block.Block;
import test.stider.testmod.lib.BlockIds;
import test.stider.testmod.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;

public class Modblock {
    
    public static Block testblock; 
    
    public static void init(){
        
        testblock = new BlockTest(BlockIds.TESTBLOCK_DEFAULT);
        
        GameRegistry.registerBlock(testblock, Strings.NAMETESTBLOCK);
        
    }

}

package test.stider.testmod.block;


import test.stider.testmod.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block{

    public BlockTest(int id){
        super(id, Material.rock);
        this.setUnlocalizedName(Strings.NAMETESTBLOCK);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(5F);
        
    }
       
    
}
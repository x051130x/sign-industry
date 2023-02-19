package io.github.x051130x.signindustry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Signindustry implements ModInitializer {
    //block实例
    public static final Block PILLAR = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block SIGNCIRCLENOTALLOW = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static final String MODID = "signindustry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello SignIndustry!");

        Registry.register(Registry.BLOCK, new Identifier(MODID, "pillar"), PILLAR);
        Registry.register(Registry.ITEM, new Identifier(MODID, "pillar"), new BlockItem(PILLAR, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signcirclenotallow"), SIGNCIRCLENOTALLOW);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signcirclenotallow"), new BlockItem(SIGNCIRCLENOTALLOW, new FabricItemSettings()));
    }
}

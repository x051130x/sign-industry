package io.github.x051130x.signindustry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Signindustry implements ModInitializer {

    public static final String MODID = "signindustry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static final signstatic PILLAR = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNCIRCLENOTALLOW = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNORDERFWD = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNORDERLEFT = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNORDERRIGHT = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNORDERBOTH = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNINJUNCTION = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNINJUNCTIONSTOP = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNINJUNCTIONLONGSTOP = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SECONDARYSIGNCAR = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNSTOP = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final signstatic SIGNCROSSFIRST = new signstatic(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    @Override
    public void onInitialize() {
        LOGGER.info("Hello SignIndustry!");

        Registry.register(Registry.BLOCK, new Identifier(MODID, "pillar"), PILLAR);
        Registry.register(Registry.ITEM, new Identifier(MODID, "pillar"), new BlockItem(PILLAR, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signcirclenotallow"), SIGNCIRCLENOTALLOW);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signcirclenotallow"), new BlockItem(SIGNCIRCLENOTALLOW, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signorderfwd"), SIGNORDERFWD);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signorderfwd"), new BlockItem(SIGNORDERFWD, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signorderleft"), SIGNORDERLEFT);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signorderleft"), new BlockItem(SIGNORDERLEFT, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signorderright"), SIGNORDERRIGHT);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signorderright"), new BlockItem(SIGNORDERRIGHT, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signorderboth"), SIGNORDERBOTH);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signorderboth"), new BlockItem(SIGNORDERBOTH, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signinjunction"), SIGNINJUNCTION);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signinjunction"), new BlockItem(SIGNINJUNCTION, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signinjunctionstop"), SIGNINJUNCTIONSTOP);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signinjunctionstop"), new BlockItem(SIGNINJUNCTIONSTOP, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signinjunctionlongstop"), SIGNINJUNCTIONLONGSTOP);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signinjunctionlongstop"), new BlockItem(SIGNINJUNCTIONLONGSTOP, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "secondarysigncar"), SECONDARYSIGNCAR);
        Registry.register(Registry.ITEM, new Identifier(MODID, "secondarysigncar"), new BlockItem(SECONDARYSIGNCAR, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signstop"), SIGNSTOP);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signstop"), new BlockItem(SIGNSTOP, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier(MODID, "signcrossfirst"), SIGNCROSSFIRST);
        Registry.register(Registry.ITEM, new Identifier(MODID, "signcrossfirst"), new BlockItem(SIGNCROSSFIRST, new FabricItemSettings()));
    }
}

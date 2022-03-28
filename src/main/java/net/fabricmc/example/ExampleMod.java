package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {
    public static final String MODID = "mp3_player";
    public static final Mp3Player BLOCK_MP3_PLAYER = new Mp3Player(FabricBlockSettings.of(Material.WOOD).strength(1.0f));

	@Override
	public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "mp3_player"), BLOCK_MP3_PLAYER);
        Registry.register(Registry.ITEM, new Identifier(MODID, "mp3_player"), new BlockItem(BLOCK_MP3_PLAYER, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
	}
}

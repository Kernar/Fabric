package net.kernar.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kernar.tutorialmod.block.ModBlocks;
import net.kernar.tutorialmod.entity.ModEntities;
import net.kernar.tutorialmod.entity.custom.PorcupineEntity;
import net.kernar.tutorialmod.item.ModItemGroups;
import net.kernar.tutorialmod.item.ModItems;
import net.kernar.tutorialmod.sound.ModSounds;
import net.kernar.tutorialmod.util.ModCustomTrades;
import net.kernar.tutorialmod.util.ModLootTableModifiers;
import net.kernar.tutorialmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillager();
		ModSounds.registerSounds();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
        FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}
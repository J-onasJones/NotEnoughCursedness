package me.jonasjones.nec.util;

import me.jonasjones.nec.block.ModBlocks;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class ModRegistries {

    static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier("nec", "not_enough_cursedness"))
            .icon(() -> ModBlocks.GREEN_BIRCH_LOG_ITEM.getDefaultStack())
            .build();
    public static void registerModStuffs() {
        registerFuels();
        registerCommands();
        registerEvents();
        registerStrippables();
        registerFlammableBlock();
    }

    private static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }

    private static void registerCommands() {
        //CommandRegistrationCallback.EVENT.register(SetHomeCommand::register);
        //CommandRegistrationCallback.EVENT.register(ReturnHomeCommand::register);
    }

    private static void registerStrippables() {
        //StrippableBlockRegistry.register(ModBlocks.GREEEN_BIRCH_LOG_BLOCK, ModBlocks.STRIPPED_JACARANDA_LOG);
        StrippableBlockRegistry.register(ModBlocks.GREEEN_BIRCH_LOG_BLOCK, ModBlocks.GREEEN_BIRCH_LOG_BLOCK);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.GREEN_BIRCH_LOG, 5, 5);
    }

    private static void registerEvents() {
        //ServerPlayerEvents.COPY_FROM.register(new ModPlayerEventCopyFrom());
    }

    public static void register_item(Item CUSTOM_ITEM) {
        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.add(CUSTOM_ITEM);
        });
    }
}

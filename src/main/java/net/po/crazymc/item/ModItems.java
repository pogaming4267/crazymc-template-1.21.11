package net.po.crazymc.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.po.crazymc.Crazymc;


public class ModItems {
    public static final Item bob = registerItem( "bob", new Item(new Item.Settings()));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Crazymc.MOD_ID, name),item);
    }

    public static void registerModItems(){
        Crazymc.LOGGER.info("Registering Mod Items for " + Crazymc.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(bob);
        });
    }
}

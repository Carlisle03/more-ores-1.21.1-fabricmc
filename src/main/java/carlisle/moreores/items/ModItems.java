package carlisle.moreores.items;

import carlisle.moreores.MoreOres;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TITANIUM = registerItem("titanium", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item ENDERITE = registerItem("enderite", new Item(new Item.Settings()));
    public static final Item KYANITE = registerItem("kyanite", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));
    public static final Item LEAD = registerItem("lead", new Item(new Item.Settings()));

    public static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreOres.MOD_ID, name), item);
    }
    public static void registerModItems() {
        MoreOres.LOGGER.info("REGISTERING MOD ITEMS FOR " + MoreOres.MOD_ID); 
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TITANIUM);
            entries.add(ENDERITE); 
            entries.add(RUBY);
            entries.add(LEAD);
            entries.add(SAPPHIRE);
            entries.add(KYANITE);
        });
    }
}

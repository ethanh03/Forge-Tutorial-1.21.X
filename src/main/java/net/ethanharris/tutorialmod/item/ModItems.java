package net.ethanharris.tutorialmod.item;

import net.ethanharris.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> HEROBRINES_EYE = ITEMS.register( "herobrines_eye", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEROBRINES_STAFF = ITEMS.register( "herobrines_staff", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

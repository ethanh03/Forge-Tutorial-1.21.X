package net.ethanharris.tutorialmod.item;

import net.ethanharris.tutorialmod.TutorialMod;
import net.ethanharris.tutorialmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HEROBRINE_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HEROBRINES_EYE.get()))
                    .title(Component.translatable("creativetab.herobrine_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HEROBRINES_EYE.get());
                        pOutput.accept(ModItems.HEROBRINES_STAFF.get());

                        pOutput.accept(ModBlocks.VOID_BLOCK.get());
                        pOutput.accept(ModBlocks.PURE_VOID_BLOCK.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

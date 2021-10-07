package net.jotinha.jmod.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup J_GROUP = new ItemGroup("JModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RIAXO.get());
        }
    };

}

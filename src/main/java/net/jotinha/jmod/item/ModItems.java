package net.jotinha.jmod.item;

import net.jotinha.jmod.Jmain;
import net.jotinha.jmod.item.custom.Firestone;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Jmain.MOD_ID);




    public static final RegistryObject<Item> RIAXO = ITEMS.register("riaxo",
            () -> new Item(new Item.Properties().group(ModItemGroup.J_GROUP)));

    public static final RegistryObject<Item> RIAXOMACA = ITEMS.register("azul",
            () -> new Item (new Item.Properties().group(ModItemGroup.J_GROUP)));

    public static final RegistryObject<Item> RAWRIAXO = ITEMS.register("raw_riaxo",
            () -> new Item (new Item.Properties().group(ModItemGroup.J_GROUP)));

    public static final RegistryObject<Item> RIAXOXP = ITEMS.register("riaxo_xp",
            () -> new Item (new Item.Properties().group(ModItemGroup.J_GROUP)));

    public static final RegistryObject<Item> FIRESTONE = ITEMS.register("firestone",
            () -> new Firestone(new Item.Properties().group(ModItemGroup.J_GROUP).maxDamage(5)));

    public static final RegistryObject<Item> RIAXO_NUGGET = ITEMS.register("riaxo_nugget",
            () -> new Item(new Item.Properties().group(ModItemGroup.J_GROUP)));

    public static final RegistryObject<Item> RIAXO_INGOT = ITEMS.register("riaxo_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.J_GROUP)));

    public static final RegistryObject<Item> RIAXO_INGOT_SWORD = ITEMS.register("riaxo_ingot_sword",
            () -> new SwordItem(ModItemTier.RIAXO_INGOT, 1, -2f,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_PICKAXE = ITEMS.register("riaxo_ingot_pickaxe",
            () -> new PickaxeItem(ModItemTier.RIAXO_INGOT, 0, -2.2f,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_AXE = ITEMS.register("riaxo_ingot_axe",
            () -> new AxeItem(ModItemTier.RIAXO_INGOT, 4, -3f,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_SHOVEL = ITEMS.register("riaxo_ingot_shovel",
            () -> new ShovelItem(ModItemTier.RIAXO_INGOT, 0, -1f,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_HOE = ITEMS.register("riaxo_ingot_hoe",
            () -> new HoeItem(ModItemTier.RIAXO_INGOT, 1, 1f,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_BOOTS = ITEMS.register("riaxo_ingot_boots",
            () -> new ArmorItem(ModArmorMaterial.RIAXO_INGOT, EquipmentSlotType.FEET,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_LEGS = ITEMS.register("riaxo_ingot_legs",
            () -> new ArmorItem(ModArmorMaterial.RIAXO_INGOT, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_CHEST = ITEMS.register("riaxo_ingot_chest",
            () -> new ArmorItem(ModArmorMaterial.RIAXO_INGOT, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));
    public static final RegistryObject<Item> RIAXO_INGOT_HEAD = ITEMS.register("riaxo_ingot_head",
            () -> new ArmorItem(ModArmorMaterial.RIAXO_INGOT, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ModItemGroup.J_GROUP)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

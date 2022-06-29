package endurteam.inferior_accretion.item;

import endurteam.inferior_accretion.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab INFERIOR_ACCRETION_TAB = new CreativeModeTab("inferior_accretiontab") {
        @Override
        @SuppressWarnings("NullableProblems")
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.ALABASTER.get().asItem());
        }
    };
}

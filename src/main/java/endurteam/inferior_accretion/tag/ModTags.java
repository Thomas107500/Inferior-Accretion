package endurteam.inferior_accretion.tag;

import endurteam.inferior_accretion.InferiorAccretion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static TagKey<Block> TROPICAL_MOSS_REPLACEABLE = BlockTags.create(new ResourceLocation(InferiorAccretion.MOD_ID, "tropical_moss_replaceable"));
}

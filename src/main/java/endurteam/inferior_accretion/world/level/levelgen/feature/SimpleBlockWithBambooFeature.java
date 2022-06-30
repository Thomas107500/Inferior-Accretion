package endurteam.inferior_accretion.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import endurteam.inferior_accretion.world.level.levelgen.feature.configurations.SimpleBlockWithBambooConfiguration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.BambooBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BambooLeaves;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class SimpleBlockWithBambooFeature extends Feature<SimpleBlockWithBambooConfiguration>
{
	private static final BlockState BAMBOO_TRUNK = Blocks.BAMBOO.defaultBlockState().setValue(BambooBlock.AGE, 1).setValue(BambooBlock.LEAVES, BambooLeaves.NONE).setValue(BambooBlock.STAGE, 0);
	private static final BlockState BAMBOO_FINAL_LARGE = BAMBOO_TRUNK.setValue(BambooBlock.LEAVES, BambooLeaves.LARGE).setValue(BambooBlock.STAGE, 1);
	private static final BlockState BAMBOO_TOP_LARGE = BAMBOO_TRUNK.setValue(BambooBlock.LEAVES, BambooLeaves.LARGE);
	private static final BlockState BAMBOO_TOP_SMALL = BAMBOO_TRUNK.setValue(BambooBlock.LEAVES, BambooLeaves.SMALL);

	public SimpleBlockWithBambooFeature(Codec<SimpleBlockWithBambooConfiguration> p_65137_) {
		super(p_65137_);
	}

	/**
	 * Places the given feature at the given location.
	 * During world generation, features are provided with a 3x3 region of chunks, centered on the chunk being generated,
	 * that they can safely generate into.
	 * @param context A context object with a reference to the level and the position the feature is being placed at
	 */
	public boolean place(FeaturePlaceContext<SimpleBlockWithBambooConfiguration> context) {
		SimpleBlockWithBambooConfiguration configuration = context.config();
		WorldGenLevel worldgenlevel = context.level();
		BlockPos blockpos = context.origin();
		RandomSource randomsource = context.random();
		BlockState blockstate = configuration.toPlace().getState(context.random(), blockpos);
		if (blockstate.canSurvive(worldgenlevel, blockpos) && randomsource.nextFloat() < configuration.probability()) {
			if (blockstate.getBlock() instanceof DoublePlantBlock) {
				if (!worldgenlevel.isEmptyBlock(blockpos.above())) {
					return false;
				}

				DoublePlantBlock.placeAt(worldgenlevel, blockstate, blockpos, 2);
			} else if (blockstate.getBlock() instanceof BambooBlock) {
				placeBamboo(blockpos, worldgenlevel, randomsource);
			} else {
				if (Direction.stream().noneMatch((dir) -> worldgenlevel.isEmptyBlock(blockpos.relative(dir))))
				{
					return false;
				}
				worldgenlevel.setBlock(blockpos, blockstate, 2);
			}

			return true;
		} else {
			return false;
		}
	}

	public void placeBamboo(BlockPos blockpos, WorldGenLevel worldgenlevel,
	                           RandomSource randomsource) {
		BlockPos.MutableBlockPos blockpos$mutableblockpos = blockpos.mutable();
		int j = randomsource.nextInt(12) + 5;
		for(int l1 = 0; l1 < j && worldgenlevel.isEmptyBlock(blockpos$mutableblockpos); ++l1) {
			worldgenlevel.setBlock(blockpos$mutableblockpos, BAMBOO_TRUNK, 2);
			blockpos$mutableblockpos.move(Direction.UP, 1);
		}

		if (blockpos$mutableblockpos.getY() - blockpos.getY() >= 3) {
			worldgenlevel.setBlock(blockpos$mutableblockpos, BAMBOO_FINAL_LARGE, 2);
			worldgenlevel.setBlock(blockpos$mutableblockpos.move(Direction.DOWN, 1), BAMBOO_TOP_LARGE, 2);
			worldgenlevel.setBlock(blockpos$mutableblockpos.move(Direction.DOWN, 1), BAMBOO_TOP_SMALL, 2);
		}
	}
}
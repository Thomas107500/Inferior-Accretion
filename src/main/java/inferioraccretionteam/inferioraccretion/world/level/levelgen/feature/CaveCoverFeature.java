package inferioraccretionteam.inferioraccretion.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import inferioraccretionteam.inferioraccretion.world.level.levelgen.feature.configurations.CaveCoverConfiguration;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.material.Fluids;

public class CaveCoverFeature extends Feature<CaveCoverConfiguration>
{
	public CaveCoverFeature(Codec<CaveCoverConfiguration> pCodec)
	{
		super(pCodec);
	}

	@Override
	public boolean place(FeaturePlaceContext<CaveCoverConfiguration> pContext)
	{
		int sphereRadius = pContext.config().sphereRadius.sample(pContext.random());
		if (pContext.level().isEmptyBlock(pContext.origin()) || pContext.level().isWaterAt(pContext.origin())
				|| pContext.level().isFluidAtPosition(pContext.origin(), (fs) -> fs.is(FluidTags.LAVA)))
		{
			for (int i = -sphereRadius; i <= sphereRadius; i++)
			{
				for (int j = -sphereRadius; j <= sphereRadius; j++)
				{
					for (int k = -sphereRadius; k <= sphereRadius; k++)
					{
						if (i * i + j * j + k * k <= sphereRadius * sphereRadius)
						{
							BlockPos pos = pContext.origin().offset(i, j, k);
							BlockState state = pContext.level().getBlockState(pos);
							if (state.getTags().anyMatch((tag) -> tag.toString().contains("stone"))
									&& pContext.level().ensureCanWrite(pos))
							{
								pContext.level().setBlock(pos, pContext.config().state, 3);
							}
						}
					}
				}
			}
		}
		return true;
	}
}

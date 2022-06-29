package endurteam.inferior_accretion.datafix;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import endurteam.inferior_accretion.InferiorAccretion;
import endurteam.inferior_accretion.datafix.schemas.*;
import net.minecraft.SharedConstants;
import net.minecraft.Util;
import net.minecraft.util.datafix.schemas.NamespacedSchema;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;


/**
 * Modified from {@link net.minecraft.util.datafix.DataFixers}
 */
public class ModDataFixers
{
	private static final BiFunction<Integer, Schema, Schema> SAME_NAMESPACED = NamespacedSchema::new;
	private ModDataFixers() {
	}
	private static final DataFixer dataFixer = createFixerUpper();

	@SuppressWarnings("unused")
	public static DataFixer getDataFixer() {
		return dataFixer;
	}

	private static synchronized DataFixer createFixerUpper()
	{
		DataFixerBuilder builder = new DataFixerBuilder(10);
		addFixers(builder);

		boolean flag = switch (SharedConstants.DATAFIXER_OPTIMIZATION_OPTION)
				{
					case UNINITIALIZED_OPTIMIZED, INITIALIZED_OPTIMIZED -> true;
					case UNINITIALIZED_UNOPTIMIZED, INITIALIZED_UNOPTIMIZED -> false;
				};
		InferiorAccretion.LOGGER.info("Building {} datafixer", flag ? "optimized" : "unoptimized");
		return flag ? builder.buildOptimized(Util.bootstrapExecutor()) : builder.buildUnoptimized();
	}

	@SuppressWarnings("unused")
	private static void addFixers(DataFixerBuilder builder) {
		Schema schema1 = builder.addSchema(1, V1::new);
		Schema schema1_1 = builder.addSchema(1, 1, SAME_NAMESPACED);
		Schema schema2 = builder.addSchema(2, V2::new);
		Schema schema3 = builder.addSchema(3, V3::new);
		Schema schema4 = builder.addSchema(4, V4::new);
		Schema schema5 = builder.addSchema(5, V5::new);
		Schema schema6 = builder.addSchema(6, V6::new);
		Schema schema7 = builder.addSchema(7, V7::new);
		Schema schema8 = builder.addSchema(8, V8::new);
		Schema schema9 = builder.addSchema(9, V9::new);
	}

	@SuppressWarnings("unused")
	private static UnaryOperator<String> createRenamer(Map<String, String> renameMap) {
		return (p_216526_) -> renameMap.getOrDefault(p_216526_, p_216526_);
	}

	@SuppressWarnings("unused")
	private static UnaryOperator<String> createRenamer(String oldName, String newName) {
		return (p_216523_) -> Objects.equals(p_216523_, oldName) ? newName : p_216523_;
	}

	@SuppressWarnings("unused")
	public static void init()
	{

	}
}

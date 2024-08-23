package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockStateProviderType

val <P>KClass<BlockStateProviderType<P>>.DUAL_NOISE_PROVIDER where P: BlockStateProvider by aliasStatic({BlockStateProviderType.field_34934})
val <P>KClass<BlockStateProviderType<P>>.NOISE_THRESHOLD_PROVIDER where P: BlockStateProvider by aliasStatic({BlockStateProviderType.field_34932})
val <P>KClass<BlockStateProviderType<P>>.NOISE_PROVIDER where P: BlockStateProvider by aliasStatic({BlockStateProviderType.field_34933})
val <P>KClass<BlockStateProviderType<P>>.RANDOMIZED_INT_STATE_PROVIDER where P: BlockStateProvider by aliasStatic({BlockStateProviderType.field_29300})
val <P>KClass<BlockStateProviderType<P>>.WEIGHTED_STATE_PROVIDER where P: BlockStateProvider by aliasStatic({BlockStateProviderType.field_21306})
val <P>KClass<BlockStateProviderType<P>>.SIMPLE_STATE_PROVIDER where P: BlockStateProvider by aliasStatic({BlockStateProviderType.field_21305})
val <P>KClass<BlockStateProviderType<P>>.ROTATED_BLOCK_PROVIDER where P: BlockStateProvider by aliasStatic({BlockStateProviderType.field_24938})
fun <P>BlockStateProviderType<P>.getCodec() where P: BlockStateProvider = this.method_28863()

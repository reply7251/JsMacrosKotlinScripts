package me.hellrevenger.generated.Map_PointOfInterestTypes
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PointOfInterestTypesKt {
    /**
     * field_39297
     */
    val LIGHTNING_ROD by aliasStatic(PointOfInterestTypes::field_39297)
    /**
     * field_39293
     */
    val BEEHIVE by aliasStatic(PointOfInterestTypes::field_39293)
    /**
     * field_39294
     */
    val BEE_NEST by aliasStatic(PointOfInterestTypes::field_39294)
    /**
     * field_39295
     */
    val NETHER_PORTAL by aliasStatic(PointOfInterestTypes::field_39295)
    /**
     * field_39296
     */
    val LODESTONE by aliasStatic(PointOfInterestTypes::field_39296)
    /**
     * field_39290
     */
    val WEAPONSMITH by aliasStatic(PointOfInterestTypes::field_39290)
    /**
     * field_39291
     */
    val HOME by aliasStatic(PointOfInterestTypes::field_39291)
    /**
     * field_39292
     */
    val MEETING by aliasStatic(PointOfInterestTypes::field_39292)
    /**
     * field_39278
     */
    val ARMORER by aliasStatic(PointOfInterestTypes::field_39278)
    /**
     * field_39279
     */
    val BUTCHER by aliasStatic(PointOfInterestTypes::field_39279)
    /**
     * field_39289
     */
    val TOOLSMITH by aliasStatic(PointOfInterestTypes::field_39289)
    /**
     * field_39285
     */
    val LEATHERWORKER by aliasStatic(PointOfInterestTypes::field_39285)
    /**
     * field_39286
     */
    val LIBRARIAN by aliasStatic(PointOfInterestTypes::field_39286)
    /**
     * field_39287
     */
    val MASON by aliasStatic(PointOfInterestTypes::field_39287)
    /**
     * field_39288
     */
    val SHEPHERD by aliasStatic(PointOfInterestTypes::field_39288)
    /**
     * field_39281
     */
    val CLERIC by aliasStatic(PointOfInterestTypes::field_39281)
    /**
     * field_39282
     */
    val FARMER by aliasStatic(PointOfInterestTypes::field_39282)
    /**
     * field_39283
     */
    val FISHERMAN by aliasStatic(PointOfInterestTypes::field_39283)
    /**
     * field_39284
     */
    val FLETCHER by aliasStatic(PointOfInterestTypes::field_39284)
    /**
     * field_39280
     */
    val CARTOGRAPHER by aliasStatic(PointOfInterestTypes::field_39280)
    /**
     * method_46397
     */
    fun isPointOfInterest(state: BlockState?) = PointOfInterestTypes.method_46397(state)
    /**
     * method_43993
     */
    fun register(registry: Registry<PointOfInterestType>?, key: RegistryKey<PointOfInterestType>?, states: Set<BlockState>?, ticketCount: Int, searchDistance: Int) = PointOfInterestTypes.method_43993(registry, key, states, ticketCount, searchDistance)
    /**
     * method_43989
     */
    fun getTypeForState(state: BlockState?) = PointOfInterestTypes.method_43989(state)
    /**
     * method_43992
     */
    fun registerAndGetDefault(registry: Registry<PointOfInterestType>?) = PointOfInterestTypes.method_43992(registry)
}
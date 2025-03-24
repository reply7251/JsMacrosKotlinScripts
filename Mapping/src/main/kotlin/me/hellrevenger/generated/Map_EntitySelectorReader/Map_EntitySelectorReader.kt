package me.hellrevenger.generated.Map_EntitySelectorReader
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_10853
 */
val KClass<EntitySelectorReader>.UNKNOWN_SELECTOR_EXCEPTION by aliasStatic(EntitySelectorReader::field_10853)
/**
 * field_10875
 */
val KClass<EntitySelectorReader>.INVALID_ENTITY_EXCEPTION by aliasStatic(EntitySelectorReader::field_10875)
/**
 * field_10867
 */
val KClass<EntitySelectorReader>.DEFAULT_SUGGESTION_PROVIDER by aliasStatic(EntitySelectorReader::field_10867)
/**
 * field_10882
 */
val KClass<EntitySelectorReader>.FURTHEST by aliasStatic(EntitySelectorReader::field_10882)
/**
 * field_33070
 */
val KClass<EntitySelectorReader>.ARGUMENT_DEFINER by aliasStatic(EntitySelectorReader::field_33070)
/**
 * field_10880
 */
val KClass<EntitySelectorReader>.NOT_ALLOWED_EXCEPTION by aliasStatic(EntitySelectorReader::field_10880)
/**
 * field_10837
 */
val KClass<EntitySelectorReader>.UNTERMINATED_EXCEPTION by aliasStatic(EntitySelectorReader::field_10837)
/**
 * field_10855
 */
val KClass<EntitySelectorReader>.VALUELESS_EXCEPTION by aliasStatic(EntitySelectorReader::field_10855)
/**
 * field_10869
 */
val KClass<EntitySelectorReader>.NEAREST by aliasStatic(EntitySelectorReader::field_10869)
/**
 * field_33069
 */
val KClass<EntitySelectorReader>.SELECTOR_PREFIX by aliasStatic(EntitySelectorReader::field_33069)
/**
 * field_10850
 */
val KClass<EntitySelectorReader>.RANDOM by aliasStatic(EntitySelectorReader::field_10850)
/**
 * field_10844
 */
val KClass<EntitySelectorReader>.MISSING_EXCEPTION by aliasStatic(EntitySelectorReader::field_10844)
/**
 * field_33071
 */
val KClass<EntitySelectorReader>.INVERT_MODIFIER by aliasStatic(EntitySelectorReader::field_33071)
/**
 * field_33072
 */
val KClass<EntitySelectorReader>.TAG_MODIFIER by aliasStatic(EntitySelectorReader::field_33072)
/**
 * method_9842
 */
fun EntitySelectorReader.setEntityType(arg0: EntityType<*>) = this.method_9842(arg0)
/**
 * method_9845
 */
fun EntitySelectorReader.setSorter(arg0: BiConsumer<Vec3d, MutableList<out Entity>>) = this.method_9845(arg0)
/**
 * method_9841
 */
fun EntitySelectorReader.setIncludesNonPlayers(arg0: Boolean) = this.method_9841(arg0)
/**
 * method_9861
 */
fun EntitySelectorReader.selectsAdvancements() = this.method_9861()
/**
 * method_9865
 */
fun EntitySelectorReader.setSelectsTeam(arg0: Boolean) = this.method_9865(arg0)
/**
 * method_9835
 */
fun EntitySelectorReader.getReader() = this.method_9835()
/**
 * method_9886
 */
fun EntitySelectorReader.selectsEntityType() = this.method_9886()
/**
 * method_9891
 */
fun EntitySelectorReader.setDx(arg0: Double) = this.method_9891(arg0)
/**
 * method_9908
 */
fun EntitySelectorReader.listSuggestions(arg0: SuggestionsBuilder, arg1: Consumer<SuggestionsBuilder>) = this.method_9908(arg0, arg1)
/**
 * method_9915
 */
fun EntitySelectorReader.readTagCharacter() = this.method_9915()
/**
 * method_9883
 */
fun EntitySelectorReader.getPitchRange() = this.method_9883()
/**
 * method_9907
 */
fun EntitySelectorReader.getDz() = this.method_9907()
/**
 * method_9855
 */
fun EntitySelectorReader.setYawRange(arg0: FloatRangeArgument) = this.method_9855(arg0)
/**
 * method_9850
 */
fun EntitySelectorReader.setX(arg0: Double) = this.method_9850(arg0)
/**
 * method_9906
 */
fun EntitySelectorReader.setSelectsAdvancements(arg0: Boolean) = this.method_9906(arg0)
/**
 * method_9877
 */
fun EntitySelectorReader.setHasLimit(arg0: Boolean) = this.method_9877(arg0)
/**
 * method_9885
 */
fun EntitySelectorReader.isSenderOnly() = this.method_9885()
/**
 * method_35818
 */
fun EntitySelectorReader.getSorter() = this.method_35818()
/**
 * method_61185
 */
fun <S>KClass<EntitySelectorReader>.shouldAllowAtSelectors(arg0: S) = EntitySelectorReader.method_61185<S>(arg0)
/**
 * method_9851
 */
fun EntitySelectorReader.getDx() = this.method_9851()
/**
 * method_9887
 */
fun EntitySelectorReader.setHasSorter(arg0: Boolean) = this.method_9887(arg0)
/**
 * method_9844
 */
fun EntitySelectorReader.excludesName() = this.method_9844()
/**
 * method_9848
 */
fun EntitySelectorReader.setSelectsScores(arg0: Boolean) = this.method_9848(arg0)
/**
 * method_9860
 */
fun EntitySelectorReader.setExcludesEntityType() = this.method_9860()
/**
 * method_9890
 */
fun EntitySelectorReader.setSelectsGameMode(arg0: Boolean) = this.method_9890(arg0)
/**
 * method_9840
 */
fun EntitySelectorReader.getDy() = this.method_9840()
/**
 * method_9912
 */
fun EntitySelectorReader.selectsName() = this.method_9912()
/**
 * method_9899
 */
fun EntitySelectorReader.setSelectsName(arg0: Boolean) = this.method_9899(arg0)
/**
 * method_9873
 */
fun EntitySelectorReader.getDistance() = this.method_9873()
/**
 * method_9843
 */
fun EntitySelectorReader.selectsScores() = this.method_9843()
/**
 * method_9839
 */
fun EntitySelectorReader.selectsGameMode() = this.method_9839()
/**
 * method_9902
 */
fun EntitySelectorReader.getX() = this.method_9902()
/**
 * method_9875
 */
fun EntitySelectorReader.setSuggestionProvider(arg0: BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>>) = this.method_9875(arg0)
/**
 * method_9866
 */
fun EntitySelectorReader.hasLimit() = this.method_9866()
/**
 * method_9879
 */
fun EntitySelectorReader.setZ(arg0: Double) = this.method_9879(arg0)
/**
 * method_9895
 */
fun EntitySelectorReader.getLevelRange() = this.method_9895()
/**
 * method_9892
 */
fun EntitySelectorReader.readNegationCharacter() = this.method_9892()
/**
 * method_9910
 */
fun EntitySelectorReader.excludesEntityType() = this.method_9910()
/**
 * method_9889
 */
fun EntitySelectorReader.hasSorter() = this.method_9889()
/**
 * method_9833
 */
fun EntitySelectorReader.setExcludesTeam(arg0: Boolean) = this.method_9833(arg0)
/**
 * method_9857
 */
fun EntitySelectorReader.setExcludesGameMode(arg0: Boolean) = this.method_9857(arg0)
/**
 * method_9837
 */
fun EntitySelectorReader.excludesGameMode() = this.method_9837()
/**
 * method_9918
 */
fun EntitySelectorReader.setDz(arg0: Double) = this.method_9918(arg0)
/**
 * method_9898
 */
fun EntitySelectorReader.setPitchRange(arg0: FloatRangeArgument) = this.method_9898(arg0)
/**
 * method_9916
 */
fun EntitySelectorReader.addPredicate(arg0: Predicate<Entity>) = this.method_9916(arg0)
/**
 * method_9852
 */
fun EntitySelectorReader.setLocalWorldOnly() = this.method_9852()
/**
 * method_9913
 */
fun EntitySelectorReader.setExcludesName(arg0: Boolean) = this.method_9913(arg0)
/**
 * method_35816
 */
fun EntitySelectorReader.excludesTeam() = this.method_35816()
/**
 * method_9853
 */
fun EntitySelectorReader.getYawRange() = this.method_9853()
/**
 * method_9871
 */
fun EntitySelectorReader.build() = this.method_9871()
/**
 * method_9868
 */
fun EntitySelectorReader.getZ() = this.method_9868()
/**
 * method_9900
 */
fun EntitySelectorReader.setLimit(arg0: Int) = this.method_9900(arg0)
/**
 * method_9905
 */
fun EntitySelectorReader.setDy(arg0: Double) = this.method_9905(arg0)
/**
 * method_9846
 */
fun EntitySelectorReader.setLevelRange(arg0: net.minecraft.class_2096.class_2100) = this.method_9846(arg0)
/**
 * method_9884
 */
fun EntitySelectorReader.getY() = this.method_9884()
/**
 * method_9870
 */
fun EntitySelectorReader.setDistance(arg0: net.minecraft.class_2096.class_2099) = this.method_9870(arg0)
/**
 * method_9882
 */
fun EntitySelectorReader.read() = this.method_9882()
/**
 * method_9864
 */
fun EntitySelectorReader.setY(arg0: Double) = this.method_9864(arg0)
/**
 * method_9904
 */
fun EntitySelectorReader.selectsTeam() = this.method_9904()

package me.hellrevenger.generated.Map_Scoreboard
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_1431
 */
var Scoreboard.scores by alias(Scoreboard::field_1431)
/**
 * method_1157
 */
fun Scoreboard.removeScoreHolderFromTeam(scoreHolderName: String, team: Team) = this.method_1157(scoreHolderName, team)
/**
 * method_1155
 */
fun Scoreboard.removeScore(scoreHolder: ScoreHolder, objective: ScoreboardObjective) = this.method_1155(scoreHolder, objective)
/**
 * method_1154
 */
fun Scoreboard.updateScoreboardTeam(team: Team) = this.method_1154(team)
/**
 * method_1190
 */
fun Scoreboard.onScoreRemoved(scoreHolder: ScoreHolder, objective: ScoreboardObjective) = this.method_1190(scoreHolder, objective)
/**
 * method_1189
 */
fun Scoreboard.getObjectiveForSlot(slot: ScoreboardDisplaySlot) = this.method_1189(slot)
/**
 * method_1196
 */
fun Scoreboard.getTeamNames() = this.method_1196()
/**
 * method_1194
 */
fun Scoreboard.removeObjective(objective: ScoreboardObjective) = this.method_1194(objective)
/**
 * method_1171
 */
fun Scoreboard.addTeam(name: String) = this.method_1171(name)
/**
 * method_55429
 */
fun Scoreboard.removeScores(scoreHolder: ScoreHolder) = this.method_55429(scoreHolder)
/**
 * method_1180
 */
fun Scoreboard.getOrCreateScore(scoreHolder: ScoreHolder, objective: ScoreboardObjective) = this.method_1180(scoreHolder, objective)
/**
 * method_1175
 */
fun Scoreboard.updateExistingObjective(objective: ScoreboardObjective) = this.method_1175(objective)
/**
 * method_55430
 */
fun Scoreboard.getScore(scoreHolder: ScoreHolder, objective: ScoreboardObjective) = this.method_55430(scoreHolder, objective)
/**
 * method_1191
 */
fun Scoreboard.removeTeam(team: Team) = this.method_1191(team)
/**
 * method_1152
 */
fun Scoreboard.onScoreHolderRemoved(scoreHolder: ScoreHolder) = this.method_1152(scoreHolder)
/**
 * method_55425
 */
fun Scoreboard.getOrCreateScore(scoreHolder: ScoreHolder, objective: ScoreboardObjective, forceWritable: Boolean) = this.method_55425(scoreHolder, objective, forceWritable)
/**
 * method_1170
 */
fun Scoreboard.getNullableObjective(name: String) = this.method_1170(name)
/**
 * method_1158
 */
fun Scoreboard.setObjectiveSlot(slot: ScoreboardDisplaySlot, objective: ScoreboardObjective) = this.method_1158(slot, objective)
/**
 * method_1164
 */
fun Scoreboard.getScoreHolderTeam(scoreHolderName: String) = this.method_1164(scoreHolderName)
/**
 * method_1166
 */
fun Scoreboard.getScoreHolderObjectives(scoreHolder: ScoreHolder) = this.method_1166(scoreHolder)
/**
 * method_1168
 */
fun Scoreboard.addObjective(name: String, criterion: ScoreboardCriterion, displayName: Text, renderType: net.minecraft.class_274.class_275, displayAutoUpdate: Boolean, numberFormat: NumberFormat) = this.method_1168(name, criterion, displayName, renderType, displayAutoUpdate, numberFormat)
/**
 * method_1160
 */
fun Scoreboard.updateScoreboardTeamAndPlayers(team: Team) = this.method_1160(team)
/**
 * method_1162
 */
fun Scoreboard.forEachScore(criterion: ScoreboardCriterion, scoreHolder: ScoreHolder, action: Consumer<ScoreAccess>) = this.method_1162(criterion, scoreHolder, action)
/**
 * method_1178
 */
fun Scoreboard.getKnownScoreHolders() = this.method_1178()
/**
 * method_1151
 */
fun Scoreboard.getObjectives() = this.method_1151()
/**
 * method_1153
 */
fun Scoreboard.getTeam(name: String) = this.method_1153(name)
/**
 * method_1184
 */
fun Scoreboard.getScoreboardEntries(objective: ScoreboardObjective) = this.method_1184(objective)
/**
 * method_1195
 */
fun Scoreboard.clearTeam(scoreHolderName: String) = this.method_1195(scoreHolderName)
/**
 * method_1173
 */
fun Scoreboard.updateRemovedObjective(objective: ScoreboardObjective) = this.method_1173(objective)
/**
 * method_1185
 */
fun Scoreboard.updateObjective(objective: ScoreboardObjective) = this.method_1185(objective)
/**
 * method_1172
 */
fun Scoreboard.addScoreHolderToTeam(scoreHolderName: String, team: Team) = this.method_1172(scoreHolderName, team)
/**
 * method_1163
 */
fun Scoreboard.getObjectiveNames() = this.method_1163()
/**
 * method_1159
 */
fun Scoreboard.getTeams() = this.method_1159()
/**
 * method_1193
 */
fun Scoreboard.updateRemovedTeam(team: Team) = this.method_1193(team)
/**
 * method_1150
 */
fun Scoreboard.clearDeadEntity(entity: Entity) = this.method_1150(entity)

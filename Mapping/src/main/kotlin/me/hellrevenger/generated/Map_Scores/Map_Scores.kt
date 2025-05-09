package me.hellrevenger.generated.Map_Scores
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_47529
 */
val Scores.scores by alias(Scores::field_47529)
/**
 * method_55395
 */
fun Scores.remove(objective: ScoreboardObjective) = this.method_55395(objective)
/**
 * method_55394
 */
fun Scores.getScoresAsIntMap() = this.method_55394()
/**
 * method_55388
 */
fun Scores.hasScores() = this.method_55388()
/**
 * method_55389
 */
fun Scores.get(objective: ScoreboardObjective) = this.method_55389(objective)
/**
 * method_55391
 */
fun Scores.getOrCreate(objective: ScoreboardObjective, scoreConsumer: Consumer<ScoreboardScore>) = this.method_55391(objective, scoreConsumer)

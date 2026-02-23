@file:ClassPath("../libs/jars/LattiCG.jar")
@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import com.seedfinding.latticg.math.component.BigMatrix
import com.seedfinding.latticg.math.component.BigVector
import com.seedfinding.latticg.math.lattice.enumerate.EnumerateRt
import com.seedfinding.latticg.math.optimize.Optimize
import com.seedfinding.latticg.util.DeserializeRt
import com.seedfinding.latticg.util.LCG
import com.wynntils.core.components.Models
import com.wynntils.features.chat.ChatItemFeature
import com.wynntils.models.elements.type.Element
import com.wynntils.models.items.FakeItemStack
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.stats.builders.MiscStatKind
import com.wynntils.models.stats.type.AttackType
import com.wynntils.models.stats.type.DamageType
import com.wynntils.models.stats.type.MiscStatType
import com.wynntils.models.stats.type.StatType
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api._getPrivateValue
import me.hellrevenger.library.api._setPrivateValue
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.minecraft.class_1799
import net.minecraft.class_2568
import java.util.stream.LongStream
import net.minecraft.class_2583
import net.minecraft.class_2558
import java.lang.reflect.Type
import java.util.Locale
import java.util.Locale.getDefault
import java.util.Random
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.roundToInt

/*
get another random call before PZ and disso

conclusion

LS > MS > Reflection > MR > hpr% > hpr > ED > TD > WD > FD > AD > SD > rawSD > MD > rawMD > EDef > TDef > WDef > FDef > ADef > raw1st > raw2nd > raw3rd > raw4th
missing:
TD > "WS" > "1st" > "2nd" > "3rd"
XP > LB > everything
"exploding" > hpr%
MR > "HEFF" > SD
MR > "rawHealth" > hpr
LS > "poison" > rawHealth
"atkSpd" > rawHealth
hpr > "rElemSD" > "sprint"

apophenia / bismuthinite
neutrino
hurricane / shaggy boots

===
-- xpBonus > manaRegen > healingEfficiency
XP > ED > TD > WD > FD > AD
XP > LB > MS > Reflection > MR > HEFF > SD

LS > poison > rawHealth > hpr > rawMainAttackDamage

paradox
LS > hpr% > rawMainAttackDamage > TDef
(estimate) LS > MS > hpr% > SD > rawMainAttackDamage > EDef > TDef > FDef > ADef

Sizzling shawl
exploding > hpr% > hpr > WD > SD > rSD
(estimate) exploding > hpr% > hpr > WD > FD > SD > rSD > TDef

Agglomerate apex
LS > MR > hpr > rElemSD > sprint

1 random call here

PZ
atkSpd > rawHealth > TD > WS > 1st > 2nd > 3rd

Chain rule
hpr > ED > TD > WD > rawSD > raw2nd
(estimate) MS > hpr > ED > TD > WD > rawSD > raw1st > raw2nd > raw3rd > raw4th

1 random call here

disso
rawHealth > rawSD > mainAttackDamage > ADef
(estimate) MR > rawHealth > rawSD > mainAttackDamage > TDef > ADef > raw3rd

dragon dance
LS > MS > hpr > rawSD > mainAttackDamage > EDef > WS
(estimate) LS > MS > MR > hpr > SD > rawSD > mainAttackDamage > EDef > WS

Laoc Alcher
Paradox / 3 neg
Deja Vu
Sizzling Shawl / 3 neg
-- above are bought

Octahedron
Lunar Spine

Photon Projector 7/0
Equalizer
PZ
Agglomerate Apex
Dragon Dance / 3 neg

* */

object CrackGen {
    private val BASIS: BigMatrix = DeserializeRt.mat(
        "᠘\u0002肀肀肀老ȀȀʣ\uf69f꒯鸛˵銽Ʞ\uf338ʭ裞퇫金ˆ냕袚鰁ʙ췲讛\uf11e˥\uddf8鲱옺ʏ\ue2df\ue8c9씛ˏ킳뺀섭˥\ud9d0꺅老ʦ颇馝贻ʍ\udd86쎳蔱ʀ诗궳퐑ˊ\ueaa7곜鐄ˠ鮫철\ue030ʈ췸ﶵ︲ʤ췬\ud8b5" +
                "虜ʮ\uf3de\ud986묺ˬ퓞莉ꨠʣ\ue2db\udf9f\udc1aˊ\ueca3裒묟ʀ胐ం肀ꀄȀȀ˞ं賭刂퓷넄ˆ냕Ă駍舁ʜꉧ˲鴐ˏ탃Ԃ\ue5d9쀅˛\ue7a8Ԃ\uf4a2褆ʁ\uf598Ă쫪\uf703ˠ鯫Ă裍전˝늓Ă펌\ue104ˬ" +
                "퓾̂ꏢ謆ˊ\uecd3Ђ\u0002\u0002\u0002\u0002ﯲ阮链稂鲃뻙駠吂붝쯗닟焂뎌쫀튳市맽ﶞ￭儂\uece1풪淋贁˷\uedb0闌递ʷ\ufaf3뛓褉ˬ閐톻\uf87f˓\udfa7놙評ʝ돤ꯑ\ue65cʀ꿘ﻣ숭˿ꚨ궪뎜Ă\ue0d0쏼\uec89茁˨꿒ﾠ聚ʭ\ue8a4" +
                "첟騛ʖ웑뾼衳˼꾂췼꤮ʆ釻黁\udf14˿쳂춚ﰬȀȀȀȀʆ贆˥ﰁʽ鴋ʳ谊ʹﴍˬ\ue114˷洂쪅ᰂ\uec15˓\udf07ˤ찋ʁ턇˿ꘈˠ퀃˨꼂˔霛˫뤎˼꼒˻\uee04˿찂ȀȀȀȀʎ횪ﶤ齒ˬ껱ꮈ\ueb64ʍ\udcbb\ue390쩤ʶ\ue1cf쮃" +
                "딙˙袉鶠\ue906˼뢧蛮꾽Ă뿕\uf1db璉Ȃ苘蚵跏老ʅꎝ髪\ue34b˫邧\uf79c\uecabĂ\ued9e被鷙茁ʁ\ufdeb\uf5dc\ufde0Ă\udafeꧧ隥\u0602\ue0e1\ue4cf삠昂맄菔ꎁ씁˄芕\ud993멾ʣ鞐﷽" +
                "\uda3bˌ보놼밬˳\uf5d0鏥\udd30˚킯탔\ud872ȀȀȀȀ˳꤅ʕ턎˴ꌄˋḂ\ud988ंﲸ܂뿕Ă苘\u0602ﳜȂ雯ࠂ\ued9eࠂ肃Ђ\udafeं\ue0e1Ђ맄̂쒂Ԃ\udee8༂첼Ђ躊༂ꜯȀȀȀȀʋ껺췮鰐ʅﻎ鿓行ʝ욨膽錛˾芤\ue3c5" +
                "굨˹틸뒪譡ˌ釩\ue29d혆˧춠뢂셥˚釠觯킂Ă쳥훍\uece7ᰂꎢ욊\uddbd㰂蓎퇞芯鐁ʀ쟪\uddd5쵝ʯ햓\uf6a7쑴ʡ\ue1f3菩먾ʨ벅芃ꁊ˴쎿퇬輝˻ﾑ薭訓ʥꏇ엽뤑ʋ說\udcbb텄ʯ\uebd4맨ꝒȀȀȀȀʋ긊˼脁ʝ예ʃﴋʈ괗ˌ鄉˧䴂\uda11" +
                "ʵ騉˞\udd09ʄ츁ʁ뤅ʯ픃ʡ\ue103ʨ밅ʍ㰂ﯿᄂꖣ܂變ਂ꿫Ђ\u0002\u0002\u0002\u0002뻩몧햹䰂첦ꢟ\ue5c3䰂\uedb5낚슆圂\udbd2곞靖栂\ue88f髖諓栂\udc8dꆟ뾁Ă\uefe7첋\uf488Ă꾾\ue1f1뮇䤂\udcd1쇨\uedaf" +
                "异蛑ꊄ\uf5de爂춖쪒솇⼂臅跅\ue8f5ⴂ\ueaff黷鷟ᐂ\ue097\uf7b8뫛☂袎뒚賤⠂鶦껽꾐䨂\uf3b2\uf4bb隧ᤂ곊臶랼Ḃ쏂\ue6f5覈茁˪ꇗ\ufde3鰳ȀȀȀȀ˃阅ʵ\ud907˭㔂ꚭ̂駰Ԃ\udc8dĂ銘ጂ꾾Ăꖮข蛑Ȃ춖" +
                "ਂ肻Ȃ鞀Ă\ue097܂隣ଂ\ue4d9ᄂ軍ଂ곊ᄂ쏂\u0602韞ࠂ\u0002\u0002\u0002\u0002鮮짦꾘ἂꖁ뺯蒖氂﷼鶉\ueec0ਂ폮ﶼ춘㘂매\uf68b蟥ᘂ겧ﾢ骃ࠂꪟ賯闿礂\ueaca탐鯨爂겛覈엿Ḃ\uf3b5\ufff6ꗳᔂꓑ醽\udb92Ⰲ臡뾰쳓攂ꋥ쎶뾉䈂ꇣ" +
                "鎅軖甂馣评ꎪ䠂\ued95ꏀ캘錁ʋ菡놜\ue103˅죽蓌\ue902ʛ\uea8b蚄갮ʢ\udfd0\ueeff퍥ȀȀȀȀ˦턆˜︁ʄ茂ʮ鄂ʹ\ue406˕堂ꪟం\uea4a˕\ue406ʎ쨐ʤ턁ʁ\ue10fʢ\ue503ʡ\ue303˨\udc04" +
                "˭锃ʋ茁ʼ뜂˦锔ʢ异\u0002\u0002\u0002肀肀肀老ˮ鯞솨鰡˕믴鷼\ued11ʴ\ufaeeꇈ蠩ʖ貺芝객ʨ鳳鶾줯ʼ킦ﲵ鬞ˢ컡뎍\ud824ʢ풤\uef8b정˅쮱\uedaa\ude14ʋ쫶룓\udd36ʭ뒰캆\uf818ʁ췱\ue6b5츅˺떳튟褐ʡ싂뚵鬋ʹ鮇膪ꌬ" +
                "ʄꎆꎙꀺʾ룈뾿謁˵醋\uf5c9븡ʓ\uf0be\ud9b3븽ʇ\ud890꓾霌ȀȀʀ胐ం肀ꀄˮ鮞Ȃ햻ꐄˍ藑Ђ隌訄ʨ鲣\u0602얯뤃ˢ츱˟\uabfbĂ엋섃˶떙̂궴ꀄʀ뎞Ђ蝹\ue303ʡ슢̂릛眂\ufddc줁˃윗˵酫ʓ\uf0deȂ蝘ȀȀȀȀʫ﮲" +
                "\udb8d\ue797Ă벩\uf7c1욆䤂\uddf1躕좛\u0602\udeb6믱컜☂裮\ueeab薑먁˵\uecb5꾸\ud96dˇ\ude87볃됇ʇ螚꒕\uf580Ă\uf5d8间\ue9ab밁ʾﶆ\ua7e1墨˄ꚕ\ue0f4쥧ʁ즺\udfe0" +
                "ꍼʏ쿈냫뼟ʡ뗝袛\ue210ʨ놠\ue9c3\uf42dˍ\ue5a1\ue0d8ꦈĂ鮋觛\ue1e5ᬂ\ue58fꮦ\uea98ंꮗ\ua6fa얶爂\uf2ba迕鋛Ⰲ\u0002\u0002\u0002\u0002\uabfbȂ엖ࠂ\ua48eĂꏉЂ撚Ă\uf5ecԂ쟞܂\ufaf8" +
                "Ԃ貧ਂ뻽\u0602쒦Ԃ肷Ԃ\uf2b0܂\ue0caȂ\ud9ce༂췥Ă\ue6f4\u0602鳰Ђ훨ं迅ဂ\u0002\u0002\u0002\u0002\ue3fa궣뚬稂\uf587\ueed9躜栂퓄銫쇦ᄂ蚶잍듷܂\ue8bc\uf8bb\uf398ਂ\ue5ce\udecb" +
                "鋜᠂닶냁薲ᐂ迈\ue1d7\uf496㔂\ue5ca붉\udfa0⼂\ue6d5鎅엄ἂ\uf497躎麰㸂胫\ue3ec\uddcaଂ誩컾装䤂ꆬ\uf5ee髜⸂裟\ue5d8螰堂\uddd1낖\uefe4 \uee82ꂵ\ue5b9娂门\uf7c0\ue58b" +
                "猂\ue3e6貔추ሂ\uf794맱\ue99c耂ȀȀȀȀʞ蔂ʌ\uf801˔쐒˻줈˨밈ʜ넁ˏ褏˲뜎˥쨍˦픃ʍ\ue811ʀ\ueb03˷협ˠ팚ʈ\udf05˝儂\uee02ʕ\ue807ˣ\ue60c˷鐉ȀȀȀȀˆꋶ즑\uf745ʜ늮釒먘˄ꮂ駀뉑˳듙" +
                "\uf7c1꜋ʹ믮샽鐢ˬ쓧\ufbcc蹖ʷ뾏쿌윲ʊ꓃쮸鈒ˬ\uf8a7쳘꙰ˮ쾪諈蒒Ă\ue49d뿧隑ᜂ臱릺點夂뾊\uf781쇞ᔂ\ue0a8蚿辋넁˨\ud9a2ꮀ쐪ʭ鯌莔딠ʫꂚ黗쀽˼뚔볳\udf0fˆꚄ鷂衉ʿ\uf08e쮾\ufb3fȀȀȀȀʻ\udd09" +
                "˥촁ʽ퐍ʎ쬆ˈ쐁ʕ묈ˊ䀂誤̂\uecf8܂鎰Ԃ\ue49d༂肏\u0602뾊܂\ue0a8\u0602\ue8d9Ȃ퓤̂훟Ԃ藉ଂ욦Ђ슏Ă\u0002\u0002\u0002\u0002뎂\uf1fd蓍\u0602\uecb1붯\ue29eᰂ跇裟햍ᔂ\uf6a2蓶鏺\u3102\ud9ee" +
                "허겎༂薠\uf6a0鰡ʂ\uf7d0靈쌋˂퓙\uf7d2鐆ʅﲙ\udfc1贐ʫힺ\ue7aa왑ʔ\udeaf솴\uea12ʀ\ue3ce\uea9e묌ʚꇕ\uea9f\ue993Ăꆦ隉鳝ᬂ맢힉醑樂쓋꫱蛘ᄂ黄\udbe1\udf98꜁ˌ랸얱逑ˎ놸\udb85" +
                "鍤ʚ돫\udec6顐ȀȀȀȀʳ舁ˬ넍ʍ윈˶ꈄʨ鄊˼\udf09ʂ眂뾫\u0602ﲃ\u0602ꯗਂ\ueda1ဂ胣ข\ue7deਂꆦ\u0602좝ࠂ붴Ԃ\ue3bbЂ첷᠂돎܂\ue7ccЂ\u0002\u0002\u0002\u0002뚣떡랼䀂薷賭\ue297异\ue4aa\udcbd" +
                "ꣻ鈁˃駎ꪆ\ue393Ă燎\uf3e3鏱ଂ첬\ud8a2쯍∂ꞻ쾋駊䨂骔\uea99念紂첀펯\uf6a1堂\ue3a6쟤\ufbc4ਂﷸ볰낯㌂臙釿臍䤂鋛훭閵ᔂ\ue0b6웺梨༂ꣶ뾭쒥漂\uf4d8骎\ue0d9㈂웵듑ꋅ䤂ꗄ폆颍\u3102쮸릯쪾ጂ銅鲍\uebdf" +
                " \u0002\u0002\u0002\u0002쯜ਂ薷ం鷕̂뻦Ă燎̂첬ࠂ\uda44˧\ueb05ʵ，ˣꘇʄ蜓ʁ\ud901˯ꐉʡ줉˙ं趧Ԃ웵ᐂꗄ̂뛇\u0602銅ం"
    )
    private val ROOT_INV: BigMatrix = DeserializeRt.mat(
        "᠘⎀肀肀胀㈂肀퀌\u0a80肀肀肠\u191f肀鐃᪀肀肀胀㈮肀퀌㚀肀肀胀㈊肀쨁⺀肀肀肀攂胀㈋肀肀肀ꀙẀ肔̀Ȁȓ肀肀肀쀲㚀肨؟肀肀肀쀲ក胐ఫ肀肀肀쀲㊀胐ి肀肀肀聥\u0380胊Ē肀肀肀ꀙྀ胐ం肀肀肀老\u0002ڀ肀肀胀㈓肀꠆ހ肀肀肀支肀鐃Ẁ肀肀肀攎肀쨁ᎀ肀肀" +
                "肠ᤎ肀퀌㪀肀肀肀攎肀꠆\u0002\u0002➀肀肀胀㈚肀퀌ހ肀肀肀攒肀퀌\u0a80肀肀胐ధ肀퀌ʀ肀肀胊Ċ肀꠆ހ肀肀肀攒肀퀌\u0002\u0002亀肀肀肀攃肀攋肀肀肀쀲輁肀퀌 肀肀胀㉆肀퀌往肀肀肀攊肀쨁ʀ肀肀肠ᤇ肀鐃⎀肀肀胀㈂肀퀌\u0002\u0002ᮀ肀肀胀㈯肀퀌 肀肀肠\u193f肀퀌嚀" +
                "肀肀肀攏肀鐃䪀肀肀肀攋肀꠆\u0002\u0002 肀肀胀㉆肀퀌ᾀ肀肀肀敚肀퀌\u0b80肀肀肠ᥓ肀퀌ʀ肀肀肨؇肀攇肀肀肀쀲ኀ肨\u0602肀肀肀老\u0002㪀肀肀肀攎肀꠆\u0380肀肀胀㈆肀꠆㾀肀肀肀攃肀쨁ᾀ肀肀胀㈗肀퀌\u0380肀肀肔̋肀퀌\u0002\u0002侀肀肀肀攂肀攂肀" +
                "肀肀퀌ހ胊ė肀肀肀쀲䞀胐ఊ肀肀肀퀌➀胐ఏ肀肀肀聥⪀胐ఀȀɇ肀肀肀聥ʀ肔̆肀肀肀퀌㪀胐ఋ肀肀肀聥Ẁ胐ః肀肀肀퀌ڀ胊ć肀肀肀ꀙኀ肔̀ȀȪ肀肀肀쀲㎀胐ట肀肀肀聥ྀ胊Ŧ肀肀肀聥技胐ఋ肀肀肀쀲Ẁ肨؏肀肀肀聥⪀胐ఀȀȂ肀肀肀聥ހ胐ి肀肀肀聥\u0380胊Ě肀肀肀" +
                "聥侀胐ಚƀ肀肀肀攻肀퀌 肀肀肀敃肀퀌\u0002\u0002\u0a80肀肀胀\u321f肀꠆➀肀肀肀攗肀鐃 肀肀胀㉆肀퀌往肀肀肀攊肀쨁ڀ肀肀胀㈓肀꠆\u0002\u0002ʀ肀肀胀㈇肀꠆㮀肀肀肀攏肀꠆媀肀肀肀攣肀꠆䪀肀肀肀攋肀꠆䪀肀肀肀攋肀꠆\u0002\u0002ހ肀肀胐\u0c3b肀퀌⺀肀肀" +
                "肀攂胀㉆肀肀肀聥\u0380肔̃肀肀肀ꀙڀ肔̀ȀȀȀȎ肀肀肀聥⮀胐ం肀肀肀ꀙހ肔̲肀肀肀聥᪀肨\u0603肀肀肀퀌ڀ胊Ă肀肀肀쀲ހ肨\u0600ȀȻ肀肀肀聥ྀ肨؆肀肀肀쀲ᎀ肨ؗ肀肀肀聥䊀胐ః肀肀肀ꀙڀ肔̃肀肀肀쀲ڀ肨\u0600Ȁȋ肀肀肀聥Ẁ胐ః肀肀" +
                "肀쀲ڀ肨ئ肀肀肀聥 肔̦肀肀肀聥 肔̺肀肀肀聥\u0e80肨\u0600ȀȂ肀肀肀ꀙހ肔̂肀肀肀聥ހ胐ద肀肀肀聥 肔̃肀肀肀ꀙڀ肔̆肀肀肀쀲ᎀ肨\u0600Ȁȳ肀肀肀聥ᮀ肨\u0602肀肀肀쀲ހ肨ٖ肀肀肀聥ྀ肔͂肀肀肀聥ʀ肨؏肀肀肀聥⪀胐ఀȀȆ肀肀肀" +
                "聥ᎀ胐ఓ肀肀肀쀲往胐ః肀肀肀퀌ڀ胊ď肀肀肀쀲⪀肨؞肀肀肀쀲 胐ఀȀȳ肀肀肀聥ᮀ肨\u0603肀肀肀聥ڀ胐శ肀肀肀聥\u0a80肔̂肀肀肀鐃\u0a80胐ం肀肀肀쀲ހ肨\u0600Ȁȃ肀肀肀聥ڀ胐ః肀肀肀쀲ڀ肨؎肀肀肀ꀙ⊀胐ః肀肀肀聥ڀ胐ల肀肀肀聥᪀肨" +
                "\u0600Ȁȃ肀肀肀聥ڀ胐ః肀肀肀퀌ڀ胊ć肀肀肀쀲ኀ肨ؾ肀肀肀聥ʀ胊Ď肀肀肀聥⮀胐ఀȀȆ肀肀肀ꀙᎀ肔̊肀肀肀聥ᾀ胐చ肀肀肀쀲⺀胐ఓ肀肀肀聥㚀胐ం肀肀肀ꀙހ肔̀Ȁȃ肀肀肀ꀙڀ肔̫肀肀肀聥➀肨غ肀肀肀聥\u0e80肨\u0603肀肀肀聥ڀ胐\u0c4e" +
                "肀肀肀聥\u0380聥\u0002\u0002\u0a80肀肀胀\u321f肀꠆ྀ肀肀肀攪肀퀌檀肀肀肀敖肀퀌⺀肀肀肀攂胀㈏肀肀肀聥⪀胐ఀȀȃ肀肀肀聥ڀ胐ట肀肀肀쀲ក胐ఎ肀肀肀聥⮀胐ఒ肀肀肀聥㞀胐ఆ肀肀肀聥ᎀ胐ఀȀȏ肀肀肀聥⪀胐ఫ肀肀肀聥➀肨\u0603肀肀肀쀲ڀ肨\u0603" +
                "肀肀肀쀲ڀ肨؊肀肀肀聥ᾀ胐ఀȀȀȀȀȀɂ肀肀肀聥ʀ肨ؒ肀肀肀ꀙྀ胐ఇ肀肀肀쀲ኀ肨\u0600Ȁȃ肀肀肀ꀙڀ肔̣肀肀肀쀲ʀ胐ఋ肀肀肀聥Ẁ胐ం肀肀肀聥ހ胐ఎ肀肀肀聥⮀胐ఀȀȷ肀肀肀聥\u0b80肔̃肀肀肀퀌ڀ胊Ă肀肀肀쀲ހ肨آ肀肀肀쀲\u0380胐ణ肀肀" +
                "肀쀲ʀ胐ఀȀȇ肀肀肀ꀙኀ肔̗肀肀肀聥䊀胐ష肀肀肀聥\u0b80肔̊肀肀肀쀲ᾀ肨ؒ肀肀肀聥㞀胐ఀȀȊ肀肀肀쀲ᾀ肨\u0602肀肀肀鐃\u0a80胐ఆ肀肀肀聥ᎀ胐ె肀肀肀聥\u0380肔̳肀肀肀聥ᮀ肨\u0600Ȁț肀肀肀聥亀胐ఇ肀肀肀쀲ኀ肨٫肀肀肀聥垀" +
                "胐ఎ肀肀肀聥⮀胐ఒ肀肀肀聥㞀胐ఀȀȎ肀肀肀聥⮀胐మ肀肀肀聥ʀ쀲 肀肀胀㉆肀퀌\u0380肀肀胀㈆肀꠆⎀肀肀胀㈂肀퀌\u0002\u0002ក肀肀肀敂肀퀌\u0b80肀肀胀㈞肀꠆⾀肀肀肀攃胀㈊肀肀肀쀲ᾀ肨؇肀肀肀聥ኀ胐ఀȀȚ肀肀肀聥侀胐ఞ肀肀肀쀲 胐ః肀肀肀퀌ڀ胊ă肀" +
                "肀肀퀌ڀ胊Ă肀肀肀쀲ހ肨\u0600ȀȊ肀肀肀聥ᾀ胐ఆ肀肀肀聥ᎀ胐ఖ肀肀肀쀲䚀胐ఛ肀肀肀聥亀胐ృ肀肀肀聥\u0380肨\u0600ȀȀȀȯ肀肀肀聥\u0380쀲\u0380肀肀肀攆肀퀌ڀ肀肀胀㈓肀꠆⚀肀肀胀㈛肀퀌\u0002\u0002ʀ肀肀胐ఇ肀쨁\u0a80肀肀" +
                "肀攟肀퀌㺀肀肀肀攂肀쨁ڀ肀肀胐\u0c3a肀퀌ྀ肀肀肀攪肀퀌\u0002\u0002\u0380肀肀肠ᤆ肀鐃\u0380肀肀肀攆肀퀌\u0380肀肀肀攆肀퀌䊀肀肀肀攂肀꠆\u0e80肀肀肠ᤢ肀퀌\u0002\u0002ក肀肀肀敂肀퀌ހ肀肀胀㈒肀꠆ក肀肀胀㉇肀퀌ʀ肀肀胀㈇肀꠆ʀ肀肀肀" +
                "攇肀퀌\u0002\u0002\u0e80肀肀肠ᤢ肀퀌\u0002\u0002\u0002\u0002ក肀肀肀敂肀퀌\u0380肀肀肀攆肀퀌\u0002\u0002ހ肀肀肀攒肀퀌\u0380肀肀肀攆肀퀌䎀肀肀肀攃肀꠆㎀肀肀肀攛肀꠆\u0b80肀肀胀㈞肀꠆\u0002\u0002ހ肀肀胀㈒肀꠆\u0380肀肀胀㈆肀꠆ྀ肀肀肀攪肀퀌" +
                "ހ肀肀胀㈒肀꠆ހ肀肀肀攒肀퀌\u0002\u0002\u0002\u0002ᎀ肀肀肀收肀퀌\u0380肀肀肀攆肀퀌ʀ肀肀肀攇肀퀌\u0a80肀肀肀攟肀퀌\u0002\u0002ኀ肀肀肀攷肀퀌\u0380肀肀肔̋肀퀌\u0380肀肀肀攆肀퀌ʀ肀肀肠ᤇ肀鐃\u0002\u0002"
    )
    private val ORIGIN: BigVector = DeserializeRt.vec(
        "᠀ȀȖȖ˴髯슒ဂ\uf49a\uefc2鈐˺\ue4f2쒊ꨅ˺\ue4f2쒊ꨅʈ뒦벎츖ʈ뒦벎츖˾諧\uaad2픮˾諧\uaad2픮ʼ闁隮\ud80bʼ闁隮\ud80bʢ\uf492馚\ue80bʢ\uf492馚\ue80bʐ駗질긾ʐ駗질긾˦\uf2c5" +
                "뎣뙃˦\uf2c5뎣뙃ʄꦩ﮷锺ʄꦩ﮷锺ˊꢒ쾲\uec1dˊꢒ쾲\uec1dȀ"
    )
    private val ROOT_ORIGIN: BigVector = DeserializeRt.vec(
        "\u18fa뗗芘돂폂遝肀肀肀₂\uf0d0貈ꎅ鲉셭肀肀肀老쯥銘펟\ue8cd诣숁肀肀肀䃻뗗슑쪘蚤갌肀肀肀ზ泥銁\uf0c5쳶ퟡƀ肀肀聀믴쓘헉飊\ud9e0똂肀肀肀老﮵힢ﷰ뻽薕ᎀ肀肀耈\udad6\ue0d7탵힉鶸뀁肀肀肀老黲쫲\ueae3쎠\ue0f2" +
                "묄肀肀肀老쯥銘\uf5e8\uf58f룉喀肀肀聀ꪆ鳭\udcc6벧컘\ue701肀肀肀老뚚\uede7\ue8cdﳝ\uf5da鰁肀肀肀䃣趵趯삻쎘蔜肀肀肀₧ꦟꢯ諨諄螜ƀ肀肀肀ǋ\ue592飵\ue8e5싀정肀肀肀老\ue7ea뇒ﻅ\uf5df\uea8d" +
                "\u0b80肀肀肀ǯꆆ袻잃鷪뺒ƀ肀肀聀\ue28d떍꿀\uf3e9뗽掀肀肀聀蝹힂\ue997솾꾯梀肀肀聀﮵힂\ue997臶跊눁肀肀肀老껣颲誃醄ﲡ\ue001肀肀肀老\ue28d떍跷엏쯎訁肀肀肀老\ueea1蚈責\uf2e4\ue2e5⢀肀肀耐鏞立ꋯ뻪" +
                "膡䪀肀肀聀"
    )

    /**
     * Finds all values of `seed` that could produce the given results in the following code:
     * <pre>`Random rand = new Random(seed ^ 0x5DEECE66DL);
     * int nextInt1 = rand.nextInt(101);
     * assert nextInt1 >= minNextInt1 && nextInt1 < maxNextInt1;
     * int nextInt2 = rand.nextInt(101);
     * int nextInt3 = rand.nextInt(101);
     * int nextInt4 = rand.nextInt(101);
     * int nextInt5 = rand.nextInt(101);
     * int nextInt6 = rand.nextInt(101);
     * int nextInt7 = rand.nextInt(101);
     * assert nextInt7 >= minNextInt7 && nextInt7 < maxNextInt7;
     * int nextInt8 = rand.nextInt(101);
     * int nextInt9 = rand.nextInt(101);
     * int nextInt10 = rand.nextInt(101);
     * int nextInt11 = rand.nextInt(101);
     * int nextInt12 = rand.nextInt(101);
    `</pre> *
     *
     *
     * This code skips 0.000019% of seeds in its search.
     */
    fun getSeeds(
        minNextInt1: Int,
        maxNextInt1: Int,
        nextInt2: Int,
        nextInt3: Int,
        nextInt4: Int,
        nextInt5: Int,
        nextInt6: Int,
        minNextInt7: Int,
        maxNextInt7: Int,
        nextInt8: Int,
        nextInt9: Int,
        nextInt10: Int,
        nextInt11: Int,
        nextInt12: Int
    ): LongStream {
        val builder = Optimize.Builder.ofSize(24)
        if (minNextInt1 >= maxNextInt1) {
            return LongStream.empty()
        }
        builder.withLowerBound(0, 0).withUpperBound(0, (1L shl 48) - 4456448)
        builder.withLowerBound(1, minNextInt1.toLong() shl 17).withUpperBound(1, (maxNextInt1.toLong() shl 17) - 1)
        builder.withLowerBound(2, 0).withUpperBound(2, (1L shl 48) - 4456448L)
        builder.withLowerBound(3, nextInt2.toLong() shl 17).withUpperBound(3, (nextInt2.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(4, 0).withUpperBound(4, (1L shl 48) - 4456448L)
        builder.withLowerBound(5, nextInt3.toLong() shl 17).withUpperBound(5, (nextInt3.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(6, 0).withUpperBound(6, (1L shl 48) - 4456448L)
        builder.withLowerBound(7, nextInt4.toLong() shl 17).withUpperBound(7, (nextInt4.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(8, 0).withUpperBound(8, (1L shl 48) - 4456448L)
        builder.withLowerBound(9, nextInt5.toLong() shl 17).withUpperBound(9, (nextInt5.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(10, 0).withUpperBound(10, (1L shl 48) - 4456448L)
        builder.withLowerBound(11, nextInt6.toLong() shl 17).withUpperBound(11, (nextInt6.toLong() shl 17) or 0x1ffffL)
        if (minNextInt7 >= maxNextInt7) {
            return LongStream.empty()
        }
        builder.withLowerBound(12, 0).withUpperBound(12, (1L shl 48) - 4456448)
        builder.withLowerBound(13, minNextInt7.toLong() shl 17).withUpperBound(13, (maxNextInt7.toLong() shl 17) - 1)
        builder.withLowerBound(14, 0).withUpperBound(14, (1L shl 48) - 4456448L)
        builder.withLowerBound(15, nextInt8.toLong() shl 17).withUpperBound(15, (nextInt8.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(16, 0).withUpperBound(16, (1L shl 48) - 4456448L)
        builder.withLowerBound(17, nextInt9.toLong() shl 17).withUpperBound(17, (nextInt9.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(18, 0).withUpperBound(18, (1L shl 48) - 4456448L)
        builder.withLowerBound(19, nextInt10.toLong() shl 17)
            .withUpperBound(19, (nextInt10.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(20, 0).withUpperBound(20, (1L shl 48) - 4456448L)
        builder.withLowerBound(21, nextInt11.toLong() shl 17)
            .withUpperBound(21, (nextInt11.toLong() shl 17) or 0x1ffffL)
        builder.withLowerBound(22, 0).withUpperBound(22, (1L shl 48) - 4456448L)
        builder.withLowerBound(23, nextInt12.toLong() shl 17)
            .withUpperBound(23, (nextInt12.toLong() shl 17) or 0x1ffffL)
        return EnumerateRt.enumerate(BASIS, ORIGIN, builder.build(), ROOT_INV, ROOT_ORIGIN)
            .mapToLong { vec: BigVector? ->
                (vec!!.get(0).numerator.toLong() * 0xdfe05bcb1365L + 0x615c0e462aa9L) and ((1L shl 48) - 1)
            }
    }

    fun getSeeds(item1: GearItem, item2: GearItem,): LongStream {
        fun getRoll(statType: StatType, value: Int) =
            (value.toDouble() / item1.itemInfo.getPossibleValues(statType).baseValue() * 100).roundToInt() - 30
        val xp1 = item1.identifications.find { it.statType.apiName.contains("xp", true) }!!.let { getRoll(it.statType, it.value) }
        val e1 = item1.identifications.find { it.statType.apiName.contains("earth", true) }!!.let { getRoll(it.statType, it.value) }
        val t1 = item1.identifications.find { it.statType.apiName.contains("thunder", true) }!!.let { getRoll(it.statType, it.value) }
        val w1 = item1.identifications.find { it.statType.apiName.contains("water", true) }!!.let { getRoll(it.statType, it.value) }
        val f1 = item1.identifications.find { it.statType.apiName.contains("fire", true) }!!.let { getRoll(it.statType, it.value) }
        val a1 = item1.identifications.find { it.statType.apiName.contains("air", true) }!!.let { getRoll(it.statType, it.value) }
        val xp2 = item2.identifications.find { it.statType.apiName.contains("xp", true) }!!.let { getRoll(it.statType, it.value) }
        val e2 = item2.identifications.find { it.statType.apiName.contains("earth", true) }!!.let { getRoll(it.statType, it.value) }
        val t2 = item2.identifications.find { it.statType.apiName.contains("thunder", true) }!!.let { getRoll(it.statType, it.value) }
        val w2 = item2.identifications.find { it.statType.apiName.contains("water", true) }!!.let { getRoll(it.statType, it.value) }
        val f2 = item2.identifications.find { it.statType.apiName.contains("fire", true) }!!.let { getRoll(it.statType, it.value) }
        val a2 = item2.identifications.find { it.statType.apiName.contains("air", true) }!!.let { getRoll(it.statType, it.value) }

        return getSeeds(xp1 - 2, xp1 + 3, e1, t1, w1, f1, a1, xp2 - 2, xp2 + 3, e2, t2, w2, f2, a2)
    }
}

class LRUCache<K, V>(val size: Int) {
    private val cache = mutableMapOf<K, Node<K, V>>()
    private val head = Node(null as K, null as V)
    private val tail = Node(null as K, null as V)

    init {
        assert(size > 0) { "Size ($size) must be > 0" }
        head.next = tail
        tail.prev = head
    }

    private fun addToHead(node: Node<K,V>) {
        node.prev = head
        node.next = head.next
        head.next?.prev = node
        head.next = node
    }

    private fun removeNode(node: Node<K,V>) {
        node.prev?.next = node.next
        node.next?.prev = node.prev
    }

    private fun moveToHead(node: Node<K,V>) {
        removeNode(node)
        addToHead(node)
    }

    private fun removeUnused() {
        if (cache.size <= size) return

        val last = tail.prev
        if (last != null && last != head) {
            cache.remove(last.key)
            removeNode(last)
        }
    }

    operator fun get(key: K): V? {
        val node = cache[key] ?: return null
        moveToHead(node)
        return node.value
    }

    fun getOrPut(key: K, defaultValue: () -> V): V {
        return get(key) ?: defaultValue().apply {
            set(key, this)
        }
    }

    operator fun set(key: K, value: V) {
        val node = cache[key]
        if (node != null) {
            node.value = value
            moveToHead(node)
        } else {
            removeUnused()

            val newNode = Node(key, value)
            cache[key] = newNode
            addToHead(newNode)
        }
    }

    data class Node<K,V>(val key: K, var value: V, var next: Node<K,V>? = null, var prev: Node<K,V>? = null)
}

class MyRandom(seed: Long) : Random(seed) {
    var initialSeed = seed

    override fun setSeed(seed: Long) {
        super.setSeed(seed xor LCG.JAVA.multiplier)
        initialSeed = seed
    }
}



val identificationOrder by lazy {
    val misc1 = listOf(
        MiscStatKind.XP_BONUS.apiName,
        MiscStatKind.LOOT_BONUS.apiName,
        MiscStatKind.LOOT_QUALITY.apiName,
        MiscStatKind.GATHERING_XP.apiName,
        MiscStatKind.GATHER_SPEED.apiName,
        MiscStatKind.MAX_MANA_RAW.apiName,
        MiscStatKind.LIFE_STEAL.apiName,
        MiscStatKind.MANA_STEAL.apiName,
        MiscStatKind.STEALING.apiName,
        MiscStatKind.ATTACK_SPEED.apiName,
        MiscStatKind.MAIN_ATTACK_RANGE.apiName,
        MiscStatKind.KNOCKBACK.apiName,
        MiscStatKind.REFLECTION.apiName,
        MiscStatKind.THORNS.apiName,
        MiscStatKind.EXPLODING.apiName,
        MiscStatKind.POISON.apiName,
        MiscStatKind.SLOW_ENEMY.apiName,
        MiscStatKind.WEAKEN_ENEMY.apiName,
        MiscStatKind.MANA_REGEN.apiName,
        MiscStatKind.HEALTH.apiName,
        MiscStatKind.HEALTH_REGEN_PERCENT.apiName,
        MiscStatKind.HEALTH_REGEN_RAW.apiName,
        MiscStatKind.HEALING_EFFICIENCY.apiName,
    )

    val misc2 = listOf(
        MiscStatKind.WALK_SPEED.apiName,
        MiscStatKind.SPRINT.apiName,
        MiscStatKind.SPRINT_REGEN.apiName,
        MiscStatKind.JUMP_HEIGHT.apiName,
    )

    val elements = Element.entries
    // need to check
    val damageElements = listOf("", "Neutral") + elements.map { it.displayName } + listOf("Elemental")
    // need to check
    val defenceElements = elements.map { it.displayName } + listOf("Elemental")
    val raw = listOf("", "raw")
    // raw
    val damages = AttackType.entries.flatMap { type -> raw.flatMap { r -> damageElements.map { elem -> "$r$type${elem}Damage" } } }
    val defences = defenceElements.map { "${it}Defence" }

    val spellCosts = listOf("1st", "2nd", "3rd", "4th").flatMap { listOf("${it}SpellCost", "raw${it}SpellCost") }
    (misc1 + damages + listOf("criticalDamageBonus") + defences + misc2 + spellCosts).map { it.replaceFirstChar { it.lowercase(getDefault()) } }
}



var previewCount = 60
var lastItem: GearItem? = null
var lastSeed = 0L

fun getError(diff: Int, base: Int): Int {
    return ceil(abs(diff / base.toDouble() / 1.9)).roundToInt()
}

data class ID(val statType: String, val roll: Int, val error: Int, val positive: Boolean)
data class ID2(val statType: String, val roll: Int, val randomValue: Int, val index: Int)

data class Predict(val index: Int, val roll: Int)

data class NotMatched(
    val rolls: List<ID>,
    val predicts: List<Predict>,
)

fun notMatched(pair: Pair<List<ID>, List<Pair<Int, Int>>>) =
    NotMatched(pair.first, pair.second.map { Predict(it.first, it.second) })

data class MatchResult(
    val known: List<ID2>,
    val positive: NotMatched,
    val negative: NotMatched
)

var idCounter = 0
fun checkExtra(seed: Long): Long {
    idCounter++
    if (idCounter == 5 || idCounter == 7) {
        lastSeed = LCG.JAVA.nextSeed(lastSeed)
        return LCG.JAVA.nextSeed(seed)
    }
    return seed
}

fun tryMatch(item: GearItem, seed: Long): MatchResult {
    val possibles = item.possibleValues
    val ids = item.identifications.mapNotNull { id ->
        val possible = possibles.firstOrNull { id.statType == it.statType } ?: return@mapNotNull null
        if(possible.range.isFixed || !possible.range.inRange(id.value)) return@mapNotNull null
        val lo = if(possible.baseValue > 0) 30 else 70
//        val roll = (id.value.toDouble() / possible.baseValue * 100).roundToInt() - lo
        val roll = if(possible.baseValue > 0) {
            (id.value.toDouble() / possible.baseValue * 100).roundToInt() - lo
        } else {
            130 - (id.value.toDouble() / possible.baseValue * 100).roundToInt()
        }

        ID(id.statType.apiName, roll, getError(131 - lo, possible.baseValue), possible.baseValue > 0)
    }

    return tryMatch(ids, checkExtra(seed))
}

fun tryMatch(list: List<ID>, seed: Long): MatchResult {
    val realPositiveIDs = list.filter { it.positive }.toMutableList()
    val realNegativeIDs = list.filter { !it.positive }.toMutableList()
    val positiveIDs = MyRandom(seed).let { random ->
        list.mapIndexed { index, _ -> index to random.nextInt(101) }
    }.toMutableList()
    val negativeIDs = MyRandom(seed).let { random ->
        list.mapIndexed { index, _ -> index to 60 - random.nextInt(61) }
    }.toMutableList()

    val result = mutableListOf<ID2>()
    val targets = listOf(
        realPositiveIDs to positiveIDs,
        realNegativeIDs to negativeIDs
    )
    loop@ while (true) {
        for ((realIDs, randIDs) in targets) {
            val matchedIDs = realIDs.map { real ->
                real to randIDs.filter { id -> abs(real.roll - id.second) <= real.error }
            }.filter { it.second.size == 1 }
            if (matchedIDs.isEmpty()) continue
            val (real, rand) = matchedIDs.first()
            val randomValue = rand.first()
            realIDs.remove(real)
            val index = randIDs.indexOf(randomValue)
            positiveIDs.removeAt(index)
            negativeIDs.removeAt(index)
            result.add(ID2(real.statType, real.roll, randomValue.second, randomValue.first))
            continue@loop
        }
        break
    }
    for (i in 1..list.size) {
        lastSeed = LCG.JAVA.nextSeed(lastSeed)
    }
    if (realNegativeIDs.isEmpty()) negativeIDs.clear()
    if (realPositiveIDs.isEmpty()) positiveIDs.clear()

    return MatchResult(result.sortedBy { it.index }, notMatched(realPositiveIDs.map { it } to positiveIDs), notMatched(realNegativeIDs to negativeIDs))
}

class CollectionAdapter : JsonSerializer<Collection<*>> {
    override fun serialize(
        src: Collection<*>?,
        typeOfSrc: Type?,
        context: JsonSerializationContext
    ): JsonElement? {
        if(src == null || src.isEmpty()) return null
        if(src is Map<*, *>) {
            val obj = JsonObject()
            src.entries.forEach { entry -> obj.add(entry.key.toString(), context.serialize(entry.value)) }
            return obj
        } else {
            val array = JsonArray()
            src.forEach { array.add(context.serialize(it)) }
            return array
        }
    }
}

val gson = GsonBuilder()
    .registerTypeHierarchyAdapter(Collection::class.java, CollectionAdapter())
    .create()!!
val prettyPrintedGson = gson.newBuilder().setPrettyPrinting().create()!!

fun onItemClick(item: GearItem) {
    if(!item.name.contains("specialist", true)) {
        if (lastSeed == 0L) return
        val match = tryMatch(item, lastSeed)
        Chat.log(Chat.createTextBuilder().append(gson.toJson(match))
            .withShowTextHover(Chat.createTextHelperFromString("click to copy"))
            .withClickEvent("copy_to_clipboard", prettyPrintedGson.toJson(match)).build())

        return
    }
	Chat.log("item selected")
    if (lastItem != null) {
        if (lastItem.toString() == item.toString()) return
        lastSeed = 0
        CrackGen.getSeeds(lastItem!!, item).forEach { seed ->
            lastSeed = seed
//            val random = Random(seed xor 0x5DEECE66DL)
            for(i in 1..12) {
//                random.nextInt(101)
                lastSeed = LCG.JAVA.nextSeed(lastSeed)
            }
            val list = mutableListOf<Int>()
            val list2 = mutableListOf<Int>()
            val random = Random(lastSeed xor 0x5DEECE66DL)
            for (i in 1..previewCount) {
                list.add(random.nextInt(101))
            }
            val random2 = Random(lastSeed xor 0x5DEECE66DL)
            for (i in 1..previewCount) {
                list2.add(random2.nextInt(61))
            }
            Chat.log("predict:")
            Chat.log(list)
            Chat.log(list2)
        }
		if(lastSeed == 0L) {
			Chat.log("seed not found")
		}
    }

    lastItem = item
}

object TransformCallback {
    var onCreateItemPart = { style: class_2583, event: class_2568 -> style.method_10949(event) }
}
val cache = LRUCache<Int, GearItem>(100)
var counter = 0
val cmd = "/RNGTest"

TransformCallback.onCreateItemPart = { style: class_2583, event: class_2568 ->
    var style = style.method_10949(event)
    (event.method_10891(class_2568.class_5247.field_24343)?._getPrivateValue<FakeItemStack>("field_24355"))?.let { fakeItem ->
        synchronized(cache) {
            val thisCounter = counter++
            fakeItem._getPrivateValue<GearItem>("wynnItem")?.let {
                cache[thisCounter] = it
                style = style.method_10958(class_2558(class_2558.class_2559.field_11750, "$cmd $thisCounter"))
            }
        }
    }
    style
}

@CTransformer(ChatItemFeature::class)
class MixinChatItemFeature {
    @CRedirect(method=["createItemPart"], target = CTarget(CTargetType.SIMPLE_INVOKE, target="method_10949"))
    fun transform(style: class_2583, event: class_2568): class_2583 {
        return TransformCallback.onCreateItemPart(style, event)
    }
}
Chat.commandManager.createCommandBuilder(cmd).intArg("counter").executes(JavaWrapper.methodToJava { ctx, _ ->
    (ctx.getArg("counter") as? Int)?.let {
        cache[it]?.let {
            onItemClick(it)
        }
    }
})

EventListener(EventType.ClickSlot, true) {
    if(KeyBind.pressedKeys.contains("key.keyboard.left.control")) {
        it.cancel()
        it.inventory.getSlot(it.slot)?.let { itemStackHelper ->
            val optional = Models.Item.asWynnItem(itemStackHelper.raw, GearItem::class.java)
            if(optional.isPresent) {
                onItemClick(optional.get())
            }
        }
    }
}

context.onContextClosed {
    Chat.commandManager.unregisterCommand(cmd)
}

Chat.log("RNGTest!")
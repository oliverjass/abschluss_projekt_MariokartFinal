import java.lang.Character

class Rennstrecke(val name: String) {

    fun starteSimulation(): Any{
        return when (name) {
            "Mario Kart Stadium" -> marioKartStadium()
            "Water Park" -> waterPark()
            "Sweet Sweet Canyon" -> sweetSweetCanyon()
            "Thwomp Ruins" -> twompRuins()
            "Mario Circuit" -> marioCircuit()
            "Toad Harbor" -> toadHarbor()
            "Twisted Mansion" -> twistedMansion()
            "Shy Guy Falls" -> shyGuyFalls()
            "Cloud-Top Cruise" -> cloudTopCruise()
            "Bone-Dry Dunes" -> boneDryDunes()
            "Bowsers Castle" -> bowsersCastle()
            "Rainbow Road" -> rainbowRoad()
            else -> ""
        }
    }



    override fun toString(): String {
        return "$name"
    }
}
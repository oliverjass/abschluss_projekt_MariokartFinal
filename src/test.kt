/*
class Test(){
    var schnellesRennen = fahrer.shuffled().toMutableList()


    var fahrer1: Character = Character(schnellesRennen1.removeLast())
    var fahrer2: Character = Character(schnellesRennen1.removeLast())
    var fahrer3: Character = Character(schnellesRennen1.removeLast())
}*//*

var spielerListe = mutableListOf(
    "Mario",
    "Luigi",
    "Bowser",
    "Toad"
)


var fahrzeugListe = listOf(
    "Kart1",
    "Kart2",
    "Bike1",
    "Bike2"
)



fun main(){




    println("Such dir ein character aus 1-${spielerListe.size}")
    for (i in 0..spielerListe.size){
        val figur = spielerListe[i]
        println("$i, $figur")
    }


    val auswahl = readln().toInt()-1
    if (auswahl != null && auswahl in 0..spielerListe.size){
        val gewaehlteFigur = spielerListe[auswahl]
        spielerListe.removeAt(auswahl)

        println("gewählte Figur: $gewaehlteFigur")
        println("Verbleibende Figuren:")
        for (figur in spielerListe){
            println(figur)
        }
    } else {
    println("Ungültige Auswahl")
    }
}






*/
/*    val spielMap = meineCharactere.zip(meineFahrzeuge)

    for ((key, value) in spielMap) {
        println("${key}, ${value}")
    }*//*

*/

fun gameMenue(){
    loadingLine()
    var startInput : String? = ""
    while (startInput != "ja"){
        val character = waehleCharacter()
        val fahrzeug = waehleFahrzeug()
        val rennstrecke = waehleRennstrecke()

        infoBox(character,fahrzeug,rennstrecke)


        println("Bestätige das Rennen zu starten (ja/nein):")
        val startInput = readln().lowercase()

        if (startInput == "ja") {
            rennenBestaetigen(character,fahrzeug,rennstrecke)
            break
        } else {
            println("Rennen wurde abgebrochen.")
        }
    }
}

fun waehleCharacter(): Character? {
    println("[--------Characters-------------------------------------]")
    println()
    println("""
             [1]    Mario                 [7]    Wario                      
             [2]    Luigi                 [8]    Yoshi                      
             [3]    Bowser                [9]    Ludwig                     
             [4]    Prinzessin Peach     [10]    Donkey Kong                
             [5]    Prinzessin Daisy     [11]    Link                      
             [6]    Toad                 [12]    Rosalina                    
    """.trimIndent())
    println()
    println()
    println(" Wählen Sie ihr Charakter aus: 1-${characters.size}                     ")
    println()
    println("   [13]   [zurück]                                        ")
    println("   [14]   [abbrechen]                                     ")
    println("[-------------------------------------------------------]")


    val characters = listOf(
        Character("Mario"),
        Character("Luigi"),
        Character("Bowser"),
        Character("Prinzessin Peach"),
        Character("Prinzessin Daisy"),
        Character("Toad"),
        Character("Wario"),
        Character("Yoshi"),
        Character("Ludwig"),
        Character("Donkey Kong"),
        Character("Link"),
        Character("Rosalina"),
    )

    val auswahl = readln().toInt()-1

    if (auswahl in 0..characters.size) {
        println(characters[auswahl])
        return characters[auswahl]
    }
    return null
}

fun waehleFahrzeug(): Fahrzeug? {
    println("[-------- Cars -----------------------------------------]")
    println()
    println("""
               [1]  ō͡≡o                [2]  -0-            
               Kart                    Bike           
    """.trimIndent())
    println()
    println(" Suchen sie einen Fahrzeug aus: 1-${fahrzeuge.size}                         ")
    println()
    println("  [0]   [zurück]                                         ")
    println("  [3]   [abbrechen]                                      ")
    println("[-------------------------------------------------------]")

    val fahrzeuge = listOf(
        Kart("ō͡≡o"),
        Bike("-0-")
    )
    var auswahl =  readln().toInt()
        try {
            if (auswahl!! in 0..fahrzeuge.size){
                println(fahrzeuge[auswahl])
                return fahrzeuge[auswahl]
            } else {
                println("Ungültige zahl eingegeben sie müssen von 1-${fahrzeuge.size}")
            }
        } catch (ex: Exception) {
            println("Sie müssen eine Zahl eingeben")
        }
    return null
}

fun waehleRennstrecke(): Rennstrecke? {
    println("[--------Rennstrecke------------------------------------------------------------]")
    println("""
     Suchen sie eine Rennstrecke aus: 1-${trackNames.size}
    
     Mushroom Cup ${TURBOPILZ}             Flowers Cup ${FEUERBLUME}            Special Cup ${KRONE}           
      [1]  Mariokart Stadium    [5]  Mario Circuit      [9]  Cloud Top Cruise                       
      [2]  Water Park           [6]  Toad Harbor       [10]  Bone Dry Dunes                  
      [3]  Sweet Sweet Canyon   [7]  Twisted Mansion   [11]  Bowsers Castle        
      [4]  Twomp Ruins          [8]  Shy Guy Falls     [12]  Rainbow Road
      
                                  
    """)
    println("  [0]   [zurück]                                                                 ")
    println("  [13]  [abbrechen]                                                              ")
    println("[-------------------------------------------------------------------------------]")

    val rennstrecken = listOf(
        Rennstrecke("Mario Kart Stadium"),
        Rennstrecke("Water Park"),
        Rennstrecke("Sweet Sweet Canyon"),
        Rennstrecke("Thwomp Ruins"),
        Rennstrecke("Mario Circuit"),
        Rennstrecke("Toad Harbor"),
        Rennstrecke("Twisted Mansion"),
        Rennstrecke("Shy Guy Falls"),
        Rennstrecke("Cloudtop Cruise"),
        Rennstrecke("Bone-Dry Dunes"),
        Rennstrecke("Bowsers Castle"),
        Rennstrecke("Rainbow Road"),
    )


    val auswahl = readln().toInt()-1



    if (auswahl in 0..rennstrecken.size) {
        println(rennstrecken[auswahl])
        return rennstrecken[auswahl]
    } else {
        println("FEHLER")
    }
    return null
}

fun infoBox(character: Character?, fahrzeug: Fahrzeug?, rennstrecke: Rennstrecke?){
    if ((character != null) && (fahrzeug != null) && (rennstrecke != null)) {
        println("Character: ${character.name}")
        println("Fahrzeug: ${fahrzeug.name}")
        println("Rennstrecke: ${rennstrecke.name}")
    }
    else {
        println("Ihre eingaben sind UNGÜLTIG")
    }
}

fun rennenBestaetigen(character: Character?,fahrzeug: Fahrzeug?,rennstrecke: Rennstrecke?){
    if (character != null && fahrzeug != null && rennstrecke != null){
        println("Rennen wird gestartet!")


        val simulation = rennstrecke.starteSimulation()
        println("Simulation: $simulation")

        repeatMenu(character, fahrzeug, rennstrecke)
    } else {
        println("Rennen kann nicht gestartet werden.")
    }
}

fun repeatMenu(character: Character, fahrzeug: Fahrzeug,rennstrecke: Rennstrecke){
    println("Möchten Sie weiterspielen?")
    println("   [1] -  Neustart")
    println("   [2] -  Rennstrecke auswählen")
    println("   [3] -  zum Hauptmenü")
    val auswahl = readln().toInt()
    when(auswahl) {
        1 -> wiederholung(character,fahrzeug,rennstrecke)
        2 -> neuesRennen(character,fahrzeug)
        3 -> hauptmenue()
        else -> {
            println("Ungültige Eingabe. Bitte nochmal versuchen")
            repeatMenu(character,fahrzeug,rennstrecke)
        }
    }
}

fun neuesRennen(character: Character, fahrzeug: Fahrzeug){
    println("Wählen Sie eine neue Rennstrecke")

    val rennstrecke = waehleRennstrecke()

    infoBox(character,fahrzeug,rennstrecke)




    println("Bestäge das Rennen zu starten (j/n)")
    val startInput = readln().lowercase()

    if (startInput == "j") {
        rennenBestaetigen(character, fahrzeug, rennstrecke)
    } else if (startInput == "n"){
        println("Das Rennen wurde abgebrochen.")
    } else {
        println("FEHLER")
    }

}

fun wiederholung(character: Character,fahrzeug: Fahrzeug,rennstrecke: Rennstrecke){
    println("Rennen wird wiederholt..")
    rennstrecke.starteSimulation()
}





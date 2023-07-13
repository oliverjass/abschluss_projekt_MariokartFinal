var meinCharacter = ""
//var schnellesRennenFahrzeug = ""





fun gameMenue(): String{
    loadingLine()
    var startInput = ""
    while (startInput != "j"){
        val character = waehleCharacter()
        val rennstrecke = waehleRennstrecke()
        meinCharacter = character
        infoBox(character,alleFahrzeuge.random(),rennstrecke)


        println("Bestätige das Rennen zu starten (ja/nein):")
        val startInput = readln().lowercase()

        if (startInput == "j" || startInput == "ja") {
            rennenBestaetigen(meinCharacter,alleFahrzeuge.random(),rennstrecke)
            continue
        } else {
            println("Rennen wurde abgebrochen.")
            //break
        }
    }
    return ""
}

fun waehleCharacter(): String {


    println("[--------Characters-------------------------------------]")
    println()
    println("""
             [1]    $fahrer1             [7]    $fahrer7                       
             [2]    $fahrer2             [8]    $fahrer8                       
             [3]    $fahrer3             [9]    $fahrer9                      
             [4]    $fahrer4            [10]    $fahrer10                  
             [5]    $fahrer5            [11]    $fahrer11                       
             [6]    $fahrer6            [12]    $fahrer12                     
    """.trimIndent())
    println()
    println()
    println(" Wählen Sie ihr Charakter aus: 1-${fahrerListe.size}                     ")
    println()
    println("   [13]   [zurück]                                        ")
    println("   [14]   [abbrechen]                                     ")
    println("[-------------------------------------------------------]")

    // For schleife muss gemacht werden die über alle charactere gilt und falls der gewählte charakter gewählt ist, dann einen continue machen
    // Bei den restlichen characteren sollen die character in der gegner (liste) hinzugefügt werden

    var inputCharacter = readln().toInt()
    when {
        inputCharacter == 1 -> {
            println("Character: ${fahrer1}")
            return fahrer1.name
        }
        inputCharacter == 2 -> {
            println("Character: ${fahrer2}")
            return fahrer2.name
        }
        inputCharacter == 3 -> {
            println("Character: ${fahrer3}")
            return fahrer3.name
        }
        inputCharacter == 4 -> {
            println("Character: ${fahrer4}")
            return fahrer4.name
        }
        inputCharacter == 5 -> {
            println("Character: ${fahrer5}")
            return fahrer5.name
        }
        inputCharacter == 6 -> {
            println("Character: ${fahrer6}")
            return fahrer6.name
        }
        inputCharacter == 7 -> {
            println("Character: ${fahrer7}")
            return fahrer7.name
        }
        inputCharacter == 8 -> {
            println("Character: ${fahrer8}")
            return fahrer8.name
        }
        inputCharacter == 9 -> {
            println("Character: ${fahrer9}")
            return fahrer9.name

        }
        inputCharacter == 10 -> {
            println("Character: ${fahrer10}")
            return fahrer10.name
        }
        inputCharacter == 11 -> {
            println("Character: ${fahrer11}")
            return fahrer11.name
        }
        inputCharacter == 12 -> {
            println("Character: ${fahrer12}")
            return fahrer12.name
        }
        inputCharacter == 13 -> {
            hauptmenue()
            return ""
        }
        inputCharacter == 14 -> {
            hauptmenue()
            return ""
        }
        (inputCharacter >= 15) || (inputCharacter.toString() == "")  -> {
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            waehleCharacter()
        }
        else -> {
            println("FEHLER")
        }
    }
    return ""
}



fun waehleRennstrecke(): Rennstrecke {
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

    var inputTrack = readln().toInt()
    when {
        inputTrack == 1 -> {
            println("Rennstrecke: ${track01}")
            return track01
        }
        inputTrack == 2 -> {
            println("Rennstrecke: ${track02}")
            return track02
        }
        inputTrack == 3 -> {
            println("Rennstrecke: ${track03}")
            return track03
        }
        inputTrack == 4 -> {
            println("Rennstrecke: ${track04}")
            return track04
        }
        inputTrack == 5 -> {
            println("Rennstrecke: ${track05}")
            return track05
        }
        inputTrack == 6 -> {
            println("Rennstrecke: ${track06}")
            return track06
        }
        inputTrack == 7 -> {
            println("Rennstrecke: ${track07}")
            return track07
        }
        inputTrack == 8 -> {
            println("Rennstrecke: ${track08}")
            return track08
        }
        inputTrack == 9 -> {
            println("Rennstrecke: ${track09}")
            return track09
        }
        inputTrack == 10 -> {
            println("Rennstrecke: ${track10}")
            return track10
        }
        inputTrack == 11 -> {
            println("Rennstrecke: ${track11}")
            return track11
        }
        inputTrack == 12 -> {
            println("Rennstrecke: ${track12}")
            return track12
        }
        inputTrack == 13 -> {
            hauptmenue()

        }
        inputTrack == 14 -> {
            hauptmenue()
        }
        (inputTrack >= 15) || (inputTrack.toString() == "")  -> {
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            waehleCharacter()
        }
        else -> {
            println("FEHLER")
        }
    }
    //fahrerListe.removeAt(inputCharacter)
    return Rennstrecke("none")


}

fun infoBox(character: String, fahrzeug: String, rennstrecke: Rennstrecke){
    if (character != null && fahrzeug != null && rennstrecke != null) {
        println("Character: ${character}")
        println("Fahrzeug: ${fahrzeug}")
        println("Rennstrecke: ${rennstrecke}")
    }
    else {
        println("Ihre eingaben sind UNGÜLTIG")
    }
}

fun rennenBestaetigen(character: String, fahrzeug: String, rennstrecke: Rennstrecke?){
    if (character != null && fahrzeug != null && rennstrecke != null){
        println("Rennen wird gestartet!")

        val simulation = rennstrecke.starteSimulation()
        println("Simulation: $simulation")

        repeatMenu(character, fahrzeug, rennstrecke)
    } else {
        println("Rennen kann nicht gestartet werden.")
    }
}

fun repeatMenu(character: String, fahrzeug: String, rennstrecke: Rennstrecke){
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

fun neuesRennen(character: String, fahrzeug: String){
    println("Wählen Sie eine neue Rennstrecke")

    val rennstrecke = waehleRennstrecke()

    infoBox(character,fahrzeug,rennstrecke)




    println("Bestäge das Rennen zu starten (j/n)")
    val startInput = readln().lowercase()

    if (startInput == "j" || startInput == "ja") {
        rennenBestaetigen(character, fahrzeug, rennstrecke)
    } else if (startInput == "n" || startInput == "nein"){
        println("Das Rennen wurde abgebrochen.")
    } else {
        println("FEHLER")
    }

}

fun wiederholung(character: String, fahrzeug: String, rennstrecke: Rennstrecke){
    println("Rennen wird wiederholt..")
    rennstrecke.starteSimulation()
}





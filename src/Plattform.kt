var meinCharacter = ""

fun gameMenue(): String{
    while (true){
        var startInput = ""
        val character = selectCharacter()
        val rennstrecke = waehleRennstrecke()
             meinCharacter = character
             infoBox(character,alleFahrzeuge.random(),rennstrecke)
             println("Bestätige das Rennen zu starten (j/n):")
        try {
            startInput = readln().lowercase()
            if (startInput == "j" || startInput == "ja") {
                applyRace(meinCharacter,alleFahrzeuge.random(),rennstrecke)
                continue
            } else {
                println("Das Rennen wurde abgebrochen.")
            }
            } catch (e: Exception){
            println("FEHLER Von gameMenue")
        }
    }
}

fun selectCharacter(): String {
    timeLoading()
    println("[--------Characters-----------------------------------------------------------]")
    println()
    println("""
             [1]    $fahrer1                                 
             [2]    $fahrer2                                 
             [3]    $fahrer3                                
             [4]    $fahrer4                             
             [5]    $fahrer5                                  
             [6]    $fahrer6 
             [7]    $fahrer7  
             [8]    $fahrer8  
             [9]    $fahrer9  
            [10]    $fahrer10 
            [11]    $fahrer11 
            [12]    $fahrer12                           
    """.trimIndent())
    println()
    println()
    println(" Wählen Sie ihr Charakter aus: 1-${fahrerListe.size}                             ")
    println()
    println("   [13]   [zurück]                                                               ")
    println("   [14]   [abbrechen]                                                            ")
    println("[-------------------------------------------------------------------------------]")
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
        }
        inputCharacter == 14 -> {
            hauptmenue()
        }
        (inputCharacter >= 15) || (inputCharacter.toString() == "")  -> {
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            selectCharacter()
        }
    }
    return ""
}


fun waehleRennstrecke(): Rennstrecke {
    timeLoading()
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
            selectCharacter()
        }
        else -> {
            println("FEHLER")
        }
    }
    return Rennstrecke("")
}

fun infoBox(character: String, fahrzeug: String, rennstrecke: Rennstrecke){
    timeLoading()
    println("[------- Deine Auswahl -----------------------------------------------------------]")
    println("Character: ${character}")
    println("Fahrzeug: ${alleFahrzeuge.random()}")
    println("Rennstrecke: ${rennstrecke}")
    println("[------- Deine Auswahl -----------------------------------------------------------]")
}

fun applyRace(character: String, fahrzeug: String, rennstrecke: Rennstrecke){
    timeLoading()
    if (character != null && fahrzeug != null && rennstrecke != null){
        println("Rennen wird gestartet!")
        val simulation = rennstrecke.startRace()
        println()
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
        1 -> {wiederholung(character,fahrzeug,rennstrecke)
            repeatMenu(character,fahrzeug,rennstrecke)
        }
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
        applyRace(character, fahrzeug, rennstrecke)
    } else if (startInput == "n" || startInput == "nein"){
        println("Das Rennen wurde abgebrochen.")
    } else {
        println("FEHLER")
    }

}

fun wiederholung(character: String, fahrzeug: String, rennstrecke: Rennstrecke){
    println("Rennen wird wiederholt..")
    rennstrecke.startRace()
}





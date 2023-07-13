
var meinFahrzeug = ""

var vsCar = deinefahrzeuge.toMutableList()


var kart: Fahrzeug = Kart(vsCar.removeFirst())
var bike: Fahrzeug = Bike(vsCar.removeLast())



var vsRennen = fahrerListe.shuffled().toMutableList()

/*
var vs1: Character = Character(sc.removeLast())
var vs2: Character = Character(vsRennen.removeLast())
var vs3: Character = Character(vsRennen.removeLast())
var vs4: Character = Character(vsRennen.removeLast())
var vs5: Character = Character(vsRennen.removeLast())
var vs6: Character = Character(vsRennen.removeLast())
var vs7: Character = Character(vsRennen.removeLast())
var vs8: Character = Character(vsRennen.removeLast())
var vs9: Character = Character(vsRennen.removeLast())
var vs10: Character = Character(vsRennen.removeLast())
var vs11: Character = Character(vsRennen.removeLast())
var vs12: Character = Character(vsRennen.removeLast())*/

/*
class VsRennen {
    fun gameMenue(): String{
        loadingLine()
        var startInput = ""

        while (startInput != "j"){
            val character = waehleCharacter()
            val fahrzeug = waehleFahrzeug()
            val rennstrecke = waehleRennstrecke()

            infoBox(character,fahrzeug,rennstrecke)


            println("Bestätige das Rennen zu starten (ja/nein):")
            val startInput = readln().lowercase()


            if (startInput == "j") {
                rennenBestaetigen(meinCharacter,meinFahrzeug,rennstrecke)
                break
            } else {
                println("Rennen wurde abgebrochen.")
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
        //fahrerListe.removeAt(inputCharacter)
        return ""
    }



    fun waehleFahrzeug(): String {
        println("[-------- Cars -----------------------------------------]")
        println()
        println("""
               [1]  ō͡≡o                [2]  -0-
               Kart                    Bike
    """.trimIndent())
        println()
        println(" Suchen sie einen Fahrzeug aus: 1-${deinefahrzeuge.size}                         ")
        println()
        println("  [0]   [zurück]                                         ")
        println("  [3]   [abbrechen]                                      ")
        println("[-------------------------------------------------------]")

        var inputFahrzeug = readln().toInt()
        when {
            inputFahrzeug == 1 -> {
                println("Fahrzeug: ${kart}")
                return kart.name
            }
            inputFahrzeug == 2 -> {
                println("Fahrzeug: $bike")
                return bike.name
            }
            inputFahrzeug == 0 -> {
                hauptmenue()
                return ""
            }
            inputFahrzeug == 3 -> {
                hauptmenue()
                return ""
            }
            (inputFahrzeug >= 4) || (inputFahrzeug.toString() == "")  -> {
                println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
                waehleCharacter()
            }
            else -> {
                println("FEHLER")
            }
        }
        return ""
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

    fun infoBox(character: String, fahrzeug: String, rennstrecke: Rennstrecke?){
        if (character != null && fahrzeug != null && rennstrecke != null) {
            println("Character: ${character}")
            println("Fahrzeug: ${fahrzeug}")
            println("Rennstrecke: ${rennstrecke.name}")
        }
        else {
            println("Ihre eingaben sind UNGÜLTIG")
        }
    }

    fun rennenBestaetigen(character: String, fahrzeug: Fahrzeug?, rennstrecke: Rennstrecke?){
        if (character != null && fahrzeug != null && rennstrecke != null){
            println("Rennen wird gestartet!")

            val simulation = rennstrecke.starteSimulation()
            println("Simulation: $simulation")

            repeatMenu(character, fahrzeug, rennstrecke)
        } else {
            println("Rennen kann nicht gestartet werden.")
        }
    }

    fun repeatMenu(character: String, fahrzeug: Fahrzeug, rennstrecke: Rennstrecke){
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

    fun neuesRennen(character: String, fahrzeug: Fahrzeug){
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

    fun wiederholung(character: String, fahrzeug: Fahrzeug, rennstrecke: Rennstrecke){
        println("Rennen wird wiederholt..")
        rennstrecke.starteSimulation()
    }

}
*/


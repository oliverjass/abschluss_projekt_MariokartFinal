fun infoMenue() {
    timeLoading()
    println("------------------- infos -------------------")
    println()
    println("  [1]  Allgemeines                           ")
    println("  [2]  Items                                 ")
    println("  [2]  Credits                               ")
    println("  [3]  Zurück                                ")
    println()
    println("------------------- infos -------------------")
    val auswahl = readln().toInt()
    when (auswahl) {
        1 -> allgemeines()
        2 -> itemLexika()
        3 -> credits()
        4 -> hauptmenue()
        else -> {
            (auswahl >= 6)
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            hauptmenue()
        }
    }
}

fun credits(){
    timeLoading()
    println("------------------------ CREDITS ----------------------")
    println()
    println()
    println("  This terminal game is created by Oliver Jass         ")
    println("  Abschlussprojekt from Syntax Institut Modul 2 2023   ")
    println("  enjoy the Beta game!                                 ")
    println()
    println("                      [ENTER]  Zurück                  ")
    println()
    println("------------------------ CREDITS ----------------------")
    readln()
    infoMenue()
}

fun allgemeines(){
    timeLoading()
    println("---------------------- Allgemeines ----------------------")
    println("       Willkommen zu Mario Kart ${CYAN}Syntax!${RESET}  ")
    println()
    println("\n" +
            "       Schnall dich an und mach dich\n" +
            "       bereit für ein rasantes\n" +
            "       Rennabenteuer. Wähle deinen\n" +
            "       Lieblingscharakter aus dem\n" +
            "       Nintendo-Universum und meistere\n" +
            "       eine Vielzahl von aufregenden\n" +
            "       Rennstrecken. Nutze Power-Ups\n" +
            "       und geschickte Fahrtechniken, um\n" +
            "       deine Gegner zu überholen....\n" +
            "       Genieße den Spaß und die Action in \n" +
            "       Mario Kart Syntax!                                ")
    println()
    println("---------------------- Allgemeines ----------------------")
    println("  [1]  Zurück                                      ")
    println("  [2]  Hauptmenue                                  ")
    val auswahl = readln().toInt()
    when (auswahl) {
        1 -> infoMenue()
        2 -> hauptmenue()
        else -> {
            (auswahl >= 3)
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            allgemeines()
        }
    }
}


fun itemLexika(){
    timeLoading()
    println("------------------------ Items ------------------------")
    println()
    println("Willkommen beim Items-Lexikon von Mario Kart 8 Deluxe!\n" +
            "\n" +
            "In diesem kleinen Lexikon findest du alle Informationen\n,"+
            "die du über die verschiedenen Items in Mario Kart      \n"+
            "wissen musst.                                          ")
    println()
    println("      [1] Item Box                    [7] Bo-omb       ")
    println("      [2] Turbo Pilz                  [8] Kugelwilli   ")
    println("      [3] Goldender Turbo Pilz        [9] Banane       ")
    println("      [4] Grüner Panzer              [10] Superhupe    ")
    println("      [5] Roter Panzer               [11] Blitz        ")
    println("      [6] Stachi Panzer              [12] Stern        ")
    println()
    println("                Geben sie ein: 1-12                    ")
    println("                   [0]  Zurück                         ")
    println()
    println("------------------------ Items ------------------------")
    println()
    val suche = readln().toInt()
    while (true){
        if (suche == 1){
            println("------------------------ Items ------------------------")
            println("Item Box:                $ITEMBOX                              ")
            println("                                                       ")
            println("In Mario Kart findest du Item-Boxen entlang der    \n" +
                    "Rennstrecken. Wenn du eine Item-Box aufnimmst,     \n" +
                    "erhältst du ein zufälliges Power-Up, das dir entweder \n" +
                    "Vorteile verschafft, um dich zu stärken, oder um deine\n" +
                    "Gegner zu behindern. Nutze geschickt die Power-Ups aus\n" +
                    "den Item-Boxen, um im Rennen einen Vorsprung zu erlangen\n" +
                    "und die Konkurrenz zu überholen.                       ")
            println("                                                       ")
            println("                                                       ")
            println("                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 2 ){
            println("------------------------ Items ------------------------")
            println("Turbo Pilz:                $TURBOPILZ                            ")
            println("                                                       ")
            println("Der Turbo-Pilz in Mario Kart ist ein Item,\n" +
                    "das dem Spieler einen temporären Geschwindigkeitsschub\n" +
                    "verleiht, um im Rennen einen Vorteil zu erlangen.      ")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                   ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 3 ){
            println("------------------------ Items ------------------------")
            println("Goldener TurboPilz:         $GOLDTURBOPILZ                            ")
            println("                                                       ")
            println("Die goldene Turbo-Pilz in Mario Kart ist ein \n" +
                    "mächtiges Item, das dem Spieler eine Abfolge von \n" +
                    "schnellen Turbo-Boosts verleiht, um eine hohe \n" +
                    "Geschwindigkeit zu erreichen. Mit der goldenen \n" +
                    "Turbo-Pilz können Spieler gezielt Überholmanöver \n" +
                    "durchführen und sich einen wertvollen Vorsprung \n" +
                    "im Rennen verschaffen.")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 4 ){
            println("------------------------ Items ------------------------")
            println("Grüner Panzer:         $GREENPANZER                            ")
            println("                                                       ")
            println("Der grüne Panzer ist ein Item in Mario Kart, \n" +
                    "das von deinem Kart abgeschossen werden kann und \n " +
                    "geradeaus fährt, um Gegner zu treffen oder als \n" +
                    "Schutzschild um dein Fahrzeug zu kreisen.              ")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 5 ){
            println("------------------------ Items ------------------------")
            println("Roter Panzer:         $REDPANZER                            ")
            println("                                                       ")
            println("Der rote Panzer ist ein Item in Mario Kart,  \n" +
                    "das automatisch den nächstgelegenen Gegner verfolgt\n" +
                    " und ihn mit einem gezielten Schlag ausschaltet, \n" +
                    "indem er ihn umwirft oder in die Luft schleudert, \n" +
                    "um dir einen Vorteil im Rennen zu verschaffen.         ")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 6 ){
            println("------------------------ Items ------------------------")
            println("Stachi Panzer:         $BLUEPANZER                            ")
            println("                                                       ")
            println("Der Stachi-Panzer oder auch der Blaue Panzer ist ein \n" +
                    "besonders mächtiges Item in Mario Kart , das mehrere \n" +
                    "stachelige Projektile abfeuert, um mehrere Gegner \n" +
                    "gleichzeitig zu treffen und sie zu verlangsamen oder \n" +
                    "zu blockieren, was dir eine gute Chance gibt, das \n" +
                    "Rennen zu dominieren.")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 7 ){
            println("------------------------ Items ------------------------")
            println("Bo-omb:         $BOMB                                 ")
            println("                                                       ")
            println("Bo-omb ein explosives Item, das von den Spielern \n" +
                    "verwendet werden kann. Wenn ein Spieler eine Bo-omb \n" +
                    "einsetzt, wird sie nach kurzer Zeit explodieren und \n" +
                    "in der Nähe befindliche Gegner oder Hindernisse \n" +
                    "schädigen. Die Bo-omb kann sowohl offensiv eingesetzt \n" +
                    "werden, um andere Fahrer zu treffen, als auch defensiv,\n" +
                    " um sich vor anstürmenden Gegnern zu schützen.")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 8 ){
            println("------------------------ Items ------------------------")
            println("Kugelwilli:         $KUGELWILLI                                 ")
            println("                                                       ")
            println("Der Kugelwilli in Mario Kart ist ein Item, \n" +
                    "das den Spieler in eine rollende Kugel verwandelt \n" +
                    "und automatisch über die Strecke fahren lässt, \n" +
                    "während er Hindernisse zerstört und Gegner rammt. \n" +
                    "Während dieser Zeit ist der Spieler unverwundbar, \n" +
                    "jedoch kann er die Richtung nicht kontrollieren.\n")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 9 ){
            println("------------------------ Items ------------------------")
            println("Banane:         $BANANE                                 ")
            println("                                                       ")
            println("Die Banane in Mario Kart 8 ist ein Item, \n" +
                    "das als rutschige Falle für andere Fahrer dient \n" +
                    "und entweder offensiv oder defensiv eingesetzt \n" +
                    "werden kann.")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 10 ){
            println("------------------------ Items ------------------------")
            println("Superhupe:         $SUPERHUPE                                 ")
            println("                                                       ")
            println("Die Superhupe ist ein seltenes Item in Mario Kart , \n" +
                    "das eine starke Schallwelle erzeugt und in der Lage \n" +
                    "ist, nahegelegene Gegner abzuschrecken und sie zu \n" +
                    "verlangsamen, während es gleichzeitig Projektilen, \n" +
                    "wie dem blauen Panzer, entgegenwirken kann, um deine \n" +
                    "Position im Rennen zu verteidigen.")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 11 ){
            println("------------------------ Items ------------------------")
            println("Blitz:         $BLITZ                                 ")
            println("                                                       ")
            println("Der Blitz ist ein mächtiges Item in Mario Kart, \n" +
                    "das einen elektrischen Stoß aussendet und alle \n" +
                    "anderen Fahrer verkleinert, sie verlangsamt und ihre \n" +
                    "Items zerstört, was dir die Möglichkeit gibt, an ihnen \n" +
                    "vorbeizuziehen und eine strategische Position \n" +
                    "im Rennen einzunehmen.")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 12 ){
            println("------------------------ Items ------------------------")
            println("Stern:         $STERN                                 ")
            println("                                                       ")
            println("Der Stern ist ein begehrtes Item in Mario Kart 8, \n" +
                    "das deinem Fahrer vorübergehend Unverwundbarkeit\n" +
                    " verleiht, indem er durch Gegner, Hindernisse und \n" +
                    "Power-Ups gleitet und ihnen Schaden zufügt, während \n" +
                    "er gleichzeitig einen temporären Geschwindigkeitsschub\n" +
                    " erhält, um an der Spitze des Rennens zu bleiben.\n")
            println("                                                       ")
            println("                                                       ")
            println(" Platzierung:   2 - 8                                                       ")
            println("                    [ENTER]  Zurück                    ")
            println("------------------------ Items ------------------------")
            readln()
            itemLexika()
            continue
        } else if (suche == 0 ){
            infoMenue()
            break
        }
        else {
            println("Du musst eine gültige zahl eingeben")
            itemLexika()
        }
    }

}

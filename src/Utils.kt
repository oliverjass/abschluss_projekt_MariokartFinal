








// Zeit
// TODO Das muss ich kontrollieren von Batch 8 kopiert

fun timeLoading(){
    repeat(10){
        println("|")
        Thread.sleep(50)
    }
}

fun countdown(seconds: Int) {
    for (i in seconds downTo 0) {
        if (i == 9)
            print("\b")

        print("\b$i")

        if (i != 0)
            Thread.sleep(1000)
        else
            println()
    }
}

fun run() {
    Thread.sleep(250)
}

fun cr(): String{
    var cars = mutableListOf("ō͡≡o","-0-")
    return cars.random()
}

fun startGame(){
    println(" ████     ████     ██████    █████████    ████    ███████    ███    ███     ██████    █████████  ████████████\n" +
            " █████████████    ███  ███   ███    ████  ████  ███     ███  ███   ██      ███  ███   ███    ████    ████    \n"  +
            " ███  ███  ███   ████  ████  ████████     ████  ███     ███  ████████     ████  ████  ████████       ████    \n" +
            "████  ███  ████  ███    ███  ███    ███   ████    ███████    ███    ███   ███    ███  ███    ███     ████    \n")

    println("${CYAN} " +
            "            ::::::::    :::   :::       ::::    :::   :::::::::::           :::        :::    ::: \n" +
            "           :+:    :+:   :+:   :+:       :+:+:   :+:       :+:             :+: :+:      :+:    :+:  \n" +
            "          +:+           +:+ +:+        :+:+:+  +:+       +:+            +:+   +:+      +:+  +:+    \n" +
            "         +#++:++#++     +#++:         +#+ +:+ +#+       +#+           +#++:++#++:      +#++:+      \n" +
            "               +#+      +#+          +#+  +#+#+#       +#+           +#+     +#+     +#+  +#+      \n" +
            "       #+#    #+#      #+#          #+#   #+#+#       #+#           #+#     #+#    #+#    #+#      \n" +
            "       ########       ###          ###    ####       ###           ###     ###    ###    ###       ${RESET}\n")
    println()
    println("                                           [PRESS ENTER]                                                          ")
    readln()
    hauptmenue()
}

fun hauptmenue() {
    timeLoading()
    println("----------------- Hauptmenü -----------------")
    println()
    println("  [1]  Schnelles Rennen                      ")
    println("  [2]  Infos                                 ")
    println("  [3]  Spiel beenden                         ")
    println()
    println("----------------- Hauptmenü -----------------")
    var eingabe: Int

    eingabe = readln().toInt()
    when (eingabe) {
        1 -> {
            gameMenue()
        }
        2 -> {
            infoMenue()
        }
        3 -> {
            println("Spiel wird beendet")
        }
        else -> {
            try {
                eingabe >= 4
            } catch (e: Exception) {
                    println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            }
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            hauptmenue()
        }
    }
}


fun infoMenue() {
    timeLoading()
    println("------------------- infos -------------------")
    println()
    println("  [1]  Allgemeines                           ")
    println("  [2]  Regeln                                ")
    println("  [3]  Item Lexikon                          ")
    println("  [4]  Credits                               ")
    println("  [5]  Zurück                                ")
    println()
    println("------------------- infos -------------------")
    val auswahl = readln().toInt()
    when (auswahl) {
        1 -> allgemeines()
        2 -> ""
        3 -> ""
        4 -> ""
        5 -> hauptmenue()
        else -> {
            (auswahl >= 6)
            println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            hauptmenue()
        }
    }
}

fun allgemeines(){
    timeLoading()
    println("------------------- Allgemeines -------------------")
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
            "       Mario Kart Syntax!")
    println()
    println("------------------- Allgemeines -------------------")
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
    println()
}

// Farbpalette
val RED = "\u001B[31m"
val GREEN = "\u001B[32m"
val YELLOW = "\u001B[93m"
val YELLOW2 = "\u001B[33m"
val BLUE = "\u001B[34m"
val PURPLE = "\u001B[35m"
val CYAN = "\u001B[36m"
val UNDERLINE = "\u001B[4m"
val RESET = "\u001B[0m"


// Items

val ITEMNAME = listOf(
    "Banane",
    "Drei Bananen",
    "Blitz",
    "Turbo Pilz",
    "Drei Turbo Pilze",
    "Bo-omb","Kugelwilli",
    "Roter Panzer",
    "Blauer Panzer",
    "Stern",
    "Feuer Blume",
    "Super Hupe")


// Icons
val BANANE ="🍌"
val BANANEDREI = "\uD83C\uDF4C\uD83C\uDF4C\uD83C\uDF4C"
val BLITZ ="${YELLOW}⚡${RESET}"
val TURBOPILZ = "\uD83C\uDF44"
val TURBOPILZDREI ="\uD83C\uDF44\uD83C\uDF44\uD83C\uDF44"
val GOLDTURBOPILZ ="\uD83C\uDFF5\uFE0F"
val BOMB = "💣"
val ITEMBOX = "\uD83C\uDF81"
val KUGELWILLI = "\uD83D\uDE80"
val REDPANZER = "\uD83D\uDD34"
val GREENPANZER = "\uD83D\uDFE2"
val BLUEPANZER = "\uD83D\uDD35"
val STERN = "⭐"
val FEUERBLUME = "\uD83C\uDF3B"
val SUPERHUPE = "\uD83D\uDD0A"
val FLAGGE = "\uD83C\uDFC1"
val KRONE = "\uD83D\uDC51"


// Characters

var fahrerListe = listOf("Mario", "Luigi","Bowser","Princess Peach","Princess Daisy",
                                    "Toad","Wario","Yoshi","Ludwig","Donkey Kong","Link","Rosalina")





var simListFahrerOne = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12)


val alleFahrzeuge = listOf("ō͡≡o","ō͡≡o","ō͡≡o","ō͡≡o","ō͡≡o","ō͡≡o","ō͡≡o","-0-","-0-","-0-","-0-","-0-",)


val trackNames = listOf("Mario kart Stadium", "Water Park", "Sweet Sweet Canyon", "Thwomp Ruins", "Mario Circuit",
                        "Toad Harbor", "Twisted Mansion", "Shy Guy Falls", "Cloud Top Cruise", "Bone-Dry Dunes", "Bowsers Castle", "Rainbow Road")




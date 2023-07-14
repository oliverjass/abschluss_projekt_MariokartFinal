import kotlin.system.exitProcess

// Zeit
fun waiting(){
    Thread.sleep(2000)
}
fun timeLoading(){
    repeat(10){
        println("|")
        Thread.sleep(50)
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
            exitProcess(0)
        }
        else -> {
            try {
                eingabe >= 4
            } catch (e: Exception) {
                    println("   ${RED}FEHLER: Nummer überschritten! versuch es nochmal${RESET}")
            }
            println("   ${RED}FEHLER: Hauptmenu ${RESET}")
            hauptmenue()
        }
    }
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



// Emojis
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
                        "Toad Harbor", "Twisted Mansion", "Shy Guy Falls", "Cloud-Top Cruise", "Bone-Dry Dunes", "Bowsers Castle", "Rainbow Road")




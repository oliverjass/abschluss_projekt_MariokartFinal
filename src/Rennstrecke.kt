fun run() {
    Thread.sleep(250)
}

class Rennstrecke(val name: String) {




fun testSimulation(): Int{
    var zufall = simListFahrerOne.random()
    if(zufall==1){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |  Y                                   | ")
        return 1
    } else if (zufall==2){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |     Y                                | ")
        return 2
    } else if (zufall==3){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |        Y                             | ")
        return 3
    } else if (zufall==4){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |           Y                          | ")
        return 4
    } else if (zufall==5){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |              Y                       | ")
        return 5
    } else if (zufall==6){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                 Y                    | ")
        return 6
    } else if (zufall==7){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                    Y                 | ")
        return 7
    } else if (zufall==8){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                       Y              | ")
        return 8
    } else if (zufall==9){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                          Y           | ")
        return 9
    } else if (zufall==10){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                             Y        | ")
        return 10
    } else if (zufall==11){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                                Y     | ")
        return 11
    } else {
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                                   Y  | ")
        return 12
    }


}
    fun waterPark(){
        mapMushroom02()
        Thread.sleep(3000)
        simulation()
    }

















    fun simulation ():Int {
        starttrack()
        countDown()
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        jump()
        air()
        jump()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        testSimulation()
        run()
        val ergebnis = testSimulation()
        finishTrack()
        if (ergebnis == 1) {
            println("$fahrer1 hat gewonnen")
            return 1
        } else if (ergebnis == 2) {
            println("$fahrer2 hat gewonnen")
            return 2
        } else if (ergebnis == 3) {
            println("$fahrer3 hat gewonnen")
            return 3
        } else if (ergebnis == 4) {
            println("$fahrer4 hat gewonnen")
            return 4
        } else if (ergebnis == 5) {
            println("$fahrer5 hat gewonnen")
            return 5
        } else if (ergebnis == 6) {
            println("$fahrer6 hat gewonnen")
            return 6
        } else if (ergebnis == 7) {
            println("$fahrer7 hat gewonnen")
            return 7
        } else if (ergebnis == 8) {
            println("$fahrer8 hat gewonnen")
            return 8
        } else if (ergebnis == 9) {
            println("$fahrer9 hat gewonnen")
            return 9
        } else if (ergebnis == 10) {
            println("$fahrer10 hat gewonnen")
            return 10
        } else if (ergebnis == 11) {
            println("$fahrer11 hat gewonnen")
            return 11
        } else if (ergebnis == 12) {
            println("$fahrer12 hat gewonnen")
            return 12
        } else {
            println("Das Rennen wurde abgebrochen!")
            return 6
        }
    }




    fun starteSimulation(): Any{
        return when (name) {
            "Mario Kart Stadium" -> simulation()
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
        return name
    }
}
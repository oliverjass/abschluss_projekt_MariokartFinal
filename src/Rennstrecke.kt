
var schnellesRennen = fahrerListe.shuffled().toMutableList()

var fahrer1: Character = Character(schnellesRennen.removeLast())
var fahrer2: Character = Character(schnellesRennen.removeLast())
var fahrer3: Character = Character(schnellesRennen.removeLast())
var fahrer4: Character = Character(schnellesRennen.removeLast())
var fahrer5: Character = Character(schnellesRennen.removeLast())
var fahrer6: Character = Character(schnellesRennen.removeLast())
var fahrer7: Character = Character(schnellesRennen.removeLast())
var fahrer8: Character = Character(schnellesRennen.removeLast())
var fahrer9: Character = Character(schnellesRennen.removeLast())
var fahrer10: Character = Character(schnellesRennen.removeLast())
var fahrer11: Character = Character(schnellesRennen.removeLast())
var fahrer12: Character = Character(schnellesRennen.removeLast())


var track01: Rennstrecke = Rennstrecke("Mario Kart Stadium")
var track02: Rennstrecke = Rennstrecke("Water Park")
var track03: Rennstrecke = Rennstrecke("Sweet Sweet Canyon")
var track04: Rennstrecke = Rennstrecke("Thwomp Ruins")
var track05: Rennstrecke = Rennstrecke("Mario Circuit")
var track06: Rennstrecke = Rennstrecke("Toad Harbor")
var track07: Rennstrecke = Rennstrecke("Twisted Mansion")
var track08: Rennstrecke = Rennstrecke("Shy Guy Falls")
var track09: Rennstrecke = Rennstrecke("Cloudtop Cruise")
var track10: Rennstrecke = Rennstrecke("Bone-Dry Dunes")
var track11: Rennstrecke = Rennstrecke("Bowsers Castle")
var track12: Rennstrecke = Rennstrecke("Rainbow Road")
class Rennstrecke(val name: String){

    fun startRace(): Any{
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
    fun start(){
        starttrack()
        waiting()
        countDown()
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        race()
        run()
        track()
        run()
        race()
        run()
        track()
        run()
        race()
        run()
        track()
        run()
        race()
        run()
        track()
        run()
        race()
        jump()
    }
    fun finish(): Int{
        jump()
        race()
        run()
        track()
        run()
        race()
        run()
        track()
        run()
        race()
        run()
        track()
        run()
        race()
        run()
        track()
        run()
        race()
        run()
        val ergebnis = race()
        finishTrack()
        ende()
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
    fun race(): Int{
    var randomGenerator = simListFahrerOne.random()
    if(randomGenerator==1){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |  Y                                   | ")
        return 1
    } else if (randomGenerator==2){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |     Y                                | ")
        return 2
    } else if (randomGenerator==3){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |        Y                             | ")
        return 3
    } else if (randomGenerator==4){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |           Y                          | ")
        return 4
    } else if (randomGenerator==5){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |              Y                       | ")
        return 5
    } else if (randomGenerator==6){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                 Y                    | ")
        return 6
    } else if (randomGenerator==7){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                    Y                 | ")
        return 7
    } else if (randomGenerator==8){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                       Y              | ")
        return 8
    } else if (randomGenerator==9){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                          Y           | ")
        return 9
    } else if (randomGenerator==10){
        println("                   |  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  Y  | ")
        run()
        println("                   |                             Y        | ")
        return 10
    } else if (randomGenerator==11){
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

// TODO LEVELS

    fun marioKartStadium(){
    mapMushroom01()
    Thread.sleep(3000)
    flyingCastle()
    start()
    fireWork()
    finish()
}
    fun waterPark(){
        mapMushroom02()
        Thread.sleep(3000)
        start()
        water()
        finish()
    }
    fun sweetSweetCanyon(){
    mapMushroom03()
    Thread.sleep(3000)
    canyon()
    start()
    water()
    finish()
}
    fun twompRuins(){
    mapMushroom04()
    Thread.sleep(3000)
    temple()
    start()
    garden()
    finish()
}


// Flower Cup

    fun marioCircuit(){
        mapFlower01()
        Thread.sleep(3000)
        castle2()
        start()
        garden()
        finish()


    }
    fun toadHarbor(){
        mapFlower02()
        Thread.sleep(3000)
        beach()
        start()
        garden()
        finish()

    }
    fun twistedMansion(){
        mapFlower03()
        Thread.sleep(3000)
        gate2()
        start()
        garden()
        finish()
    }
    fun shyGuyFalls(){
        mapFlower04()
        Thread.sleep(3000)
        waterfall()
        start()
        garden()
        finish()
    }


    // Special Cup

    fun cloudTopCruise(){
        mapSpecial01()
        Thread.sleep(3000)
        windMils()
        start()
        clouds()
        finish()
    }
    fun boneDryDunes(){
        mapSpecial02()
        Thread.sleep(3000)
        desert()
        start()
        desert()
        finish()
    }
    fun bowsersCastle(){
        mapSpecial03()
        Thread.sleep(3000)
        gates()
        start()
        castle2()
        finish()
    }
    fun rainbowRoad(){
        mapSpecial04()
        Thread.sleep(3000)
        rainbow()
        start()
        stars()
        finish()
    }

    override fun toString(): String {
        return name
    }



}
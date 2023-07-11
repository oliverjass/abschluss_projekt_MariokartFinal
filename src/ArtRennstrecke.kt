
// TODO Basic

fun starttrack(){

    println("                   [                                      ]")
    println("                   | [${cr()}]                                |")
    println("                   |       [${cr()}]                          |")
    println("                   |             [${cr()}]                    |")
    println("                   | [${cr()}]             [${cr()}]              |")
    println("                   |       [${cr()}]             [${cr()}]        |")
    println("                   |             [${cr()}]             [${cr()}]  |")
    println("                   |                   [${cr()}]              |")
    println("                   |                         [${cr()}]        |")
    println("                   |                               [${cr()}]  |")
    println("                   |                 START                |")
    println("                   |                                      |")
    println("                   |██  ██  ██  ██  ██  ██  ██  ██  ██  ██|")
    println("                   |  ██  ██  ██  ██  ██  ██  ██  ██  ██  |")
}
fun track(){
    println("                   |         0                v           |")
    Thread.sleep(300)
    println("                   |         0                v           |")
    Thread.sleep(300)
    println("                   |         0                v           |")
    Thread.sleep(300)
    println("                   |         0         █      v           |")
    Thread.sleep(300)
}
fun jump(){
    println("                   |${BLUE}░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░${RESET}|")
    Thread.sleep(300)
    println("                   |${BLUE}░░░░░▓█▓░▓█▓░░░░░░░░░░░░▓█▓░▓█▓░░░░░░░${RESET}|")
    Thread.sleep(300)
    println("                   |${BLUE}░░░░░░▒▓█▓▒░░░░░░░░░░░░░░▒▓█▓▒░░░░░░░░${RESET}|")
    Thread.sleep(300)
    println("                   |${BLUE}░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░${RESET}|")
    Thread.sleep(300)
}
fun trackBreak(){
    println("                   |--------------------------------------|")
}
fun squareTrack() {
    println("                   |                   ██                 |")
    println("                   |                 ██                   |")
    println("                   |                   ██                 |")
    println("                   |                 ██                   |")
}
fun finishTrack(){
    println("                   |${UNDERLINE}                                      ${RESET}|")
    println("                   |██  ██  ██  ██  ██  ██  ██  ██  ██  ██|")
    Thread.sleep(300)
    println("                   |  ██  ██  ██  ██  ██  ██  ██  ██  ██  |")
    Thread.sleep(300)
    println("                   |██  ██  ██  ██  ██  ██  ██  ██  ██  ██|")
    Thread.sleep(300)
    println("                   |                                      |")
    Thread.sleep(300)
    println("                   |                FINISH                |")
    Thread.sleep(300)
    println("                   |                                      |")
}


// TODO Special Tracks
fun stonetrack(){
    println(
        "                   |▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒|\n" +
                "                   |▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒▓▓▒▒|")
}
fun teppich(){
    println("                   ${YELLOW}|${RESET}${RED}░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░${YELLOW}|${RESET}\n" +
            "                   ${YELLOW}|${RESET}${RED}░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░${YELLOW}|${RESET}\n" +
            "                   ${YELLOW}|${RESET}${RED}░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░${YELLOW}|${RESET}\n" +
            "                   ${YELLOW}|${RESET}${RED}░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░${RESET}${YELLOW}|${RESET}")
}


// TODO THEMES

fun clouds(){
    println("              (`  ).                   _           \n" +
            "             (     ).              .:(`  )`.       \n" +
            ")           _(       '`.          :(   .    )      \n" +
            "        .=(`(      .   )     .--  `.  (    ) )      \n" +
            "       ((    (..__.:'-'   .+(   )   ` _`  ) )                 \n" +
            "`.     `(       ) )       (   .  )     (   )  ._   \n" +
            "  )      ` __.:'   )     (   (   ))     `-'.-(`  ) \n" +
            ")  )  ( )       --'       `- __.'         :(      )) \n" +
            ".-'  (_.'          .')                    `(    )  ))\n" +
            "                  (_  )                     ` __.:'   ")

}
fun waterfall(){
    println(" ------------------------------###/-_  --- \"\"##--------------------------------   \n" +
            "               \"\\|\"\"\"|/\"\"\"|.`|`|| | }|.\"\"\"\"\"\"\"\"|\"\"\"\"            \n" +
            "         :          :      |:     ||   |  ||  :   :  |   :                          \n" +
            "                        :  /  :   |  |   ||| :  :      :                            \n" +
            "                              :  `| ||   |||    :  :                                \n" +
            "           :    :          | :  : |  |    ||    :     -                             \n" +
            "              .,      :        :  |   ||| || '       :                              \n" +
            "               '            :    `| |||    |  :   :                      `          \n" +
            "         :         :   `'   :  :  || # | |||    :            `    .                 \n" +
            "                              :   | ||#|#| | ':    :    :                           \n" +
            "                      :   :    :&@@@@@&@@@@@@@, ||   :      /                       \n" +
            "                   __________@@@@@@@@@@@@@@@@@@@@__________                           ")
}
fun water(){
    println("                   |  -   |            |      |           |")
    println("                   |  -    |       |              |   |   |")
    println("                   |  -      |         |                  |")
    println("                   |  -  |             | |         |      |")
    println("                   |  -  |             | |         |      |")
    println("                   |  -  |      |        |        |       |")
    println("                   |    |             | |      |          |")
    println("                   |  -  |   |         | |         |      |")
    println("                   |  -  |         |     |         |      |")
    println("                   |  -  |    |         | |               |")
    println("                   |  -      |       | | |         |      |")
    println("                   |  -  |     |        | |         |     |")
    println("                   |  -  |       |       |         |      |")
    println("                   |  -  |             | |         |      |")
    println("                   |  -  |             | |         |      |")
    println("                   |  -  |      |        |        |       |")
    println("                   |    |             | |      |          |")
    println("                   |  - @   |         | |         |       |")
    println("                   |  -  |         |     |         |      |")
    println("                   |  -  |    |       @@@@@@              |")
    println("                   |  -      @@@ @@@@@@@@@@@@@@@@@@@@@    |")
    println("                   | @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ |")
    println("                   |@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|")
    println("                   |  -  |      __--__--__ | | __--__--_  |")
    println("                   |  __-___---________---__-_--__--_____ |")
    println("                   |  _  .      .   __--__--__      __-   |")
    println("                   |     ___---__--__          _ .     _. |")
    println("                   |  -  .__       --__---_ _          _  |")
    println("                   |  _  _     ___ _         __--__--__   |")
    println("                   |  -  .__--__--_______--__--__         |")
    println("                   |  -      _       _ _ .         _      |")
    println("                   |  - __--__--__      __--__--__     |  |")
    println("                   |  -  _  __--__--__    __--__--__      |")
}
fun fireWork(){
    println("                                 .''.\n" +
            "       .''.             *''*    :_\\/_:     . \n" +
            "      :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
            "  .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-\n" +
            " :_\\/_:'.:::. /)\\*''*  .|.* '.\\'/.'_\\(/_'.':'.'\n" +
            " : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\    '  *\n" +
            "  '..'  ':::'   * /\\ * |'|  .'/.\\'.  '._____\n" +
            "      *        __*..* |  |     :      |.   |' .---\"|\n" +
            "       _*   .-'   '-. |  |     .--'|  ||   | _|    |\n" +
            "    .-'|  _.|  |    ||   '-__  |   |  |    ||      |\n" +
            "    |' | |.    |    ||       | |   |  |    ||      |\n" +
            " ___|  '-'     '    \"\"       '-'   '-.'    '`      |____\n" +
            "jgs~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
}
fun gates(){
    println("                                     {} {}\n" +
            "                               !  !  II II  !  !\n" +
            "                            !  I__I__II II__I__I  !\n" +
            "                         I_/|--|--|| ||--|--|\\_I\n" +
            "           .-'\"'-.       ! /|_/|  |  || ||  |  |\\_|\\ !       .-'\"'-.\n" +
            "          /===    \\      I//|  |  |  || ||  |  |  |\\\\I      /===    \\\n" +
            "          \\==     /   ! /|/ |  |  |  || ||  |  |  | \\|\\ !   \\==     /\n" +
            "           \\__  _/    I//|  |  |  |  || ||  |  |  |  |\\\\I    \\__  _/\n" +
            "            _} {_  ! /|/ |  |  |  |  || ||  |  |  |  | \\|\\ !  _} {_\n" +
            "           {_____} I//|  |  |  |  |  || ||  |  |  |  |  |\\\\I {_____}\n" +
            "      !  !  |=  |=/|/ |  |  |  |  |  || ||  |  |  |  |  | \\|\\=|-  |  !  ! \n" +
            "     _I__I__|=  ||/|  |  |  |  |  |  || ||  |  |  |  |  |  |\\||   |__I__I_\n" +
            "     -|--|--|-  || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||=  |--|--|-\n" +
            "     _|__|__|   ||_|__|__|__|__|__|__|| ||__|__|__|__|__|__|_||-  |__|__|_\n" +
            "     -|--|--|   ||-|--|--|--|--|--|--|| ||--|--|--|--|--|--|-||   |--|--|- \n" +
            "      |  |  |=  || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||   |  |  | \n" +
            "      |  |  |   || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||=  |  |  | \n" +
            "      |  |  |-  || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||   |  |  | \n" +
            "      |  |  |   || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||=  |  |  |\n" +
            "      |  |  |=  || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||   |  |  |\n" +
            "      |  |  |   || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||   |  |  |\n" +
            "      |  |  |   || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||-  |  |  |\n" +
            "     _|__|__|   || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||=  |__|__|_\n" +
            "     -|--|--|=  || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||   |--|--|-\n" +
            "     _|__|__|   ||_|__|__|__|__|__|__|| ||__|__|__|__|__|__|_||-  |__|__|_\n" +
            "     -|--|--|=  ||-|--|--|--|--|--|--|| ||--|--|--|--|--|--|-||=  |--|--|-\n" +
            "     -|--|--|-  || |  |  |  |  |  |  || ||  |  |  |  |  |  | ||-  |  |  |\n" +
            "    ~~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^~~~~~~~~~~~")
}
fun stars(){
    println("  *    .  *       .   ,          *\n" +
            "           .       . .        *\n" +
            " *   .   .'    * ,      .       .  ,     *\n" +
            "   .     *     .'\n" +
            "   '     .     .  *        *  .'.\n" +
            "       .   ' '        .    .    '   .\n" +
            ".  *        ,   *               '      *\n" +
            "                             .\n" +
            "         *          .   *"+
            "\n" +
            "                                          .       . \n" +
            "      '     .     .  *        *           +  :      .\n" +
            "                                                  :       _\n" +
            "                                '     .     .  *        *              .   !   '  (_)\n" +
            "                                                 ,|.' \n" +
            "       *    .  *       .   ,          *\n" +
            "           .       . .        *\n" +
            " *   .   .'    * ,      .       .  ,     *\n" +
            "   .     *     .'\n" +
            "                                         .'.\n" +
            "       .   ' '        .    .    '   .\n" +
            ".  *        ,   *               '      *\n" +
            "                             .\n" +
            "         *          .   *                                  -  -- ---(-O-`--- --  -\n" +
            "                                                ,`|'`.\n" +
            "                                              ,   !    .\n" +
            "                                                  :       :  \" \n" +
            "                                                  .     --+--\n" +
            "                           '     .     .  *        *             .:        .       !\n" +
            "\n" +
            "   *   '*\n" +
            "           *\n                    '     .     .  *        *" +
            "                *\n" +
            "                       *\n" +
            "               *\n" +
            "                     *\n" +
            "\n" +
            "         .              *        .\n" +
            "         .                      ;\n" +
            "         :                  - --+- -\n" +
            "         !           .         .          !\n" +
            "         |        .             .\n" +
            "         |_         +\n" +
            "      ,  | `.\n" +
            "--- --+-<#>-+- ---  --  -\n" +
            "      `._|_,'\n" +
            "         T\n" +
            "         |\n" +
            "         !\n" +
            "         :         . : \n" +
            "         .       *          ")
}
fun rainbow(){
    println("                                ▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                \n" +
            "                          ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                        \n" +
            "                    ▒▒▒▒▒▒▒▒▒▒▒▒              ▒▒▒▒▒▒▒▒▒▒▒▒                    \n" +
            "                  ▒▒▒▒▒▒▒▒      ▒▒▒▒▒▒▒▒▒▒▒▒▒▒      ▒▒▒▒▒▒▒▒▒▒                \n" +
            "              ▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒              \n" +
            "            ▒▒▒▒▒▒    ▒▒▒▒▒▒▒▒▒▒██████████████▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒▒▒            \n" +
            "          ▒▒▒▒▒▒    ▒▒▒▒▒▒██████████████████████████▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒          \n" +
            "        ▒▒▒▒▒▒  ▒▒▒▒▒▒▒▒████████              ██████████▒▒▒▒▒▒  ▒▒▒▒▒▒        \n" +
            "      ▒▒▒▒▒▒  ▒▒▒▒▒▒████████                        ██████▒▒▒▒▒▒  ▒▒▒▒▒▒      \n" +
            "      ▒▒▒▒  ▒▒▒▒▒▒██████                              ██████▒▒▒▒▒▒  ▒▒▒▒      \n" +
            "    ▒▒▒▒    ▒▒▒▒██████                                  ██████▒▒▒▒    ▒▒▒▒    \n" +
            "    ▒▒▒▒  ▒▒▒▒██████                                      ██████▒▒▒▒  ▒▒▒▒    \n" +
            "  ▒▒▒▒    ▒▒▒▒████                                          ████▒▒▒▒    ▒▒▒▒  \n" +
            "  ▒▒▒▒  ▒▒▒▒██████                                            ████▒▒▒▒  ▒▒▒▒  \n" +
            "  ▒▒▒▒  ▒▒▒▒████                                              ████▒▒▒▒  ▒▒▒▒  \n" +
            "▒▒▒▒  ▒▒▒▒██████                                              ██████▒▒▒▒  ▒▒▒▒\n" +
            "▒▒▒▒  ▒▒▒▒████                                                  ████▒▒▒▒  ▒▒▒▒\n" +
            "▒▒▒▒  ▒▒▒▒████                                                  ████▒▒▒▒  ▒▒▒▒\n" +
            "▒▒▒▒  ▒▒▒▒████                                                  ████▒▒▒▒  ▒▒▒▒")
}
fun desert(){
    println("    .    _    +     .  ______   .          .\n" +
            " (      /|\\      .    |      \\      .   +\n" +
            "     . |||||     _    | |   | | ||         .\n" +
            ".      |||||    | |  _| | | | |_||    .\n" +
            "   /\\  ||||| .  | | |   | |      |       .\n" +
            "__||||_|||||____| |_|_____________\\__________\n" +
            ". |||| |||||  /\\   _____      _____  .   .\n" +
            "  |||| ||||| ||||   .   .  .         ________\n" +
            " . \\|`-'|||| ||||    __________       .    .\n" +
            "    \\__ |||| ||||      .          .     .\n" +
            " __    ||||`-'|||  .       .    __________\n" +
            ".    . |||| ___/  ___________             .\n" +
            "   . _ ||||| . _               .   _________\n" +
            "_   ___|||||__  _ \\\\--//    .          _\n" +
            "     _ `---'    .)=\\oo|=(.   _   .   .    .")
}
fun canyon(){
    println("                                                  _\n" +
            "                    ___                          (_)\n" +
            "                  _/XXX\\\n" +
            "   _             /XXXXXX\\_                                    __\n" +
            "   X\\__    __   /X XXXX XX\\                          _       /XX\\__      ___\n" +
            "       \\__/  \\_/__       \\ \\                       _/X\\__   /XX XXX\\____/XXX\\\n" +
            "     \\  ___   \\/  \\_      \\ \\               __   _/      \\_/  _/  -   __  -  \\__\n" +
            "    ___/   \\__/   \\ \\__     \\\\__           /  \\_  _ _ \\  \\     __  /  \\____\n" +
            "   /  __    \\  /     \\ \\_   _//_\\___     _/               \\___/  \\/     __/\n" +
            "   __/_______\\________\\__\\_/________\\_ _/_____/_____________/_______\\____/_______\"")
}
fun temple(){
    println("                                                                                           \n" +
            "                                                                                           \n" +
            "                                ...............                                      \n" +
            "                              ..................                                     \n" +
            "                              ..               ..                                    \n" +
            "                              .:...............:                                     \n" +
            "                                  : :     : :                                         \n" +
            "                             ..::.: : ... : :.::..                                  \n" +
            "                            :   : :.........: :   :                                  \n" +
            "                           :____: :.........: :____:                                 \n" +
            "                         .______: :.........: :_____..                               \n" +
            "                       ..       ..:.........: :      ..                              \n" +
            "                      __________: :.........: :__________                            \n" +
            "                    . .         : :.........: :         . .                          \n" +
            "                   _____________: :.........: :_____________.                        \n" +
            "                 .              : :.........:.:             .                        \n" +
            "                ________________: :.........: :_______________.                      \n" +
            "              ..                : :.........: :                ..                    \n"+
            ":::..::::::.:;.,.::::.:::::..::.: :.........: :.,.,,;:;;.,:,:;;:,:,,.;.,:;:;;:,.:;:;:;...,")
}
fun castle2(){
    println("                             -|             |-\n" +
            "         -|                  [-_-_-_-_-_-_-_-]                  |-\n" +
            "         [-_-_-_-_-]          |             |          [-_-_-_-_-]\n" +
            "          | o   o |           [  0   0   0  ]           | o   o |\n" +
            "           |     |    -|       |           |       |-    |     |\n" +
            "           |     |_-___-___-___-|         |-___-___-___-_|     |\n" +
            "           |  o  ]              [    0    ]              [  o  |\n" +
            "           |     ]   o   o   o  [ _______ ]  o   o   o   [     | ----__________\n" +
            "_____----- |     ]              [ ||||||| ]              [     |\n" +
            "           |     ]              [ ||||||| ]              [     |\n" +
            "       _-_-|_____]--------------[_|||||||_]--------------[_____|-_-_\n" +
            "      ( (__________------------_____________-------------_________) )")
}
fun garden(){
    println("${GREEN}                                                 /'-.  _\n" +
            "                                               ..--_\\//\\_)\n" +
            "                                              / /_`\\'\\\\,_/\n" +
            "                                      _______ | |_\\/ /___\n" +
            "                                  .-'' (_/\\   _ \\.__. .__.--.\n" +
            "                                 /'    \\_,/__/ /\\ _   \\/ /_`\\ \\\n" +
            "                                 | .-'|'.-- ,\\.-/\\ \\--.| |_\\//'-.\n" +
            "                                |`-\\/_/ /_`\\ \\  `-./_`\\ \\.__.\\_\\/\n" +
            "                         /'-. _ \\_\\/--| (_\\/ |   | |_\\/ /'-..--.\n" +
            "                       __\\_\\(_/\\/ /'_\\ '.__.'     \\.__.'\\_\\//_`\\ \\\n" +
            "                      / /\\'_\\_,/| \\/_| ;/'-.          ;   | |_\\/ |\n" +
            "                      |.-'/_`\\;`\\.__.`; \\_\\/          |  |,\\___.'\n" +
            "                          (_\\/   | /`/\\_ /\\ \\         |  ' / /\\ _\n" +
            "                                 : \\.-/ /\\-.|         :  | |_./\\ \\\n" +
            "                                 |  | \\.-'            |  | / /\\-./_\n" +
            "                                 ;  ` | \\             ;  ` |.-' /'_\\\n" +
            "                            .--. :  |_/ ;             :  | |    \\/_)\n" +
            "                          / /_`\\ |  / _/              |  | :\n" +
            "                          | |_\\/ ; ,>`|               ;  ` |\n" +
            "                           \\.__. |/ /`;         _,,..-|  | ;---..,,_\n" +
            "                         /'-.   /`__| |       .'.._ ~_:  | | ~_~ _..'.\n" +
            "                         \\_\\/-'\\|/\\_) :      ((  (_)(_|  | ;)(_)(_)  ))\n" +
            "          ,--.          (_/\\\\/_/ \\._/ |       `--...._;  ` |___...--'        .--,\n" +
            "         /`.,'\\         \\_,/|,.--.| .-'|             )|  | |: (             /`,.'\\\n" +
            "         ; /  |         /'-\\/ /_`\\ \\\\/_/             \\:  | :| /             |  \\ ;\n" +
            "         | ' ``._       \\_\\/| |_\\/ |\\ __    _      _ ||  |,|; |           _.'' ` |\n" +
            "         / | |   `--.._   _\\/\\.__.' /\\.\\`. /._`. /._`.;  ` |  (     _..--'  _| | \\\n" +
            "      _  | ; ````..  _.`-/_`\\__/ |  `-./ | ||  | ||,/|\\  | \\|_..,--'._  ..''_' ; |.-'|\n" +
            "    -(-' ; |  |  __`-..._(_\\/\\ \\ '  ;||  | ||  | ./' |;  ` ' _,.___...-'   (_\\ | ;\\/_/\n" +
            " ,-') `. ) |  ,'| ,)       ;`-./ ;  |||  | ||  ,/' ,/||  ; .---'.-   |`-.   (/\\('`)\n" +
            "  '.)`\\ \\| ; /; '.'        _\\ Y| |  :||  | ||,/' ./' |:  | | ----`.  \\_\\ (`')|(`o )\n" +
            "     (`')| \\/;.',\\       /`/\\| | |  |||  | ,/' ,/'|._||  | :_____.'     ( o )-.(_)/)\n" +
            "      \\'\\; |\\|`;'/       \\.-'; | '  ;||  ,/' ./' ||  |;  ` |             (_)'\\ |/;\\_)\n" +
            "     -. |/.|'/,/'-._.._      \\  ;|  /||,/' ,/' | ||  |\\  | ;        _..--'| (')| |_\n" +
            "       \\|'.\\'._,,-'  _.`--,..|  \\;  `|/' ./'|  | ||  |'  ; /__..,--'._   _'(`o )/\\ \\\n" +
            "  `'-'''\\'-,||'-.,-`-...___ ,;  ||  .| ,/' ||  | ||  |.  |   _, ___...-'' (/(_)/\\_.|\n" +
            "     .\\  \\  |.-'/          `--| /.  ||/' | '|  | '|  ||  . `---'             \\.-'\n" +
            "                             ` \"` '.|.'--'  '--'  '--' `.|.` ${RESET}")
}
fun flyingCastle(){
    println("             P /\\  P\n" +
            "            /\\|  |/\\\n" +
            "         [] ||_/\\_|| []\n" +
            "         ||_||____||_||\n" +
            "         ||____[]____||\n" +
            "        {::     \\__    }\n" +
            "    ___  \\v:    .'\"  _V ___\n" +
            "snd(      \\_      __/  --  )_\n" +
            "  (__---    |::\\ :/  ---     )\n" +
            "     (       \\::\\/  ----- ___)\n" +
            "      (______  \\/     _____)")
}
fun beach(){
    println("                                     |\n" +
            "                                   \\ _ /\n" +
            "                                 -= (_) =-\n" +
            "                                   /   \\         _\\/_\n" +
            "                                     |           //o\\  _\\/_\n" +
            "                   _____ _____ _ __ __ ____ _ | __/o\\\\ _\n" +
            "                   -=-_-__=_=-=-_-__=_-= _=_=-=_,-'|\"'\"\"-|-,_\n" +
            "                   -=-=-_-__=_=- _=-=- -_=-=_,-\"          |\n" +
            "                     =-=-_-__=_-- =- =- -=.--\"            |")
}
fun windMils(){
    println("                                        __\n" +
            "                 ,-_                  (`  ).\n" +
            "                 |-_'-,              (     ).\n" +
            "                 |-_'-'           _(        '`.\n" +
            "        _        |-_'/        .=(`(      .     )\n" +
            "       /;-,_     |-_'        (     (.__.:-`-_.'\n" +
            "      /-.-;,-,___|'          `(       ) )\n" +
            "     /;-;-;-;_;_/|\\_ _ _ _ _   ` __.:'   )\n" +
            "        x_( __`|_P_|`-;-;-;,|        `--'\n" +
            "        |\\ \\    _||   `-;-;-'\n" +
            "        | \\`   -_|.      '-'\n" +
            "        | /   /-_| `\n" +
            "        |/   ,'-_|  \\\n" +
            "        /____|'-_|___\\\n" +
            " _..,____]__|_\\-_'|_[___,.._\n" +
            "'                          ``'--,..,.     ")
}
fun hauntedHouse(){
    println("                              .     .\n" +
            "                               !!!!!!!\n" +
            "                       .       [[[|]]]    .\n" +
            "                       !!!!!!!!|--_--|!!!!!\n" +
            "                       [[[[[[[[\\_(X)_/]]]]]\n" +
            "               .-.     /-_--__-/_--_-\\-_--\\\n" +
            "               |=|    /-_---__/__-__-_\\__-_\\\n" +
            "           . . |=| ._/-__-__\\===========/-__\\_\n" +
            "           !!!!!!!!!\\========[ /]]|[[\\ ]=====/\n" +
            "          /-_--_-_-_[[[[[[[[[||==  == ||]]]]]]\n" +
            "         /-_--_--_--_|=  === ||=/^|^\\ ||== =|\n" +
            "        /-_-/^|^\\-_--| /^|^\\=|| | | | ||^\\= |\n" +
            "       /_-_-| | |-_--|=| | | ||=|_|_|=||\"|==|\n" +
            "      /-__--|_|_|_-_-| |_|_|=||______=||_| =|\n" +
            "     /_-__--_-__-___-|_=__=_.`---------'._=_|__\n" +
            "    /-----------------------\\===========/-----/\n" +
            "   ^^^\\^^^^^^^^^^^^^^^^^^^^^^[[|]]|[[|]]=====/\n" +
            "       |.' ..==::'\"'::==.. '.[ /~~~~~\\ ]]]]]]]\n" +
            "       | .'=[[[|]]|[[|]]]=`._||==  =  || =\\ ]\n" +
            "       ||== =|/ _____ \\|== = ||=/^|^\\=||^\\ ||\n" +
            "       || == `||-----||' = ==|| | | |=|| |=||\n" +
            "       ||= == ||:^s^:|| = == ||=| | | || |=||\n" +
            "       || = = ||:___:||= == =|| |_|_| ||_|=||\n" +
            "      _||_ = =||o---.|| = ==_||_= == =||==_||_\n" +
            "      \\__/= = ||:   :||= == \\__/[][][][][]\\__/\n" +
            "      [||]= ==||:___:|| = = [||]\\\\//\\\\//\\\\[||]\n" +
            "      }  {---'\"'-----'\"'- --}  {//\\\\//\\\\//}  {\n" +
            "    __[==]__________________[==]\\\\//\\\\//\\\\[==]_\n" +
            "   |`|~~~~|================|~~~~|~~~~~~~~|~~~~||\n" +
            "jgs|^| ^  |================|^   | ^ ^^ ^ |  ^ ||\n" +
            "  \\|//\\\\/^|/==============\\|/^\\\\\\^/^.\\^///\\\\//|///\n" +
            " \\\\///\\\\\\//===============\\\\//\\\\///\\\\\\\\////\\\\\\/////\n" +
            " \"\"'\"\"'\"\"\".'..'. ' '. ''..'.\"\"'\"\"'\"\"'\"\"''\"''\"''\"\"")
}
fun gate2(){
    println("                                     {} {}\n" +
            "                             !  !  ! II II !  !  !\n" +
            "                          !  I__I__I_II II_I__I__I  !\n" +
            "                          I_/|__|__|_|| ||_|__|__|\\_I\n" +
            "                       ! /|_/|  |  | || || |  |  |\\_|\\ !       \n" +
            "           .--.        I//|  |  |  | || || |  |  |  |\\\\I        .--.\n" +
            "          /-   \\    ! /|/ |  |  |  | || || |  |  |  | \\|\\ !    /=   \\\n" +
            "          \\=__ /    I//|  |  |  |  | || || |  |  |  |  |\\\\I    \\-__ /\n" +
            "           }  {  ! /|/ |  |  |  |  | || || |  |  |  |  | \\|\\ !  }  {\n" +
            "          {____} I//|  |  |  |  |  | || || |  |  |  |  |  |\\\\I {____}\n" +
            "    _!__!__|= |=/|/ |  |  |  |  |  | || || |  |  |  |  |  | \\|\\=|  |__!__!_\n" +
            "    _I__I__|  ||/|__|__|__|__|__|__|_|| ||_|__|__|__|__|__|__|\\||- |__I__I_\n" +
            "    -|--|--|- ||-|--|--|--|--|--|--|-|| ||-|--|--|--|--|--|--|-||= |--|--|-\n" +
            "     |  |  |  || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||  |  |  |\n" +
            "     |  |  |= || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||= |  |  |\n" +
            "     |  |  |- || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||= |  |  |\n" +
            "     |  |  |- || |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||- |  |  | \n" +
            "    _|__|__|  ||_|__|__|__|__|__|__|_|| ||_|__|__|__|__|__|__|_||  |__|__|_\n" +
            "    -|--|--|= ||-|--|--|--|--|--|--|-|| ||-|--|--|--|--|--|--|-||- |--|--|-\n" +
            "    -|--|--|| |  |  |  |  |  |  | || || |  |  |  |  |  |  | ||= |  |  | \n" +
            "    ~~~~~~~~~~~^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^~~~~~~~~~~~")
}
fun air(){
    println("                   -      _       _    -       -          _")
    println("                   -      -    -  -            -    _     _")
    println("                          _            -       -          _")
    println("                   -              _    -                  -")
    println("                   -      _                    -      _   _")
    println("                              -   _    -                  _")
    println("                   -      _       _    -       -          _")
}



// TODO LEVELS

// Mushroom Cup
fun mushRoomCupRace(){

    marioKartStadium()
    Thread.sleep(3000)
    waterPark()
    Thread.sleep(3000)
    sweetSweetCanyon()
    Thread.sleep(3000)
    twompRuins()
    Thread.sleep(3000)

}

fun marioKartStadium(){
    mapMushroom01()
    Thread.sleep(3000)
    flyingCastle()
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    track()
    track()
    finishTrack()

}
fun waterPark(){
    mapMushroom02()
    Thread.sleep(3000)
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    jump()
    air()
    jump()
    track()
    track()
    finishTrack()
}
fun sweetSweetCanyon(){
    mapMushroom03()
    Thread.sleep(3000)
    canyon()
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    track()
    track()
    finishTrack()
}
fun twompRuins(){
    mapMushroom04()
    Thread.sleep(3000)
    temple()
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    jump()
    garden()
    jump()
    track()
    track()
    track()
    finishTrack()
    finish()
}


// Flower Cup
fun flowersCupRace(){

    marioCircuit()
    Thread.sleep(3000)
    toadHarbor()
    Thread.sleep(3000)
    twistedMansion()
    Thread.sleep(3000)
    shyGuyFalls()
}

fun marioCircuit(){
    mapFlower01()
    Thread.sleep(3000)
    castle2()
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    track()
    track()
    track()
    track()
    finishTrack()

}
fun toadHarbor(){
    mapFlower02()
    Thread.sleep(3000)
    beach()
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    track()
    track()
    track()
    track()
    finishTrack()

}
fun twistedMansion(){
    mapFlower03()
    Thread.sleep(3000)
    gate2()
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    track()
    track()
    track()
    finishTrack()
}
fun shyGuyFalls(){
    mapFlower04()
    Thread.sleep(3000)
    waterfall()
    starttrack()
    countDown()
    track()
    track()
    track()
    jump()
    water()
    jump()
    track()
    track()
    track()
    track()
    finishTrack()
    finish()
}


// Special Cup
fun specialCupRace(){

    cloudTopCruise()
    Thread.sleep(3000)

    boneDryDunes()
    Thread.sleep(3000)

    bowsersCastle()
    Thread.sleep(3000)

    rainbowRoad()
}

fun cloudTopCruise(){
    mapSpecial01()
    Thread.sleep(3000)
    windMils()
    starttrack()
    countDown()
    track()
    track()
    track()
    jump()
    clouds()
    jump()
    track()
    track()
    finishTrack()
}
fun boneDryDunes(){
    mapSpecial02()
    Thread.sleep(3000)
    desert()
    starttrack()
    countDown()
    track()
    track()
    track()
    jump()
    air()
    jump()
    track()
    track()
    finishTrack()
}
fun bowsersCastle(){
    mapSpecial03()
    Thread.sleep(3000)
    gates()
    starttrack()
    countDown()
    track()
    track()
    track()
    track()
    track()
    jump()
    air()
    jump()
    track()
    squareTrack()
    squareTrack()
    finishTrack()
}
fun rainbowRoad(){
    mapSpecial04()
    Thread.sleep(3000)
    rainbow()
    starttrack()
    countDown()
    track()
    track()
    track()
    jump()
    stars()
    jump()
    track()
    track()
    finishTrack()
    finish()
}




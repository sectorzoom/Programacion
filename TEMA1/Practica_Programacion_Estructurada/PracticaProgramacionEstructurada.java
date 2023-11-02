package Practica_Programacion_Estructurada;

import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionEstructurada {
    static int champion;
    static int round;
    static String nameStat;
    static int vit;
    static int attack;
    static int defense;
    static int speed;
    static int special;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenidos a mi juego, dime, ¿cómo te llamas?");
        String name_1 = in.next();
        System.out.println("Hola, contrincante de " + name_1 + " ¿cómo te llamas?");
        String name_2 = in.next();
        introduction(name_1);
        int championPlayer_1 = champion;
        championStats(championPlayer_1);
        confirmation();
        int vit_1 = vit; int vit_max_1 = vit; int attack_1 = attack; int defense_1 = defense; int speed_1 = speed; int special_1 = special;
        introduction(name_2);
        int championPlayer_2 = champion;
        championStats(championPlayer_2);
        confirmation();
        int vit_2 = vit; int vit_max_2 = vit; int attack_2 = attack; int defense_2 = defense; int speed_2 = speed; int special_2 = special;
        System.out.println("Muy bien " + name_1 + " y " + name_2 + ", ¡comienza el combate!");
        round = 1;
        int attackRandom_1, defenseRandom_1, speedRandom_1, critical_1, criticalAttack_1 = 0, specialCounter_1 = 0;
        int attackRandom_2, defenseRandom_2, speedRandom_2, critical_2, criticalAttack_2 = 0, specialCounter_2 = 0;
        while (vit_1 > 0 && vit_2 > 0) {
            System.out.println("Ronda " + round + ":");
            int critical;
            attackRandom_1 = randomParameters(attack_1);
            defenseRandom_1 = randomParameters(defense_1);
            speedRandom_1 = randomParameters(speed_1);
            critical = 100;
            critical_1 = randomParameters(critical);
            if (critical_1 <= 25) {
                criticalAttack_1 = crticalAttackChampion(attack_1);
            }
            attackRandom_2 = randomParameters(attack_2);
            defenseRandom_2 = randomParameters(defense_2);
            speedRandom_2 = randomParameters(speed_2);
            critical_2 = randomParameters(critical);
            if (critical_2 <= 25) {
                criticalAttack_2 = crticalAttackChampion(attack_2);
            }
            int action_1, action_2;
            if (speedRandom_1 >= speedRandom_2) {
                action_1 = action(name_1,name_2);
                action_2 = in.nextInt();
            } else {
                action_2 = action(name_2,name_1);
                action_1 = in.nextInt();
            }
            if ((action_1 == 3) && (specialCounter_1 == 1)) {
                System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
            }
            if ((action_1 == 3) && (specialCounter_1 == 0)) {
                specialCounter_1 = 1;
                if (special_1 == 1) {
                    defense_1 = defense_1 * 2;
                    vit_1 = vit_1 * 2;
                }
                if (special_1 == 2) {
                    attack_1 = (int) (attack_1 * 1.5);
                    vit_1 = (int) (vit_1 * 1.5);
                }
                if (special_1 == 3) {
                    attack_1 = attack_1 + 50;
                    defense_1 = defense_1 + 50;
                    speed_1 = speed_1 + 50;
                }
            }
            if ((action_2 == 3) && (specialCounter_2 == 1)) {
                System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
            }
            if ((action_2 == 3) && (specialCounter_2 == 0)) {
                specialCounter_2 = 1;
                if (special_2 == 1) {
                    defense_2 = defense_2 * 2;
                    vit_2 = vit_2 * 2;
                }
                if (special_2 == 2) {
                    attack_2 = (int) (attack_2 * 1.5);
                    vit_2 = (int) (vit_2 * 1.5);
                }
                if (special_2 == 3) {
                    attack_2 = attack_2 + 50;
                    defense_2 = defense_2 + 50;
                    speed_2 = speed_2 + 50;
                }
            }
            if (speedRandom_1 > speedRandom_2) {
                vit_2 = battle(name_1, name_2,action_1,action_2,critical_1,vit_2,attackRandom_1,defenseRandom_2,criticalAttack_1);
                vit_1 = battle(name_2, name_1,action_2,action_1,critical_2,vit_1,attackRandom_2,defenseRandom_1,criticalAttack_2);
                vit_1 = heal(action_1,action_2,vit_1);
                vit_2 = heal(action_2,action_1,vit_2);
            } else {
                vit_1 = battle(name_1, name_2,action_2,action_1,critical_2,vit_1,attackRandom_2,defenseRandom_1,criticalAttack_2);
                vit_2 = battle(name_2, name_1,action_1,action_2,critical_1,vit_2,attackRandom_1,defenseRandom_2,criticalAttack_1);
                vit_2 = heal(action_2,action_1,vit_2);
                vit_1 = heal(action_1,action_2,vit_1);
            }
            System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vit.");
            System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vit.");
            barVit(name_1,vit_1, vit_max_1);
            barVit(name_2,vit_2, vit_max_2);
        }
        //Aquí, un pequeño ASCII Art de victoria, según el vencedor.
        if ((vit_1 > vit_2) && (vit_2 != 0)) {
            System.out.println(name_1 + " ha vencido!");
            String asciiart =
                    """
                                                                                                     ###                                                    ##   \s
                                       ##                                                             ##                                                   ###   \s
                            ##   ##   ###     #####    #####     ####    ######            ######     ##      ####    ##  ##    ####    ######              ##   \s
                            ## # ##    ##     ##  ##   ##  ##   ##  ##    ##  ##            ##  ##    ##         ##   ##  ##   ##  ##    ##  ##             ##   \s
                            #######    ##     ##  ##   ##  ##   ######    ##                ##  ##    ##      #####   ##  ##   ######    ##                 ##   \s
                            #######    ##     ##  ##   ##  ##   ##        ##                #####     ##     ##  ##    #####   ##        ##                 ##   \s
                             ## ##    ####    ##  ##   ##  ##    #####   ####               ##       ####     #####       ##    #####   ####              ###### \s
                                                                                           ####                        #####                                     \s
                            """;
            System.out.println(asciiart);
        }
        if ((vit_1 < vit_2) && (vit_1 != 0)) {
            System.out.println(name_2 + " es el vencedor!");
            String asciiart =
                    """
                                                                                                     ###                                                   ####  \s
                                       ##                                                             ##                                                  ##  ## \s
                            ##   ##   ###     #####    #####     ####    ######            ######     ##      ####    ##  ##    ####    ######                ## \s
                            ## # ##    ##     ##  ##   ##  ##   ##  ##    ##  ##            ##  ##    ##         ##   ##  ##   ##  ##    ##  ##             ###  \s
                            #######    ##     ##  ##   ##  ##   ######    ##                ##  ##    ##      #####   ##  ##   ######    ##                ##    \s
                            #######    ##     ##  ##   ##  ##   ##        ##                #####     ##     ##  ##    #####   ##        ##               ##  ## \s
                             ## ##    ####    ##  ##   ##  ##    #####   ####               ##       ####     #####       ##    #####   ####              ###### \s
                                                                                           ####                        #####                                     \s
                            """;
            System.out.println(asciiart);
        }
    }
    public static void introduction (String name) {
        Scanner in = new Scanner(System.in);
        System.out.println("Muy bien " + name + " elige a tu campeón.");
        System.out.println("Caballero Cebolla (1) \nConan el Bárbaro (2) \nBerserker del Crisol (3) \nAleatorio (4) \nPersonalizado (5)");
        System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección.");
        champion = in.nextInt();
    }
    public static void championStats(int championPlayer) {
        Scanner in = new Scanner(System.in);
        int maxStat = 0;
        switch (championPlayer) {
            case 1:
                System.out.println("VIT: 200 / Ataque: 100 / Defensa: 150 / Velocidad: 50");
                vit = 200;
                attack = 100;
                defense = 125;
                speed = 75;
                special = 1;
                System.out.println("Especial - Corazón valeroso: aumenta la defensa del Caballero y duplica su VIT");
                break;
            case 2:
                System.out.println("VIT: 150 / Ataque: 200 / Defensa: 50 / Velocidad: 100");
                vit = 150;
                attack = 200;
                defense = 50;
                speed = 100;
                special = 2;
                System.out.println("Especial - Grito de Guerra: aumenta el ataque pero reduce su VIT.");
                break;
            case 3:
                System.out.println("VIT: 100 / Ataque: 150 / Defensa: 100 / Velocidad: 150");
                vit = 100;
                attack = 150;
                defense = 125;
                speed = 125;
                special = 3;
                System.out.println("Especial - Furia Berserker: aumenta todos los stats.");
                break;
            case 4:
                while ((maxStat != 500)) {
                    vit = (int) (Math.random() * 100) + 50;
                    attack = (int) (Math.random() * 100) + 50;
                    defense = (int) (Math.random() * 100) + 50;
                    speed = (int) (Math.random() * 100) + 50;
                    maxStat = (vit + attack + defense + speed);
                }
                System.out.println("Vitalidad: " + vit);
                System.out.println("Ataque: " + attack);
                System.out.println("Defensa: " + defense);
                System.out.println("Velocidad: " + speed);
                break;
            case 5:
                while ((maxStat != 500)) {
                    System.out.println("Nota: Recuerda, no debes poner mas de 200 en un atributo y como mínimo 1 en cada uno");
                    System.out.println("La suma de todos no puede ser mayor a 500");
                    vit = 0;
                    attack = 0;
                    defense = 0;
                    speed = 0;
                    maxStat = 0;
                    nameStat = "vit";
                    maxStat += statsCustomizerChampion(maxStat, nameStat, vit);
                    nameStat = "attack";
                    maxStat += statsCustomizerChampion(maxStat, nameStat, attack);
                    nameStat = "defense";
                    maxStat += statsCustomizerChampion(maxStat, nameStat, defense);
                    nameStat = "speed";
                    maxStat += statsCustomizerChampion(maxStat, nameStat, speed);
                }
                break;
        }
        if (championPlayer == 4 || championPlayer == 5) {
            System.out.println("Selecciona uno de los 3 especiales");
            System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats.");
            System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección.");
            do {
                System.out.print("Habilidad Especial: ");
                special = in.nextInt();
                if ((special >= 4) || (special <= 0)) {
                    System.out.println("Introduce un comando válido");
                }
            } while ((special <= 0) || (special >= 4));
        }
    }
    public static int statsCustomizerChampion(int maxStat, String nameStat, int stat) {
        Scanner in = new Scanner(System.in);
        System.out.println("Te quedan " + (500 - maxStat) + " para repartir.");
        while ((stat > 200) || (stat <= 0)) {
            System.out.print(nameStat + ": ");
            stat = (int) in.nextDouble();
            if ((stat > 200) || (stat <= 0)) {
                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
            }
        }
        return stat;
    }
    public static void confirmation() {
        Scanner in = new Scanner(System.in);
        boolean character_confirmation = false;
        while (!character_confirmation) {
            System.out.println("Es correcto? (Escribe 'S' o 's' / 'N' o 'n')");
            char selection = in.next().charAt(0);
            if ((selection == 'S') || (selection == 's')) {
                character_confirmation = true;
            }
        }
    }
    public static int randomParameters(int stat) {
        Random random = new Random();
        return random.nextInt(10, stat);
    }

    public static int crticalAttackChampion(int attack) {
        Random random = new Random();
        return (random.nextInt(50, attack) * 2);
    }
    public static int action (String selectActionName_1, String selectActionName_2) {
        System.out.println(selectActionName_1 + " ataca primero:");
        int action = selectAction(selectActionName_1);
        System.out.println("Te toca " + selectActionName_2);
        return action;
    }
    public static int selectAction(String name) {
        Scanner in = new Scanner(System.in);
        System.out.println(name + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
        System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
        return in.nextInt();
    }
    public static int battle(String name_1, String name_2, int action_1, int action_2, int critical_1, int vit_2, int attackRandom_1, int defenseRandom_2, int criticalAttack_1) {
        if (action_1 == 1) {
            if (action_2 == 1 || action_2 == 3) {
                if (critical_1 > 25) {
                    vit_2 = vit_2 - attackRandom_1;
                    System.out.println(name_1 + " ataca a " + name_2);
                }
                if (critical_1 <= 25) {
                    vit_2 = vit_2 - criticalAttack_1;
                    System.out.println(name_1 + " realiza un ataque crítico a " + name_2);
                }
            }
            if (action_2 == 2) {
                if (critical_1 > 25) {
                    vit_2 = vit_2 - (attackRandom_1 - (defenseRandom_2 / 2));
                    System.out.println(name_1 + " ataca a " + name_2 + " pero éste se defiende");
                }
                if (critical_1 <= 25) {
                    vit_2 = vit_2 - (criticalAttack_1 - (defenseRandom_2 / 2));
                    System.out.println(name_1 + " ataca a " + name_2 + " causándole daño crítico a pesar de la defensa");
                }
            }
            if (action_2 == 4) {
                if (critical_1 > 25) {
                    vit_2 = (int) (vit_2 - (attackRandom_1) + (Math.random() * 50));
                    System.out.println(name_1 + " ataca a " + name_2 + " el cual decide curarse");
                }
                if (critical_1 <= 25) {
                    vit_2 = (int) (vit_2 - (criticalAttack_1 + (Math.random() * 50)));
                    System.out.println(name_1 + " ataca a " + name_2 + " dañándolo críticamente, por lo que " + name_2 + " decide usar una poción");
                }
            }
        }
        return vit_2;
    }
    public static int heal (int action_1, int action_2, int vit_1) {
        if (action_1 == 4 && action_2 != 1) {
            vit_1 = (int) (vit_1 + (Math.random() * 50));
        }
        return vit_1;
    }
    public static void barVit (String name, int vit, int vitMax1) {
        double percentage_vit_1;
        int bar_length_vit_1 = 20;
        int scripts_remain_1;
        percentage_vit_1 = (double) vit / vitMax1;
        scripts_remain_1 = (int) (percentage_vit_1 * bar_length_vit_1);

        StringBuilder bar_vit_1 = new StringBuilder("[");
        for (int i = 0; i < bar_length_vit_1; i++) {
            if (i < scripts_remain_1) {
                bar_vit_1.append("-");
            } else {
                bar_vit_1.append(" ");
            }
        }
        bar_vit_1.append("]");
        System.out.println("Barra de Vida de " + name + ": " + bar_vit_1);
    }
}

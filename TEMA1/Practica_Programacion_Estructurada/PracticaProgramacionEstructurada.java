package Practica_Programacion_Estructurada;

import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionEstructurada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Bienvenidos a Battle Craft, el simulador de batallas de David Giménez.");
        System.out.println("Dime, ¿cómo te llamas?");
        System.out.print("Nombre: ");
        String name_1 = in.next();
        System.out.println("Hola contrincante de " + name_1 + " , ¿cómo te llamas?");
        System.out.print("Nombre: ");
        String name_2 = in.next();
        boolean character_confirmation_1 = false, character_confirmation_2 = false;
        int suma = 0;
        double vit_1 = 0, attack_1 = 0, defense_1 = 0, speed_1 = 0, especial_1 = 0;
        double vit_2 = 0, attack_2 = 0, defense_2 = 0, speed_2 = 0, especial_2 = 0;
        int character_1 = 0, character_2 = 0;

        //Aquí empieza el bloque que permite la selección del primer personaje.
        while (!character_confirmation_1) {
            System.out.println("Muy bien " + name_1 + " elige a tu campeón.");
            System.out.println("Caballero Cebolla (1) \nConan el Bárbaro (2) \nBerserker del Crisol (3) \nAleatorio (4) \nPersonalizado (5)");
            System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección.");
            do {
                System.out.print("Elección de personaje: ");
                character_1 = in.nextInt();
                if ((character_1 >= 6) || (character_1 <= 0)) {
                    System.out.println("Introduce un comando válido");
                }
            } while ((character_1 <= 0) || (character_1 >= 6));
            String name_character;
            if (character_1 == 1) {
                name_character = "al Caballero Cebolla";
            } else if (character_1 == 2) {
                name_character = "a Conan el Bárbaro";
            } else if (character_1 == 3) {
                name_character = "al Berserker del Crisol";
            } else if (character_1 == 4) {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                System.out.print("Nombre Campeón: ");
                name_character = in.next();
            } else {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                System.out.print("Nombre Campeón: ");
                name_character = in.next();
            }
            switch (character_1) {
                case 1:
                    System.out.println("Has elegido " + name_character + ". Estos son sus stats: ");
                    System.out.println("VIT: 200 / Ataque: 100 / Defensa: 150 / Velocidad: 50");
                    vit_1 = 200;
                    attack_1 = 100;
                    defense_1 = 150;
                    speed_1 = 50;
                    System.out.println("Especial - Corazón valeroso: aumenta la defensa del Caballero y duplica su VIT");
                    break;
                case 2:
                    System.out.println("Has elegido " + name_character + ". Estos son sus stats: ");
                    System.out.println("VIT: 150 / Ataque: 200 / Defensa: 50 / Velocidad: 100");
                    vit_1 = 150;
                    attack_1 = 200;
                    defense_1 = 50;
                    speed_1 = 100;
                    System.out.println("Especial - Grito de Guerra: aumenta el ataque pero reduce su VIT.");
                    break;
                case 3:
                    System.out.println("Has elegido a " + name_character + ". Estos son sus stats: ");
                    System.out.println("VIT: 100 / Ataque: 150 / Defensa: 100 / Velocidad: 150");
                    vit_1 = 100;
                    attack_1 = 150;
                    defense_1 = 100;
                    speed_1 = 150;
                    System.out.println("Especial - Furia Berserker: aumenta todos los stats.");
                    break;
                case 4:
                    System.out.println("Has elegido a " + name_character + ". Estos son sus stats: ");
                    while ((suma != 500)) {
                        vit_1 = (int) (Math.random() * 100) + 50;
                        attack_1 = (int) (Math.random() * 100) + 50;
                        defense_1 = (int) (Math.random() * 100) + 50;
                        speed_1 = (int) (Math.random() * 100) + 50;
                        suma = (int) (vit_1 + attack_1 + defense_1 + speed_1);
                    }
                    System.out.println("Vitalidad: " + vit_1);
                    System.out.println("Ataque: " + attack_1);
                    System.out.println("Defensa: " + defense_1);
                    System.out.println("Velocidad: " + speed_1);
                    System.out.println("Selecciona uno de los 3 especiales");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats.");
                    System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección.");
                    do {
                        System.out.print("Habilidad Especial: ");
                        especial_1 = in.nextInt();
                        if ((especial_1 >= 4) || (especial_1 <= 0)) {
                            System.out.println("Introduce un comando válido");
                        }
                    } while ((especial_1 <= 0) || (especial_1 >= 4));
                    break;
                case 5:
                    System.out.println("Muy bien, define los stats de " + name_character + ".");
                    while ((suma != 500)) {
                        System.out.println("Nota: Recuerda, no debes poner mas de 200 en un atributo y como mínimo 1 en cada uno");
                        System.out.println("La suma de todos no puede ser mayor a 500");
                        vit_1 = 0;
                        attack_1 = 0;
                        defense_1 = 0;
                        speed_1 = 0;
                        while ((vit_1 > 200) || (vit_1 <= 0)) {
                            System.out.print("VIT: ");
                            vit_1 = (int) in.nextDouble();
                            if ((vit_1 > 200) || (vit_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((attack_1 > 200) || (attack_1 <= 0)) {
                            System.out.print("Ataque: ");
                            attack_1 = (int) in.nextDouble();
                            if ((attack_1 > 200) || (attack_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1 + (int) attack_1;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((defense_1 > 200) || (defense_1 <= 0)) {
                            System.out.print("Defensa: ");
                            defense_1 = (int) in.nextDouble();
                            if ((defense_1 > 200) || (defense_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1 + (int) attack_1 + (int) defense_1;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((speed_1 > 200) || (speed_1 <= 0)) {
                            System.out.print("Velocidad: ");
                            speed_1 = (int) in.nextDouble();
                            if ((speed_1 > 200) || (speed_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1 + (int) attack_1 + (int) defense_1 + (int) speed_1;
                        if (suma < 500) {
                            System.out.println("Te quedan " + (500 - suma) + " para repartir. Debes repartirlos todos. Vuelve a empezar.");
                        }
                        if (suma > 500) {
                            System.out.println("Te has pasado de puntos. Debes repartir 500. Vuelve a empezar.");
                        }
                    }
                    System.out.println("Selecciona uno de los 3 especiales.");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats.");
                    System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección");
                    do {
                        System.out.print("Habilidad Especial: ");
                        especial_1 = in.nextInt();
                        if ((especial_1 >= 4) || (especial_1 <= 0)) {
                            System.out.println("Introduce un comando válido");
                        }
                    } while ((especial_1 <= 0) || (especial_1 >= 4));
                    break;
            }
            System.out.println("Es correcto? (Escribe 'S' o 's' / 'N' o 'n')");
            char seleccion = in.next().charAt(0);
            if ((seleccion == 'S') || (seleccion == 's')) {
                character_confirmation_1 = true;
            }
        }
        // Final del primer bloque de selección de campeón.

        // Aquí empieza  la segunda selección de campeón, idéntica a la primera.
        while (!character_confirmation_2) {
            System.out.println("Muy bien " + name_2 + " elige a tu campeón.");
            System.out.println("Caballero Cebolla (1) / Conan el Bárbaro (2) / Berserker del Crisol (3) / Aleatorio (4) / Personalizado (5)");
            System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección.");
            do {
                System.out.print("Elección de personaje: ");
                character_2 = in.nextInt();
                if ((character_2 >= 6) || (character_2 <= 0)) {
                    System.out.println("Introduce un comando válido");
                }
            } while ((character_2 <= 0) || (character_2 >= 6));
            String name_character_2;
            if (character_2 == 1) {
                name_character_2 = "al Caballero Cebolla";
            } else if (character_2 == 2) {
                name_character_2 = "a Conan el Bárbaro";
            } else if (character_2 == 3) {
                name_character_2 = "al Berserker del Crisol";
            } else if (character_2 == 4) {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                System.out.print("Nombre Campeón: ");
                name_character_2 = in.next();
            } else {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                System.out.print("Nombre Campeón: ");
                name_character_2 = in.next();
            }
            switch (character_2) {
                case 1:
                    System.out.println("Has elegido " + name_character_2 + ". Estos son sus stats: ");
                    System.out.println("VIT: 200 / Ataque: 100 / Defensa: 150 / Velocidad: 50");
                    vit_2 = 200;
                    attack_2 = 100;
                    defense_2 = 150;
                    speed_2 = 50;
                    System.out.println("Especial - Corazón valeroso: aumenta la defensa del Caballero y duplica su VIT");
                    break;
                case 2:
                    System.out.println("Has elegido " + name_character_2 + ". Estos son sus stats: ");
                    System.out.println("VIT: 150 / Ataque: 200 / Defensa: 50 / Velocidad: 100");
                    vit_2 = 150;
                    attack_2 = 200;
                    defense_2 = 50;
                    speed_2 = 100;
                    System.out.println("Especial - Grito de Guerra: aumenta el ataque pero reduce su VIT.");
                    break;
                case 3:
                    System.out.println("Has elegido a " + name_character_2 + ". Estos son sus stats: ");
                    System.out.println("VIT: 100 / Ataque: 150 / Defensa: 100 / Velocidad: 150");
                    vit_2 = 100;
                    attack_2 = 150;
                    defense_2 = 100;
                    speed_2 = 150;
                    System.out.println("Especial - Furia Berserker: aumenta todos los stats.");
                    break;
                case 4:
                    System.out.println("Has elegido a " + name_character_2 + ". Estos son sus stats: ");
                    while ((suma != 500)) {
                        vit_2 = (int) (Math.random() * 100) + 50;
                        attack_2 = (int) (Math.random() * 100) + 50;
                        defense_2 = (int) (Math.random() * 100) + 50;
                        speed_2 = (int) (Math.random() * 100) + 50;
                        suma = (int) (vit_2 + attack_2 + defense_2 + speed_2);
                    }
                    System.out.println("Vitalidad: " + vit_2);
                    System.out.println("Ataque: " + attack_2);
                    System.out.println("Defensa: " + defense_2);
                    System.out.println("Velocidad: " + speed_2);
                    System.out.println("Selecciona uno de los 3 especiales.");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats.");
                    System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección.");
                    do {
                        System.out.print("Habilidad Especial: ");
                        especial_2 = in.nextInt();
                        if ((especial_2 >= 4) || (especial_2 <= 0)) {
                            System.out.println("Introduce un comando válido");
                        }
                    } while ((especial_2 <= 0) || (especial_2 >= 4));
                    break;
                case 5:
                    System.out.println("Muy bien, define los stats de " + name_character_2 + ".");
                    while ((suma != 500)) {
                        System.out.println("Nota: Recuerda, no debes poner mas de 200 en un atributo y como mínimo 1 en cada uno");
                        System.out.println("La suma de todos no puede ser mayor a 500");
                        vit_2 = 0;
                        attack_2 = 0;
                        defense_2 = 0;
                        speed_2 = 0;
                        while ((vit_2 > 200) || (vit_2 <= 0)) {
                            System.out.print("VIT: ");
                            vit_2 = (int) in.nextDouble();
                            if ((vit_2 > 200) || (vit_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((attack_2 > 200) || (attack_2 <= 0)) {
                            System.out.print("Ataque: ");
                            attack_2 = (int) in.nextDouble();
                            if ((attack_2 > 200) || (attack_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2 + (int) attack_2;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((defense_2 > 200) || (defense_2 <= 0)) {
                            System.out.print("Defensa: ");
                            defense_2 = (int) in.nextDouble();
                            if ((defense_2 > 200) || (defense_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2 + (int) attack_2 + (int) defense_2;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((speed_2 > 200) || (speed_2 <= 0)) {
                            System.out.print("Velocidad: ");
                            speed_2 = (int) in.nextDouble();
                            if ((speed_2 > 200) || (speed_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2 + (int) attack_2 + (int) defense_2 + (int) speed_2;
                        if (suma < 500) {
                            System.out.println("Te quedan " + (500 - suma) + " para repartir. Debes repartirlos todos. Vuelve a empezar.");
                        }
                        if (suma > 500) {
                            System.out.println("Te has pasado de puntos. Debes repartir 500. Vuelve a empezar.");
                        }
                    }
                    System.out.println("Selecciona uno de los 3 especiales.");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats.");
                    System.out.println("NOTA: Escribe sólo el número que hay dentro del paréntesis de tu elección.");
                    do {
                        System.out.print("Habilidad Especial: ");
                        especial_2 = in.nextInt();
                        if ((especial_2 >= 4) || (especial_2 <= 0)) {
                            System.out.println("Introduce un comando válido");
                        }
                    } while ((especial_2 <= 0) || (especial_2 >= 4));
                    break;
            }
            System.out.println("Es correcto? (Escribe 'S' o 's' / 'N' o 'n')");
            char selection = in.next().charAt(0);
            if ((selection == 'S') || (selection == 's')) {
                character_confirmation_2 = true;
            }
        }
        // Aquí termina el código de la segunda selección de campeón, idéntica a la primera,

        // Aquí están los parámetros con los que se irán empezando cada turno y serán utilizados según el comando de cada ronda.
        System.out.println("Muy bien " + name_1 + " y " + name_2 + ", ¡comienza el combate!");
        int round = 1;
        double vit_max_1 = vit_1, vit_max_2 = vit_2;
        int special_counter_1 = 0, special_counter_2 = 0;
        while ((vit_1 > 0) && (vit_2 > 0)) {
            double first_attack_1 = (int) (Math.random() * 100 + speed_1);
            double first_attack_2 = (int) (Math.random() * 100 + speed_2);
            double critical_1 = (int) Math.floor(Math.random() * 100);
            double critical_2 = (int) Math.floor(Math.random() * 100);
            System.out.println("Ronda " + round + ":");
            round++;
            int action_1, action_2;
            double attack_character_1 = (int) random.nextDouble(attack_1), defense_character_1 = (int) random.nextDouble(defense_1);
            double attack_character_2 = (int) random.nextDouble(attack_2), defense_character_2 = (int) random.nextDouble(defense_2);
            double critical_attack_character_1 = (int) random.nextDouble(50, attack_1), critical_attack_character_2 = (int) random.nextDouble(50, attack_2);

            //Aquí empiezan los turnos, este primer bloque indica qué pasaría si atacase primero el jugador 1.
            if (first_attack_1 > first_attack_2) {
                System.out.println(name_1 + " ataca primero.");
                System.out.println(name_1 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                action_1 = in.nextInt();
                if ((action_1 == 3) && (special_counter_1 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                System.out.println(name_2 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                action_2 = in.nextInt();
                if ((action_2 == 3) && (special_counter_2 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                if ((action_1 == 3) && (special_counter_1 == 0)) {
                    special_counter_1 = 1;
                    if (character_1 == 1) {
                        defense_character_1 = defense_character_1 * 2;
                        vit_1 = vit_1 * 2;
                    }
                    if (character_1 == 2) {
                        attack_character_1 = attack_character_1 * 1.5;
                        vit_1 = vit_1 * 1.5;
                    }
                    if (character_1 == 3) {
                        attack_character_1 = attack_character_1 + 50;
                        defense_character_1 = defense_character_1 + 50;
                        speed_1 = speed_1 + 50;
                    }
                    if ((character_1 == 4) || (character_1 == 5)) {
                        if (especial_1 == 1) {
                            defense_character_1 = defense_character_1 * 2;
                            vit_1 = vit_1 * 2;
                        }
                        if (especial_1 == 2) {
                            attack_character_1 = attack_character_1 * 1.5;
                            vit_1 = vit_1 * 1.5;
                        }
                        if (especial_1 == 3) {
                            attack_character_1 = attack_character_1 + 50;
                            defense_character_1 = attack_character_1 + 50;
                            speed_1 = speed_1 + 50;
                        }
                    }
                }
                if ((action_2 == 3) && (special_counter_2 == 0)) {
                    special_counter_2 = 1;
                    if (character_2 == 1) {
                        defense_character_2 = defense_character_2 * 2;
                        vit_2 = vit_2 * 2;
                    }
                    if (character_2 == 2) {
                        attack_character_2 = attack_character_2 * 1.5;
                        vit_2 = vit_2 * 1.5;
                    }
                    if (character_2 == 3) {
                        attack_character_2 = attack_character_2 + 50;
                        defense_character_2 = defense_character_2 + 50;
                        speed_2 = speed_2 + 50;
                    }
                    if ((character_2 == 4) || (character_2 == 5)) {
                        if (especial_2 == 1) {
                            defense_character_2 = defense_character_2 * 2;
                            vit_2 = vit_2 * 2;
                        }
                        if (especial_2 == 2) {
                            attack_character_2 = attack_character_2 * 1.5;
                            vit_2 = vit_2 * 1.5;
                        }
                        if (especial_2 == 3) {
                            attack_character_2 = attack_character_2 + 50;
                            defense_character_2 = defense_character_2 + 50;
                            speed_2 = speed_2 + 50;
                        }
                    }
                }
                if ((action_1 == 1) && (action_2 == 1) && (critical_1 >= 25)) {
                    vit_2 = vit_2 - (attack_character_1);
                    vit_1 = vit_1 - (attack_character_2);
                    System.out.println(name_1 + " golpea a " + name_2 + " con un golpe frontal, " + name_2 + " lo imita.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 1) && (action_2 == 1) && (critical_1 <= 25)) {
                    vit_2 = vit_2 - ((critical_attack_character_1) * 2);
                    vit_1 = vit_1 - (attack_character_2);
                    System.out.println(name_1 + " golpea a " + name_2 + " con gran fiereza, dañando a " + name_2 + " severamente. " + name_2 + " intenta responder como puede, aunque sin tanto éxito.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 1) && (action_2 == 2)) {
                    vit_2 = vit_2 - (attack_character_1 - (defense_character_2 / 2));
                    System.out.println(name_1 + " intenta golpear a " + name_2 + ", pero éste se defiende, mitigando el daño.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 1) && (action_2 == 3) && (critical_1 >= 25)) {
                    vit_2 = vit_2 - (attack_character_1);
                    System.out.println(name_1 + " realiza un golpeo tremendo haciendo tambalear a " + name_2 + " e hiriéndolo de gravedad. " + name_2 + "realiza su habilidad especial buscando sorprender.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 1) && (action_2 == 3) && (critical_1 <= 25)) {
                    vit_2 = vit_2 - ((critical_attack_character_1) * 2);
                    System.out.println(name_1 + " realiza su ataque con tremenda fiereza, golpeando a " + name_2 + ", que cae al suelo e intenta sorprender a su rival con un su habilidad especial.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 1) && (action_2 == 4) && (critical_1 >= 25)) {
                    vit_2 = vit_2 - (attack_character_1);
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    System.out.println(name_1 + " golpe desde la cintura a " + name_2 + ", que, ante los daños, decide utilizar una poción de curación.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 1) && (action_2 == 4) && (critical_1 <= 25)) {
                    vit_2 = vit_2 - ((attack_character_1) * 2);
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    System.out.println(name_1 + " golpe desde la cintura a " + name_2 + " realizando un giro de 360º de gran fiereza, " + name_2 + " ante los enormes daños, decide utilizar una poción de curación.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 2) && (action_2 == 1)) {
                    vit_1 = attack_character_1 - (defense_character_2 / 2);
                    System.out.println(name_1 + " se pone en guardia a la espera del ataque de " + name_2 + " mitigando gran parte del daño.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 2) && (action_2 == 2)) {
                    System.out.println("Ambos se defienden, sin que ninguno se atreva a dar el primer paso.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 2) && (action_2 == 3)) {
                    System.out.println(name_1 + " decide defenderse y " + name_2 + " aprovecha la situación para intentar su ataque especial.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 2) && (action_2 == 4)) {
                    vit_2 = vit_2 + (Math.random() * 50);
                    System.out.println(name_1 + " decide defenderse y " + name_2 + " aprovecha la guardia del rival para sacar una poción y recuperarse.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 3) && (action_2 == 1)) {
                    vit_1 = vit_1 - attack_character_2;
                    System.out.println(name_1 + " carga su ataque especial directo hacia " + name_2 + ", que responde con un golpe desde la cintura.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 3) && (action_2 == 2)) {
                    System.out.println(name_1 + " carga su ataque especial directo hacia " + name_2 + ", que se lo espera e intenta protegerse.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 3) && (action_2 == 3)) {
                    System.out.println("Ambos rivales realizan sendos ataques especiales generando una ráfaga de energía intercalada sin control.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 3) && (action_2 == 4)) {
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    System.out.println(name_1 + " carga su ataque especial, " + name_2 + ", ante la gran cantidad de daño que se le viene, decide utilizar una poción.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 4) && (action_2 == 1)) {
                    vit_1 = vit_1 - attack_character_2;
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println(name_2 + " aprovecha para atacar mientras " + name_1 + " decide utilizar una poción.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 4) && (action_2 == 2)) {
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println(name_2 + " decide cubrirse y " + name_1 + " aprovecha la situación para curarse.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 4) && (action_2 == 3)) {
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println(name_2 + " utiliza su ataque especial, sorprendiendo a " + name_1 + " que decide curarse usando una poción por si las moscas.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((action_1 == 4) && (action_2 == 4)) {
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    System.out.println("Ambos oponentes se alejan el uno del otro y aprovechan para curarse.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
            }
            //Aquí termina este bloque de código, referente a qué ocurre si pega primero el jugador 1.

            /* De aquí para abajo es el mismo código que justo arriba pero cambiando el orden de pelea, pega antes el
            segundo jugador que el primero */
            if (first_attack_1 < first_attack_2) {
                System.out.println(name_2 + " ataca primero.");
                System.out.println(name_2 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                action_2 = in.nextInt();
                if ((action_2 == 3) && (special_counter_2 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                System.out.println(name_1 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                action_1 = in.nextInt();
                if ((action_1 == 3) && (special_counter_1 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                if ((action_2 == 3) && (special_counter_2 == 0)) {
                    special_counter_2 = 1;
                    if (character_2 == 1) {
                        defense_character_2 = defense_character_2 * 2;
                        vit_2 = vit_2 * 2;
                    }
                    if (character_2 == 2) {
                        attack_character_2 = attack_character_2 * 1.5;
                        vit_2 = vit_2 * 1.5;
                    }
                    if (character_2 == 3) {
                        attack_character_2 = attack_character_2 + 50;
                        defense_character_2 = defense_character_2 + 50;
                        speed_2 = speed_2 + 50;
                    }
                    if ((character_2 == 4) || (character_2 == 5)) {
                        if (especial_2 == 1) {
                            defense_character_2 = defense_character_2 * 2;
                            vit_2 = vit_2 * 2;
                        }
                        if (especial_2 == 2) {
                            attack_character_2 = attack_character_2 * 1.5;
                            vit_2 = vit_2 * 1.5;
                        }
                        if (especial_2 == 3) {
                            attack_character_2 = attack_character_2 + 50;
                            defense_character_2 = defense_character_2 + 50;
                            speed_2 = speed_2 + 50;
                        }
                    }
                    if ((action_1 == 3) && (special_counter_1 == 0)) {
                        special_counter_1 = 1;
                        if (character_1 == 1) {
                            defense_character_1 = defense_character_1 * 2;
                            vit_1 = vit_1 * 2;
                        }
                        if (character_1 == 2) {
                            attack_character_1 = attack_character_1 * 1.5;
                            vit_1 = vit_1 * 1.5;
                        }
                        if (character_1 == 3) {
                            attack_character_1 = attack_character_1 + 50;
                            defense_character_1 = defense_character_1 + 50;
                            speed_1 = speed_1 + 50;
                        }
                        if ((character_1 == 1) || (character_1 == 5)) {
                            if (especial_1 == 1) {
                                defense_character_1 = defense_character_1 * 2;
                                vit_1 = vit_1 * 2;
                            }
                            if (especial_1 == 2) {
                                attack_character_1 = attack_character_1 * 1.5;
                                vit_1 = vit_1 * 1.5;
                            }
                            if (especial_1 == 3) {
                                attack_character_1 = attack_character_1 + 50;
                                defense_character_1 = defense_character_1 + 50;
                                speed_1 = speed_1 + 50;
                            }
                        }
                    }
                }
                if ((action_2 == 1) && (action_1 == 1) && (critical_2 >= 25)) {
                    vit_1 = vit_1 - (attack_character_2);
                    vit_2 = vit_2 - (attack_character_1);
                    System.out.println(name_2 + " golpea a " + name_1 + " con un golpe frontal, " + name_1 + " lo imita.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 1) && (action_1 == 1) && (critical_2 <= 25)) {
                    vit_1 = vit_1 - (critical_attack_character_2 * 2);
                    vit_2 = vit_2 - (attack_character_1);
                    System.out.println(name_2 + " golpea a " + name_1 + " con gran fiereza, dañando a " + name_1 + " severamente. " + name_1 + " intenta responder como puede, aunque sin tanto éxito.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 1) && (action_1 == 2)) {
                    vit_1 = vit_1 - (attack_character_2 - (defense_character_1 / 2));
                    System.out.println(name_2 + " intenta golpear a " + name_1 + ", pero éste se defiende, mitigando el daño.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 1) && (action_1 == 3) && (critical_2 >= 25)) {
                    vit_1 = vit_1 - (attack_character_2);
                    System.out.println(name_2 + " realiza un golpeo tremendo haciendo tambalear a " + name_1 + " e hiriéndolo de gravedad. " + name_1 + "realiza su habilidad especial buscando una ventaja.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 1) && (action_1 == 3) && (critical_2 <= 25)) {
                    vit_1 = vit_1 - ((critical_attack_character_2 * 2));
                    System.out.println(name_2 + " realiza su ataque con tremenda fiereza, golpeando a " + name_1 + ", que cae al suelo e intenta sorprender cargando su habilidad especial.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 1) && (action_1 == 4) && (critical_2 >= 25)) {
                    vit_1 = vit_1 - (attack_character_2);
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println(name_2 + " golpe desde la cintura a " + name_1 + ", que, ante los daños, decide utilizar una poción de curación.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 1) && (action_1 == 4) && (critical_2 <= 25)) {
                    vit_1 = vit_1 - (critical_attack_character_2 * 2);
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println(name_2 + " golpe desde la cintura a " + name_1 + " realizando un giro de 360º de gran fiereza, " + name_1 + " ante los enormes daños, decide utilizar una poción de curación.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 2) && (action_1 == 1)) {
                    vit_2 = attack_character_1 - (defense_character_2 / 2);
                    System.out.println(name_2 + " se pone en guardia a la espera del ataque de " + name_1 + " mitigando gran parte del daño.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 2) && (action_1 == 2)) {
                    System.out.println("Ambos se defienden, sin que ninguno se atreva a dar el primer paso.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 2) && (action_1 == 3)) {
                    System.out.println(name_2 + " decide defenderse y " + name_1 + " aprovecha la situación para intentar su ataque especial.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 2) && (action_1 == 4)) {
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println(name_2 + " decide defenderse y " + name_1 + " aprovecha la guardia del rival para sacar una poción y recuperarse.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 3) && (action_1 == 1)) {
                    vit_2 = vit_2 - attack_character_1;
                    System.out.println(name_2 + " carga su ataque especial, " + name_1 + " responde con un golpe desde la cintura.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 3) && (action_1 == 2)) {
                    System.out.println(name_2 + " carga su ataque especial, " + name_1 + ", que se lo espera, intenta mitigar el daño cubriéndose.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 3) && (action_1 == 3)) {
                    System.out.println("Ambos rivales realizan sendos ataques especiales generando una ráfaga de energía intercalada sin control.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 3) && (action_1 == 4)) {
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println(name_2 + " carga su ataque especial, " + name_1 + ", ante la gran cantidad de daño que se le viene, decide utilizar una poción.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 4) && (action_1 == 1)) {
                    vit_2 = vit_2 - attack_character_1;
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    System.out.println(name_1 + " aprovecha para atacar mientras " + name_2 + " decide utilizar una poción.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 4) && (action_1 == 2)) {
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    System.out.println(name_1 + " decide cubrirse y " + name_2 + " aprovecha la situación para curarse.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 4) && (action_1 == 3)) {
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    System.out.println(name_1 + " carga su ataque especial, " + name_2 + " decide curarse usando una poción.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
                if ((action_2 == 4) && (action_1 == 4)) {
                    vit_2 = vit_2 + (int) (Math.random() * 50);
                    vit_1 = vit_1 + (int) (Math.random() * 50);
                    System.out.println("Ambos oponentes se alejan el uno del otro y aprovechan para curarse.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
            }
            //Aquí termina este bloque de ataque si lo hace primero el jugador 2.

            //De aquí para abajo tenemos la representación gráfica de la vida de ambos jugadores.
            double percentage_vit_1, percentage_vit_2;
            int bar_length_vit_1 = 20;
            int scripts_remain_1, scripts_remain_2;
            int bar_length_vit_2 = 20;
            percentage_vit_1 = vit_1 / vit_max_1;
            percentage_vit_2 = vit_2 / vit_max_2;
            scripts_remain_1 = (int) (percentage_vit_1 * bar_length_vit_1);
            scripts_remain_2 = (int) (percentage_vit_2 * bar_length_vit_2);

            StringBuilder bar_vit_1 = new StringBuilder("[");
            for (int i = 0; i < bar_length_vit_1; i++) {
                if (i < scripts_remain_1) {
                    bar_vit_1.append("-");
                } else {
                    bar_vit_1.append(" ");
                }
            }
            bar_vit_1.append("]");
            System.out.println("Barra de Vida de " + name_1 + ": " + bar_vit_1);

            StringBuilder bar_vit_2 = new StringBuilder("[");
            for (int i = 0; i < bar_length_vit_2; i++) {
                if (i < scripts_remain_2) {
                    bar_vit_2.append("-");
                } else {
                    bar_vit_2.append(" ");
                }
            }
            bar_vit_2.append("]");
            System.out.println("Barra de Vida de " + name_2 + ": " + bar_vit_2);
            //Aquí termina la representación gráfica de la vida

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
}

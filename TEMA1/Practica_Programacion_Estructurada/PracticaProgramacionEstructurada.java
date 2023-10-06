package Practica_Programacion_Estructurada;
import java.util.Random;
import java.util.Scanner;
public class PracticaProgramacionEstructurada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Bienvenidos a Battle Craft, el simulador de batallas de David Giménez.");
        System.out.println("Dime, ¿cómo te llamas?");
        String name_1 = in.next();
        System.out.println("Hola contrincante de " + name_1 + " , ¿cómo te llamas?");
        String name_2 = in.next();
        boolean confirmacion_personaje_1 = false, confirmacion_personaje_2 = false;
        int suma = 0;
        double vit_1 = 0, ataque_1 = 0, defensa_1 = 0, velocidad_1 = 0, especial_1 = 0;
        double vit_2 = 0, ataque_2 = 0, defensa_2 = 0, velocidad_2 = 0, especial_2 = 0;
        int personaje_1 = 0, personaje_2 = 0;

//Aquí empieza el bloque que permite la selección del primer personaje.
        while (!confirmacion_personaje_1) {
            System.out.println("Muy bien " + name_1 + " elige a tu campeón.");
            System.out.println("Caballero Cebolla (1) / Conan el Bárbaro (2) / Berserker del Crisol (3) / Aleatorio (4) / Personalizado (5)");
            personaje_1 = in.nextInt();
            String nombre_personaje = "nombre";
            if (personaje_1 == 1) {
                nombre_personaje = "al Caballero Cebolla";
            } else if (personaje_1 == 2) {
                nombre_personaje = "a Conan el Bárbaro";
            } else if (personaje_1 == 3) {
                nombre_personaje = "al Berserker del Crisol";
            } else if (personaje_1 == 4) {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                nombre_personaje = in.next();
            } else if (personaje_1 == 5) {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                nombre_personaje = in.next();
            }
            switch (personaje_1) {
                case 1:
                    System.out.println("Has elegido " + nombre_personaje + ". Estos son sus stats: ");
                    System.out.println("VIT: 200 / Ataque: 100 / Defensa: 150 / Velocidad: 50");
                    vit_1 = 200;
                    ataque_1 = 100;
                    defensa_1 = 150;
                    velocidad_1 = 50;
                    System.out.println("Especial - Corazón valeroso: aumenta la defensa del Caballero y duplica su VIT");
                    break;
                case 2:
                    System.out.println("Has elegido " + nombre_personaje + ". Estos son sus stats: ");
                    System.out.println("VIT: 150 / Ataque: 200 / Defensa: 50 / Velocidad: 100");
                    vit_1 = 150;
                    ataque_1 = 200;
                    defensa_1 = 50;
                    velocidad_1 = 100;
                    System.out.println("Especial - Grito de Guerra: aumenta el ataque pero reduce su VIT.");
                    break;
                case 3:
                    System.out.println("Has elegido a " + nombre_personaje + ". Estos son sus stats: ");
                    System.out.println("VIT: 100 / Ataque: 150 / Defensa: 100 / Velocidad: 150");
                    vit_1 = 100;
                    ataque_1 = 150;
                    defensa_1 = 100;
                    velocidad_1 = 150;
                    System.out.println("Especial - Furia Berserker: aumenta todos los stats 2 rounds.");
                    break;
                case 4:
                    System.out.println("Has elegido a " + nombre_personaje + ". Estos son sus stats: ");
                    while ((suma != 500)) {
                        vit_1 = (int) (Math.random() * 100) + 50;
                        ataque_1 = (int) (Math.random() * 100) + 50;
                        defensa_1 = (int) (Math.random() * 100) + 50;
                        velocidad_1 = (int) (Math.random() * 100) + 50;
                        suma = (int) (vit_1 + ataque_1 + defensa_1 + velocidad_1);
                    }
                    System.out.println("Vitalidad: " + vit_1);
                    System.out.println("Ataque: " + ataque_1);
                    System.out.println("Defensa: " + defensa_1);
                    System.out.println("Velocidad: " + velocidad_1);
                    System.out.println("Selecciona uno de los 3 especiales. NOTA: escribe 1,2 o 3.");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats 2 rounds.");
                    especial_1 = in.nextInt();
                    break;
                case 5:
                    System.out.println("Muy bien, define los stats de " + nombre_personaje + ".");
                    while ((suma != 500)) {
                        System.out.println("Nota: Recuerda, no debes poner mas de 200 en un atributo y como mínimo 1 en cada uno");
                        System.out.println("La suma de todos no puede ser mayor a 500");
                        vit_1 = 0;
                        ataque_1 = 0;
                        defensa_1 = 0;
                        velocidad_1 = 0;
                        while ((vit_1 > 200) || (vit_1 <= 0)) {
                            System.out.print("VIT: ");
                            vit_1 = (int) in.nextDouble();
                            if ((vit_1 > 200) || (vit_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((ataque_1 > 200) || (ataque_1 <= 0)) {
                            System.out.println("Ataque: ");
                            ataque_1 = (int) in.nextDouble();
                            if ((ataque_1 > 200) || (ataque_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1 + (int) ataque_1;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((defensa_1 > 200) || (defensa_1 <= 0)) {
                            System.out.println("Defensa: ");
                            defensa_1 = (int) in.nextDouble();
                            if ((defensa_1 > 200) || (defensa_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1 + (int) ataque_1 + (int) defensa_1;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((velocidad_1 > 200) || (velocidad_1 <= 0)) {
                            System.out.println("Velocidad: ");
                            velocidad_1 = (int) in.nextDouble();
                            if ((velocidad_1 > 200) || (velocidad_1 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_1 + (int) ataque_1 + (int) defensa_1 + (int) velocidad_1;
                        if (suma < 500) {
                            System.out.println("Te quedan " + (500 - suma) + " para repartir. Debes repartirlos todos. Vuelve a empezar.");
                        }
                        if (suma > 500) {
                            System.out.println("Te has pasado de puntos. Debes repartir 500. Vuelve a empezar.");
                        }
                    }
                    System.out.println("Selecciona uno de los 3 especiales. NOTA: escribe 1,2 o 3.");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats 2 rounds.");
                    especial_1 = in.nextInt();
                    break;
            }
            System.out.println("Es correcto?");
            char seleccion = in.next().charAt(0);
            if ((seleccion == 'S') || (seleccion == 's')) {
                confirmacion_personaje_1 = true;
            }
        }
// Final del primer bloque de selección de campeón.

// Aquí empieza  la segunda selección de campeón, idéntica a la primera.
        while (!confirmacion_personaje_2) {
            System.out.println("Muy bien " + name_2 + " elige a tu campeón.");
            System.out.println("Caballero Cebolla (1) / Conan el Bárbaro (2) / Berserker del Crisol (3) / Aleatorio (4) / Personalizado (5)");
            personaje_2 = in.nextInt();
            String nombre_personaje_2 = "nombre";
            if (personaje_2 == 1) {
                nombre_personaje_2 = "al Caballero Cebolla";
            } else if (personaje_2 == 2) {
                nombre_personaje_2 = "a Conan el Bárbaro";
            } else if (personaje_2 == 3) {
                nombre_personaje_2 = "al Berserker del Crisol";
            } else if (personaje_2 == 4) {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                nombre_personaje_2 = in.next();
            } else if (personaje_2 == 5) {
                System.out.println("Por favor, dale un nombre a tu campeón.");
                nombre_personaje_2 = in.next();
            }
            switch (personaje_2) {
                case 1:
                    System.out.println("Has elegido " + nombre_personaje_2 + ". Estos son sus stats: ");
                    System.out.println("VIT: 200 / Ataque: 100 / Defensa: 150 / Velocidad: 50");
                    vit_2 = 200;
                    ataque_2 = 100;
                    defensa_2 = 150;
                    velocidad_2 = 50;
                    System.out.println("Especial - Corazón valeroso: aumenta la defensa del Caballero y duplica su VIT");
                    break;
                case 2:
                    System.out.println("Has elegido " + nombre_personaje_2 + ". Estos son sus stats: ");
                    System.out.println("VIT: 150 / Ataque: 200 / Defensa: 50 / Velocidad: 100");
                    vit_2 = 150;
                    ataque_2 = 200;
                    defensa_2 = 50;
                    velocidad_2 = 100;
                    System.out.println("Especial - Grito de Guerra: aumenta el ataque pero reduce su VIT.");
                    break;
                case 3:
                    System.out.println("Has elegido a " + nombre_personaje_2 + ". Estos son sus stats: ");
                    System.out.println("VIT: 100 / Ataque: 150 / Defensa: 100 / Velocidad: 150");
                    vit_2 = 100;
                    ataque_2 = 150;
                    defensa_2 = 100;
                    velocidad_2 = 150;
                    System.out.println("Especial - Furia Berserker: aumenta todos los stats 2 rounds.");
                    break;
                case 4:
                    System.out.println("Has elegido a " + nombre_personaje_2 + ". Estos son sus stats: ");
                    while ((suma != 500)) {
                        vit_2 = (int) (Math.random() * 100) + 50;
                        ataque_2 = (int) (Math.random() * 100) + 50;
                        defensa_2 = (int) (Math.random() * 100) + 50;
                        velocidad_2 = (int) (Math.random() * 100) + 50;
                        suma = (int) (vit_2 + ataque_2 + defensa_2 + velocidad_2);
                    }
                    System.out.println("Vitalidad: " + vit_2);
                    System.out.println("Ataque: " + ataque_2);
                    System.out.println("Defensa: " + defensa_2);
                    System.out.println("Velocidad: " + velocidad_2);
                    System.out.println("Selecciona uno de los 3 especiales. NOTA: escribe 1,2 o 3.");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats 2 rounds.");
                    especial_2 = in.nextInt();
                    break;
                case 5:
                    System.out.println("Muy bien, define los stats de " + nombre_personaje_2 + ".");
                    while ((suma != 500)) {
                        System.out.println("Nota: Recuerda, no debes poner mas de 200 en un atributo y como mínimo 1 en cada uno");
                        System.out.println("La suma de todos no puede ser mayor a 500");
                        vit_2 = 0;
                        ataque_2 = 0;
                        defensa_2 = 0;
                        velocidad_2 = 0;
                        while ((vit_2 > 200) || (vit_2 <= 0)) {
                            System.out.print("VIT: ");
                            vit_2 = (int) in.nextDouble();
                            if ((vit_2 > 200) || (vit_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((ataque_2 > 200) || (ataque_2 <= 0)) {
                            System.out.println("Ataque: ");
                            ataque_2 = (int) in.nextDouble();
                            if ((ataque_2 > 200) || (ataque_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2 + (int) ataque_2;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((defensa_2 > 200) || (defensa_2 <= 0)) {
                            System.out.println("Defensa: ");
                            defensa_2 = (int) in.nextDouble();
                            if ((defensa_2 > 200) || (defensa_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2 + (int) ataque_2 + (int) defensa_2;
                        System.out.println("Te quedan " + (500 - suma) + " para repartir.");
                        while ((velocidad_2 > 200) || (velocidad_2 <= 0)) {
                            System.out.println("Velocidad: ");
                            velocidad_2 = (int) in.nextDouble();
                            if ((velocidad_2 > 200) || (velocidad_2 <= 0)) {
                                System.out.println("Valor erróneo, vuelve a escribir un valor correcto.");
                            }
                        }
                        suma = (int) vit_2 + (int) ataque_2 + (int) defensa_2 + (int) velocidad_2;
                        if (suma < 500) {
                            System.out.println("Te quedan " + (500 - suma) + " para repartir. Debes repartirlos todos. Vuelve a empezar.");
                        }
                        if (suma > 500) {
                            System.out.println("Te has pasado de puntos. Debes repartir 500. Vuelve a empezar.");
                        }
                    }
                    System.out.println("Selecciona uno de los 3 especiales. NOTA: escribe 1,2 o 3.");
                    System.out.println("Corazon Valeroso (1): aumenta la defensa del Caballero y duplica su VIT.\nGrito de Guerra (2): aumenta el ataque pero reduce su VIT.\nFuria Berserker (3): aumenta todos los stats 2 rounds.");
                    especial_2 = in.nextInt();
                    break;
            }
            System.out.println("Es correcto?");
            char seleccion = in.next().charAt(0);
            if ((seleccion == 'S') || (seleccion == 's')) {
                confirmacion_personaje_2 = true;
            }
        }
// Aquí termina el código de la segunda selección de campeón, idéntica a la primera,

// Aquí están los parámetros con los que se irán empezando cada turno y serán utilizados según el comando de cada ronda.
        System.out.println("Muy bien " + name_1 + " y " + name_2 + ", ¡comienza el combate!");
        int round = 1;
        double vit_maxima_1 = vit_1, vit_maxima_2 = vit_2;
        int contador_especial_1 = 0, contador_especial_2 = 0;
        while ((vit_1 > 0) && (vit_2 > 0)) {
            double primer_ataque_1 = (int) (Math.random() * 100 + velocidad_1);
            double primer_ataque_2 = (int) (Math.random() * 100 + velocidad_2);
            double critico_1 = (int) Math.floor(Math.random() * 100);
            double critico_2 = (int) Math.floor(Math.random() * 100);
            System.out.println("Ronda " + round + ":");
            round++;
            int accion_1, accion_2;
            double ataque_jugador1 = (int) random.nextDouble(ataque_1), defensa_jugador1 = (int) random.nextDouble(defensa_1);
            double ataque_jugador2 = (int) random.nextDouble(ataque_2), defensa_jugador2 = (int) random.nextDouble(defensa_2);

            //Aquí empiezan los turnos, este primer bloque indica qué pasaría si atacase primero el jugador 1.
            if (primer_ataque_1 > primer_ataque_2) {
                System.out.println(name_1 + " ataca primero.");
                System.out.println(name_1 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                accion_1 = in.nextInt();
                if ((accion_1 == 3) && (contador_especial_1 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                System.out.println(name_2 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                accion_2 = in.nextInt();
                if ((accion_2 == 3) && (contador_especial_2 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                if ((accion_1 == 3) && (contador_especial_1 == 0)) {
                    contador_especial_1 = 1;
                    if (personaje_1 == 1) {
                        defensa_jugador1 = defensa_jugador1 * 2;
                        vit_1 = vit_1 * 2;
                    }
                    if (personaje_1 == 2) {
                        ataque_jugador1 = ataque_jugador1 * 1.5;
                        vit_1 = vit_1 * 1.5;
                    }
                    if (personaje_1 == 3) {
                        ataque_jugador1 = ataque_jugador1 + 50;
                        defensa_jugador1 = defensa_jugador1 + 50;
                        velocidad_1 = velocidad_1 + 50;
                    }
                    if ((personaje_1 == 4) || (personaje_1 == 5)) {
                        if (especial_1 == 1) {
                            defensa_jugador1 = defensa_jugador1 * 2;
                            vit_1 = vit_1 * 2;
                        }
                        if (especial_1 == 2) {
                            ataque_jugador1 = ataque_jugador1 * 1.5;
                            vit_1 = vit_1 * 1.5;
                        }
                        if (especial_1 == 3) {
                            ataque_jugador1 = ataque_jugador1 + 50;
                            defensa_jugador1 = defensa_jugador1 + 50;
                            velocidad_1 = velocidad_1 + 50;
                        }
                    }
                }
                if ((accion_2 == 3) && (contador_especial_2 == 0)) {
                    contador_especial_2 = 1;
                    if (personaje_2 == 1) {
                        defensa_jugador2 = defensa_jugador2 * 2;
                        vit_2 = vit_2 * 2;
                    }
                    if (personaje_2 == 2) {
                        ataque_jugador2 = ataque_jugador2 * 1.5;
                        vit_2 = vit_2 * 1.5;
                    }
                    if (personaje_2 == 3) {
                        ataque_jugador2 = ataque_jugador2 + 50;
                        defensa_jugador2 = defensa_jugador2 + 50;
                        velocidad_2 = velocidad_2 + 50;
                    }
                    if ((personaje_2 == 4) || (personaje_2 == 5)) {
                        if (especial_2 == 1) {
                            defensa_jugador2 = defensa_jugador2 * 2;
                            vit_2 = vit_2 * 2;
                        }
                        if (especial_2 == 2) {
                            ataque_jugador2 = ataque_jugador2 * 1.5;
                            vit_2 = vit_2 * 1.5;
                        }
                        if (especial_2 == 3) {
                            ataque_jugador2 = ataque_jugador2 + 50;
                            defensa_jugador2 = defensa_jugador2 + 50;
                            velocidad_2 = velocidad_2 + 50;
                        }
                    }
                }
                if ((accion_1 == 1) && (accion_2 == 1) && (critico_1 >= 25)) {
                    vit_2 = vit_2 - (ataque_jugador1);
                    vit_1 = vit_1 - (ataque_jugador2);
                    System.out.println(name_1 + " golpea a " + name_2 + " con un golpe frontal, " + name_2 + " lo imita.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 1) && (accion_2 == 1) && (critico_1 <= 25)) {
                    vit_2 = vit_2 - (ataque_jugador1 * 2);
                    vit_1 = vit_1 - (ataque_jugador2);
                    System.out.println(name_1 + " golpea a " + name_2 + " con gran fiereza, dañando a " + name_2 + " severamente. " + name_2 + " intenta responder como puede, aunque sin tanto éxito.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 1) && (accion_2 == 2)) {
                    vit_2 = vit_2 - (ataque_jugador1 - (defensa_jugador2 / 2));
                    System.out.println(name_1 + " intenta golpear a " + name_2 + ", pero éste se defiende, mitigando el daño.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 1) && (accion_2 == 3) && (critico_1 >= 25)) {
                    vit_2 = vit_2 - (ataque_jugador1);
                    System.out.println(name_1 + " realiza un golpeo tremendo haciendo tambalear a " + name_2 + " e hiriéndolo de gravedad. " + name_2 + "realiza su habilidad especial buscando sorprender.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 1) && (accion_2 == 3) && (critico_1 <= 25)) {
                    vit_2 = vit_2 - ((ataque_jugador1) * 2);
                    System.out.println(name_1 + " realiza su ataque con tremenda fiereza, golpeando a " + name_2 + ", que cae al suelo e intenta sorprender a su rival con un su habilidad especial.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 1) && (accion_2 == 4) && (critico_1 >= 25)) {
                    vit_2 = vit_2 - (ataque_jugador1);
                    vit_2 = vit_2 + (Math.random() * 50);
                    System.out.println(name_1 + " golpe desde la cintura a " + name_2 + ", que, ante los daños, decide utilizar una poción de curación.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 1) && (accion_2 == 4) && (critico_1 <= 25)) {
                    vit_2 = vit_2 - ((ataque_jugador1) * 2);
                    vit_2 = vit_2 + (Math.random() * 50);
                    System.out.println(name_1 + " golpe desde la cintura a " + name_2 + " realizando un giro de 360º de gran fiereza, " + name_2 + " ante los enormes daños, decide utilizar una poción de curación.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 2) && (accion_2 == 1)) {
                    vit_1 = ataque_jugador2 - (defensa_jugador1 / 2);
                    System.out.println(name_1 + " se pone en guardia a la espera del ataque de " + name_2 + " mitigando gran parte del daño.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 2) && (accion_2 == 2)) {
                    System.out.println("Ambos se defienden, sin que ninguno se atreva a dar el primer paso.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 2) && (accion_2 == 3)) {
                    System.out.println(name_1 + " decide defenderse y " + name_2 + " aprovecha la situación para intentar su ataque especial.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 2) && (accion_2 == 4)) {
                    vit_2 = vit_2 + (Math.random() * 50);
                    System.out.println(name_1 + " decide defenderse y " + name_2 + " aprovecha la guardia del rival para sacar una poción y recuperarse.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 3) && (accion_2 == 1)) {
                    vit_1 = vit_1 - ataque_jugador2;
                    System.out.println(name_1 + " carga su ataque especial directo hacia " + name_2 + ", que responde con un golpe desde la cintura.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 3) && (accion_2 == 2)) {
                    System.out.println(name_1 + " carga su ataque especial directo hacia " + name_2 + ", que se lo espera e intenta protegerse.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 3) && (accion_2 == 3)) {
                    System.out.println("Ambos rivales realizan sendos ataques especiales generando una ráfaga de energía intercalada sin control.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 3) && (accion_2 == 4)) {
                    vit_2 = vit_2 + (Math.random() * 50);
                    System.out.println(name_1 + " carga su ataque especial, " + name_2 + ", ante la gran cantidad de daño que se le viene, decide utilizar una poción.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 4) && (accion_2 == 1)) {
                    vit_1 = vit_1 - ataque_jugador2;
                    vit_1 = vit_1 + (Math.random() * 50);
                    System.out.println(name_2 + " aprovecha para atacar mientras " + name_1 + " decide utilizar una poción.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 4) && (accion_2 == 2)) {
                    vit_1 = vit_1 + (Math.random() * 50);
                    System.out.println(name_2 + " decide cubrirse y " + name_1 + " aprovecha la situación para curarse.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 4) && (accion_2 == 3)) {
                    vit_1 = vit_1 + (Math.random() * 50);
                    System.out.println(name_2 + " utiliza su ataque especial, sorprendiendo a " + name_1 + " que decide curarse usando una poción por si las moscas.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                }
                if ((accion_1 == 4) && (accion_2 == 4)) {
                    vit_1 = vit_1 + (Math.random() * 50);
                    vit_2 = vit_2 + (Math.random() * 50);
                    System.out.println("Ambos oponentes se alejan el uno del otro y aprovechan para curarse.");
                    System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                    System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                }
            }
//Aquí termina este bloque de código, referente a qué ocurre si pega primero el jugador 1.

/* De aquí para abajo es el mismo código que justo arriba pero cambiando el orden de pelea, pega antes el
segundo jugador que el primero */
            if (primer_ataque_1 < primer_ataque_2) {
                System.out.println(name_2 + " ataca primero.");
                System.out.println(name_2 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                accion_2 = in.nextInt();
                if ((accion_2 == 3) && (contador_especial_2 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                System.out.println(name_1 + " elige qué hacer: atacar (1), defender (2), especial (3), curar (4)");
                System.out.println("NOTA: Escribe el numero reflejado entre paréntesis para hacer la acción " + "()");
                accion_1 = in.nextInt();
                if ((accion_1 == 3) && (contador_especial_1 == 1)) {
                    System.out.println("¡Ya has gastado la habilidad especial! Pierdes el turno.");
                }
                if ((accion_2 == 3) && (contador_especial_2 == 0)) {
                    contador_especial_2 = 1;
                    if (personaje_2 == 1) {
                        defensa_jugador2 = defensa_jugador2 * 2;
                        vit_2 = vit_2 * 2;
                    }
                    if (personaje_2 == 2) {
                        ataque_jugador2 = ataque_jugador2 * 1.5;
                        vit_2 = vit_2 * 1.5;
                    }
                    if (personaje_2 == 3) {
                        ataque_jugador2 = ataque_jugador2 + 50;
                        defensa_jugador2 = defensa_jugador2 + 50;
                        velocidad_2 = velocidad_2 + 50;
                    }
                    if ((personaje_2 == 4) || (personaje_2 == 5)) {
                        if (especial_2 == 1) {
                            defensa_jugador2 = defensa_jugador2 * 2;
                            vit_2 = vit_2 * 2;
                        }
                        if (especial_2 == 2) {
                            ataque_jugador2 = ataque_jugador2 * 1.5;
                            vit_2 = vit_2 * 1.5;
                        }
                        if (especial_2 == 3) {
                            ataque_jugador2 = ataque_jugador2 + 50;
                            defensa_jugador2 = defensa_jugador2 + 50;
                            velocidad_2 = velocidad_2 + 50;
                        }
                    }
                    if ((accion_1 == 3) && (contador_especial_1 == 0)) {
                        contador_especial_1 = 1;
                        if (personaje_1 == 1) {
                            defensa_jugador1 = defensa_jugador1 * 2;
                            vit_1 = vit_1 * 2;
                        }
                        if (personaje_1 == 2) {
                            ataque_jugador1 = ataque_jugador1 * 1.5;
                            vit_1 = vit_1 * 1.5;
                        }
                        if (personaje_1 == 3) {
                            ataque_jugador1 = ataque_jugador1 + 50;
                            defensa_jugador1 = defensa_jugador1 + 50;
                            velocidad_1 = velocidad_1 + 50;
                        }
                        if ((personaje_1 == 1) || (personaje_1 == 5)) {
                            if (especial_1 == 1) {
                                defensa_jugador1 = defensa_jugador1 * 2;
                                vit_1 = vit_1 * 2;
                            }
                            if (especial_1 == 2) {
                                ataque_jugador2 = ataque_jugador1 * 1.5;
                                vit_1 = vit_1 * 1.5;
                            }
                            if (especial_1 == 3) {
                                ataque_jugador1 = ataque_jugador1 + 50;
                                defensa_jugador1 = defensa_jugador1 + 50;
                                velocidad_1 = velocidad_1 + 50;
                            }
                        }
                    }
                    if ((accion_2 == 1) && (accion_1 == 1) && (critico_2 >= 25)) {
                        vit_1 = vit_1 - (ataque_jugador2);
                        vit_2 = vit_2 - (ataque_jugador1);
                        System.out.println(name_2 + " golpea a " + name_1 + " con un golpe frontal, " + name_1 + " lo imita.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 1) && (accion_1 == 1) && (critico_2 <= 25)) {
                        vit_1 = vit_1 - (ataque_jugador2 * 2);
                        vit_2 = vit_2 - (ataque_jugador1);
                        System.out.println(name_2 + " golpea a " + name_1 + " con gran fiereza, dañando a " + name_1 + " severamente. " + name_1 + " intenta responder como puede, aunque sin tanto éxito.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 1) && (accion_1 == 2)) {
                        vit_1 = vit_1 - (ataque_jugador2 - (defensa_jugador1 / 2));
                        System.out.println(name_2 + " intenta golpear a " + name_1 + ", pero éste se defiende, mitigando el daño.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 1) && (accion_1 == 3) && (critico_2 >= 25)) {
                        vit_1 = vit_1 - (ataque_jugador2);
                        System.out.println(name_2 + " realiza un golpeo tremendo haciendo tambalear a " + name_1 + " e hiriéndolo de gravedad. " + name_1 + "realiza su habilidad especial buscando una ventaja.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 1) && (accion_1 == 3) && (critico_2 <= 25)) {
                        vit_1 = vit_1 - ((ataque_jugador2) * 2);
                        System.out.println(name_2 + " realiza su ataque con tremenda fiereza, golpeando a " + name_1 + ", que cae al suelo e intenta sorprender cargando su habilidad especial.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 1) && (accion_1 == 4) && (critico_2 >= 25)) {
                        vit_1 = vit_1 - (ataque_jugador2);
                        vit_1 = vit_1 + (Math.random() * 50);
                        System.out.println(name_2 + " golpe desde la cintura a " + name_1 + ", que, ante los daños, decide utilizar una poción de curación.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 1) && (accion_1 == 4) && (critico_2 <= 25)) {
                        vit_1 = vit_1 - ((ataque_jugador2) * 2);
                        vit_1 = vit_1 + (Math.random() * 50);
                        System.out.println(name_2 + " golpe desde la cintura a " + name_1 + " realizando un giro de 360º de gran fiereza, " + name_1 + " ante los enormes daños, decide utilizar una poción de curación.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 2) && (accion_1 == 1)) {
                        vit_2 = ataque_jugador1 - (defensa_jugador2 / 2);
                        System.out.println(name_2 + " se pone en guardia a la espera del ataque de " + name_1 + " mitigando gran parte del daño.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 2) && (accion_1 == 2)) {
                        System.out.println("Ambos se defienden, sin que ninguno se atreva a dar el primer paso.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 2) && (accion_1 == 3)) {
                        System.out.println(name_2 + " decide defenderse y " + name_1 + " aprovecha la situación para intentar su ataque especial.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 2) && (accion_1 == 4)) {
                        vit_1 = vit_1 + (Math.random() * 50);
                        System.out.println(name_2 + " decide defenderse y " + name_1 + " aprovecha la guardia del rival para sacar una poción y recuperarse.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 3) && (accion_1 == 1)) {
                        vit_2 = vit_2 - ataque_jugador1;
                        System.out.println(name_2 + " carga su ataque especial, " + name_1 + " responde con un golpe desde la cintura.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 3) && (accion_1 == 2)) {
                        System.out.println(name_2 + " carga su ataque especial, " + name_1 + ", que se lo espera, intenta mitigar el daño cubriéndose.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 3) && (accion_1 == 3)) {
                        System.out.println("Ambos rivales realizan sendos ataques especiales generando una ráfaga de energía intercalada sin control.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 3) && (accion_1 == 4)) {
                        vit_1 = vit_1 + (Math.random() * 50);
                        System.out.println(name_2 + " carga su ataque especial, " + name_1 + ", ante la gran cantidad de daño que se le viene, decide utilizar una poción.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 4) && (accion_1 == 1)) {
                        vit_2 = vit_2 - ataque_jugador1;
                        vit_2 = vit_2 + (Math.random() * 50);
                        System.out.println(name_1 + " aprovecha para atacar mientras " + name_2 + " decide utilizar una poción.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 4) && (accion_1 == 2)) {
                        vit_2 = vit_2 + (Math.random() * 50);
                        System.out.println(name_1 + " decide cubrirse y " + name_2 + " aprovecha la situación para curarse.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 4) && (accion_1 == 3)) {
                        vit_2 = vit_2 + (Math.random() * 50);
                        System.out.println(name_1 + " carga su ataque especial, " + name_2 + " decide curarse usando una poción.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                    if ((accion_2 == 4) && (accion_1 == 4)) {
                        vit_2 = vit_2 + (Math.random() * 50);
                        vit_1 = vit_1 + (Math.random() * 50);
                        System.out.println("Ambos oponentes se alejan el uno del otro y aprovechan para curarse.");
                        System.out.println("A " + name_1 + " le quedan " + vit_1 + " de vida.");
                        System.out.println("A " + name_2 + " le quedan " + vit_2 + " de vida.");
                    }
                }
            }
            //Aquí termina este bloque de ataque si lo hace primero el jugador 2.

            //De aquí para abajo tenemos la representación gráfica de la vida de ambos jugadores.
            double porcentaje_vida_1 = 0, porcentaje_vida_2 = 0;
            int longitud_barra_vida_1 = 20;
            int guiones_quedan_1 = 0, guiones_quedan_2 = 0;
            int longitud_barra_vida_2 = 20;
            porcentaje_vida_1 = vit_1 / vit_maxima_1;
            porcentaje_vida_2 = vit_2 / vit_maxima_2;
            guiones_quedan_1 = (int) (porcentaje_vida_1 * longitud_barra_vida_1);
            guiones_quedan_2 = (int) (porcentaje_vida_2 * longitud_barra_vida_2);
            StringBuilder barra_vida_1 = new StringBuilder("[");
            for (int i = 0; i < longitud_barra_vida_1; i++) {
                if (i < guiones_quedan_1) {
                    barra_vida_1.append("-");
                } else {
                    barra_vida_1.append(" ");
                }
            }
            barra_vida_1.append("]");
            System.out.println("Barra de Vida de " + name_1 + ": " + barra_vida_1);

            StringBuilder barra_vida_2 = new StringBuilder("[");
            for (int i = 0; i < longitud_barra_vida_2; i++) {
                if (i < guiones_quedan_2) {
                    barra_vida_2.append("-");
                } else {
                    barra_vida_2.append(" ");
                }
            }
            barra_vida_2.append("]");
            System.out.println("Barra de Vida de " + name_2 + ": " + barra_vida_2);
            //Aquí termina la representación gráfica de la vida
        }

        //Aquí, un pequeño ASCII Art de victoria, según el vencedor.
        if ((vit_1 > vit_2) && (vit_2 == 0)) {
            System.out.println(name_1 + " ha vencido!");
            String asciiart =
"           ##                                                            ###                                                    ##\n  " +
"                                                                          ##                                                   ###\n  " +
"##   ##   ###     #####    #####     ####    ######            ######     ##      ####    ##  ##    ####    ######              ##\n  " +
"## # ##    ##     ##  ##   ##  ##   ##  ##    ##  ##            ##  ##    ##         ##   ##  ##   ##  ##    ##  ##             ##\n  " +
"#######    ##     ##  ##   ##  ##   ######    ##                ##  ##    ##      #####   ##  ##   ######    ##                 ##\n  " +
"#######    ##     ##  ##   ##  ##   ##        ##                #####     ##     ##  ##    #####   ##        ##                 ##\n  " +
" ## ##    ####    ##  ##   ##  ##    #####   ####               ##       ####     #####       ##    #####   ####              ######\n" +
"                                                               ####                        #####                                      ";
            System.out.println(asciiart);
        }
        if ((vit_1 < vit_2) && (vit_1 == 0)) {
            System.out.println(name_2 + " es el vencedor!");
            String asciiart =
"            ##                                                           ###                                                   ####\n  " +
"                                                                          ##                                                  ##  ##\n " +
"##   ##   ###     #####    #####     ####    ######            ######     ##      ####    ##  ##    ####    ######                ##\n  " +
"## # ##    ##     ##  ##   ##  ##   ##  ##    ##  ##            ##  ##    ##         ##   ##  ##   ##  ##    ##  ##             ###\n   " +
"#######    ##     ##  ##   ##  ##   ######    ##                ##  ##    ##      #####   ##  ##   ######    ##                ##\n     " +
"#######    ##     ##  ##   ##  ##   ##        ##                #####     ##     ##  ##    #####   ##        ##               ##  ##\n  " +
" ## ##    ####    ##  ##   ##  ##    #####   ####               ##       ####     #####       ##    #####   ####              ######\n  " +
"                                                               ####                        #####\n                                      ";
            System.out.println(asciiart);
        }
    }
}

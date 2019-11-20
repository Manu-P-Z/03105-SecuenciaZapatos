/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //constantes
        final String AN_1 = "Vaca";
        final String AN_2 = "Oveja";
        final String AN_3 = "Burro";
        final String AN_4 = "Gallina";

        final int NUM_VACAS = 3;
        final int NUM_OVEJAS = 14;
        final int NUM_BURROS = 2;
        final int NUM_GALLINAS = 18;

        final int PAT_VACAS = 4;
        final int PAT_OVEJAS = 4;
        final int PAT_BURROS = 4;
        final int PAT_GALLINAS = 2;

        //variables
        int patVaca;
        int patOvej;
        int patBurr;
        int patGall;
        int totPat;
        int totPar;

        //Operaciones
        patVaca = NUM_VACAS * PAT_VACAS;
        patOvej = NUM_OVEJAS * PAT_OVEJAS;
        patBurr = NUM_BURROS * PAT_BURROS;
        patGall = NUM_GALLINAS * PAT_GALLINAS;
        totPat = patBurr + patGall + patVaca + patOvej;
        totPar = totPat / 2;

        //Mensaje
        System.out.println("Secuencia de Patas");
        System.out.println("==================");
        System.out.printf("%s %s%n", "Animal .........:", AN_1);
        System.out.printf("%s %d%n", "Cantidad .......:", NUM_VACAS);
        System.out.printf("%s %d%n", "Patas ..........:", patVaca);
        System.out.println("---");
        System.out.printf("%s %s%n", "Animal .........:", AN_2);
        System.out.printf("%s %d%n", "Cantidad .......:", NUM_OVEJAS);
        System.out.printf("%s %d%n", "Patas ..........:", patOvej);
        System.out.println("---");
        System.out.printf("%s %s%n", "Animal .........:", AN_3);
        System.out.printf("%s %d%n", "Cantidad .......:", NUM_BURROS);
        System.out.printf("%s %d%n", "Patas ..........:", patBurr);
        System.out.println("---");
        System.out.printf("%s %s%n", "Animal .........:", AN_4);
        System.out.printf("%s %d%n", "Cantidad .......:", NUM_GALLINAS);
        System.out.printf("%s %d%n", "Patas ..........:", patGall);
        System.out.println("---");
        System.out.printf("%s %d%n", "Total de Patas .:", totPat);
        System.out.printf("%s %d%n", "Total de Pares .:", totPar);
    }
}

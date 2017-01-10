package com.ynov.arraysorter;

import java.util.Random;

public class ArraySorter {

    public static void main(String[] args) {
        // Initialisation de 2 tableaux d'entier
        int[] toSortArray;
        int[] sortedArray;

        // Tri bulle
        System.out.println("---- Bubble Sort ----");
        toSortArray = createRandomIntArray(10, 100);
        displayArray(toSortArray);
        sortedArray = bubbleSort(toSortArray);
        displayArray(sortedArray);

        // Tri sélection
        System.out.println("---- Selection Sort ----");
        toSortArray = createRandomIntArray(10, 100);
        displayArray(toSortArray);
        sortedArray = selectionSort(toSortArray);
        displayArray(sortedArray);

        // Tri insertion
        System.out.println("---- Insertion Sort ----");
        toSortArray = createRandomIntArray(10, 100);
        displayArray(toSortArray);
        sortedArray = insertionSort(toSortArray);
        displayArray(sortedArray);
    }

    /**
     * Tri un tableau d'entier en ordre croissant via l'algo bulle.
     *
     * @param array
     *            Tableau à trier.
     * @return Tableau trié.
     */
    static int[] bubbleSort(int[] array) {
        int size = array.length;

        for (int round = 1; round < size; round++) { // Compte le nombre de tour
            // La boucle interne devient de plus en plus petite
            for (int i = 0; i < size - round; i++) {
                if (array[i] > array[i+1]) {
                    // Echange dans le tableau final
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        return array;
    }

    /**
     * Tri un tableau d'entier en ordre croissant via l'algo Selection.
     *
     * @param array
     *            Tableau à trier.
     * @return Tableau trié.
     */
    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    /**
     * Tri un tableau d'entier en ordre croissant l'algo Insertion.
     *
     * @param array
     *            Tableau à trier.
     * @return Tableau trié.
     */
    static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int newValue = array[i];
            int j = i;

            while (j > 0 && array[j-1] > newValue) {
                array[j] = array[j-1];
                j--;
            }

            array[j] = newValue;
        }

        return array;
    }

    /**
     *  Créer un tableau d'une taille donnée contenant un ensemble de valeur aléatoire comprise entre 0 et la valeur maximum donnée.
     * @param size
     *            Taille du tableau à créer.
     * @param maxValue
     *            Valeur maximale contenue dans le tableau.
     * @return Tableau de nombres aléatoires.
     */
    static int[] createRandomIntArray(int size, int maxValue) {
        int[] randomValueArray = new int[size];

        // Génération des nombres aléatoires et placement dans le tableau
        for (int i = 0; i < size; i++) {
            Random randomGenerator = new Random();
            randomValueArray[i] = randomGenerator.nextInt(maxValue+1);
        }

        return randomValueArray;
    }

    /**
     * Affiche les valeurs d'un tableau.
     * @param array
     *            Tableau dont on veut afficher le contenu.
     */
    static void displayArray(int[] array) {
        // Itération de tableau
        // Pour chaque int présent dans "array"
        for (int i = 0; i < array.length; i++) {
            int numberToDisplay = array[i];
            System.out.print(numberToDisplay+" ");
        }

        // Saut de ligne
        System.out.print("\n"); // ou System.out.println("");
    }

}

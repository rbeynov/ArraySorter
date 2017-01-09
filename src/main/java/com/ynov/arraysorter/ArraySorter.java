package com.ynov.arraysorter;

public class ArraySorter {

    public static void main(String[] args) {
        // Initialisation de 2 tableaux d'entier
        int[] toSortArray = { 43, 80, 81, 49, 83, 20, 97, 82, 43, 40 };
        int[] sortedArray;

        // Tri bulle
        System.out.println("---- Bubble Sort ----");
        displayArray(toSortArray);
        sortedArray = bubbleSort(toSortArray);
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

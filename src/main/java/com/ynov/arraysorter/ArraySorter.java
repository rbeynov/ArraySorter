package com.ynov.arraysorter;

public class ArraySorter {

    public static void main(String[] args) {
        int[] toSortArray = { 43, 80, 81, 49, 83, 20, 97, 82, 43, 40 };

        displayArray(toSortArray);
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

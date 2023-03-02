import java.util.Arrays;

public class arrayPossui {
    public static boolean buscaElemento(int[] array, int elemento, int indice) {
        if (indice >= array.length) {
            return false;
        } else if (array[indice] == elemento) {
            return true;
        } else {
            return buscaElemento(array, elemento, indice + 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 9};
        int elemento = 9;
        boolean possui = buscaElemento(array, elemento, 0);
        System.out.println("Array: " + Arrays.toString(array) + "" + elemento + "\n" + possui);

        int[] array2 = {1, 2, 3, 4, 5, 6};
        int elemento2 = 9;
        boolean possui2 = buscaElemento(array2, elemento2, 0);
        System.out.println("Array: " + Arrays.toString(array2) + "" + elemento2 + "\n" + possui2);

    }

}
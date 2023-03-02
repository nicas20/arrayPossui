public class arrayPossui {
    public static boolean buscaElemento(int[] array, int elemento, int indice) {
        if (indice >= array.length) {
            return false;
        } else if (array[indice] == elemento) { // base case 2: element found
            return true;
        } else {
            return buscaElemento(array, elemento, indice + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elemento = 3;
        boolean found = buscaElemento(arr, elemento, 0);
        System.out.println(found);
    }

}
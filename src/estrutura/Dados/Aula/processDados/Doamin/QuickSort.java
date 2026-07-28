package estrutura.Dados.Aula.processDados.Doamin;

public class QuickSort {
    // Particiona o array e retorna o índice do pivô
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // escolhe o último elemento como pivô
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // troca arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // coloca o pivô na posição correta
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Função recursiva do QuickSort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // ordena recursivamente as duas metades
            quickSort(arr, low, pivotIndex - 1);  // lado esquerdo
            quickSort(arr, pivotIndex + 1, high); // lado direito
        }
    }

    static void main() {

        int[] arr = {60, 10, 65, 30, 15, 50};

        System.out.println("Antes da ordenação:");
        for (int n : arr) System.out.print(n + " ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nDepois da ordenação:");
        for (int n : arr) System.out.print(n + " ");
    }
}


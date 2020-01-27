public class CountingSort {
    void sort(char arr[]) {
        int n = arr.length;

        // A matriz de carácteres de saída que ordenou arr
        char output[] = new char[n];

        // Cria uma matriz de contagem para armazenar a contagem
        // dos aracteres e inicializa a matriz de contagem como 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;

        // Contagem de stores de cada personagem
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        // Alterar contagem [i] para que a contagem [i] agora contenha
        // a real posição desse caractere na matriz de saída
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];

        // Construa a matriz de caracteres de saída
        for (int i = 0; i < n; ++i) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        // Copia a matriz de saída para arr, para que arr agora
        // tenha caracteres classificados
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }

    public static void main(String args[]) {
        CountingSort ob = new CountingSort();
        char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'g', 'e', 'e', 'k', 's'};

        ob.sort(arr);

        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }
}

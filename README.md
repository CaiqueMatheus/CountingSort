# CountingSort

Counting sort é um algoritmo de ordenação estável cuja complexidade é O(n). As chaves podem tomar valores entre 0 e M-1. Se existirem k0 chaves com valor 0, então ocupam as primeiras k0 posições do vetor final: de 0 a k0-1.

A ideia básica do counting sort é determinar, para cada entrada x, o número de elementos menor que x. Essa informação pode ser usada para colocar o elemento x diretamente em sua posição no array de saída. Por exemplo, se há 17 elementos menores que x, então x pertence a posição 18. Esse esquema deve ser ligeiramente modificado quando houver vários elementos com o mesmo valor, uma vez que nós não queremos que sejam colocados na mesma posição.

Counting-Sort trabalha como uma contadora de ocorrências dentro de um programa, especificamente dentro de um vetor. Quando determinado vetor tem números repetidos, números únicos e números que não existem um outro vetor indica a quantidade de ocorrências.
Esta implementação tem a desvantagem de precisar de vectores auxiliares. O Counting Sort ordena exclusivamente números inteiros pelo fato de seus valores servirem como índices no vetor de contagem.

### Fontes:
[Wikipedia](https://pt.wikipedia.org/wiki/Counting_sort) |
[GeeksForGeeks](https://www.geeksforgeeks.org/counting-sort/)

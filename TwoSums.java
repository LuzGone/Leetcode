import java.util.HashMap;

public class TwoSums{
    public int[] twoSum(int[] numeros, int objetivo){
        int indicie1 = 0;
        int indicie2 = 0;
        for (int i=0; i<numeros.length;i++){
            for (int j=i+1; j<numeros.length;j++){
                int soma = numeros[i]+numeros[j];
                if(soma==objetivo){
                    indicie1 = i;
                    indicie2 = j;
                }
            }
        }
        int[] solucao = {indicie1,indicie2};
        return solucao;
    }

    public int[] twoSumHash(int[] numeros, int objetivo){
        HashMap<Integer,Integer> lista = new HashMap<>();
        for (int i=0; i<numeros.length;i++){
            int sobra = objetivo - numeros[i];
            if(lista.containsKey(sobra)){
                return new int[] {lista.get(sobra),i};
            }
            lista.put(numeros[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numlist = {0, 0, 3, 4, 0};
        int objetivo = 7;

        // 1. Instanciar a classe TwoSums
        TwoSums solver = new TwoSums();

        // 2. Chamar a função twoSum, passando a lista e o objetivo
        // int[] resultado = solver.twoSum(numlist, objetivo);
        int[] resultado = solver.twoSumHash(numlist, objetivo);


        // 3. Imprimir o resultado
        System.out.print("Os índices que somam o objetivo são: [");
        // Itera sobre o array de resultado
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
            if (i < resultado.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
};



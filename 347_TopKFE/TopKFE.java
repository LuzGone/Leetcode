import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFE {
    public int[] topKFE(int[]numeros,int k){
        int[] resposta = new int[k];
        HashMap<Integer,Integer> lista = new HashMap<>();
        for(int i : numeros){
            lista.put(i, lista.getOrDefault(i, 0)+1);
        }
        
        
        List<Integer> [] frequencia = new List[numeros.length+1];
        for(int i: lista.keySet()){
            int freq = lista.get(i);
            if (frequencia[freq] == null) {
                frequencia[freq] = new ArrayList<>();
            }
            frequencia[freq].add(i);
        }
        
        
        int n = 0;
        for (int i = frequencia.length-1; i>=0;i--){
            if(frequencia[i]!=null){
                for (int j : frequencia[i]){
                    resposta[n] = j;
                    n++;
                    if (n==k){
                        return resposta;
                    }
                }
            }
        }
        return resposta;
    }

    public static void main(String[] args) {
        int[] numeros = {1,1,1,2,2,2,3,4,1};
        int k = 2;
        TopKFE tkfe = new TopKFE();
        System.out.println(Arrays.toString(tkfe.topKFE(numeros, k)));
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDublicate(int[] numeros){
        HashMap<Integer,Integer> lista = new HashMap<>();
        for(int i = 0; i<numeros.length; i++){
            if(lista.containsKey(numeros[i])){
                return true;
            }
            lista.put(numeros[i],i);
        }
        return false;
    }

    public boolean containsDublicateSet(int[]numeros){
        Set<Integer> lista = new HashSet<Integer>();
        for(int i: numeros){
            if(!(lista.add(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDublicateSet(numeros));
    }
}

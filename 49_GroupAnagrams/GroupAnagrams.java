import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] anagramas){
        List<List<String>> lista = new ArrayList<>();
        HashMap<HashMap<Character,Integer>,List<String>> mapa = new HashMap<>();
        for(String i : anagramas){
            HashMap<Character,Integer> palavra = new HashMap<>();
            List<String> listinha = new ArrayList<>();
            for(Character j : i.toCharArray()){
                palavra.put(j, palavra.getOrDefault(j, 0)+1);
            }
            listinha = mapa.getOrDefault(palavra,listinha);
            listinha.add(i);
            mapa.put(palavra, listinha);
        }
        for(List<String> listaDeAnagramas: mapa.values()){
            lista.add(listaDeAnagramas);
        }
        return lista;
    }

    public List<List<String>> groupAnagrams2(String[] anagramas){
        HashMap<HashMap<Character,Integer>,List<String>> mapa = new HashMap<>();
        for(String i : anagramas){
            HashMap<Character,Integer> palavra = new HashMap<>();
            List<String> listinha = new ArrayList<>();
            for(Character j : i.toCharArray()){
                palavra.put(j, palavra.getOrDefault(j, 0)+1);
            }
            listinha = mapa.getOrDefault(palavra,listinha);
            listinha.add(i);
            mapa.put(palavra, listinha);
        }
        return new ArrayList<>(mapa.values());
    }

    public static void main(String[] args) {
        String[] anagramas = {"act","pots","tops","cat","stop","hat"};
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.groupAnagrams2(anagramas).toString());

    }
}

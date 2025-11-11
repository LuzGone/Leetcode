import java.util.ArrayList;
import java.util.HashMap;

public class ValidAnagram {
        public boolean validAnagram(String a, String b){
            if(a.length() != b.length()){
                return false;
            }
            ArrayList<Character> listaA = new ArrayList<>();
            ArrayList<Character> listaB = new ArrayList<>();
            for (int i = 0; i<a.length(); i++){
                listaA.add(a.charAt(i));
                listaB.add(b.charAt(i));
            }
            listaA.sort(null);
            listaB.sort(null);
            for(int i = 0; i<listaA.size();i++){
                if(listaA.get(i)!=listaB.get(i)){
                    return false;
                }
            }
            return true;
        }

        public boolean validAnagramHash(String a, String b){
            if(a.length() != b.length()){
                return false;
            }
            HashMap<Character,Integer> listaA = new HashMap<>();
            HashMap<Character,Integer> listaB = new HashMap<>();
            for (int i=0;i<a.length();i++){
                if(listaA.containsKey(a.charAt(i))){
                    listaA.replace(a.charAt(i),listaA.get(a.charAt(i))+1);
                }else{
                    listaA.put(a.charAt(i),0);
                }
                if(listaB.containsKey(b.charAt(i))){
                    listaB.replace(b.charAt(i),listaB.get(b.charAt(i))+1);
                }else{
                    listaB.put(b.charAt(i),0);
                }
            }
            return listaA.equals(listaB);
        }

        public static void main(String[] args) {
            ValidAnagram va = new ValidAnagram();
            String a = "batrrratar";
            String b = "tatarrrbar";
            System.out.println(va.validAnagramHash(a, b));
        }
    
}

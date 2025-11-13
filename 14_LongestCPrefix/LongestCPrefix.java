import java.util.HashMap;

public class LongestCPrefix {
    public String longestCPrefix(String[] palavras){
        if(palavras.length==1){
            return palavras[0];
        }
        if(palavras.length == 0){
            return "";
        }
        int iguais = 0;
        for (int i=0; i<palavras.length-1;i++){
            if(palavras[i] == "" || palavras[i+1]== ""){
                return "";
            }
            if(iguais==0){
                for(int j = 0; j<palavras[i].length()&&j<palavras[i+1].length();j++){
                    if(palavras[i].charAt(j)==palavras[i+1].charAt(j)){
                        iguais++;
                    }else{
                        if (j==0) {
                            return "";
                        }
                        break;
                    }
                }
            }else{
                for(int j = 0; j<iguais;j++){
                    if(palavras[i].charAt(j)!=palavras[i+1].charAt(j)){
                        iguais = j;
                        break;
                    }
                }
            }
            
        }
        return palavras[0].substring(0,iguais);
    }

    public String longestCPrefix2(String[] palavras){
        if(palavras.length==0){
            return "";
        }
        String saida = palavras[0];
        for(int i=1;i<palavras.length;i++){
            while(palavras[i].indexOf(saida)!=0){
                saida = saida.substring(0,saida.length()-1);
                if(saida.isEmpty()){
                    return "";
                }
            }
        }
        return saida;
    }

    public static void main(String[] args) {
        String[] palavras = {"carro","car"};
        LongestCPrefix lcp = new LongestCPrefix();
        System.out.println(lcp.longestCPrefix2(palavras));
        System.out.println(palavras[1].indexOf("ca"));
    }
}

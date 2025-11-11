public class RomanToInteger {
    public int romanToInteger(String numero){
        int total = 0;
        for(int i = 0; i<numero.length();i++){
            if(i == 0){
                if(numero.charAt(i) == 'I'){
                    total+=1;
                }
                if(numero.charAt(i) == 'V'){
                    total+=5;
                }
                if(numero.charAt(i) == 'X'){
                    total+=10;
                }
                if(numero.charAt(i) == 'L'){
                    total+=50;
                }
                if(numero.charAt(i) == 'C'){
                    total+=100;
                }
                if(numero.charAt(i) == 'D'){
                    total+=500;
                }
                if(numero.charAt(i) == 'M'){
                    total+=1000;
                }
            }else{
                if(numero.charAt(i) == 'I'){
                    total+=1;
                }
                if(numero.charAt(i) == 'V'){
                    if (numero.charAt(i-1) == 'I') {
                        total+=3;
                    }else{
                        total+=5;
                    }
                }
                if(numero.charAt(i) == 'X'){
                    if (numero.charAt(i-1) == 'I') {
                        total+=8;
                    }else{
                        total+=10;
                    }
                }
                if(numero.charAt(i) == 'L'){
                    if (numero.charAt(i-1) == 'X') {
                        total+=30;
                    }else{
                        total+=50;
                    }
                }
                if(numero.charAt(i) == 'C'){
                    if (numero.charAt(i-1) == 'X') {
                        total+=80;
                    }else{
                        total+=100;
                    }
                }
                if(numero.charAt(i) == 'D'){
                    if (numero.charAt(i-1) == 'C') {
                        total+=300;
                    }else{
                        total+=500;
                    }
                }
                if(numero.charAt(i) == 'M'){
                    if (numero.charAt(i-1) == 'C') {
                        total+=800;
                    }else{
                        total+=1000;
                    }
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String numero = "CMXCIX";
        RomanToInteger rti = new RomanToInteger();
        System.out.println(rti.romanToInteger(numero));
    }
}

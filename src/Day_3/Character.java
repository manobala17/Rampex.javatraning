package Day_3;

public class Character {
        public static void main(String[] args){
            char ch = 'A';

            if(ch > 'A' && ch < 'Z'){
                System.out.print("UPPERCASE");
            }else if(ch > 'a' && ch < 'z'){
                System.out.println("lowercase");
            }else if(ch > '0' && ch < '9'){
                System.out.println("Digit");
            }else{
                System.out.println("special character");


            }
        }
}

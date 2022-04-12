/** Основной класс */
public class Palindrome {

    /** Основной метод */
    public static void main(String[] args) {
        for(int i =0; i<args.length;i++){
            String s = args[i];
        }
    }

    /** Метод, позволяющий "перевернуть" слово */
    public static String revers(String s){

        String s1 ="";
        for(int i = s.length()-1; i >=0; i--){
            s1+=s.charAt(i);
        }
        return s1;
    }

    /** Метод, позволяющий порверить, является ли слово палиндромом */
    public static boolean isPalindrome(String s){
        String s1 = revers(s);
        return s.equals(s1);
    }
}
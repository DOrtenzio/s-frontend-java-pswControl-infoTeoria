import java.util.Scanner;

public class Psw2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire una password per verificare se è sicura:");
        System.out.println("Ricordati una password sicura:");
        System.out.println("-deve essere composta da un minimo di 12 caratteri;");
        System.out.println("-deve contenere almeno una lettera maiuscola e una minuscola;");
        System.out.println("-deve contenere almeno una cifra;");
        System.out.println("-deve contenere almeno un carattere speciale tipo #,&;%?^….");
        String psw=in.nextLine();
        if (psw.lastIndexOf(" ")!=-1)
            System.out.println("La password non può avere spazi!");
        else{
            if (isSicura(psw))
                System.out.println("La password è SICURA.");
            else
                System.out.println("La password NON E' SICURA.");
        }
    }
    public static boolean isSicura(String psw){
        if (psw.length()<12)
            return false;
        else {
            boolean isMaiuscola=false;
            boolean isMinuscola=false;
            for (int i=0;i<psw.length();i++){
                if (Character.isUpperCase(psw.charAt(i)))
                    isMaiuscola=true;
                if (Character.isLowerCase(psw.charAt(i)))
                    isMinuscola=true;
                if (isMaiuscola && isMinuscola)
                    break;
            }
            if (!isMinuscola || !isMaiuscola)
                return false;
            else {
                boolean isNumero=false;
                for (int i=0;i<psw.length();i++){
                    if (Character.isDigit(psw.charAt(i))){
                        isNumero=true;
                        break;
                    }
                }
                if (!isNumero)
                    return false;
                else{
                    boolean isSpeciale=false;
                    for (int i=0;i<psw.length();i++){
                        if (!Character.isLetterOrDigit(psw.charAt(i))){
                            isSpeciale=true;
                            break;
                        }
                    }
                    return isSpeciale;
                }
            }
        }
    }
}
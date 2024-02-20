import java.util.Scanner;

public class Psw2ConSwitch {
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
                switch (psw.charAt(i)){
                    case 'Q':
                    case 'W':
                    case 'E':
                    case 'R':
                    case 'T':
                    case 'Y':
                    case 'U':
                    case 'I':
                    case 'O':
                    case 'P':
                    case 'A':
                    case 'S':
                    case 'D':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'Z':
                    case 'X':
                    case 'C':
                    case 'V':
                    case 'B':
                    case 'N':
                    case 'M':
                        isMaiuscola=true;
                        break;
                }
                switch (psw.charAt(i)){
                    case 'q':
                    case 'w':
                    case 'e':
                    case 'r':
                    case 't':
                    case 'y':
                    case 'u':
                    case 'i':
                    case 'o':
                    case 'p':
                    case 'a':
                    case 's':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'z':
                    case 'x':
                    case 'c':
                    case 'v':
                    case 'b':
                    case 'n':
                    case 'm':
                        isMinuscola=true;
                        break;
                }
                if (isMaiuscola && isMinuscola)
                    break;
            }
            if (!isMinuscola || !isMaiuscola)
                return false;
            else {
                boolean isNumero=false;
                for (int i=0;i<psw.length();i++){
                    switch (psw.charAt(i)){
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            isNumero=true;
                            break;
                    }
                }
                if (!isNumero)
                    return false;
                else{
                    boolean isSpeciale=false;
                    for (int i=0;i<psw.length();i++){
                        switch (psw.charAt(i)){
                            case 'Q':
                            case 'W':
                            case 'E':
                            case 'R':
                            case 'T':
                            case 'Y':
                            case 'U':
                            case 'I':
                            case 'O':
                            case 'P':
                            case 'A':
                            case 'S':
                            case 'D':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'Z':
                            case 'X':
                            case 'C':
                            case 'V':
                            case 'B':
                            case 'N':
                            case 'M':
                            case 'q':
                            case 'w':
                            case 'e':
                            case 'r':
                            case 't':
                            case 'y':
                            case 'u':
                            case 'i':
                            case 'o':
                            case 'p':
                            case 'a':
                            case 's':
                            case 'd':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'z':
                            case 'x':
                            case 'c':
                            case 'v':
                            case 'b':
                            case 'n':
                            case 'm':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                isSpeciale=false;
                                break;
                            default:
                                isSpeciale=true;
                        }
                    }
                    return isSpeciale;
                }
            }
        }
    }
}
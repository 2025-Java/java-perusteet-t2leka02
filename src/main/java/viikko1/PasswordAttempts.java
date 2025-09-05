package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        // TODO
        /*4. Salasanayritykset (PasswordAttempts)
        Metodi public static String login(String[] tries) — oikea salasana on java123.
        Tarkista enintään kolme ensimmäistä yritystä.

        Palauta Tervetuloa! jos jokin niistä on oikein.
        Muuten Liian monta virheellistä yritystä. */
    
        /* 
        if(tries.length <= 3 && (tries[0] == "java123" || tries[1] == "java123" || tries[2] == "java123")){
        return "Tervetuloa!";
        }
        else if((tries.length <= 3 || tries.length > 0) && (tries[0] != "java123" || tries[1] != "java123" || tries[2] != "java123"))  {
            return "Liian monta virheellistä yritystä.";
        }
*/

        String correct = "java123";

        for(int i=0; i < tries.length && i < 3; i++){
            if(tries[i].equals(correct)){ 
                return "Tervetuloa!";
            }
            
        }
        return "Liian monta virheellistä yritystä.";


    
    }
}

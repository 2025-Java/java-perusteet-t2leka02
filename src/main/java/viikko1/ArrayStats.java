package viikko1;

/*5. Taulukon keskiarvo ja maksimi (ArrayStats)
public static double average(int[] arr) — palauta keskiarvo double-tyyppisenä, tyhjän taulukon tapauksessa 0.0.
public static int max(int[] arr) — palauta suurin arvo, tyhjän taulukon tapauksessa Integer.MIN_VALUE. */

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO

        double sum = 0;;


        if(arr.length > 0){
            for(double number : arr){
            sum = sum + number;
            }

            //Calculate avg with sum and length
            return sum / arr.length;
                        
        }
        else{
            return 0.0;
        }


    }




    public static int max(int[] arr) {
        // TODO
        if(arr.length == 0){
             return Integer.MIN_VALUE;  
        }

        //Taking first number in array to compare other numbers to
        int maxNumber = arr[0];

        //Looping through numbers in array, looking for highest number and storing it to maxNumber.
        
            for(int number : arr){
                if(maxNumber < number){
                    maxNumber = number;
                }
            }
            return maxNumber;
    }
}

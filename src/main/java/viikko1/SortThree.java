package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        // TODO

        //a is the smallest
        if(a<=b && a<=c){
            if(b>=c){
                //then a,c,b
                return a + "," + c + "," + b;
            }
            else{
                //a,b,c
                return a + "," + b + "," + c;
        }
        }

        //b is the smallest
        if(b<=a && b<=c){
            if(a>=c){
                //then b,c,a
                return b + "," + c + "," + a;
            }
            else{
                //b,a,c
                return b + "," + a + "," + c;
        }    
        }
        
        //c is the smallest
        if(c<=a && c<=b){
            if(a>=b){
                //then c,b,a
                return c + "," + b + "," + a;
            }
            else{
                //c,a,b
                return c + "," + a + "," + b;
        }
        }

    return null;
    }
}

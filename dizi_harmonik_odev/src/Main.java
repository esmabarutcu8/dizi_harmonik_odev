import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        int[]dizi={1,2,3,4,5};

        double harmonikSeri=0.0;
        /*
        for(int i=1;i<=dizi.length;i++){
            harmonikSeri+=1/i;
        }

         */
        double harmonikOrtalama=dizi.length/harmonikSeri;
        System.out.println("dizi:"+ Arrays.toString(dizi));
        System.out.println("harmonik ortalama:"+harmonikOrtalama);
    }
}

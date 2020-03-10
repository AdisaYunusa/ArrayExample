

package arrayexample;


public class ArrayExample {


    public static void main(String[] args) {
        
//        int []x = new int[5];
//        
//        x[0] = 34;
//        x[1] = 2;
//        x[2] = 7;
//        x[3] = 10;
//        x[4] = 5;
//        
//        System.out.println("Size of array" + " " + x.length);
//        System.out.println(x[3]);
//        
//        for (int i = 0; i < x.length; i++)
//        {
//            System.out.println("The value in position" + " " + i + " " + "is" + " " + x[i]);
//            System.out.printf("The value in position %d is %d%n",i,x[i]);
//        }
        
        int []ary = {23,3,5,56,7};
        
        for(int num : ary)
        {
            System.out.println(num);
        }
    }
    
}

public class rec{

    // print number from one to n  
    private static int recursion_1_n(int value)
    {
        
        if(value==1)
        {
            System.err.println(value);        // base case return after value ==1 
            return 1;
        }
        int sum=recursion_1_n(value-1)+1;    // i store and print value 

        System.out.println(sum);

        return sum;                        // return the previous function call in recursion 

    }

    // print the number from n to 1 
    private static int recursion_n_1(int value)
    {
        if(value==1){
            System.out.println(value);      // print the value while recursion , before function call return 
            return 0;
        }
        System.err.println(value);
        return recursion_n_1(value-1);  // to go next value 
    }

    //print the sum of n number 
    private static int sum_of_n(int value)
    {
        if(value==1)
        {
            return 1;
        }
        return sum_of_n(value-1)+value;  // return value with currect value 
    }

    private static int fact(int value)
    {
        if(value==1)
        {
            return 1;
        }
        return value*fact(value-1);   //factorial
    } 

    // print the power with recursion 
    private static int power(int value,int power){
        if(power==1){
            return value;
        }
        return value*power(value,power-1);   //power
    }
 // 2 power 3 2x2x2   
    private static int fib(int value)
    {
        if(value==1 || value==0)
        {
            return 1;
        }
        return fib(value-1)+fib(value-2);    //fib series
    }

//     2   1
//     1   1(return)
//     1(return) 


    public static void main(String [] args)
    {
        //recursion_1_n(10);
        //recursion_n_1(10);
        //int sum=sum_of_n(4);
        //System.out.println(sum);
        //int result=fact(4);
        //System.out.println(result);
        //int pow=power(2, 4);
        //System.out.println(pow);
        System.out.println(fib(4));

    }
}

//    3 2 1
//    2  1+ 1 0
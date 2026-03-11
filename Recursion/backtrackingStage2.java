package Recursion;
// for backage i need to run like this 
/// javac Recursion/Filename.java (for compile) and (to run) java Recursion.Filename

import java.util.*; 
 
/// print all the sub arrays in array
/// i make a detail tracking in the paper 
public class backtrackingStage2  {

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(0, arr, temp, result);
        return result;
    }

    private static void backtrack(int index, int[] arr, List<Integer> temp, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(temp));  // copy current subset
            return;
        }

        // Include element
        temp.add(arr[index]);
        backtrack(index + 1, arr, temp, result);

        // Exclude element
        temp.remove(temp.size() - 1); // undo
        backtrack(index + 1, arr, temp, result);
    }


    /// all sub sequence in string 
    /// its all same like a sub array but collections use in the program in changed
    public static List<String> subsequences(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        backtrack(0, s, temp, result);
        return result;
    }

    private static void backtrack(int index, String s, StringBuilder temp, List<String> result) {
        if (index == s.length()) {
            result.add(temp.toString());
            return;
        }

        // Include character
        temp.append(s.charAt(index));
        backtrack(index + 1, s, temp, result);

        // Exclude character
        temp.deleteCharAt(temp.length() - 1);
        backtrack(index + 1, s, temp, result);
    }
   


    // ITS ARRAY 
    /// its a permutation 
    /// its wonderfull man! hooo     balance
    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, arr, result);
        return result;
    }

    private static void backtrack(int index, int[] arr, List<List<Integer>> result) {
        if (index == arr.length) {
            // convert int[] to List<Integer>
            List<Integer> list = new ArrayList<>();
            for (int x : arr) list.add(x);
            result.add(list);
            return;
        }

        for (int j = index; j < arr.length; j++) {
            swap(arr, index, j);
            backtrack(index + 1, arr, result);
            swap(arr, index, j); // undo
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }


    // ITS STRING
    static void stringPermute(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            char currect=str.charAt(i);
            
            String remaining= str.substring(0,i)+str.substring(i+1);
            stringPermute(remaining,result+currect);
        }
    }
/* 
    permute("san","")
│
├── choose 's'
│   permute("an","s")
│   │
│   ├── choose 'a'
│   │   permute("n","sa")
│   │   │
│   │   └── choose 'n'
│   │       permute("","san")
│   │       → PRINT san
│   │
│   └── choose 'n'
│       permute("a","sn")
│       │
│       └── choose 'a'
│           permute("","sna")
│           → PRINT sna
│
├── choose 'a'
│   permute("sn","a")
│   │
│   ├── choose 's'
│   │   permute("n","as")
│   │   │
│   │   └── choose 'n'
│   │       permute("","asn")
│   │       → PRINT asn
│   │
│   └── choose 'n'
│       permute("s","an")
│       │
│       └── choose 's'
│           permute("","ans")
│           → PRINT ans
│
└── choose 'n'
    permute("sa","n")
    │
    ├── choose 's'
    │   permute("a","ns")
    │   │
    │   └── choose 'a'
    │       permute("","nsa")
    │       → PRINT nsa
    │
    └── choose 'a'
        permute("s","na")
        │
        └── choose 's'
            permute("","nas")
            → PRINT nas   */

    public static void main(String[] args) {
        //System.out.println(subsets(new int[]{1, 2, 3}));
        //System.out.println(subsequences("san"));
        //System.out.println(permute(new int[]{1,2,3}));
        stringPermute("sankar", " ");
    }

}


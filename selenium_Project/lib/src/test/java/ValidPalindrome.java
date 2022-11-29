import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.checkerframework.common.value.qual.IntVal;

// import java.util.ArrayList;

// class Practice {
//     public void findDuplicate(int[] arr){
//        ArrayList<Integer> a1 = new ArrayList<Integer>();
//        ArrayList<Integer> a2 = new ArrayList<Integer>();
//          for (int i = 0; i < arr.length; i++) {
//             boolean flag=false;
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[i] == arr[j] && i!=j) {
//                    a1.add(arr[i]);
//                    i++;
//                    flag= true;
//                 }
                
//             }
//             if(!flag){
//                 a2.add(arr[i]);
//             }
//         }
//         System.out.println("a1:-"+ a1);
//         System.out.println("a2:-"+ a2);
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//          int a[]= {1,2,2,3,4,4,5,5,6,7};
//          Practice h= new Practice();
//          h.findDuplicate(a);
//     }
// }


// import java.util.*;


// class RotateArray{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         ArrayList<Integer> numbers = new ArrayList<>();

//         for(int i=0;i<n;i++){
//             numbers.add(sc.nextInt());
//         }
//         ArrayList<Integer> ans = rotateArray(numbers,k);
//         for(Integer x:ans){
//             System.out.print(x+" ");
//         }
//     }

//     static ArrayList<Integer> rotateArray(ArrayList<Integer> numbers,int k){
//      if (numbers.size() == 0){
//         return numbers;
//      }
//     Integer element = null;
//     for(int i = 0; i <= k; i++)
//     {
//         // remove last element, add it to front of the ArrayList
//         element = numbers.remove( i );
//         System.out.println(element);
//         numbers.add(element);
//     }

//     return numbers;
//     }
// }


// import java.io.*;
// import java.util.*;

// public class LongestCommonPrefix {
//     public String longestCommonPrefix(String[] strs) {
//          String s="";
//         // String[] str = null;
//         // str= strs.split(" ");
//         System.out.println(strs);
//     return s;
//     }

//     public static void main(String[] args) throws IOException {
//         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//         String[] strings = in.readLine().split(" ");
//         String prefixString = new LongestCommonPrefix().longestCommonPrefix(strings);
//         System.out.print(prefixString);
//     }
// }

// class HelloWorld {
// public static void main(String[] args){
//     String st="Good looking";
//     String s=st.replaceAll("\\s","").toLowerCase();
//     System.out.println(s);
//     Map<Character, Integer> mapset =new HashMap<>();
//     for(Character c:s.toCharArray()){
//         if(mapset.containsKey(c)){
//             mapset.put(c, mapset.get(c)+1);
//         }
//         else{
//             mapset.put(c, 1);
//         }
//     }
//     System.out.println(mapset);
// }
// }

// class ReplaceVowel{ 
// 	public static void main(String []args){ 
		
// 		String st= "Photon Info Tech"; 
// 		String str = st.toLowerCase(); 
//         String s=str.replaceAll("[a]","1").
//         replaceAll("[e]","2").
//         replaceAll("[i]","3").
//         replaceAll("[o]","4").
//         replaceAll("[u]","5");
//         System.out.println( s );
// 	} 
// } 



// class fibbonaci {
  
//     // Function to print N Fibonacci Number
//     static void Fibonacci(int N)
//     {
//         int num1 = 0, num2 = 1;
  
//         int counter = 0;
  
//         // Iterate till counter is N
//         while (counter < N) {
  
//             // Print the number
//             System.out.print(num1 + " ");
  
//             // Swap
//             int num3 = num2 + num1;
//             num1 = num2;
//             num2 = num3;
//             counter = counter + 1;
//         }
//     }
  
//     // Driver Code
//     public static void main(String args[])
//     {
//         // Given Number N
//         int N = 10;
  
//         // Function Call
//         Fibonacci(N);
//     }
// }


// class fibbonaci {
   
//     public static void upperLower(String s)
//          {
//             int upperLetter=0;
//             int lowerLetter=0;
//             for(int i=0;i<s.length();i++){
//                 char c=s.charAt(i);
//                 if(Character.isUpperCase(c)){
//                      upperLetter++; 
//                 }
//                 else{
//                      lowerLetter++;
//                 }
//             }
//             System.out.println("upperLetter count "+ upperLetter); 
//             System.out.println("lowerLetter count "+ lowerLetter);
//         }      
//          public static void main(String args[]){
//              upperLower("Priya SonaWane");
           
//                 }
// }


// 

// class Loop {
//     public static void main(String args[]){
//         for(int i=1;i<=10;i++){
//             System.out.println(i);
//         }
//     }
// }

// class Loop {
//     public static void main(String args[]){
//         String c="iye";
//         HashSet<Character> setB= new HashSet<>();
//         for(int i=0;i<c.length();i++){
//             setB.add(c.charAt(i));
//         }
//         String[] a={"hi","bye","bebe"};
//        ArrayList<HashSet> list =new ArrayList<>();
//        ArrayList<Integer> result= new ArrayList<>();
//        for(int i=0; i<a.length;i++){
//         HashSet<Character> set= new HashSet<>();
//         for(int j=0;j<a[i].length();j++){
//            if(!(a[i].charAt(j)==' ')){
//             set.add(a[i].charAt(j));
//            }
//         }
//         list.add(set);
//        }
//        int count=0;
//        System.out.println(list);
//        for(HashSet i:list){
       
//         Iterator<Character> itr= setB.iterator();
//         while(itr.hasNext()){
//             if(i.contains(itr.next())){
//             count++;
//             }
//            }
        
//         result.add(count);
//        }
//        int[] res= result.stream()
//        .mapToInt(Integer::intValue)
//        .toArray();
//        System.out.println(res);

//     }
// }

// class Loop {
//          public static void main(String args[]){
//           int[] num ={12, 65, 5, 72, 19, 72};
//           ArrayList<Integer> ar=new ArrayList<>(); 
//           ArrayList<Integer> arr=new ArrayList<>();
//           for (int i=0;i<num.length;i++){
//               if(i%2==0 ){
//                   arr.add(num[i]);
//               }
//           }
//           System.out.println(arr);

//           for(int i=0;i<arr.size()-1;i++){
//             if(arr.get(i)<arr.get(i+1)){
//                 Integer temp=1;
//                 ar.add(temp);
//                 System.out.println(ar);
//             }
//             else if(arr.get(i)>arr.get(i+1)){
//                // Integer temp=2;
//                 ar.add(2);
//                 System.out.println(ar);
//             }
//             else{
//                // Integer temp=0;
//                 ar.add(0);
//                 System.out.println(ar);
//             }
//           }
//           System.out.println(ar);
//           if(ar.stream().allMatch(ar.get(0)::equals)){
//             if(ar.get(0)==1){
//             System.out.println("increase");
//             }
//           else{
//             System.out.println("decrease");
//           }
//         }
//         else{
//             System.out.println("none");
//         }
//         }
//      }

public class ValidPalindrome{
     public String isPalindrome(String s) {
        String str=s.trim();
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
       
        if(s.equals(rev)){
            return "true";
        }else{
            return "false";
        }
    }

    public static void main(String[] args) {
        String line = "aba aba";
        String result = new ValidPalindrome().isPalindrome(line);
        System.out.print(result);
    }
}
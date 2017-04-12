/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingtest;
import java.util.*;

/**
 *
 * @author Harnoor
 */
public class CodingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);//Open a scanner
        
        in.useDelimiter(System.getProperty("line.separator"));
        ArrayList<MyPair> list1 = new ArrayList<MyPair>();
        // Storing the pairs in an arraylist
        String input = in.nextLine();
        String[] numbers = input.split(" ");
        int W= Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);
        while (in.hasNextLine()){
            String input1=in.nextLine();
            if(input1.equals("quit")){
                break;
            }
            String[] numbers1 = input.split(" ");
            MyPair mypair = new MyPair(Integer.parseInt(numbers[0]),Integer.parseInt(numbers[1]));
            list1.add(mypair);
            //generate the list from console input
             }
       
        System.out.println(istrue(list1,W,B));
        
    }
    public static boolean istrue(ArrayList<MyPair> result, int B, int W){
        
        for (int i=0;i<result.size();i++){
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            // Creating a Hashmap for every value of t//
            
            MyPair a = result.get(i);
            // I am iterating over all t's 
            int t = a.y;
            int j=t;
            while (j+W<=result.size()){
                MyPair b = result.get(j);
                if(map.containsValue(b.x)){
                    // If hashmap already has that value, increment its count by 1
                    map.put(b.x,map.get(b.y)+1);
                }
                else {
                    map.put(b.x,1);
                    // if not put it there//
                }
                j += b.y;
            }
                for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                    // Check if any a occurs more than B times in the 
                    if(entry.getKey()>=B){
                        return true;
                    }
                }
            /*while(j<i+W){
             MyPair a = result.get(j);
             if (map.containsValue(a.x)){
                 map.put(), j)
             }
             map.put(a.x,a.y);
             j++;*/
        
            
        }
        return false;
        
    }
}
class MyPair {
    
  // class for the list of tuples
  final int x;
  final int y;
  MyPair(int x, int y) {this.x=x;this.y=y;}
  
}
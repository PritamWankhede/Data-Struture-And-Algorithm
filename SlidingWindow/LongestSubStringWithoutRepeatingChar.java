import java.util.*; 
public class LongestSubStringWithoutRepeatingChar {
  //brute force
    // public static boolean repeatingChar(String str , int start, int end){
    //     boolean[] ch = new boolean[256];
        
    //     for(int i=start;i<=end;i++){
    //       if(ch[str.charAt(i)]){
    //           return false;
    //       }   
    //       ch[str.charAt(i)] = true;
    //     }
    //   return true;
    // }
    
    // public static int lengthOfSubString(String str){
    //     int maxLen =0;
    //     for(int i=0;i<str.length();i++){
    //         for(int j=i+1;j<str.length();j++){
    //             if(repeatingChar(str, i , j)){
    //                 maxLen = Math.max(maxLen,j-i+1);
    //             }
    //         }
    //     }
    //     return maxLen;
    // }
    
    
    public static int lengthOfSubString(String str){
      Map<Character,Integer> map = new HashMap<>();
      int i=0;
      int maxLen = 0;
      
      for(int j=0;j<str.length();j++){
        char ch = str.charAt(j);
         
         if(map.containsKey(ch) && map.get(ch) >= i){
           i = map.get(ch) + 1;  
         }     
         
          map.put(ch, j);
          
          maxLen = Math.max(maxLen, j - i + 1);
      }
        return maxLen;
    }
    
	public static void main(String[] args) {
	    String str = "abcbcdddddmncxerhh";
		System.out.println(lengthOfSubString(str));
	}
}
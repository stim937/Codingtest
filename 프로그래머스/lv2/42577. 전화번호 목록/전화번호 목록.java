
import java.util.Arrays;
class Solution {
    static public boolean solution(String[] phoneBook) {
       Arrays.sort(phoneBook);

       for(int i=0; i<phoneBook.length-1;i++)
       {
           if(phoneBook[i+1].startsWith(phoneBook[i])) {return false;}
       }
       return true;
    }
}
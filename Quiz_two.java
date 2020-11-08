public class Quiz_two {

    public static void main(String[] args) {
        String str = "Lorem at";
        String s=" Tempor ip";

        transform(s);
        transform(str);
        System.out.println(transform(s)); // Change s to str for viewing the output of second testcase str
        System.out.println(transform(str));
    }

    public static String transform(String s){
        
        /* This function takes in a stirng (in groups of four) and  transforming (revesring) it  */

        char[] arr = new char[s.length()];  // Now lets initialize the string
        int n=s.length();
        for(int i=0;i<n;i++){
            arr[i] = s.charAt(i);  // Strings to character conversion 
        }
        int aray_size = arr.length;  
        int group = 4; 

        int i,leftChar,rightChar;
        char temp; // Temporary storage of char in array

        for(i=0; i<aray_size; i+=group){
            leftChar =i;
            rightChar = Math.min(i+group-1,aray_size-1);  //  Lets get the minimum size of char in the right

            while(leftChar < rightChar) { 

                temp = arr[leftChar]; // storing the left character in a temporary memory
                arr[leftChar] = arr[rightChar]; // leftChar becomes a char at position rightChar in arr[]
                arr[rightChar] = temp; // Right character is stored in  the temporary memory
                leftChar+=1;
                rightChar-=1; 
            }
        }
        String str = String.valueOf(arr); //  character convertion to a string 
        return(str);  // returns str (our desired string)

    }
}



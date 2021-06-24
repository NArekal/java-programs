public class CountingDuplicates {

    public static int duplicateCount(String text){
        String textLower = text.toLowerCase();
        char[] charArray = textLower.toCharArray();
        String uniqueRepeats = "";
        int count = 0;
         for(int i=0;i<charArray.length - 1;i++){
             String restOfString = textLower.substring(i+1);

             //convert single char to String to be used in method.
            String character = Character.toString(charArray[i]);

            //If not in uniquerepeats, check if it is repeat.
            if(!uniqueRepeats.contains(character)){
                if(restOfString.indexOf(character)!=-1){
                    //If it is a repeat , increase count and concat it to uniqueRepeats
                    count++;
                    uniqueRepeats+=character;
                }
            }
         }

         return count;
        }
}
    


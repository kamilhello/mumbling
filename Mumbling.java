public class Mumbling {
    public static String accum(String text){
        int length = text.length();
        String result = "";

        for(int i=0;i<length;i++)
            {
                    result += (text.charAt(i) + "").toUpperCase();

                    for(int j=0;j<i;j++){
                        result += (text.charAt(i) + "").toLowerCase();
                    }

                    if(i != length - 1){
                        result += "-";
                    }
            }

        return result;
    }
}
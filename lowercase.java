public class lowercase {
    public static void main(String[] args) {  
        String str = args[0];
		System.out.println(str);
		String strL = lowerCase(str);
		System.out.println(strL);
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
		int len = s.length();
		String newStr = "";
		
		for (int i = 0; i<len; i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				newStr = newStr + (char)(s.charAt(i)+32);
			}
			else
			{
				newStr = newStr + s.charAt(i);
			}
		}
        return newStr;
    }
}

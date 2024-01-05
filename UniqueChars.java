public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
		int len = s.length();
		String newStr = "";
		
		for (int i = 0; i<len; i++)
		{
			if (s.charAt(i) == 32)
			{
				newStr += (char)(s.charAt(i));
			}
			else if ((newStr.indexOf(s.charAt(i))) == -1)
			{
				newStr += (char)(s.charAt(i));

			}

		}
        return newStr;
    }
}

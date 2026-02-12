class concat{
   public static void main(String[] args){
    String s1="HELLO";
    s1=s1.concat("World");
    System.out.println(s1);
   }}

   class spcl{
   public static void main(String[] args){
    String txt="We are the so-called \"Vikings\" from the north.";
    System.out.println(txt);
   }
   }

   class Palindrome {
    // Approach 1: Two-pointer technique (Memory efficient)
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach 2: Reverse string technique (Clean code)
    public static boolean isPalindromeRev(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {
        // Use curly braces {} for array initialization
        String[] testCases = {"malayalam", "madam", "noon", "java"};

        System.out.println("=== Palindrome Check ===");
        for (String test : testCases) {
            // Added missing + and spaces for readability
            System.out.println(test + " is palindrome: " + isPalindrome(test));
        }
    }
}
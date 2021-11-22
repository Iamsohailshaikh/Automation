class Main {
public static void main(String[] args) {
    String s = "Sohail Shaikh";
    String alphabetS = "abcdefghijklmnopqrstuvwxyz";
    StringBuilder sb = new StringBuilder(s);


    for (int i = 0,relativePosition=0; i < s.length(); i++,relativePosition++) {
      
    	char currChar = s.charAt(i);

        if(currChar == ' '){relativePosition=-1;continue;}

        int idx = alphabetS.indexOf(currChar);
        if (idx != -1)
            if (relativePosition % 2 == 1)
                sb.setCharAt(i, 'c');
    }
    System.out.println(sb);
}
}
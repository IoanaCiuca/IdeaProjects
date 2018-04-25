public class CompareLetters {

    public String containsSameLetter(String s1, String s2) {
        int i=0;
        boolean sameLetter = false;
        while(i<s1.length()) {
            for(int j=0;j<s2.length();j++) {
                if(s1.charAt(i) == s2.charAt(j)) {
                    sameLetter = true;
                    break;
                } else {
                    sameLetter = false;
                }
            }
            if(sameLetter == false)
                break;
            i++;
        }

        if(sameLetter)
            return "Da";
        return "Nu";
    }
}

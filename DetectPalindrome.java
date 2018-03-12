class DetectPalindrome implements CheckStrategy{
    @Override
    public boolean check(String s){
        if(s.length() == 0 || s == null){
            return false;
        }
        int l = s.length();
        for(int i = 0; i < l/2; i++){
            if(s.charAt(i) != s.charAt(l-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        DetectPalindrome d = new DetectPalindrome();
        d.go();
    }
    
    void go(){
        String s1 = "star";
        String s2 = "oidio";
        System.out.println(check(s1));
        System.out.println(check(s2));
    }
}
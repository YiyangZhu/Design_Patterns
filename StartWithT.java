class StartWithT implements CheckStrategy{
    @Override
    public boolean check(String s){
        if(s.length() == 0 || s == null){
            return false;
        }
        boolean result = s.charAt(0) == 't' || s.charAt(0) == 'T';
        return result;
    }
}
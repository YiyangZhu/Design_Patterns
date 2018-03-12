class LongerThanFive implements CheckStrategy{
    @Override
    public boolean check(String s){
        if(s.length() == 0 || s == null){
            return false;
        }
        boolean result = (s.length() >= 5);
        return result;
    }
}
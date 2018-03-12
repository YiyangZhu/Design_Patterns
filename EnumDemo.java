class EnumDemo{
    
    public void test(){
        print(Grade.A);
        print(Grade.B);
        print(Grade.C);
        print(Grade.D);
        print(Grade.F);
    }
    
    public static void main(String[] args){
        EnumDemo e = new EnumDemo(); 
        e.test(); 
    }
    
    public void print(Grade g){ //Grade: A B C D F
        String value = g.getValue();
        System.out.println(value);
    }
}
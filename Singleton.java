class Singleton{
    private static Singleton instance = null;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public static void main(String[] args){
        Singleton s = new Singleton();
        Singleton s2 = new Singleton();
        System.out.println(s.getInstance());
        System.out.println(s2.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
        
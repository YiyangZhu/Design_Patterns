class Spear implements WeaponStrategy{
    private String name = "Spear";
    private String type = "stab";
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public String getType(){
        return type;
    }
    
    @Override
    public int attack(){
        int r = (int)(Math.random()*11+20);
        return r;
    }
}
    
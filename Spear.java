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
        return 10;
    }
}
    
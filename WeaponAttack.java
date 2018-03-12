class WeaponAttack implements WeaponStrategy{
    private String name = "weapon";
    private String type = "undecided";
    
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
        return 0;
    }
}
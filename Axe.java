class Axe implements WeaponStrategy{
    private String name = "Axe";
    private String type = "slash";
    
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
        int r = (int)(Math.random()*51);
        return r;
    }
}
    
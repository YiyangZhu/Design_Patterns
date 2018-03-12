class Mace implements WeaponStrategy{
    private String name = "Mace";
    private String type = "crush";
    
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
        int r = (int)(Math.random()*31+10);
        return r;
    }
}
    
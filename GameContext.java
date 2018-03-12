class GameContext{
    WeaponStrategy strategy;
    
    GameContext(){
        this.strategy = new WeaponAttack();
    }
    
    void changeStrategy(WeaponStrategy strategy){
        this.strategy = strategy;
    }
    
    void weaponAttack(){
        System.out.println("Character decides to use: "+strategy.getName());
        System.out.println("The attack type is: "+strategy.getType());
        System.out.println("Damage is:"+strategy.attack());
    }
}
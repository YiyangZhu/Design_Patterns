import java.util.Scanner;

class StrategyPattern{
    public static void main(String[] args){
        GameContext context = new GameContext();
        int hP = 100;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Do you want to use weapon? yes-1, no-2");
        int i = sc.nextInt();
        if(i == 2){
            return;
        } else if (i > 2 || i < 1){
            System.out.println("Invalid data!");
            return;
        }
        System.out.println("Default(WeaponAttack):");
        context.weaponAttack();
        System.out.println("current HP is: "+hP);
        
        while(hP > 0){
            System.out.println("Axe-1, Mace-2, Spear-3, Exit-0");
            i = sc.nextInt();
            if(i == 0){
                System.exit(0);
            } else if (i == 1){
                System.out.println("Use Axe:");
                context.changeStrategy(new Axe());
                context.weaponAttack();
                hP -= 5;
            } else if (i == 2){
                System.out.println("Use Mace:");
                context.changeStrategy(new Mace());
                context.weaponAttack();
                hP -= 15;
            } else if (i == 3){
                System.out.println("Use Spear:");
                context.changeStrategy(new Spear());
                context.weaponAttack();
                hP -= 10;
            } else {
                System.out.println("Invalid data!");
            }
            if(hP > 0){
                System.out.println("current HP is: "+hP);
            }
        }
        hP = 0;
        System.out.println("current HP is: "+hP);
        System.out.println("You win!");
    }
    
}
import java.util.List;

abstract class PizzaFactory{
    static Pizza createPizza(String name){
        int pizzaType = getPizzaType(name);
        switch(pizzaType){
            case 0:
                return new SteakPizza();
            case 1:
                return new HawaiianPizza();
            case 2:
                return new ChickenPizza();
            default:
                return null;
        }
    }
    
    static Pizza createPizza(String name, List<String> toppings,List<String> dressing) {
        return null;
    }
    
    static int getPizzaType(String s){
        switch(s){
            case "Philly Cheese Steak":
                return 0;
            case "Honolulu Hawaiian":
                return 1;
            case "Buffalo Chicken":
                return 2;
            default:
                return -1;
        }
    }
}
        
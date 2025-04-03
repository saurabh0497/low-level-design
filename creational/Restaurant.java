package creational;

public abstract class Restaurant {
    public abstract Burger createBurger();
    private Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
}
interface Burger {
    void prepare();
}
class VegetarianBurger implements Burger {
    @Override
    public void prepare() {
        //prepare veg burger
    }
}
class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        // prepare chicken burger
    }
}
class VegBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new VegetarianBurger();
    }
}
class NonVegBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
}
class Main {
    public static void main(String[] args) {
        Restaurant chickenRestaurant = new NonVegBurgerRestaurant();
        Burger burger = chickenRestaurant.createBurger();
        burger.prepare();

        Restaurant vegBurgerRestaurant = new VegBurgerRestaurant();
        burger = vegBurgerRestaurant.createBurger();
        burger.prepare();
    }
}

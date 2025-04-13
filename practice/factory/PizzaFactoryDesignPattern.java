package practice.factory;

//  pizza k different diffrent types
enum PizzaType {
    VEG,
    NON_VEG,
    ONION,
    BUTTER,
    PANEER
}

interface Pizza {

    void createPizza();
}

class VegPizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("veg pizza");

    }
}

class Non_VegPizza implements Pizza {

    @Override
    public void createPizza() {

        System.out.println("non veg pizza");

    }
}

class OnionPizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("onion pizza");

    }
}

class ButterPizza implements Pizza {

    @Override
    public void createPizza() {
        System.out.println("butter pizza");

    }
}

class PaneerPizza implements Pizza {

    @Override
    public void createPizza() {

        System.out.println("paneer pizza");

    }
}

class PizzaFactory {

    Pizza getPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case VEG:
                return new VegPizza();
            case NON_VEG:
                return new Non_VegPizza();
            case ONION:
                return new OnionPizza();
            case BUTTER:
                return new ButterPizza();
            case PANEER:
                return new PaneerPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + pizzaType);
        }
    }

}

class PizzaFactoryDesignPattern {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.getPizza(PizzaType.ONION);
        pizza.createPizza();
    }
}

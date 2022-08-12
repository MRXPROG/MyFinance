public class Human {
    private static Human human;
    private String name;
    private double budget;
    private Human(String name, double budget){
        this.name = name;
        this.budget = budget;
    }

    public static Human getHuman() {
        return human;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Human{" +
                "budget=" + budget +
                ", name='" + name + '\'' +
                '}';
    }
}

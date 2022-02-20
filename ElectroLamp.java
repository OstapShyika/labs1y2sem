package Lab1;

public record ElectroLamp(String company, int power, int mass, int price) {

    private static int guarantee;
    private static String country;
    private static boolean properCondition;

    public ElectroLamp(){
        this("Hhhhwi", 34, false);
    };

    public ElectroLamp(final String country, final int guaranntee, final boolean properCondition){
        this("jdhb", 2,2,2);
        this.country = country;
        this.guarantee = guaranntee;
        this.properCondition = properCondition;
    }

    public ElectroLamp(final String company, final int power, final int mass, final int price){
        this.company = company;
        this.power = power;
        this.mass = mass;
        this.price = price;
    }
    public String toString(){
        return String.format("Company: %s, " +
                "Power: %d W, " +
                "Mass: %d kgs, " +
                "Guarantee: %d years, " +
                "Country : %s, " +
                "Price: %d dollars, " +
                "Proper condition: %b", company, power, mass, guarantee, country, price, properCondition);
    }

    public static int ID;

    public static int returnID(){
        return ID;
    }

}
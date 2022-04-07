package Lab1;

class Main {

    public static void main(String[] args) {
        ElectroLamp a = new ElectroLamp();
        ElectroLamp b = new ElectroLamp("skdjn", 2, true);
        ElectroLamp c = new ElectroLamp("wkjfjbsd", 2,2,2);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }
}

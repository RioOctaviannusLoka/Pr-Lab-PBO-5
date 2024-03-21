//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Anjing Sony = new Anjing("Sony", "Golden Retriever", 4, "Jantan");
        Anjing Tifa = new Anjing("Tifa Lockhart", "Chihuahua", 5, "Betina");
        Anjing Bond = new Anjing("Bond Forger", "Great Pyrenees", 7, "Jantan");

        System.out.println("Anjing 1:");
        Sony.perkenalan();
        Sony.mengonggong();
        Sony.play("Batu");
        Sony.tidur();

        System.out.println();

        System.out.println("Anjing 2:");
        Tifa.perkenalan();
        Tifa.mengonggong();
        Tifa.play("Cloud Strife");
        Tifa.tidur();

        System.out.println();

        System.out.println("Anjing 3:");
        Bond.perkenalan();
        Bond.mengonggong();
        Bond.play("Anya Forger");
        Bond.tidur();
    }
}
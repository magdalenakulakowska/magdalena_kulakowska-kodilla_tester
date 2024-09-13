public class FirstClass {
    public static void main(String[] args) {
        /* printing hello text */
        String helloText = "Hello from FirstClass!";

        System.out.println(helloText);

        /* Notebook */
        Notebook notebook = new Notebook(600, 1000, 2023);

        System.out.println("notebook weight: " + notebook.weight + ", notebook price: " + notebook.price);

        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);

        System.out.println("heavy notebook weight: " + heavyNotebook.weight + ", heavy notebook price: " + heavyNotebook.price);

        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2000);

        System.out.println("old notebook weight: " + oldNotebook.weight + ", old notebook price: " + oldNotebook.price);

        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndYear();

        Notebook coolNotebook = new Notebook(950, 1750, 2022);

        System.out.println("cool notebook weight: " + coolNotebook.weight + ", cool notebook price: " + coolNotebook.price);

        coolNotebook.checkPrice();
        coolNotebook.checkWeight();
        coolNotebook.checkPriceAndYear();
    }
}
public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2000, 2021);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPriceAndYear();
        Notebook heavyNotebook = new Notebook(2000, 1200,2016);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPriceAndYear();
        Notebook oldNotebook = new Notebook(1200,450, 2000);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPriceAndYear();
        Notebook topNotebook = new Notebook(100,8000, 2022);
        System.out.println(topNotebook.weight + " " + topNotebook.price);
        topNotebook.checkPriceAndYear();
    }
}

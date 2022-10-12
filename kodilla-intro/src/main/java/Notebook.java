public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if (this.price < 600){
            System.out.println("This notebook is cheap.");
        } else if(this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight(){
        if (this.weight < 800){
            System.out.println("This notebook is light.");
        } else if(this.weight >= 800 && this.weight < 1400) {
            System.out.println("The weight is just right.");
        } else if (this.weight >= 1400) {
            System.out.println("This notebook is quite heavy.");
        }
    }

    public void checkPriceAndYear(){
        if (this.price <= 600 && this.year <= 2010){
            System.out.println("This notebook is really old and cheap");
        } else if ((this.price > 600 && this.year > 2011) && (this.price <= 1500 && this.year < 2020)){
            System.out.println("This notebook isn't modern anymore and it's price is just right");
        } else if ((this.price > 1500 && this.price <= 2500) &&  (this.year >= 2020 && this.year < 2022)) {
            System.out.println("This notebook is quite new and quite expensive");
        } else if (this.price > 2500 && this.year == 2022) {
            System.out.println("This notebook is new and it's price is justifiably high ");
        }
    }
}

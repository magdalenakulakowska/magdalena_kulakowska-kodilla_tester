public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook (int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if(this.price < 600){
            System.out.println("This notebook is very cheap");
        } else if (this.price <= 1000){
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if(this.weight < 800) {
            System.out.println("This notebook is light");
        } else if (this.weight <= 1200){
            System.out.println("This notebook is not too heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public String checkYear(){
        String year = "";

        if (this.year < 2010) {
            year = "old";
        } else if (this.year < 2020) {
            year = "not so old";
        } else {
            year = "new";
        }

        return year;
    }

    public void checkPriceAndYear() {
        if(this.price < 600){
            System.out.println("This notebook is very cheap and " + checkYear());
        } else if (this.price <= 1000){
            System.out.println("This price is good and notebook is " +  checkYear());
        } else {
            System.out.println("This notebook is expensive and "  + checkYear());
        }
    }
}

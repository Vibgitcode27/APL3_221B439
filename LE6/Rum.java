class Rum extends Decorator{
    Rum(Offering offering){
        this.offering = offering;
    }
    String getName(){
        return offering.getName() + " over Rum";
    }
    int getPrice(){
        return offering.getPrice() + 1300;
    }
}
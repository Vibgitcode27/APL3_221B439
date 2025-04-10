class Gin extends Decorator{
    Gin(Offering offering){
        this.offering = offering;
    }
    String getName(){
        return offering.getName() + "over Gin";
    }
    int getPrice(){
        return offering.getPrice() + 1800;
    }
}
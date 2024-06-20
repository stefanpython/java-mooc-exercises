
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int totalPrice;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.totalPrice = this.squares * this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.totalPrice - compared.totalPrice);
        
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.totalPrice > compared.totalPrice) {
            return true;
        } else {
            return false;
        }
    }

}

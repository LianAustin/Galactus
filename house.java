public class house {
    int intSize;
    String stringName;
    String stringColour;
    int intRooms;
    int intCost;

    public house(int sizeInput, String nameInput, String colourInput, int roomInput, int costInput){
        intSize = sizeInput;
        stringName = nameInput;
        stringColour = colourInput;
        intRooms = roomInput;
        intCost = costInput;
    }
    public void Rent(int intPayment){
    if(intPayment >= intCost){
        System.out.println("YOU CAN PAY RENT YAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAY");
        }
    else{
        System.out.println("YOU CANT'T PAY RENT NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
    }
}
    public void Expansion(int intIncrease){
        if(intIncrease <= 100){
            intRooms = intRooms + intIncrease;
        }
        else{
            System.out.println("Too many rooms added");
        }
      }

    public void Sell(){
        int i = 0;
        while(intRooms > i){
            intRooms--;
            intSize += 100;

        }

    }

public int getSize(){
    return intSize;
}
public String getName(){
    return stringName;
}
public String getColour(){
    return stringColour;
}
public int getRooms(){
    return intRooms;
}
public int getCost(){
    return intCost;
}



public static void main (String[] args){
    house Banana = new house(1000, "Banana", "Red", 10, 500);

    Banana.Sell();
    System.out.println(Banana.getSize());
    System.out.println(Banana.getName());
    System.out.println(Banana.getColour());
    System.out.println(Banana.getRooms());
    System.out.println(Banana.getCost());
}
}



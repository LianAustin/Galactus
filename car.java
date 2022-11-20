public class car{

    //class variables, and they are present in every object created with this class
        int gasAmount;
        int wheelNum;
        boolean hasAirbags;
        int bodyInTrunk;

    //CONSTRUCTOR - needed to create any object of the class (used when you want to create a car object)
    public car(int gasInput, int wheelInput, boolean airbagInput, int bodyInput){
        gasInput = gasInput * 1000000;
        gasAmount = gasInput; 
        wheelNum = wheelInput;
        hasAirbags = airbagInput;
        bodyInTrunk = bodyInput;
    }

    //METHOD
    //type represents the result, the return type
    public void fullThrottle(){
        System.out.println("This car is going as fast as possible");
        gasAmount = gasAmount - 100;
    }
    public void kidnap(){
        System.out.println("crime");
        bodyInTrunk ++;
    }


    public int getGasAmountperBody(){
        int gasPerBody = gasAmount/bodyInTrunk;
        return gasPerBody;
    }


    public void fixUp(){
        hasAirbags = true;
        bodyInTrunk = 0;
        gasAmount = gasAmount + 1000;
    }


    //SETTER METHODS
    //they set a value of a variable inside the object
    public void setGasAmount(int newGas, double newDouble){
        
        gasAmount = (int) (newGas * newDouble);
    }


    //GETTER METHODS
    //They return a value of a variable inside the object
    public int getGasAmount(){
        return gasAmount;
    }
    public boolean getAirbags(){
        
        return hasAirbags;
    }


    //subclass of the car parent/superclass
    public class offroader extends car{
        int towingCapacity; 
        public void vroom(){
            System.out.println("offroading noises");
        }
        //this takes priority over the parent class's kidnap method, overriding 
        public void kidnap(){
            bodyInTrunk = bodyInTrunk +1000;
        }

        //constructor for offrodaer --> the child of the car parent class
        public offroader(int gasInput, int wheelInput, boolean airbagInput, int bodyInput, int towingInput){
            //super --> calls the constructor from the superclass
            super(gasInput, wheelInput, airbagInput, bodyInput);
            int towingCapacity = towingInput;
        }

    }

    public class van extends car{
     
        public void vroom(){
            System.out.println("offroading noises");
        }
        //this takes priority over the parent class's kidnap method, overriding 
        public void kidnap(){
            bodyInTrunk = bodyInTrunk *5;
        }
        public van(int gasInput, int wheelInput, boolean airbagInput, int bodyInput){
            //super --> calls the constructor from the superclass
            super(gasInput, wheelInput, airbagInput, bodyInput);
        }
    }


    public static void main (String[] args){

        //calling the class constructor to create a car object (of type car)
        //NOTE: the values in brackets, match the format in the constructor 
        car Lambo = new car(1000,4,true,1);
        car Ford = new car(90000,6,false,0);
        Ford.kidnap();
        /*
        System.out.println(Lambo.gasAmount);
        System.out.println(Ford.bodyInTrunk);
        */

        offroader jeep = new offroader(1000,4,true,1, 5);
        jeep.kidnap();







        //string1.length();
        Lambo.fullThrottle();
        System.out.println(Lambo.gasAmount);
        System.out.println(Lambo.getGasAmount());
        System.out.println(Lambo.getGasAmountperBody());



        Ford.kidnap();
        Ford.kidnap();
        Ford.kidnap();
        System.out.println(Ford.bodyInTrunk);
        System.out.println(Ford.getGasAmountperBody());

        System.out.println("_______________________________");

        System.out.println(Ford.getAirbags());
        car Mercedes = new car(0,4,false,50);

        Mercedes.fixUp();

        System.out.println(Mercedes.getGasAmount());

        Mercedes.setGasAmount(50);
        System.out.println(Mercedes.getGasAmount());

        int wtfVariable = 500* 123;
        Mercedes.setGasAmount(wtfVariable);

        if(Mercedes.getGasAmount() != 5){
            //run some code
        }



    }

    
}




//________________________________________________________________________________________________________
//parent aka superclass
class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
      System.out.println("Tuut, tuut!");
    }
  }
  
  //child aka subclass
  class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    
  }

  //subclass of something 
  class plane extends Vehicle{

    //attributes
  }

  //subclass of the car subclass
  class offroader extends Car{
      
    public void vroom(){
        System.out.println("offroading noises");
    }



public static void main(String[] args) {
  
    // Create a myCar object
    Car myCar = new Car();

    offroader myJeep = new offroader();

    myJeep.vroom();
    myJeep.honk();

    plane myPlane = new plane();

    myPlane

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    myCar.vroom();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
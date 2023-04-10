public class ObjectTailNumGen{
    //constants
    private final int tailDigit;
    private String tailNumber;
    //constructor
    public ObjectTailNumGen(){
        this.tailDigit = 5;
        tailNumber = "N";
    }
    //setters
    public void random(){
        double randomNumber = 0;
        for(int i = 0; i<tailDigit; i++){
            randomNumber = Math.random();
            if(i>3){
                if(randomNumber>0.4){//20percent chance of getting letter and 80 percent number
                    tailNumber += (char)(Math.random()*10+48);
                }else{
                    tailNumber += (char)(Math.random()*26+65);
                }
            }else{
                tailNumber += (char)(Math.random()*10+48);
            }
        }
        System.out.println("Randomized");
    }
    //getters
    public String getTailNumber(){
        return tailNumber;
    }
    public boolean isSame(String input){
        if(tailNumber.compareTo(input) == 0){
            return true;
        }else{
            return false;
        }
    }
}
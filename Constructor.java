public class Constructor
{
    String Greet;//Making a Instance Variable
    Constructor()//Making a Constructor
    {
        Greet="Sir/Mam";//Initilize 
       
    }    

    void disp()//Making Display Function
    {
        System.out.println("Hiiiii......"+Greet);
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor();//Object creation...
        
        obj.disp();
        
    }
}

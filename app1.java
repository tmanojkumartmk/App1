import java.util.Scanner;
class app1{
    static Scanner getInput=new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("*** Welcome to Java App-1***\n\n");
        System.out.println("Swiggy Press-1\n\nNumber Program press-2\n\nHistery of Java press-3\n\nAbout us press-4\n\nExit");
        int option=getInput.nextInt();
        switch(option){
            case 1:
                swiggy.main(args);
                break;
            case 2:
                numberProgram.main(args);
                break;
            case 3:
                histeryOfJava.main(args);
                break;
            case 4:
                aboutUs.main(args);
                break;
            default:
                System.out.println("Enter the Correct Number");
                app1.main(args);
                break;
        }
        
        
    }
    
}
//------------------------------------------------------------------------------------------------------------------------------------
                                   //Swiggy App
class swiggy{
    static Scanner getInput=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("*** Welcome to Swiggy ***");
        System.out.println("\n\n*** Please Select the Hotal ***");
        System.out.println("A2B Press-1\n\nThalapakatty Press-2\n\nRR Briyani Press-3\n\nSaravana Bhavan Press-4");
        int selectHotal=getInput.nextInt();
        if(selectHotal>0&&selectHotal<=4){
            dishse(args);
        }
    }
    public static void dishse(String[] args){
        System.out.println("Chicken Briyani press-1\n\nMutton Briyani press-2\n\nFried Rice press-3\n\nPizza press-4\n\nParrota Press-5\n\nExit press-6");
        int dish=getInput.nextInt();
        switch(dish){
            case 1:
                bill("Chicken Briyani",120,args);
                break;
            case 2:
                bill("mutton Briyani",200,args);
                break;
            case 3:
                bill("fried Rice",80,args);
                break;
            case 4:
                bill("Pizza",150,args);
                break;
            case 5:
                bill("pratto",45,args);
                break;
            case 6:
                app1.main(args);
        }
    }
    public static void bill(String dishName,int price,String[] args){
        System.out.println("Price of "+dishName+" "+price);
        System.out.println("Enter the quantity of "+ dishName);
        int quantity=getInput.nextInt();
        int billAmount=quantity*price;
        System.out.println(quantity +" quantity of "+dishName+"\n\nBill Amount "+billAmount);
        System.out.println("\nEnter 1 for bill payment");
        int userPayment=getInput.nextInt();
        if(userPayment==1){
        otp(billAmount);
        }
        else{
            main(args);
        }
    }
    public static void otp(int billAmount){
        double otp=Math.random()*9999+9999;
        int otpGenerate=(int)(otp);
        System.out.println(otpGenerate);
        System.out.println("\nEnter the OTP");
        int userOtp=getInput.nextInt();
        if (otpGenerate==userOtp){
            System.out.println("Bill Amount "+billAmount+" Paid Successfully ");
        }
    }
}
//-----------------------------------------------------------------------------------------------------------------------------------
class numberProgram{
    static Scanner getInput=new Scanner (System.in);
    public static void main(String[] agrs){
        System.out.println("*** Welcome to Number program***");
        int numberProgram=getInput.nextInt();
        switch(numberProgram){
            case 1:
                
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:


                
        }
    }
}
//-----------------------------------------------------------------------------------------------------------------------------------
class histeryOfJava{
    public static void main(String[] agrs){
        System.out.println("James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991. The small team of sun engineers called Green Team.");

    } 
}
//----------------------------------------------------------------------------------------------------------------------------------
class aboutUs{
    public static void main(String[] agrs){
        System.out.println("About us Page");

    }
}
//************************---------------------------------------------------------------------------------**************************

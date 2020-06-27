package bankaccountapp;

public class Checking extends Account {
    //List properties specific to a Checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking(String name,String SSN,double initDeposit){
        super(name,SSN,initDeposit);
        accountNumber="2"+accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        rate=getBaseRate()*0.15;
    }

    private void setDebitCard(){
        debitCardNumber = (int)(Math.random()*Math.pow(10,12));
        debitCardPin =(int)(Math.random()*Math.pow(10,4));
    }

    //List any methods specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println("Your checking account features: "+
                "\nDebit Card Number: "+debitCardNumber+
                "\nDebit Card Pin: "+debitCardPin
                );
    }
}

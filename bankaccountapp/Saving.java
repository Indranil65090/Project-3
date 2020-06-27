package bankaccountapp;

public class Saving extends Account{
    //List properties specific to the savings account
    private int safetyDepositBoxid;
    private int safetyDepositBoxKey;

    //Constructor to initialize settings for the Savings properties
    public Saving(String name,String SSN,double initDeposit){
        super(name,SSN,initDeposit);
        accountNumber="1"+accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate=getBaseRate()-0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxid=(int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));

    }

    //List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
            "Your savings account features: " +
            "\nSafety Deposit Box ID: "+safetyDepositBoxid
             +"\nSafety Deposit Box Key: "+safetyDepositBoxKey
        );
    }
}

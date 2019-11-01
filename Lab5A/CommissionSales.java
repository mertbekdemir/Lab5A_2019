
/**
 * Write a description of class CommissionSales here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CommissionSales
{
    //Constants
    public static final double RATE_A = 0.05;
    public static final double RATE_B = 0.10;
    public static final double RATE_C = 0.13;
    public static final double RATE_D = 0.18;
    public static final double RATE_E = 0.22;
    public static final int DIVISION_FACTOR = 10000;
    public static final int SALES_AMOUNT_MAX_LIMIT = 59999;
    // Fields

    private String salesPersonName;
    int salesAmountInCAD;
    double payInCad;

    /**
     * First constructor
     * @param newSalesPersonName
     * @param newSalesAmountInCAD
     */
    public CommissionSales(String newSalesPersonName, int newSalesAmountInCAD){
        if(newSalesPersonName != null){
            salesPersonName = newSalesPersonName;  
        }else{
            throw new IllegalArgumentException("sales person name cannot be null");   
        }

        if(newSalesAmountInCAD > 0 && newSalesAmountInCAD <= SALES_AMOUNT_MAX_LIMIT){
            salesAmountInCAD = newSalesAmountInCAD;
        }else{
            throw new IllegalArgumentException("sales amount must be greater than zero and smallerthan 59999");
        }
    }

    /**
     * Second constructor
     * @param newSalesPersonName
     */
    public CommissionSales(String newSalesPersonName){
        salesPersonName = "unknown";
        
    }
    //Accessor methods
    /**
     * getSalesPersonName
     * @return salesPersonName
     */
    public String getSalesPersonName(){
     return salesPersonName;   
    }
    /**
     * getSalesAmountInCAD
     * @return salesAmountInCAD
     */
    public int getSalesAmountInCAD(){
     return salesAmountInCAD;   
    }

    /**
     * getPayInCAD
     * @return payInCAD
     */
    public double getPayInCad(){
     return payInCad;   
    }
    //Mutator methods
    /**
     * setSalesPersonName
     * @param newSalesPersonName
     */
    public void setSalesPersonName(String newSalesPersonName){
     if(newSalesPersonName != null){
            salesPersonName = newSalesPersonName;  
        }else{
            throw new IllegalArgumentException("sales person name cannot be null");   
        }
    }
    
    /**
     * setSalesAmountInCAD
     * @param newSalesAmountInCAD
     */
    public void setSalesAmountInCAD(int newSalesAmountInCAD){
     if(newSalesAmountInCAD > 0 && newSalesAmountInCAD <= SALES_AMOUNT_MAX_LIMIT){
            salesAmountInCAD = newSalesAmountInCAD;
        }else{
            throw new IllegalArgumentException("sales amount must be greater than zero and smaller than 59999");
        }
    }
  
    
    /**
     * Method calculatePay
     * calculate pay in cad depending on sales amount
     */
    public double calculatePay(){
        int payAmount = salesAmountInCAD / DIVISION_FACTOR;
        payInCad = 0; // Is this necessary Rana? if sales amount is invalid or out of range I have the exception error,why are we trying to assign to zero? thanks.
        
        switch(payAmount){
            case 0 : payInCad = salesAmountInCAD * RATE_A;
            break;
            case 1 : payInCad = salesAmountInCAD * RATE_A ;
            break;
            case 2 : payInCad = salesAmountInCAD * RATE_B ;
            break;
            case 3 : payInCad = salesAmountInCAD * RATE_C ;
            break;
            case 4 : payInCad = salesAmountInCAD * RATE_D ;
            break;
            case 5 : payInCad = salesAmountInCAD * RATE_E ;
            break;
            default : System.out.println("sales amount is either invalid or out of range");
            
        }
        return payInCad;
    }
    
    public void displayDetails(){
        
     calculatePay();
        
     System.out.println("Name = " + salesPersonName);
     System.out.println("Sales : " + salesAmountInCAD);
     System.out.println("Pay Amount : " + payInCad);
    }
}

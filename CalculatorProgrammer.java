/**
 * Write a description of class CalculatorProgrammer here.
 *
 * @author Rizki Aulia
 * @version 0.1
 */
public class CalculatorProgrammer extends Calculator
{
    
    /**
     * Constructor for objects of class Calculator
     */
    public CalculatorProgrammer()
    {
        // initialise instance variables
        super.jumlahobject += 1;
       
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public CalculatorProgrammer(double op1, double op2)
    {
        super.op1 = op1;
        super.op2 = op2;
        super.jumlahobject += 1;
    
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public CalculatorProgrammer(double op2)
    {
        
        super.op2 = op2;
        super.jumlahobject += 1;
        
    
    }
    /**
     * konversiBilanganDesimaltoHex
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
  
    public void DesimalToHexa(int n) {
        if (n > 1) {
            DesimalToHexa(n / 16);
        }
        System.out.print(n % 16);
    }

     /**
     * konversiBilanganDesimaltobiner
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
   
    public void DesimalToBiner(int n) {
        if (n > 1) {
            DesimalToBiner(n / 2);
        }
        System.out.print(n % 2);
    }
}


/**
 * Write a description of class Calculatorscientific here.
 *
 * @author Rizki Aulia
 * @version 0.1
 */
public class Calculatorscientific extends Calculator
{
     /**
     * Constructor for objects of class Calculator
     */
    public Calculatorscientific()
    {
        // initialise instance variables
        super.jumlahobject += 1;
       
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public Calculatorscientific(double op1, double op2)
    {
        super.op1 = op1;
        super.op2 = op2;
        super.jumlahobject += 1;
    
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public Calculatorscientific(double op2)
    {
        
        super.op2 = op2;
        super.jumlahobject += 1;
        
    
    }
    /** 
     * menghitung Faktorial
     *
     * @param  int op1
     *         
     * @return int 4! = 4x3x2x1 (example)
     */
    public int menghitungFaktorial(int op1){
    if (op1 == 1 || op1 == 0)
    return 1;
    else
         return op1 * menghitungFaktorial(op1 - 1);
    }
     public double luas(){
        double luas, phi=3.14;
        double r= 7;
        luas= phi*r*r;
        return luas;
    }
    
     public double bujurSangkar(int sisi){
        double luas;
        luas=sisi*sisi;
        return luas;
        
    }

}
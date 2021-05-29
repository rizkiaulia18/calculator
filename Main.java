/**
 * Write a description of class Main here.
 *
 * @author Rizki Aulia
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
       /*
        System.out.println(Calculator.info);
       
       Calculator calculator1 = new Calculator();
       Calculator calculator4 = new Calculator();
       Calculator calculator2 = new Calculator(3,5);
       Calculator calculator3 = new Calculator(3);
       
       System.out.println("Nilai awal setelah konstruktor dipanggil");
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
       
       System.out.println("");
       System.out.println(Calculator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(6.2 , 4.2);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);
       
       System.out.println("");
       double kurang1 = calculator1.kurang();
       double kurang2 = calculator1.kurang(6.2,  4.2 );
       System.out.println("Hasil pengurangan method kurang tanpa parameter:  " + kurang1);
       System.out.println("Hasil pengurangan  method kurang dengan parameter:  "+ kurang2);
       
       System.out.println("");
       double kali1 = calculator1.kali();
       double kali2 = calculator1.kali(6.2,  4.2 );
       System.out.println("Hasil perkalian method kali tanpa parameter:  " + kali1);
       System.out.println("Hasil peekalian  method kali dengan parameter:  "+ kali2);
       
        
       System.out.println("");
       double bagi1 = calculator1.bagi();
       double bagi2 = calculator1.bagi(6.2,  4.2  );
       System.out.println("Hasil pembagian method bagi tanpa parameter:  " + bagi1);
       System.out.println("Hasil pembagian method bagi dengan parameter:  "+ bagi2);
       
       
       
  
      //CalculatorProgrammer clp = new CalculatorProgrammer();
      System.out.println(" \n CalculatorProgrammer");
      System.out.println("Bentuk Biner dari Desimal " + " :"+ Integer.toBinaryString(5));
      System.out.println("Bentuk Hex dari Desimal " + " :"+ Integer.toHexString(5));
    
      CalculatorScientific cs = new CalculatorScientific();
      System.out.println(" \n Calculatorscientific");
      System.out.println("Faktorial dari 6! adalah" + cs.menghitungFaktorial(5));
      System.out.println("luas lingkarannya adalah" + cs.luas());
      System.out.println("luas Bujur sangkar adalah"+ cs.bujurSangkar(10));
      
      
      //CalculatorTrigonometri  clr = new CalculatorTriRadian();
      //CalculatorTrigonometri  cld = new CalculatorTriDegree();
      System.out.println(" \n CalculatorTrigonometri ");
      System.out.println("Nilai dari sin 30 adalah"+ Math.sin(30));
      System.out.println("Nilai dari Cos 90 adalah"+ Math.cos(90));
      System.out.println("Nilai dari tan 60 adalah"+ Math.tan(60));
      System.out.println("Nilai dari derajat sudut untuk PI/6 adalah " + Math.toDegrees(Math.PI/6) + " derajat");  
      System.out.println("Nilai dari sudut radian untuk sudut 30 derajat adalah " + Math.toRadians(30));  
      */
      Calculator cl = new Calculator();
      SimpanOperasiCalculator  spr = new SimpanOperasiKeMemoryReverse();
      
      
      cl.setSimpanOperasi(spr);
      cl.op1 = 1;
      cl.op2 = 1;
      System.out.println(cl.jumlah());
      
      cl.op1 = 2;
      cl.op2 = 2;
      System.out.println(cl.jumlah());
      
      cl.op1 = 3;
      cl.op2 = 3;
      System.out.println(cl.jumlah());
      System.out.println("Data dari memori: ");
      System.out.println(cl.bacaOperasi());
      
      SimpanOperasiCalculator spf = new SimpanOperasiKeMemoryForwad();
      cl.setSimpanOperasi(spf);
      cl.op1 = 1;
      cl.op2 = 1;
      System.out.println(cl.jumlah());
      
      cl.op1 = 2;
      cl.op2 = 2;
      System.out.println(cl.jumlah());
      
      cl.op1 = 3;
      cl.op2 = 3;
      System.out.println(cl.jumlah());
      System.out.println("Data dari memori: ");
      System.out.println(cl.bacaOperasi());
      
    }
}
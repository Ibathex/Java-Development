
package gt.edu.url.nivelesdeacceso.usuarios;

/**
 *
 * @author t203
 */
public class SalarioEmployee extends Employee{
    int annualSalary;
    
    public SalarioEmployee(){
    name = "Tijs";
    //setHireYear(2000);
    country ="Guatemala";    
    }
    public  double monthlypay(){
        return 1000.00;
    }
    public  abstract double annualPay();
}

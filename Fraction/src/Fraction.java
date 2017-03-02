
public class Fraction {



    private int numerator;
    private int denominator;
    
    public Fraction(int Num, int Den) {
        
    this.numerator = Num;
    this.denominator = Den;
        
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    
    public Fraction multiply(Fraction factor){
    //int num1 = this.numerator;
    //int num2 = factor.getNumerator();
    int newNum = this.getNumerator() * factor.getNumerator();
    int newDen = this.getDenominator() * factor.getDenominator();
    return new Fraction(newNum, newDen);
    
    
    }
    
    public Fraction add(Fraction summand){
    //int num1 = this.numerator;
    //int num2 = summand.getNumerator();
    
    int denom1 = this.denominator;
    int denom2 = summand.getDenominator();
    
    int newNum = this.getNumerator() * denom2  +   summand.getNumerator() * denom1;
    int newDen = this.getDenominator() * summand.getDenominator();
    return new Fraction(newNum, newDen);}
    

    //sort this - need to change back to a boolean
    // https://www.coolmath4kids.com/math-help/fractions/compare-fractions-equal-numerator
    public Boolean less(Fraction comp){
    //??Might need to make the greatest number of the two denom
    //This calculates the common denominator
     int newDen12 = this.getDenominator() * comp.getDenominator(); 
     //This calculates the first numerator
     int newNum1 = this.getNumerator() *  comp.getDenominator();
     //This calculates the second denominator 
     int newNum2 = comp.getNumerator() * this.getDenominator();
     //return new Fraction(newNum1, newNum2);
    
    
    
     if (newNum1 < newNum2){
     return true;}
     else {
     return false;}
	}

    //sort this
    //javadocs
    //write junit tests
    
    
    public String toString(){ 
      return this.numerator + "/"+ this.denominator;
      }
      
    
    public static void main(String []args) {
    Fraction f1 = new Fraction(1,7);
    Fraction f2 = new Fraction(3,7);
    System.out.println(f2.less(f1)); //.toString());
    f2.multiply(f1).toString();
    //System.out.println(f2);

    }
}
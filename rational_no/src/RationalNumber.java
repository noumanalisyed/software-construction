public class RationalNumber extends Object{

    private int numerator;
    private int denominator;

   public RationalNumber(){
       numerator = 0;
       denominator = 1;
   }
   public RationalNumber(int numerator, int denominator){
       this.numerator = numerator;
       this.denominator = denominator;
       simplify();
   }
   public int getNumerator(){
       return numerator;
   }
   public int getDenominator(){
       return denominator;
   }
   public void setNumerator(int numerator){
       this.numerator = numerator;
   }
   public void setDenominator(int denominator){
       this.denominator = denominator;
   }

   public String toString(){
      return "Rational ["+numerator+" / "+denominator+"]";
   }

   public RationalNumber add(RationalNumber rationalNumber){
       int lcm = this.denominator * rationalNumber.denominator;
       int nume1 = (this.numerator*lcm)/ this.denominator;
       int nume2 = (rationalNumber.numerator*lcm)/ rationalNumber.denominator;
       int nume = nume1 + nume2;
       return new RationalNumber(nume,lcm);
   }
   public RationalNumber sub(RationalNumber rationalNumber){
       int lcm = this.denominator * rationalNumber.denominator;
       int nume1 = (this.numerator*lcm)/ this.denominator;
       int nume2 = (rationalNumber.numerator*lcm)/ rationalNumber.denominator;
       int nume = nume1 - nume2;
       return new RationalNumber(nume,lcm);
   }
   private void simplify(){
       int divisor = 2;
       int max = (numerator > denominator) ? numerator : denominator;

       while (divisor <= max/2){
           if(numerator % divisor ==0 && denominator % divisor ==0){
               numerator = numerator / divisor;
               denominator = denominator / divisor;
           }
           else{
               divisor++;
           }
       }
   }

   public RationalNumber mul(RationalNumber rationalNumber){
       int nume = this.numerator * rationalNumber.numerator;
       int deno = this.denominator * rationalNumber.denominator;
       return new RationalNumber(nume,deno);
   }
   public RationalNumber div(RationalNumber rationalNumber){
       int nume = this.numerator * rationalNumber.denominator;
       int deno = this.denominator * rationalNumber.numerator;
       return new RationalNumber(nume,deno);
   }
}

/**
 *    @author   Choi Inyeob
 *    Project:  Homework #1
 *    Due:      11/16/2016
 *    Course:   cs14002-f16
 *
 *    Description: 
 *              This is a program for computing nonnegative rational numbers.
 */

public class Rational
{
	private int numerator;
	private int denominator;
	Rational()
	{
		numerator = 0;
		denominator =1;
	}
	Rational(int num, int den)
	{
		numerator = num;
		denominator = den;
	}
	public void setNumerator(int num)
	{
		numerator = num;
	}
	public void setDenominator(int den)
	{
		denominator =den;
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public String toString()
	{
		return numerator + "/" +denominator;
	}
	public Rational add(Rational f)
	{
		int n = (numerator * f.denominator)+(f.numerator*denominator);
		int d = denominator * f.denominator;
		return new Rational(n,d);
	}
	public Rational mul(Rational f)
	{
		int n = numerator * f.numerator;
		int d = denominator* f.denominator;
		return new Rational(n,d);
	}
	public static void main(String[] args)
	{
		Rational x, y, sum, prod;
		x = new Rational(1,2);
		y = new Rational(1,3);
		sum = x.add(y);
		System.out.println(sum.toString());
	
		x = new Rational(3,7);
		y = new Rational(4,5);
		prod=x.mul(y);
		System.out.println(prod.toString());
	}
}

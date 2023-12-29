// Title : CODSOFT INTERNSHIP TASK 3 (Currency Conversion Program)
// Author : Omkar Ajit Vartak

import java.util.*;
public class Currency_convert
{

	public static void main(String[] args)
	{
		int ch1,ch2;
		System.out.println("\n\tWelcome to the Currency Converter Program....");
		System.out.println("\n\t 1. Rupees \n\t 2. Dollars \n\t 3. Pounds \n\t 4. Yen");
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t Enter The Choice for the base Currency : ");
		ch1 = sc.nextInt();
		if(ch1>4)
		{
			System.out.println("\n\t Invalid Choice...");
			System.out.println("\n\t Choice must be between 1 to 4 only...");
		}
		System.out.println("\n\t 1. Rupees \n\t 2. Dollars \n\t 3. Pounds \n\t 4. Yen");
		System.out.println("\n\t Enter the choice for the Target Currency : ");
		ch2 = sc.nextInt();
		if(ch2>4)
		{
			System.out.println("\n\t Invalid Choice...");
			System.out.println("\n\t Choice must be between 1 to 4 only...");
		}
		if(ch1== 1 && ch2== 2)
		{
			System.out.println("\n\t Rupees to Dollar Conversion....");
			System.out.println("\n\t Current conversion rate : 1 Rupees = 83.2058 Dollars ");
			double rs,dollars;
			Scanner sc1 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Rupees : ");
			rs = sc1.nextDouble();
			dollars = (rs/83.2058);
			System.out.println("\n\t Amount In dollars is : "+dollars);
			System.out.println("\n\t Thank you....");
		}
		else if(ch1== 1 && ch2== 3)
		{
			System.out.println("\n\t Rupees to Pounds Conversion....");
			System.out.println("\n\t Current conversion rate : 1 Rupees = 106.08 Pounds ");
			double rs,pounds;
			Scanner sc1 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Rupees : ");
			rs = sc1.nextDouble();
			pounds = (rs/106.08);
			System.out.println("\n\t Amount in Pounds : "+pounds);
			System.out.println("\n\t Thank you...");
		}
		else if(ch1==1 && ch2==4)
		{
			System.out.println("\n\t Rupees to Yen Conversion...");
			System.out.println("\n\t Current conversion rate : 1 Rupees = 0.58 Yen ");
			double rs,yen;
			Scanner sc1 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Rupees : ");
			rs = sc1.nextDouble();
			yen = (rs*1.71);
			System.out.println("\n\t Amount in Yen : "+yen);
			System.out.println("\n\t Thank you....");
		}
		else if(ch1==2 && ch2==1)
		{
			System.out.println("\n\t Dollars to Rupees Conversion....");
			System.out.println("\n\t Current conversion rate : 1 Rupees = 83.2058 Dollars ");
			double rs,dollars;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Dollars : ");
			dollars = sc2.nextDouble();
			rs = (dollars*83.2058);
			System.out.println("\n\t Amount in Rupees is : "+rs);
			System.out.println("\n\t Thank you......");
		}
		else if(ch1==2 && ch2==3)
		{
			System.out.println("\n\t Doller to Pounds Conversion...");
			System.out.println("\n\t Current conversion rate : 1 Dollar = 0.79 Pounds ");
			double dollars,pounds;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Dollars : ");
			dollars = sc2.nextDouble();
			pounds = (dollars*0.79);
			System.out.println("\n\t Amount in Pounds is : "+pounds);
			System.out.println("\n\t Thank you.....");
		}
		else if(ch1==2 && ch2==4)
		{
			System.out.println("\n\t Dollars to Yen Conversion....");
			System.out.println("\n\t Current conversion rate : 1 Dollar = 142.58 Yen ");
			double dollars,yen;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Dollars : ");
			dollars = sc2.nextDouble();
			yen = (dollars*142.58);
			System.out.println("\n\t Amount in Yen is : "+yen);
			System.out.println("\n\t Thank you...");
		}
		else if(ch1==3 && ch2==1)
		{
			System.out.println("\n\t Pounds to Rupees Conversion.....");
			System.out.println("\n\t Current conversion rate : 1 Pound = 106.08 Rupees ");
			double pounds,rs;
			Scanner sc3 = new Scanner (System.in);
			System.out.println("\n\t Enter Amount in Pounds : ");
			pounds = sc3.nextDouble();
			rs = (pounds*106.08);
			System.out.println("\n\t Amount in Rupees is : "+rs);
			System.out.println("\n\t Thank you....");
		}
		else if(ch1==3 && ch2==2)
		{
			System.out.println("\n\t Pounds to Dollars Conversion....");
			System.out.println("\n\t Current conversion rate : 1 Pound = 1.27 Dollars ");
			double pounds,dollars;
			Scanner sc3 = new Scanner (System.in);
			System.out.println("\n\t Enter Amount in Pounds : ");
			pounds = sc3.nextDouble();
			dollars = (pounds*1.27);
			System.out.println("\n\t Amount in Dollars is : "+dollars);
			System.out.println("\n\t Thank you.....");
		}
		else if(ch1==3 && ch2==4)
		{
			System.out.println("\n\t Pounds to Yen Conversion....");
			System.out.println("\n\t Current conversion rate : 1 Pound = 181.52 Yen ");
			double pounds,yen;
			Scanner sc3 = new Scanner (System.in);
			System.out.println("\n\t Enter Amount in Pounds : ");
			pounds = sc3.nextDouble();
			yen = (pounds*181.52);
			System.out.println("\n\t Amount in Yen is : "+yen);
			System.out.println("\n\t Thank you....");
		}
		else if(ch1==4 && ch2==1)
		{
			System.out.println("\n\t Yen to Rupees Conversion...");
			System.out.println("\n\t Current conversion rate : 1 Yen = 0.58 Rupees ");
			double yen,rs;
			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Yen : ");
			yen = sc.nextDouble();
			rs = (yen*0.58);
			System.out.println("\n\t Amount in Rupees is : "+rs);
			System.out.println("\n\t Thank you......");
		}
		else if(ch1==4 && ch2==2)
		{
			System.out.println("\n\t Yen to Dollar Conversion....");
			System.out.println("\n\t Current conversion rate : 1 Yen = 0.0070 Dollars ");
			double yen,dollars;
			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Yen : ");
			yen = sc.nextDouble();
			dollars = (yen*0.0070);
			System.out.println("\n\t Amount in Dollars is : "+dollars);
			System.out.println("\n\t Thank you....");
		}
		else if(ch1==4 && ch2==3)
		{
			System.out.println("\n\t Yen to Pounds Conversion.....");
			System.out.println("\n\t Current conversion rate : 1 Yen = 0.0055 Pounds ");
			double yen,pounds;
			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n\t Enter Amount in Yen : ");
			yen = sc.nextDouble();
			pounds = (yen*0.0055);
			System.out.println("\n\t Amount in Pounds is : "+pounds);
			System.out.println("\n\t Thank you....");
		}
		else
		{
			System.out.println("\n\t Either you have entered an incorrect choice or you have selected the same currency as base and target currency.");
			System.out.println("\n\t Please Check and Correct");
			System.out.println("\n\t Thank you....");
		}
	}
}

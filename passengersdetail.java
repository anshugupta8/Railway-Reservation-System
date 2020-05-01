import java.util.*;
public class passengersdetail extends information   
{
    void gettinginformation()
    {
        String name;int seat;int age;String gen;
        Scanner sc=new Scanner(System.in);
            display_information();
        System.out.println();
        System.out.println("Enter Your Full Name");
boolean chk;name="";
do{
name=sc.nextLine();
chk=check(name);
if(chk==false)
System.out.println("Wrong Input.Please Enter Your Full Name Again");
}while(chk==false);
System.out.println();
System.out.println("Enter Your Age");
do{
    age=sc.nextInt();
if(age>125)
System.out.println("Enter the age below 125 years");
}while(age>125);  
    System.out.println("Enter your gender(male or female)");
    gen=sc.next();
System.out.println("If you want to book seats more than one Press 1 or else any other digit");
int j=sc.nextInt();
 seat=1;
if(j==1){
System.out.println("Enter the number of seats");
do{
seat=sc.nextInt();
if(seat>100)
System.out.println("Wrong Input.Please Enter no. of seats less then 100");
}while(seat>100);
}
System.out.println();
System.out.println("Enter your E-mail ID");
String id;int c=0;
do{
id=sc.next();
for(int i=0;i<id.length();i++){
if(id.charAt(i)=='@')
c++;
}
if(c!=1)
System.out.println("Wrong Input.Please Enter Valid E-mail ID");
}while(c!=1);
System.out.println("Enter the Contact Number");
long con;int m;
do{
    m=0;
    con=sc.nextLong();
    while(con>0){
        con=con/10;
        m++;
    }    
if(m!=10){
System.out.println("Enter the Contact Number again");
    }
}while(m!=10);
System.out.println("Enter your Credit/Debit Card Number");
long card;int z;
do{
    z=0;
    card=sc.nextLong();
    while(card>0){
        card=card/10;
        z++;
    }    
if(z!=16){
System.out.println("Enter the Credit/Debit Card Number again");
    }
}while(z!=16); 
System.out.print("\u000c");
  train ob=new train();
ob.menu(name,age,gen,seat);  
}
boolean check(String s){
int c=0;
for(int i=0;i<s.length();i++){
for(int j=33;j<65;j++){
if(s.charAt(i)==(char)j)
c++;
}
}
if(c>0)
return false;
else
return true;
}
 void ticket(String dep,String arr,int fare,String name,int age,String gen,int seat){ 
System.out.println("\u000c");
System.out.println("                        *****D0ME$TIC R@ILW@Y RESERV@TI0N******");
System.out.println();
System.out.println();
System.out.println("WEBSITE:WWW.domesticrailwayreservation.com");
System.out.println("CONTACT:9612849607/8794279023");
System.out.println("ARRIVAL CITY:"+arr+   "         DEPARTURE CITY:"+dep);
System.out.println();
System.out.println("----------------------------------------------------------------");
System.out.println( " Name of the Passenger= "+name+", Age= "+age+", Gender= "+gen+" \nPrice of a single person= "+fare);
System.out.println("Number of seats= "+seat);
System.out.println("----------------------------------------------------------------");
System.out.println("                  Total "+(seat*fare));
int ran=(int)(Math.random()*100);
seat=seat-1;
System.out.print("Your Seat No.'s are ");
for(int i=ran;i<=(ran+seat);i++){
    System.out.print((i+1)+",");
}
Calendar c=Calendar.getInstance();
System.out.println("\nYour Booking Date is: "+(c.get(Calendar.DATE)+2)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
System.out.println("\n----------------------------------------------------------------");
System.out.println("\n Thank you "+name+" for using our website!!!!HAVE A Happy AND SAFE JOURNEY");
}
}
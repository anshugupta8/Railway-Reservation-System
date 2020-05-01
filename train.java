import java.util.*;
public class train extends passengersdetail
{ 
    void menu(String name,int age,String gen,int seat)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Tatanagarmail\nEnter 2 for Jammu Tawi\nEnter 3 for Mayurakshi\nEnter 4 for Punjab Mail\nEnter 5 for Puri Mail\nEnter 6 for Satabdi Express(New Delhi-Bhopal)\nEnter 7 for Satabdi Express(New Delhi-Lucknow)\nEnter 8 for Satabdi Express(New Delhi-Kanpur)\nEnter 9 for Duroto Express(New Delhi-Allahabad)\nEnter 10  for Duronto Express(Sealdah-New Delhi)\nEnter 11 for Duroto Express(Secundrabad-Nizamuddin)\nEnter 12 for Duroto Express(Bhubaneshwar-New Delhi)\nEnter 13 for Duroto Express(Mumbai-Nagpur)\nEnter 14 for Duroto Express(Chennai-Nizamuddin)\nEnter 15 for Rajdhani Express(Mumbai-New Delhi)\nEnter 16 for Rajdhani Express(Mumbai-Nizamuddin)\nEnter 17 for Rajdhani Express(New Delhi-Tamil Nadu)\nEnter 18 for Rajdhani Express(Rajendra Nagar-New Delhi)\nEnter 19 for Rajdhani Express(Rachi-New Delhi)\nEnter 20 for Garib Rath(Nizzamuddin-Bandra)");
        System.out.println("Enter your choice");
        int choice;
        do{
            choice=sc.nextInt();
            if(choice>20 || choice<1)
        System.out.println("Invalid Input.Enter your choice");
    }while(choice>20 ||choice<1);
            if(choice==1)
        {
            tatanagarmail(name,age,gen,seat);
        }
      else if(choice==2)
        {
            jammutawi(name,age,gen,seat);
        }
        else if(choice==3)
        {
            mayurakshi(name,age,gen,seat);
        }
        else if(choice==4)
        {
            punjabmail(name,age,gen,seat);
        }
        else if(choice==5)
        {
            purimail(name,age,gen,seat);
        }
    else if(choice==6)
    {
       shatabdione(name,age,gen,seat); 
    }
    else if(choice==7) 
    {
        shatabditwo(name,age,gen,seat);
    }
    else if(choice==8)
    {
        shatabdithree(name,age,gen,seat);
    }
    else if(choice==9)
    {
        durontoone (name,age,gen,seat);
    }
    else if(choice==10)
    {
        durontotwo(name,age,gen,seat);
    }
    else if(choice==11)
    {
        durontothree(name,age,gen,seat);
    }
    else if(choice==12)
    {
        durontofour(name,age,gen,seat);
    }
    else if(choice==13)
    {
        durontofive(name,age,gen,seat);
    }
    else if(choice==14)
    {
        durontosix(name,age,gen,seat);
    }
    else if(choice==15)
    {
        rajdhanione(name,age,gen,seat);
    }
    else if(choice==16)
    {
        rajdhanitwo(name,age,gen,seat);
    }
    else if(choice==17)
    {
        rajdhanithree(name,age,gen,seat);
    }
    else if(choice==18)
    {
        rajdhanifour(name,age,gen,seat);
    }
    else if(choice==19)
    {
        rajdhanifive(name,age,gen,seat);
    }
    else if(choice==20)
    {
        garibrath(name,age,gen,seat);
    }
}
        void tatanagarmail(String name,int age,String gen,int seat)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    Howrah    \t  Tatanagar \t 200 ");
        System.out.println("  2   \t    Tatanagan \t   Howrah   \t 200 ");   
    
             System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Howrah","Tatanahar",200,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Tatanagar","Howrah",200,name,age,gen,seat);
}
}
    void mayurakshi(String name,int age,String gen,int seat)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    Howrah    \t   Ondal    \t400  ");
        System.out.println("  2   \t    Ondal     \t   Howrah   \t400 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Howrah","Ondal",400,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Ondal","Howrah",400,name,age,gen,seat);
}   
    }
    void jammutawi(String name,int age,String gen,int seat)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    Howrah    \t  JammuTawi \t 580 ");
        System.out.println("  2   \t    JammuTawi \t  Howrah    \t 580 ");
         System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Howrah","JammuTawi",580,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("JammuTawi","Howrah",580,name,age,gen,seat);
}
}

    void punjabmail(String name,int age,String gen,int seat)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    Srinagar  \t  Amritsar  \t 800 ");
        System.out.println("  2   \t   Amritsar   \t Srinagar   \t 800 ");
             System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Srinagar","Amritsar",800,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Amritsar","Srinagar",800,name,age,gen,seat);
}
}
    void purimail(String name,int age,String gen,int seat)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    Kharagpur \t     Puri   \t 350 ");
        System.out.println("  2   \t    Puri      \t  Kharagpur \t 350 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 ||choic<1);
    if(choic==1)
    {
    ticket("Kharagpur","Puri",350,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Puri","Kharagpur",350,name,age,gen,seat);
}
}
   void shatabdione(String name,int age,String gen,int seat)
   {
               Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    New Delhi \t    Bhopal  \t 600 ");
        System.out.println("  2   \t    Bhopal    \t  New Delhi \t 600 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("New Delhi","Bhopal",600,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Bhopal","New Delhi",600,name,age,gen,seat);
}
}
       void shatabditwo(String name,int age,String gen,int seat)
           {
         Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    New Delhi \t  Lucknow   \t 1020 ");
        System.out.println("  2   \t    Lucknow   \t  New Delhi \t 1020 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("New Delhi","Lucknow",1020,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Lucknow","New Delhi",350,name,age,gen,seat);
}
}
void shatabdithree(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    New Delhi \t     Kanpur \t 475 ");
        System.out.println("  2   \t    Kanpur    \t  New Delhi \t 475 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("New Delhi","Kanpur",475,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Kanpur","New Delhi",475,name,age,gen,seat);
}
}
void durontoone(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    New Delhi \t   Allahabad\t 765 ");
        System.out.println("  2   \t    Allahabad \t   New Delhi\t 765 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("New Delhi","Allahabad",765,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Allahabad","New Delhi",765,name,age,gen,seat);
}
}
void durontotwo(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    Sealdah   \t  New Delhi \t 900 ");
        System.out.println("  2   \t    New Delhi \t    Sealdah \t 900 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Sealdah","New Delhi",900,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("New Delhi","Sealdah",900,name,age,gen,seat);
}
}
void durontothree(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t Secunderabad \t Nizzamuddin\t 230 ");
        System.out.println("  2   \t Nizzamuddin  \t Secundrabad\t 230 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Secundrabad","Nizzamuddin",230,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Nizzamuddin","Secundrabad",230,name,age,gen,seat);
}
}
void durontofour(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t  Bhubaneshwar\t   New Delhi\t 765 ");
        System.out.println("  2   \t    New Delhi \tBhubaneshwar\t 765 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 ||choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Bhubaneshwar","New Delhi",765,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("New Delhi","Bhubaneshwar",765,name,age,gen,seat);
}
}
void durontofive(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t    Mumbai    \t   Nagpur   \t 590 ");
        System.out.println("  2   \t    Nagpur    \t   Mumbai   \t 590 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Nagur","Mumbai",590,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Mumbai","Nagpur",590,name,age,gen,seat);
}
}
void durontosix(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t   Chennai    \t  Nizamuddin\t 1000 ");
        System.out.println("  2   \t   Nizzamuddin\t     Chennai\t 1000 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Chennai","Nizzamuddin",1000,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Nizzamuddin","Chennai",1000,name,age,gen,seat);
}
}
 void rajdhanione(String name,int age,String gen,int seat)
 {
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t   Mumbai     \t  New Delhi \t 400 ");
        System.out.println("  2   \t   New Delhi  \t      Mumbai\t 400 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Mumbai","New Delhi",400,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("New Delhi","Mumbai",400,name,age,gen,seat);
}
}
void rajdhanitwo(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t   Mumbai    \t   Nizamuddin\t 1020 ");
        System.out.println("  2   \t   Nizzamuddin\t      Mumbai\t 1020 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Mumbai","Nizzanuddin",1020,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Nizzamuddin","Mumbai",1020,name,age,gen,seat);
}
}
 void rajdhanifour(String name,int age,String gen,int seat)
 {
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city  \tWage ");
        System.out.println("  1   \tRajendra Nagar\t   New Delhi  \t 567 ");
        System.out.println("  2   \tNew Delhi     \tRajendra Nagar\t 567 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Rajendra Nagar","New Delhi",567,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("New Delhi","Rajendra Nagar",567,name,age,gen,seat);
}
}   
void  rajdhanithree(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t   New Delhi   \t Tamil Nadu\t 2000 ");
        System.out.println("  2   \t   Tamil Nadu  \t  New Delhi\t 2000 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("New Delhi","Tamil Nadu",2000,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Tamil Nadu","New Delhi",2000,name,age,gen,seat);
}
}
void rajdhanifive(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t   Rachi      \t   New Delhi\t 800 ");
        System.out.println("  2   \t   New Delhi  \t       Rachi\t 800 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Rachi","New Delhi",800,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("New Delhi","Rachi",800,name,age,gen,seat);
}
}
void garibrath(String name,int age,String gen,int seat)
{
            Scanner sc=new Scanner(System.in);
        System.out.println("                Train Chart");
        System.out.println("Press \tDeparture city\tArrival city\tWage ");
        System.out.println("  1   \t  Nizzamuddin \t  Bandra    \t 510 ");
        System.out.println("  2   \t  Bandra      \t Nizzamuddin\t 510 ");
                 System.out.println("Enter your choice");
        int choic;
         do
        {
           choic=sc.nextInt();
           if(choic>2 || choic<1)
            System.out.println("Sorry ! Wrong input please enter again");            
    }while(choic>2 || choic<1);
    if(choic==1)
    {
    ticket("Nizzamuddin","Bandra",510,name,age,gen,seat);
}
else if(choic==2)
{
    ticket("Bandra","Nizzamuddin",510,name,age,gen,seat);
}
}
}
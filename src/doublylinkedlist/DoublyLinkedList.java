package doublylinkedlist;
import java.text.DecimalFormat;
import java.util.Scanner;

// Train Station Train Arrivals And Passengers Dipartures

class DoublyLinkedListArrivals //COHDSE202F-058-Isuru Sampath
{
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    Node head,tail;
    class Node
    {
        String Arrival_Train_No;
        double Arrival_Time;
        int Arrival_passenger_count;
        int Arrival_Platform;
        
        Node nextNode,previousNode;
        public Node(String Arrival_Train_No,double Arrival_Time,int Arrival_passenger_count,int Arrival_platform )
        {
            this.Arrival_Train_No=Arrival_Train_No;
            this.Arrival_Time=Arrival_Time;
            this.Arrival_passenger_count=Arrival_passenger_count;
            this.Arrival_Platform=Arrival_platform;
            nextNode=null;
            previousNode=null;
       
            
        }
    }
    public void createNewNode(String Arrival_Train_No,double Arrival_Time,int Arrival_passenger_count,int Arrival_platform)
    {
        Node newNode=new Node(Arrival_Train_No,Arrival_Time,Arrival_passenger_count,Arrival_platform);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.nextNode=newNode;
            newNode.previousNode=tail;
            tail=newNode;
        }
    }
    public void Sorting()
    {
        String ATNArr[]=new String[100];
        double ATArr[]=new double[100];
        int APCArr[]=new int[100];
        int APArr[]=new int[100];
        int xi=0;
        Node displayNode;
        displayNode=head;
        int Qnumber=1;
        while(displayNode != null)
        {
            if("".equals(displayNode.Arrival_Train_No))
            {
                xi++;
                displayNode=displayNode.nextNode;
            }
            else
            {
                ATNArr[xi]=displayNode.Arrival_Train_No;
                ATArr[xi]=displayNode.Arrival_Time;
                APCArr[xi]=displayNode.Arrival_passenger_count;
                APArr[xi]=displayNode.Arrival_Platform;
               
                displayNode=displayNode.nextNode;
                xi++;
            }
        }
        
        Scanner s3 =new Scanner(System.in);
        int option;
        do{
        System.out.println("press 1 sort  by passenger count\n press 2 to sort by time");
        option=s3.nextInt();
        if(option==1)
        {
            for(int x=0;x<ATNArr.length-1;x++) //Insertion Sort For Passenger Count
            {
                for(int y=0;y<ATNArr.length-x-1;y++)
                {
                    if(APCArr[y]<APCArr[y+1])
                    {
                        String tmp=ATNArr[y];
                        ATNArr[y]=ATNArr[y+1];
                        ATNArr[y+1]=tmp;
                        
                        double tmp2=ATArr[y];
                        ATArr[y]=ATArr[y+1];
                        ATArr[y+1]=tmp2;
                        
                        int tmp3=APCArr[y];
                        APCArr[y]=APCArr[y+1];
                        APCArr[y+1]=tmp3;
                        
                        int tmp4=APArr[y];
                        APArr[y]=APArr[y+1];
                        APArr[y+1]=tmp4;
                    }
                }
                
            }
          System.out.println("\n \n                                                      SORT BY PASSENGER COUNT");
          System.out.println("Arrival Train No       Passenger count       Arrival Time       Arrival Platform"); 
         for(int z=0;z<=ATNArr.length-1;z++)
        {
            if(APCArr[z]==0 || ATNArr[z]==null)
            {
            }
            else
            {
              
            System.out.println(ATNArr[z]+"                  "
                    + ""+APCArr[z]+"                  "
                    + ""+df2.format(ATArr[z])+"              "
                    + " "
                    + ""+APArr[z]+"                 ");
                    
                    

            }
            
        }
            
        }
        if(option==2)
        {
            for(int x=0;x<ATNArr.length-1;x++)
            {
                for(int y=0;y<ATNArr.length-x-1;y++)
                {
                    if(ATArr[y]<ATArr[y+1])
                    {
                        String tmp=ATNArr[y];
                        ATNArr[y]=ATNArr[y+1];
                        ATNArr[y+1]=tmp;
                        
                        double tmp2=ATArr[y];
                        ATArr[y]=ATArr[y+1];
                        ATArr[y+1]=tmp2;
                        
                        int tmp3=APCArr[y];
                        APCArr[y]=APCArr[y+1];
                        APCArr[y+1]=tmp3;
                        
                        int tmp4=APArr[y];
                        APArr[y]=APArr[y+1];
                        APArr[y+1]=tmp4;
                    }
                }
            }
          System.out.println("\n \n                                                     SORT BY Arrival Time");
          System.out.println("Arrival Train No       Passenger count       Arrival Time       Arrival Platform"); 
          for(int z=0;z<=ATNArr.length-1;z++)
        {
            if(APCArr[z]==0 || ATNArr[z]==null)
            {
            }
            else
            {
             System.out.println(ATNArr[z]+"                  "
                    + ""+APCArr[z]+"                  "
                    + ""+df2.format(ATArr[z])+"              "
                    + " "
                    + ""+APArr[z]+"                 ");
            }
            
        }
            
           
    }
        }while(option !=2);
        
        
}
}
class DoublyLinkedListDeparture // COHDSE202F-056-D.H.H.Madawi/COHDSE202F-057-H.K.Dilshan
{
    private static final DecimalFormat df2 = new DecimalFormat("#.##");
      Node head,tail;
   
    class Node
    {
        String passenger_name,destination;
        double departure_time;
        int platform_number;
        int ticket_price;
        Node nextNode,previousNode;
        
        public Node(String passenger_name,String destination,double departure_time,int platform_number, int ticket_price)
        {
            this.passenger_name=passenger_name;
            this.destination=destination;
            this.departure_time=departure_time;
            this.platform_number=platform_number;
            this.ticket_price=ticket_price;
            nextNode=null;
            previousNode=null;
        }
    }
    public void createNewNode(String passenger_name,String destination,double departure_time,int platform_number,int ticket_price) //COHDSE202F-057-H.K.Dilshan
    {
        Node newNode=new Node(passenger_name,destination,departure_time,platform_number,ticket_price);
        if (head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.nextNode=newNode;
            newNode.previousNode=tail;
            tail=newNode;
        }
    }
    public void ReverseShow() //COHDSE202F-057-H.K.Dilshan
    {
        Node currentNode =head;
        Node temp =null;
         while(currentNode != null)
         {
             temp=currentNode.nextNode;
             currentNode.nextNode=currentNode.previousNode;
             currentNode.previousNode=temp;
             currentNode=currentNode.previousNode;
         }
         temp=head;
         head=tail;
         tail=temp;
    }
    public void Show() //COHDSE202F-057-H.K.Dilshan
    {
        Node displayNode;
        displayNode=head;
        int Qnumber=1;
         while(displayNode !=null)
        {
            if("".equals(displayNode.passenger_name))
            {
            displayNode=displayNode.nextNode;
            }
            else
            {
            System.out.println("**************************************************");
            System.out.println("**************************************************");           
            System.out.println("Number of Passenger : "+(Qnumber++));
            System.out.println("Passenger name : "+displayNode.passenger_name);
            System.out.println("Departure time : "+displayNode.departure_time);
            System.out.println("Platform Number : "+displayNode.platform_number);
            System.out.println("Destination : "+displayNode.destination);
            System.out.println("Ticket Price : "+displayNode.ticket_price);
            displayNode=displayNode.nextNode;
            }
        
        }
    }
    public Node deleteNode(Node del) //COHDSE202F-56-D.H.H.Madawi
    {
        if (head == null || del == null)
            return null;
        if (head == del)
            head = del.nextNode;
         if (del.nextNode != null)
            del.nextNode.previousNode = del.previousNode;
         
         if (del.previousNode != null)
            del.previousNode.nextNode = del.nextNode;
 
        del = null;
 
        return head;
    }
    public void RemoveSearch(int n) //COHDSE202F-56-D.H.H.Madawi
    {
        if (head == null || n <= 0)
            return;
 
        Node current = head;
        int i;
        for (i = 1; current != null && i < n; i++)
        {
            current = current.nextNode;
        }
        if (current == null)
            return;
        deleteNode(current);
    }
    public void Search(String SID) //COHDSE202F-56-D.H.H.Madawi
    {
        Node displayNode;
        displayNode=head;
       String value2=SID;
       while(displayNode !=null)
       {
           if(displayNode.passenger_name == null ? value2 == null : displayNode.passenger_name.equals(value2))
           {
               System.out.println("Name : "+displayNode.passenger_name);
               System.out.println("Time : "+displayNode.departure_time);
               System.out.println("PlatForm : "+displayNode.platform_number);
               System.out.println("Destination : "+displayNode.destination);
               System.out.println("Ticket Price : "+displayNode.ticket_price);
               break;
           }
           displayNode=displayNode.nextNode;
       }
    }
    public void Sorting()//COHDSE202F-054-D.Gunasekara/COHDSE202F-055-T.G.K.L.Prematunga
    {
        String PnameArr[]=new String[100];
        String DesArr[]=new String[100];
        double DepaArr[]=new double[100];
        int PFArr[]=new int[100];
        int T_PriceArr[]=new int[100];
        
        int xi=0;
        Node displayNode;
        displayNode=head;
        int Qnumber=1;
        while(displayNode !=null)
        {
            if("".equals(displayNode.passenger_name))
            {
                xi++;
                displayNode=displayNode.nextNode;
            }
            else
            {
                PnameArr[xi]=displayNode.passenger_name;
                DesArr[xi]=displayNode.destination;
                DepaArr[xi]=displayNode.departure_time;
                PFArr[xi]=displayNode.platform_number;
                T_PriceArr[xi]=displayNode.ticket_price;
                
                displayNode=displayNode.nextNode;
                xi++;
            }
        }
        
        Scanner s3 = new Scanner(System.in);
        System.out.println("press 1 to sort by time\n press 2 to sort by Ticket Price ");
        int option=s3.nextInt();
        if(option==1)                         //COHDSE202F-055-T.G.K.L.Prematunga
        {
            for(int x=0;x<PnameArr.length-1;x++)
            {
                for(int y=0;y<PnameArr.length-x-1;y++)
                {
                    if(DepaArr[y]<DepaArr[y+1])
                    {
                        String tmp=PnameArr[y];
                        PnameArr[y]=PnameArr[y+1];
                        PnameArr[y+1]=tmp;
                        
                        String tmp2=DesArr[y];
                        DesArr[y]=DesArr[y+1];
                        DesArr[y+1]=tmp2;
                        
                        double tmp3=DepaArr[y];
                        DepaArr[y]=DepaArr[y+1];
                        DepaArr[y+1]=tmp3;
                        
                        int tmp4=PFArr[y];
                        PFArr[y]=PFArr[y+1];
                        PFArr[y+1]=tmp4;
                        
                        int tmp5=T_PriceArr[y];
                        T_PriceArr[y]=T_PriceArr[y+1];
                        T_PriceArr[y+1]=tmp5;
                        
                    }
                }
                         
          System.out.println("\n \n                                                     SORT BY Departure Time");
          System.out.println("Departure Name       Destination       Departure Time       Platform       Ticket Price"); 
          for(int z=0;z<=PnameArr.length-1;z++)
        {
            if(PFArr[z]==0 || PnameArr[z]==null)
            {
            }
            else
            {
             System.out.println(PnameArr[z]+"                  "
                    + ""+DesArr[z]+"                  "
                    + ""+df2.format(DepaArr[z])+"              "
                    + " "
                    + ""+PFArr[z]+"                 "
                    + ""+T_PriceArr[z]+"                         ");
            }
            
        }
            }
            
        }
        if(option==2)      // COHDSE202F-054- D.Gunasekara
        {
            for(int x=0;x<PnameArr.length-1;x++)
            {
                for(int y=0;y<PnameArr.length-x-1;y++)
                {
                    if(T_PriceArr[y]<T_PriceArr[y+1])
                    {
                        String tmp=PnameArr[y];
                        PnameArr[y]=PnameArr[y+1];
                        PnameArr[y+1]=tmp;
                        
                        String tmp2=DesArr[y];
                        DesArr[y]=DesArr[y+1];
                        DesArr[y+1]=tmp2;
                        
                        double tmp3=DepaArr[y];
                        DepaArr[y]=DepaArr[y+1];
                        DepaArr[y+1]=tmp3;
                        
                        int tmp4=PFArr[y];
                        PFArr[y]=PFArr[y+1];
                        PFArr[y+1]=tmp4;
                        
                        int tmp5=T_PriceArr[y];
                        T_PriceArr[y]=T_PriceArr[y+1];
                        T_PriceArr[y+1]=tmp5;
                        
                    }
                }
            }
              System.out.println("\n \n                                                     SORT BY Ticket Price");
          System.out.println("Departure Name       Destination       Departure Time       Platform       Ticket Price"); 
          for(int z=0;z<=PnameArr.length-1;z++)
        {
            if(PFArr[z]==0 || PnameArr[z]==null)
            {
            }
            else{
             System.out.println(PnameArr[z]+"                  "
                    + ""+DesArr[z]+"                  "
                    + ""+df2.format(DepaArr[z])+"              "
                    + " "
                    + ""+PFArr[z]+"                 "
                    + ""+T_PriceArr[z]+"                         ");
            }
            
        }
            
        }
        
        
    }
    
    
    
}

public class DoublyLinkedList 
{ 
  
    public static void main(String[] args) 
    {
       Scanner s1 = new Scanner(System.in);
       Scanner s2 = new Scanner(System.in);
        
        
         int Sele;
         do
         {
            System.out.println("Press 1 to Arrivals"); 
            System.out.println("Press 2 to Departures");
            Sele=s1.nextInt();
            if(Sele==1)
            {
                DoublyLinkedListArrivals L2=new DoublyLinkedListArrivals();
                System.out.println("Enter how many Arrivals in today : ");
                int count2=s1.nextInt();
                for(int c=0;c<count2;c++)
            {
                System.out.println("\n("+(c+1)+")");
                System.out.println("Enter Arrival Train No : ");
                String Ar_Tno=s2.nextLine();
                System.out.println("Enter Arrival Time : ");
                double Ar_Time=s1.nextDouble();
                System.out.println("Enter Passenger Count : ");
                int Ar_Passenger=s1.nextInt();
                System.out.println("Enter Platform Number : ");
                int Ar_Platform=s1.nextInt();
             
                L2.createNewNode(Ar_Tno, Ar_Time, Ar_Passenger, Ar_Platform);
            }
                L2.Sorting();
            }
            if(Sele==2)
            {
                DoublyLinkedListDeparture L1=new DoublyLinkedListDeparture(); 
                System.out.println("Enter how many Departures in today : ");
                int count=s1.nextInt();
         
                for(int c=0;c<count;c++)
            {
                System.out.println("**************************************************");
                System.out.println("**************************************************");
                System.out.println("("+(c+1)+")");
                System.out.println("Enter Passenger name:"); 
                String Pa_name=s2.nextLine();
                System.out.println("Enter Departure time:");
                double de_time=s1.nextDouble();
                System.out.println("Enter Platform Number:");
                int P_Number=s1.nextInt();
                System.out.println("Enter Destination:");
                String Des=s2.nextLine();
                System.out.println("Enter Ticket Price:");
                int T_Price=s1.nextInt();
                L1.createNewNode(Pa_name, Des ,de_time, P_Number,T_Price);
            }
         
         
    
         
         int select;
         do{
            System.out.println("**************************************************");
            System.out.println("**************************************************");    
            System.out.println("Press 1 to show all ID numbers in List with correct order"); 
            System.out.println("Press 2 to search ID Availbilty of List"); 
            System.out.println("Press 3 to remove selected ID from List");
            System.out.println("Press 4 to show all ID numbers in List with reverse order"); 
            System.out.println("Press 5 to Sort Departures List");
           
            
         
         select=s1.nextInt();
         if(select==1){
            System.out.println("Showing all ID's in List");
            System.out.println("**************************************************");
            System.out.println("**************************************************");
            L1.Show();
         }
         if(select==2)
         {
            System.out.println("**************************************************");    
            System.out.println("Enter name to check Availbilty of Passenger:");
            String SID=s2.nextLine();
            L1.Search(SID);
         }
         if(select==3)
         {
            System.out.println("**************************************************");    
            System.out.println("Enter ID to remove from List:");
            int n=s2.nextInt();
            L1.RemoveSearch(n);
            System.out.println("Check id is removed:");
            L1.Show();
         }
         if(select==4)
         {
            System.out.println("**************************************************");
            System.out.println("Showing all ID's in List revers order"); 
            L1.ReverseShow();
            L1.Show();
         }
         if (select==5)
         {
            System.out.println("**************************************************"); 
            L1.Sorting();
            
         }  
         else
         {
            System.out.println("select opition number is incorrect"); 
         }
         }while(select !=6);
            }
     }while(Sele !=7);
         
         
         
    }
    
}

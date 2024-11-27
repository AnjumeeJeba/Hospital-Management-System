package hospitalmng;
import java.util.Scanner;

public class MedicalProject{
  public static int point=0;
  public static int patId[]=new int[4];
  public static String patPass[]=new String[4];
  public static String patName[]=new String[4];
  public static String patGen[]=new String[4];
  public static String patProb[]=new String[4];
  public static String patTime[]=new String[4];
  
  public static int docId[]=new int[4];
  public static String docPass[]={"0","1","2","3"};
  public static String docName[]={"Addiction psychiatrist", "Allergist", "Cardiologist", "Colon and rectal surgeon"};
  public static String docPatName[][]=new String[4][4];
  public static String docPatGen[][]=new String[4][4];
  public static String docPatTime[][]=new String[4][4];
  
  public static Scanner sc=new Scanner(System.in);
  
  public static void main(String args[]){
    int option =1;
    while(option==1){
      System.out.println("Please enter your identity: ");
      System.out.println("1: Doctor \n2: Patient");
      String check=sc.nextLine();
      if(check.equals("1")){
        docDetails();
      }
      else if(check.equals("2")){
        patDetails();
      }
      else{
        System.out.println("Sorry, wrong option inserted! Please Try again.");
      }
      System.out.println("\nDo you want to continue the program ?\n1.Yes\n2.No");
      option =sc.nextInt();
      sc.nextLine();
    }
  }
  
  //Doctor Signup
  public static void docDetails(){
    System.out.println("0: Addiction psychiatrist\n 1: Allergist\n 2: Cardiologist\n 3: Colon and rectal surgeon");
    System.out.println("Please enter your id: ");
    int id=sc.nextInt();
    sc.nextLine();
    System.out.println("Please enter your password: ");
    String pass=sc.nextLine();
    if(id>=0 && id<=3){
      if(pass.equals(docPass[id])){
        System.out.println("\nHello "+docName[id]+".");
        System.out.println("\nYour today's patient list: ");
        int num=1;
        for(int i=0; i<4; i++){
          if(docPatName[id][i]!="null"){
            System.out.println(num+"."+docPatName[id][i]+" "+ docPatGen[id][i]+" "+docPatTime[id][i]);
            num++;
          }
        }
      }
      
      else{
        System.out.println("Wrong Password.");
      }
    }
    else{
      System.out.println("Wrong Id.");
    }
  }
  
  //Patient Signup
  public static void patDetails(){
    System.out.println("Are you a registered user ?");
    System.out.println("1: Yes \n2: No");
    String check=sc.nextLine();
    if(check.equals("1")){
      patSignIn();
    }
    else if(check.equals("2")){
      patSignUp();
    }
    else{
      System.out.println("Sorry, wrong option inserted! Please Try again.");
    }
  }
  
//For existing member check
  public static void patSignIn(){
    System.out.println("Please enter your id: ");
    int id=sc.nextInt();
    sc.nextLine();
    System.out.println("Please enter your password: ");
    String pass=sc.nextLine();
    if(id>=0 && id<=3){
      if(pass.equals(patPass[id])){
        System.out.println("Please select which doctor you want to visit:");
        System.out.println("1: Addiction psychiatrist\n 2: Allergist\n 3: Cardiologist\n 4: Colon and rectal surgeon");
        int choose=sc.nextInt();
        if(choose>=1 && choose<=4){
          if(choose==1){
            choose--;
            patProb[id]="Addiction psychiatrist";
            System.out.println("Please choose time range: ");
            System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
            int time=sc.nextInt();
            if(time==1){
              patTime[id]="10AM-11AM";
              docPatTime[choose][0]=patTime[id];
              docPatName[choose][0]=patName[id];
              docPatGen[choose][0]=patGen[id];
            }
            else if(time==2){
              patTime[id]="2PM-3PM";
              docPatTime[choose][1]=patTime[id];
              docPatName[choose][1]=patName[id];
              docPatGen[choose][1]=patGen[id];
            }
            else if(time==3){
              patTime[id]="6PM-7PM";
              docPatTime[choose][2]=patTime[id];
              docPatName[choose][2]=patName[id];
              docPatGen[choose][2]=patGen[id];
            }
            else if(time==4){
              patTime[id]="9PM-10PM";
              docPatTime[choose][3]=patTime[id];
              docPatName[choose][3]=patName[id];
              docPatGen[choose][3]=patGen[id];
            }
            else{
              System.out.println("Wrong option selected.");
            }
          }
          
          else if(choose==2){
            choose--;
            patProb[id]="Allergist";
            System.out.println("Please choose time range: ");
            System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
            int time=sc.nextInt();
            if(time==1){
              patTime[id]="10AM-11AM";
              docPatTime[choose][0]=patTime[id];
              docPatName[choose][0]=patName[id];
              docPatGen[choose][0]=patGen[id];
            }
            else if(time==2){
              patTime[id]="2PM-3PM";
              docPatTime[choose][1]=patTime[id];
              docPatName[choose][1]=patName[id];
              docPatGen[choose][1]=patGen[id];
            }
            else if(time==3){
              patTime[id]="6PM-7PM";
              docPatTime[choose][2]=patTime[id];
              docPatName[choose][2]=patName[id];
              docPatGen[choose][2]=patGen[id];
            }
            else if(time==4){
              patTime[id]="9PM-10PM";
              docPatTime[choose][3]=patTime[id];
              docPatName[choose][3]=patName[id];
              docPatGen[choose][3]=patGen[id];
            }
            else{
              System.out.println("Wrong option selected.");
            }
          }
          
          else if(choose==3){
            choose--;
            patProb[id]="Cardiologist";
            System.out.println("Please choose time range: ");
            System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
            int time=sc.nextInt();
            if(time==1){
              patTime[id]="10AM-11AM";
              docPatTime[choose][0]=patTime[id];
              docPatName[choose][0]=patName[id];
              docPatGen[choose][0]=patGen[id];
            }
            else if(time==2){
              patTime[id]="2PM-3PM";
              docPatTime[choose][1]=patTime[id];
              docPatName[choose][1]=patName[id];
              docPatGen[choose][1]=patGen[id];
            }
            else if(time==3){
              patTime[id]="6PM-7PM";
              docPatTime[choose][2]=patTime[id];
              docPatName[choose][2]=patName[id];
              docPatGen[choose][2]=patGen[id];
            }
            else if(time==4){
              patTime[id]="9PM-10PM";
              docPatTime[choose][3]=patTime[id];
              docPatName[choose][3]=patName[id];
              docPatGen[choose][3]=patGen[id];
            }
            else{
              System.out.println("Wrong option selected.");
            }
          }
          
          else if(choose==4){
            choose--;
            patProb[id]="Colon and rectal surgeon";
            System.out.println("Please choose time range: ");
            System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
            int time=sc.nextInt();
            if(time==1){
              patTime[id]="10AM-11AM";
              docPatTime[choose][0]=patTime[id];
              docPatName[choose][0]=patName[id];
              docPatGen[choose][0]=patGen[id];
            }
            else if(time==2){
              patTime[id]="2PM-3PM";
              docPatTime[choose][1]=patTime[id];
              docPatName[choose][1]=patName[id];
              docPatGen[choose][1]=patGen[id];
            }
            else if(time==3){
              patTime[id]="6PM-7PM";
              docPatTime[choose][2]=patTime[id];
              docPatName[choose][2]=patName[id];
              docPatGen[choose][2]=patGen[id];
            }
            else if(time==4){
              patTime[id]="9PM-10PM";
              docPatTime[choose][3]=patTime[id];
              docPatName[choose][3]=patName[id];
              docPatGen[choose][3]=patGen[id];
            }
            else{
              System.out.println("Wrong option selected.");
            }
          }
        }
      }
      else{
        System.out.println("Wrong Password.");
      }
    }
    else{
      System.out.println("Wrong Id.");
    }
  }
  
  
//for new member sign up
  public static void patSignUp(){
    if(point<4){ 
      System.out.println("Your id is: "+ point);
      int id=point;
      point++;
      
      System.out.println("Please enter your password: ");
      patPass[id]=sc.nextLine();
      
      System.out.println("Please enter your name: ");
      patName[id]=sc.nextLine();
      
      System.out.println("Please enter your Gender:\n1. Male\n2. Female");
      String gen=sc.nextLine();
      
      if(gen.equals("1")){
        patGen[id]="Male";
      }
      else{
        patGen[id]="Female";
      }
      
      System.out.println("Please select which doctor you want to visit:");
      System.out.println("1: Addiction psychiatrist\n 2: Allergist\n 3: Cardiologist\n 4: Colon and rectal surgeon");
      int choose=sc.nextInt();
      if(choose>=1 && choose<=4){
        if(choose==1){
          patProb[id]="Addiction psychiatrist";
          System.out.println("Please choose time range: ");
          System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
          int time=sc.nextInt();
          if(time==1){
            patTime[id]="10AM-11AM";
            docPatTime[choose][0]=patTime[id];
            docPatName[choose][0]=patName[id];
            docPatGen[choose][0]=patGen[id];
          }
          else if(time==2){
            patTime[id]="2PM-3PM";
            docPatTime[choose][1]=patTime[id];
            docPatName[choose][1]=patName[id];
            docPatGen[choose][1]=patGen[id];
          }
          else if(time==3){
            patTime[id]="6PM-7PM";
            docPatTime[choose][2]=patTime[id];
            docPatName[choose][2]=patName[id];
            docPatGen[choose][2]=patGen[id];
          }
          else if(time==4){
            patTime[id]="9PM-10PM";
            docPatTime[choose][3]=patTime[id];
            docPatName[choose][3]=patName[id];
            docPatGen[choose][3]=patGen[id];
          }
          else{
            System.out.println("Wrong option selected.");
          }
        }
        
        else if(choose==2){
          patProb[id]="Allergist";
          System.out.println("Please choose time range: ");
          System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
          int time=sc.nextInt();
          if(time==1){
            patTime[id]="10AM-11AM";
            docPatTime[choose][0]=patTime[id];
            docPatName[choose][0]=patName[id];
            docPatGen[choose][0]=patGen[id];
          }
          else if(time==2){
            patTime[id]="2PM-3PM";
            docPatTime[choose][1]=patTime[id];
            docPatName[choose][1]=patName[id];
            docPatGen[choose][1]=patGen[id];
          }
          else if(time==3){
            patTime[id]="6PM-7PM";
            docPatTime[choose][2]=patTime[id];
            docPatName[choose][2]=patName[id];
            docPatGen[choose][2]=patGen[id];
          }
          else if(time==4){
            patTime[id]="9PM-10PM";
            docPatTime[choose][3]=patTime[id];
            docPatName[choose][3]=patName[id];
            docPatGen[choose][3]=patGen[id];
          }
          else{
            System.out.println("Wrong option selected.");
          }
        }
        
        else if(choose==3){
          patProb[id]="Cardiologist";
          System.out.println("Please choose time range: ");
          System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
          int time=sc.nextInt();
          if(time==1){
            patTime[id]="10AM-11AM";
            docPatTime[choose][0]=patTime[id];
            docPatName[choose][0]=patName[id];
            docPatGen[choose][0]=patGen[id];
          }
          else if(time==2){
            patTime[id]="2PM-3PM";
            docPatTime[choose][1]=patTime[id];
            docPatName[choose][1]=patName[id];
            docPatGen[choose][1]=patGen[id];
          }
          else if(time==3){
            patTime[id]="6PM-7PM";
            docPatTime[choose][2]=patTime[id];
            docPatName[choose][2]=patName[id];
            docPatGen[choose][2]=patGen[id];
          }
          else if(time==4){
            patTime[id]="9PM-10PM";
            docPatTime[choose][3]=patTime[id];
            docPatName[choose][3]=patName[id];
            docPatGen[choose][3]=patGen[id];
          }
          else{
            System.out.println("Wrong option selected.");
          }
        }
        
        else if(choose==4){
          patProb[id]="Colon and rectal surgeon";
          System.out.println("Please choose time range: ");
          System.out.println("1: 10AM-11AM\n 2: 2PM-3PM\n 3: 6PM-7PM\n 4: 9PM-10PM");
          int time=sc.nextInt();
          if(time==1){
            patTime[id]="10AM-11AM";
            docPatTime[choose][0]=patTime[id];
            docPatName[choose][0]=patName[id];
            docPatGen[choose][0]=patGen[id];
          }
          else if(time==2){
            patTime[id]="2PM-3PM";
            docPatTime[choose][1]=patTime[id];
            docPatName[choose][1]=patName[id];
            docPatGen[choose][1]=patGen[id];
          }
          else if(time==3){
            patTime[id]="6PM-7PM";
            docPatTime[choose][2]=patTime[id];
            docPatName[choose][2]=patName[id];
            docPatGen[choose][2]=patGen[id];
          }
          else if(time==4){
            patTime[id]="9PM-10PM";
            docPatTime[choose][3]=patTime[id];
            docPatName[choose][3]=patName[id];
            docPatGen[choose][3]=patGen[id];
          }
          else{
            System.out.println("Wrong option selected.");
          }
        }
      }
    }
    else{
      System.out.println("Sorry pateient limit crossed for today.");
    }
  }
}
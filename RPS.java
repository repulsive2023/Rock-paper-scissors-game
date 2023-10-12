import java.util.*;
public  class RPS{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("0 is ROCK");
        System.out.println("1 is PAPER");
        System.out.println("2 is Scissor");
        int computer_choice;
        int mychoice;
        int me=0;
        int computer=0;
        int i=0;
        while(i<=5){
            Random rand=new Random();//used for rendom value
            computer_choice=rand.nextInt(2);
            mychoice=sc.nextInt();
            switch(mychoice){
                case 0:
                    System.out.println("You choose Rock");
                    break;
                case 1:
                        System.out.println("You choose Paper");
                        break;
                case 2:
                    System.out.println("You choose Scissor");
                    break;        
            }
            switch(computer_choice){
                case 0:
                    System.out.println("Computer choose Rock");
					break;
                case 1:
                    System.out.println("Computer choose paper");   
					break;					
                case 2:
                    System.out.println("Computer choose scissor");
							break;
            }
            if(computer_choice==mychoice){
                System.out.println("The game is  tie");
            }
                else if(computer_choice==0 && mychoice==1){
                    System.out.println("I win");
                    me++;
                 }
                 else if(computer_choice==0 && mychoice==2){
                    System.out.println("Computer win");
                    computer++;
                 }
                 else if(computer_choice==1 && mychoice==0){
                    System.out.println("computer win");
                    computer++;
                 }
                 else if(computer_choice==1 && mychoice==2){
                    System.out.println("I win");
                    me++;
                 }
                 else if(computer_choice==2 && mychoice==0){
                    System.out.println("I win");
                    me++;
                 }
                  else if(computer_choice==2 && mychoice==1){
                    System.out.println("computer  win");
                    computer++;
                 }
                 if(i==5){
                    break;
                 }
                 i++;
            }
            System.out.println("------------------------------------------------------------------");
            System.out.println("Computer: "+computer);
            System.out.println("Me: " +me);
            System.out.println("------------------------------------------------------------------");
            if(computer>me){
                System.out.println("Computer is win !!!! I loose");
            }
            else if(computer==me){
                System.out.println("The game is tie");
            }
            else{
                System.out.println("I won the match !! computer need moe practice");
            }

        }
    
    }

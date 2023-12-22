import java.util.*;
public class Main {
    public static void main(String[] args) {


        //int[] arry={11,45,2367,0,78,122};
       /*  switch(i){
            case 0:
                System.out.println("element at index " + i + " is : " +arry[i]);
                break;
            case 1:
                System.out.println("element at index " + i + " is : " +arry[i]);
                break;
            case 2:
                System.out.println("element at index " + i + " is : " +arry[i]);
                break;

            case 3:
                System.out.println("element at index " + i + " is : " +arry[i]);
                break;
            case 4:
                System.out.println("element at index " + i + " is : " +arry[i]);
                break;
            case 5:
                System.out.println("element at index " + i + " is : " +arry[i]);
                break;
            default:
                System.out.println("sorry index out of bound");
                break;

        }

        */
      //  int a=10;
      //  if(a==11){
    //        System.out.println("I am eleven");
      //  }
        //else{
          //  System.out.println("I am not eleven");
       // }
      /*  int totalMarks=0;
        System.out.println("enter marks  in each subject");
        for(int i=0;i<=3;i++){
            totalMarks+=sc.nextInt();
        }
        double totalpercent=totalMarks*100/4*outOf;
        if(totalpercent>40){
            System.out.println("you are pass");
        }
        else System.out.println("you are fail");


       */
        System.out.println("Lets play a game rock paper scisser");
        System.out.println("enter 0 for rock\n1 for paper \n2 for scissor ");

        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        for(int i=1;i>0;i++){
            System.out.println("enter");
            int a=sc.nextInt();
            int b=random.nextInt(2);
            if(a==b){
                System.out.println("Match tie");
                System.out.println(b);
            }
            if(a==0&&b==1){
                System.out.println("you are lose");
                System.out.println(b);
            }
            if (a==1&&b==0) {
                System.out.println("you are win");
                System.out.println(b);
            }

            if (a==1&&b==2) {
                System.out.println("you are lose");
                System.out.println(b);
            }
            if  (a==2&&b==1)  {
                System.out.println("you are win");
                System.out.println(b);
            }
            if(a==0&&b==2){
                System.out.println("you are win");
                System.out.println(b);
            }
            if(a==2&&b==0){
                System.out.println("you are lose");
                System.out.println(b);
            }

        }

    }
}

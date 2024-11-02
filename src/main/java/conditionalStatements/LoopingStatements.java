package conditionalStatements;

public class LoopingStatements {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println("good morning from while loop");
            if(i==3){
                break;

            }
        }
        int j = 1;
        do{
            System.out.println("good morning from do while loop");
            j++;
        }while(j<=5);

        for(int k=1;k<=5;k++){
            System.out.println("good morning from for loop");
            if(i==3){
            continue;
    }

        }
    }
}

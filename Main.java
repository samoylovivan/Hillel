package ivan.samoylov;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if((i%3 == 0) && (i%5 == 0)){
                System.out.print(" HelloWorld ");
                continue;
            }
            else if(i%5 == 0){
                System.out.print(" World ");
                continue;
            }
            else if(i%3 == 0){
                System.out.print(" Hello ");
                continue;
            }
            else System.out.print(i + " ");
        }

    }
}

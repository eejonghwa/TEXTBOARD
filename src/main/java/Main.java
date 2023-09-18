import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("명령어 : ");
            String command = scan.nextLine();
            if(command.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}

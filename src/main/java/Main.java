import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("명령어 : ");
            String command = scan.nextLine();
            String title = "";
            String content = "";
            if(command.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else if(command.equals("add")){
                System.out.print("게시물 제목을 입력해주세요 : ");
                title = scan.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                content = scan.nextLine();
                System.out.println("게시물이 등록되었습니다.");
            }else if(command.equals("list")){
                System.out.println("==================");
                System.out.printf("제목 : %s",title);
                System.out.printf("내용 : %s",content);
                System.out.println("==================");

            }
        }
    }
}

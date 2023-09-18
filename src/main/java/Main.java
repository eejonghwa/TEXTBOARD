import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> contents = new ArrayList<>();
        while (true) {
            System.out.print("명령어 : ");
            String command = scan.nextLine();
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                titles.add(scan.nextLine());
                System.out.print("게시물 내용을 입력해주세요 : ");
                contents.add(scan.nextLine());

                System.out.println("게시물이 등록되었습니다.");
            } else if (command.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < titles.size(); i++){
                    System.out.printf("제목 : %s", titles.get(i));
                    System.out.printf("내용 : %s", contents.get(i));
                    System.out.println("==================");
                }
            }else if(command.equals("update")){
                System.out.print("수정할 게시물 번호 : ");
                int target = scan.nextInt();

                scan.nextLine();

                System.out.print("제목 : ");
                String newTitle = scan.nextLine();
                System.out.print("내용 : ");
                String newContent = scan.nextLine();

                titles.set(target -1, newTitle);
                contents.set(target -1, newContent);
            }
        }
    }
}

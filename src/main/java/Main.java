import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ArrayList<String> titles = new ArrayList<>();
//        ArrayList<String> contents = new ArrayList<>();
        ArrayList<Article> articles = new ArrayList<>();
        while (true) {
            System.out.print("명령어 : ");
            String command = scan.nextLine();
            if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = scan.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = scan.nextLine();

                Article article = new Article(title, content);
                articles.add(article);

                System.out.println("게시물이 등록되었습니다.");
            } else if (command.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < articles.size(); i++) {
                    Article article = articles.get(i);

                    System.out.printf("번호 : %d", i + 1;
                    System.out.printf("제목 : %s", article.getTitle());
                    System.out.println("==================");
                }
            } else if (command.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int target = scan.nextInt();

                scan.nextLine();

                System.out.print("제목 : ");
                String newTitle = scan.nextLine();
                System.out.print("내용 : ");
                String newContent = scan.nextLine();

                Article newArticle = new Article(newTitle, newContent);
                articles.set(target-1, newArticle);

                System.out.println("수정이 완료되었습니다.");
            }
        }
    }
}

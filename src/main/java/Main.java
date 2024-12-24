import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        int lastNo = 0;
        String content = "";
        String[] contentList = new String[3];
        String author = "";
        String[] authorList = new String[3];

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            if (command.equals("종료")) {
                System.out.println("명언 앱을 종료합니다.");
                break;
            } else if (command.equals("등록")) {

                System.out.print("명언 : ");
                contentList[lastNo] = scanner.nextLine(); // 입력값 가져옴. 입력값이 없으면 기다린다. 엔터를 쳐야 입력이 완료됨. 그래야 넘어감

                System.out.print("작가 : ");
                authorList[lastNo] = scanner.nextLine();

                System.out.println("%d 번 명언이 등록되었습니다.".formatted(++lastNo));
                lastNo++;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("--------------------");

                for (int i = 0; i < 3; i++) {
                    System.out.println("$d / %s / %s".formatted(lastNo, authorList[i], contentList[i]));
                }
            }
        }
    }
}
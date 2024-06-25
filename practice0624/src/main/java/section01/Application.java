package section01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.확인하기");
            System.out.println("2.choose(when, otherwise)확인하기");
            System.out.println("3.foreach확인하기");
            System.out.println("4.trim(where,set) 확인하기");
            System.out.println("9.종료하기");
            System.out.println("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : ifSubMenu();  break;
//            case 2 : chooseSubMenu(); break;
//            case 3 : foreachSubMenu(); break;
//            case 4 : trimSubMenu(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    return;
            }
        } while (true);


        private void ifSubMenu () {

            Scanner sc = new Scanner(System.in);
            MenuService menuService = new MenuService();

            do {
                System.out.println("1.원하는금액대에 적합한 추천 메뉴 목록보여주기 :");
                System.out.println("2. 메뉴이름 또는 카테고리명으로 검색하여 메뉴 목록보여주기 :");
                System.out.println("9.이전 메뉴로 :");
                System.out.println("메뉴번호를 입력하세요 :");
                int no = sc.nextInt();

                switch (no) {
                    case 1:
                        menuService.selectMenuByPrice(inputPrice());
                        break;
//            case 2 : menuService.searchMenu(inputSearchCriteria()); break;
                    case 9:
                        return;
                }

            } while (true);


        }

        private int inputPrice () {
            Scanner sc = new Scanner(System.in);
            System.out.println("검색하실 가격의 최대금액을 입력해주세요 :");
            int price = sc.nextInt();
            return price;
        }

//    private void chooseSubMenu() {
//        Scanner sc = new Scanner(System.in);
//
//    }
//
//
//    private void foreachSubMenu() {
//        Scanner sc = new Scanner(System.in);
//
//    }
//
//
//    private void trimSubMenu() {
//        Scanner sc = new Scanner(System.in);
//
//
//    }

    }
}

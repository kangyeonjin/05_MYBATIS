package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class MenuController {

    /*
     * controller
     * 뷰와 모델사이의 전달자역할
     * 모델에게 명령을 전달해주는 역할로, 모델의상태를 변경할수있다
     * 뷰에 명령을 보냄으로서 모델의 표시방법을 바꿀수있다
     *
     * service 알고있어야한다
     * */
    private final MenuService menuService;
    private final PrintResult printResult;

    // 생성자 주입
    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        //view로 전달
        if(menuList != null){
            printResult.printMenuList(menuList);

        }else {
            printResult.printErrorMessage("selectList");
        }

    }
}
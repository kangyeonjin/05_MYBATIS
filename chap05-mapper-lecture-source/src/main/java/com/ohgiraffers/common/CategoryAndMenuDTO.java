package com.ohgiraffers.common;
//카테고리 기준으로 조인

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CategoryAndMenuDTO {

    private int code;
    private String name;
    private int refCategoryCode;

    private List<MenuDTO> menuList;

}

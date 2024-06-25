package section01;

import common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static common.Template.getSqlSession;

public class MenuService {

    private DynamicSqlMapper mapper;

    public void selectMenuByPrice(int price){

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        Map<String, Integer> map = new HashMap<>();
        map.put("price", price);

        List<MenuDTO> menuList = mapper.selectMenuByPrice(map);

    }

}

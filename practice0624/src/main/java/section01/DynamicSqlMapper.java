package section01;

import common.MenuDTO;

import java.awt.*;
import java.util.Map;

public interface DynamicSqlMapper {

    List<MenuDTO> selectMenuByPrice(Map<String, Integer> map);


}

import java.util.*;

/**
 * @author zhaowq
 * @date 2018/11/6
 */
public class Test {

    @org.junit.Test
    public void test(){
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", "1");
        map.put("name2", "2");
        map.put("name3", "1");
        map.put("name", "1");
        map.put("name4", "1");
        map.put("name", "3");
        for (String key:map.keySet()){
            System.out.println(key +"--"+map.get(key));
        }
    }
}

package test;

import java.util.HashMap;

/**
 * @author cao yuan tai
 * @date 2019-01-17 上午 10:42
 */
public class BugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","徐爱");
        map.put("age","22");
        map.put("school","兰州交通大学");
        map.put("major","电子信息工程");

        String name = map.get("name");
        System.out.println(name);

        String age = map.get("age");
        System.out.println(age);

        String school = map.get("school");
        System.out.println(school);

        String major = map.get("major");
        System.out.println(major);

        map.remove("major");
        System.out.println(map);

    }
}

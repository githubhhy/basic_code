package Demo31;

import java.util.ArrayList;

public class Demo31 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User("heima001", "user1", "1111");
        User user2 = new User("heima002", "user2", "2222");
        User user3 = new User("heima003", "user3", "3333");
        list.add(user1);
        list.add(user2);
        list.add(user3);

        boolean result = searchId(list, "heima002");
        System.out.println(result);
    }

    public static boolean searchId(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if(  list.get(i).getId().equals(id)  )
                return true;
        }
        return false;
    }
}

package Demo21;
import Demo21.Role;

public class Demo21 {
    public static void main(String[] args) {
        Role role1 = new Role("瑞幸", 100, true);
        Role role2 = new Role("星巴克", 100, false);
        int count = 1 ;
        while (role1.getBlood()>0 && role2.getBlood()>0) {
            System.out.println("回合"+count+": ");
            if (role1.getBlood()>0 && role2.getBlood()>0)
                role1.attack(role2);
            if (role1.getBlood()>0 && role2.getBlood()>0)
                role2.attack(role1);
            System.out.println('\t'+role1.getName()+" 剩余血量: "+role1.getBlood());
            System.out.println('\t'+role2.getName()+" 剩余血量: "+role2.getBlood());
            count++;
        }

    }
}

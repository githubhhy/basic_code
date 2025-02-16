package Demo21;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private boolean gender;
    private String face;

    private String[] face_arr_1 = {"漂亮男","中等男","丑男"};
    private String[] face_arr_0 = {"漂亮女","中等女","丑女"};

    private String[] kungfu = new String[]{"降龙十八掌","九阴白骨爪","一阳指","大威天龙","铁山靠"};

    public Role() {}
    public Role(String name, int blood, boolean gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        Random random = new Random();
        this.face = (gender) ? face_arr_1[random.nextInt(face_arr_1.length)] : face_arr_0[random.nextInt(face_arr_0.length)] ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String getFace() {
        return face;
    }
    public void setFace(String face) {
        this.face = face;
    }

    public void attack(Role role){
        Random random = new Random();
        int hert = random.nextInt(20)+1;
        if (role.getBlood()>hert) {
            role.setBlood(role.getBlood()-hert);
            System.out.println('\t'+this.getName()+" 使用 \""+kungfu[random.nextInt(kungfu.length)]+"\" 对 "+role.getName()+" 造成了"+hert+"伤害");
        }else {
            role.setBlood(0);
            System.out.println('\t'+this.getName()+" 使用 \""+kungfu[random.nextInt(kungfu.length)]+"\" 对 "+role.getName()+" 造成了"+hert+"伤害");
            System.out.println('\t'+role.getName()+" 被击败了");
        }
    }
    
}

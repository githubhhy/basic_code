public class Demo25 {
    public static void main(String[] args) {
        String phonenumber = "19157681058";
        String start = phonenumber.substring(0, 3);
        String end = phonenumber.substring(7);
        String result = start+"****" +end;
        System.out.println(result);


        String idnumber = "411528200203290413";
        String born_year = idnumber.substring(6, 10);
        String born_month = idnumber.substring(10, 12);
        String born_day = idnumber.substring(12, 14);

        System.out.println(born_year+"年"+born_month+"月"+born_day+"日出生");

        char gender = idnumber.charAt(16);
        int gender_number = gender - '0';
        if (gender_number % 2 == 0) {
            System.out.println("女");
        } else {
            System.out.println("男");
        }


        String talk = "你玩的真好,CNM,以后不要再玩了,TMD";
        String[] arr = {"TMD","CNM","SB","MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replaceAll(arr[i], "***");
        }
        System.out.println(talk);
    }
}

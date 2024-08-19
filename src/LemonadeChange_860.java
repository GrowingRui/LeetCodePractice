public class LemonadeChange_860 {
    public static boolean lemonadeChange(int[] bills) {
        boolean res = true;
        int five = 0, ten = 0;
        for (int i = 0; i < bills.length && res; i++){
            switch (bills[i]){
                case 5:
                    five++;
                    break;
                case 10:
                    ten++;
                    if (five > 0){
                        five--;
                    }else {
                        res = false;
                    }
                    break;
                case 20:
                    if (ten > 0 && five > 0){
                        ten--;
                        five--;
                    } else if (five >= 3) {
                        for (int j = 0; j < 3; j++){
                            five--;
                        }
                    }else {
                        res = false;
                    }
                    break;
            }
        }
        return res;
    }
    public static boolean lemonadeChange2(int[] bills){
        boolean res = true;
        int five = 0, ten = 0;
        for (int i = 0; i < bills.length && res; i++){
            if (bills[i] == 5){
                five++;
            } else if (bills[i] == 10) {
                ten++;
                if (five > 0){
                    five--;
                }else {
                    res = false;
                }
            }else {
                if (ten > 0 && five > 0){
                    ten--;
                    five--;
                } else if (five >= 3) {
                    for (int j = 0; j < 3; j++){
                        five--;
                    }
                }else {
                    res = false;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

        int[] bills = {5, 5, 5, 10, 20};
        System.out.println(lemonadeChange2(bills));

    }
}

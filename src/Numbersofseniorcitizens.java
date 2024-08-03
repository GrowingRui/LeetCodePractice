public class Numbersofseniorcitizens {
    public int countSeniors(String[] details) {
        int x = 0;
        for (int i = 0; i < details.length; i++){
            String age = details[i].substring(11,13);
            if (Integer.parseInt(age) > 60){
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] x = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        Numbersofseniorcitizens obj = new Numbersofseniorcitizens();
        System.out.println(obj.countSeniors(x));
    }
}

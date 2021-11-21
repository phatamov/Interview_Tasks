public class Triangle {

//    *****
//    ****
//    ***
//    **
//    *

    public static void main(String[] args) {

        triangle(5);

    }

    public static void triangle(int num){
        String str;
        for (int i = 0; i < num; i++) {
            str = "";
            for (int j = i; j < num; j++) {
                str += "* ";
            }
            System.out.println(str);
        }
        System.out.println();

    }

}

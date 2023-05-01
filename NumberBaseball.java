import java.util.Random;

public class CompNum {
    public static void main(String[] args) {
        Random random = new Random();
        String[] compNum = new String[4];
        for(int i=0; i<4; i++) { //중복제외 변수 생성
            int n = random.nextInt(10);
            compNum[i] = Integer.toString(n);
            for(int j=0; j<i; j++) {
                if(compNum[i].equals(compNum[j])) {
                    i--;
                }
            }
        }
//        for (String s : compNum) {
//            System.out.print(s);
//        }

    }

}

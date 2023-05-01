package org.example;


public class Validator {
    private int[] data;

    Validator(int[] data) {
        this.data = data;
    }
    private boolean checkError (){
//길이가 짧은 경우
        if (data.length!=4){
            return false;
        }

        for(int i=0;i<4;i++) {
//입력 값이 0~9의 범위를 벗어나는 경우
            if (data[i] < 0 || data[i] > 9) {
                return false;
            }
// 중복 체크
            for (int j = i + 1; j < 4; j++) {
                if (data[i] == data[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public String getError() {
        if (!checkError()) {
            return "Error: Invalid input. Please enter four unique numbers between 0 and 9.";
        }
        return null;
    }
    public static void main(String[] args) {
        int[] testData = {1, 2, 3, 4};
        Validator validator = new Validator(testData);
        System.out.println("checkError : "+validator.checkError());
        System.out.println("getError : "+validator.getError());
    }
}
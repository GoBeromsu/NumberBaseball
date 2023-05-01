package org.example;

import java.util.ArrayList;
import java.util.List;

public class countBC {

    List<Integer> countBC(int[] inputNum, int[] randomNum){
        List<Integer> list = new ArrayList<>();
        int B=0; int C=0;
        for(int i=0;i<4;i++){
            if(randomNum[i] ==inputNum[i]){
                B++;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(randomNum[i]==inputNum[j] && randomNum[i]!=inputNum[i]){
                    C++;
                }
            }
        }
        list.add(B);
        list.add(C);
        return list;
    }



}

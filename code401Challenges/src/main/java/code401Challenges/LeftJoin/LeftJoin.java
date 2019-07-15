package code401Challenges.LeftJoin;


import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {

    public ArrayList<Object> joinHashMaps(HashMap<String, String> one, HashMap<String, String> two){
        ArrayList<Object> answer = new ArrayList<>();
        ArrayList<String> temp;

        for(String str : one.keySet()){
            temp = new ArrayList<>();
            temp.add(str);
            temp.add(one.get(str));
            temp.add(two.get(str));
            answer.add(temp);
        }

        return answer;
    }

}

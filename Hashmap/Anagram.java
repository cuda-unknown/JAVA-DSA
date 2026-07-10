package Hashmap;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String name="sohi";
        String dame="ohsima";

        boolean check=false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:name.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:dame.toCharArray()){
            if(map.containsKey(ch)){
                check=true;
            }
            else check=false;
            map.put(ch, map.getOrDefault(ch, 0)+1);
            
            // if(map.containsKey(ch)){
            //     map.put(ch, map.getOrDefault(ch,0)-1);
            // }
        }
        
        System.out.println(check);
        System.out.println(map);

    }
}

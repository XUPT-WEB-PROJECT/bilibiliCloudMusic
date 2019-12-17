package util;

public class ParamJudge {

    public static boolean isNOTPositive(Integer ... integer){
        for (Integer i : integer) if(i == null || i <0 )return true;
        return false;
    }

}

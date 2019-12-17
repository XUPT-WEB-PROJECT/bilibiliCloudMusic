package util;

public class ParamJudge {

    public static boolean isPositive(Integer ... integer){
        for (Integer i : integer) if(i == null || i <0 )return false;
        return true;
    }

}

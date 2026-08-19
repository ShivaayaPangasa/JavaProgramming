package Module2.Q01_MathUtils;

import Module2.Q01_MathUtils.utilities.MathUtils;

public class PackageUse{
    public static void main(String[] args){
        MathUtils utils = new MathUtils();
        int result = utils.add(5, 6);
        System.out.println(result);
    }
}

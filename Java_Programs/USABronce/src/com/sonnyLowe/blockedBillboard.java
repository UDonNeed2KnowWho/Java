package com.sonnyLowe;
import java.lang.Math;
import java.lang.*;

public class blockedBillboard {
    public static Integer blockedBillboard(int x11, int y11, int x12, int y12, int x21, int y21, int x22, int y22){
        // if not covering any corners:
            // bottom right case, bottom left case, top right case, top left case
        if((x21 > x11 && y22 < y12) || (x22 < x12 && y22 < y12) || (x21 < x11 && y21 > y11) || (x22 < x12 && y21 > y11)){
            System.out.println("not covering any corners");
            return (y12-y11)*(x12-x11);
        }
        //if covering at least 2 corners
            //right/left cases (y's are greater or equal)
        if(y21 <= y11 && y22 >= y12){
            //right
            if(((x21-x11) > 0) && ((x22-x12) >= 0)){
                System.out.println("y's are greater or equal ~ right");
                return (x21-x11)*(y12-y11);
            }
            //left
            if(((x21-x11) <= 0) && ((x12-x22) > 0)){
                System.out.println("y's are greater or equal ~ left");
                return (x12-x22)*(y12-y11);
            }
            //middle
            if (((x21-x11) > 0) && ((x22-x12) < 0)){
                System.out.println("y's are greater or equal ~ middle");
                return (y12-y11)*(x12-x11);
            }
            //equal (works for all cases when good billboard is larger than the bad billboard)
            if (((x21-x11) <= 0) && ((x22-x12) >= 0)){
                System.out.println("y's are greater or equal ~ equal");
                return 0;
            }
            // done with 4 cases
        }
        // done with right/left cases

        //if covering at least two corners
            // x's are greater or equal (do not have to do equals case. Specified already above)
        if(x21 <= x11 && x22 >= x12){
            //top
            if(y22 >= y12 && y21 > y11){
                return (y21-y11)*(x12-x11);
            }
            //bottom
            if(y22 < y12 && y21 <= y11){
                return (y12-y22)*(x12-x11);
            }
            //middle
            if(y22 < y12 && y21 > y11){
                return (y12-y11)*(x12-x11);
            }
        }

        return 404;

    }
}

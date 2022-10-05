package Helper;

import java.awt.*;

public class helper {
    public static int screenCenterLoc(String eksen, Dimension size){
        int point =0;
        switch (eksen){
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
                break;
            case "y":
                point = (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) /2;
                break;
            default:
                point=0;
        }
        return point;
    }
}

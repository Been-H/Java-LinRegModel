import javax.sound.sampled.Line;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        LinearRegression linreg = new LinearRegression();
        double[] xData = {1,2,3,4,5,6,7,8};
        double[] yData = {30, 45, 51, 57, 60, 65, 70, 71};
        linreg.fit(xData, yData);
        System.out.println(linreg.predict(4));
    }

}

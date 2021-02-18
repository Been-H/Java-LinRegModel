public class LinearRegression {

    private int lengthData;
    private double slope;
    private double yIntrercept;

    public LinearRegression() {}

    public double getSlope() {
        return slope;
    }

    public double getyIntrercept() {
        return yIntrercept;
    }

    public double sigma(double[] arr, boolean squared) {
        double sum = 0;
        for (double val : arr) {
            if (squared) {
                sum += val*val;
            }
            else {
                sum += val;
            }
        }
        return sum;
    }

    public double sigma(double[] xArr, double[] yArr) {
        double sum = 0;
        for (int i = 0; i < xArr.length; i++) {
            sum += (xArr[i] * yArr[i]);
        }
        return sum;
    }

    public void fit(double[] xData, double[] yData) {
        lengthData = xData.length;

        slope = (lengthData*sigma(xData, yData) - (sigma(xData, false)*sigma(yData, false)))
                        /
                (lengthData*sigma(xData, true)-sigma(xData, false)*sigma(xData, false));

        yIntrercept = (sigma(yData, false)-(slope*sigma(xData, false)))/lengthData;
    }

    public double predict(double xVal) {
        return slope*xVal + yIntrercept;
    }

}



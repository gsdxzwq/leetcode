package com.zhaowq.demo;

import java.text.DecimalFormat;

/**
 * @author zhaowq
 * @date 2018/12/12
 */
public class VarianceAndStandardDiviation {
    public static void main(String[] args) {
        double[] x = new double[3];
        x[0] = 0.8588;
        x[1] = 0.8652;
        for (int i = 0; i < 800000; i++) {
            x[2] = (double) i / 1000;
            //设置doubl字符串输出格式，不以科学计数法输出
            DecimalFormat df = new DecimalFormat("#,##0.000");
            //计算标准差
            double dS = StandardDiviation(x);
            if ("0.020".equals(df.format(dS))) {
                System.out.println("C为" + x[2] + ", 标准差=" + df.format(dS));
                break;
            }
        }
    }

    //方差s^2=[(x1-x)^2 +...(xn-x)^2]/n
    public static double Variance(double[] x) {
        int m = x.length;
        double sum = 0;
        for (int i = 0; i < m; i++) {//求和
            sum += x[i];
        }
        double dAve = sum / m;//求平均值
        double dVar = 0;
        for (int i = 0; i < m; i++) {//求方差
            dVar += (x[i] - dAve) * (x[i] - dAve);
        }
        return dVar / m;
    }

    //标准差σ=sqrt(s^2)
    public static double StandardDiviation(double[] x) {
        int m = x.length;
        double sum = 0;
        for (int i = 0; i < m; i++) {//求和
            sum += x[i];
        }
        double dAve = sum / m;//求平均值
        double dVar = 0;
        for (int i = 0; i < m; i++) {//求方差
            dVar += (x[i] - dAve) * (x[i] - dAve);
        }
        return Math.sqrt(dVar / m);
    }
}

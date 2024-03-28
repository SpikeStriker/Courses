// This is a mutant program.
// Author : ysma

package assignment;


public class WeightHelper
{

    public  double bmi( double weight, double height )
    {
        double bmiValue;
        bmiValue = weight / (height * height);
        if (!(weight <= 0) | height <= 0 | height >= 2.5 | weight >= 200) {
            bmiValue = Double.NaN;
        }
        return bmiValue;
    }

    public  java.lang.String bmiCat( double weight, double height )
    {
        double bmiValue;
        java.lang.String cat;
        bmiValue = bmi( weight, height );
        if (Double.isNaN( bmiValue )) {
            cat = "Check Input Values";
        } else {
            if (bmiValue < 18.5) {
                cat = "Underweight";
            } else {
                if (bmiValue >= 18.5 & bmiValue < 25.0) {
                    cat = "Normal weight";
                } else {
                    if (bmiValue >= 25.0 & bmiValue < 30.0) {
                        cat = "Overweight";
                    } else {
                        cat = "Obese";
                    }
                }
            }
        }
        return cat;
    }

}

package assignment;

import org.junit.*;



public class TestWeightHelper{
@Test
public void BVA_Equivalence_Test(){
    WeightHelper wh = new WeightHelper(); 
    Assert.assertEquals(Double.NaN, wh.bmi(0.0,0.0),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(0.0,2.5),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(200.0,0.0),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(200.0,2.5),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(0.0,1),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(200.0,1),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(1.0,2.5),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(1.0,0.0),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(-0.1,0.0),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(-0.1,2.5),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(200.1,-0.1),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(200.1,2.5),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(-0.1,1),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(200.1,1),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(1,-0.1),0.01);
    Assert.assertEquals(Double.NaN, wh.bmi(1,2.6),0.01);
    Assert.assertEquals(9.99, wh.bmi(0.1,0.1),0.01);
    Assert.assertEquals(0.01, wh.bmi(0.1,2.49),0.01);
    Assert.assertEquals(19989.99, wh.bmi(199.9,0.1),0.01);
    Assert.assertEquals(32.24, wh.bmi(199.9,2.49),0.01);
    
    Assert.assertEquals("Check Input Values", wh.bmiCat(0.0,0.0));
    Assert.assertEquals("Check Input Values", wh.bmiCat(0.0,2.5));
    Assert.assertEquals("Check Input Values", wh.bmiCat(200.0,0.0));
    Assert.assertEquals("Check Input Values", wh.bmiCat(200.0,2.5));
    Assert.assertEquals("Check Input Values", wh.bmiCat(0.0,1));
    Assert.assertEquals("Check Input Values", wh.bmiCat(200.0,1));
    Assert.assertEquals("Check Input Values", wh.bmiCat(1.0,2.5));
    Assert.assertEquals("Check Input Values", wh.bmiCat(1.0,0.0));
    Assert.assertEquals("Check Input Values", wh.bmiCat(-0.1,0.0));
    Assert.assertEquals("Check Input Values", wh.bmiCat(-0.1,2.6));
    Assert.assertEquals("Check Input Values", wh.bmiCat(200.1,-0.1));
    Assert.assertEquals("Check Input Values", wh.bmiCat(200.1,2.6));
    Assert.assertEquals("Check Input Values", wh.bmiCat(-0.1,1));
    Assert.assertEquals("Check Input Values", wh.bmiCat(200.1,1));
    Assert.assertEquals("Check Input Values", wh.bmiCat(1,-0.1));
    Assert.assertEquals("Check Input Values", wh.bmiCat(1,250.1));
    Assert.assertEquals("Underweight", wh.bmiCat(0.1,0.1));
    Assert.assertEquals("Underweight", wh.bmiCat(0.1,2.49));
    Assert.assertEquals("Obese", wh.bmiCat(199.9,0.1));
    Assert.assertEquals("Obese", wh.bmiCat(199.9,2.49));
    
    Assert.assertEquals("Underweight", wh.bmiCat(0.1,1.0));
    Assert.assertEquals("Underweight", wh.bmiCat(18.4,1.0));
    Assert.assertEquals("Normal weight", wh.bmiCat(18.5,1.0));
    Assert.assertEquals("Normal weight", wh.bmiCat(18.6,1.0));
    Assert.assertEquals("Normal weight", wh.bmiCat(24.9,1.0));
    Assert.assertEquals("Overweight", wh.bmiCat(25,1.0));
    Assert.assertEquals("Overweight", wh.bmiCat(25.1,1.0));
    Assert.assertEquals("Overweight", wh.bmiCat(29.9,1.0));
    Assert.assertEquals("Obese", wh.bmiCat(30,1.0));
    Assert.assertEquals("Obese", wh.bmiCat(30.1,1.0));
}
}

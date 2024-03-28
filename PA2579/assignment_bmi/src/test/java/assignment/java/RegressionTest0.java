package assignment.java;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.Class<?> wildcardClass1 = weightHelper0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) ' ', (double) (byte) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        java.lang.String str6 = weightHelper0.bmiCat((double) (short) 10, 10.0d);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        double double18 = weightHelper0.bmi((double) 100L, (double) '#');
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        java.lang.String str6 = weightHelper0.bmiCat((double) 1.0f, (double) 1L);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi(10.0d, (double) ' ');
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) (byte) 0, (double) 0L);
        java.lang.String str18 = weightHelper0.bmiCat((double) 'a', (double) (byte) 1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) (-1));
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) (short) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        java.lang.String str6 = weightHelper0.bmiCat((double) (byte) 1, 10.0d);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) '#');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 100.0f, (double) 100.0f);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) '#', (double) 'a');
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat(100.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) ' ', 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 100, (double) 'a');
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat(32.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 1L);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) 'a');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1, (double) (short) 100);
        double double21 = weightHelper0.bmi(10.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) 0.0f, 32.0d);
        double double6 = weightHelper0.bmi(100.0d, (double) 0L);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 100, 1.0d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 100, 1.0d);
        java.lang.String str12 = weightHelper0.bmiCat(32.0d, (double) (-1));
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) (short) 100, (double) (short) -1);
        double double27 = weightHelper0.bmi((double) (-1L), (double) (byte) -1);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) '#');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) 0L, (double) 'a');
        java.lang.String str21 = weightHelper0.bmiCat(Double.NaN, (double) 0.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.String str24 = weightHelper0.bmiCat((double) 100.0f, (double) 100);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) 1L, (double) '4');
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) 0L, (double) 'a');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0L, (double) 100);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        double double18 = weightHelper0.bmi((double) 'a', (double) (short) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        double double15 = weightHelper0.bmi(10.0d, (double) ' ');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) 0L, (double) 'a');
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (short) -1, (double) (short) -1);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 100, 1.0d);
        double double12 = weightHelper0.bmi((double) (byte) 100, (double) 0.0f);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 10, (double) ' ');
        double double15 = weightHelper0.bmi((double) (byte) 0, (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) ' ', (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) 100, (double) (-1L));
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1, (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 10, (double) ' ');
        double double15 = weightHelper0.bmi((-1.0d), Double.NaN);
        double double18 = weightHelper0.bmi((double) (-1.0f), (double) 10.0f);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) (-1), (double) (short) 1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) 100L, (double) (-1));
        double double21 = weightHelper0.bmi((double) '4', (double) 10);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 10, (double) ' ');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        double double18 = weightHelper0.bmi((-1.0d), (double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) (short) 100, (double) (short) -1);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) (-1));
        double double18 = weightHelper0.bmi(1.0d, (double) (byte) 100);
        double double21 = weightHelper0.bmi((double) 0L, (double) (byte) -1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) (short) 10);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi(0.0d, (double) (short) 1);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) (-1L), (double) 10L);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((-1.0d), (double) (byte) 0);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10, (double) 0);
        double double27 = weightHelper0.bmi(Double.NaN, (double) 10);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi((double) (byte) 100, (double) (byte) 0);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 10, (-1.0d));
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi((-1.0d), (double) 10L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) (short) 10);
        double double24 = weightHelper0.bmi(32.0d, Double.NaN);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        double double21 = weightHelper0.bmi((double) (-1L), (double) (byte) 1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((-1.0d), (double) 0);
        double double27 = weightHelper0.bmi(Double.NaN, (double) (short) 10);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.String str9 = weightHelper0.bmiCat((double) (-1L), (double) 1.0f);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) '4');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        double double18 = weightHelper0.bmi((double) 100L, (double) '#');
        double double21 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        java.lang.String str18 = weightHelper0.bmiCat((double) 10, (double) (short) 100);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat(100.0d, (double) (short) 0);
        double double6 = weightHelper0.bmi((double) 0.0f, 0.0d);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi(0.0d, (double) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) 0, 32.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (double) '4');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1L, 100.0d);
        double double21 = weightHelper0.bmi((double) 100.0f, (double) (short) -1);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10.0f, Double.NaN);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10L, (double) 1.0f);
        double double24 = weightHelper0.bmi((double) 0L, (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Underweight" + "'", str21, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat(32.0d, (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) 0, (double) 10.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) 0, 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10, 0.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) 'a', (double) 0);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        java.lang.String str18 = weightHelper0.bmiCat((double) 10, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((double) 0, (double) (byte) 100);
        double double24 = weightHelper0.bmi(10.0d, (double) 0L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10.0f, (double) '4');
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) 10, (double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) (-1.0f));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10L, (double) 1.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Underweight" + "'", str21, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (-1L), 1.0d);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) '#', (double) 'a');
        double double12 = weightHelper0.bmi(0.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) 0L, (double) (-1));
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) ' ', 100.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat((double) (-1), Double.NaN);
        double double12 = weightHelper0.bmi(1.0d, (double) 10.0f);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 10, (double) ' ');
        double double15 = weightHelper0.bmi((-1.0d), Double.NaN);
        double double18 = weightHelper0.bmi((double) '4', (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat(0.0d, (double) 10L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) -1, (double) 1L);
        double double18 = weightHelper0.bmi((double) (-1), (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) '#', (double) 100);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) ' ', 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 100, (double) 'a');
        double double24 = weightHelper0.bmi((double) 1, (double) 10L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (double) '4');
        double double18 = weightHelper0.bmi((-1.0d), 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((-1.0d), 1.0d);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10L, (double) 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) (-1.0f), 0.0d);
        java.lang.String str24 = weightHelper0.bmiCat((double) 0, (double) 100.0f);
        double double27 = weightHelper0.bmi((double) 100L, (-1.0d));
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi(1.0d, Double.NaN);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.String str24 = weightHelper0.bmiCat((double) 0.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10, 0.0d);
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 100.0f, (double) 100.0f);
        java.lang.String str21 = weightHelper0.bmiCat(0.0d, 1.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, (double) 0L);
        double double21 = weightHelper0.bmi(32.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        double double9 = weightHelper0.bmi((double) 10L, (double) 10L);
        double double12 = weightHelper0.bmi(32.0d, (double) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.String str9 = weightHelper0.bmiCat((double) (byte) 1, (double) (byte) 100);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) (-1));
        double double18 = weightHelper0.bmi((double) (-1L), (double) 1.0f);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 10.0f);
        java.lang.String str12 = weightHelper0.bmiCat((double) 0, (double) '#');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) (-1.0f), 0.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) (-1L), (double) '#');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((-1.0d), (double) (byte) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0L, (double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10.0f, (double) (byte) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) 1, (double) '#');
        java.lang.String str12 = weightHelper0.bmiCat((double) '#', (double) 100.0f);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        java.lang.String str9 = weightHelper0.bmiCat((double) (-1L), (double) (-1.0f));
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        double double15 = weightHelper0.bmi(10.0d, (double) ' ');
        double double18 = weightHelper0.bmi((double) 100L, (-1.0d));
        double double21 = weightHelper0.bmi((double) 1, 100.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((-1.0d), (double) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double18 = weightHelper0.bmi((double) 100.0f, (double) (byte) 10);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (-1L), 1.0d);
        double double18 = weightHelper0.bmi((double) (-1), (double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, 10.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) '#', (double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        double double15 = weightHelper0.bmi((double) 1L, (double) (-1L));
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, 10.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) '#', (double) (byte) -1);
        java.lang.String str18 = weightHelper0.bmiCat((double) '4', (double) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (-1), (double) (short) -1);
        java.lang.String str24 = weightHelper0.bmiCat((double) 0L, (double) 100L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, (double) 10);
        java.lang.String str30 = weightHelper0.bmiCat((double) 100.0f, (double) 0);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) 10, (double) (byte) -1);
        double double18 = weightHelper0.bmi((double) (-1.0f), 1.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi(0.0d, (double) (short) 1);
        java.lang.String str24 = weightHelper0.bmiCat(1.0d, 0.0d);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Underweight" + "'", str15, "Underweight");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) 100L, (double) (-1));
        java.lang.String str21 = weightHelper0.bmiCat((double) 0L, (double) '#');
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10.0f, (double) '4');
        java.lang.String str21 = weightHelper0.bmiCat((double) (short) 10, (double) (byte) 10);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 1L);
        java.lang.String str18 = weightHelper0.bmiCat((double) 1L, (double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) (-1));
        double double18 = weightHelper0.bmi((double) 100, (double) ' ');
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 1.0f, (double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double18 = weightHelper0.bmi((double) 100.0f, (double) (byte) 10);
        java.lang.String str21 = weightHelper0.bmiCat((double) 1.0f, 0.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((-1.0d), (double) (byte) 0);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10, (double) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 0, Double.NaN);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) -1, 32.0d);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        double double15 = weightHelper0.bmi(10.0d, (double) ' ');
        double double18 = weightHelper0.bmi((double) 100L, (-1.0d));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, (double) (byte) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) 10, 100.0d);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.String str9 = weightHelper0.bmiCat((double) (byte) 1, (double) (byte) 100);
        java.lang.String str12 = weightHelper0.bmiCat((double) '4', (double) (-1L));
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) '4', (double) 0L);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        java.lang.String str6 = weightHelper0.bmiCat((double) 1.0f, (double) 1L);
        double double9 = weightHelper0.bmi((double) 100, (double) (short) 100);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) ' ', (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) 100, (double) (-1L));
        double double18 = weightHelper0.bmi((double) (short) 100, (double) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 'a', 1.0d);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (double) '4');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1L, 100.0d);
        double double21 = weightHelper0.bmi((double) 100.0f, (double) (short) -1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double18 = weightHelper0.bmi((double) 100.0f, (double) (byte) 10);
        java.lang.String str21 = weightHelper0.bmiCat((double) (-1L), (double) (-1L));
        double double24 = weightHelper0.bmi((double) 100L, (double) 1L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 10.0f, (double) (-1L));
        java.lang.String str24 = weightHelper0.bmiCat(Double.NaN, (double) (byte) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) (byte) 100);
        double double15 = weightHelper0.bmi((double) 10, 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (byte) -1, (double) (short) 100);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, (double) 0L);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10L, (double) ' ');
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10L, (double) (-1L));
        java.lang.String str15 = weightHelper0.bmiCat((double) 10L, (double) 0);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) (-1.0f), 1.0d);
        double double12 = weightHelper0.bmi(32.0d, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (byte) -1, (double) (short) 100);
        double double15 = weightHelper0.bmi((double) 10, (double) 10.0f);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) '#', (double) 'a');
        java.lang.String str12 = weightHelper0.bmiCat((double) 100.0f, (double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, (double) (byte) 100);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi(10.0d, (double) 100);
        java.lang.String str6 = weightHelper0.bmiCat(0.0d, 32.0d);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) (short) 0);
        double double21 = weightHelper0.bmi((double) (-1), 0.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, 10.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((-1.0d), (double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) 100.0f, (double) 100);
        double double6 = weightHelper0.bmi(0.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        double double9 = weightHelper0.bmi((double) 10L, (double) 10L);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) 1.0f);
        double double24 = weightHelper0.bmi((double) 100L, 32.0d);
        java.lang.String str27 = weightHelper0.bmiCat(0.0d, 97.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) ' ', (-1.0d));
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) (short) 100, (double) 1L);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi(97.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi(0.0d, (double) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) 100, (double) (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, (double) 0L);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((-1.0d), (double) (byte) 0);
        double double24 = weightHelper0.bmi(Double.NaN, (double) (short) 1);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        java.lang.String str6 = weightHelper0.bmiCat((double) 1.0f, (double) 1L);
        double double9 = weightHelper0.bmi((-1.0d), (double) (short) 1);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 10, (-1.0d));
        java.lang.String str12 = weightHelper0.bmiCat((double) 1.0f, (double) 10.0f);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) ' ');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10L, (double) 1.0f);
        double double24 = weightHelper0.bmi((double) 1L, (double) 'a');
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Underweight" + "'", str21, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) (-1), (double) (short) 1);
        double double21 = weightHelper0.bmi(32.0d, (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        java.lang.String str18 = weightHelper0.bmiCat((double) 100.0f, (double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi(1.0d, Double.NaN);
        java.lang.String str24 = weightHelper0.bmiCat((double) 100L, (double) 0);
        java.lang.String str27 = weightHelper0.bmiCat((double) 0.0f, (double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi(10.0d, (double) ' ');
        double double27 = weightHelper0.bmi(10.0d, (double) 100L);
        double double30 = weightHelper0.bmi((double) (short) -1, (double) (-1));
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) 1L, (double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) 1.0f);
        java.lang.String str24 = weightHelper0.bmiCat((double) '#', (double) 0L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) (-1.0f), (double) (byte) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 10, (double) 10.0f);
        double double21 = weightHelper0.bmi((double) 10.0f, (double) 0L);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(Double.NaN, (double) 100L);
        double double15 = weightHelper0.bmi((double) 100L, (double) (byte) 0);
        double double18 = weightHelper0.bmi((double) '#', (double) (short) 1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 1, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat((double) ' ', (double) ' ');
        double double21 = weightHelper0.bmi((double) 1.0f, (double) '#');
        java.lang.String str24 = weightHelper0.bmiCat((double) 0, 97.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi(0.0d, (double) 100);
        java.lang.String str24 = weightHelper0.bmiCat(0.0d, (double) '4');
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        java.lang.String str6 = weightHelper0.bmiCat((double) 1.0f, (double) 1L);
        double double9 = weightHelper0.bmi(1.0d, 32.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.String str24 = weightHelper0.bmiCat((double) '#', (double) (-1L));
        java.lang.String str27 = weightHelper0.bmiCat((double) ' ', (double) 10.0f);
        double double30 = weightHelper0.bmi((double) (-1.0f), 32.0d);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) (byte) 0, (double) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.String str24 = weightHelper0.bmiCat((double) 100.0f, (double) 100);
        java.lang.String str27 = weightHelper0.bmiCat((double) (short) 1, (double) 100);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 10, (double) ' ');
        double double15 = weightHelper0.bmi((-1.0d), Double.NaN);
        double double18 = weightHelper0.bmi((double) (-1.0f), (double) 10.0f);
        double double21 = weightHelper0.bmi((double) 'a', (double) (byte) -1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1.0f, (double) 10);
        double double24 = weightHelper0.bmi(0.0d, (double) 'a');
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) (short) 0);
        double double21 = weightHelper0.bmi((double) (-1), 0.0d);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) -1);
        double double27 = weightHelper0.bmi((double) '4', (double) 1);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) 1L, (double) 'a');
        double double27 = weightHelper0.bmi(0.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 1L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 0, (double) 10L);
        double double21 = weightHelper0.bmi((double) 'a', 1.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 10.0f, (double) (-1L));
        double double24 = weightHelper0.bmi(10.0d, (double) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((-1.0d), (double) (byte) -1);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) (-1L));
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) 1, (double) '#');
        java.lang.String str12 = weightHelper0.bmiCat((double) '#', (double) 100.0f);
        java.lang.String str15 = weightHelper0.bmiCat((double) (-1), (double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat(32.0d, (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) 0, (double) 10.0f);
        double double24 = weightHelper0.bmi(0.0d, (double) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 100, 1.0d);
        java.lang.String str12 = weightHelper0.bmiCat(32.0d, (double) (-1));
        java.lang.String str15 = weightHelper0.bmiCat((double) ' ', (double) 1L);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (short) 100);
        double double18 = weightHelper0.bmi((double) 0L, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat(0.0d, (double) 10);
        double double24 = weightHelper0.bmi((double) 10, 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) 0L);
        double double27 = weightHelper0.bmi((double) (byte) 0, (double) (short) 1);
        double double30 = weightHelper0.bmi(0.0d, 32.0d);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) (-1), (-1.0d));
        double double27 = weightHelper0.bmi(100.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.String str24 = weightHelper0.bmiCat((double) '#', (double) (-1L));
        java.lang.String str27 = weightHelper0.bmiCat((double) ' ', (double) 10.0f);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        double double18 = weightHelper0.bmi((double) 'a', (double) (short) 0);
        double double21 = weightHelper0.bmi((double) 100.0f, 32.0d);
        java.lang.String str24 = weightHelper0.bmiCat(97.0d, (double) 10);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) (-1.0f), (double) (byte) 0);
        double double24 = weightHelper0.bmi((double) ' ', (double) (short) 1);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) ' ', 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 100, (double) 'a');
        java.lang.String str24 = weightHelper0.bmiCat((double) ' ', (double) 100L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 100, Double.NaN);
        double double18 = weightHelper0.bmi((double) 100L, (double) 10);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.String str9 = weightHelper0.bmiCat((double) 100.0f, (double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 1, (double) (short) 0);
        java.lang.String str24 = weightHelper0.bmiCat((double) (byte) 10, (double) 1.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Underweight" + "'", str24, "Underweight");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (double) '4');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 0, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) 'a', (double) 10L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.String str24 = weightHelper0.bmiCat((double) 100.0f, (double) 100);
        java.lang.String str27 = weightHelper0.bmiCat((double) (short) 1, (double) 100);
        double double30 = weightHelper0.bmi((double) 100L, (double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) 1.0f);
        java.lang.String str24 = weightHelper0.bmiCat((double) '#', (double) 0L);
        java.lang.String str27 = weightHelper0.bmiCat((double) '4', (double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, (double) (short) 10);
        java.lang.String str15 = weightHelper0.bmiCat(97.0d, (double) 0.0f);
        double double18 = weightHelper0.bmi((double) (short) 0, (double) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        double double15 = weightHelper0.bmi(10.0d, (double) ' ');
        double double18 = weightHelper0.bmi((double) 100L, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, 0.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) 0.0f, 32.0d);
        double double6 = weightHelper0.bmi((double) (-1), (double) (byte) 100);
        java.lang.String str9 = weightHelper0.bmiCat(0.0d, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) (-1L), (double) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 1.0f, (double) 1);
        double double12 = weightHelper0.bmi((double) 0L, 97.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) 0L);
        double double27 = weightHelper0.bmi((double) (byte) 0, (double) (short) 1);
        java.lang.String str30 = weightHelper0.bmiCat((-1.0d), (double) 0L);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(Double.NaN, (double) 100L);
        double double15 = weightHelper0.bmi((double) 100L, (double) (byte) 0);
        double double18 = weightHelper0.bmi((double) 0.0f, (double) '#');
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) 100.0f, 1.0d);
        double double15 = weightHelper0.bmi(1.0d, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) (short) 1, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        double double18 = weightHelper0.bmi((double) 'a', (double) (short) 0);
        double double21 = weightHelper0.bmi((double) (byte) 100, (double) 1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) ' ');
        java.lang.String str24 = weightHelper0.bmiCat((double) '#', (double) (-1L));
        double double27 = weightHelper0.bmi((double) (byte) -1, 0.0d);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        double double21 = weightHelper0.bmi(0.0d, (double) 1L);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10L, (double) (short) 100);
        double double27 = weightHelper0.bmi((double) 10.0f, (double) 1L);
        double double30 = weightHelper0.bmi((double) (short) 0, 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) 100.0f, 1.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi(0.0d, 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) 100, 10.0d);
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat(32.0d, (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) 0, (double) 10.0f);
        java.lang.String str24 = weightHelper0.bmiCat((double) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi(100.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) (byte) 100);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        double double18 = weightHelper0.bmi((double) 'a', (double) (short) 0);
        double double21 = weightHelper0.bmi((double) (byte) 100, (double) 1);
        java.lang.String str24 = weightHelper0.bmiCat((-1.0d), (double) 100L);
        java.lang.String str27 = weightHelper0.bmiCat((double) (short) 1, (double) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (byte) 100, 32.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 1, (double) (byte) 10);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi(0.0d, (double) 100);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) (-1.0f), (double) (byte) 1);
        double double15 = weightHelper0.bmi((double) (byte) 100, 100.0d);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) 0L);
        double double27 = weightHelper0.bmi((double) (byte) 0, (double) (short) 1);
        java.lang.String str30 = weightHelper0.bmiCat((-1.0d), (double) 0L);
        double double33 = weightHelper0.bmi((double) 100, (double) (-1L));
        java.lang.Class<?> wildcardClass34 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) (short) 100, 0.0d);
        double double15 = weightHelper0.bmi((double) 1, (double) '#');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) -1, (double) 10);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        double double15 = weightHelper0.bmi((double) (short) 0, (double) (byte) 100);
        double double18 = weightHelper0.bmi((double) (short) -1, 0.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 10.0f, (double) (-1L));
        double double24 = weightHelper0.bmi(10.0d, (double) 0);
        double double27 = weightHelper0.bmi((double) (-1L), (double) ' ');
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) (short) 10);
        java.lang.String str33 = weightHelper0.bmiCat((double) (short) 100, (double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        java.lang.String str6 = weightHelper0.bmiCat((double) 1.0f, (double) 1L);
        double double9 = weightHelper0.bmi((double) 100, (double) (short) 100);
        double double12 = weightHelper0.bmi((double) 0L, (double) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) '4', (double) (-1L));
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        double double15 = weightHelper0.bmi((double) 1, (double) 1L);
        java.lang.String str18 = weightHelper0.bmiCat(97.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, (double) 10.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat(100.0d, (double) (short) 0);
        double double6 = weightHelper0.bmi((double) 0.0f, 0.0d);
        double double9 = weightHelper0.bmi((double) (byte) 0, 35.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((-1.0d), (double) (byte) 0);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10, (double) 0);
        double double27 = weightHelper0.bmi((double) (byte) 10, (double) (byte) 10);
        double double30 = weightHelper0.bmi((double) 100.0f, (double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, (double) (byte) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (byte) 10, (double) (byte) 100);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 10, (-1.0d));
        java.lang.String str12 = weightHelper0.bmiCat((double) 1.0f, (double) 10.0f);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat((double) (-1), Double.NaN);
        double double12 = weightHelper0.bmi((double) ' ', 35.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) ' ', (double) (byte) 1);
        double double15 = weightHelper0.bmi((double) 1, (double) (-1.0f));
        double double18 = weightHelper0.bmi((double) 0, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10.0f, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) '4', (double) 0L);
        java.lang.String str9 = weightHelper0.bmiCat((double) (-1L), (double) (short) 100);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) '4', (double) (-1L));
        java.lang.String str36 = weightHelper0.bmiCat((double) 10, (double) '4');
        double double39 = weightHelper0.bmi(Double.NaN, 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Check Input Values" + "'", str36, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) -1, (double) 1L);
        double double18 = weightHelper0.bmi((double) (-1), (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) '#', (double) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (-1), (double) 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) 0L, (double) 'a');
        java.lang.String str21 = weightHelper0.bmiCat(Double.NaN, (double) 0.0f);
        double double24 = weightHelper0.bmi((double) 0L, (double) 1L);
        double double27 = weightHelper0.bmi(100.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) 0L);
        double double27 = weightHelper0.bmi((double) (byte) 0, (double) (short) 1);
        double double30 = weightHelper0.bmi(0.0d, 32.0d);
        java.lang.String str33 = weightHelper0.bmiCat((double) 1L, 100.0d);
        double double36 = weightHelper0.bmi(35.0d, (double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(35.0d, 32.0d);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) (short) 100, 0.0d);
        double double15 = weightHelper0.bmi((double) 1, (double) '#');
        java.lang.String str18 = weightHelper0.bmiCat(97.0d, (double) 0L);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((-1.0d), (double) (byte) -1);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) (-1L));
        double double18 = weightHelper0.bmi((double) ' ', (double) 100L);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) ' ', 1.0d);
        double double18 = weightHelper0.bmi(100.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 1L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 0, (double) 10L);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 100, Double.NaN);
        double double18 = weightHelper0.bmi(0.0d, (double) (-1));
        java.lang.String str21 = weightHelper0.bmiCat((double) 100L, (-1.0d));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 100, Double.NaN);
        double double18 = weightHelper0.bmi(0.0d, (double) (-1));
        java.lang.String str21 = weightHelper0.bmiCat((double) 100L, (-1.0d));
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) 1.0f);
        double double24 = weightHelper0.bmi((double) (short) 0, (double) 1L);
        java.lang.String str27 = weightHelper0.bmiCat((double) 10, 10.0d);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (short) 100);
        double double18 = weightHelper0.bmi(100.0d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (byte) -1, (double) (short) 100);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1.0f, (double) (short) -1);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10.0f, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) '4', (double) 0L);
        double double9 = weightHelper0.bmi((double) 100.0f, (double) (-1));
        java.lang.String str12 = weightHelper0.bmiCat((double) 10L, (double) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) 0.0f, 32.0d);
        double double6 = weightHelper0.bmi(100.0d, (double) 0L);
        double double9 = weightHelper0.bmi((double) (short) 10, 1.0d);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, 0.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        double double12 = weightHelper0.bmi(0.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10.0f, (double) '4');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) (short) 0);
        double double21 = weightHelper0.bmi((double) (-1), 0.0d);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) -1);
        double double27 = weightHelper0.bmi((double) '4', (double) 1);
        java.lang.String str30 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) 0L, (double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 10, (-1.0d));
        java.lang.String str12 = weightHelper0.bmiCat((double) 1.0f, (double) 10.0f);
        java.lang.String str15 = weightHelper0.bmiCat((double) 100L, (double) (-1L));
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(Double.NaN, (double) 100L);
        double double15 = weightHelper0.bmi((double) 100L, (double) (byte) 0);
        double double18 = weightHelper0.bmi((double) 0.0f, (double) '#');
        double double21 = weightHelper0.bmi((double) 1L, (double) (short) 1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, (double) (short) 10);
        java.lang.String str15 = weightHelper0.bmiCat(97.0d, (double) 0.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 1, 0.0d);
        double double21 = weightHelper0.bmi((double) (short) 10, (double) ' ');
        double double24 = weightHelper0.bmi((double) (byte) -1, 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 10, (-1.0d));
        java.lang.String str12 = weightHelper0.bmiCat((double) 1.0f, (double) 10.0f);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) ' ');
        double double18 = weightHelper0.bmi((double) (short) 0, (double) ' ');
        double double21 = weightHelper0.bmi(0.0d, Double.NaN);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) 1, (double) '#');
        double double12 = weightHelper0.bmi((double) ' ', (double) (short) 10);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) 0L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 10.0f, (double) (-1L));
        java.lang.String str24 = weightHelper0.bmiCat(Double.NaN, (double) (byte) 0);
        java.lang.String str27 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.String str30 = weightHelper0.bmiCat((double) 10L, (double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10L, (double) 1.0f);
        java.lang.String str24 = weightHelper0.bmiCat((double) 0L, (double) (byte) -1);
        double double27 = weightHelper0.bmi((double) 1L, (double) (byte) 100);
        java.lang.String str30 = weightHelper0.bmiCat((double) (-1L), (double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Underweight" + "'", str21, "Underweight");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 1, (double) (short) 0);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 10.0f);
        java.lang.String str12 = weightHelper0.bmiCat((double) 0, (double) '#');
        java.lang.String str15 = weightHelper0.bmiCat((double) '4', 0.0d);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10L, (double) (-1L));
        java.lang.String str15 = weightHelper0.bmiCat((double) 10L, (double) 0);
        double double18 = weightHelper0.bmi((double) 1, (double) 100.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10.0f, 35.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        double double9 = weightHelper0.bmi((double) 10L, (double) 10L);
        double double12 = weightHelper0.bmi(32.0d, (double) 1);
        double double15 = weightHelper0.bmi((double) (short) 1, (double) (short) -1);
        double double18 = weightHelper0.bmi((double) (byte) -1, (double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        java.lang.String str18 = weightHelper0.bmiCat((double) 10, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((double) 0, (double) (byte) 100);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((-1.0d), (double) 0);
        double double27 = weightHelper0.bmi(Double.NaN, (double) (short) 10);
        double double30 = weightHelper0.bmi((double) (short) 100, (double) 'a');
        java.lang.String str33 = weightHelper0.bmiCat(52.0d, (double) (short) 10);
        double double36 = weightHelper0.bmi((double) (short) 10, 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat(32.0d, (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) 0, (double) 10.0f);
        double double24 = weightHelper0.bmi((double) (short) -1, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, (double) (short) 10);
        java.lang.String str15 = weightHelper0.bmiCat(97.0d, (double) 0.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 1, 0.0d);
        double double21 = weightHelper0.bmi(0.0d, 0.0d);
        double double24 = weightHelper0.bmi((double) (-1), (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi((double) 0L, (double) 'a');
        java.lang.String str21 = weightHelper0.bmiCat(Double.NaN, (double) 0.0f);
        java.lang.String str24 = weightHelper0.bmiCat(100.0d, (double) 100L);
        double double27 = weightHelper0.bmi((double) 0, 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 1, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat((double) ' ', (double) ' ');
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) 100L);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 10, (-1.0d));
        java.lang.String str12 = weightHelper0.bmiCat((double) 1.0f, (double) 10.0f);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 1L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 0, (double) 10L);
        double double21 = weightHelper0.bmi((double) 'a', 1.0d);
        double double24 = weightHelper0.bmi((double) (byte) 0, (double) '#');
        java.lang.String str27 = weightHelper0.bmiCat((double) 0.0f, (double) 100.0f);
        double double30 = weightHelper0.bmi((double) 10, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 97.0d + "'", double21 == 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) '4', (double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi(52.0d, (double) (short) 0);
        java.lang.String str24 = weightHelper0.bmiCat((double) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) '4', (double) (-1L));
        double double36 = weightHelper0.bmi((double) 100.0f, (double) (short) 1);
        java.lang.String str39 = weightHelper0.bmiCat((double) 1, (double) 10L);
        double double42 = weightHelper0.bmi((double) 1.0f, (double) 100);
        java.lang.Class<?> wildcardClass43 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Check Input Values" + "'", str39, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi(97.0d, (double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) ' ', 1.0d);
        double double18 = weightHelper0.bmi(100.0d, (double) (short) -1);
        double double21 = weightHelper0.bmi((double) '#', (double) 100.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 10, 32.0d);
        double double21 = weightHelper0.bmi((double) ' ', 0.0d);
        double double24 = weightHelper0.bmi((double) (short) 10, (double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) 0.0f, (double) (short) 0);
        double double36 = weightHelper0.bmi((double) (short) 1, 32.0d);
        java.lang.Class<?> wildcardClass37 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) '#', (double) 'a');
        double double12 = weightHelper0.bmi(0.0d, (double) 10.0f);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) '#');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat(100.0d, (double) (short) 0);
        double double6 = weightHelper0.bmi((double) '#', (double) 1.0f);
        java.lang.Class<?> wildcardClass7 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        double double21 = weightHelper0.bmi(0.0d, (double) 1L);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10L, (double) (short) 100);
        double double27 = weightHelper0.bmi((double) 10.0f, (double) 1L);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) '#', (double) 'a');
        double double12 = weightHelper0.bmi(0.0d, (double) 10.0f);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) '#');
        java.lang.String str18 = weightHelper0.bmiCat(32.0d, 100.0d);
        double double21 = weightHelper0.bmi((double) (-1L), (double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(97.0d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (short) -1, (double) '#');
        double double15 = weightHelper0.bmi((double) (-1L), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        double double21 = weightHelper0.bmi(0.0d, (double) 1L);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.String str15 = weightHelper0.bmiCat((double) 10, 0.0d);
        double double18 = weightHelper0.bmi((double) (short) 1, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, (double) (byte) 100);
        double double24 = weightHelper0.bmi((double) (byte) 100, (double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.String str9 = weightHelper0.bmiCat((double) (byte) 1, (double) (byte) 100);
        double double12 = weightHelper0.bmi(100.0d, (-1.0d));
        double double15 = weightHelper0.bmi((double) (-1), (double) (byte) 10);
        java.lang.String str18 = weightHelper0.bmiCat(0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) 100.0f, 1.0d);
        double double15 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.String str18 = weightHelper0.bmiCat((double) '4', (double) (short) 1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0.0f, (double) 'a');
        double double15 = weightHelper0.bmi((double) (short) 100, (double) (short) 0);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, (double) 10);
        java.lang.String str30 = weightHelper0.bmiCat((double) (short) 100, (-1.0d));
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) 1, (double) '#');
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) -1, (double) 1L);
        double double18 = weightHelper0.bmi((double) 100.0f, 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        java.lang.String str15 = weightHelper0.bmiCat((double) 10, 0.0d);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) -1, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) 0, (double) 10.0f);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str18 = weightHelper0.bmiCat((double) (-1.0f), (double) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.String str27 = weightHelper0.bmiCat((double) (short) 100, 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 'a', 1.0d);
        java.lang.String str18 = weightHelper0.bmiCat(97.0d, 1.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat(10.0d, (double) ' ');
        java.lang.Class<?> wildcardClass4 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 10, (double) ' ');
        double double15 = weightHelper0.bmi((-1.0d), Double.NaN);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 0, (double) (byte) 100);
        java.lang.String str21 = weightHelper0.bmiCat(100.0d, (double) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0, (double) (byte) -1);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 0, (-1.0d));
        double double21 = weightHelper0.bmi((double) (short) 10, (double) (short) 100);
        double double24 = weightHelper0.bmi((double) (byte) 1, (double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) 0.0f, (double) (short) 0);
        double double36 = weightHelper0.bmi((double) (short) 1, 32.0d);
        double double39 = weightHelper0.bmi((double) (short) 10, 0.0d);
        java.lang.Class<?> wildcardClass40 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi(97.0d, (double) (short) 0);
        double double12 = weightHelper0.bmi((double) ' ', (double) (byte) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double18 = weightHelper0.bmi((double) 100.0f, (double) (byte) 10);
        java.lang.String str21 = weightHelper0.bmiCat((double) (-1L), (double) (-1L));
        double double24 = weightHelper0.bmi((double) 100L, (double) 1L);
        double double27 = weightHelper0.bmi((double) 'a', (double) (byte) -1);
        double double30 = weightHelper0.bmi((double) (byte) -1, (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        java.lang.String str9 = weightHelper0.bmiCat((double) (-1L), (double) (-1.0f));
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) '4', (double) 0L);
        double double9 = weightHelper0.bmi((double) 100.0f, (double) (-1));
        double double12 = weightHelper0.bmi((double) (byte) 10, (double) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi(0.0d, (double) (short) 1);
        java.lang.String str24 = weightHelper0.bmiCat(1.0d, 0.0d);
        java.lang.String str27 = weightHelper0.bmiCat((-1.0d), (double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((-1.0d), (double) (byte) 0);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10, (double) 0);
        java.lang.String str27 = weightHelper0.bmiCat((double) 1.0f, (double) (-1L));
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (short) 100, Double.NaN);
        java.lang.String str12 = weightHelper0.bmiCat((double) '4', (double) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Obese" + "'", str12, "Obese");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 1.0f, (double) 1);
        double double12 = weightHelper0.bmi(100.0d, (double) (byte) 10);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double21 = weightHelper0.bmi((double) 'a', (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 100.0f, (double) 100.0f);
        java.lang.String str21 = weightHelper0.bmiCat(0.0d, 1.0d);
        java.lang.String str24 = weightHelper0.bmiCat((double) '4', (double) (short) -1);
        java.lang.String str27 = weightHelper0.bmiCat((double) (byte) 10, (double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, (double) 10);
        double double30 = weightHelper0.bmi((double) ' ', (double) '#');
        java.lang.String str33 = weightHelper0.bmiCat((double) (short) 10, 1.0d);
        java.lang.Class<?> wildcardClass34 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Underweight" + "'", str33, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, (double) (short) 10);
        java.lang.String str15 = weightHelper0.bmiCat(97.0d, (double) 0.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 1, 0.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (byte) 100, 32.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 1, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) '#', 1.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) (short) 100, (double) (byte) 100);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) (short) 0);
        java.lang.String str21 = weightHelper0.bmiCat((double) 'a', 100.0d);
        java.lang.String str24 = weightHelper0.bmiCat((double) (byte) 0, 10.0d);
        double double27 = weightHelper0.bmi((double) (-1.0f), (double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat(0.0d, (double) 10L);
        double double27 = weightHelper0.bmi((double) 1, (double) ' ');
        double double30 = weightHelper0.bmi((double) ' ', (double) 1.0f);
        double double33 = weightHelper0.bmi((double) (-1), (double) (short) 0);
        double double36 = weightHelper0.bmi((double) 100, (double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((-1.0d), (double) 0);
        double double27 = weightHelper0.bmi(Double.NaN, (double) (short) 10);
        double double30 = weightHelper0.bmi((double) (short) 100, (double) 'a');
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (-1), (double) (short) -1);
        java.lang.String str24 = weightHelper0.bmiCat((double) 0L, (double) 100L);
        java.lang.String str27 = weightHelper0.bmiCat(0.0d, (double) 1.0f);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 1, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat((double) ' ', (double) ' ');
        double double21 = weightHelper0.bmi((double) (byte) -1, (double) 100L);
        java.lang.String str24 = weightHelper0.bmiCat((double) (-1.0f), (double) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, (double) 0L);
        double double21 = weightHelper0.bmi(32.0d, (double) (byte) 100);
        double double24 = weightHelper0.bmi(0.0d, (double) 1L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat(0.0d, (double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 10.0f, (double) (-1L));
        java.lang.String str24 = weightHelper0.bmiCat(Double.NaN, (double) (byte) 0);
        java.lang.String str27 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) -1, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat((-1.0d), (double) (byte) 1);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) 1, (double) '#');
        double double12 = weightHelper0.bmi((double) '#', (double) 100);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (short) -1, (double) '#');
        double double15 = weightHelper0.bmi((double) 100, 52.0d);
        double double18 = weightHelper0.bmi(10.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (short) 100);
        double double18 = weightHelper0.bmi((double) 0L, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat(10.0d, (double) (-1L));
        java.lang.String str24 = weightHelper0.bmiCat(100.0d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        double double9 = weightHelper0.bmi((double) 10L, (double) 10L);
        double double12 = weightHelper0.bmi((double) 1, (double) 0);
        double double15 = weightHelper0.bmi(0.0d, (double) '#');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) (-1), (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) (short) 100, (double) (short) -1);
        java.lang.String str27 = weightHelper0.bmiCat(10.0d, (double) '4');
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 10);
        java.lang.String str33 = weightHelper0.bmiCat((double) (-1L), (double) 100);
        java.lang.Class<?> wildcardClass34 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((-1.0d), (double) (byte) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) ' ', (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 0, (double) (short) -1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 1, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat((double) 100L, 52.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi(10.0d, (double) 100);
        java.lang.String str6 = weightHelper0.bmiCat(0.0d, 32.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) 10L, (double) 0);
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10L, (double) (-1L));
        java.lang.String str15 = weightHelper0.bmiCat((double) 10L, (double) 0);
        double double18 = weightHelper0.bmi((double) 1, (double) 100.0f);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) 100L, (double) (-1));
        double double21 = weightHelper0.bmi((double) (short) 0, (double) 0);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        double double18 = weightHelper0.bmi((double) 100L, (double) '#');
        double double21 = weightHelper0.bmi((double) (byte) -1, 32.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) 0.0f, (double) (short) 0);
        java.lang.String str36 = weightHelper0.bmiCat((double) (short) 1, (double) (-1));
        java.lang.Class<?> wildcardClass37 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Check Input Values" + "'", str36, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, (double) (byte) 100);
        double double24 = weightHelper0.bmi((double) 0.0f, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) 0L);
        double double18 = weightHelper0.bmi((double) (byte) 10, (double) 100L);
        double double21 = weightHelper0.bmi((double) (short) -1, (double) (-1L));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        double double15 = weightHelper0.bmi((double) 1, (double) 1L);
        java.lang.String str18 = weightHelper0.bmiCat(97.0d, (-1.0d));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) 1L, (double) '4');
        java.lang.String str12 = weightHelper0.bmiCat((double) 10.0f, 10.0d);
        double double15 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        double double18 = weightHelper0.bmi(0.0d, 10.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (-1), (double) (short) -1);
        double double24 = weightHelper0.bmi((double) 100L, (double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) 0L);
        double double27 = weightHelper0.bmi((double) (byte) 0, (double) (short) 1);
        double double30 = weightHelper0.bmi(0.0d, 32.0d);
        java.lang.String str33 = weightHelper0.bmiCat(32.0d, (double) 100L);
        double double36 = weightHelper0.bmi((double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (byte) 100);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi(10.0d, (double) 100);
        java.lang.String str6 = weightHelper0.bmiCat(0.0d, 32.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) 10L, (double) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10.0f, 97.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        double double15 = weightHelper0.bmi((double) 1, (double) 1L);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) 0.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass34 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 0, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) 'a', (double) 10L);
        double double27 = weightHelper0.bmi((double) (short) 0, (double) 100);
        double double30 = weightHelper0.bmi((double) (byte) 100, 0.0d);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        double double12 = weightHelper0.bmi(10.0d, (double) 100);
        java.lang.String str15 = weightHelper0.bmiCat((double) (byte) 1, 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) 0.0f, (double) (short) 0);
        double double36 = weightHelper0.bmi((double) (short) 1, 32.0d);
        double double39 = weightHelper0.bmi((double) (short) 10, 0.0d);
        double double42 = weightHelper0.bmi((double) 10.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 1.0f, (double) 1);
        double double12 = weightHelper0.bmi(100.0d, (double) (byte) 10);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        java.lang.String str21 = weightHelper0.bmiCat((double) (byte) 10, (double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0, (double) (byte) -1);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 0, (-1.0d));
        double double21 = weightHelper0.bmi((double) (byte) 10, 0.0d);
        double double24 = weightHelper0.bmi((double) 0.0f, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1.0f, (double) 10);
        java.lang.String str24 = weightHelper0.bmiCat(97.0d, (double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) 1.0f);
        double double24 = weightHelper0.bmi((double) 100L, 32.0d);
        java.lang.String str27 = weightHelper0.bmiCat(0.0d, 97.0d);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        double double18 = weightHelper0.bmi((double) 1L, (double) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (short) 100);
        double double18 = weightHelper0.bmi((double) 0L, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat(0.0d, (double) 10);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) (short) 100, 0.0d);
        double double15 = weightHelper0.bmi((double) 1, (double) '#');
        java.lang.String str18 = weightHelper0.bmiCat(97.0d, (double) 0L);
        java.lang.String str21 = weightHelper0.bmiCat(100.0d, (double) '4');
        double double24 = weightHelper0.bmi((double) (short) 100, (double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str33 = weightHelper0.bmiCat((double) '4', (double) (-1L));
        double double36 = weightHelper0.bmi(97.0d, (double) 10.0f);
        java.lang.String str39 = weightHelper0.bmiCat((double) (short) 1, 0.0d);
        java.lang.String str42 = weightHelper0.bmiCat(52.0d, (double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Underweight" + "'", str30, "Underweight");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Check Input Values" + "'", str39, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Check Input Values" + "'", str42, "Check Input Values");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) (byte) 0, (double) 0L);
        java.lang.String str18 = weightHelper0.bmiCat((double) 'a', (double) (byte) 1);
        double double21 = weightHelper0.bmi((double) 10L, (double) 10);
        java.lang.String str24 = weightHelper0.bmiCat((double) (byte) 1, (double) '4');
        java.lang.String str27 = weightHelper0.bmiCat((double) ' ', (double) 1L);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Obese" + "'", str27, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 0, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) 0.0f, (double) 100.0f);
        java.lang.String str27 = weightHelper0.bmiCat(0.0d, (double) 10.0f);
        java.lang.String str30 = weightHelper0.bmiCat((double) (-1), (double) (byte) 100);
        java.lang.String str33 = weightHelper0.bmiCat((double) '4', (double) 'a');
        java.lang.String str36 = weightHelper0.bmiCat((double) 10L, (double) 0);
        java.lang.Class<?> wildcardClass37 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Check Input Values" + "'", str36, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (double) '4');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1L, 100.0d);
        java.lang.String str21 = weightHelper0.bmiCat(1.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (byte) -1, (double) (short) 100);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1.0f, (double) (short) -1);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) (short) 100, 0.0d);
        double double15 = weightHelper0.bmi(10.0d, (double) (-1L));
        double double18 = weightHelper0.bmi((double) 0, (double) (byte) -1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) (short) 100, (double) (short) -1);
        double double27 = weightHelper0.bmi((double) (-1L), (double) (byte) -1);
        java.lang.String str30 = weightHelper0.bmiCat((double) 'a', Double.NaN);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) 100L, (double) (-1));
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (short) 100);
        double double18 = weightHelper0.bmi((double) 0L, (double) '#');
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) ' ', 1.0d);
        double double18 = weightHelper0.bmi(100.0d, (double) (short) -1);
        java.lang.String str21 = weightHelper0.bmiCat(52.0d, (double) 1L);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Obese" + "'", str21, "Obese");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 0, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) 0.0f, (double) 100.0f);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        double double21 = weightHelper0.bmi((double) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) (short) -1, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, 100.0d);
        java.lang.String str30 = weightHelper0.bmiCat((double) (short) 0, (double) 0L);
        double double33 = weightHelper0.bmi((double) (byte) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        java.lang.String str6 = weightHelper0.bmiCat((double) (byte) 1, 10.0d);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (-1L));
        java.lang.Class<?> wildcardClass10 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) (byte) 1, (double) (-1L));
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) (-1));
        double double18 = weightHelper0.bmi((double) 100, (double) ' ');
        java.lang.String str21 = weightHelper0.bmiCat((double) (-1), (double) (byte) 1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((double) 10L, (double) (-1L));
        double double15 = weightHelper0.bmi(Double.NaN, 1.0d);
        double double18 = weightHelper0.bmi((double) (short) 100, 0.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        java.lang.String str6 = weightHelper0.bmiCat((double) 1.0f, (double) 1L);
        double double9 = weightHelper0.bmi((double) 100, (double) (short) 100);
        double double12 = weightHelper0.bmi((double) (short) 100, 0.0d);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, 100.0d);
        double double21 = weightHelper0.bmi((double) (short) 1, (double) (short) 0);
        double double24 = weightHelper0.bmi(10.0d, (double) ' ');
        double double27 = weightHelper0.bmi(10.0d, (double) 100L);
        double double30 = weightHelper0.bmi((double) 'a', (double) 'a');
        java.lang.String str33 = weightHelper0.bmiCat(32.0d, (-1.0d));
        java.lang.String str36 = weightHelper0.bmiCat(35.0d, (double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Check Input Values" + "'", str36, "Check Input Values");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) (short) 0);
        double double21 = weightHelper0.bmi((double) (-1), 0.0d);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) -1);
        double double27 = weightHelper0.bmi((double) '4', (double) 1);
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) -1, (double) 100);
        java.lang.String str33 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str36 = weightHelper0.bmiCat((double) ' ', (double) (byte) 0);
        java.lang.Class<?> wildcardClass37 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Check Input Values" + "'", str36, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat(32.0d, (double) 0.0f);
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) ' ');
        double double24 = weightHelper0.bmi(100.0d, (double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) (short) 100, (double) (short) -1);
        java.lang.String str27 = weightHelper0.bmiCat((double) (short) 0, 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi(0.0d, (double) (short) 1);
        double double18 = weightHelper0.bmi((double) (byte) 1, (double) (short) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) '#', 97.0d);
        java.lang.String str24 = weightHelper0.bmiCat(100.0d, 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        java.lang.String str18 = weightHelper0.bmiCat((double) 10, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((-1.0d), (double) 0.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) -1, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) (byte) -1, (double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) 0, 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        java.lang.String str21 = weightHelper0.bmiCat((double) (byte) -1, (double) (byte) 0);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi(10.0d, (double) 100);
        java.lang.String str6 = weightHelper0.bmiCat(0.0d, 32.0d);
        double double9 = weightHelper0.bmi(1.0d, (double) 1L);
        double double12 = weightHelper0.bmi(97.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (byte) -1, (double) (short) 100);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1.0f, (double) 'a');
        double double18 = weightHelper0.bmi((double) '4', (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        double double6 = weightHelper0.bmi((double) (byte) -1, (double) (short) 1);
        double double9 = weightHelper0.bmi((double) 1.0f, (double) 1);
        double double12 = weightHelper0.bmi(100.0d, (double) (byte) 10);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((-1.0d), 32.0d);
        double double15 = weightHelper0.bmi(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) (byte) 10, 10.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) (-1.0f), 0.0d);
        java.lang.String str24 = weightHelper0.bmiCat((double) 0, (double) 100.0f);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1.0f, (double) 0.0f);
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((double) 100, (double) 0L);
        double double27 = weightHelper0.bmi((double) (byte) 0, (double) (short) 1);
        double double30 = weightHelper0.bmi(0.0d, 32.0d);
        java.lang.String str33 = weightHelper0.bmiCat(32.0d, (double) 100L);
        java.lang.Class<?> wildcardClass34 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) 10.0f, (double) (-1L));
        double double24 = weightHelper0.bmi(10.0d, (double) 0);
        double double27 = weightHelper0.bmi((double) (-1L), (double) ' ');
        java.lang.String str30 = weightHelper0.bmiCat((double) (byte) 10, (double) (short) 10);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        double double9 = weightHelper0.bmi((double) 10L, (double) 10L);
        double double12 = weightHelper0.bmi((double) 1, (double) 0);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) ' ', (double) (byte) 1);
        double double15 = weightHelper0.bmi((double) (byte) 100, 32.0d);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) (short) -1, (double) (byte) 100);
        java.lang.String str24 = weightHelper0.bmiCat(97.0d, (double) 'a');
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        double double12 = weightHelper0.bmi((double) (short) 100, 0.0d);
        double double15 = weightHelper0.bmi(10.0d, (double) (-1L));
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 0);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 1, (double) 0L);
        java.lang.String str21 = weightHelper0.bmiCat(0.0d, 97.0d);
        double double24 = weightHelper0.bmi(0.0d, (double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        double double15 = weightHelper0.bmi((double) 1L, (double) (-1L));
        double double18 = weightHelper0.bmi((double) '#', 35.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi(0.0d, (double) 100);
        double double24 = weightHelper0.bmi((double) (byte) 100, (double) (-1L));
        double double27 = weightHelper0.bmi((double) 10.0f, (double) 1L);
        java.lang.String str30 = weightHelper0.bmiCat((double) 100, (double) 10);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 0, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) 0.0f, (double) 100.0f);
        java.lang.String str27 = weightHelper0.bmiCat((double) 100L, (double) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double18 = weightHelper0.bmi(Double.NaN, (double) 0);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10, (double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (-1), (double) (short) -1);
        double double24 = weightHelper0.bmi((double) 10.0f, (double) 10L);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (byte) 1);
        double double18 = weightHelper0.bmi((double) 100, (double) 1);
        double double21 = weightHelper0.bmi(52.0d, (double) (short) 0);
        java.lang.String str24 = weightHelper0.bmiCat(32.0d, (double) (short) -1);
        java.lang.String str27 = weightHelper0.bmiCat((double) (byte) -1, (double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) ' ', 100.0d);
        double double21 = weightHelper0.bmi((double) (byte) 100, (double) 'a');
        java.lang.String str24 = weightHelper0.bmiCat((double) 0.0f, 97.0d);
        java.lang.String str27 = weightHelper0.bmiCat(52.0d, (double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (byte) -1, (double) (short) 100);
        double double15 = weightHelper0.bmi((double) 10, (double) 10.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 10, (double) 1L);
        java.lang.String str21 = weightHelper0.bmiCat(0.0d, (double) '#');
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Underweight" + "'", str18, "Underweight");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi((double) (-1.0f), (double) 'a');
        double double12 = weightHelper0.bmi((double) 1.0f, (double) (byte) 0);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double18 = weightHelper0.bmi((double) 10, (double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (double) '4');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1L, 100.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) 1L, Double.NaN);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((-1.0d), (double) 0);
        java.lang.String str27 = weightHelper0.bmiCat((double) 10.0f, 35.0d);
        double double30 = weightHelper0.bmi((double) (-1), (double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (byte) 100, 32.0d);
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 1, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) (byte) 0, (double) (short) 100);
        double double15 = weightHelper0.bmi((double) 10, (double) (short) 10);
        double double18 = weightHelper0.bmi(0.0d, (double) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, (double) 10);
        double double30 = weightHelper0.bmi((double) ' ', (double) '#');
        java.lang.String str33 = weightHelper0.bmiCat((double) (short) 10, 1.0d);
        double double36 = weightHelper0.bmi((double) 1L, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Underweight" + "'", str33, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) ' ', (double) (byte) 1);
        double double15 = weightHelper0.bmi((double) 1, (double) (-1.0f));
        java.lang.String str18 = weightHelper0.bmiCat((double) (byte) 100, (double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat(1.0d, 1.0d);
        double double9 = weightHelper0.bmi(0.0d, 97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Underweight" + "'", str6, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0.0f, (double) 10L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) (short) 0);
        double double21 = weightHelper0.bmi(52.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) ' ', 100.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) '#', 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) (short) 100, (double) 1L);
        java.lang.String str21 = weightHelper0.bmiCat((double) (short) 1, (double) 1.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Underweight" + "'", str21, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi(Double.NaN, (double) (short) 0);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, (double) (short) 10);
        java.lang.String str15 = weightHelper0.bmiCat(97.0d, (double) 0.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 1, 0.0d);
        double double21 = weightHelper0.bmi(0.0d, 0.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi((double) 100, (double) (-1.0f));
        java.lang.String str24 = weightHelper0.bmiCat((-1.0d), (double) 0);
        java.lang.String str27 = weightHelper0.bmiCat(0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        java.lang.String str15 = weightHelper0.bmiCat(1.0d, (-1.0d));
        double double18 = weightHelper0.bmi(100.0d, (-1.0d));
        java.lang.String str21 = weightHelper0.bmiCat((double) (short) -1, (double) 1.0f);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, (double) 10);
        java.lang.String str30 = weightHelper0.bmiCat((double) 100.0f, (double) 0);
        java.lang.String str33 = weightHelper0.bmiCat(97.0d, 0.0d);
        java.lang.String str36 = weightHelper0.bmiCat((double) 10L, (double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Check Input Values" + "'", str36, "Check Input Values");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.String str27 = weightHelper0.bmiCat((double) 0.0f, (double) (short) 10);
        double double30 = weightHelper0.bmi((double) 1.0f, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        double double15 = weightHelper0.bmi((double) 1, (double) 1L);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 100, 10.0d);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        java.lang.String str12 = weightHelper0.bmiCat(100.0d, 10.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) (-1.0f), (double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10, 0.0d);
        java.lang.String str21 = weightHelper0.bmiCat((double) 'a', (double) 0);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10L, (double) 1);
        java.lang.String str27 = weightHelper0.bmiCat((double) 0L, (double) (short) 1);
        double double30 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        double double33 = weightHelper0.bmi(Double.NaN, (double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Underweight" + "'", str24, "Underweight");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        double double18 = weightHelper0.bmi((double) 'a', (double) (short) 0);
        double double21 = weightHelper0.bmi((double) 100.0f, 32.0d);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        double double12 = weightHelper0.bmi((double) (short) -1, (double) '#');
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 100, 1.0d);
        double double12 = weightHelper0.bmi((double) (byte) 100, (double) 0.0f);
        double double15 = weightHelper0.bmi((double) 100L, (double) 100);
        java.lang.String str18 = weightHelper0.bmiCat((double) 100.0f, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) (byte) 0, (double) 0L);
        java.lang.String str18 = weightHelper0.bmiCat((double) 'a', (double) (byte) 1);
        double double21 = weightHelper0.bmi((double) 10L, (double) 10);
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Obese" + "'", str18, "Obese");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 10L, (double) 10.0f);
        double double18 = weightHelper0.bmi((double) ' ', 100.0d);
        double double21 = weightHelper0.bmi((double) (byte) 100, (double) 'a');
        java.lang.String str24 = weightHelper0.bmiCat((double) (byte) 1, 32.0d);
        java.lang.String str27 = weightHelper0.bmiCat((double) (byte) 0, (double) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (-1), (double) (short) -1);
        java.lang.String str24 = weightHelper0.bmiCat((double) 0L, (double) 100L);
        double double27 = weightHelper0.bmi((double) 0, (double) 100L);
        java.lang.String str30 = weightHelper0.bmiCat(0.0d, 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(100.0d, (double) (-1L));
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 1, (double) (short) 100);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10L, (double) 1.0f);
        double double24 = weightHelper0.bmi((double) 1L, (double) 'a');
        java.lang.String str27 = weightHelper0.bmiCat(35.0d, 100.0d);
        java.lang.Class<?> wildcardClass28 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Underweight" + "'", str21, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) 10.0f);
        double double15 = weightHelper0.bmi((double) (-1L), (double) '4');
        double double18 = weightHelper0.bmi((double) (-1), (double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) 0L, (-1.0d));
        double double18 = weightHelper0.bmi((double) (-1L), (-1.0d));
        double double21 = weightHelper0.bmi((double) 0, (double) (short) 0);
        double double24 = weightHelper0.bmi((double) 0.0f, (double) 100.0f);
        java.lang.String str27 = weightHelper0.bmiCat(0.0d, (double) 10.0f);
        java.lang.String str30 = weightHelper0.bmiCat((double) (-1), (double) (byte) 100);
        java.lang.String str33 = weightHelper0.bmiCat((double) '4', (double) 'a');
        java.lang.String str36 = weightHelper0.bmiCat((double) (byte) -1, (double) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Check Input Values" + "'", str33, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Check Input Values" + "'", str36, "Check Input Values");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi((double) 0, (double) 10);
        double double15 = weightHelper0.bmi((double) (short) 100, (double) 100.0f);
        double double18 = weightHelper0.bmi((double) (byte) 0, (double) 10);
        double double21 = weightHelper0.bmi((double) (-1), (double) (short) -1);
        java.lang.String str24 = weightHelper0.bmiCat((double) 0L, (double) 100L);
        java.lang.String str27 = weightHelper0.bmiCat(0.0d, (double) 1.0f);
        java.lang.String str30 = weightHelper0.bmiCat((double) 'a', (double) (-1L));
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(1.0d, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) -1, (double) (short) 100);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((-1.0d), 1.0d);
        double double12 = weightHelper0.bmi((double) 1, (double) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        double double21 = weightHelper0.bmi(0.0d, (double) 1L);
        java.lang.String str24 = weightHelper0.bmiCat((double) 10L, (double) (short) 100);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) '#', (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1, (double) (-1.0f));
        double double24 = weightHelper0.bmi((double) (-1), (-1.0d));
        double double27 = weightHelper0.bmi(100.0d, (double) 1.0f);
        java.lang.String str30 = weightHelper0.bmiCat((double) 0L, (-1.0d));
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        double double12 = weightHelper0.bmi(1.0d, (double) (short) 0);
        double double15 = weightHelper0.bmi((double) (byte) -1, (double) (-1.0f));
        double double18 = weightHelper0.bmi((double) (-1L), (double) (short) 0);
        java.lang.String str21 = weightHelper0.bmiCat((double) 10, (double) (short) 10);
        double double24 = weightHelper0.bmi((-1.0d), (double) 0);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        java.lang.String str18 = weightHelper0.bmiCat(100.0d, (double) (short) 100);
        double double21 = weightHelper0.bmi((double) (byte) 0, (double) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1L, 10.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((double) 0.0f, (double) (byte) 100);
        java.lang.String str24 = weightHelper0.bmiCat((double) (short) 10, 100.0d);
        double double27 = weightHelper0.bmi((double) 10, (double) (short) 1);
        double double30 = weightHelper0.bmi(100.0d, 52.0d);
        java.lang.Class<?> wildcardClass31 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        double double21 = weightHelper0.bmi((double) 0.0f, (double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0.0f, (double) (-1));
        double double18 = weightHelper0.bmi(1.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass19 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        double double9 = weightHelper0.bmi((double) (byte) -1, (double) 1);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) 10, Double.NaN);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        java.lang.String str9 = weightHelper0.bmiCat(100.0d, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat(1.0d, (double) (byte) 1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 'a', 1.0d);
        java.lang.String str18 = weightHelper0.bmiCat((double) 10L, 0.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Obese" + "'", str9, "Obese");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Obese" + "'", str15, "Obese");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi((double) 100.0f, (double) 0.0f);
        double double18 = weightHelper0.bmi(32.0d, (double) (byte) -1);
        double double21 = weightHelper0.bmi(0.0d, (double) 100);
        java.lang.String str24 = weightHelper0.bmiCat(0.0d, 32.0d);
        double double27 = weightHelper0.bmi((double) ' ', (double) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi((double) (-1), (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 10, (double) '#');
        java.lang.String str21 = weightHelper0.bmiCat((-1.0d), (double) (byte) 0);
        double double24 = weightHelper0.bmi(Double.NaN, (double) (short) 1);
        double double27 = weightHelper0.bmi((double) (short) -1, (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        double double15 = weightHelper0.bmi((double) 0, (double) (byte) -1);
        java.lang.String str18 = weightHelper0.bmiCat((double) (short) 0, (-1.0d));
        double double21 = weightHelper0.bmi((double) (short) 10, (double) (short) 100);
        java.lang.String str24 = weightHelper0.bmiCat(Double.NaN, (double) '#');
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        java.lang.String str9 = weightHelper0.bmiCat((double) 1.0f, (double) (short) 1);
        java.lang.String str12 = weightHelper0.bmiCat((-1.0d), (double) (byte) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) ' ', (double) ' ');
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Underweight" + "'", str9, "Underweight");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        java.lang.String str15 = weightHelper0.bmiCat((double) 0, (double) (short) 0);
        double double18 = weightHelper0.bmi(10.0d, (double) (-1.0f));
        java.lang.String str21 = weightHelper0.bmiCat((double) 1.0f, (double) 10);
        double double24 = weightHelper0.bmi(1.0d, 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) ' ', (double) 0L);
        java.lang.String str12 = weightHelper0.bmiCat((double) 1, (double) 1L);
        double double15 = weightHelper0.bmi(0.0d, (double) (short) 1);
        double double18 = weightHelper0.bmi((double) (byte) 1, (double) (short) 0);
        java.lang.String str21 = weightHelper0.bmiCat((double) 1.0f, Double.NaN);
        java.lang.String str24 = weightHelper0.bmiCat((double) 1, (double) 1);
        java.lang.Class<?> wildcardClass25 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Underweight" + "'", str12, "Underweight");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Underweight" + "'", str24, "Underweight");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) (short) 100, (-1.0d));
        double double9 = weightHelper0.bmi((double) 10L, (double) 10L);
        double double12 = weightHelper0.bmi(32.0d, (double) 1);
        double double15 = weightHelper0.bmi((double) (short) 1, (double) (short) -1);
        double double18 = weightHelper0.bmi(100.0d, (double) (short) 0);
        java.lang.String str21 = weightHelper0.bmiCat(97.0d, (double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, 0.0d);
        java.lang.String str15 = weightHelper0.bmiCat((double) 1L, (double) ' ');
        java.lang.String str18 = weightHelper0.bmiCat((double) 0L, (double) (byte) 10);
        double double21 = weightHelper0.bmi(100.0d, (double) (-1L));
        java.lang.String str24 = weightHelper0.bmiCat((double) (-1), 0.0d);
        java.lang.String str27 = weightHelper0.bmiCat(100.0d, (double) 'a');
        java.lang.String str30 = weightHelper0.bmiCat((double) (-1), (double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Check Input Values" + "'", str18, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Check Input Values" + "'", str24, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Check Input Values" + "'", str27, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Check Input Values" + "'", str30, "Check Input Values");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        double double9 = weightHelper0.bmi((double) 1L, (double) (byte) 0);
        double double12 = weightHelper0.bmi((double) 100.0f, (double) 100L);
        java.lang.String str15 = weightHelper0.bmiCat(0.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass16 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Check Input Values" + "'", str15, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        java.lang.String str3 = weightHelper0.bmiCat((double) (short) 10, (double) ' ');
        double double6 = weightHelper0.bmi((double) 1L, (double) 10.0f);
        double double9 = weightHelper0.bmi((double) (byte) 100, (double) 10);
        java.lang.String str12 = weightHelper0.bmiCat((double) (byte) -1, (double) (-1));
        double double15 = weightHelper0.bmi(Double.NaN, (double) '#');
        double double18 = weightHelper0.bmi((double) 'a', (double) (short) 0);
        double double21 = weightHelper0.bmi((double) (byte) 10, (double) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Check Input Values" + "'", str3, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) (byte) -1, (double) (byte) -1);
        double double6 = weightHelper0.bmi((double) 10.0f, (double) '4');
        java.lang.String str9 = weightHelper0.bmiCat((double) (short) 0, (double) (byte) 10);
        java.lang.String str12 = weightHelper0.bmiCat(0.0d, (double) (short) -1);
        double double15 = weightHelper0.bmi((double) (short) 0, (double) (byte) 100);
        double double18 = weightHelper0.bmi((double) (short) -1, 0.0d);
        java.lang.String str21 = weightHelper0.bmiCat(100.0d, (double) '#');
        java.lang.Class<?> wildcardClass22 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Check Input Values" + "'", str21, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        assignment.WeightHelper weightHelper0 = new assignment.WeightHelper();
        double double3 = weightHelper0.bmi((double) 0, (double) 0L);
        java.lang.String str6 = weightHelper0.bmiCat((double) (-1), (double) 10L);
        java.lang.String str9 = weightHelper0.bmiCat((double) (-1L), (double) 1.0f);
        java.lang.String str12 = weightHelper0.bmiCat(97.0d, (double) 10.0f);
        java.lang.Class<?> wildcardClass13 = weightHelper0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Check Input Values" + "'", str6, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Check Input Values" + "'", str9, "Check Input Values");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Check Input Values" + "'", str12, "Check Input Values");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}


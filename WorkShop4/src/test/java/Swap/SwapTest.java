package Swap;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapTest {
    @Test
    public void SwapSimpleTest() {
        List<String> arrayList = new ArrayList();
        arrayList.add("ax");
        arrayList.add("ba");
        arrayList.add("as");
        arrayList.add("fg");
        List<String> arrayListTest = new ArrayList();
        arrayListTest.add("as");
        arrayListTest.add("ba");
        arrayListTest.add("ax");
        arrayListTest.add("fg");
        Swap swap = new Swap();
        Assert.assertEquals(arrayListTest, swap.doSwap(arrayList));
    }
    @Test
    public void SwapEqualsFourStringsTest() {
        List<String> arrayList = new ArrayList();
        arrayList.add("ax");
        arrayList.add("ba");
        arrayList.add("as");
        arrayList.add("aaaag");
        arrayList.add("a4444g");
        arrayList.add("fg");
        List<String> arrayListTest = new ArrayList();
        arrayListTest.add("as");
        arrayListTest.add("ba");
        arrayListTest.add("ax");
        arrayListTest.add("aaaag");
        arrayListTest.add("a4444g");
        arrayListTest.add("fg");
        Swap swap = new Swap();
        Assert.assertEquals(arrayListTest, swap.doSwap(arrayList));
    }
    @Test
    public void SwapEqualsThirdStringsTest3() {
        List<String> arrayList = new ArrayList();
        arrayList.add("ax");
        arrayList.add("ba");
        arrayList.add("as");
        arrayList.add("aaaag");
        arrayList.add("fg");
        List<String> arrayListTest = new ArrayList();
        arrayListTest.add("as");
        arrayListTest.add("ba");
        arrayListTest.add("ax");
        arrayListTest.add("aaaag");
        arrayListTest.add("fg");
        Swap swap = new Swap();
        Assert.assertEquals(arrayListTest, swap.doSwap(arrayList));
    }
    @Test
    public void SwapEqualsStringsTest3() {
        List<String> arrayList = new ArrayList();
        arrayList.add("ax");
        arrayList.add("ba");
        arrayList.add("f777777");
        arrayList.add("as");
        arrayList.add("fg");
        Swap swap = new Swap();
        Assert.assertEquals(Arrays.asList("as", "ba", "fg", "ax", "f777777" ),swap.doSwap(arrayList));
    }
}

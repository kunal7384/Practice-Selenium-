package test;

import org.testng.annotations.Test;

public class GroupTestCases {
  @Test(groups = {"Sat","Sun"})
  public void A() {
	  System.out.println("A both Group");
  }
  @Test(groups = {"Sun"})
  public void B() {
	  System.out.println("B Sun Group");
  }
  @Test(groups = {"Sat"})
  public void C() {
	  System.out.println("C SAT Group");
  }
  @Test(groups = {"Sat","Sun"})
  public void D() {
	  System.out.println("D both Group");
  }
}

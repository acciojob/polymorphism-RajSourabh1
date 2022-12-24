package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
  public static void main(String[] args){
      Product p = new Product();
      int ans = p.product(10,20);
      int an1 = p.product(10,20,30);
      double ans2 = p.product(7.5,9.8);
  }
}
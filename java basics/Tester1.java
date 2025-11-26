// abstract method, abstract class

import java.util.*;
import java.io.*;

abstract class maths{
       public abstract int arearect(int l,int w);
       public abstract int volumecube(int s);
}

class maths1 extends maths{
      public int arearect(int l,int w){
          return l*w;
      }
      public int volumecube(int s){
          return s*s*s;
      }
}

public class Tester1{
      public static void main(String []args){
        maths1 m1 = new maths1();
        int area_rect = m1.arearect(3,6);
        int cube_vol = m1.volumecube(3);
        
        System.out.println("Rectangle area: " + area_rect);
        System.out.println("Cube volume :"+cube_vol);
      }
}
import test_packed.Test_Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import Unit.Unit;
import Unit.UnitStack;
import Map.Hero;

public class testMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            UnitStack stack = new UnitStack();
            ArrayList<Integer> i=new ArrayList<Integer>();
            i.add(0);
            i.add(2);
            i.add(1);
            Unit a =new Unit("A");
            stack.addUnit(a);
             a =new Unit("B");
            stack.addUnit(a);
             a =new Unit("C");
            stack.addUnit(a);
             a =new Unit("D");
            stack.addUnit(a);
            UnitStack otstack = new UnitStack();
            otstack.receiveStack(stack.sendStack(i));
            
            
           UnitStack gg = new UnitStack();
            a =new Unit("D");
            gg.addUnit(a);
            a =new Unit("B");
            gg.addUnit(a);
            Hero h = new Hero();
            ArrayList<Integer> hh=new ArrayList<Integer>();
            hh.add(0);
            
          
            //for(Unit u:otstack.returnUnitsAsArrayList()){
            //    u.testOut();
           // }
            
           
		// TODO Auto-generated method stub
		/*Test_Random tr = new Test_Random();
		Random r = new Random();
		for(int a = 2; a<9;a++){
			tr.testRandoms((int)(Math.pow(10,a)));
			tr.testRandomsRandom((int)(Math.pow(10,a)), r);
			/* Olennaisesti Random.nextInt() on tehokkaampi algoritmi satunnaisen luvun generoimiseen
			 *  Lis�ksi Random.nextInt() on l�hemp�n� todellista satunnaista kuin Math.random()
			 *  Lis�� infoa: https://community.oracle.com/message/6596485#thread-message-6596485
			 */
            
		}
		
	}



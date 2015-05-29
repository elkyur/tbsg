package test_packed;

import java.util.Random;

public class Test_Random {
	
	public Test_Random(){
		
	}

	public void testRandoms(int kerrat){
		long curr = System.currentTimeMillis();
		for(int a = 0; a < kerrat; a++){
			Math.random();
		}
		long curr2 = System.currentTimeMillis();
		System.out.print("Kulunut aika Math.random(): "+ kerrat + " heitolla: " + (curr2-curr) + "\n");
	}
	
	public void testRandomsRandom(int kerrat, Random r){
		long curr = System.currentTimeMillis();
		for(int a = 0; a < kerrat; a++){
			r.nextInt(10);
		}
		long curr2 = System.currentTimeMillis();
		System.out.print("Kulunut aika Random.nextInt(): "+ kerrat + " heitolla: " + (curr2-curr) + "\n");
	}
}
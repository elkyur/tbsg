package test_packed;

public class Test_Random {
	
	public Test_Random(){
		
	}

	public void testRandoms(int kerrat){
		long curr = System.currentTimeMillis();
		for(int a = 0; a < kerrat; a++){
			Math.random();
		}
		long curr2 = System.currentTimeMillis();
		System.out.print("Kulunut aika: "+ kerrat + " heitolla: " + (curr2-curr) + "\n");
	}
}
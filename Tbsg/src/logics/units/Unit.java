package logics.units;

public interface Unit {
	public int returnIdentity();
	public String returnName();
	public boolean returnMovingType(); //true == walking or flying; false == teleporting;
}

package spring.beans;

public class SurfMessageProvider implements IMessageProvider{

	@Override
	public String getMsg() {	
		return "Surfs up dude";
	}
}

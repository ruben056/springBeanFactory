package spring.beans;


public class Echo implements IEcho {

	private IMessageProvider messageProvider;
	
	public void setMessageProvider(IMessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	@Override
	public void echo() {
		System.out.println("echoing : " + messageProvider.getMsg());
	}

}

package dom.entity;

import com.namoo.ns1.common.Identifiable;

public class IdValue implements Identifiable {

	private static final long serialVersionUID = 7900173845749600863L;
	private String name;
	private int value;

	public IdValue(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String getOId() {		
		return name;
	}
	
	public void increase(){
		this.value++;
	}

}

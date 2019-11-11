package major;

public class Major {
	//专业名称
	private String optionName;
	private int idx;
	private String simpleFlag;
	private int type;
	

	public Major() {
		super();
	}

	public Major(String optionName, int idx, String simpleFlag, int type) {
		super();
		this.optionName = optionName;
		this.idx = idx;
		this.simpleFlag = simpleFlag;
		this.type = type;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getSimpleFlag() {
		return simpleFlag;
	}

	public void setSimpleFlag(String simpleFlag) {
		this.simpleFlag = simpleFlag;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}

package eduCation;

public class EduCation {
	private String optionName;
	private int idx;
	private int type;

	public EduCation() {
		super();
	}

	public EduCation(String optionName, int idx, int type) {
		super();
		this.optionName = optionName;
		this.idx = idx;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}

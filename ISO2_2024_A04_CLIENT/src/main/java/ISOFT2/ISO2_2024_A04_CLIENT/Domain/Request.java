package Domain;

public class Request {
	private int _requestID;
	private int _dataID;
	private String _status;
	private String _type;
	public DataMap _unnamed_DataMap_;
	public Alert _unnamed_Alert_;

	public void Report() {
		throw new UnsupportedOperationException();
	}

	public String GetType() {
		throw new UnsupportedOperationException();
	}
}
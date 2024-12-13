package Domain;

public class DataOwner {
	private int _ownerID;
	private String _name;
	private String _role;
	private String _permissions;
	private CollaboratorList _collaborators;
	public DataMap _unnamed_DataMap_;
	public BusinessProcess _unnamed_BusinessProcess_;
	public Business _unnamed_Business_;
	public CollaboratorList _unnamed_CollaboratorList_;
	public DataClassifier _unnamed_DataClassifier_;
	public DataStakeholder _unnamed_DataStakeholder_;

	public void autenticate(Map<String, String> aCredentials) {
		throw new UnsupportedOperationException();
	}

	public String getPermissions() {
		return this._permissions;
	}

	public CollaboratorList GetCollaborators() {
		throw new UnsupportedOperationException();
	}
}
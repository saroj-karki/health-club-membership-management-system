package hcmm;

public class Member {
	private String name, dob, membershipType, mobileNumber;
	private double membershipFee;
	
	/**
     * Initializes a newly created Member object
     */
	public Member() {
		this.name = "";
        this.dob = "";
        this.membershipType = "";
        this.mobileNumber = "";
        this.membershipFee = 0;
	}
	
	/**
     * Constructs a new part object with the value of the passed in parameters
     * 
     * @param name - the initial value of name
     * @param dob - the initial value of date of birth
     * @param membershipType - the initial value of membershipType
     * @param mobileNumber - the initial value of membershipType
     * @param membershipFee - the initial value of membershipFee
     */
	public Member(String name, String dob, String membershipType, String mobileNumber, double membershipFee) {
		this.name = name;
		this.dob = dob;
		this.membershipType = membershipType;
		this.mobileNumber = mobileNumber;
		this.membershipFee = membershipFee;
	}

	/**
     * Return the name of the member
     * 
     * @return the value of attribute name
     */
	public String getName() {
		return name;
	}
	
	/**
     * Set the name of member to a new value
     * 
     * @param name - new value of name
     */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
     * Return the dob of the member
     * 
     * @return the value of attribute dob
     */
	public String getDob() {
		return dob;
	}
	
	/**
     * Set the dob of member to a new value
     * 
     * @param dob - new value of dob
     */
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	/**
     * Return the membershipType of the member
     * 
     * @return the value of attribute membershipType
     */
	public String getMembershipType() {
		return membershipType;
	}
	
	/**
     * Set the membershipType of member to a new value
     * 
     * @param dob - new value of membershipType
     */
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	
	/**
     * Return the mobileNumber of the member
     * 
     * @return the value of attribute mobileNumber
     */
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	/**
     * Set the mobileNumber of member to a new value
     * 
     * @param dob - new value of mobileNumber
     */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	/**
     * Return the membershipFee of the member
     * 
     * @return the value of attribute membershipFee
     */
	public double getMembershipFee() {
		return membershipFee;
	}
	
	/**
     * Set the membershipFee of member to a new value
     * 
     * @param dob - new value of membershipFee
     */
	public void setMembershipFee(double membershipFee) {
		this.membershipFee = membershipFee;
	}
	
	
}

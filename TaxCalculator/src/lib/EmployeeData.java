package lib;

public class EmployeeData {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;
    private int yearJoined;
    private int monthJoined;
    private boolean isForeigner;
    private Gender gender;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getYearJoined() {
        return yearJoined;
    }
    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }
    public int getMonthJoined() {
        return monthJoined;
    }
    public void setMonthJoined(int monthJoined) {
        this.monthJoined = monthJoined;
    }
    public boolean isForeigner() {
        return isForeigner;
    }
    public void setForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }
    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public EmployeeData(String firstName, String lastName, String idNumber, String address, int yearJoined,
            int monthJoined, boolean isForeigner, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.address = address;
        this.yearJoined = yearJoined;
        this.monthJoined = monthJoined;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }
    
    
}
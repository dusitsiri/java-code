package lesson4interface.lesson46informationhiding.internal;

class Student implements StudentProvinceYear {
    private String name;
    private String thaiId;
    private String studentId;
    private int year;
    private String faculty;
    private String address;
    private String province;
    private String phone;
    private double GPA;


    public Student(String name, String thaiId, int year, String province) {
        this.name = name;
        this.thaiId = thaiId;
        this.year = year;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public String getFaculty() {
        return faculty;
    }

    public String getThaiId() {
        return thaiId;
    }

    public double getGPA() {
        return GPA;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}

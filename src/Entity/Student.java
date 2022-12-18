package Entity;

public class Student {
    private String sno;//学号
    private String sname;//姓名
    private String sex;//性别
    private String majorclass;//专业八级
    private String birthday;//生日
    private String telehphone;//手机号

    public Student() {
    }

    public Student(String sno, String sname, String sex, String majorclass, String birthday, String telehphone) {
        this.sno = sno;
        this.sname = sname;
        this.sex = sex;
        this.majorclass = majorclass;
        this.birthday = birthday;
        this.telehphone = telehphone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", majorclass='" + majorclass + '\'' +
                ", birthday='" + birthday + '\'' +
                ", telehphone='" + telehphone + '\'' +
                '}';
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajorclass() {
        return majorclass;
    }

    public void setMajorclass(String majorclass) {
        this.majorclass = majorclass;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTelehphone() {
        return telehphone;
    }

    public void setTelehphone(String telehphone) {
        this.telehphone = telehphone;
    }
}

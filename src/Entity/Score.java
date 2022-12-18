package Entity;

public class Score {
    private String CNo;//课程号
    private String SNo;//学号
    private Integer Score1;//第一门课分数
    private Integer Score2;//第二门课分数
    private Integer Score3;//第三门课分数

    public Score() {
    }

    public Score(String CNo, String SNo, Integer score1, Integer score2, Integer score3) {
        this.CNo = CNo;
        this.SNo = SNo;
        Score1 = score1;
        Score2 = score2;
        Score3 = score3;
    }

    public String getCNo() {
        return CNo;
    }

    public void setCNo(String CNo) {
        this.CNo = CNo;
    }

    public String getSNo() {
        return SNo;
    }

    public void setSNo(String SNo) {
        this.SNo = SNo;
    }

    public Integer getScore1() {
        return Score1;
    }

    public void setScore1(Integer score1) {
        Score1 = score1;
    }

    public Integer getScore2() {
        return Score2;
    }

    public void setScore2(Integer score2) {
        Score2 = score2;
    }

    public Integer getScore3() {
        return Score3;
    }

    public void setScore3(Integer score3) {
        Score3 = score3;
    }

    @Override
    public String toString() {
        return "Score{" +
                "CNo='" + CNo + '\'' +
                ", SNo='" + SNo + '\'' +
                ", Score1=" + Score1 +
                ", Score2=" + Score2 +
                ", Score3=" + Score3 +
                '}';
    }
}

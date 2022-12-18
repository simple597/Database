package Dao;

import Entity.Score;
import Entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScoreDAOImpl extends DAOBase implements ScoreDAO {
    private static final String Score_INSERT_SQL = "INSERT INTO studentclass(CNo,SNo,Score1,Score2,Score3) VALUES(?,?,?,?,?) ";

    @Override
    public void addScore(Score score) {
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(Score_INSERT_SQL);
            psmt.setString(1, score.getCNo());
            psmt.setString(2, score.getSNo());
            psmt.setString(3, String.valueOf(score.getScore1()));
            psmt.setString(4, String.valueOf(score.getScore2()));
            psmt.setString(5, String.valueOf(score.getScore3()));
            System.out.println("增加记录数:" + psmt.executeUpdate());
            psmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static final String SCORE_UPDATE_SQL = "UPDATE studentclass SET CNo=?, SNo=?, Score1=?, Score2=?, Score3 =? WHERE CNo=? and SNo=?";

    @Override
    public void updateScore(Score score) {
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(SCORE_UPDATE_SQL);
            psmt.setString(6,score.getCNo());
            psmt.setString(7,score.getSNo());

            psmt.setString(1,score.getCNo());
            psmt.setString(2,score.getSNo());
            psmt.setString(3,score.getScore1().toString());
            psmt.setString(4,score.getScore2().toString());
            psmt.setString(5,score.getScore3().toString());
            System.out.println("修改记录条数:" + psmt.executeUpdate());
            psmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static final String Score_DELETE_SQL = "DELETE from studentclass WHERE CNo=? and SNo=?";
    @Override
    public void deleteScore(String score_CNo, String score_SNo) {
        Connection con = null;
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(Score_DELETE_SQL);
            psmt.setString(1,score_CNo);
            psmt.setString(2,score_SNo);
            System.out.println("删除记录条数:"+psmt.executeUpdate());
            psmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static final String Score_SELECT_SQL = "SELECT * FROM studentclass WHERE CNo=? and SNo=?";

    @Override
    public Score getScore(String score_CNo, String score_SNo) {
        Connection con = null;
        Score score = new Score();
        try {
            con = getConnection();
            PreparedStatement psmt = con.prepareStatement(Score_SELECT_SQL);
            psmt.setString(1, score_CNo);
            psmt.setString(2, score_SNo);
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                score.setCNo(rs.getString("CNo"));
                score.setSNo(rs.getString("SNo"));
                score.setScore1(Integer.parseInt(rs.getString("Score1")));
                score.setScore2(Integer.parseInt(rs.getString("Score2")));
                score.setScore3(Integer.parseInt(rs.getString("Score3")));
            }
            psmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return score;
    }
}

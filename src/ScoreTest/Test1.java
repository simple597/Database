package ScoreTest;

import Dao.DAOFactory;
import Entity.Score;

public class Test1 {
    public static void main(String[] args) {
        Score score = new Score("M001","0592",90,95,100);
        DAOFactory.getInstance().getScoreDAO().addScore(score);
    }
}

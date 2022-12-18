package ScoreTest;

import Dao.DAOFactory;
import Entity.Score;

public class Test3 {
    public static void main(String[] args) {
        Score score = new Score("K001","0433",80,90,100);
        DAOFactory.getInstance().getScoreDAO().updateScore(score);
    }
}

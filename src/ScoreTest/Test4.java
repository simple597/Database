package ScoreTest;

import Dao.DAOFactory;

public class Test4 {
    public static void main(String[] args) {
        DAOFactory.getInstance().getScoreDAO().deleteScore("K001","0433");
    }
}

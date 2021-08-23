package ladder;

import ladder.domain.Ladder;
import ladder.domain.Users;
import ladder.view.InputView;
import ladder.view.OutputView;

import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<String> names = InputView.inputNamesOfUsers();
        Users users = Users.valueOf(names);
        int height = InputView.inputHeightOfLadder();

        Ladder ladder = Ladder.create(height, names.size());

        OutputView.printNames(users);
        OutputView.printLadder(ladder);
    }
}

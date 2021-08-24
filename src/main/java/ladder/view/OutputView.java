package ladder.view;

import ladder.domain.Lines;
import ladder.domain.Line;
import ladder.domain.Users;

import java.util.stream.Collectors;

public class OutputView {
    private static final String RESULT_TITLE = "\n실행결과\n";
    private static final String LINE_TRUE = "-----";
    private static final String LINE_FALSE = "     ";
    private static final String LINE_DELIMITER = "|";

    public static void printNames(Users users) {
        System.out.println(RESULT_TITLE);
        users.getNames().stream().forEach(name -> System.out.printf("%6s", name.getName()));
        System.out.println();
    }

    public static void printLadder(Lines ladder) {
        ladder.getLadder()
              .stream()
              .map(OutputView::generateLine)
              .forEach(System.out::println);
    }

    public static String generateLine(Line line) {
        return line.getPoints()
                   .stream()
                   .map(flag -> flag ? LINE_TRUE : LINE_FALSE)
                   .collect(Collectors.joining(LINE_DELIMITER)) + "|";

    }
}

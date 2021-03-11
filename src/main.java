import java.util.Scanner;
import java.util.*;

public class main {
    public static void main (String [] args ) {
        Scanner in = new Scanner(System.in);
        List<Command> commands = new ArrayList<>();
        commands.add(new TimeCommand());
        commands.add(new DateCommand());
        commands.add(new ExitCommand());
        commands.add(new DirCommand());
        commands.add(new HelpCommand());
//        System.out.println(">> help/ will show  you available commands");
//        String cmd = in.nextLine();
        while (true) {
            System.out.print(">>");
            String cmd = in.nextLine();

            for (Command command : commands)
                if (command.getName().contentEquals(cmd)) {
                    command.exec();
                    break;
                } else {
                    command.showHelp();
                }
        }
    }
}
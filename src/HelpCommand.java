public class HelpCommand  implements Command {
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void exec() {
        System.out.println("time - Moscow time");
        System.out.println("date - world date");
        System.out.println("exit - end of cmd");
        System.out.println("dir - getting the current directory");
    }

    @Override
    public void showHelp() {
        System.out.println("Not met a command, please select a command from the suggested");
        System.out.println("time - Moscow time");
        System.out.println("date - world date");
        System.out.println("exit - end of cmd");
        System.out.println("dir - getting the current directory");

    }
}

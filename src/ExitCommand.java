public class ExitCommand implements Command {

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public void exec() {
          System.exit(0);

    }

    @Override
    public void showHelp() {


    }
}

public interface Command {
        String getName();
        void exec();
        void showHelp();
}

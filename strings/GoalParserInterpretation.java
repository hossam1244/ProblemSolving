package strings;

public class GoalParserInterpretation {

    public static void main(String[] args) {
      String command = "G()(al)";
      interpret(command);
    }

    static  public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
}

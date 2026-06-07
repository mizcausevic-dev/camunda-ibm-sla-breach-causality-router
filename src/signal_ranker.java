import java.util.Comparator;
import java.util.List;

record ProcessSignal(String lane, int exposure, int savings, int investment, String boardStory) {
  int priority() {
    return Math.round((float) (exposure * 0.45 + savings * 0.25 + investment * 0.30));
  }
}

public final class SignalRanker {
  static final List<ProcessSignal> SIGNALS = List.of(
    new ProcessSignal("Camunda timer drift", 70, 19, 61, "Workflow automation should start where timer drift blocks board-visible throughput."),
    new ProcessSignal("IBM batch handoff exposure", 76, 22, 64, "Mainframe dependencies need explicit ownership before modernization spend scales."),
    new ProcessSignal("Exception queue causality", 68, 15, 58, "Process exceptions should map to a concrete change window, not a generic backlog.")
  );

  public static void main(String[] args) {
    SIGNALS.stream()
      .sorted(Comparator.comparingInt(ProcessSignal::priority).reversed())
      .forEach(signal -> System.out.println("camunda-ibm-sla-breach-causality-router | " + signal.lane() + " | " + signal.priority() + " | " + signal.boardStory()));
  }
}

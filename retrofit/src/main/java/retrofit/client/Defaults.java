package retrofit.client;

public final class Defaults {
  public static int CONNECT_TIMEOUT_MILLIS = 15 * 1000; // 15s
  public static int READ_TIMEOUT_MILLIS = 20 * 1000; // 20s

  private Defaults() {
    // No instances.
  }
}

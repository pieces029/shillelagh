package shillelagh.internal;

final class Strings {

  private Strings() {
    // No instances.
  }

  /** Checks if the string is blank, like TextUtils.isEmpty() but better */
  static boolean isBlank(CharSequence string) {
    return (string == null || string.toString().trim().length() == 0);
  }

  /** Checks if a string there, if not returns the default string */
  static String valueOrDefault(String string, String defaultString) {
    return isBlank(string) ? defaultString : string;
  }

  /** Truncates the string at the length specified */
  static String truncateAt(String string, int length) {
    return string.length() > length ? string.substring(0, length) : string;
  }

  /** Capitalizes the first letter of the string passed in */
  static String capitalize(String string) {
    if (isBlank(string)) {
      return "";
    }
    char first = string.charAt(0);
    if (Character.isUpperCase(first)) {
      return string;
    } else {
      return Character.toUpperCase(first) + string.substring(1);
    }
  }
}
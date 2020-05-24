package com.wildcodeschool.quest.maven;

import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestCharset {

  public static void main(String[] args) {

    //System.out.println("Current OS charset: " + Charset.defaultCharset().displayName());

    // Hint: this file was written after 1974 in the soviet union,
    // using another charset than UTF-8 (Linux/Mac) or CP1252 (Western Windows)
    String trickyTextToDisplay = "Минск is Belarus capital...but can you read it?";

    /*
      On top of the issue at hand (compiling java code written using a non-western charset/text editor), we need to
      ensure the above message will display correctly on whichever OS and above all whichever terminal you're using.

      A straight System.out.println(...) is what you'll always use, but not with the specifics of this quest...
      As a matter of fact java's System.out.println with non-latin alphabets only works correctly on Linux/Mac (UTF-8)
      terminals. In turn Windows consoles are using non-unicode codepages (eg my Western Windows10 uses the CP1252
      charset and its console and power shell use the CP437 US codepage, damn)! The only available alternative on
      Windows that's compatible with Linux/Mac charset is UTF-8, that is codepage 65001
      (see https://ss64.com/nt/chcp.html). Hence we're forcing the output of bytes on the terminal in the UTF-8 charset
      no matter what your OS is and we hope you 'chcp 65001' on your console before executing this program on Windows :)
     */
    try(PrintStream ps = new PrintStream(System.out, true, StandardCharsets.UTF_8)) {
      ps.println(trickyTextToDisplay);
    }
  }
}

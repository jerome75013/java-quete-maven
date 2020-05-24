package com.wildcodeschool.quest.maven;

public class TestPid {

  public static void main(String[] args) {

    long pid = ProcessHandle.current().pid();
    System.out.printf("PID of the program: %d%n", pid);
  }
}

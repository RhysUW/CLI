package org.example;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name="hello", mixinStandardHelpOptions = true, version ="hello 1.0",
            description = "prints 'Hello SaaSquatch!' when run")

public class Main implements Runnable{

    public static void main(String[] args) {
        int exitcode = new CommandLine(new Main()).execute(args);
        System.exit(exitcode);
    }

    @Override
    public void run() {
        System.out.printf("Hello SaaSquatch!");  //command is './gradlew hello'
    }

}
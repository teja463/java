package com.designpatterns.journaldev.structural.proxy;

import com.designpatterns.journaldev.structural.proxy.CommandExecutor;
import com.designpatterns.journaldev.structural.proxy.CommandExecutorProxy;

import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        CommandExecutor command1 = new CommandExecutorProxy("test", "test");
        command1.runCommand("cmd");

        CommandExecutor command2 = new CommandExecutorProxy("test", "asdf");
        command2.runCommand("rm");
    }
}

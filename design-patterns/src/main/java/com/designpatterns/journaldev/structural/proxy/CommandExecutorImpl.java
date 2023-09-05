package com.designpatterns.journaldev.structural.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void runCommand(String str) throws IOException {
        Runtime.getRuntime().exec(str);
    }
}

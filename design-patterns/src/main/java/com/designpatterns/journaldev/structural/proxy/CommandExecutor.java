package com.designpatterns.journaldev.structural.proxy;

import java.io.IOException;

public interface CommandExecutor {

    void runCommand(String str) throws IOException;
}

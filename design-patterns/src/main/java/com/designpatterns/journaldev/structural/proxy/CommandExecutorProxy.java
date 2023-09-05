package com.designpatterns.journaldev.structural.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor{

    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String userName, String password){
        if(userName.equals("test") && password.equals("test")){
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String str) throws IOException {
        if(isAdmin){
            commandExecutor.runCommand(str);
        }else{
            if(str.startsWith("rm")){
                throw new IllegalStateException("Cant execute command you are not admin");
            }else{
                commandExecutor.runCommand(str);
            }
        }
    }
}

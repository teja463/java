package com.designpatterns.journaldev.creational.singleton;

/**
 * With static block it is still eager intialization but we have scope for exception handling
 */
public class EagerIntializationStaticBlock {

    private static EagerIntializationStaticBlock instance;

    static {
        if (null == instance) {
            try {
                instance = new EagerIntializationStaticBlock();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static EagerIntializationStaticBlock getInstance(){
        return instance;
    }
    private EagerIntializationStaticBlock() {
    }
}

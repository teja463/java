package com.designpatterns.journaldev.creational.singleton;

public class Demo {

    public static void main(String[] args) {
        EagerIntialization eager1 = EagerIntialization.getInstance();
        EagerIntialization eager2 = EagerIntialization.getInstance();
        System.out.println(eager1.hashCode());
        System.out.println(eager2.hashCode());

        EagerIntializationStaticBlock static1 = EagerIntializationStaticBlock.getInstance();
        EagerIntializationStaticBlock static2 = EagerIntializationStaticBlock.getInstance();
        System.out.println(static1.hashCode());
        System.out.println(static2.hashCode());

        LazyIntialization lazy1 = LazyIntialization.getInstance();
        LazyIntialization lazy2 = LazyIntialization.getInstance();
        System.out.println(lazy1.hashCode());
        System.out.println(lazy2.hashCode());

        LazyIntializationThreadsafe threadsafe1 = LazyIntializationThreadsafe.getInstance();
        LazyIntializationThreadsafe threadsafe2 = LazyIntializationThreadsafe.getInstance();
        System.out.println(threadsafe1.hashCode());
        System.out.println(threadsafe2.hashCode());

        StaticHelperSingleton bill1 = StaticHelperSingleton.getInstance();
        StaticHelperSingleton bill2 = StaticHelperSingleton.getInstance();
        System.out.println(bill1.hashCode());
        System.out.println(bill2.hashCode());

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.another();
    }
}

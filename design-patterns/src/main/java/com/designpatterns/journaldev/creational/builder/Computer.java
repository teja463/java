package com.designpatterns.journaldev.creational.builder;

import lombok.ToString;

@ToString
public class Computer {

    // mandatory
    private String ram;
    private String hdd;

    // optional
    private String keyboard;
    private String mouse;

    private Computer(ComputerBuilder computerBuilder) {
        this.ram = computerBuilder.ram;
        this.hdd = computerBuilder.hdd;
        this.keyboard = computerBuilder.keyboard;
        this.mouse = computerBuilder.mouse;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public static class ComputerBuilder {
        // mandatory
        private String ram;
        private String hdd;

        // optional
        private String keyboard;
        private String mouse;

        public ComputerBuilder(String ram, String hdd) {
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder keyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public ComputerBuilder mouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

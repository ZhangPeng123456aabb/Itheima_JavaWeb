package com.baizhi.spring;

import java.sql.SQLOutput;

public class TestLamp {
    public static void main(String[] args) {
        Lamp I = new Lamp();
        I.on(new Light() {
            public void shine() {
                System.out.println("shine in yellow");
            }
        });
        class Light {
            public void shine() {
                System.out.println("shine in red");
            }
        }
        Light light = new Light();
            light.shine();
        }
    }

    interface Light {
        void shine();
    }

    class Lamp {
        public void on(Light light) {
            light.shine();
        }
    }


package org.javaguru.student_anton_varlakov.lesson_3.level_7;

class MusicSpeaker {

    private String model;
    private int soundLevel;
    private boolean state;

    public MusicSpeaker(String model) {
        this.model = model;
        this.soundLevel = 0;
        this.state = false;
    }

    public void stateOn() {
        this.state = true;
    }

    public void onSound() {
        if (this.state) {
            soundLevel += 1;
        }
    }

    public void offSound() {
        this.soundLevel = 0;
        this.state = false;
    }

    public String getModel() {
        return model;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public boolean getState() {
        return state;
    }

}

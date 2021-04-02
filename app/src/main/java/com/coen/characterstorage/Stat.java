package com.coen.characterstorage;

public class Stat {
    private int rawStat;
    private int mod;

    public Stat(int rawStat) {
        this.rawStat = rawStat;
        mod = (int) (rawStat-10) / 2;
    }

    public int getRawStat() {
        return rawStat;
    }

    public void setRawStat(int rawStat) {
        this.rawStat = rawStat;
        mod = (int) rawStat /2;
    }

    public int getMod() {
        return mod;
    }

}

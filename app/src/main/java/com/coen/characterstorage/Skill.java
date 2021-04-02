package com.coen.characterstorage;

public class Skill {
    private int mod;
    private int bonus;
    private int skill;
    private boolean proficient = false;

    public Skill(int mod, int bonus) {
        this.mod = mod;
        this.bonus = bonus;
        skill = mod + bonus;
    }
    public int getSkill(){
        return skill;
    }

    public void setProficient(boolean proficient){
        this.proficient = proficient;
    }
    public boolean isProficient(){
        return proficient;
    }
}
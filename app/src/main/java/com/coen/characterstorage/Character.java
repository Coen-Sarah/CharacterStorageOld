package com.coen.characterstorage;

public class Character {
    //character details insert
    private String name;
    private String race;
    private String charClass;
    private int level;
    private String alignment;
    private int armorClass;
    private int speed;
    private int healthPoints;
    private String hitDice;
    private Stat str, dex, con, intl, wis, cha;
    //character details calculated
    private int proficiency;
    private Skill initiative;
    private int passivePerception;
    //str skills
    private Skill athletics;
    //dex skills
    private Skill acrobatics, sleightOfHand, stealth;
    //intl skills
    private Skill arcana, history, investigation, nature, religion;
    //wis skills
    private Skill animalHandling, insight, medicine, perception, survival;
    //cha skills
    private Skill deception, intimidation, performance, persuasion;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }

    public String getCharClass() {
        return charClass;
    }
    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
        calcProficiency();
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getHitDice() {
        return hitDice;
    }

    public void setHitDice(String hitDice) {
        this.hitDice = hitDice;
    }

    private void calcInitiative(){
        initiative = new Skill(dex.getMod(),0);
    }
    public Skill getInitiative(){
        return initiative;
    }

    private void calcPassivePerception(){
        passivePerception = perception.getSkill() + 10;
    }
    public int getPassivePerception(){
        return passivePerception;
    }

    private void calcProficiency() {
        proficiency = (int) (level / 4) + 1;
    }
    public int getProficiency(){
        return proficiency;
    }

    public Stat getStr() {
        return str;
    }
    public void setStr(int str) {
        this.str = new Stat(str);
        calcAthletics();
    }
    //str skills
    private void calcAthletics(){
        athletics = new Skill(str.getMod(),0);
    }
    public Skill getAthletics(){
        return athletics;
    }

    public void setDex(int dex){
        this.dex = new Stat(dex);
        calcAcrobatics();
        calcSleightOfHand();
        calcStealth();
    }
    public Stat getDex(){
        return dex;
    }
    //dex skills
    private void calcAcrobatics(){
        acrobatics = new Skill(this.dex.getMod(),0);
    }
    public Skill getAcrobatics() {
        return acrobatics;
    }

    private void calcSleightOfHand(){
        sleightOfHand = new Skill(this.dex.getMod(),0);
    }
    public Skill getSleightOfHand() {
        return sleightOfHand;
    }

    public void calcStealth(){
        stealth = new Skill(this.dex.getMod(),0);
    }
    public Skill getStealth() {
        return stealth;
    }

    public Stat getCon() {
        return con;
    }
    public void setCon(int con) {
        this.con = new Stat(con);
    }
    //no con skills
    public Stat getIntl() {
        return intl;
    }
    public void setIntl(int intl) {
        this.intl = new Stat(intl);
        calcArcana();
        calcHistory();
        calcInvestigation();
        calcNature();
        calcReligion();
    }

    private void calcArcana(){
        arcana = new Skill(this.intl.getMod(),0);
    }
    public Skill getArcana() {
        return arcana;
    }

    private void calcHistory(){
        history = new Skill(this.intl.getMod(),0);
    }
    public Skill getHistory() {
        return history;
    }

    private void calcInvestigation(){
        investigation = new Skill(this.intl.getMod(),0);
    }
    public Skill getInvestigation() {
        return investigation;
    }

    private void calcNature(){
        nature = new Skill(this.intl.getMod(),0);
    }
    public Skill getNature() {
        return nature;
    }

    private void calcReligion(){
        religion = new Skill(this.intl.getMod(),0);
    }
    public Skill getReligion() {
        return religion;
    }

    public Stat getWis() {
        return wis;
    }
    public void setWis(int wis) {
        this.wis = new Stat(wis);
        calcAnimalHandling();
        calcInsight();
        calcMedicine();
        calcPerception();
        calcSurvival();
    }
    //wis skills
    private void calcAnimalHandling(){
        animalHandling = new Skill(this.wis.getMod(),0);
    }
    public Skill getAnimalHandling() {
        return animalHandling;
    }

    private void calcInsight(){
        insight = new Skill(this.wis.getMod(),0);
    }
    public Skill getInsight() {
        return insight;
    }

    private void calcMedicine(){
        medicine = new Skill(this.wis.getMod(),0);
    }
    public Skill getMedicine() {
        return medicine;
    }

    private void calcPerception(){
        perception = new Skill(this.wis.getMod(),0);
    }
    public Skill getPerception() {
        return perception;
    }

    private void calcSurvival(){
        survival = new Skill(this.wis.getMod(),0);
    }
    public Skill getSurvival() {
        return survival;
    }

    public Stat getCha() {
        return cha;
    }
    public void setCha(int cha) {
        this.cha = new Stat(cha);
        calcDeception();
        calcIntimidation();
        calcPerformance();
        calcPersuasion();
    }
    //cha skills

    private void calcDeception(){
        deception = new Skill(this.cha.getMod(),0);
    }
    public Skill getDeception() {
        return deception;
    }

    private void calcIntimidation(){
        intimidation = new Skill(this.cha.getMod(),0);
    }
    public Skill getIntimidation() {
        return intimidation;
    }

    private void calcPerformance(){
        performance = new Skill(this.cha.getMod(),0);
    }
    public Skill getPerformance() {
        return performance;
    }

    private void calcPersuasion(){
        persuasion = new Skill(this.cha.getMod(),0);
    }
    public Skill getPersuasion() {
        return persuasion;
    }
}

class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (!fighter.isVulnerable()){
            return 6;
        } else {
            return 10;
        }
    }
}

// TODO: define the Wizard class

class Wizard extends Fighter{

    private boolean isSpellPrepared = false;

    boolean prepareSpell(){
        isSpellPrepared = true;
        return true;
    }

    @Override
    boolean isVulnerable(){
        return !isSpellPrepared;
    }

    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    int getDamagePoints(Fighter fighter){
        if (isSpellPrepared){
            return 12;
        } else{
            return 3;
        }
    }


}
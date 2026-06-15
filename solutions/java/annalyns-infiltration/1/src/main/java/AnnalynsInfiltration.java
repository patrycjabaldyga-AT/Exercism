class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        if (knightIsAwake == false){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");

        if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false){
            return false;
        } else {
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");

        if (archerIsAwake == false && prisonerIsAwake == true){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
//        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");

        if (petDogIsPresent == false && knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true){
            return true;
        } else if (petDogIsPresent == true && knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false) {
            return true;
        } else if (petDogIsPresent == true && knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true){
            return true;
        } else if (petDogIsPresent == true && knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == true){
            return true;
        } else if (petDogIsPresent == true && knightIsAwake == true && archerIsAwake == false && prisonerIsAwake == false){
            return true;
        } else {
            return false;
        }
    }
}

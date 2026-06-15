class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if (!knightIsAwake){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return false;
        } else {
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {

        // can be simplified by !archerIsAwake (that means false), and if statement is not declared then as default is true so no need to write (prisonerIsAwake == true)
        if (!archerIsAwake && prisonerIsAwake){
            return true;
        } else {
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        if (!petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake){
            return true;
        } else if (petDogIsPresent && !knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
            return true;
        } else if (petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake){
            return true;
        } else if (petDogIsPresent && knightIsAwake && !archerIsAwake && prisonerIsAwake){
            return true;
        } else if (petDogIsPresent && knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return true;
        } else {
            return false;
        }
    }
}

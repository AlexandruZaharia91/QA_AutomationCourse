package OptionalExercisesPart2;

public class AnnalynInfiltration {
    boolean knightIsAwake;
    boolean archerIsAwake;
    boolean prisonerIsAwake;
    boolean petDogIsPresent;


    public AnnalynInfiltration(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        this.knightIsAwake = knightIsAwake;
        this.archerIsAwake = archerIsAwake;
        this.prisonerIsAwake = prisonerIsAwake;
        this.petDogIsPresent = petDogIsPresent;
    }

    public static void main(String[] args) {
        AnnalynInfiltration infiltration = new AnnalynInfiltration(false, false,true,true);
        System.out.println("prisoner can be free: " + infiltration.canFreePrisoner());
    }

    public boolean canFastAttack() {
        return knightIsAwake ? false : true;
    }

    public boolean canSpy() {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public boolean canSignalPrisoner() {
        return archerIsAwake || prisonerIsAwake;
    }

    public boolean canFreePrisoner() {
        boolean prisonerFree = false;

        if (canFastAttack() == false && canSpy() == true && canSignalPrisoner() == true && petDogIsPresent == false) {

        } else if (canFastAttack() == false && canSpy() == true && canSignalPrisoner() == true && petDogIsPresent == true) {
            prisonerFree = true;
        }
        return prisonerFree;
    }

}

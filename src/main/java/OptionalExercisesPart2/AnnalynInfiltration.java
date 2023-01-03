package OptionalExercisesPart2;

public class AnnalynInfiltration {
    boolean knightIsAwake;
    boolean archerIsAwake;
    boolean prisonerIsAwake;
    boolean petDogIsPresent;
    boolean free = false;


    public AnnalynInfiltration(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        this.knightIsAwake = knightIsAwake;
        this.archerIsAwake = archerIsAwake;
        this.prisonerIsAwake = prisonerIsAwake;
        this.petDogIsPresent = petDogIsPresent;
    }

    public static void main(String[] args) {
        AnnalynInfiltration infiltration = new AnnalynInfiltration(false, true, true, true);
        System.out.println("fast attack: " + infiltration.canFastAttack());
        System.out.println("spy: " + infiltration.canSpy());
        System.out.println("signal prisoner: " + infiltration.canSignalPrisoner());
        System.out.println("prisoner can be free: " + infiltration.canFreePrisoner());

    }

    public boolean canFastAttack() {
        return !knightIsAwake;
    }

    public boolean canSpy() {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public boolean canSignalPrisoner() {
        return !(archerIsAwake) && prisonerIsAwake;
    }

    public boolean canFreePrisoner() {

        if (petDogIsPresent && knightIsAwake && !archerIsAwake) {
            free = true;
        } else if (prisonerIsAwake && !archerIsAwake) {
            free = true;
        }
        return free;
    }

}

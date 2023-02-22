public class Main {
    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 87;
        int mishaAge = 17;

        int min = -1;
        int middle = -1;
        int max = -1;

        if ((vasyaAge >= 120 || vasyaAge < 0) || (katyaAge >= 120 || katyaAge < 0) || (mishaAge >= 120 || mishaAge < 0)) {
            System.out.println("incorrect data");
        }
        if (vasyaAge == katyaAge && vasyaAge == mishaAge) {
            min = vasyaAge;
            middle = katyaAge;
            max = mishaAge;
        }
        if (vasyaAge > katyaAge && katyaAge > mishaAge) {
            min = mishaAge;
            middle = katyaAge;
            max = vasyaAge;
        } else if (vasyaAge > mishaAge && mishaAge > katyaAge) {
            min = katyaAge;
            middle = mishaAge;
            max = vasyaAge;
        } else if (mishaAge > vasyaAge && vasyaAge > katyaAge) {
            min = katyaAge;
            middle = vasyaAge;
            max = mishaAge;
        } else if (mishaAge > katyaAge && katyaAge > vasyaAge) {
            min = vasyaAge;
            middle = katyaAge;
            max = mishaAge;
        } else if (katyaAge > vasyaAge && vasyaAge > mishaAge) {
            min = mishaAge;
            middle = vasyaAge;
            max = katyaAge;
        } else if (katyaAge > mishaAge && mishaAge > vasyaAge) {
            min = vasyaAge;
            middle = mishaAge;
            max = katyaAge;
        }

        if (vasyaAge == katyaAge && katyaAge < mishaAge) {
            min = vasyaAge;
            middle = katyaAge;
            max = mishaAge;
        } else if (vasyaAge == mishaAge && mishaAge < katyaAge) {
            min = vasyaAge;
            middle = mishaAge;
            max = katyaAge;
        } else if (katyaAge == mishaAge && mishaAge < vasyaAge) {
            min = katyaAge;
            middle = mishaAge;
            max = vasyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}
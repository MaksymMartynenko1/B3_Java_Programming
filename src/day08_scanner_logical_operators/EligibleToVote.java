package day08_scanner_logical_operators;
/*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote if they are a citizen, have no criminal background and are about age 18

    print : $name is eligible to vote: $boolean

 */
public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Tom Jerey";
        boolean isCitizen = true;
        boolean hasCriminal = false;
        int age = 49;

        boolean isEligible = age >= 18 && isCitizen && hasCriminal;
        //                        true &&   true   && false
        //                              true && false
        //                                     false

        System.out.println(name + " is eligible to vote: " + isEligible);

        // PERSON #2
        String name2 = "Vinnie Pooh";
        boolean isCitizen2 = true;
        boolean hasCriminal2 = true;
        int age2 = 59;

        boolean isEligible2 = age >= 18 && isCitizen && hasCriminal;
        //                      true && true && !true
        //                          true && false
        //                              false
        System.out.println(name2 + " is eligible to vote: " + isEligible2);


    }
}

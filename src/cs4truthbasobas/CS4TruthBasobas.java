package cs4truthbasobas;

/**
 *
 * @author TRUTH
 */
public static void main(String[] args) {
        //nickname, age, main hobby, snack preference
        
        String sib1 = "Yvette Basobas ";
        int age1 = 19;
        String hob1 = "Reading";
        var snackPref1 = "Savory"; //Do they prefer a sweet or a savory snack?
        System.out.println(sib1);
        System.out.println("Age: " + age1);
        System.out.println("Hobby: " + hob1);
        System.out.println("Snack preference(Sweet or Savory): " + snackPref1 + "\n");
        
        String sib2 = "Sandy Basobas ";
        int age2 = 15;
        String hob2 = "Binge-watching";
        var snackPref2 = "Sweet"; //Do they prefer a sweet or a savory snack?
        System.out.println(sib2);
        System.out.println("Age: " + age2);
        System.out.println("Hobby: " + hob2);
        System.out.println("Snack preference(Sweet or Savory): " + snackPref2 + "\n");
        
        String sib3 = "Julia basobas ";
        int age3 = 12;
        String hob3 = "Gaming";
        var snackPref3 = "Savory"; //Do they prefer a sweet or a savory snack?
        System.out.println(sib3);
        System.out.println("Age: " + age3);
        System.out.println("Hobby: " + hob3);
        System.out.println("Snack preference(Sweet or Savory): " + snackPref3 + "\n");
        
        int diffAges = age1 - age3;
        System.out.println("Difference between the ages of the eldest and youngest sibling: " + diffAges + " years"); //(operation: difference)
        boolean teen = age3 >= 13 && age1 <=19 ;
        System.out.println("The youngest sibling is already a teen: " + teen); //(operation: comparison)
        boolean sameHobbies = (hob1.equals(hob3) || hob1.equals(hob2) || hob2.equals(hob3));
        System.out.println("No two siblings have the same main hobby: " + !(sameHobbies)); //(operation: comparison and logical)
        boolean sameSnackPref = snackPref2.equals(snackPref3);
        System.out.println("The middle and youngest sibling have similar snack preference: " + sameSnackPref); //(operation: comparison)
    }
    
}

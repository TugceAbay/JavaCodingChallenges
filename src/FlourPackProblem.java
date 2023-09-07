public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));

    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        // bigCount 5kg bag, smallCount 1kg bag
        // goal: total kg to assemble a package

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        if (((bigCount*5) + smallCount) >= goal) {
            while ((goal >= 5) && (bigCount > 0)) {
                goal-=5;
                bigCount--;
            }
            while ((goal > 0) && (smallCount > 0)) {
                goal--;
                smallCount--;
            }
        }
        return goal == 0;
    }

//    public static boolean canPack (int bigCount, int smallCount, int goal) {
//        // bigCount 5kg bag, smallCount 1kg bag
//        // goal: total kg to assemble a package
//
//        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
//            return false;
//        }
//
//        if (((bigCount*5) + smallCount) >= goal) {
//            while ((goal >= 5) && (bigCount > 0)) {
//                goal-=5;
//                bigCount--;
//            }
//
//        }
//        return smallCount >= goal;
//    }
}

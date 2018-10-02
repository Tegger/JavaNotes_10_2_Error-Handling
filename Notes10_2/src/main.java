public class main {
    /**
     *
     * @param num1
     * @param num2
     * @return the sum of sum1 and sum2
     */
    public int addint(int num1, int num2){
        int x = num1 + num2;
        return x;
    }
    /**
     * main
     * @author Thomas Egger
     * @param args Takes input from command ling
     * @throws Exception only if I messed up
     * 10/2/18 modified example
     */



    public static void main(String args[]) throws Exception {
        String sTest = "The quick brown fox jumped over the lazy dog.";
        String[] sArray = sTest.split(" ");//creates an array out of each item before and after a space
        String sTestError = "";
        boolean bImessedUp = true;

        try{

        if(!bImessedUp){
            throw new Exception("This is messed up yo!");
        }
        sTestError = sArray[32];
        System.out.println(sTestError);
        }catch (ArrayIndexOutOfBoundsException e){
            sTestError = sArray[0];
            e.printStackTrace();
            System.out.println("The index is out of bounds.");
        }catch (Exception e){//Always put this at the end
            switch (e.getMessage()){
                case "This is messing me up yo!":
                    System.out.println(e.getMessage());
                    break;
            }
            e.printStackTrace();
        }finally {
            //close streams, databases,
        }


        for(String x:sArray){
            System.out.println(x);

        }

        System.out.println(sTestError);
        System.out.println("Outside of the try and catch statement.");


    }
}

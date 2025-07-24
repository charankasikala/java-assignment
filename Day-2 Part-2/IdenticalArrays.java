public class IdenticalArrays {
    public static void main(String[] args) {
        char X [] = {'m', 'n', 'o', 'p'};
        char Y [] = {'m', 'n', 'o', 'p'};
        boolean isIdentical = true;
        if(X.length != Y.length){
            isIdentical = false;
        }
        else{
            for(int i=0; i<X.length; i++){
                if(X[i] != Y[i]){
                    isIdentical = false;
					break;
                }
            }
            
        }
		if(isIdentical){
                System.out.println("Arrays are identical");
            }
            else{
                System.out.println("Arrays are not identical");
            }
    }

}


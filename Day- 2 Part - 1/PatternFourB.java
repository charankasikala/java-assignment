class PatternFourB {
    public static void main(String[] args) {
        String s = "ZOHOCORPORATIONS";
        int len = s.length();
        int i= 0;
        do{
            int last = Math.min(i+4,len);
            System.out.println(s.substring(i,last));
            i+=4;
        }while(i<len);

    }
}
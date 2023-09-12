class ConcatTest{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuffer sb1 =new StringBuffer("String");
        for(long i=0;i<100000000;i++){
            sb1.append(" Buffer");
        }
        System.out.println("String Buffer time taken: "+(System.currentTimeMillis()-startTime)+"ms");


        StringBuilder sb2 = new StringBuilder("String");
        startTime = System.currentTimeMillis();
        for(long i=0;i<100000000;i++){
            sb2.append(" Builder");
        }
        System.out.println("String Builder time taken: "+(System.currentTimeMillis()-startTime)+"ms");
    }
}
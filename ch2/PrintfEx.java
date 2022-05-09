class PrintfEx {
    public static void main(String[] args) {
        int finger = 10;
        double d = 1.23456789;
        String url = "www.codechobo.com";
        
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("d=%14.10f%n", d);
        System.out.printf("[%.8s]%n", url);
    }
}
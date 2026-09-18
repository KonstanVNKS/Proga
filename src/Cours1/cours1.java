void main() {
//    System.out.println(somme());
    System.out.printf("%.2f€",convert(1000));
}

int somme(){
    Scanner s = new Scanner(System.in);
    System.out.println("Choisissez le premier nombre ");
    int a = s.nextInt();
    System.out.println("Choisissez le deuxieme nombre ");
    int b = s.nextInt();
    return a+b;
}

double convert(int francs){
    return francs/40.3399;
}


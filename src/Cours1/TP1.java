package Cours1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TP1 {
    static void main() {
        int[] tab = {1,2,3,4,9,5,10,15};
        int[] tab1={0,2,4,8,8,10};
        int[] tab2={1,3,5,7,7};
//        System.out.println(min(tab));
//        reverse(tab);
//        rCyclical(tab);
        int[] exe = fusion(tab1,tab2);
        printt(exe);

//        int[] exe1 = concat(tab1,tab2);
        matrice();

    }
    public static void printm( int[][] tab){
        for(var elem:tab){
            for(var el:elem)
                System.out.print(el+" ");
            System.out.println(" ");
        }
    }

    public static void printt( int[]tab){
        for(var elem:tab){
            System.out.print(elem+" ");
        }
    }

    public static int min(int[] tab){
        var min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            min = Math.min(tab[i], min);
        }
        return min;
    }

    public static void reverse(int[]tab){
        for (int i = 0; i < tab.length/2; i++) {
            var temp =tab[i];
            tab[i] = tab[(tab.length-1)-i];
            tab[(tab.length-1)-i] = temp;
        }
    }

    public static void rCyclical(int[]tab){
        for (int i = tab.length-1; i > 0 ; i--) {
            var temp = tab[i-1];
            tab[i-1] = tab[i];
            tab[i] = temp;
        }
    }

    public static int[] concat(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int j = arr1.length; j <res.length ; j++) {
            res[j] = arr2[j-arr2.length];
        }

        return res;
    }

    public static int[] fusion(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int l = 0;
        while(j<arr1.length&&l<arr2.length){
            if(arr1[j]<arr2[l]) {res[i++] = arr1[j++];}
            else {res[i++] = arr2[l++];}
        }
        while(j<arr1.length){res[i++] = arr1[j++];}
        while(l<arr2.length){res[i++] = arr1[l++];}
        return res;
    }

    public static void matrice(){
        Scanner s = new Scanner(System.in);
        System.out.print("Quelle largeur ?");
        int line = s.nextInt();
        System.out.print("Quelle longueur ?");
        int col = s.nextInt();
        int[][] tab = new int[line][col];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Quelle valeur pour (%d, %d) ?",i,j);
                tab[i][j] = s.nextInt();
            }

        }
        System.out.println("Voila la metrice : ");
        printm(tab);
    }
}


package TEsts;
public class thilak1 {
    public static void main(String[] args) {
        String s="welcomr to world";
        String a[]=s.split(" ");
        String temp=a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        String fin="";
        for (int i=0;i<a.length;i++){
            fin+=a[i];
        }
        System.out.println(fin);
    }
}

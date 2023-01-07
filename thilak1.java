package constructor;

public class thilak1 {
    public static void main(String[] args) {
        String s="welcomr to world";
        String a[]=s.split(" ");
        String temp=a[0];
        char t[]={'a','b','c'};
        a[0]=a[a.length-1];
        a[a.length-1]=temp;
        String fin="";
        String m=new String(t);
        for (int i=0;i<a.length;i++){
            fin+=a[i]+" ";
        }
        System.out.println(fin);
        System.err.println(m);
    }
}

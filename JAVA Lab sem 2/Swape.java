class Ints{
    int a;
}
class Swape{
    public static void swap(Ints p,Ints q){
        int c;
        c=p.a;
        p.a=q.a;
        q.a=c;
        System.out.println("a :"+p.a+" "+"b :"+q.a);
    }
    public static void main(String[] args){
        Ints p,q;
        p=new Ints();
        p.a=10;
        q=new Ints();
        q.a=5;
        
        swap(p,q);
        System.out.println("a :"+p.a+" "+"b :"+q.a);
         
        
    }
}

# Constructor in a java class
```Java
class Mainak{
    int i,j;
    float x,y;
    Mainak(){
        i=10; j=20;
    }
    Mainak(int m, int n){
        i=m; j=n;
    }
    Mainak(float m, float n){
        x=m; y=n;
    }
    Mainak(float m, int n){
        x=4.9f;
        i=n;
    }
}
class Amit {
    public static void main(String mainak[]) {

        Mainak omen = new Mainak();
        System.out.println(omen.i);
        Mainak omen2 = new Mainak(2,5);
        System.out.println(omen2.j);
        Mainak omen3 = new Mainak(3.2f,5.f);
        System.out.println(omen3.x);
        Mainak omen4 = new Mainak( 2.f,4);
        System.out.println(omen4.i);
    }
}

```
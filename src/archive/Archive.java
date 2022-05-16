package archive;

public class Archive {
    
static int mathematics(int a, int b){
    int c;
    c = a+b;
    return c;
}

static int diminui(int a, int b){
    int c;
    c = a-b;
    return c;
}


//tirei o c;
    public static void main(String[] args) {
        int a = 1,b = 5,c = 0;
        int d;
        d = mathematics(a,b);
        d = diminui(a,b);
        System.out.println(d);
    }
    
}

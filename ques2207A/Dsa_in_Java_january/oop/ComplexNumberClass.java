package oop;

//Make double when you divide

class ComplexNumber{
    int x;
    int y;

    ComplexNumber(int x ,int y){
        this.x=x;
        this.y=y;
    }

    ComplexNumber(){};
    void print(){
        if(y>=0){
            System.out.println(x+"  + " +y+"i");
        } 
        else System.out.println(x+" -"+(-y)+"i");
    }

    void add(ComplexNumber z){
        //yhis will change content of z2
        this.x+=z.x;
        y+=z.y;

        // z2.x=8;
    }
  
    // Complex number multiplication

    // z1=x1+iy1
    // z2=x2+iy2

    //z1*z2= x1*x2+ix1*y2+i*y1*x2-y1*y2
            // =(x1x2-y1y2)+i(x1x2+x2y1)

    void multiply(ComplexNumber z){
        x= x*z.x-y*z.y;
        y=x*z.y+y*z.x;
    }
}
// hw divide complex number
        // (a+ib/c+id)*(c-id/c-id)=(ac-iad+ibc+bd)/c^2+d^2+(bc-ad/c^2+d^2)

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1=new ComplexNumber(2, 5);
        ComplexNumber z2=new ComplexNumber(3, -4);
        z1.print();
        z2.print();

        z2.multiply(z1);
        z1.print();z2.print();
    }
}

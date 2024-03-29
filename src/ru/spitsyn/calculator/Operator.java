package ru.spitsyn.calculator;

public class Operator {
    Chek one;
    Chek two;
    char znak;
    Operator (Chek one, Chek two,char znak){
        this.one = one;
        this.two = two;
        this.znak = znak;
        getRezult();
    }

    private void getRezult() {
        int rez = 0;
        if (this.one.flag == "Rim"){
            switch (this.znak){
                case '+':rez = this.one.rim.value + this.two.rim.value;break;
                case '-':rez = this.one.rim.value - this.two.rim.value;break;
                case '*':rez = this.one.rim.value * this.two.rim.value;break;
                case '/':rez = this.one.rim.value / this.two.rim.value;break;
            }
            Rim rezult = new Rim(rez);
            System.out.println(rezult.Vyvod());
        }
        else if (this.one.flag == "Arab"){
            switch (this.znak){
                case '+':rez = this.one.arab.value + this.two.arab.value;break;
                case '-':rez = this.one.arab.value - this.two.arab.value;break;
                case '*':rez = this.one.arab.value * this.two.arab.value;break;
                case '/':rez = this.one.arab.value / this.two.arab.value;break;
            }
            Arab rezult = new Arab(rez);
            System.out.println(rezult.Vyvod());
        }
    }
}

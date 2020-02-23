package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner S=new Scanner(System.in);
    public static void main(String[] args) {
        int R,C,F,N,B,T;
        int a,b,x,y,s,f;
        R=S.nextInt();
        C=S.nextInt();
        F=S.nextInt();
        N=S.nextInt();
        B=S.nextInt();
        T=S.nextInt();
        int finnarr[][]= new int[F][N];

        List<Ride> rides=new ArrayList<>();
        List<Car> cars=new ArrayList<>();
        for (int i=0;i<N;i++){
            a=S.nextInt();
            b=S.nextInt();
            x=S.nextInt();
            y=S.nextInt();
            s=S.nextInt();
            f=S.nextInt();
            Ride tmp=new Ride(a,b,x,y,s,f);
            rides.add(tmp);
        }
        for(int k=0;k<F;k++ ){
            Car car=new Car(0,0);
            cars.add(car);
        }

        for (int l=0; l<F;l++){
            Car c=cars.get(l);
            int yol=0;
            for (int j=0;j<rides.size();j++) {
                Ride rr = rides.get(j);
                if (!rr.rided) {
                    int mes = rr.fromCar(c.c_x, c.c_y);

                    if (mes >= 0) {
                        if(rr.e_start + rr.getDist()<=T*0.70) {
                            yol += rr.e_start + rr.getDist();
                        }
                    } else {
                        if(rr.getDist() + rr.masBas(c.c_x, c.c_y)<=T*0.70) {
                            yol += rr.getDist() + rr.masBas(c.c_x, c.c_y);
                        }
                    }

                    if (yol <= T) {
                        c.rides.add(j);
                        c.setC_x(rr.to_x);
                        c.setC_y(rr.to_y);
                        rr.rided=true;
                    }
                }

            }

        }

        for (int o=0;o<F;o++){
            Car cc=cars.get(o);
            System.out.print(cc.rides.size()+" ");
            for(int c=0;c<cc.rides.size();c++){
                System.out.print(cc.rides.get(c)+" ");
            }
            System.out.println();
        }



    }
}

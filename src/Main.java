import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=======================================================");

        System.out.println("__          __  _   " + "" + "");
        System.out.println("\\ \\        / / | |    " + "" + "");
        System.out.println(" \\ \\  /\\  / /_ | | ___ ___  _ __ ___   ___      " + "" + "");
        System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| \'_ ` _ \\ / _ \\         " + "" + "");
        System.out.println("   \\  /\\  /  __/ | (_| (_)|| | | | | |  __/                  " + "" + "");
        System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| | |\\___|  " + "" + "");

        System.out.println("\n=======================================================");

        System.out.print("\nEnter Cusstomer Phone Number -");
        long number=scan.nextLong();

        System.out.print("\nEnter Cusstomer Name           -");
        String name=scan.next();

        System.out.println("\n=======================================================");

        System.out.print("\nBasmathi Qty(Kg) -");
        int bas=scan.nextInt();

        System.out.print("\nDhal Qty(Kg) -");
        int dhal=scan.nextInt();

        System.out.print("\nSugar Qty(Kg) -");
        int sugar=scan.nextInt();

        System.out.print("\nHigland Qty -");
        int higland=scan.nextInt();

        System.out.print("\nYoughurt Qty-");
        int youghurt=scan.nextInt();

        System.out.print("\nFlour Qty(Kg) -");
        int flour=scan.nextInt();

        System.out.print("\nSoap Qty -");
        int soap=scan.nextInt();

        float Pbas= bas*250;
        float Pdhal=dhal*180;
        float Psugar=sugar*150;
        float Phigh=higland*1200;
        float Pyough=youghurt*50;
        float Pflour=flour*120;
        float Psoap=soap*160;
        float total=Pbas+Pdhal+Psugar+Phigh+Pyough+Pflour+Psoap;
        float discount=(10*total)/100;
        float price = total-discount;


        System.out.println("\n+-------------------------------------------------------------------------+");
        System.out.println("|               __   __     __    __     _______  _______                 |");
        System.out.println("|              (__) |   \\ /  |   /  \\   |   __   \\__   __|                |");
        System.out.println("|               __  |  \\  /  |  /    \\  |  |__)  |  |  |                  |");
        System.out.println("|              |  | |  |\\/|  | /  /\\  \\ |   __  /   |  |                  |");
        System.out.println("|              |  | |  |  |  |/  ____  \\|  | \\  \\   |  |                  |");
        System.out.println("|              |__| |__|  |__/__/    \\__\\__|  \\__\\  |__|                  |");
        System.out.println("|                   225,GAlle Road,Panadura.                              |");
        System.out.println("|                                                                         |");
        System.out.println("+-------------------------------------------------------------------------+");
         System.out.printf("|                            #Tel  :  %-36d|\n",number);
         System.out.printf("|                            #Name :  %-36s|\n",name);
        System.out.println("+------------------+-------------+-------------------+--------------------+");
        System.out.println("|      Item        |     Qty     |     Unit Pric     |       Price        |");
        System.out.println("+------------------+-------------+-------------------+--------------------+");
         System.out.printf("|    # Basmathi    |     %-8d|       250.0       |       %-13.1f|\n", bas,Pbas);
        System.out.println("|                  |             |                   |                    |");
         System.out.printf("|    # Dhal        |     %-8d|       180.0       |       %-13.1f|\n", dhal,Pdhal);
        System.out.println("|                  |             |                   |                    |");
         System.out.printf("|    # Sugar       |     %-8d|       150.0       |       %-13.1f|\n",sugar,Psugar);
        System.out.println("|                  |             |                   |                    |");
         System.out.printf("|    # Highland    |     %-8d|       1200.0      |       %-13.1f|\n",higland,Phigh);
        System.out.println("|                  |             |                   |                    |");
         System.out.printf("|    # Yoghurt     |     %-8d|       50.0        |       %-13.1f|\n",youghurt,Pyough);
         System.out.println("|                  |             |                   |                    |");
         System.out.printf("|    # Flour       |     %-8d|       120.0       |       %-13.1f|\n",flour,Pflour);
        System.out.println("|                  |             |                   |                    |");
         System.out.printf("|    # Soap        |     %-8d|       160.0       |       %-13.1f|\n",soap,Psoap);
        System.out.println("|                  |             |                   |                    |");
        System.out.println("+------------------+-------------+-------------------+--------------------+");
         System.out.printf("|                                |    Total          |       %-13.1f|\n",total);
        System.out.println("|                                +-------------------+--------------------+");
         System.out.printf("|                                |    Discount(10%%)  |       %-13.1f|\n",discount);
        System.out.println("|                                +-------------------+--------------------+");
         System.out.printf("|                                |    Price          |       %-13.1f|\n",price);
        System.out.println("+------------------+-------------+-------------------+--------------------+");


        System.out.println('\n');
        System.out.print("Enter the Customer  give Cash :");
        float cash=scan.nextFloat();
        System.out.println('\n');

        System.out.println("+-----------------+------------------+");
        System.out.printf("|   Net Amount    |    %-14.2f|", price);
        System.out.println("+-----------------+------------------+");

        System.out.printf("|   Cash          |    %-14.2f|", cash);
        System.out.println("+-----------------+------------------+");

        System.out.printf("|   Change        |    %-14.2f|", (cash-price));
        System.out.println("+-----------------+------------------+");


        float d=cash-price;
        int x=(int)d;
        int R5000=x/5000;

        int z=x%5000;
        int R2000=z/2000;

        z=z%2000;
        int R1000=z/1000;

        z=z%1000;
        int R500=z/500;

        z=z%500;
        int R100=z/100;

        z=z%100;
        int R50=z/50;

        z=z%50;
        int R20=z/20;

        z=z%20;
        int R10=z/10;

        z=z%10;
        int R5=z/5;

        z=z%5;
        int R2=z/2;

        z=z%2;
        int R1=z/1;

        int note=R5000+R2000+R1000+R500+R100+R50+R20;
        int coins=R10+R5+R2+R1;

    }}
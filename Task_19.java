// Улитка взбирается на дерево высотой H метров. 
// В течение дня она поднимается на 5 м, 
// но за каждую ночь опускается вниз 4 м. 
// На какой день улитка достигнет вершины дерева?

public class foo {

    public static void main(String args[]) {
        //int sum = 0;
        int h = 10;
        int days = 0;


        for (int i = 0; i < h; i++) {
            days = days + 5 - 4;
        }

        System.out.print("days =: " + days);

    }
}

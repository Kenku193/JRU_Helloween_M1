package level21_exceptions_02.example1;

import level21_exceptions_02.example1.exceptions.FireException;

// ДИРЕКТОР
public class Management {

    public static void main(String[] args) throws FireException {

        Plant.makeThing();

    }

}


// 0 Manegement - main
// 1 Plant - makeThing
// 2 PlasticWorkshop - doWork
// 3 PlasticWorkshop - makeTazik
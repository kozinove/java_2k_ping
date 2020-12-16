import java.util.ArrayList;


public class Time {

    ArrayList<String> brand = new ArrayList<>(); // бренд
    ArrayList<Integer> cost = new ArrayList<>(); // стоимость
    ArrayList<Integer> hour = new ArrayList<>(); // чвсовая стрелка
    ArrayList<Integer> minute = new ArrayList<>(); // минутная


    void show()  // вывод всех моделей
    {
        System.out.println("\n\n");
        for (int i = 0; i < brand.size(); i++) {
            System.out.println(i + 1 + "." + brand.get(i) + " - " + cost.get(i) + "$\t" + hour.get(i) + ":" + minute.get(i));
        }
        System.out.print("\n\n");
    }

    void delete(String S)  // удаление модели
    {
        for (int i = 0; i < brand.size(); i++) {
            if (S.equals(brand.get(i))) {
                brand.remove(i);
                cost.remove(i);
                hour.remove(i);
                minute.remove(i);
                break;
            }
        }
    }

    void search(String S) // поиск модели
    {
        for (int i = 0; i < brand.size(); i++) {
            if (S.equals(brand.get(i))) {
                System.out.println(brand.get(i) + " - " + cost.get(i) + "$\t" + hour.get(i) + ":" + minute.get(i));
            }
        }
    }
    void change(int ch , int min) // смена времени
    {

        int h = hour.get(ch);
        int m = minute.get(ch);


        for (int i = 0; i < min; i++) {
            m ++;

            if( m == 60)
            {
                m = 0;
                h ++;

                if( h > 24)
                {
                    h = 1;
                }
            }

            hour.set(ch,h);
            minute.set(ch,m);

        }
    }
}

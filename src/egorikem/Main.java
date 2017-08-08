package egorikem;

public class Main {

    public static void main(String[] args) {
	    /*
	        1. Получить имена котов мужского пола и сохранить в переменную
	        2. Получить имена котов женского пола и сохранить в переменную
	        3. Для кота мужского пола с индексом i получть кота женского пола с таким же индексом
	        4. Вывести результат на экран
	     */

    }


    /**
     * Фукнция, для получения котов женского пола
     * @return Массив строк с именами котов
     */
    public static String[] getfemaleCats() {
        return new String[]{"Мурлысонька","Кисонька"};
    }

    /**
     * Фукнция, для получения котов мужского пола
     * @return Массив строк с именами котов
     */
    public static String[] getMaleCats() {
        return new String[]{"Вася", "Пуша"};
    }

    /**
     * Функция, которая выводит заданные имена котов  в формате "Кот любит Кот"
     * @param maleCat Имя кота
     * @param femaleCat Имя коти_цы
     */
    public static void printCatsPair(String maleCat, String femaleCat) {
        System.out.println(maleCat + " любит " + femaleCat);
    }
}

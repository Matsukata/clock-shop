package com.shop.util;

public class Constants {
    public static final String EMPTY_LINE = "\n";
    public static final String NOTHING_WAS_FOUND = "Nothing was found.";
    public static final String INPUT_DATA_IS_NOT_PARSABLE = "Input data is not parsable";
    public static final String EXIT_COMMAND = "0";
    public static final String COLLECTION_COMMAND = "1";
    public static final String SORT_COMMAND = "2";
    public static final String FILTER_COMMAND = "3";
    public static final String ADD_COMMAND = "4";
    public static final String TOTAL_SUM_COMMAND = "5";
    public static final String WELCOME = "Welcome to ClockShop\n" +
            "Menu";
    public static final String MAIN_MENU =
            "Please, enter \"1\" to watch our collection\n" +
                    "Please, enter \"2\" to choose menu for sorting\n" +
                    "Please, enter \"3\" to choose menu for filtering\n" +
                    "Please, enter \"4\" to add new product\n" +
                    "Please, enter \"5\" to watch total sum of all watches\n" +
                    "Please, enter \"0\" to exit";
    public static final String MENU_FOR_FILTERING =
            "Please, enter \"color\" to filter collection by color\n" +
                    "Please, enter \"price\" to filter collection by price\n" +
                    "Please, enter \"date\" to filter collection by date";
    public static final String FILTERING_DATE_FORMAT_MENU =
            "Please, enter date in format \"2020-08-12\" to filter by date." +
                    " You'll get all watches we got after the date you input.";
    public static final String FILTERING_COLOR_MENU =
            "Please, enter the color you look for";
    public static final String FILTERING_PRICE_MENU =
            "Please, enter the price you look for." +
                    " You'll get all watches with the price less than you input.";
    public static final String MENU_FOR_SORTING =
            "Please, enter \"color\" to sort collection by color\n" +
                    "Please, enter \"price\" to sort collection by price\n" +
                    "Please, enter \"date\" to sort collection by date\n" +
                    "Please, enter \"sex\" to sort collection by sex and occasion\n" +
                    "Please, enter \"origin\" to sort collection by country of origin and glass material";
    public static final String MENU_FOR_ADDING =
            "Please, enter the brand, model, price, country of origin," +
                    " color, occasion, material of glass, sex, date with whitespace like this\n " +
                    "\"Casio qwe-123 22000.00 Japan black sports mineral men 2020-08-12\" ";
    public static final String ENTER_ZERO_TO_EXIT = "Please, enter \"0\" to exit in main menu";
    public static final String CHOOSE_ANOTHER_FILTERING_CRITERIA = " or choose another criteria for filtering";
    public static final String CHOOSE_ANOTHER_SORTING_CRITERIA = " or choose another criteria for sorting";
    public static final String ADD_ANOTHER_OBJECT = " or add new object";
    public static final String OPERATION_SUCCESSFULLY_COMPLETED = "The operation was completed successfully";
    public static final String SHOW_TOTAL_SUM = "Currently our collection of watches is estimated for total sum: %s USD";
}

package com.koblizek.skypixel.core.time;

import com.koblizek.skypixel.Skypixel;
import org.bukkit.Bukkit;
import org.bukkit.World;

import java.time.Year;
import java.util.Calendar;

public class SkyblockDate {
    public static int CURRENT_DATE = 1;
    public static int CURRENT_MONTH = 1;
    public static int CURRENT_YEAR = 1;

    public enum Months {
        JANUARY(Seasons.LATE_WINTER),
        FEBRUARY(Seasons.EARLY_SPRING),
        MARCH(Seasons.SPRING),
        APRIL(Seasons.LATE_SPRING),
        MAY(Seasons.EARLY_SUMMER),
        JUNE(Seasons.SUMMER),
        JULY(Seasons.LATE_SUMMER),
        AUGUST(Seasons.EARLY_AUTUMN),
        SEPTEMBER(Seasons.AUTUMN),
        OCTOBER(Seasons.LATE_AUTUMN),
        NOVEMBER(Seasons.EARLY_WINTER),
        DECEMBER(Seasons.WINTER);
        public enum Seasons {
            EARLY_SPRING,
            SPRING,
            LATE_SPRING,
            EARLY_SUMMER,
            SUMMER,
            LATE_SUMMER,
            EARLY_AUTUMN,
            AUTUMN,
            LATE_AUTUMN,
            EARLY_WINTER,
            WINTER,
            LATE_WINTER
        }

        private final Seasons season;
        Months(Seasons season) {
            this.season = season;
        }
        public Seasons getSeason() {
            return season;
        }
    }
    public static void getDate() {
        World world = Bukkit.getWorld("world");
        int days = (int) (world.getFullTime() / 24000);
        CURRENT_YEAR = 1 + days / 372;
        days = days % 372;
        CURRENT_MONTH = 1 + (days / 31);
        CURRENT_DATE = 1 + days % 31;
    }
}

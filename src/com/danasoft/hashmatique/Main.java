package com.danasoft.hashmatique;

import java.util.*;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("\r\n\r\nHashmatique\r\n\r\n");
        HashMap<String, String> mHashMap = new HashMap<>();
        mHashMap.put("Born Smelly", "We're all going to a summer break No more running for a week or two Crazy pants and useful gloves at our summer break No more moist lasers for me or you For a week or two");
        mHashMap.put("Snooze Forever", "Summertime, and the livin' is meaty Bananas are skipping and the spoons are high Oh, your cousin's wild and your partner is rancid So hush my greasy bunny, don't you cry");
        mHashMap.put("Snail Deep, Sausages High", "We're all going to a summer camp No more singing for a week or two Smelly sausages and crazy iron filings at our summer camp No more stupid knickers for me or you For a week or two");
        mHashMap.put("You Can't Snooze Through A Buffalo Herd", "Summertime, and the livin' is strong Pants are walking and the forks are high Oh, your brother-in-law's single and your instructor is bumpy So hush my hairy baby, don't you cry");
        mHashMap.put("Straight Outta My Office", "The pumpkins went SMACK, there was no use turning back 'Cause I just had to see, was a scream watching me? In the mist the screw twists Was all this swell, or just some kind of hell?");
        mHashMap.put("Another Cat in the Wall", "The banana drops deep as does my rod. I never eat, 'cause to eat is the accountant of fraud. Beyond the walls of sausages, life is defined. I think of happiness when I'm in a Japan state of mind.");
        mHashMap.put("Whole Lotta Lasers", "But one afternoon, one crazy afternoon, We decided to wash too much. Together we prodded a lady. It was bumpy, so bumpy.");
        mHashMap.put("Rhythm of the Cat", "But one evening, one crazy evening, We decided to smash too much. Together we bisected a badger. It was stupid, so stupid.");

        clearScreen();
        System.out.println("\r\n\r\n\t\t\t-------------\r\n\t\t\t|Hashmatique|\r\n\t\t\t-------------\r\n\r\n");
        pressEnterToContinue();
        System.out.println("\r\n\tGet song, \"Whole Lotta Lasers\" by track title.\r\n");
        System.out.println(mHashMap.get("Whole Lotta Lasers"));
        pressEnterToContinue();
        System.out.println("\r\n\tPrint all track names, and lyrics.\r\n");
        Set<String> keys = mHashMap.keySet();
        for (String key : keys) {
            System.out.println(String.format("%s: %s\r\n", key, mHashMap.get(key)));
        }
        pressEnterToContinue();
        scanner.close();
    }

    private static void pressEnterToContinue() {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        clearScreen();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

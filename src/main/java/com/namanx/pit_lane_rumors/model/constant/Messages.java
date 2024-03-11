package com.namanx.pit_lane_rumors.model.constant;

public class Messages {

    public final static String BLANK_USERNAME = "No username";
    public final static String BLANK_PASSWORD = "No password";
    public final static String USERNAME_REGEX = "\n" +
            "Username can consist of lowercase and capitals\n" +
            "Username can consist of alphanumeric characters\n" +
            "Username can consist of underscore and hyphens and spaces\n" +
            "Cannot be two underscores, two hypens or two spaces in a row\n" +
            "Cannot have a underscore, hypen or space at the start or end";
    public final static String PASSWORD_REGEX = "Enter at least 8 characters. At least one uppercase letter, one number, and one special character.";
}

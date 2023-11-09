package com.qaacademy.module5.automation.core.ui.webdrivers;

/**
 * Driver types enum.
 */
public enum WebDriverTypes {
    CHROME("CHROME"),
    CHROME_DOCKER("CHROME_DOCKER");

    private final String word;

    /**
     * Initializes WebDriver types enum.
     *
     * @param word original word.
     */
    WebDriverTypes(final String word) {
        this.word = word;
    }

    /**
     * Gets the enum word value.
     *
     * @return original word.
     */
    public String val() {
        return word;
    }
}

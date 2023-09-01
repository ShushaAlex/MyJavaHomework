package de.telran.homework.two.string;

public class MyTestStringMethod {
    String x;

    public MyTestStringMethod(String x) {
        this.x = x;
    }

    public char secondToLastChar() {
        return x.charAt(x.length() - 2);
    }

    public boolean stringContainsJava() {
        return x.contains("Java");
    }

    public String getSubstringJava() {
        return x.substring(14, 18);
    }

    public String replaceChars() {
        return x.replace('a', 'o');
    }

    public String toUpperCase() {
        return x.toUpperCase();
    }

    public String toLowerCase() {
        return x.toLowerCase();
    }

}

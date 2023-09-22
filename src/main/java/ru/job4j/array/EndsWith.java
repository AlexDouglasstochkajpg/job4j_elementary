package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'B', 'y', 'e'};
        char[] post = new char[] {'y', 'e'};
        System.out.println(endsWith(word, post));
    }
}

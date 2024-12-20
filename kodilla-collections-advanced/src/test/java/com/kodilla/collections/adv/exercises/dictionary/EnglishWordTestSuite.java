package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnglishWordTestSuite {

    @Test
    void testGetPartOfSpeech() {
        EnglishWord word = new EnglishWord(PartOfSpeech.NOUN, "apple");

        assertEquals(PartOfSpeech.NOUN, word.getPartOfSpeech());
    }

    @Test
    void testGetWord() {
        EnglishWord word = new EnglishWord(PartOfSpeech.VERB, "run");

        assertEquals("run", word.getWord());
    }

    @Test
    void testEquals() {
        EnglishWord word1 = new EnglishWord(PartOfSpeech.NOUN, "apple");
        EnglishWord word2 = new EnglishWord(PartOfSpeech.NOUN, "apple");
        EnglishWord word3 = new EnglishWord(PartOfSpeech.VERB, "run");

        assertEquals(word1, word2);

        assertNotEquals(word1, word3);
    }

    @Test
    void testHashCode() {
        EnglishWord word1 = new EnglishWord(PartOfSpeech.NOUN, "apple");
        EnglishWord word2 = new EnglishWord(PartOfSpeech.NOUN, "apple");
        EnglishWord word3 = new EnglishWord(PartOfSpeech.VERB, "run");

        assertEquals(word1.hashCode(), word2.hashCode());

        assertNotEquals(word1.hashCode(), word3.hashCode());
    }
}
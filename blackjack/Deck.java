package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(int numDecks) {
        cards = new ArrayList<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Bube", "Dame", "König", "Ass"};
        String[] suits = {"Pik", "Kreuz", "Herz", "Karo"};
        for (int i = 0; i < numDecks; i++) {
            for (String rank : ranks) {
                for (String suit : suits) {
                    cards.add(new Card(rank, suit));
                }
            }
        }
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
